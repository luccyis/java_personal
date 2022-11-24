package java_personal.tt.codingTest.Nov11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		
		int c = Integer.parseInt(b.substring(0,1));
		int d = Integer.parseInt(b.substring(1,2));
		int e = Integer.parseInt(b.substring(2,3));
		
		int cde = Integer.parseInt(b);
		
		System.out.println(a*e);
		System.out.println(a*d);
		System.out.println(a*c);
		System.out.println(a*cde);
		
		System.out.println("        ,r'\"7");
		System.out.println("r`-_   ,'  ,/");
		System.out.println("\\. \". L_r'");
		System.out.println("  `~\\/");
		System.out.println("     |");
		System.out.println("     |");

	}

}
