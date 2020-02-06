import java.util.ArrayList;
import java.util.Scanner;

public class Energy {//백준 16198문제 에너지 모으기
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a =sc.nextInt();
		
		int total =0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0; i<a;i++) {
			list.add((int)(Math.random()*10+1)); //a개의 구술무게 1 ~ 1000으로 설정, 
		}
		System.out.println(list.toString());
		while(list.size()>2) {
		int max = 0;
		int flag=0;
		for (int i = 1; i < list.size()-1; i++) { //양끝의 구슬은 제거 대상에서 제외시킨다
			int c = list.get(i-1) * list.get(i+1);
			if(c >= max) {
				max = c;
				flag = i;
			}
		}
		total +=max;
		list.remove(flag);
		}
		System.out.println(total);
		
		sc.close();
	}

}
