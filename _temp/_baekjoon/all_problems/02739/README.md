- Elapsed time: ???

# 구구단
출처: https://www.acmicpc.net/problem/2739

## :question: Problem
N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.

## Input/Output example
### Input
첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.

### Output
출력형식과 같게 `N*1`부터 `N*9`까지 출력한다.

## :exclamation: Submit
### Solved code
(Important part only)
``` java
public static void main( String[] args )
{
    Scanner in = new Scanner( System.in );
    int N;

    N = in.nextInt();

    for( int i = 1; i <= 9; i++ )
    {
        System.out.println( String.format( "%d * %d = %d", N, i, N * i ) );
    }
}
```

### Commentary
- 풀이 필요 x

### Discussion
- [ ] x

### References
- (If there is any reference)