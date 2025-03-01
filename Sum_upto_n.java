public class Sum_upto_n{
    static int sum(int n){
        if(n==0){
            return n;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum upto "+n+" is "+sum(n));
    }
}