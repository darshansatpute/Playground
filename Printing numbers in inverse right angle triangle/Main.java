import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner d=new Scanner(System.in);
      int n=d.nextInt();
      int sum=n;
      for(int row=1;row<=n;row++)
      {
        
        for(int col=sum;col>=1;col--)
        {
         
         System.out.print(col); 
        }
         sum=sum-1;
        System.out.println();
      }
	}
}