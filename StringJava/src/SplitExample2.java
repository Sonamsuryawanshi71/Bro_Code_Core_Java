public class SplitExample2
{
    public static void main(String args[])
    {
        String s1="welcome to split world today";
        System.out.println("returning words:");
        for(String w:s1.split("\\s",0))
        {
            System.out.println(w);
        }
        System.out.println("returning words:");
        for(String w:s1.split("\\s",4))
        {
            System.out.println(w);
        }
        System.out.println("returning words:");
        for(String w:s1.split("\\s",3))
        {
            System.out.println(w);
        }

    }
}