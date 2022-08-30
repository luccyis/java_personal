package java_personal.tt.ch01;

public class SecondQ {

	public static void main(String[] args) {
		
//		int 타입의 변수를 2개 선언하고 두 정수가 주어졌을 때 두 정수를 비교하고 크기 비교 결과를 나타내는 프로그램을 작성하시오.
		
		int a = 7;
		int b = 66;
		
		if(a>b) {
			System.out.println("a는 b 보다 " + (a-b) + "만큼 큽니다.");
		}else if (b>a) {
			System.out.println("b는 a 보다 " + (b-a) + "만큼 큽니다.");
		}else {
			System.out.println("a와 b는 같습니다.");
		}
			
	}

}
