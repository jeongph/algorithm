- Elapsed time: ???

# 두 수 비교하기
출처: https://www.acmicpc.net/problem/1330

## :question: Problem
두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.

### Constraints
- `-10,000 ≤ A, B ≤ 10,000`

## Input/Output example
### Input
첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.

### Output
첫째 줄에 다음 세 가지 중 하나를 출력한다.

- `A`가 `B`보다 큰 경우에는 `>`를 출력한다.
- `A`가 `B`보다 작은 경우에는 `<`를 출력한다.
- `A`와 `B`가 같은 경우에는 `==`를 출력한다.
## :exclamation: Submit
### Solved code
(Important part only)
``` java
public static void main( String[] args )
{
    Scanner in = new Scanner( System.in );

    int a = in.nextInt();
    int b = in.nextInt();

    if( a > b ) System.out.println( ">" );
    else if( a < b ) System.out.println( "<" );
    else if( a == b ) System.out.println( "==" );
}
```

### Commentary
- 설명 필요 x

### Discussion
- [ ] x

### References
- (If there is any reference)