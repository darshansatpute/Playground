import java.util.Scanner;
class Main{
   public static int add(int n)
   {
     int sum1=0;
    for(int i=1;i<=n;i++)
    {
      sum1=i+sum1;
    }return sum1;
   }
  
  
	public static void main (String[] args){
      Scanner d=new Scanner(System.in);
      int n=d.nextInt(); 
      int sum=add(n);
      System.out.print(sum);
    }
}