package ss19_String_Regex.baitap;

import java.util.regex.Pattern;

public class ValidatePhone {
    private static final String PHONE_NUMBER = "\\+84-[\\d]{9}";

    public static void main(String[] args) {
        if (Pattern.matches(PHONE_NUMBER,"(84)-(097848964a)"))
            System.out.println("True");
    }
}
