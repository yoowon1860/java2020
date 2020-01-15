import java.util.Scanner;

class Day{
	private String work;
	public void set(String work) {
		this.work = work;
	}
	public String get() {
		return work;
	}
	public void show() {
		if(work==null) System.out.println("없습니다.");
		else System.out.println(work +" 입니다.");
	}
}
public class MonthSchedule {

	public MonthSchedule() {}

	public MonthSchedule(int n) {
		MonthSchedule [] ms = new MonthSchedule[n];
	}

	public String input(String work) {
		Day day = new Day();
		day.set(work);
		return day.get();
	}
	public void view() {
		Day day = new Day();
		day.show();
	}

	public void finish() {

	}

	public void run() {
		MonthSchedule schedule = new MonthSchedule();
		Day [] day = new Day[30];
		Scanner sc = new Scanner(System.in);
		System.out.println("이번달 스케쥴 관리 프로그램");
		System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
		int choiceNum = sc.nextInt();

		switch (choiceNum) {
		case 1: 
			System.out.print("날짜(1~30)?");
			int i = sc.nextInt();
			System.out.print("할일(빈칸없이입력)?");

			break;

		case 2:
			schedule.view();

			break;
		case 3:
			schedule.finish();

			break;
		}
	}
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}
}


