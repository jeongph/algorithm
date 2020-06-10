 Languages: [한국어](README.md) | [English](README.en.md)

# [자연수 뒤집어 배열로 만들기][title]
출처: https://programmers.co.kr/learn/courses/30/lessons/12932?language=java

[title]: https://programmers.co.kr/learn/courses/30/lessons/12932?language=java

## :question: 문제
### :information_source: 함수 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

### :ballot_box_with_check: 제한 사항
- `n`은 10,000,000,000이하인 자연수입니다.

### :repeat: 입출력 예
| n     | return      |
| ----- | ----------- |
| 12345 | [5,4,3,2,1] |

## :exclamation: 정답
### 풀이 코드
(중요 부분만 첨부)
``` java
public int[] solution( long n )
	{
		int[] answer;

		int arr_len = 0;
		long temp_div_n = n;
		do  // 10으로 얼마나 나뉘냐가 배열의 크기
		{
			arr_len++;
			temp_div_n /= 10;
		} while( temp_div_n / 10 >= 1 );
		if( temp_div_n > 0 ) ++arr_len;
		answer = new int[arr_len];

		for( int i = 0; i < arr_len; i++ )
		{
			int temp_sub = (int)(n % 10);
			n /= 10;
			answer[i] = temp_sub;
		}

		return answer;
	}
```
### 설명
- `n`의 자릿수를 구해서 자릿수 위치의 배열 위치에 해당 값을 대입해서 출력 할 생각
- 일단 `do-while`문으로 해당 `n`의 자릿수를 구해서 `answer` 배열 초기화
- 어짜피 길이가 정해졌으니, `for`문 반복해서 돌면서 해당 값 `10`으로 나누면서 나머지(1의 자리 위치 수)를 배열 맨 앞에서부터 채워 넣음
- 해당 배열 리턴

### 논의
- [x] 멍청하게 `(int)(n % 10)`에 괄호 위치 잘못 넣어서 고생했는데, 연산자 우선순위 오랬만에 다시 볼 것

### 참고 자료
(If there is any reference)