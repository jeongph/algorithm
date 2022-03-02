- Elapsed time: ???

# 별 찍기 - 2
출처: https://www.acmicpc.net/problem/2439

## :question: Problem
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.

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
    for( int i = N; i > 0; i-- )    // 행
    {
        for( int j = 1; j <= N; j++ )  // 열
        {
            System.out.print( (j < i) ? " " : "*" );
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