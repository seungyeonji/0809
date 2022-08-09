class Product implements Comparable<Product>, Cloneable{	//Cloneable을 상속받아야 copy메소드가 오류가 안남(flag interface)
	private String name;
	private int price;
	private String maker;
	
	public void setPrice(int price) {		//가격 바꾸는 메소드
		this.price = price;
	}
	
	Object copy(){	//clone은 protected이기 때문에 상속받은 객체 안에서 써야함(object의 자식이 clone을 써야함)
		Object obj = null;	//지역변수니까 null으로 초기화
		try {
			obj = this.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("이 객체는 복제를 지원하지 않습니다");
		}	
		return obj;
	}
	
	public Product(String name, int price, String maker) {	//생성자
		this.name = name;
		this.price = price;
		this.maker = maker;
	}
	
	@Override
	public String toString() {
		return String.format("Product [name=%s, price=%s, maker=%s]", name, price, maker);
	}
	
	@Override
	public int compareTo(Product p) {
		//return this.name.compareTo(p.name);		//앞에꺼-뒤에꺼 : 오름차순
		//return p.name.compareTo(this.name);   //뒤에꺼-앞에꺼 : 내림차순
		return this.maker.compareTo(p.maker); //메이커기준 오름차순
		
		//앞의 객체 - 뒤의 객체 : 오름차순
		//뒤의 객체 - 앞의 객체 : 내림차순
	}
}
