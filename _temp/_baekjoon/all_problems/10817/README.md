- Elapsed time: ???

# 세 수
출처: https://www.acmicpc.net/problem/10817

## :question: Problem
세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 

## Input/Output example
### Input
첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)

### Output
두 번째로 큰 정수를 출력한다.

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
		int a, b, c, output = 0;

		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();

		// 이게 골때린게 두번째로 큰 정수가 딱 2번째에 위치하는 정수 말하는거임
		if( a > b )
		{
			if( c >= a ) output = a;
				// 아니라면 c도 a보다 작고, b도 a보다 작아
			else if( b >= c ) output = b;
			else output = c;
		}
		else if( a == b )
		{
			output = a;
		}
		else    // b > a
		{
			if( c >= b ) output = b;
				// 아니라면 c도 b보다 작고, a도 b보다 작아
			else if( a >= c ) output = a;
			else output = c;
		}
		System.out.println( output );
	}
}

```

### Commentary
- 풀이 필요 x

### Discussion
- [ ] x

### References
- (If there is any reference)