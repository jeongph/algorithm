- Elapsed time: ???

# X보다 작은 수
출처: https://www.acmicpc.net/problem/10871

## :question: Problem
정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

## Input/Output example
### Input
첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)

둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.

### Output
X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.

## :exclamation: Submit
### Solved code
(Important part only)
``` java
import java.util.Scanner;

public class Main
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );

		int N = in.nextInt();
		int X = in.nextInt();

		for( int i = 0; i < N; i++ )
		{
			int temp = in.nextInt();
			if( temp < X ) System.out.print( String.format( "%d ", temp ) );
		}
	}
}

```

### Commentary
- 풀이 필요 x

### Discussion
- [ ] x

### References
- (If there is any reference)