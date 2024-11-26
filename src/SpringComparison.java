/**
 * strings are compared to authenticate, reference match, and sort
 * In order to authenticate the content of strings, we use equals() method
 * In order to reference match strings, we use == operator. ==operator compares references, not values
 * In order to sort the values of the strings' lexicography, we use compareTo() method
 */
public class SpringComparison {
    public static void main(String args[]){
        String s1 ="Per Scholas";
        String s2 ="Per Scholas";
        String s3 = new String("Per Scholas");
        String s4 ="Teksystem";

        //Let's apply the equals() to compare the content
        System.out.println(s1.equals(s2)); //outcome should be true
        System.out.println(s1.equals(s3)); //outcome should be true
        System.out.println(s1.equals(s4)); //outcome should be false

        //let's apply the == operator to compare the references
        System.out.println(s1==s2); //outcome should be true because both refer to same instance
        System.out.println(s1==s3);//outcome should be false because s3 is an instance created in a non pool

        //let's apply the compareTo() method to determine the values of strings' lexicography
       String str1 ="Perscholas";
       String str2 = "Perscholas";
       String str3 = "Perschola";
       String str4 = "PerscholasX";
       System.out.println(str1.compareTo(str2)); //if both are equal == the method returns 0
       System.out.println(str1.compareTo(str3)); //if the first string is bigger than the second, the method returns 1
       System.out.println(str1.compareTo(str4)); //if the second string is bigger than the first, the method returns -1

    }
}
