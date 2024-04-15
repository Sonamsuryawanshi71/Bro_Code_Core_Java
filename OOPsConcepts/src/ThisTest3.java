class Student8{
    int rollno;
    String name,course;
    float fee;
    Student8(int rollno,String name,String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    Student8(int rollno,String name,String course,float fee)
    {
        this(rollno,name,course);//C.T.Error
        this.fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}
}
class ThisTest3
{
    public static void main(String args[]){
        Student8 s1=new Student8(111,"ankit","java");
        Student8 s2=new Student8(112,"sumit","java",6000f);
        s1.display();
        s2.display();
    }
}
