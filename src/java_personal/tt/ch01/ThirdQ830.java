package java_personal.tt.ch01;

public class ThirdQ830 {

	public static void main(String[] args) {

		// int 타입 변수를 2개 선언하고
		// 두 정수가 주어졌을 때 사분면 어디에 해당되는지 출력하는 프로그램 작성
		
		int x = 8;
		int y = 0;
		
		if(x>0 && y>0) {
			System.out.println("(x, y)는 제 1 사분면 입니다.");
		} else if(x<0 && y>0) {
			System.out.println("(x, y)는 제 2 사분면 입니다.");
		} else if(x<0 && y<0) {
			System.out.println("(x, y)는 제 3 사분면 입니다.");
		} else if (x>0 && y<0) {
			System.out.println("(x, y)는 제 4 사분면 입니다.");
		} else if(x==0 && y!=0) {
			System.out.println("x 축 위에 있습니다.");
		} else if(y==0 && x!=0) {
			System.out.println("y 축 위에 있습니다.");
		} else {
			System.out.println("(x, y)는 원점입니다.");
		}
		
		
	}

}
