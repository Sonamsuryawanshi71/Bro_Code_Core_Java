class A11
{
    A11 foo()
    {
        return this;
    }

    void print()
    {
        System.out.println("Inside the class A1");
    }
}


// A2 is the child class of A1  
class A22 extends A11
{
    @Override
    A22 foo()
    {
        return this;
    }

    void print()
    {
        System.out.println("Inside the class A22");
    }
}

// A3 is the child class of A2  
class A3 extends A22
{
    @Override
    A3 foo()
    {
        return this;
    }

    @Override
    void print()
    {
        System.out.println("Inside the class A3");
    }
}

public class CovariantExample
{
    // main method  
    public static void main(String argvs[])
    {
        A11 a11 = new A11();

        // this is ok
        a11.foo().print();

        A22 a22 = new A22();

        // we need to do the type casting to make it
        // more clear to reader about the kind of object created
        a22.foo().print();

        A3 a3 = new A3();

        // doing the type casting
        a3.foo().print();

    }
}  