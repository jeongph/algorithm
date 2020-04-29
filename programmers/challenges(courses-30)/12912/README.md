# :bookmark_tabs: [두 정수 사이의 합][title]
출처: https://programmers.co.kr/learn/courses/30/lessons/12912

## :question: Problem
두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

## :white_check_mark: Submit
### Solved code
(Important part only)
``` java
public long solution( int a, int b )
{
    long answer = 0;

    if( a == b )
        answer = a;
    else if( a > b )
        answer = calcSum(b, a);
    else
        answer = calcSum(a, b);

    return answer;
}

public long calcSum(int a, int b )
{
    long temp = 0;

    while( a <= b )
    {
        temp += a++;
    }

    return temp;
}
```
### Commentary
- ... 설명이 필요한 문제인가..! 마이크로프로세스 구현 해보겠다고 함수로 나눠서 구현
- 시작값하고 끝값을 더해주는함수 calcSum에 넣어서 값을 모두더하고 리턴
- a/b 크기차이에 따라 함수 호출을 달리하고, 정답 리턴

### Discussion
- [ ] -

### References

[title]: https://programmers.co.kr/learn/courses/30/lessons/12912