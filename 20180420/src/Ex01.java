/*
 * 클래스 생성자
 * -> new라는 예약어를 통해서 heap영역에 메모리를 할당할 때 호출되는 함수
 * -> 클래스명이랑 동일해야하며, 반환값이 없는 함수 형태
 * -> 모든클래스에 생성자는 존재 하고 있으며, 사용자(개발자)가 작성하지 않으면,
 *    생략되어져 있다.
 * 
 */
public class Ex01 {
	public static void main(String[] args) {
		Ex02 ex02 = new Ex02();
		System.out.println(ex02.a);
		ex02.doA();
		
		Ex02 ex02_a = new Ex02(10);
		System.out.println(ex02_a.a);
		ex02.doA();
		Ex02 ex02_b = new Ex02(10,20);
		System.out.println(ex02_b.a);
		ex02.doA();
		
	}
	
}
