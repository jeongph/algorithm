- Elapsed time: ???

# 평균은 넘겠지
출처: https://www.acmicpc.net/problem/4344

## :question: Problem
대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.

## Input/Output example
### Input
첫째 줄에는 테스트 케이스의 개수 C가 주어진다.

둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

### Output
각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.

## :exclamation: Submit
### Solved code
(Important part only)
``` java
static double calc_avg( int arr[] )
{
    int len = arr.length;

    int sum = 0;
    double avg = 0;
    for( int i = 0; i < len; i++ )
    {
        sum += arr[i];
    }

    avg = sum / len;
    return avg;
}

static String print_winner_pst( int arr[], double avg )
{
    int len = arr.length;
    double cnt = 0;
    double pst = 0;

    for( int i = 0; i < len; i++ )
    {
        if( arr[i] > avg ) cnt++;
    }

    pst = ( double ) (cnt / len) * 100;
    return String.format( "%.3f%%", pst );
}
```

### Commentary
- 풀이 필요 x

### Discussion
- [ ] x

### References
- (If there is any reference)