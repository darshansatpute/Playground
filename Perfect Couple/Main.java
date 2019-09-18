import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      
       Scanner in = new Scanner(System.in);
       int arr_size = in.nextInt();
       int arr[] = new int[arr_size];
       for(int index = 0; index <= arr_size - 1; index++){
           arr[index] = in.nextInt();
       }
       int value = in.nextInt();
      
       perfect_couple(arr_size, arr, value);
      
    }
  
  public static void  perfect_couple(int arr_size,int arr[],int value)
  {
      for(int index = 0; index <= arr_size - 1; index++)
      {
          for(int inde = index+1; inde <= arr_size - 1; inde++)
          {
            int sum=arr[index]+arr[inde];
            if(sum==value)
            {
             System.out.println( arr[index]+ "," + " " + arr[inde]);
              
            }
          }
      }
  }
}