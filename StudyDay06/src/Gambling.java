import java.util.Scanner;

class Person{
	String name;
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return "["+name+"]";
	}

	public boolean game() {		//1~3까지의 랜덤수 3개를 발행하여 3개의 수가 동일하면 승리
		int rn1 = (int)(Math.random()*3+1);
		int rn2 = (int)(Math.random()*3+1);
		int rn3 = (int)(Math.random()*3+1);
		if(rn1==rn2 && rn2==rn3) {
			System.out.print(rn1+"  "+rn2+"  "+rn3+"\t");
			return false;
		}else {
			System.out.println(rn1+"  "+rn2+"  "+rn3+"   아쉽군요!");
			return true;
		}
	}
}
	public class Gambling {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1번째 선수 이름>>");
		Person player1 = new Person(sc.next());
		System.out.print("2번째 선수 이름>>");
		Person player2 = new Person(sc.next());
		boolean flag = true;
		while(true) {
			System.out.println(player1.getName()+":");
			if(sc.next().equals("enter")) {	//player가 enter를 입력해야 게임 진행
				flag = player1.game();
				if(flag == false) {
					System.out.println(player1.getName()+"님이 이겼습니다.");
					break;
				}
			}

			System.out.println(player2.getName()+":");
			if(sc.next().equals("enter")) {
				flag = player2.game();
				if(flag == false) {
					System.out.println(player2.getName()+"님이 이겼습니다.");
					break;
				}
			}
		}
		sc.close();
	}

}
