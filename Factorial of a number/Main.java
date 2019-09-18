import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner d=new Scanner(System.in);
      int num=d.nextInt();
      int fact=1;
      for(int count=1;count<=num;count++)
      { 
        fact=fact*count;
      }
      System.out.println(fact);
	}
}