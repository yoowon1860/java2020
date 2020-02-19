import java.util.StringTokenizer;

/*
 * StringTokenizer 클래스는 java.util 패키지에 포함되어 있으며, 하나의 문자열을 여러 개의 문자열로 분리하기 위해 사용된다.
 * 문자열을 분리할 때 사용되는 기준 문자를 구분 문자(delimeter)라고 하고, 구분 문자로 분리된 문자열을 토큰이라고 한다.
 * oracle에서는 StringTokenizer를 사용하지 말고, String 클래스의 split() 메소드를 이용하여 문자열 분리를 권한다.
 * 
 * StringTokenizer(String str, String delim, boolean returnDelims):
 * str 스트링과 delim 구분 문자로 문자열을 분리하는 스트링 토크나이저 생성,
 * returnDelims가 true면 delim이 포함된 문자도 토큰에 포함된다. 
 * 
 *	StringTokenizer의 주요 메소드 
 * countTokens() : 스트링 토크나이저가 분리한 토큰의 개수 리턴
 * boolean hasMoreTokens(): 스트링 토크나이저에 다음 토큰이 있으면 true 리턴
 * String nexToken(): 스트링 토크나이저에 들어 있는 다음 토큰 리턴
 * */
public class StringTokenizerEx {

	public static void main(String[] args) {

		String query = "name=kitae&addr=seoul&age=21";
		StringTokenizer st = new StringTokenizer(query, "=&");
		int count = st.countTokens();
		System.out.println("token의 갯수:"+count);
		for (int i = 0; i < count; i++) {
			String token = st.nextToken();
			System.out.println(token);
			
		
		}
		StringTokenizer x = new StringTokenizer(query,"=",true);
		int num = x.countTokens();
		System.out.println(num);
		for (int i = 0; i < num; i++) {
			String token = x.nextToken();
			System.out.print(token+" ");
		}
	}

}
