import java.util.Scanner;

class Player{
	String name;
	String word;

	public static String getWordFromUser(String word) { //사용자로부터 단어를 입력받기
		Player player = new Player();
		player.word = word;
		return player.word;
	}

	public boolean checkSuccess() {//끝말잇기의 성공여부, 게임을 계속하는지 판별
		boolean flag = true;
		int lastIndex = word.length() -1;
		char lastChar = word.charAt(lastIndex);
		Player.getWordFromUser(word);
		char firstChar = word.charAt(0);
		if(lastChar != firstChar) {
			flag = false;
			System.out.println();
		}
		return flag;
		
	}

}

public class OpenChallangeWordGameApp {

	public OpenChallangeWordGameApp() {

	}

	public static void run(int n) {
		Scanner sc = new Scanner(System.in);
		Player [] player = new Player[n];
		for (int i = 0; i < player.length; i++) {
			player[i] = new Player();
			System.out.print("참가자의 이름을 입력하세요.>>");
			player[i].name= sc.next();
		}
		System.out.println("시작하는 단어는 아버지입니다.");
		int i=0;
		while(true) {
			if(i%3==0) {
				System.out.print(player[0].name+">>");
				player[0].getWordFromUser(sc.next());
				if(player[0].checkSuccess()==false) {
					System.out.print(player[0].name+"이 졌습니다.");
					break;
				}
				i++;
			}else if(i%3==1) {
				System.out.print(player[1].name+">>");
				String word = sc.next();
				player[1].getWordFromUser(word);
				if(player[1].checkSuccess()==false) {
					System.out.print(player[1].name+"이 졌습니다.");
					break;
				}
				i++;
			}else if(i%3==2) {
				System.out.print(player[2].name+">>");
				String word = sc.next();
				player[2].getWordFromUser(word);
				if(player[2].checkSuccess()==false) {
					System.out.print(player[2].name+"이 졌습니다.");
					break;
				}
				i++;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("끝말잇기 게임을 시작합니다..");
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int userNum = sc.nextInt();
		OpenChallangeWordGameApp.run(userNum);

	}

}
