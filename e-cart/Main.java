//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  //create various method to return attribute value(s)
   void setPrice(int price)
   {
     this.price=price;
   }
  int getPrice(int price)
  {
   return price; 
  }
}
   
class Customer extends Item
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
   void setProduct(String product)
   {
     this.product=product;
   }
  String getProduct(String product)
  {
   return product; 
  }
  void setQuntity(int quantity)
   {
     this.product=product;
   }
  int getQuntity(int quantity)
  {
   return quantity; 
  }
  
  
  
}

class Bill extends Customer
{
  //implement your logic to calculate total price
  int  result(int p,int q)
  {
  int r=p*q;
  return r;
  }
}
class Main
{
  public static void main(String[] args)
  {

   Scanner d=new Scanner(System.in);

 String product=d.nextLine();
 int price=d.nextInt();
 int quntity=d.nextInt();

Item obj1=new Item();
int p=obj1.getPrice(price);

Customer obj2=new Customer();

int q=obj2.getQuntity(quntity);


Bill obj3=new Bill();
int r=obj3.result(p,q);

System.out.println("Total Price is : " + r);
}
}