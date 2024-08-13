import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    // 9 이하의 서로 다른 정수 3개가 주어지면, 주어진 정수 중 가장 작은 수부터 가장 큰 수까지 구구단을 출력하되,
    // 중간값인 정수로 시작하는 구구단은 빼고 출력하는 프로그램을 함수를 이용하여 작성

    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
            while(stringTokenizer.hasMoreTokens()){
               list.add(Integer.parseInt(stringTokenizer.nextToken()));
            }
            Collections.sort(list);
            int firstNumber = list.get(0);
            int secondNumber = list.get(1);
            int thirdNumber = list.get(2);

            for (int i = firstNumber; i <= thirdNumber; i++){
                if (i == secondNumber){
                    continue;
                }
                for (int j = 1; j < 10; j++) {
                    System.out.println(i + " * " + j + " = " +  i*j);
                }
            }

        }
    }


}