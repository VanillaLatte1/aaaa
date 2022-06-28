/*
    이름을 설정하는 클래스
 */
import java.util.Scanner;
public class NameSet {
    private String name;
    //메소드
    public void setName(){
        System.out.print("이름을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
    }
    public String getName(){
        System.out.println("안녕하세요! " + name);
        return name;
    }
}
