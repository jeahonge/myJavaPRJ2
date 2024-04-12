import java.util.Scanner;

public class Quiz {
        public static void main(String[] args) {  //메인함수 생성
            Scanner s = new Scanner(System.in);   // 값을 입력받는 스케너
            int hap = 0;

            System.out.print("첫번째 수: ");  // 첫번째 수라는 문구 출력
            int a = s.nextInt();  // int a 값을 입력받는다

            System.out.print("두번째 수: "); // 두번째 수라는 문구 출력
            int b = s.nextInt();  //int b 값을 입력받는다

            for(int i = a; i<=b; i++){ // a부터 시작해서 i값이 1씩증가하는 반복문
                if(i % 2!=0){  //i가 홀수일때 실행
                    hap = hap + i; //hap에 홀수 i를 더함
                }
            }
            System.out.println(a + "부터" + b + "까지의 홀수의 합: " + hap); //결과 출력
        }
}

