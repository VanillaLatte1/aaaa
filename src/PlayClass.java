import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PlayClass {
    private Scanner sc;

    public PlayClass(){
        sc = new Scanner(System.in);
    }
    //메소드
    public int play1(String Mname, String Ename, int M_hp){
        System.out.println("현재 체력은 " + M_hp + "입니다");

        //System.out.println("1. 마을 구경/ 2. 모험 / 3. 집으로");

        //enemy 만난다
        System.out.println(Mname + "이(가) " + Ename + "를 만났다!");
        //1. 싸운다 / 도망친다
        System.out.println("1. 싸운다 / 2. 도망친다");
        return sc.nextInt();
    }
    public int play2(int num)
    {
        int ret = 0;
        if (num == 1)
        {
            System.out.println("1. 10연속 콤보 공격 / 2. 아이템 사용 / 3. 방어");
            ret = sc.nextInt();
        }
        else if (num == 2)
        {
            System.out.println("남자가 되가지고 도망치냐 게임오버");
        }
        else
        {
            System.out.println("잘못된 입력");
        }
        return 0;
    }

    public void play3(int num, ArrayList<ItemClass> list){
        if(num == 1){
            System.out.println("평타");
        }
        else if(num == 2){
            System.out.println("아이템 사용");
            //랜덤으로 아이템 사용하기
            Random rnd = new Random();
            int r_num = rnd.nextInt(list.size());   //리스트 크기만큼 에 대한 랜덤값 받기
            System.out.println(list.get(r_num) + "아이템을 사용했습니다.");

        }
    }
}

