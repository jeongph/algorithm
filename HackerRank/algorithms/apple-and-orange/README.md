# [Apple and Orange]

## Problem
Sam네 집에는 사과나무랑 오렌지 나무가 있다. 각각 사과나무는 집의 왼쪽에, 오렌지나무는 집의 오른쪽에 있다. 이 사과나무랑 오렌지나무는 풍족해서(?) 과일들이 꿀마냥 떨어지는데, 나무를 기준으로 각각의 과일이 나무 왼쪽이면 음수(-), 오른쪽이면 양수(+)으로 배열에 들어가있다. 여기서 집에 떨어지는 사과와 오렌지의 갯수를 각각 구하면됨. (여기서 ***m,n*** 은 각각 떨어진 사과와 오렌지 개수)

## Function Description
- ***s*** Sam 집의 왼쪽 위치(직선위의 좌표값)
- ***t*** Sam 집의 오른쪽 위치(직선위의 좌표값)
- ***a*** 사과나무의 위치(직선위의 좌표값)
- ***b*** 오렌지나무의 위치(직선위의 좌표값)
- ***apples*** 떨어진 사과들 배열
- ***oranges*** 떨어진 오렌지들 배열

## Submit
<pre><code> # 중요 코드
static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges)
{
	int m = apples.length;
	int n = oranges.length;
	int total = m + n;

	int in_a = 0;
	int in_o = 0;

	int p = 0;
	boolean isApple = true;
	for( int i = 0; i < total; i++)
	{
		if( isApple && (i == m) )
		{
			p = 0;
			isApple = false;
		}

		if( isApple && ((a + apples[p]) >= s) && ((a + apples[p]) <= t) ) in_a++;
		if( !isApple && ((b + oranges[p]) <= t) && ((b + oranges[p]) >= s) ) in_o++;

		p++;
	}
	System.out.printf( "%d\n%d", in_a, in_o );
}
</code></pre>
- 두개의 반복문으로 구하기 귀찮아서 일단 사과와 오렌지의 갯수를 합쳐서 반복문 1개로 해결
- 단, 배열에 접근해야 하므로 포인터 한개와 플래그를 사용하여 사과나무 갯수를 넘어가면 포인터를 0으로 다시 초기화.
- 사과가 떨어진 거리를 사과나무에서 계산해서 집의 범위에 들어가면 사과갯수 증가.
- 동일하게 오렌지는 반대로 계산하여 갯수 증가.
- 출력

[Apple and Orange]: https://www.hackerrank.com/challenges/apple-and-orange/problem
