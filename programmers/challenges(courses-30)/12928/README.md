# :bookmark_tabs: [약수의 합][title]
출처: https://programmers.co.kr/learn/courses/30/lessons/12928?language=java

## :question: Problem
정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

### :information_source: Function description
- n : 정수
- __return__ : n의 약수를 모두 더한 값

### :warning: Constraints
- n은 0 이상 3000이하인 정수입니다.

### :arrow_right: Input/Output example
| n   | return |
| --- | ------ |
| 12  | 28     |
| 5   | 6      |

## :white_check_mark: Submit
### Solved code
(Important part only)
``` java
public int solution( int n )
{
    int answer = 0;

    for(int i = 1; i <= n; i++ )
    {
        if( n % i == 0 ) answer += i;
    }
    return answer;
}
```
### Commentary
- (ㅋㅋ.. 이것도 한문제 풀었다고 치나..?!)
- 처음 생각난건 "최대공약수"가 아니어서 그냥 나눠지는거 다 더하자
- 그래서 `n`만큼 `for`문 반복해서 나눠지는 수(==약수)를 다 더한다.
- 리턴

### Discussion
- [x] 생각나는대로 풀긴 했는데 빠르게 푸는거보다 효율적인게 더 중요함
- [x] 근데 이게 효율을 따질만한 정도의 문제도 아닌것 같음
- [x] 순수 반복문만 3000까지 돌아갈테니 `n`값이 늘어나면 효율은 극악..

### References
(If there is any reference)

[title]: https://programmers.co.kr/learn/courses/30/lessons/12928?language=java