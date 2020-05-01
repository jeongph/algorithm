# :bookmark_tabs: [서울에서 김서방 찾기][title]
출처: https://programmers.co.kr/learn/courses/30/lessons/12919

## :question: Problem
String형 배열 seoul의 element중 Kim의 위치 x를 찾아, 김서방은 x에 있다는 String을 반환하는 함수, solution을 완성하세요. seoul에 Kim은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

### :information_source: Function description
- seoul : 입력 배열
- __return__ : 김서방의 위치

### :warning: Constraints
- seoul은 길이 1 이상, 1000 이하인 배열입니다.
- seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
- `Kim`은 반드시 seoul 안에 포함되어 있습니다.

### :arrow_right: Input format example

### :arrow_left: Output format example
김서방은 1에 있다

## :white_check_mark: Submit
### Solved code
(Important part only)
``` java
	public String solution( String[] seoul )
	{
		String answer = "";

		for(int i = 0; i < seoul.length; i++ )
		{
			if( seoul[i].equalsIgnoreCase( KIM ) )
				answer = String.format( "김서방은 %d에 있다", i );
			else continue;
		}

		return answer;
	}
```
### Commentary
- 험,, 뭐라 말할게 없는 갑자기 너무쉬운 문제가 걸림
- 배열도 정해져있고, kim은 반드시 들어간다니까 그냥 배열 길이만큼 돌면서 kim이 있나 확인
- 있을 때의 값을 answer에 넣고 리턴

### Discussion
- x

### References
(If there is any reference)

[title]: https://programmers.co.kr/learn/courses/30/lessons/12919