# :bookmark_tabs: [소수 찾기][title]
출처: https://programmers.co.kr/learn/courses/30/lessons/12921?language=java

## :question: Problem
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)
### :information_source: Function description
- n : 정수 n
- __return__ : `1`부터 `n`까지의 소수 개수

### :warning: Constraints
- n은 2이상 1000000이하의 자연수입니다.

### :arrow_right: Input/Output example

## :white_check_mark: Submit
### Solved code
(Important part only)
``` java
public int solution( int n )
{
    int answer = 0;

    for(int i = 2; i <= n; i++ )
    {
        boolean isPrime = true;

        for(int j = 2; j <= Math.sqrt(i); j++ )
        {
            if( i % j == 0 )
            {
                isPrime = false;
                break;
            }
        }

        if( isPrime ) ++answer;
    }
    return answer;
}
```
### Commentary
- 처음에는 효율성같은게 있는지 모르고 `1차 for문`에서 `1`에서 `n`까지 반복
- `2차 for문`에서 `2`에서 `i`까지 반복해서 본인 이외에 나누어지는 숫자가 있다면 소수가 아니라 하고, 반복문을 빠져나가게 풀었는데 효율성에서 실패
- 이제 "어짜피 짝수는 아니니까 제외하자" 하고 뺐는데도 효율성은 실패
- 이쯤되면 소수의 정의 자체를 알아야겠다고 생각하고 `References`에 첨부된 "소수" 개념을 통해서 해결
- "어떤 자연수 `n`이 소수임을 판정하기 위해선 `sqrt(n)`까지의 수 중 `1`을 제외하고 그 자연수의 약수가 있는 지 확인하면 된다." 란다..
- 그래서 쉽게 해결 + 리턴

### Discussion
- [ ] `현재까지 알려진 가장 간단한 방법으로 에라토스테네스의 체가 있다. 방법은 다음과 같다.`라고 하니까 이걸로 풀어봤어도 괜찮을 것

### References
- [소수 (수론)](https://ko.wikipedia.org/wiki/%EC%86%8C%EC%88%98_(%EC%88%98%EB%A1%A0))

[title]: https://programmers.co.kr/learn/courses/30/lessons/12921?language=java