- Elapsed time: ???

# 나머지
출처: https://www.acmicpc.net/problem/10430

## :question: Problem
(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?

(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?

세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.

## Input/Output example
### Input
첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)

### Output
첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.

## :exclamation: Submit
### Solved code
(Important part only)
``` java
public static void main( String[] args )
{
    Scanner in = new Scanner( System.in );

    int a, b, c;
    a = in.nextInt();
    b = in.nextInt();
    c = in.nextInt();

    System.out.println( (a + b) % c );
    System.out.println( (a % c + b % c) % c );
    System.out.println( (a * b) % c );
    System.out.println( (a % c * b % c) % c );
}
```

### Commentary
- 풀이 필요 x

### Discussion
- [ ] x

### References
- (If there is any reference)