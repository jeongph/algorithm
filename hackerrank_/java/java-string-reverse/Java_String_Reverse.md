# [Java String Reverse]

## Problem
> A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)

Given a string ***A***, print Yes if it is a palindrome, print No otherwise.

## Function Description
\

## Input Format
\

## Output Format
\

## Submit
<pre><code> # 중요 코드
boolean ans = false;
        int reserve = len;
        if( len != 1 )
        {
            for( int i = 0; i < (( len % 2 == 0)? len/2 : (len-1)/2); i++ )
            {
                if( A.charAt(i) == A.charAt(--reserve) )
                {
                    ans = true;
                    continue;
                }
                else
                {
                    ans = false;
                    break;
                }
            }
        } else ans = true;

        if( ans ) System.out.println("Yes");
        else System.out.println("No");
</code></pre>
- 1이면 당연히 true, 그렇지 않은 경우에는 계산함.
- 홀수의경우 n-1을 2로 나눈 값만큼만 계산하면되고, 짝수의 경우 n/2의 경우만 보면 됨.(가운데 끼는 단어는 필요 없으니까)
- 더 간단하게 할 수 있을 것 같긴한데, 일단 간단하게 짜려고 0부터 1씩 증가하고, 길이-1에서 0으로 감소하는 놈들 2놈을 비교
- (계속 같아서 나갔을 때 true로 했으면 깔끔했을 것 같긴함) 다른놈이 나오면 No를 출력하기위해 flag값 false로 하고 out, 아닌경우 계속 탐색
- 결과 출력(이것도 한번에 할 껄)

[Java String Reverse]: https://www.hackerrank.com/challenges/java-string-reverse/problem