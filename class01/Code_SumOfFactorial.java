package class01;

public class Code_SumOfFactorial {
    public static void main(String[] args) {
        int ans = 0;
        int num = 1;
        for (int i = 1; i <= 3; i++) {
            num *= i;
            ans += num;
        }
        System.out.println(ans);
    }
}
