
public class Calculator {
    public void run (double c3){
        double a = 5;
        double b = 1;
        int n = 8;
        int m = 4;
        double c = c3;
        if (a <= c && n >= c) {
            throw new ArithmeticException ();
        }
        char sum = 0;
        double temp1;
        double temp2;
        char i = (char) a;
        while (i <= n) {
            temp1 = (i + c);
            char j = (char) b;
            while (j <= m) {
                temp2 = (i + j);
                sum += temp2 / temp1;
                j++;
            }
            i++;
        }
        System.out.println(sum);
    }
}