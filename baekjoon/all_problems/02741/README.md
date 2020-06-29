- Elapsed time: ???

# N 찍기
출처: https://www.acmicpc.net/problem/2741

## :question: Problem
자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

## Input/Output example
### Input
첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.

### Output
첫째 줄부터 N번째 줄 까지 차례대로 출력한다.

## :exclamation: Submit
### Solved code
(Important part only)
``` java
public static void main( String[] args )
{
    Scanner in = new Scanner( System.in );
    int N = in.nextInt();

    for( int i = 1; i <= N; i++ )
    {
        System.out.println( i );
    }
}
```

### Commentary
- 풀이 필요 x

### Discussion
- [ ] x

### References
- (If there is any reference)