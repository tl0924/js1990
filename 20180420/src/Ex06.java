/*
 * 생성자 -> 생성자 오버로딩
 * 생성자 매개변수에 따라서 생성자를 여러개 선언할 수 있다
 * 
 * this라는 예약어
 * 	this.a -> 자기자신의 클래스 변수를 참조 할 수 있다.
 * 	this.b
 * 
 * this() ->기본생성자를 호출 할 수 있다.
 * this(10) -> 다른 생성자 호출 할 수 있다.
 * 
 * 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
 * 매서드명 :abs
 * 기    능: 주어진 값의 절대값을 반환한다.
 * 반환타입: int
 * 매개변수: int value
 * 
 */
public class Ex06 {
	public int abs(int value){
		return value>0? value: -value;
	}
	
	//nonstatic영역
	Ex06(){
		int value = 5;
		System.out.println(value+"의 절대값:"+abs(value));
		value = -10;
		System.out.println(value+"의 절대값:"+abs(value));
	}
	public static void main(String[] args) {
		new Ex06();
	}
}
