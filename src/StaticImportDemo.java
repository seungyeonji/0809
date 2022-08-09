import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.Math.random;		//메소드 쓸때처럼 ()까지 쓸필요는 없음
import static java.lang.Math.*;		//* = all
import static java.lang.System.in;
//import는 클래스에서 끝남 but system의 out이나 math의 PI는 static이니까 하나 더 내려가면 static import라고 부름(쓸때는 import static)
//-> 클래스. 안 붙여줘도 오류 안남

public class StaticImportDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(in);
		int rand = (int)(random()*6+1);
		out.println("rand = " + rand);
		out.println("PI = " + PI);
	}
}