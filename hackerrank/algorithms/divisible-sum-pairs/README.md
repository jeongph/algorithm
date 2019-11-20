# [Divisible Sum Pairs]

## Problem
당신에겐 n개의 행으로 이루어진 배열 ar과 정수 k가 주어진다. 우리는 ar배열에서 랜덤의 i행과 j 행을 더했을 때 k로 나누어 나머지가 0인 숫자 조합을 찾아야 한다.

## Function Description
Complete the divisibleSumPairs function in the editor below. It should return the integer count of pairs meeting the criteria.

divisibleSumPairs has the following parameter(s):
- n: the integer length of array ***an***
- ar: an array of integers
- k: the integer to divide the pair sum by

## Input Format
The first line contains ***2*** space-separated integers, ***n*** and ***k***. 

## Output Format

## Submit
<pre><code> # 중요 코드
    {
        int temp = 0;
        for( int i = 0; i < n; i++ )
        {
            for(int j = 0; j < n; j++ )
            {
                if( i == j ) continue;
                if( (ar[i] + ar[j]) % k == 0 ) temp++;
            }
        }
        return temp/2;
    }
</code></pre>
- (생각보다 너무 간단한 문제라 특별한 풀이는 필요 없어보이긴 한다.)
-  일단 각각의 배열 행에 접근하여 ar의 i행으로 접근한다.
- 두개의 합을 구해서 k로 나누어 0이 나오면 temp값을 ++하면 되는데, 단 자기랑 겹치면 안되므로 j는 i와 같으면 다음행으로 간다.
- 합한 값은 i + j와 j + i가 같으므로 2로 나누어 리턴한다. 

[Divisible Sum Pairs]: https://www.hackerrank.com/challenges/divisible-sum-pairs/problem