import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int sum = 0;

        for (int i = 0; i <= 4; i++) {
            System.out.print("정수를 입력하세요 : ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.printf("현재까지 입력된 정수의 합은 %d 입니다 ",sum);
    }
}
