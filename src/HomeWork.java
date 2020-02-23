import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        int powerSum = 0;
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
                    powerSum += list[k];
                    sum += k;
                }
                for (int tag = i; tag < sum; tag++) {
                    if (powerSum == tag * tag * tag) {
                        int flg = 0;
                        for (int k = j; k < i; k++) {
                            if (flg == 15) {
                                System.out.println();
                                flg = 0;
                            }
                            System.out.print(k + "^3 + ");
                            flg++;
                        }
                        System.out.print(i + "^3 = ");
                        System.out.println(tag + "^3");
                        System.out.println();
                        break;
                    }
                }
                powerSum = 0;
                sum = 0;
            }
        }
    }
}
