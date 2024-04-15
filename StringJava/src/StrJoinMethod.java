// String concatenation using String.join() method (Java Version 8+)

public class StrJoinMethod
{
    /* Driver Code */
    public static void main(String args[])
    {
        String s1 = new String("Hello");    //String 1
        String s2 = new String(" World");    //String 2
        String s3 = new String(" City");    //String 3
        String s = String.join(",",s1,s2,s3);   //String 3 to store the result
        System.out.println(s.toString());  //Displays result
    }
}