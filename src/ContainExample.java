/**
 * contain() method checks whether a substring is present in the string or not
 */
public class ContainExample {
    public static void main(String[] args){
        String str1= "Learn Java";
        Boolean result;

        result= str1.contains("Java"); //it does so outcome should be true
        System.out.println(result);

        result= str1.contains("Python");// it does not so outcome should be false
        System.out.println(result);

        result= str1.contains (" "); //there is a space between Learn Java so yes
        System.out.println(result);
    }
}
