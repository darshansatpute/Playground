import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner d=new Scanner(System.in);
      String str=d.nextLine();
      StringBuilder sb=new StringBuilder(str);
      int str_len=str.length();
      boolean flag=false;
      for(int i=0;i<str_len-1;i++)
      {
        if(str.charAt(i)==str.charAt(str_len-1))
        {
          flag=true;
        }
      }
        if(flag==true)
        {
          System.out.println("Yes");
        }
        else 
        {
          System.out.println("No");
        }
    } 
}