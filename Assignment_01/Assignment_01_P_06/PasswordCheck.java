package Assignment_01_P_06;

public class PasswordCheck {
     boolean isValid(String password) {
        if (password.length() < 6) {
            return false;
        } else {

            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);

                if (isLetter(c)) {
                    continue;
                }
                else if(isDigit(c)) {
                    continue;
                }
                else
                    return false;
            }
        }
        return true;
    }
     boolean isLetter(char c){
        c = Character.toUpperCase(c);
        return (c>='A' && c<='Z');
    }
     boolean isDigit(char c){
        return (c>='0' && c<='9');
   }
}
