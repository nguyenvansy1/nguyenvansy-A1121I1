package ss19_String_Regex.baitap;

import java.util.regex.Pattern;

public class ValidateClass {
    private static final String CLASS_NAME = "[A,C,P][\\d]{4}[G,H,I,K,L,M]";

    public static void main(String[] args) {
        if (Pattern.matches(CLASS_NAME,"C0318G"))
            System.out.println("True");
    }
}
