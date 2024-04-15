//Java Program to demonstrate having the main method in
//another class
//Creating Student class.
class Students2
{
    int id;
    String name;
}
//Creating another class TestStudent1 which contains the main method
class TestStudent1{
    public static void main(String args[]){
        Students2 s1=new Students2();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}