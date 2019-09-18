import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int arr_size = in.nextInt();
       int arr[] = new int[arr_size];
       for(int index = 0; index <= arr_size - 1; index++){
           arr[index] = in.nextInt();
       }
        subset(arr_size, arr);
    }
  
 public static void subset(int arr_size,int arr[])
 {
    for(int index = 0; index <= arr_size - 2; index++)
    {
       for(int index2 = index+1; index2 <= arr_size - 1; index2++)
       {
          for(int index3 =index2+1; index3 <= arr_size - 1; index3++)
          {
            
            System.out.print("("+  arr[index] +"," + " " +  arr[index2] +"," + " "+arr[index3] +")" + " ");
         }
       }
      System.out.println();
    }
 }
}