import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here c
      Scanner d=new Scanner(System.in);
      int n=d.nextInt();
      for(int count=1;count<=n;count++)
      {
        if(count%2==1)
        {
          System.out.println(count);
        }
      }


    }
}