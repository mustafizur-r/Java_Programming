package File_Practice;

import java.io.File;
import java.util.Scanner;

public class ReadFromFile {
    void ReadData(){
        try{
            File file = new File("C:/Users/SAJU/Documents/saju/Saju/Student.txt");
            Scanner input = new Scanner(file);
            while (input.hasNext()){
                String id = input.next();
                String name = input.next();
                System.out.println("ID :"+id + " Name :"+name);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
