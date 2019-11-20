# [Java Stdin and Stdout I]

## Problem
대부분의(most) 해커랭크 문제들은 stdin(스탠다드 인풋) 을 읽어와서 stdout(스탠다드 아웃풋)을 발생시키길 요구한다.
stdin에서 입력을 받는 인기있는 한가지는 `Scanner class`를 이용하여 `System.in.`으로 입력 스트림을 받는것이다.

## Task 
3줄의 숫자를 입력받고, 바로 stdout으로 출력하는 프로그램을 작성하라.

## Input Format
There are ***3*** lines of input, and each line contains a single integer.

## Output Format
\

## Submit
<pre><code> # 중요 코드
        Scanner scan = new Scanner(System.in);
        for( int i = 0; i < 3; i++)
        {
            int a = scan.nextInt();
            System.out.println(a);
        }
        scan.close();
</code></pre>
- 뭔가 찝찝하군.. 이런문제일리가 없는데

[Java Stdin and Stdout I]: https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem