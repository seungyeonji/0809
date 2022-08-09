/*
 * 6. interface의 주소는 해당 인터페이스의 재정의된 메소드만 접근가능하다
 * 7. interface 배열에는 해당 인터페이스의 자식 클래스를 넣을 수 있다
 */
public class InterfaceDemo1 extends Object implements Father, Mother {

	@Override
	public void grandFather() {
		System.out.println("Called by grandFather()");
	}

	@Override
	public void grandMother() {
		System.out.println("Called by grandMother()");
	}

	@Override
	public void mother() {
		System.out.println("Called by mother()");
	}

	@Override
	public void father() {
		System.out.println("Called by father()");
	}

	public static void main(String[] args) {
//		GrandFather gFather = new InterfaceDemo1();	//선언형은 할아버지, 실제형은 손자 -> 할아버지 주소로는 재정의된 손자 메소드에만 접근 가능
//		gFather.grandFather();		//할아버지형 참조변수주소가 손자의 자원에 접근한다 -> 다형성
//		
//		Father father = new InterfaceDemo1();
//		father.grandFather();
//		father.grandMother();
//		father.father();	//father는 grandfather, grandmother까지 접근 가능
		
		
		//배열 만들어보기
		Mother [] array = new Mother[3];	//저 방에는 mother가 아니라 mother의 자식이 들어감 -> 부모형 배열에는 자식들을 넣을수 있다
		array[0] = new InterfaceDemo1();
		array[0].mother();  //array는 mother의 메소드에만 접근가능
		
		
		//father과 mother이 MAX라는 똑같은 이름의 변수를 가지고 있을 경우, 충돌하지 않음 -> static이니까 주소없이 접근하기 때문에
		System.out.println("Father's MAX = " + Father.MAX);
		System.out.println("Mother's MAX = " + Mother.MAX);
	}
}
