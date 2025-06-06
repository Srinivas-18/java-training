import java.util.Scanner;
public class Demo3{
    public static void main(String[]args)
    {
        int a=20;
        int b=30;
        // int temp = a;                        // swap using 3rd variable {temp}
        // a = b; b = temp;

        // a=a+b;
        // b=a-b;                                  // swap without using 3rd variable
        // a=a-b; 

        a = a^b;
        b=a^b;
        a=a^b;                                    // swap using bitwise XOR
        
        System.out.println(a);
        System.out.println(b);



    }
}