/**
 * replace()method replaces each matching occurrence of the old character/text in the string with the new character/text
 */
public class ReplaceDemoMain {
    public static void main (String[] args) {
        String str1 = "abc cba";
        String str2 = "Lava";
        String str3 = "Hello";
        String str4 = "C++";
        String str5 = "aa bb aa zz";
        String str6 = "Java";

       //we will replace all occurrence of 'a' with 'z'
       System.out.println(str1.replace('a', 'z'));

       System.out.println(str2.replace('L','J'));

       //replace() method returns the original value if the substring asked to be replaced is not in the string
       System.out.println(str3.replace('4', 'J'));

       System.out.println(str4.replace("C++", "Java"));

       System.out.println(str5.replace("aa", "zz"));

       System.out.println(str6.replace("C++", "c"));
       
    }

}
