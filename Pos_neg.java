public class Pos_neg
{
    public static String pos_negative(int num){

        if(num == 0){
            return "Zero";
        }
        else{
            String result = num >0 ? "Positive Number" : "Negative number";
            return result;
        }

    }

    public static void main(String[] args) {
        int n = 5;
        String str = pos_negative(n);
        System.out.println(str);
    }
}