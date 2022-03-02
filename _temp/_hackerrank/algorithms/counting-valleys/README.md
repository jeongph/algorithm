# [Counting Valleys]

## Problem
Gary는 등산객이다. 얘가 등산을 하면서 ***n*** 개의 걸음을 걷고, 얘가좀 특이해서 걷는거마다 세세한것들을 다 확인하면서 가는데 ***U*** 는 올라가는거(이걸 뭐라하는지 모르겠는데 오르막길?)이고, ***D*** 는 내리막길 이다. 얘가 등산을 할 때 해수면 높이 (해발고도)보다 고도가 낮은 부분을 "계곡"이라고 하는데, 우리는 Gary가 등산을 할 때 몇개의 계곡을 지나쳐왔는지 계산해야 한다.

## Submit
<pre><code> # 중요 코드
int countingValleys(int n, String s)
{
	int re = 0;
	boolean flag_d = false;

	int h = 0;
	for(int i = 0; i < n; i++ )
	{
		if( h < 0 ) flag_d = true;
		else flag_d = false;

		if( s.charAt(i) == 'U' ) h++;
		else if( s.charAt(i) == 'D' ) h--;

		if( flag_d && h == 0 ) re++;
	}
	return (re);
}
</code></pre>

- 일단 해발 고도를 알아야 하니까 h(high)를 선언하고 0으로 초기화(여기서 0보다 낮으면 해발고도보다 낮고, 높으면 높은거)
- 해발고도에서 U를 만나면 고도를 올리고, D를 만나면 하나씩 줄임.
- 그리고 해발고도에 다시 도달하면 1개의 계곡을 만났다고 re(return val)을 하나 증가
- 근데 0으로 돌아왔다는건 이게 위로 올라갔다가 내려온 경우가 있으니까 반드시 아래(음수)에서 지평선으로 왔을때만 계곡으로 인식(flag 사용)
- 해당 값을 리턴


[Counting Valleys]: https://www.hackerrank.com/challenges/counting-valleys/problem
