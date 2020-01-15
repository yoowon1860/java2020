import java.util.Scanner;

class Phone{
	private String name;
	private String tel;
	public Phone(String name, String tel){
		this.name = name;
		this.tel = tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}

}
public class PhoneBook {
	Scanner sc = new Scanner(System.in);
	Phone [] phone;

	public PhoneBook(int n) {
		phone = new Phone[n];
		for (int i = 0; i < phone.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>>");
			phone[i] = new Phone(sc.next(), sc.next());
		}
		System.out.println("저장되었습니다.");

	}

	public void show() {
		System.out.println("검색할 이름>>");

		while(true) {
			String name = sc.next();
				for(int i=0;i<phone.length;i++) {
				if(phone[i].getName().equals(name)) {
					System.out.println(phone[i].getName()+"의 번호는"+phone[i].getTel()+"입니다.");
				}else if(name.equals("그만")) {
					System.out.println("종료되었습니다.");
					break;
				}
			}
		}
	}

	public void update() {
		System.out.println("전화번호 수정할 이름>>");
		String name = sc.next();
		for (int i = 0; i < phone.length; i++) {
			if(phone[i].getName().equals(name)) {
				System.out.println("전화번호 수정하세요>>");
				String newTel = sc.next();
				phone[i].setTel(newTel);
				break;
			}
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수>>");
		PhoneBook phonebook = new PhoneBook(sc.nextInt());
		
		phonebook.update();
		phonebook.show();

	}

}
