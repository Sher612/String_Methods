/**
 * concat() method combines two strings by connecting one at the end of the other.
 * it effectively serves as a substitute for the + operator to concatenate two or more strings
 */
public class concatDemo {
    public static void main(String[] args) {
        //String str1 = "Learn";
        //String str2 = "Java";
        //System.out.println(str1.concat(str2)); //outcome should be "Learn Java"

        //System.out.println(str2.concat(str1)); //outcome should be "JavaLearn"

        //String s3 = "hello";
        //String s4 = "Learners";
        //String s5 = s3.concat(s4);

        //String message = "Welcome" + "To" + "Java"; //Three string are concatenated by the two plus signs

        //String message= "O'" + "Holy" + "Night";
        //String a = "O'";
        //String b = "Holy";
        //String c = "Night"; //I am going to use the concat() method to bind strings a, b, and c to display the String message
        //System.out.println(a.concat("   ").concat(b).concat("   ").concat(c));

        //Notice the concat(" ") between concat a, b, and c.
        // I am adding a null string to create a space between the words.
        //That way I don't end up making the same mistake as block 11
        String messsage= "Welcome to Java";
        System.out.println("The First Character in the Message is " + messsage.charAt(0));
    }
}
