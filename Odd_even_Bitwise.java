public class Odd_even_Bitwise{
    public static String Odd_even(int n){
        String status = n % 2 == 0 ? "is Even" : "is Odd";
        return status;


    }
    public static void main(String[] args) {
        int n = 10;
        String str = Odd_even(n);
        System.out.println(n+" "+ str);
    }
}