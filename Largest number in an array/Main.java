import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
       Scanner d=new Scanner (System.in);
      int arr_size=d.nextInt();
      int array[]=new int[arr_size];
      for(int i=0;i<=arr_size-1;i++)
      {
       array[i]=d.nextInt();
      }
      int max = array[0];
       for(int i=0;i<=arr_size-1;i++)
        {
           if(max <array[i])
            {
                max = array[i];
            }
        }
        System.out.println(+max);
          
        }
    }
