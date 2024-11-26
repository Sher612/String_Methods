/**
 * indexOf()method returns the index of the first occurrence of the substring/character within the string
 */
public class findString {
    public static void main(String[] args) {
        String str1 = "Java is fun";
        int result;
        //getting index of character 's'
        result = str1.indexOf('s');

        //System.out.println(result); //outcome should be 6

        result=str1.indexOf('J');
        //System.out.println(result); //outcome should be 0

        result=str1.indexOf('a');
        System.out.println(result);

        //character not in the string will yield a negative value of -1
        result=str1.indexOf('j');
        System.out.println(result);

        result=str1.lastIndexOf("ava"); //always double quote a substring with multiple characters
        System.out.println(result);

        //substring not in the string will also yield a negative value of -1
        result=str1.lastIndexOf("java");
        System.out.println(result);
    }
}
