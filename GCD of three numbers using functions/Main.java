import java.util.Scanner;
public class Main{
  
  public static int gcd(int n1,int n2,int n3)
  {
    int hcf=0;
    for(int i=1;i<=n1 || i<=n2 || i<=n3;i++)
    {
      if(n1%i==0 && n2%i==0 && n3%i==0)
        hcf=i;
     }
    return hcf;
}
    
	public static void main (String[] args)
	{
	    // Type your code here
    Scanner d=new Scanner(System.in);
      int a=d.nextInt();
    int b=d.nextInt();
    int c=d.nextInt();
      System.out.print(gcd(a,b,c));
	}
}