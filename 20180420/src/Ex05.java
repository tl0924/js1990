
public class Ex05 {
	
	Ex05(){
		//p1 name = 멍구, gender=남자,키=190
		Person p1 = new Person();
		System.out.println(p1.toString());
//		System.out.println("p1.name = "+p1.name);
//		System.out.println("p1.name = "+p1.gender);
//		System.out.println("p1.name = "+p1.height);
		
		//p2 name = 영구, gender=남자,키=190
		Person p2 = new Person("영구");
		System.out.println(p2);
		//toString는 생략가능
//		System.out.println("p1.name = "+p2.name);
//		System.out.println("p1.name = "+p2.gender);
//		System.out.println("p1.name = "+p2.height);
		
		//p3 name = 세실리아, gender=여자,키=200
		Person p3 = new Person("세실리아","여자",200);
		System.out.println(p3.toString());
//		System.out.println("p1.name = "+p3.name);
//		System.out.println("p1.name = "+p3.gender);
//		System.out.println("p1.name = "+p3.height);
		
	}
	
	
	
	
 public static void main(String[] args) {
	new Ex05();
}
}
