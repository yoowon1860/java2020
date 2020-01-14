import java.util.Random;
import java.util.Scanner;

public class UpAndDown {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int min =0, max=99;
			int n =1;
		Random random = new Random();
		int rn = random.nextInt(100);
		System.out.println("수를 결정하였습니다. 맞추어보세요.");
		System.out.println("0-99");
		while(true) {
		System.out.print(n+">>");
		int answer = sc.nextInt();
		if(answer<rn) {
			min = answer;
			System.out.println("더 높게");
			System.out.println(min+"-"+max);
			n++;
		}else if(answer>rn) {
			max = answer;
			System.out.println("더 낮게");
			System.out.println(min+"-"+max);
			n++;
		}else if(answer == rn) {
			System.out.println("맞았습니다.");
			break;
		}
		}
		System.out.print("다시하시겠습니까(y/n)>>");
		String text = sc.next();
		if(text.equals("n")) {
			break;
		}
		
		}
	}

}
