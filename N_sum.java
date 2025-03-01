public class N_sum{

    static int sum(int n){
        
        int sum = ((n*(n+1))/2);
        return sum;
    }
    public static void main(String[] args) {
        int n = 19;
        System.out.println("Sum upto "+n+" is "+sum(n));
    }
}