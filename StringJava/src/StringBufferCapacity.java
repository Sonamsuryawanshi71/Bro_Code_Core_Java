

class StringBufferExample6
{
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer(11);
        System.out.println(sb.capacity());//default 11
        sb.append("Hello");
        System.out.println(sb.capacity());//now 11
        sb.append("java is my favourite language");
        System.out.println(sb.capacity());//now (11*2)+2=34 i.e (oldcapacity*2)+2
    }
}