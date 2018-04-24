
public class Ex03 {
	
	public String mainMenu;
	public String sideMenu;
	public int price;
	
	Ex03(){
		this("삼겹살","김치",3000);
		System.out.println("기본생성자 호출");
		System.out.println("mainMenu = "+mainMenu);
		System.out.println("sideMenu = "+sideMenu);
		System.out.println("price = "+price);
	}
	Ex03(String a, String b, int c){
		mainMenu = a;
		sideMenu = b;
		price = c;
	}
	
	
	public static void main(String[] args) {
		new Ex03();
		Ex03 a = new Ex03("고기","물고기", 6000);
		System.out.println("mainMenu = "+a.mainMenu);
		System.out.println("sideMenu = "+a.sideMenu);
		System.out.println("price = "+a.price);
	}
	
	
}
