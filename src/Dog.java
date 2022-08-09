
public class Dog extends Mammal {	//재정의 안하면 Dog(자식)클래스도 abstract 클래스가 되어야함
	public Dog(String name, int age) {
		super(name, age);
	}
	
	@Override	//부모님이 선언해놓은 메소드의 강제적 재정의
	public void saySomething() {
		System.out.println("멍멍멍멍");
	}
}
