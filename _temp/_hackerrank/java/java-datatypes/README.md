# [Java Datatypes]

## Problem
Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):
- A byte is an 8-bit signed integer.
- A short is a 16-bit signed integer.
- An int is a 32-bit signed integer.
- A long is a 64-bit signed integer.
Given an input integer, you must determine which primitive data types are capable of properly storing that input.

To get you started, a portion of the solution is provided for you in the editor.

**Reference:** (https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)

## Function Description
\

## Input Format
The first line contains an integer, ***T***, denoting the number of test cases. 
Each test case, ***T***, is comprised of a single line with an integer, ***n***, which can be arbitrarily large or small.

## Output Format
\

## Submit
<pre><code> # 중요 코드
                if( x >= -128 && x <= 127)System.out.println("* byte");
                if( x >= -32768 && x <= 32767 ) System.out.println("* short");
                if( x >= -2147483648 && x <= 2147483647 ) System.out.println("* int");
                if( x >= -Math.pow(2, 63) && x <= Math.pow(2, 63)-1 ) System.out.println("* long");
</code></pre>
- 각 범위에서 출력.. 어려운거 없음

[Java Datatypes]: https://www.hackerrank.com/challenges/java-datatypes/problem?isFullScreen=false