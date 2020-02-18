import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("请输入一个数字");
        System.out.println("例如：输入 10 ，程序将会找到 10 以内，存在使得连续数字立方和等于另一数字立方和的等式");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        int[] list = new int[i + 1];
        for (int j = 1; j <= i; j++)
            list[j] = j * j * j;

        for (; i >= 2; i--) {
            for (int j = 1; j < i; j++) {
                for (int k = j; k <= i; k++) {
                    sum += list[k];
                }
                if (Math.cbrt(sum) == (int) Math.cbrt(sum)) {
                    for (int k = j; k < i; k++) {
                        System.out.print(k + "^3 + ");
                    }
                    System.out.print(i + "^3 = ");
                    System.out.println((int)Math.cbrt(sum) + "^3");
                    sum = 0;
                }
                else
                    sum = 0;
            }

        }
    }
}
