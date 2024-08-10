import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float a, b, c;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();
        //세 정수의 합을 출력
        System.out.println((int) (a + b + c));
        //세 정수의 평균을 출력합니다. 단, 반올림하여 정수로 출력
        System.out.println((int) (a + b + c) / 3);
    }
}