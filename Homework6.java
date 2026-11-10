class Course{
    protected String code; // 자식 클래스에서 사용됨 protected
    protected String name;
    Course(String code,String name){
        this.code = code;
        this.name = name;
    }
    String getCode(){
        return code;
    }
    String getName(){
        return name;
    }
}
class OfflineCourse extends Course{
    OfflineCourse(String code,String name){ //상속 클래스의 생성자 호출
        super(code,name); // 상속 클래스 호출 시 부모 클래스 생성사 호출되어야 함
    }
    @Override
    public String toString() { //Object Class의 toString Overrideing, 원본 메서드의 접근제어자가 public이기 때문에 마찬가지로 public
        return "Code: " + code + ", Name: " + name + ", Type: Offline";
    }
}
class OnlineCourse extends Course{
    OnlineCourse(String code,String name){
        super(code,name);
    }
    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Type: Online";
    }
}
public class Homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");
        System.out.println (course1);
        System.out.println (course2);
    }

}
