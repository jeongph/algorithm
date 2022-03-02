- Elapsed time: ???

# 더하기 사이클
출처: https://www.acmicpc.net/problem/1110

## :question: Problem
0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.

26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.

위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.

N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.

## Input/Output example
### Input
첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.

### Output
첫째 줄에 N의 사이클 길이를 출력한다.

## :exclamation: Submit
### Solved code
(Important part only)
``` java
public class Main
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		boolean flag = false;

		int N = in.nextInt();
		int firstN = N;
		int cnt = 0;
		while( !flag )
		{
			cnt++;
			int _10 = N / 10;
			int _1 = N % 10;
			int temp_1 = _1 * 10;

			N = ((_10 + _1) % 10 + temp_1);
			if( N == firstN ) flag = true;
		}
		System.out.println( cnt );
	}
}
```

### Commentary
- `N` 입력 받아서, 10으로 나눈것에 10의 자리, 나머지를 1의 자리로
- 1의 자리를 임시 변수에 담아서 기존의 10의 자리와 1의 자리를 더한것에 더하여 새로운 N을 만듦
- 사이클을 반복하여 같은수가 나올 때 까지(`flag`값을 보면서) 반복
- 해당값이 끝나면 리턴

### Discussion
- [ ] x

### References
- (If there is any reference)