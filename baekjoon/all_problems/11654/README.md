- Elapsed time: ???

# 아스키 코드
출처: https://www.acmicpc.net/problem/11654

## :question: Problem
알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

## Input/Output example
### Input
알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.

### Output
입력으로 주어진 글자의 아스키 코드 값을 출력한다.

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

		char n = in.nextLine().charAt( 0 );
		System.out.println( ( int ) n );
	}
}
```

### Commentary
- 풀이 필요 x

### Discussion
- [ ] x

### References
- (If there is any reference)