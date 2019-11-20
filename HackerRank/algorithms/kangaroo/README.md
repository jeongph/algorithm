# [Kangaroo]

## Problem
나는 다양한 동물과 함께 서커스쇼를 한다.
한번의 쇼에, 각 라인으로 점프해 나아가는 캥거루 2마리를 쓸 수 있다.(즉, 양수로 무한대까지)
- 첫번째 캥거로는 위치 ***x1***에서 ***v1*** 미터씩 점프한다.
- 두번째 캥거루는 위치 ***x2***에서 ***v2*** 미터씩 점프한다.
얘네 두마리를 같은 위치에서 동시에 만나게 한다면 "YES", 아니면 "NO"를 리턴.
> 예를 들어, 캥이1이 2의 위치에서 1씩 증가하고, 캥이2가 1의 위치에서 2씩 점프하면 3의 위치에서 동시에 만난다.

## Function Description
Complete the function kangaroo in the editor below. It should return YES if they reach the same position at the same time, or NO if they don't.
kangaroo has the following parameter(s):
- x1, v1: integers, starting position and jump distance for kangaroo 1
- x2, v2: integers, starting position and jump distance for kangaroo 2

## Input Format
스페이스바로 구분된 4개의 정수가 주어지고, 순서대로 ***x1, v1, x2, v2***다.

## Output Format
만나면 YES, 아니면 NO

## Submit
<pre><code> # 중요 코드
    static String kangaroo(int x1, int v1, int x2, int v2)
    {
        int len = 0;
        int pre_len = 0;
        int n = 1;
        while( true )
        {
            if( x1 != x2 && v1 == v2 ) return "NO";
            pre_len = ( x1 + v1 * (n - 1) ) - ( x2 + v2 * (n - 1) );
            len = ( x1 + v1 * n ) - ( x2 + v2 * n );

            if( pre_len < 0 && len < pre_len ) return "NO";
            else if( pre_len > 0 && len > pre_len ) return "NO";

            if( pre_len == 0 ) return "YES";

            n++;
        }
    }
</code></pre>
- (1분차이 아쉽군..) 캥거루 녀석들을 우습게 봤는데 생각보다 쉬운문제였다.
- 일단 한녀석을 x1+v1\*n 즉 초기값 + n씩 증가하도록 유도, 나머지 녀석도 마찬가지로 계산 x2+v2\*n
- 이렇게 값이 무한대로 가정하면, 0을 찾는건 쉽지만 언제까지 달려나가야 하는지 모르므로 pre값인 이전값과 비교하기로 한다.
- x1 - x2과 v1\*n - v2\*n을 계산해서 더한 값 즉 (x1 - x2) + (v1 - v2)n이 0으로 수렴해야 만날 수 있는거고 미친듯이 양수로뛰거나 음수로 뛰면 절때 못만남.
- 따라서 바로 이전값이 음수인데 음수로계속가면 NO, 이전값이 양수인데 계속 커지면 NO
- n을 하나씩 증가시키면서 0으로 수렴하면 YES 반환;

[Kangaroo]: https://www.hackerrank.com/challenges/kangaroo/problem