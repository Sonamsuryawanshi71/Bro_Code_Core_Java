//StringBuffer insert() Method

class StringBufferExample2
{
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer("Hello ");
        sb.insert(5,"World");//now original string is changed
        System.out.println(sb);//prints HelloWorld
    }
}
