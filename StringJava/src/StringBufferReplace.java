//StringBuffer replace() Method

class StringBufferExample3
{
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer("World");
        sb.replace(1,4,"Java");
        System.out.println(sb);//prints WJavad
    }
}