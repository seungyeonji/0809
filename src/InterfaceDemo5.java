import java.util.Arrays;

public class InterfaceDemo5 {
	public static void main(String[] args) {
		Product [] array = new Product[3];
		array[0] = new Product("Ballpen", 200, "Monami");
		array[1] = new Product("Notebook", 2500000, "Apple");
		array[2] = new Product("Keyboard", 20000, "Logitech");
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}
}

