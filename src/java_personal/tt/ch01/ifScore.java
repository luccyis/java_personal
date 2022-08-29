package java_personal.tt.ch01;

public class ifScore {

	public static void main(String[] args) {
//		2문제. if문을 활용한 학점 매기기 프로그램 작성하기
		
		int score = 55;
		
		if(score >= 90 && score <= 100) {
			if(score >= 97) {
				System.out.println("A+ 입니다.");
			} else if (score <=92) {
				System.out.println("A- 입니다.");
			} else {
				System.out.println("A 입니다 ");
			}
		} else if(score >= 80 && score < 90) {
			if(score >=87) {
				System.out.println("B+ 입니다.");
			} else if (score <= 82) {
				System.out.println("B- 입니다.");
			} else {
				System.out.println("B 입니다.");
			}
		} else if (score >= 70 && score < 80) {
			if(score >= 77) {
				System.out.println("C+ 입니다.");
			} else if (score <= 72) {
				System.out.println("C- 입니다.");
			} else {
				System.out.println("C 입니다.");
			}
		}else if (score >=60 && score < 70) {
			if(score >= 67) {
				System.out.println("D+ 입니다.");
			} else if (score <= 62) {
				System.out.println("D- 입니다.");
			} else {
				System.out.println("D 입니다.");
			}
		} else {
			System.out.println("F 입니다.");
		}
		
	}

}
