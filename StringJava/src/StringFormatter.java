//Java Program to capitalize each word in String

public class StringFormatter
{
    public static String capitalizeWord(String str)
    {
        String words[]=str.split("\\s");
        String capitalizeWord="";
        for(String w:words)
        {
            String first=w.substring(0,1);
            System.out.print(first);
            String afterfirst=w.substring(1);
            capitalizeWord+=first.toUpperCase()+afterfirst+" ";
        }
        return capitalizeWord.trim();
    }
}

class Stringtest
{
    public static void main(String ar[])
    {
        StringFormatter s1= new StringFormatter();
        String s2 = "this is my book";
        System.out.println(s1.capitalizeWord(s2));

    }

}