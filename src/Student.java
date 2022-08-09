
public class Student implements Comparable<Student>{	//객체가 정렬이 가능하게 하려면 comparable 인터페이스를 상속하면됨 -> 기능 추가
	private String name;
	private int total;
	
	public Student(String name, int total) {	//생성자
		this.name = name;
		this.total = total;
	}

	@Override
	public int compareTo(Student o) {
//		return this.total - o.total;	//total기준 정렬
		return this.name.compareTo(o.name);		//name기준 정렬(String이니까 compareTo 사용)
	}

	//toString()
	@Override
	public String toString() {
		return String.format("Student [name=%s, total=%s]", name, total);
	}
}
