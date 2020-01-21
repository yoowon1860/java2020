package sstack;

import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("총 스택 저장 공간의 크기 입력 >>");
		StringStack ss = new StringStack(sc.nextInt());
		while(true) {
			System.out.print("문자열입력>> ");
			String word = sc.next();
			if(word.equals("그만"))
				break;
			boolean res = ss.push(word);
			if(res == false)
				System.out.println("스택이 꽉 차서 푸시 불가!");
			
		}
		
		System.out.println("스택에 저장된 모든 문자열 팝 : ");
		int len = ss.length();
		for (int i = 0; i < len; i++) {
			System.out.println(ss.pop()+" ");
		}
		
		sc.close();
	}

}
