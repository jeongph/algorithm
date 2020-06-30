- Elapsed time: ???

# 사칙연산
출처: https://www.acmicpc.net/problem/10869

## :question: Problem
두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 

## Input/Output example
### Input
두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)

### Output
첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.

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
		int a, b;

		a = in.nextInt();
		b = in.nextInt();

		System.out.println( a + b );
		System.out.println( a - b );
		System.out.println( a * b );
		System.out.println( a / b );
		System.out.println( a % b );
	}
}
```

### Commentary
- 풀이 필요 x

### Discussion
- [ ] x

### References
- (If there is any reference)