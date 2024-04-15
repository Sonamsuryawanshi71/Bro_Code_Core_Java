
public class EndsWithExample4
{
    // main method
    public static void main(String argvs[]) {
        String str = "Welcome to JavaTpoint";

// prints true
        System.out.println(str.endsWith("nt"));

// prints false as there is no white space after the string
        System.out.println(str.endsWith(""));

    }
}
