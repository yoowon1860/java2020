/*

StringBuffer(): 초기 버퍼의 크기가 16인 스트링 버퍼 객체 생성
StringBuffer(charSequence seq): seq가 지정하는 일련의 문자들을 포함하는 스트링 버퍼 생성
StringBuffer(int capacity): 지정된 초기 크기를 갖는 스트링 버퍼 객체 생성
StringBuffer(String str): 지정된 스트링으로 초기화된 스트링 버퍼 객체 생성

StringBuffer 클래스는 문장에 대한 다양한 조작을 할 수 있는 메소드를 제공하며
StringBuffer append(string str) : str스트링을 스트링 버퍼에 덧붙인다.
StringBuffer insert(int offset, String str): str 스트링을 버퍼의 offset 위치에 삽입
StringBuffer replace(int start, int end, String str): 스트링 버퍼 내의 start 위치의 문자부터 end가 지정하는 문자앞의 서브 스트링을 str로 대치
void setLength(int newLength): 스트링 버퍼 내 문자열 길이를 newLength로 재설정. 현재 길이보다 큰 경우 널 문자(' ')로 채우며 작은 경우는 기존 문자열이 잘린다.
char charAt(int num): 0번 인덱스부터 시작하여 num번째의 문자를 리턴한다. 
 */

public class StringBufffer {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("a");
		sb.append("pencil");
		sb.insert(2, "nice");

		sb.replace(2, 6, "bad");
		System.out.println(sb);
		char c = sb.charAt(3);
		System.out.println(c);
		
		
	}

}
