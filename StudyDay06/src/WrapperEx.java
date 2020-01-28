
public class WrapperEx {

	public static void main(String[] args) {

		System.out.println(Character.toLowerCase('A'));
		
		char c1 ='4', c2='F';
		if(Character.isDigit(c1))
			System.out.println(c1 + "는 숫자");
		if(Character.isAlphabetic(c2))
			System.out.println(c2 +"는 영문자");
		
		System.out.println(Integer.parseInt("-123")); //10진수 변환
		System.out.println(Integer.toHexString(28));	//16진수 문자열로 변환
		System.out.println(Integer.toBinaryString(28));	//2진수 문자열로 변환
		System.out.println(Integer.bitCount(28));	//2진수의 1의 개수
		
		Double d = new Double(3.14);
		System.out.println(d.toString());
		System.out.println(Double.parseDouble("3.14"));  //문자열을 실수로 변환
		
		boolean b = (4>3);
		System.out.println(Boolean.toString(b));	//boolean값을 문자열로 변환
		System.out.println(Boolean.parseBoolean("false")); //문자열을 boolean값으로 변환
		
		String s = new String("  sib al");
		System.out.println(s.trim());
		}

}
