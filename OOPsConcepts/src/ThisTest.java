class Student1{
    int rollno;
    String name;
    float fee;
    Student1(int rollno1,String name2,float fee3){
        rollno=rollno1;
        name=name2;
        fee=fee3;
    }
    void display(){System.out.println(rollno+" "+name+" "+fee);}
}

class ThisTest
{
    public static void main(String args[]){
        Student1 s1=new Student1(111,"ankit",5000f);
        Student1 s2=new Student1(112,"sumit",6000f);
        s1.display();
        s2.display();
    }}