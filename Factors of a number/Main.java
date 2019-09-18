import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner d=new Scanner(System.in);
      int num=d.nextInt();
      
   
      for( int fact=1;fact<=num;fact++)
      {
        if( num%fact  ==  0)
        {
      System.out.println(fact);
        }
      }
	}
}