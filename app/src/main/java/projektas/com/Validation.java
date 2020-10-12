package projektas.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public static final String USERNAME_REGEX_PATTERN = "[a-zA-z]{3,20}$"; // mazosios didziosios raides
    public static final String PASSWORD_REGEX_PATTERN = "^[a-zA-z !@#$%^&*(),.?\":{}|<>]{5,20}$"; // mazosios didziosios raides specialus simboliai
    public static final String EMAIL_REGEX_PATTERN = "^[a-zA-z !@#$%^&*(),.?\":{}|<>]{10,50}$"; // mazosios didziosios raides specialus simboliai

    public static boolean isValidusername(String username) {
        Pattern pattern = Pattern.compile(USERNAME_REGEX_PATTERN);
        Matcher matcher = pattern.matcher(username);
        return matcher.find();
    }

    public static boolean isValidpassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_REGEX_PATTERN);
        Matcher matcher = pattern.matcher(password);
        return matcher.find();

    }

    public static boolean isValidemail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }
}