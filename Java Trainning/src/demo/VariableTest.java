package demo;

public class VariableTest  
{  
    static int m=100;//static variable  
    public int method1()  
    {    
       int n=90;//local variable
       return n;
    }
    public static void main(String args[]) 
    
    {
    	VariableTest test = new VariableTest();
    	int test1 = test.method1();
    				
               int data=50;//instance variable 
               System.out.println(test1);
     }  
       }//end of class   
      
      
