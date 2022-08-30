package java_personal.tt.ch01;

public class Multi {

	public static void main(String[] args) {
//		구구단 2~9단 프로그램 작성하시오, 10줄 이하로!
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
	}

}
