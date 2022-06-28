/*
    이름을 설정하는 클래스
 */
import java.util.ArrayList;
import java.util.Scanner;
public class NameSet {
    public NameSet(){
        sc = new Scanner(System.in);
    }
    //ItemClass라는 오브젝트들(작은 그릇)을 담을 큰 그릇 생성
    private ArrayList<ItemClass> list = new ArrayList<>();
    private Scanner     sc;
    private String Mname;
    private String Ename;
    //메소드
    //이름 설정
    public void set_MName(){
        System.out.print("이름을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        Mname = sc.next();
    }
    //라이벌 이름 설정
    public void set_EName(){
        System.out.print("라이벌의 이름을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        Ename = sc.next();
    }
    //이름 출력
    public String get_MName(){
        System.out.println("안녕하세요! " + Mname);
        return Mname;
    }
    //라이벌 이름 출력
    public String get_EName(){
        return Ename;
    }
    //아이템 세팅
    //user가 원하는만큼
    public void setItem(){
        System.out.print("몇 개의 아이템을 사용하시겠습니까? : ");
        int n = sc.nextInt();
        //ArrayList<ItemClass> list = new ArrayList<>(); / 여기서 사용
        //사용할 아이템 갯수 (n) 만큼 반복해서 아이템 입력
        for(int i = 0; i < n; i++){
            //아이템을 담을 작은 그릇 생성
            ItemClass ic = new ItemClass();
            System.out.print("사용할 아이템 입력 : ");
            //아이템 이름 입력받기
            String it = sc.next();
            ic.setName(it);
            //속성 입력 받기
            System.out.print("아이템의 속성 입력 : ");
            it = sc.next();
            ic.setAtt(it);
            //ItemClass가 세팅된 오브젝트를 또 담는다(list)
            list.add(ic);
            //System.out.println(i+1 + ". " + it);
        }
//        System.out.println("입력한 아이템 출력");
//        for(ItemClass ic : list){
//            System.out.println("아이템 이름 : " + ic.getName());
//            System.out.println("아이템 속성 : " + ic.getAtt());
//        }
    }
    //세팅된 아이템 리스트를 전달해주는 기능
    public ArrayList<ItemClass> getItemList()
    {
        return list;
    }
}
