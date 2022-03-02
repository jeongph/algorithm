- Elapsed time: ???

# 음계
출처: https://www.acmicpc.net/problem/2920

## :question: Problem
다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. c는 1로, d는 2로, ..., C를 8로 바꾼다.

1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.

연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.

## Input/Output example
### Input
첫째 줄에 8개 숫자가 주어진다. 이 숫자는 문제 설명에서 설명한 음이며, 1부터 8까지 숫자가 한 번씩 등장한다.

### Output
첫째 줄에 ascending, descending, mixed 중 하나를 출력한다.

## :exclamation: Submit
### Solved code
(Important part only)
``` java
static String method( int arr[], int N )
{
    final String[] ans = { "ERR", "ascending", "descending", "mixed" };

    int reverse_n = N;
    int cnt_ans = 0;
    if( arr[0] == 1 ) cnt_ans = 1;
    else if( arr[0] == 8 ) cnt_ans = 2;

    for( int i = 0; i < N; i++ )
    {
        if( (arr[i] == (i + 1)) && (cnt_ans == 1) ) cnt_ans = 1;
        else if( (arr[i] == reverse_n--) && (cnt_ans == 2) ) cnt_ans = 2;
        else cnt_ans = 3;
    }

    return ans[cnt_ans];
}
```

### Commentary
- 일단 배열에 음계를 저장
- 앞에서부터 읽으면서 순차면 1 역차면 2 아닌경우 3을 반환

### Discussion
- [ ] x

### References
- (If there is any reference)