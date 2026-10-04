import java.util.Scanner;

public class Homework3 {

    //main함수가 static이므로 static 함수 선언
    //최대값 구하기(배열 매개변수)
    static int maxInt(int inputarr[]){
        int max = inputarr[0];
        for(int i = 1; i < inputarr.length; i++){
            if(inputarr[i] > max)
                max = inputarr[i];
        }
        return max;
    }
    //최소값 구하기(배열 매개변수)
    static int minInt(int inputarr[]){
        int min = inputarr[0];
        for(int i = 1; i < inputarr.length; i++){
            if(inputarr[i] < min)
                min = inputarr[i];
        }
        return min;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int howMany;
        System.out.print("몇 개의 수를 입력할 예정인가요? :");
        howMany = sc.nextInt();

        int arr[] = new int[howMany];
        int max;
        int min;

        System.out.print("수를 입력하세요 :");
        for(int i = 0; i < howMany; i++) {
            arr[i] = sc.nextInt();
        }
        //함수에 배열을 인자로 넘길 때는 이름만 작성
        max = maxInt(arr);
        min = minInt(arr);

        System.out.println("최대값 :" + max);
        System.out.println("최소값 :" + min);
    }
}
