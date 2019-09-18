import java.util.Scanner;
class Main{
  public static int greatest(int n1,int n2,int n3)
  {
    int a=0;
    
    if(n1>n2 && n1>n3)
    {
        a=n1;
      }
       
       if(n2>n1 && n2>n3)
       {
           a=n2;
       }
       if(n3>n1 && n3> n2)
          {
             a=n3; 
          }
    return a;
         
    
  } 
    
	public static void main (String[] args){
	    // Type your code here
      Scanner d=new Scanner(System.in);
      int n1=d.nextInt();
       int n2=d.nextInt();
       int n3=d.nextInt();
      
      System.out.print(greatest(n1,n2,n3));
	}
}