import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.StringJoiner;

public abstract class CSVCoder<T> {
    private char columnSeparator = ';';

    public CSVCoder(char newColumnSeparator) {
        columnSeparator = newColumnSeparator;
    }

    public abstract String[] encode(T object);

    public String encode(List<T> list) {
        StringJoiner strJoinerRows = new StringJoiner("\n");
        String[] values;
    
        for (T element : list) {
            StringJoiner strJoinerColumns = new StringJoiner(String.valueOf(columnSeparator));
            values = encode(element);
            for (String value : values) {
                strJoinerColumns.add(value);
            }
            strJoinerRows.add(strJoinerColumns.toString());
        }
        return strJoinerRows.toString();
    }  

    public abstract T decode(String[] values);

    public void writeToFile(String fullFilename, List<T> list) throws IOException {
        String csvData = encode(list);
        FileWriter myWriter = new FileWriter(fullFilename);
        myWriter.write(csvData);
        myWriter.close();
    }

    public void readFromFile(String fullFilename, List<T> list) throws IOException {
        String columnSeparator = Character.toString(this.columnSeparator);
        String rowSeparator = "\n";
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fullFilename)));
        String[] cells;

        if (data.contains("\r\n")) {
            rowSeparator = "\r\n";
        }

        if (this.columnSeparator == '|') {
            columnSeparator = "\\|";
        }

        String[] rows = data.split(rowSeparator);
        for (String row : rows) {
            cells = row.split(columnSeparator);
            list.add(decode(cells));
        }
    }
}


