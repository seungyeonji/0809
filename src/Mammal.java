/*
 * Abstract Method
 *  - 메소드의 선언부(header)만 있고, 구현부(body)가 없는 메소드
 *  - 메소드 리턴타입 앞에 abstract 키워드를 통해 컴파일러에게 바디가 없는 메소드라고 선언
 *  - 부모 클래스에서 선언된 메소드가 자식 클래스에서 정의할 수 있도록 만든 메소드
 *  - Override의 "강제화"를 위한 메소드
 *  - 만일 클래스에 한 개 이상의 추상메소드를 가지면 그 클래스는 반드시 추상클래스
 */
public abstract class Mammal {
	private String name;
	private int age;
	
	public Mammal(String name, int age) {	//생성자
		this.name = name;
		this.age = age;
	}

	//getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	//추상메소드->Mammal은 추상클래스
	public abstract void saySomething();	//실제로는 포유류가 존재하지 않기 때문에 메소드의 바디를 정의할수가 없음 -> {} 빼주면됨 (선언부만 있고, 구현부가 없음)
															//바디는 자식이 구현(재정의)할거고, 여기서는 메소드 선언만 -> 메소드를 추상 메소드로 -> abstract 키워드 붙여주기
															//포유류의 핵심 메소드를 선언만 하고 자식클래스에서 "반드시" 재정의가 되어야함 = 강제적 재정의
															//Mammal 클래스 앞에 abstract 붙여줘서 추상클래스로 만들어줘야함 <- 추상메소드를 갖고있는 클래스는 추상클래스가 되어야함
															//추상클래스는 new로 생성할 수 없다
	
	
	//toString()
	@Override
	public String toString() {
		return String.format("Mammal [name=%s, age=%s]", name, age);
	}
	
	
	
	
}
