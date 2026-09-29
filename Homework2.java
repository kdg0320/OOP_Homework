import java.util.Scanner;

class Student{
    int id;
    String name;
    String major;
    int phone;

    int getId(){
        return this.id;
    }
    void setId(int inputId){
        this.id = inputId;
    }

    String getName(){
        return this.name;
    }
    void setName(String inputName){
        name = inputName;
    }

    String getMajor(){
        return this.major;
    }
    void setMajor(String inputMajor){
        this.major = inputMajor;
    }

    int getPhone(){
        return this.phone;
    }
    void setPhone(int inputPhone){
        this.phone = inputPhone;
    }
}
public class Homework2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //객체 배열의 자리 생성(실제로 사용하기 위해서는 인덱스에 따라 생성해주어야 한다)
        Student[] std = new Student[3];
        //임시 입력변수. 띄어쓰기로 구분하여 입력을 받기 때문에 next함수 사용 next는 모든 입력을 문자열로 받음 따라서 임시입력변수들의 자료형도 문자열
        String inputId[] = new String[3];
        String inputName[] = new String[3];
        String inputMajor[] = new String[3];
        String inputPhone[] = new String[3];

        // 입력받기
        for (int i = 0; i < 3; i++){
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요 :");
            // 입력을 받아 임시입력변수 배열에 문자열 형태로 저장
            inputId[i] = sc.next();
            inputName[i] = sc.next();
            inputMajor[i] = sc.next();
            inputPhone[i] = sc.next();

            // 객체를 사용하기 위해 실제로 생성
            std[i] = new Student();

            // 객체에 입력받은 값 할당, id와 phone은 숫자로 변환 후 할당
            std[i].setId(Integer.parseInt(inputId[i]));
            std[i].setName(inputName[i]);
            std[i].setMajor(inputMajor[i]);
            std[i].setPhone(Integer.parseInt(inputPhone[i]));// 010으로 시작하는 전화번호는 숫자로 변환하며 0이 사라짐
        }

        //출력하기
        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다");
        for (int j = 0; j < 3; j++){
            System.out.printf("%d번째 학생 : %d %s %s ",
                    j + 1,
                    std[j].getId(),
                    std[j].getName(),
                    std[j].getMajor());

            //숫자형태의 전화번호를 꺼내 문자열로 변환하고, 맨 앞에 "0"을 붙임
            //for문 내의 문자열 지역변수 phoneStr생성. 반복문이 끝나고 사라짐
            String phoneStr = "0" + Integer.toString(std[j].getPhone());

            //변환된 문자열을 잘라서 하이픈 삽입, substring(a,b)=인덱스a부터 b-1까지 리턴
            System.out.println(phoneStr.substring(0,3) + "-" +
                    phoneStr.substring(3,7) + "-" +
                    phoneStr.substring(7,11));
        }
    }
}
