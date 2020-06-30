- Elapsed time: ???

# 합
출처: https://www.acmicpc.net/problem/8393

## :question: Problem
n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

## Input/Output example
### Input
첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

### Output
1부터 n까지 합을 출력한다.

## :exclamation: Submit
### Solved code
(Important part only)
``` java
import java.util.*;

public class Main
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		int total = 0;
		int n = in.nextInt();

		for( int i = 0; i <= n; i++ )
		{
			total += i;
		}
		System.out.println( total );
	}
}
```

### Commentary
- 풀이 필요 x

### Discussion
- [ ] x

### References
- (If there is any reference)