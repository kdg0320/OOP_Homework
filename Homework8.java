import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args){
        Map<String, String> log = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        log.put("myid","myPass");
        log.put("myid2","myPass2");
        log.put("myid3","myPass3");
        String inputID;
        String inputPassword;

        while(true){
            System.out.println("ID와 Password를 입력해주세요.");
            System.out.print("ID : ");
            inputID = sc.nextLine().trim();

            if (!log.containsKey(inputID)) { //해시맵에 입력된 id 존재하는지 containsKey()사용해서 검사
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }
            System.out.print("Password : ");
            inputPassword = sc.nextLine().trim();
            if (!log.get(inputID).equals(inputPassword)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                continue;
            } else {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
        }
    }
}
