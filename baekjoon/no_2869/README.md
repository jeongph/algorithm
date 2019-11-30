# :bookmark_tabs: [달팽이는 올라가고 싶다][title]

## :question: Problem(문제)
땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.

달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.

달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.

### :information_source: Function Description(매개변수 속성)
X

### :warning: Constraints(제약 조건)
(1 ≤ B < A ≤ V ≤ 1,000,000,000)

### :arrow_right: Input Format
첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다.

### :arrow_left: Output Format
첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.

## :white_check_mark: Submit
### 중요 코드
``` java
public class Main
{
	public static void main( String[] args ) throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringTokenizer st = new StringTokenizer( br.readLine() );

		int A = Integer.parseInt( st.nextToken() );
		int B = Integer.parseInt( st.nextToken() );
		int V = Integer.parseInt( st.nextToken() );
		double temp = ((double)(V-B)/(double)(A-B));

		if( V == B ) System.out.println( 1 );
		else System.out.println( (int)Math.ceil(temp) );
	}
}
```
### 풀이
- 이건 생각 진짜 잘했다..!
- 먼저 일련의 약속(알고리즘)을 찾아야 하니까 일종의 공식을 찾기위해 예제 출력인 2/1/5를 가지고 각각 n=1일때 n=2일때 n=3일때... 이때 어떤 숫자들이 나오는지 생각
- 계산해보니까 올라가는 길이가 A, 내려오는 길이가 B, 총 길이가 V일 때 An-Bn+B>=V를 만족한다면 그때의 n값이 정답이 됨.
- 수식을 계산
```
=> An - Bn + B >= V
=> n(A-B) + B >= V
=> n(A-B) >= V-B
=> n >= (V-B)/(A-B)
```
- 해당 수식에 맞게 값을 대입했을때 올림할 값이 있다면(double에서 양수라면 정답)
- 만약에 V-B에서 V==B인경우 0으로 정답이지만 0으로 처리되는 경우를 막기위해 0으로 할 수 있었으나 그냥 if문으로 예외 처리

[title]: https://www.acmicpc.net/problem/2869