# :bookmark_tabs: [나누어 떨어지는 숫자 배열][title]
출처: https://programmers.co.kr/learn/courses/30/lessons/12910

## :question: Problem
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

## :white_check_mark: Submit
### Solved code
(Important part only)
``` java
import java.util.*;

class Solution {
	public int[] solution(int[] arr, int divisor) {
		ArrayList<Integer> answer = new ArrayList<Integer>(  );

		for(int i = 0; i < arr.length; i++ )
		{
			if( arr[i] % divisor == 0 ) answer.add(arr[i]);
		}

		if(answer.isEmpty()) answer.add(-1);
        Collections.sort(answer);

		int temp[] = new int[answer.size()];
		for(int i = 0; i < answer.size(); i++ )
		{
			temp[i] = answer.get( i );
		}
		
		return temp;
	}
}
```
### Commentary
- 다시봐도 문제 자체가 엄청 어려운 문제는 아님.
- 먼저 divisor로 나누어떨어지는 값이 몇갠지 모르니까 answer에 순차적으로 대입하기 위해 ArrayList를 사용한 것 같다(예전에 풀어서 기억을 더듬는 중..)
- array의 각 인덱스를 divisor로 나누어 answer에 add.
- 만약 비어있다면 answer에 `[0]`값을 -1로 주고, 아닌경우 Collections를 사용하여 정렬
- 답을 다시 temp에 옮겨담아서 array 형식으로 만든 뒤 리턴

### Discussion

### References
(If there is any reference)

[title]: https://programmers.co.kr/learn/courses/30/lessons/12910