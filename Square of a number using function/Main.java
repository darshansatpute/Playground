import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
    int sq=n*n;
    return sq;
   }
   
  
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner d=new Scanner(System.in);
      int n=d.nextInt();
      int b=square(n);
      System.out.println(b);
      
	} 
}