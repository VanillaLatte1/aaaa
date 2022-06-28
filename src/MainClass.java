//게임 일부분인 클래스들을 모아서 실행하는 MAIN
public class MainClass {
    public static void main(String[] args){
        System.out.println("hello world");

        NameSet ns = new NameSet();
        ns.setName();   //이름 설정
        ns.getName();   //이름 출력

        String name = ns.getName();

        PlayClass pc = new PlayClass();
        pc.play1(name,100);
    }
}