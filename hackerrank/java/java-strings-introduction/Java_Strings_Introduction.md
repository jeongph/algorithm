# [Java Strings Introduction]

## Problem
This exercise is to test your understanding of Java Strings. A sample String declaration:
>String myString = "Hello World!"

The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

## Function Description
\

## Input Format
The first line contains a string ***A***. The second line contains another string ***B***. The strings are comprised of only lowercase English letters.

## Output Format
There are three lines of output: 
For the first line, sum the lengths of ***A*** and ***B***. 
For the second line, write Yes if ***A*** is lexicographically greater than ***B*** otherwise print No instead. 
For the third line, capitalize the first letter in both ***A*** and ***B*** and print them on a single line, separated by a space.

## Submit
<pre><code> # 중요 코드
        System.out.println( A.length() + B.length() );
        System.out.println( (A.charAt(0) <= B.charAt(0) ) ? "No":"Yes" );
        System.out.println( A.substring(0, 1).toUpperCase() + A.substring(1) +" "
                + B.substring(0, 1).toUpperCase() + B.substring(1) );
</code></pre>
- 설명이.. 필요하니?!

[Java Strings Introduction]: https://www.hackerrank.com/challenges/java-strings-introduction/problem