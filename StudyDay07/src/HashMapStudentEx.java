import java.util.HashMap;
import java.util.Scanner;

class Student{
	private String tel;
	private int id;
	public Student(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}
	public String getTel() {
		return tel;
	}
	public int getId() {
		return id;
	}
	
}
public class HashMapStudentEx {

	public static void main(String[] args) {
		HashMap<String, Student> h = new HashMap<String, Student>();
		h.put("권하은", new Student(1, "01083740725"));
		h.put("유원상", new Student(2, "01035659453"));
		h.put("박순임", new Student(3, "01073448201"));
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("검색할 이름?");
			String name = sc.nextLine();
			if(name.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			Student student = h.get(name);
			if(student == null) {
				System.out.println(name="은 없는 사람입니다.");
			}else {
				System.out.println("id:"+student.getId()+", tel: "+student.getTel());
			}
				
		}
	}

}
