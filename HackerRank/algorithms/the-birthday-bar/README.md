# [Birthday Chocolate]

## Problem
Lily는 Ron의 생일파티에 공유하고 싶은 초콜렛바(..?)를 가지고 있다.
그건(아마 초콜렛 바) 각각 사각형의 정수가 써있는 모습으로 되어있다.
그녀는 이 초콜릿 정수를 사용해서 Ron의 생일 월/일 을 맞춰서 선물하고싶은가보다.
생일의 m월에서 m개의 초콜릿 조각을 가지고, n일에서 조각을 더했을 때 n이 나오도록..(왜 이짓을 하는거여)
그렇게 출력될 수 있는 가능성의 개수를 리턴해서 출력하면 된다.

## Function Description
It should return an integer denoting the number of ways Lily can divide the chocolate bar.
- s: an array of integers, the numbers on each of the squares of chocolate
- d: an integer, Ron's birth day
- m: an integer, Ron's birth month

## Input Format
The first line contains an integer ***n***, the number of squares in the chocolate bar.
The second line contains ***n*** space-separated integers ***s\[i\]***, the numbers on the chocolate squares where ***0 <= i < n***.
The third line contains two space-separated integers, ***d*** and ***m***, Ron's birth day and his birth month.

## Output Format
Print an integer denoting the total number of ways that Lily can portion her chocolate bar to share with Ron.

## Submit
<pre><code> # 중요 코드
static int birthday(List<Integer> s, int d, int m)
    {
        int re = 0;
        int count = 0;

        int temp_sum = 0;
        for( int i = 0; i < s.size(); i++ )
        {
            if( i > (s.size() - m) ) break;
            else{
                temp_sum = 0;
                for( int n = i; n < i+m; n++ )
                {
                    temp_sum += s.get(n);
                }
                if( temp_sum == d ) re++;
            }
        }
        return re;
    }
</code></pre>

- (우선.. 일단은 List로 준거보니까 미친듯이 많은 값이 있을지도 모르겠다.)라는 생각이 먼저들었고..
- 먼저 리스트의 크기(size 함수 사용)만큼 for문을 돌려서 맨 처음 값부터 맨 뒤 값까지 접근(그래야 더할 수 있음).
- 접근하면서 가장 먼저할 건 안에 들어있는 값을 구하는건데, 일단 초콜릿을 잘라서 쓰는거니까 연속으로밖에 못자름(예를들어, 배열 0번째와 2번째를 합해서 숫자를 만들수는 없다는 뜻.)
- 그러니까 앞에서부터 차례대로 m개수만큼씩 더해서 값이 d와 같으면 return 카운트를 하나씩 증가시켜주면 되는 간단한 문제.
- 단, 카운트를 하나씩 증가시키다가 분명 size의 뒷부분에서는 차례대로 더할 수가 없기 때문에 size에서 이미 더해진 뒤 자기 뒤로 숫자가 m(즉, 차례대로 더할 숫자가 뒤 m보다 작아서 모자르면) 끝났다고 반복문 종료.

[Birthday Chocolate]: https://www.hackerrank.com/challenges/the-birthday-bar/problem