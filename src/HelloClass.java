import java.util.Scanner;

public class HelloClass {
    int M_hp = 100;
    int E_hp = 200;

    public static void main(String[] args) {
        System.out.println("이제는 되라");

        HelloClass hc = new HelloClass();

        //ex)게임
        //캐릭터이름 설정
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        String M_name = sc.next();
        System.out.print("enemy 이름 입력 : ");
        String E_name = sc.next();
        System.out.println("안녕하세요, " + M_name);
        System.out.println("현재 체력은 " + hc.M_hp + "입니다");

        System.out.println("1. 마을 구경/ 2. 모험 / 3. 집으로");
        int x = sc.nextInt();
//        if(x == 1){
//
//        }



        //enemy 만난다
        System.out.println(M_name + "이(가) " + E_name + "를 만났다!");
        //1. 싸운다 / 도망친다
        System.out.println("1. 싸운다 / 2. 도망친다");
        int b = sc.nextInt();
        if (b == 1) {
            System.out.println("1. 10연속 콤보 공격 / 2. 아이템 사용 / 3. 방어");
            int c = sc.nextInt();
            if (c == 1) {
                System.out.println("두두두두두두두두두두");
                hc.E_hp -= 20;
                System.out.println("20의 피해를 입혔습니다.");
                System.out.println(hc.E_hp);
            } else if (c == 2) {
                System.out.println("사용 가능한 아이템 :");
                System.out.println("1. 체력 포션");
                System.out.println("2. 마나 포션");
                System.out.println("3. 연막탄");
            } else {
                System.out.println("방어 성공");
            }
        } else if (b == 2) {
            System.out.println("남자가 되가지고 도망치냐 게임오버");
        } else {
            System.out.println("잘못된 입력");
        }

    }
}