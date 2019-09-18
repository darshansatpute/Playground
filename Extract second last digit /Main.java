import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner d=new Scanner (System.in);
      int x=d.nextInt();
      int y=(x% 100) / 10;
      System.out.println(y);
	}
}