import java.util.Scanner;
class Gcd{
    //최대공약수 구하기 알고리즘 [유클리드 호제법]
    //유클리드 호제법 : a = b × q + r (단, 0 ≤ r < b)일 때 a와 b의 최대공약수는 b와 r의 최대공약수와 같다
    //r == 0 일 때의 b가 최대공약수이다
    int gcdRec(int m, int n){ //재귀 구현
        int big = 0;
        int small = 0;
        if(m>=n){
            big = m;
            small = n;
        }else if(m<n){
            big = n;
            small = m;
        }

        if(n==0)
            return m;
        return gcdRec(small,big % small);
    }
    int gcdRep(int m, int n){ //반복문 구현
        int rem = 0; //나머지
        int big = 0;
        int small = 0;
        if(m>=n){
            big = m;
            small = n;
        }else if(m<n){
            big = n;
            small = m;
        }
       while(true){
           rem = big % small;
           big = small;
           small = rem;
           if(rem == 0)
               break;
       }
       return big;
    }
}
public class Homework4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Gcd gcd = new Gcd();

        System.out.print("두 수를 입력하세요 : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result1 = gcd.gcdRec(num1,num2);
        int result2 = gcd.gcdRep(num1,num2);

        System.out.println("두 수의 최대공약수는 : " + result1 + " 입니다 (재귀함수)");
        System.out.println("두 수의 최대공약수는 : " + result2 + " 입니다 (반복문)");
    }
}
