public class SwitchStatement implements Cloneable
{
    public static void main(String[] args) {
        char a = 'b';
        switch (a){
            case 'a':
                System.out.println("number is 0");
                break;
            case 'b':
                System.out.println("number is 1");
                break;
            default:
                System.out.println(a);
        }
    }
}
