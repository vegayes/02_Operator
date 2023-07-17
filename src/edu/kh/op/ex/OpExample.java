package edu.kh.op.ex;

import java.util.Scanner;

public class OpExample { // 예제 코드 작성용 클래스

	// ex1() method : 객체 지향 프로그래밍에서 객체와 관련된 함수
	// -> OpExample이 가지고 있는 기능 중 ex1()이라는 기능
	public void ex1() { // 반환하는 값이 없을 떄?

		System.out.println("예제 코드 작성 실행 1");
		System.out.println("예제 코드 작성 실행 2");
		System.out.println("예제 코드 작성 실행 3");

	}

	public void ex2() {

		Scanner sc = new Scanner(System.in);
		// 실행될 때 ExampleRun -> OpExample -> Scanner 순으로 만들어냄.
		// Scanner는 같은 패키지내에 있지 않기 때문에 import(수입) 해와야 한다.

		System.out.print("정수 입력 1 : ");
		int input1 = sc.nextInt(); // 다음 입력되는 정수를 읽어옴.

		System.out.print("정수 입력 2 : ");
		int input2 = sc.nextInt();

		System.out.printf("%d / %d = %d \n", input1, input2, input1 / input2);
		System.out.printf("%d %% %d = %d \n", input1, input2, input1 % input2);
		// 모듈러(%)를 문자열 안에 넣을 경우에는 %%를 써야 함.
		// 왜냐하면, format 하는 거랑 헷갈릴 수 있기 떄문.

	}

	public void ex3() {
		// 증감(증가, 감소) 연산자 : ++ , --
		// -> 피연산자 (값)를 '1' 증가 또는 감소 시키는 연산자
		// sum +=2 ===> sum = sum + 2

		int iNum1 = 10;
		int iNum2 = 10;

		iNum1++; // iNum1을 1 증가 시킴. => iNum1 = 11
		iNum2--; // iNum2을 1 감소 시킴. => iNum2 = 9

		System.out.println("iNum1 : " + iNum1);
		System.out.println("iNum2 : " + iNum2);

		// *전위 연산 : ++3. --2 연산자가 앞쪽에 배치
		// -> 다른 연산자보다 먼저 증가/ 감소

		int temp1 = 5;

		System.out.println(++temp1 + 5);
		// ++5 + 5
		// 6 + 5
		System.out.println("temp1 : " + temp1); // 6
		// ==> 위에서++temp1 을 했기 때문에 그 값이 temp1에 저장됨.

		// *후위 연산 : 10++ , 6-- 연산자가 뒤쪽에 배치
		// -> 다른 연산자보다 나중에 증가/감소

		int temp2 = 3;
		System.out.println(temp2-- + 2); // 5
		// 3-- + 2 :: 먼저 더하는 것이 우선! 5
		// temp2 -1 ; (1 나중에 감소)
		System.out.println(temp2); // 2

		int a = 3;
		int b = 5;
		int c = a++ + --b;

		// 3++ + --5
		// c = 3++ + 4
		// c = 3+4 = 7
		// 미뤄놨던 a 후위연산 :: a++ ==> 3+1 =4
		// b는 아까 연산했던 거 4

		System.out.printf("%d / %d / %d\n", a, b, c);
		// 4/ 4/ (3+4) 7

	}

	public void ex4() {
		// 비교 연산자 : >, <, >=, <= , == , !=
		// ==> 비교연산자의 결과는 항상 논리값(True / False)
		// ==> 등호(==)가 포함된 연산자에서 등호는 항상 오른쪽!

		// 같다 기호는 = , == ? ==> ' == '
		// 등호 1개(=) 대입 연사자로 사용
		// --> 구분을 위해서 두개(==)를 "같다"라는 의미로 사용

		int a = 10;
		int b = 20;

		System.out.println(a > b); // False
		System.out.println(a < b); // True
		System.out.println(a != b); // True
		System.out.println((a == b) == false); // True
		// () 괄호안에 있는 것 먼저 연산
		// 괄호 안 내용 false
		// false == false :: True

		System.out.println("-".repeat(50));

		int c = 4;
		int d = 5;

		System.out.println(c < d); // true
		System.out.println(c + 1 <= d); // true
		// 4 + 1 <= 5
		// 산술 연산이 비교연산보다 우선순위가 높기 때문에
		// 더하기 먼저 해야함.

		System.out.println(c >= d - 1);
		System.out.println((++c != d) == (--c != d));
		// (5 != 5 ) == (--5 != 5)
		// false == True
		// false

		System.out.println("-".repeat(50));

		int temp = 723;

		// 홀짝 구분 시, %사용.

		System.out.println("temp는 짝수인가?" + (temp % 2 == 0)); // false
		System.out.println("temp는 짝수인가?" + (temp % 2 != 1)); // false
		System.out.println("temp는 짝수인가?" + (temp % 2 != 0)); // true

		System.out.println("temp는 홀수인가?" + (temp % 2 == 1)); // true
		System.out.println("temp는 홀수인가?" + (temp % 2 != 0)); // true
		System.out.println("temp는 홀수인가?" + (temp % 2 != 1)); // false

		System.out.println("temp는 3의 배수인가?" + (temp % 3 == 0)); // true
		System.out.println("temp는 3의 배수인가?" + (temp % 4 == 0)); // false
		System.out.println("temp는 3의 배수인가?" + (temp % 5 == 0)); // fasle

	}

	public void ex5() {

		// 논리 연산자 :: && (AND) , ||(OR)

		// &&(AND) 연산자 : 둘 다 true면 true, 나머지는 false
		// 와, 그리고, ~면서, ~이면서, ~부터 ~까지, ~사이

		// ex) 사과와 바나나, 사과 그리고 바나나, 사과 이면서 바나나

		int a = 101;

		// a는 100이상 이면서 짝수인가?
		System.out.println(a >= 100);
		System.out.println(a % 2 == 0);

		System.out.println((a >= 100) && (a % 2 == 0));

		int b = 5;
		// b는 1부터 10까지 숫자 범위 포함되어 있는가?
		// => b는 1부터 10 사이의 숫자인가?
		// => b는 1보다 크거나 같으면서, 10보다 작거나 같은가?

		System.out.println(b >= 1); // b는 1이상 인가? true
		System.out.println(b <= 10); // b는 10이하 인가? true
		System.out.println((b >= 1) && (b <= 10));

		System.out.println("-".repeat(50));
		// ||(OR) 연산자 : 둘 다 false면 false, 나머지는 true(AND의 반대) 
		// 또는, ~거나, ~이거나
		
		int c = 10;
		
		// c는 10을 초과 했거나 짝수인가?
		System.out.println( (c > 10) || (c % 2 == 0) );

	}
	
	public void ex6(){
		
		
	}

}
