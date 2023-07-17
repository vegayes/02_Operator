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
		//세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력

		System.out.print("국어: ");
		int kor = sc.nextInt();

		System.out.print("영어: ");
		int eng = sc.nextInt();

		System.out.print("수학: ");
		int math = sc.nextInt();

		int sum = kor + eng + math ;
		double avg = (double) (kor+eng+math) / 3;
		
		System.out.printf("\n합계 : %d \n", sum);
		System.out.printf("평균 : %.1f ", avg);
		
		boolean result = kor>=40 && eng >=40 && math >= 40 && avg >=60;
		
		String output = result ? "합격" : "불합격";
		System.out.printf("\n%s",output);
	}

}
