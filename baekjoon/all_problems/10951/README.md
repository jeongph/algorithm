- Elapsed time: ???

# A+B - 4
출처: https://www.acmicpc.net/problem/10951

## :question: Problem
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

## Input/Output example
### Input
입력은 여러 개의 테스트 케이스로 이루어져 있다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

### Output
각 테스트 케이스마다 A+B를 출력한다.

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
		int A, B;

		do
		{
			A = in.nextInt();
			B = in.nextInt();

			System.out.println( A + B );
		} while( in.hasNext() );
	}
}

```

### Commentary
- 풀이 필요 x

### Discussion
- [ ] x

### References
- (If there is any reference)