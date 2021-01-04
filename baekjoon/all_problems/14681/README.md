- Elapsed time: 3m

# Title_here
출처: https://www.acmicpc.net/problem/14681

## :question: Problem
흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다. 사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. "Quadrant n"은 "제n사분면"이라는 뜻이다.
![image](https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14681/1.png)
예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다. 점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.

점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.

## Input/Output example
### Input
첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)

### Output
점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.

## :exclamation: Submit
### Solved code
(Important part only)
``` java
	public static void main( String[] args ) throws IOException
	{
		Scanner in = new Scanner(System.in);

		int input[] = new int[2];
		int ans = 0;

		for(int i = 0; i < 2; i++)
		{
			input[i] = in.nextInt();
		}

		if( input[0] > 0 )
			ans = input[1] > 0 ? 1 : 4;
		else
			ans = input[1] > 0 ? 2 : 3;

		System.out.println(ans);
	}
```

### Commentary
- 험,, 빠르게 풀이하려고 쉬운문제를 생각도 쉽게해서 풀이,,
- 2개의 포인트 입력받아서 각각 양/음수일 때 자리 판단
- 출력

### Discussion
- [ ] x

### References
- (If there is any reference)