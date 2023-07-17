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
		System.out.println((c > 10) || (c % 2 == 0));

	}

	public void ex6() {

		// 논리 부정 연산자 : !
		// => 논리 값을 반대로 바꾸는 연산자

		boolean bool1 = true;
		boolean bool2 = !bool1; // false

		System.out.println("bool1 : " + bool1);
		System.out.println("bool2 : " + bool2);

		System.out.println("-".repeat(50));

		Scanner sc = new Scanner(System.in);

		// 정수를 하나 입력 받았을 때,
		// 1) 해당 정수가 1부터 100사이 값이 맞는지 확인 (1이상 100이하)
		// 2) (반대) 1부터 100사이 값이 아닌지 확인

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		// 1<= input <= 100
		boolean result1 = 1 <= input && 100 >= input;
		// (input >= 1) && (input <= 100)

		System.out.printf("%d은/는 1 이상, 100 이항의 정수인가? : %b\n", input, result1);

		// 1 이상 이면서 100이하 <-> 1"미만" "또는" 100"초과"

		boolean result2 = (input < 1) || (input > 100);

		boolean result3 = !(1 <= input && 100 >= input); // result 2 == reuslt3
		boolean result4 = !result1;

		System.out.printf("%d은/는 1미만, 100 초과 정수인가? : %b / %b / %b\n ", input, result2, result3, result4);

	}

	public void ex7() {

		// 복합 대입 연산자 : += , -= , *= , /= , %=
		// ->피연산자가 자신과 연산 후 결과를 다시 자신에게 대입

		int a = 10;
		a++; // a를 1증가 a++ , a += 1
		System.out.println("a를 1증가 : " + a); // 11

		// a를 4증가
		a += 4;
		System.out.println("a를 4증가 : " + a); // 15

		// a를 10감소
		a -= 10;
		System.out.println("a를 10감소 : " + a); // 5

		// a를 3배 증가
		a *= 3;
		System.out.println("a를 3배증가 : " + a); // 15

		// a를 6으로 나눴을 때 몫
		a /= 6;
		System.out.println("a를 6나눔 : " + a); // 2

		// a를 2으로 나눴을 때 나머지
		a %= 2;
		System.out.println("a를 2나눌때의 나머지 : " + a); // 0

	}
	
	public void ex8() {
		
		// 삼항 연산자 : 조건식 ? 식1 : 식2  
		
		// => 조건식의 결과가 true면 식1 수행 false면 식2 수행
		
		// => 조건식 : 연산 결과가 true/false인 식 (비교, 논리, 논리부정 연산이 포함)
		
		int num = 30; 
		// num이 30보다 크면(초과) "num은 30보다 큰 수 이다." 
		// 아니면 "num은 30 이하의 수이다" 출력
		
		String result = num > 30 ? "num은 30보다 큰 수이다": "num은 30이하의 수이다.";		
		System.out.println(result);
		
		//----------------------------------------------------------------
		System.out.println("-".repeat(50));
		
		// 입력 받은 정수가음수인지 양수인지 구분
		// 단, 0은 양수로 처리
		
		//ex)
		// 정수 입력 : 4
		// 양수 입니다.
		
		// 정수 입력 : -5
		// 음수 입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 :");
		int input1 = sc.nextInt();
		
		String result2 = input1 >= 0 ? "양수 입니다." : "음수 입니다.";
		System.out.println(result2);
		
	}
	
/*	public void ex9() { // 프로그래머스 :: 문자열 연산자 
		
		int n = 20;
		int m = 50;
		
		char ineq = '<';
		char eq = '=';
		
		int com = ineq + eq;
		
		if ( n + com + m   ){
            answer = 1; 
        } else 
            answer = 0;
        
        
        return answer;

		
	}
*/
}
