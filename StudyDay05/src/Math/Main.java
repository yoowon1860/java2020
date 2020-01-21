package Math;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String tex = sc.next();
		
		
		switch (tex) {
		case "+":
			Add add = new Add();
			add.setValue(num1, num2);
			System.out.println(add.calculate());
			break;
			
		case "-":
			Sub sub = new Sub();
			sub.setValue(num1, num2);
			System.out.println(sub.calculate());
			break;
			
		case "*":
			Mul mul = new Mul();
			mul.setValue(num1, num2);
			System.out.println(mul.calculate());
			break;
			
		case "/":
			Div div = new Div();
			div.setValue(num1, num2);
			System.out.println(div.calculate());
			break;

		default:
			break;
		}
		
		sc.close();
	}

}
