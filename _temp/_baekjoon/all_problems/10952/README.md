- Elapsed time: ???

# A+B - 5
출처: https://www.acmicpc.net/problem/10952

## :question: Problem
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

## Input/Output example
### Input
입력은 여러 개의 테스트 케이스로 이루어져 있다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

입력의 마지막에는 0 두 개가 들어온다.

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

		while( true )
		{
			int A = in.nextInt();
			int B = in.nextInt();

			if( A == 0 && B == 0 ) break;
			else System.out.println( A + B );
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