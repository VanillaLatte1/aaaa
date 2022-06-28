public class ItemClass {
    //아이템 이름
    private String name;
    //아이템 속성
    private String att;

    //위 변수의 값을 다루기 위해서 메소드를 만든다
    public void setName(String name){
        this.name = name;
    }
    public void setAtt(String att){
        this.att = att;
    }
    public String getName(){
        return name;
    }
    public String getAtt(){
        return att;
    }
}
