- Elapsed time: 10m

# 두 개 뽑아서 더하기
출처: https://programmers.co.kr/learn/courses/30/lessons/68644?language=java

## :question: Problem
정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

### Function description
x

### Constraints
- numbers의 길이는 2 이상 100 이하입니다.
  - numbers의 모든 수는 0 이상 100 이하입니다.

### Input/Output example
| numbers     | result        |
| ----------- | ------------- |
| [2,1,3,4,1] | [2,3,4,5,6,7] |
| [5,0,2,7]   | [2,5,7,9,12]  |

## :exclamation: Submit
### Solved code
(Important part only)
``` java
import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer;
        ArrayList<Integer> ar = new ArrayList<Integer>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (!ar.contains(sum)) ar.add(sum);
            }
        }

        Collections.sort(ar);
        answer = new int[ar.size()];
        for (int i = 0; i < ar.size(); i++) {
            answer[i] = ar.get(i);
        }

        return answer;
    }
}
```

### Commentary
- 되게 원시적으로 풀긴 했지만,,
- 아예 처음부터 비교하면서 넣는 방법도 있긴 하겠지만, 이게 젤먼저 떠올라서 이 코드로 작성
- 일단 맨앞에 원소부터 하나씩 돌고 뒷자리를 더하면서 `ArrayList`에 넣음
- `ar`에 넣을 때 이미 들어간 중복수는 제외하고 `add`
- 완벽하게 들어간 `ArrayList`를 정렬하고, 정렬된걸 다시 `answer` 배열로 반환
- 리턴

### Discussion
- [ ] 뭔가 함수를 잘만들면 리펙토링 가능할 듯
- [ ] kotlin으로 풀었으면 더 간단했을것 같긴 하다

### References
- (If there is any reference)