import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int a,b,c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        int[] inputs = {a,b,c};

        for (int i = 0; i < inputs.length; i++) {
            int value = inputs[i];
            if (value % 2 == 0) { // 짝수 일 때
                System.out.print(value / 2 + " ");
            }else { // 홀수 일 때
                System.out.print((value * 3) - 20 + " ");
            }
        }
        scanner.close();
    }


}