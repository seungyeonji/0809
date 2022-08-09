/*
 * Interface
 * 1. public static final이 생략된 변수와 public abstract이 생략된 메소드만 가진다
 */
public interface Datable {
	int SUN = 0, MON = 1, TUE = 2, WED = 3, THU = 4, FRI = 5, SAT = 6;
	
	int get();	//public이 생략되어있음 -> 자식클래스(Dated)에는 public 꼭 써줘야함
	void set(int date);
}
