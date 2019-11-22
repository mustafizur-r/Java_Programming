package File_Practice;
import java.io.IOException;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
     WriteIntoFile ob1 = new WriteIntoFile();
     ReadFromFile ob2 = new ReadFromFile();
     ob1.WriteData();
     ob2.ReadData();
    }
}
