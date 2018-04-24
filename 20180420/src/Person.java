
public class Person {
	public String name;
	public String gender;
	public int height;
	
	public Person(){
		name = "멍구";
		gender = "남자";
		height = 190;
	
	}
	public Person(String name){
		this();
		this.name = name;
	}
		
	public Person
	(String name, String gender, int height){
		this.name = name;
		this.gender = gender;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", height=" + height + "]";
	}
	
	//source -> Generate tostring을 통해 자동으로 위의 식이 만들어짐 alt+shift+s+s
//	public String toString(){
//		return "name = "+ this.name+"gender = "+this.gender+"height = "+this.height;
//	}
	
}
