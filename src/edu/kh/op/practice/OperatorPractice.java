package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		System.out.print("인원 수 :");
		int input1 = sc.nextInt();

		System.out.print("사탕 개수 :");
		int input2 = sc.nextInt();

		int oneCandy = input2 / input1;

		int modCandy = input2 % input1;

		System.out.printf("\n1인당 사탕 개수 : %d\n", oneCandy);
		System.out.printf("남는 사탕 개수 : %d\n", modCandy);

	}

	public void practice2() {

		System.out.print("이름 : ");
		String input1 = sc.next();

		System.out.print("학년(정수만) : ");
		int input2 = sc.nextInt();

		System.out.print("반(정수만) : ");
		int input3 = sc.nextInt();

		System.out.print("번호(정수만) : ");
		int input4 = sc.nextInt();

		System.out.print("성별(남학생/여학생) : ");
		String input5 = sc.next();

		System.out.print("성적(소수점 아래 둘째 자리 까지) : ");
		double input6 = sc.nextDouble();

		System.out.printf("\n%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n", input2, input3, input4, input1, input5, input6);

	}

	public void practice3() {

		System.out.print("국어: ");
		int input1 = sc.nextInt();

		System.out.print("영어: ");
		int input2 = sc.nextInt();

		System.out.print("수학: ");
		int input3 = sc.nextInt();

		System.out.printf("\n합계 : %d \n", input1 + input2 + input3);
		System.out.printf("평균 : %.1f ", (double) (input1 + input2 + input3) / 3);

	}

}
