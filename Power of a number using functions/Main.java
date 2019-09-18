import java.util.Scanner;
class Main{
  
  public static int power(int base,int expo)
  {
   int n=1;
    while(expo>=1)
    {
     n=n*base;
      expo--;
    }return n;
    
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner d=new Scanner(System.in);
        int n=d.nextInt();
      int expo=d.nextInt();
      int f=power(n,expo);
      System.out.println(f);
    }
}