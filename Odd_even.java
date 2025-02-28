
public class Odd_even {

    static boolean isEven(int num){
        return (num & 1) == 0;
    }

    public static void main(String[] args) {

        int n = 7;
        if(isEven(n)) {
            System.out.println("Even");
        }
        else
        System.out.println("Odd");

        
    }

   
}