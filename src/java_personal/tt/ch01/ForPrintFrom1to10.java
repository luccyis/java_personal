package java_personal.tt.ch01;

public class ForPrintFrom1to10 {

	public static void main(String[] args) {

//		1문제. 1~10까지 for문을 이용해서 더하는 프로그램 작성하시오!
		
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("sum: " + sum);
	}

}
