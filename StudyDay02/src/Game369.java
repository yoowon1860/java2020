
public class Game369 {

	public static void main(String[] args) {

		int i;
		
		for(i=1;i<100;i++) {
			for(int n=3;n<10;n+=3) {
			if(i%10==n) {
				System.out.println(i+" 박수 짝");
				continue;
			}else if(i>=n*10 && i<=(n*10+9)){
				System.out.println(i+" 박수 짝");
			}
			}
		}
	}

}
