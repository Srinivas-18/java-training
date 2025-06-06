import java.util.Scanner;
public class Demo{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter number 1:");
      int num1 =  input.nextInt();
      System.out.println("enter number 2: ");
      int num2 = input.nextInt();
      System.out.println("enter number3: ");
      int num3 = input.nextInt();
      if(num1 > num2 && num1 > num3){
         System.out.println("num1 is greater than num2 and num3" );
      }else if(num2 > num1 && num2 > num3){
         System.out.println("num2 is greater than num1");
      }else{
            System.out.println("num3 is greater than num1 and num2");
      }
   } 
   
}