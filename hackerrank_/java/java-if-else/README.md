# [Java If-Else]

## Problem
In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow:


## Function Description
\

## Input Format
A single line containing a positive integer, ***n***.

## Output Format
Print Weird if the number is weird; `otherwise`, print `Not Weird`.


## Submit
<pre><code> # 중요 코드
boolean flag = true;
        if( N % 2 == 1 )
        {
            System.out.println("Weird");
            flag = false;
        }

        if(flag)
        {

            if( N >= 2 && N <= 5 )
            {
                System.out.println("Not Weird");
            }
            else if( N >= 6 && N <= 20 )
            {
                System.out.println("Weird");
            }
            else if( N >= 20 )
            {
                System.out.println("Not Weird");
            }
        }
</code></pre>

[Java If-Else]: https://www.hackerrank.com/challenges/java-if-else/problem