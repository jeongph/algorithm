- Elapsed time: ???

# x만큼 간격이 있는 n개의 숫자
출처: https://programmers.co.kr/learn/courses/30/lessons/12954?language=java

## :question: Problem
함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

### Function description
- `x` : 정수 x
- `n` : 자연수 n
- __return__ : x씩 증가하는 숫자를 n개 지니는 리스트

### Constraints
- `x`는 -10000000 이상, 10,000,000 이하인 정수입니다.
- `n`은 1000 이하인 자연수입니다.

### Input/Output example
| x   | n   | answer       |
| --- | --- | ------------ |
| 2   | 5   | [2,4,6,8,10] |
| 4   | 3   | [4,8,12]     |
| -4  | 2   | [-4, -8]     |

## :exclamation: Submit
### Solved code
(Important part only)
``` kotlin
class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = mutableListOf<Long>()

        for (i in 1..n) {
            answer.add((x * i).toLong())
        }

        return answer.toLongArray()
    }
}
```

### Commentary
- 문제를 다시 보니까 1부터 `n`까지 `x`를 곱한 값의 배열 이라는 알고리즘이 가능
- 반복문을 사용해서 1부터 `n`까지 돌면서 `x`를 곱해 (편의를 위해) 리스트에 넣고 배열 형태로 반환

### Discussion
- [ ] 코틀린 특성상 for문이나 `var`를 사용하지 않고 더 간결하게 가능할 것 같은데 당장 생각나진 않음.

### References
- (If there is any reference)