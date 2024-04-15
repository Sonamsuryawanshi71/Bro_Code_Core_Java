//Java Program to demonstrate the use of a static method.  
class Students{
    int rollno;
    String name;
    static String college = "ITS";
    //static method to change the value of static variable
    static void change(){
        college = "BBDIT";
    }
    //constructor to initialize the variable
    Students(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display values
    void display(){System.out.println(rollno+" "+name+" "+college);}
}
//Test class to create and display the values of object  
public class StaticMethod{
    public static void main(String args[]){

        //creating objects
        Students s1 = new Students(111,"Karan");
        Students s2 = new Students(222,"Aryan");
        Students s3 = new Students(333,"Sonoo");
        //calling display method
        s1.display();
        Students.change();//calling change method
        s2.display();
        s3.display();
    }
}  