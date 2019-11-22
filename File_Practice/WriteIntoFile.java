package File_Practice;

import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class WriteIntoFile {
    Scanner input = new Scanner(System.in);
    void WriteData(){
        try {
            Formatter formatter = new Formatter("C:/Users/SAJU/Documents/saju/Saju/Student.txt");
            System.out.print("How Many Students :");
            int n = input.nextInt();
            for(int i = 0; i<n ; i++){
                System.out.print("Enter The ID and Name :");
                String id = input.next();
                String name = input.next();
                formatter.format("%s %s\r\n",id,name);
            }
            formatter.close();
            System.out.println("Data Has been perfectly Write");
        }catch (
                IOException e){
            System.out.println(e);
        }
    }

}
