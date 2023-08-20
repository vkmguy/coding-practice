import java.util.List;

public class SumEvenOdd {

    public static void sumOfEvenOdd(int n) {
        double low = Math.pow(10, n - 1);
        double high = Math.pow(10, n) - 1;

        for (double i = low; i <= high; i++) {
             var num = (int) i;
             if (validNumbers(num)){
                 System.out.println(num);
             }
        }
    }

    public static boolean validNumbers(int n) {
        StringBuilder number = new StringBuilder(String.valueOf(n));
        int odd = 0;
        int even = 0;
        for (int i = 0; i < number.length(); i++) {
            String s = number.substring(i, i + 1);
            int val = Integer.parseInt(s);
            if (i % 2 == 0) {
                even += val;
            } else {
                odd += val;
            }
        }
        return odd == even;
    }

    public static void main(String[] args) {
          sumOfEvenOdd(2);
    }
}
