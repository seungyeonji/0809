/*
 * 이종상속(자식은 class, 부모는 interface)의 경우에는 implements를 사용한다 
 */
public class Dated implements Datable {
	private int date;
	
	//부모가 만든 변수와 메소드를 재정의
	@Override
	public int get() {
		return date;
	}

	@Override
	public void set(int date) {
		this.date = date;
	}
	
}
