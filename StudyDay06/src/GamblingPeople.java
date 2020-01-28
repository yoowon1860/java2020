import java.util.Scanner;

class People{
	String name;

	public People[] group(int num) {	//num만큼의 플레이어 생성
		People [] p = new People[num];
		for (int i = 0; i < p.length; i++) {
			p[i] = new People();
		}
		return p;
	}

	public void setName(String name) {	//플레이어의 이름 입력
		this.name = name;
	}

	public String getName() {	//플레이어 이름 출력
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

public class GamblingPeople { //겜블링 게임에 참여할 선수 숫자를 입력 받는다.

	public static void main(String[] args) {

		People p = new People();
		Scanner sc = new Scanner(System.in);
		System.out.println("겜블링 게임에 참여할 선수 숫자>>");
		People [] pg = p.group(sc.nextInt());
		for(int i=0;i<pg.length;i++) {
			System.out.print((i+1)+"번째 선수 이름>>");
			pg[i].setName(sc.next());
			System.out.println("");
		}
		boolean flag = true;
		Game:	while(true) { 
			for (int i = 0; i < pg.length; i++) {
				System.out.println(pg[i].getName()+":");
				if(sc.next().equals("enter")) {	//player가 enter를 입력해야 게임 진행
					flag = pg[i].game();
					if(flag == false) {
						System.out.println(pg[i].getName()+"님이 이겼습니다.");
						break Game;
					}
				}
			}
		}


	}

}
