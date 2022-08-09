import java.util.Arrays;

public class InterfaceDemo2 {
	public static void main(String[] args) {
		Student [] array = {new Student("한지민", 56), new Student("박지민", 100), new Student("홍지민", 77)};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}
}
