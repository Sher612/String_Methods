/**
 * ReplaceAll() method replaces each substring regardless of its index that matches the regex of the string with specified text
 */
public class DemoReplaceAll {
    public static void main(String[] args) {
        String str1 = "Java123is456fun";

        //regex for sequence of digits. \\d+ is an expression for matching digits
        String regex = "\\d+";

        //replace all occurrences of numeric digits by a space
        System.out.println(str1.replaceAll(regex, " "));
    }
}
