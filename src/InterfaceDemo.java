/*
 * 3. Interface는 instance화할 수 없다 -> new 못쓴다
 */
public interface InterfaceDemo {
//	int age = 20;
//	String address = "해운대구";
//	//변수가 둘다 public static final이면 생략가능 
//	void print();
//	void display();
//	//인터페이스에서는 public abstract를 생략할 수 있다 -> 뭐가 생략되었는지 기억해야함
//	//abstract가 생략되어있기 때문에 반드시 자식클래스에서 재정의를 해야함
//	// ->private, protected, 변수, 메소드도 안된다?
	
	public static void main(String[] args) {
		//Datable d = new Datable();	//new 사용못함
		Datable d = new Dated();	//다형성활용 -> 자식클래스 사용(선언형은 인터페이스, 실제형은 자식클래스)
		d.set(Datable.TUE);	//Datable 인터페이스는 static이니까 주소없이 접근
		System.out.println(d.get());
	}
}
