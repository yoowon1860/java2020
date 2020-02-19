import java.util.StringTokenizer;

public class StringTokenizerExx01 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("alpah/bravo/charil/delta/echo/france",
				"/");
		
		
		while (st.hasMoreElements()) {
			System.out.print(st.nextToken());
			System.out.println(st.nextElement());
		}
		
		int total = 0;
		StringTokenizer plus = new StringTokenizer("2+3+5+66+88+323","+");
		System.out.println(plus.countTokens());
		while(plus.hasMoreTokens()) {
			int c = Integer.parseInt(plus.nextToken());
			total = total + c;
		}
		System.out.println(total);
		

	}

}
