# [Breaking the Records]

## Problem
(너무 쉬운 문제가 걸려서 문제 자체도 쉽게 써봄) Maria는 농구를 열심히해서 프로가 되고싶다.
얘는 근데 실력을 증진시키기 위해 서로 시즌을 기록화 한다.
각 시즌의 스코어로 된 배열이 주어지며, 해당 시즌에서 점수가 오르고 내려가는 것을 도출

## Function Description
Maria가 기록을 깨뜨린 횟수를 리턴해야 한다.
- **scores**: an array of integers

## Input Format
The first line contains an integer ***n***, the number of games. 

## Output Format
Print two space-seperated integers describing the respective numbers of times her best (highest) score increased and her worst (lowest) score decreased.

## Submit
<pre><code> # 중요 코드
    static int[] breakingRecords(int[] scores)
    {
        int max = scores[0];
        int min = scores[0];
        int[] ret = new int[2];

        int temp = 0;
        for( int i = 1; i < scores.length; i++ )
        {
            temp = scores[i];
            if( scores[i] > max )
            {
                max = scores[i];
                ret[0]++;
            }
            if( scores[i] < min )
            {
                min = scores[i];
                ret[1]++;
            }
        }
        return ret;
    }
</code></pre>
- 그냥 반환된 배열에서 최대값에서 더 증가하는 값이 발생하면 최대기록이 올라간 것 이니깐 최대기록치 return[0]을 1 증가.
- 동일하게 배열의 값을 꺼내면서 더 감소하는 값이 발생하면 최소기록이 내려갔으니깐 최소 기록치 return[1]을 더 증가.
- 그냥 리턴(오랬만에 문제가 너무 쉬웠다.)

[Breaking the Records]: https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem