import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * Abstract Class
 *  - class 선언시 abstract로 선언된 클래스
 *  - 다형성의 강제화
 *  - instance로 생성할 수 없다
 *  	1) 자식 클래스를 통해서 생성하는 방법
 *  	2) static 멤버로 생성하는 방법(ex.calendar) : singleton -> 단 하나의 객체만 만듦
 *  
 */
public class AbstractClassDemo1 {
	private int age;
	public static void main(String[] args) {
//		String str = Human.getInstance();	//new 안써도됨
//		Human jimin = new Human("010-1234-5678", "부산시 해운대구 센텀아파트");
//		System.out.println(jimin.toString());
		
		
		//Calendar cal = new Calendar();		//calendar는 abstract이기 때문에 new 못쓴다
		//Calendar cal = new GregorianCalendar();	//1) 자식을 통해서 만들어야 한다(GregorianCalendar는 Calendar의 자식클래스)
		Calendar cal = Calendar.getInstance();			//2)  getInstance 사용해 static으로 만드는 방법
		System.out.println("오늘은 " + cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH) + 1) + "월 " + cal.get(Calendar.DATE) + "일입니다");
	}
}



//abstract class Human{
//	private String tel;
//	private String address;
//	private static String str = "Hello, World";
//	
//	public Human(String tel, String address) {	//생성자
//		this.tel = tel;
//		this.address = address;
//	}
//	
//	public static String getInstance() {
//		return str;
//	}
//	
//	//toString()
//	@Override
//	public String toString() {
//		return String.format("Human [tel=%s, address=%s]", tel, address);
//	}	
//}