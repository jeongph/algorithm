- Elapsed time: ???

# 별 찍기 - 1
출처: https://www.acmicpc.net/problem/2438

## :question: Problem
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

## Input/Output example
### Input
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

### Output
첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

## :exclamation: Submit
### Solved code
(Important part only)
``` java
public static void main( String[] args )
{
    Scanner in = new Scanner( System.in );

    int N = in.nextInt();
    for( int i = 0; i < N; i++ )    // 행
    {
        for( int j = 0; j <= i; j++ )  // 열
        {
            System.out.print( "*" );
        }
        System.out.println();
    }
}
```

### Commentary
- 풀이 필요 x

### Discussion
- [ ] x

### References
- (If there is any reference)