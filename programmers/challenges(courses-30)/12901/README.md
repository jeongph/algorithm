# :bookmark_tabs: [2016년][title]

## :question: Problem
2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 요일의 이름은 일요일부터 토요일까지 각각 `SUN,MON,TUE,WED,THU,FRI,SAT`입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.

### :information_source: Function description

### :warning: Constraints
- 2016년은 윤년입니다.
- 2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)

### :arrow_right: Input/Output format example
| a   | b   | result |
| --- | --- | ------ |
| 5   | 24  | TUE    |

## :white_check_mark: Submit
### Solved code
(Important part only)
``` java
import java.util.ArrayList;
import java.util.Arrays;

class Solution
{
	public static String week[] = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
	public static int month[] = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public String solution(int a, int b) {
		String answer = "";

		int c_day = 0;
		for(int i = 0; i < a; i++ )
		{
			c_day += month[i];
		}
		c_day += b;

		answer = week[(c_day % week.length)];

		return answer;
	}
}
```
### Commentary
- 처음 떠오른 생각은 "어짜피 한 주는 7일로 고정이니, 7로 나누어서 나머지에 해당하는 배열의 위치만 리턴해서 출력하면 되겠다.
- 이대로 구현하기 위해 일단 주/월 배열을 생성
- for문을 돌면서 a월 b일에 해당하는 일수를 합치는데. 단, a월은 아직 a월이 끝난것이 아니므로 a-1월까지 합쳐야 함.
- 이 과정에서 \[-1\]인덱스를 참조하는데 어짜피 1월은 0을 더해야 하니까 편의상 배열의 0번 인덱스는 0으로 만듦(*어짜피 고정값)
- 더해진 월에다가 일수를 마저 더하고 원래 떠오른 생각대로 7로 나누어서 해당 요일을 출력
- 단, 1월 1일이 금요일이라고 하니까 요일의 시작을 금->토-> 이 순서로 감 (편의상,,)
- 리턴

### Discussion
- [ ] 별 특이점은 없었는데, 풀면서도 궁금하긴 했는데 아예 주/월을 고정배열로 안하고 알고리즘화 할 수 있는지..?
- [ ] (스위치문 200줄로 푸신분들 열정 칭찬해..)

### References
(If there is any reference)

[title]: https://programmers.co.kr/learn/courses/30/lessons/12901