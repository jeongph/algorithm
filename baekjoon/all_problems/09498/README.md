- Elapsed time: ???

# 시험 성적
출처: https://www.acmicpc.net/problem/9498

## :question: Problem
시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

## Input/Output example
### Input
첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

### Output
시험 성적을 출력한다.

## :exclamation: Submit
### Solved code
(Important part only)
``` java
public static void main( String[] args )
{
    Scanner in = new Scanner( System.in );

    int a = in.nextInt();
    char out = '0';

    if( a >= 90 && a <= 100 )
        out = 'A';
    else if( a >= 80 && a < 90 )
        out = 'B';
    else if( a >= 70 && a < 80 )
        out = 'C';
    else if( a >= 60 && a < 70 )
        out = 'D';
    else out = 'F';

    System.out.println( out );
}
```

### Commentary
- (뭔가 기가막히게 풀 수 있.. 나?)
- 풀이 필요 x

### Discussion
- [ ] x

### References
- (If there is any reference)