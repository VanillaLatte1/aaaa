import java.lang.reflect.Array;
import java.util.ArrayList;

//게임 일부분인 클래스들을 모아서 실행하는 MAIN
public class MainClass {
    public static void main(String[] args){
        System.out.println("hello world");

        NameSet ns = new NameSet();
        ns.set_MName();
        ns.set_EName();   //이름 설정
        ns.setItem();
        ns.get_MName();   //이름 출력

        String Mname = ns.get_MName();
        String Ename = ns.get_EName();

        PlayClass pc = new PlayClass();
        //pc.play1(Mname, Ename, 100);
        int num = pc.play1(Mname, Ename, 100);
        num = pc.play2(num);
        ArrayList<ItemClass> list = ns.getItemList();
        pc.play3(num, list);

    }
}