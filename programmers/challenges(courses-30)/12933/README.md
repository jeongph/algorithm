- Elapsed time: 20m

# 정수 내림차순으로 배치하기
출처: https://programmers.co.kr/learn/courses/30/lessons/12933?language=java

## :question: Problem
함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

### Function description
x

### Constraints
- `n`은 1이상 8000000000 이하인 자연수입니다.

### Input/Output example
| n      | return |
| ------ | ------ |
| 118372 | 873211 |

## :exclamation: Submit
### Solved code
(Important part only)
``` java
import java.util.*;

class Solution {
    public long solution(long n) { // 118372 -> 873211
        long answer = 0;
        int counter = 0;
        ArrayList<Long> al = new ArrayList<Long>();

        while (n >= 1) {
            al.add(n % 10);
            ++counter;
            n /= 10;
        }

        Collections.sort(al);
/*        for(long temp: al)
            System.out.println(temp);*/

        for (int i = 0; i < al.size(); i++) {
            answer += (long) al.get(i) * Math.pow(10, i);
        }

        return answer;
    }
}
```

### Commentary
- 대략적인 생각 떠오른건 몇자리인지 구하고 배열에 저장했다가 순서대로 꺼내면서 10의 배수로 곱하자
- 일단 `while`문 돌아서 `n`의 자릿수를 구함, 구하면서 자릿수 하나하나를 ArrayList에 저장(arr보다 효율적일까봐)
- 정렬을 구하란건진 모르겠으나 일단 `Collections`의 함수 이용해서 정렬
- 정렬된걸 순서대로 꺼내면서 `10^i` 만큼 곱하면서 만들어야 했던 수로 만들어서 더함
- 리턴

### Discussion
- [ ] 정렬이 껴있는건 구하란거야 가져다 쓰란거야,, 양심에 좀 찔리긴하지만 이게 효율이 좋음.

### References
- (If there is any reference)