import java.util.Scanner;
class Main{
  public static void main(String args[]) {
      Scanner d=new Scanner(System.in);
      String str=d.nextLine();
     String str2=d.nextLine();
    
      StringBuilder sb=new StringBuilder(str);
      StringBuilder sb2=new StringBuilder(str2);
      int str_len=str.length();
    int sb2_len=sb2.length();
      int count=0;
      for(int i=0;i<(str_len - sb2_len+1);i++)
        {
          boolean match=true;
         for(int j=0;j<sb2_len;j++)
         {
           if(str.charAt(i+j)!=str2.charAt(j))
           {
              match=false;
           }
         }
        if(match==true)
        {
          count++;
        }
       }
    System.out.print(count);
   } 
}