
public class Ex02 {
	
	public int a = 10;
	
	//생성자 오버로딩 기법
	Ex02(){ 
		//기본적으로 만들어져 있는 생성자 기본 생성자.constructor
		System.out.println("Ex02생성자");
	}
	Ex02(int a){
		this.a = a;
		System.out.println("Ex02 int a 생성자");
	}
Ex02(int a,int b){
	System.out.println("Ex02 int a, int b 생성자");
	}
	
	public void doA(){
		System.out.println("doA");
	}
	
}
