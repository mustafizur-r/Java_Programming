package Assignment_02_P_03;
import java.lang.Character;
public class NumOfOccur {
    String st = "Information and Communication Engineering";
    int count = 0;
    int calNumOfOccur(Character  str){

        for(int i = 0; i<st.length();i++){
            Character ch = st.charAt(i);
            if(str == ch){
                count++;
            }
        }
        return count;
    }
}
