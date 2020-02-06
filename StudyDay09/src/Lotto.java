/*독일 로또는 {1, 2, ..., 49}에서 수 6개를 고른다.

로또 번호를 선택하는데 사용되는 가장 유명한 전략은 49가지 수 중 k(k>6)개의 수를 골라 
집합 S를 만든 다음 그 수만 가지고 번호를 선택하는 것이다.

예를 들어, k=8, S={1,2,3,5,8,13,21,34}인 경우 이 집합 S에서 수를 고를 수 있는 경우의 수는 총 28가지이다. 
([1,2,3,5,8,13], [1,2,3,5,8,21], [1,2,3,5,8,34], [1,2,3,5,13,21], ..., [3,5,8,13,21,34])

집합 S와 k가 주어졌을 때, 수를 고르는 모든 방법을 구하는 프로그램을 작성하시오.  백준 6603번*/

public class Lotto {

	public static void main(String[] args) {

		int k = (int)(Math.random()*6+7);
		int [] arr = new int [k];
		int [] arrU  = new int [6];
		for (int i = 0; i < arr.length; i++) {	// 1~49까지 중복되지 않는 k개의 수 뽑기
			int n = (int)(Math.random()*49 + 1);
			a:	for (int j = 0; j < arr.length; j++) {
				if(arr[j]==n) {
					break a;
				}
				arr[i] = n;
			}
		}


		System.out.print(k+"개: ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println("");
		
		int c = 0;
		for (int i = 0; i < 6; i++) {	//오름차순으로 6개 뽑기
			int min = 50;
			for (int j = 0; j < arr.length; j++) {
				if(arr[j]<min && c<arr[j]) {
					min = arr[j];
				}
			}
			c = min;
			arrU[i] = min;
		}
		for (int i = 0; i < arrU.length; i++)
			System.out.print(arrU[i]+" ");
	}
}


