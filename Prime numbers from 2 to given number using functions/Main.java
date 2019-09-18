import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner d=new Scanner(System.in);
        int n=d.nextInt();
      for( int i=2;i<=n;i++)
      { int temp=0;
        for(int j=2;j<=i-1;j++)
          {
           
              if(i%j==0)
              {
               temp=temp+1; 
              }
        }
        if(temp==0)
        {
         System.out.println(i); 
        }
            
          }
	}
}