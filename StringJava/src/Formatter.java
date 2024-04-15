

public class Formatter
{
    public static String reverseString(String str)
    {
        char ch[]=str.toCharArray();
        System.out.println(ch);
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        return rev;
    }
}

class TestStringFormatter {
    public static void main(String[] args) {
        System.out.println(Formatter.reverseString("my name is khan"));
        System.out.println(Formatter.reverseString("I am sonoo jaiswal"));
    }
}  