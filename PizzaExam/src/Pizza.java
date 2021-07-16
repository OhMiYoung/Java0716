
public class Pizza extends Circle{     // Circle을 상속받음
    private String name;// name 변수 private으로 선언

    
    // name과 size를 초기화시키는 생성자
    // super 사용
    public Pizza(int size, String name) {
    	super(size);
    	this.name = name;
    }

@Override
public String toString() {

return "피자의 종류:" + name + ", 피자의 크기:" + size;
}



}
