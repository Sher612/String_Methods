/**
 * The length method returns the length of the string
 * i.e. it counts the total number of characters in the string
 */
public class lengthDemo {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "";

        System.out.println(str1.length()); //4
        System.out.println(str2.length()); // 0
        System.out.println("Java".length()); // 4
        System.out.println("Java\n".length()); //5
        System.out.println("Learn Java".length()); //10
    }
}

