# [Java Loops I]

## Problem
(심지어 문제도 없음) 이 챌린지에서 loop를 사용하면 간단히 수학을 할 수 있다.

## Function Description
\

## Input Format
A single integer, ***N***.

## Output Format
(구구단 출력;)

## Submit
<pre><code> # 중요 코드
public static void main(String[] args)
    {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for( int i = 1; i <= 10; i++ )
        {
            System.out.printf("%d x %d = %d\n", N, i, i*N);
        }

        scanner.close();
    }
</code></pre>
- 너무 간단한걸 풀어서 그냥 한문제 더풀었는데 더 간단한거..

[Java Loops I]: https://www.hackerrank.com/challenges/java-loops-i/problem?h_r=next-challenge&h_v=zen