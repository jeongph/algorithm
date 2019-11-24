# :bookmark_tabs: [모의고사][title]

## :question: Problem(문제)
수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
- 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5 ...
- 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5 ...
- 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 ...

### :information_source: Function Description(매개변수 속성)
- answers : 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열
- __return__ : 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아

### :warning: Constraints(제약 조건)
- 시험은 최대 10,000 문제로 구성되어있습니다.
- 문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
- 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.

### :arrow_right: Input Format

### :arrow_left: Output Format

## :white_check_mark: Submit
### 중요 코드
``` java
	public int[] solution( int[] answers )
	{
		int[] answer = { 0, 0, 0 };
		int ans[][] = { { 1, 2, 3, 4, 5 }, 
            { 2, 1, 2, 3, 2, 4, 2, 5 }, 
            { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };
		int pointer[] = { 0, 0, 0 };

		int c_answers = answers.length;
		int c_ans = pointer.length; // 수포자 3명
		for( int i = 0; i < c_answers; i++ ) // 일단 모든 문제를 돌아
		{
			for( int k = 0; k < c_ans; k++ ) // 각각의 문제를 수포자 배열 3개와 비교해야함
			{
				if( answers[i] == ans[k][pointer[k]] ) answer[k]++;
				pointer[k] = movePointer( pointer[k], ans[k].length );
			}
		}

		return calcRank( answer );
	}
```
### 풀이

[title]: https://programmers.co.kr/learn/courses/30/lessons/42840