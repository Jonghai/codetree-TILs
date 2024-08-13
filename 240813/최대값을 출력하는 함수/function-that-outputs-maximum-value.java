import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
 //정수 3개가 주어지면 최대값을 출력하는 프로그램을 최댓값을 반환해주는 함수를 이용하여 작성
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
            while(stringTokenizer.hasMoreTokens()){
               list.add(Integer.parseInt(stringTokenizer.nextToken()));
            }
        }
        System.out.println(Collections.max(list));
    }


}