//Example of nextToken(String delim) method of the StringTokenizer class

import java.util.*;

public class Test {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("my,name,is,khan");

        // printing next token
        System.out.println("Next token is : " + st.nextToken());
    }
} 