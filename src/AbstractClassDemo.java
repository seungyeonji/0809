
public class AbstractClassDemo {
	public static void main(String[] args) {
		Mammal m = new Dog("포유류", 20);		//선언형은 부모형, 실제형은 자식형 -> 다형성 : 부모의 주소로 자식의 자원에 접근
		m.saySomething();							//부모클래스는 추상클래스기 때문에 new 쓸수없으니까 Override된 자식클래스로 접근
//		System.out.println(m);
	}
}