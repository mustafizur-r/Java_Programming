package Assignment_01_P_06;

public class Builtin_method_passwordcheck {
    boolean isValid(String password) {
        if (password.length() < 6) {
            return false;
        } else {

            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (Character.isDigit(c)) {
                    continue;
                } else if (Character.isLetter(c)) {
                    continue;
                } else
                    return false;
            }

        }
        return true;
    }
}
