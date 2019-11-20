# [Java Stdin and Stdout I]

## Problem
In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format section below. To make the problem a little easier, a portion of the code is provided for you in the editor.

**Note**: We recommend completing Java Stdin and Stdout I before attempting this challenge.

## Task 
3줄의 숫자를 입력받고, 바로 stdout으로 출력하는 프로그램을 작성하라.

## Input Format
There are three lines of input:

1. The first line contains an integer.
2. The second line contains a double.
3. The third line contains a String.

## Output Format
There are three lines of output:

1.  On the first line, print String: followed by the unaltered String read from stdin.
2. On the second line, print Double: followed by the unaltered double read from stdin.
3. On the third line, print Int: followed by the unaltered integer read from stdin.

## Submit
<pre><code> # 중요 코드
        int i = scan.nextInt();
        scan.nextLine();
</code></pre>
- 연휴의 마지막날은 쉬운문제,, 스캐너를 연속으로 next입력 받을 땐 중간에 개행을 한번 읽어서 버퍼를 날려주는게 정신건강에 좋다.


[Java Stdin and Stdout I]: https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem