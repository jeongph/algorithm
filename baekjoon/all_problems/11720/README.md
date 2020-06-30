- Elapsed time: ???

# 숫자의 합
출처: https://www.acmicpc.net/problem/11720

## :question: Problem
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

## Input/Output example
### Input
첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

### Output
입력으로 주어진 숫자 N개의 합을 출력한다.

## :exclamation: Submit
### Solved code
(Important part only)
``` java
import java.util.*;

class Main
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );

		int N = in.nextInt();
		String str = in.next();
		int sum = 0;

		for( int i = 0; i < N; i++ )
		{
			sum += ( int ) (str.charAt( i ) - '0');
		}

		System.out.println( sum );
	}
}
```

### Commentary
- 풀이 필요 x

### Discussion
- [ ] x

### References
- (If there is any reference)