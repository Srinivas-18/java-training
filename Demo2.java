class Calculator{
    public int function(int a,int b){
        int result = a + b;
        return result;
    }
}
public class Demo2 {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int result = obj.function(5, 10);
        System.out.println(result);
    }
}