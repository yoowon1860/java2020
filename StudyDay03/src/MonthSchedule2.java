import java.util.Scanner;

class Day2 {
	private String work; // �Ϸ��� �� ���� ��Ÿ���� ���ڿ�
	public void set(String work) { this.work = work; }
	public String get() { return work; }
	public void show() {
		if(work == null) System.out.println("�����ϴ�.");
		else System.out.println(work + "�Դϴ�.");
	}
}

public class MonthSchedule2 {
	private int nDays; 
	private Day2 [] days; // Day ��ü �迭
	private Scanner scanner;
	
	public MonthSchedule2(int nDays) {
		this.nDays = nDays;		
		this.days = new Day2 [nDays];
		for(int i=0; i<days.length; i++) {
			days[i] = new Day2();
		}
		scanner = new Scanner(System.in);		
	}
	
	private void input() {
		System.out.print("날짜(1~30)?");
		int day = scanner.nextInt();
		System.out.print("할일(빈칸없이입력)?");
		String work = scanner.next();
		day--;
		
		if(day < 0 || day > nDays) { // 0~29 �� ��ȿ
			System.out.println("��¥ �߸� �Է��Ͽ����ϴ�.!");			
			return;
		}
		days[day].set(work);
	}
	
	private void view() {
		System.out.print("날짜(1~30)?");
		int day = scanner.nextInt();
		day--;
		if(day < 0 || day > nDays) { // 0~29 �� ��ȿ
			System.out.println("��¥ �߸� �Է��Ͽ����ϴ�.!");			
			return;
		}
		System.out.print((day+1) + "���� �� ���� " );
		days[day].show();
	}
	

	private void finish() {
		scanner.close();
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	public void run() {
		System.out.println("�̹��� ������ ���� ���α׷�.");

		while(true) {
			System.out.print("����(�Է�:1, ����:2, ������:3) >>");
			int menu = scanner.nextInt();
			switch(menu) {
			case 1: input(); break;
			case 2: view(); break;
			case 3: finish(); return;
			default : 
				System.out.println("�߸��Է��Ͽ����ϴ�.");
			}
			System.out.println();
		}		
	}
	public static void main(String[] args) {
		MonthSchedule2 april = new MonthSchedule2(30); // 4������ �� ��
		april.run();
	}

}