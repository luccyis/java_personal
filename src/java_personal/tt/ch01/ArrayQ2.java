package java_personal.tt.ch01;

public class ArrayQ2 {

	public static void main(String[] args) {
//		국어,영어,수학
//		1. 개인의 평균
//		2. 과목별 평균
		
		int[][] scores = {{99,88,55}, {55,77,66}, {55,55,44}, {55,55,44}, {55,55,77}};
		
		String[] name = {"장원영", "장동건", "고소영", "고명지", "박지원"};
		String[] subject = {"국어", "수학", "영어"};
		
//		1. 개인 평균
		
		for(int i=0; i<scores.length; i++) {
			int sum = 0;
			for(int j=0; j<scores[i].length; j++) {
				sum += scores[i][j];
			}
			System.out.println(name[i] + "의 평균은 : " + ((double)sum)/scores[i].length);
		}
			
//		2. 과목별 평균
		
		for(int i=0; i<scores[i].length; i++) {
			int sum = 0;
			for(int j=0; j<scores.length; j++) {
				sum += scores[j][i];
			}
			System.out.println(subject[i] + "과목의 평균은: " + ((double)sum)/scores.length );
		}
		
	}

}
