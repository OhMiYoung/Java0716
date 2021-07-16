
public class PizzaMain {

	public static void main(String[] args) {
		Pizza pizza1 = new Pizza(20, "페퍼로니"); 
		// 페퍼로니, 20 인 객체 pizza1 생성
        Pizza pizza2 = new Pizza(18, "슈퍼슈프림");
		// 슈퍼슈프림, 18인 객체 pizza2 생성
		
		System.out.println(pizza1.toString());
		System.out.println(pizza2.toString());

	}

}
