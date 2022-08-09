
public class InterfaceDemo6 {
	public static void main(String[] args) {
		Product ballpen = new Product("Ballpen", 200, "Monami");
		//Product another = ballpen;		//주소복사
		
		//객체의 값 복사
		Product another = (Product)(ballpen.copy());	//copy 먼저하고 형변환해줘야하니까 () 씌우고, Product은 Cloneable 상속
		System.out.println("Before Change");
		System.out.println(ballpen);
		System.out.println(another);
		System.out.println("After Change");
		ballpen.setPrice(50000);
		System.out.println(ballpen);
		System.out.println(another);	//ballpen 가격 바꿔도 another는 바뀌지 않음 -> 값복사
	}
}
