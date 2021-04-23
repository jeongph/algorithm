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
``` kotlin
fun solution(n: Long): Long = n.toString()
        .toList()
        .sortedDescending()
        .let { list ->
            var temp = ""
            list.forEach { char ->
                temp += char
            }

            temp
        }.toLong()
```

### Commentary
- 코틀린으로 수정버전
- 일단 Long 자체를 각각의 자릿수로 제어할 방법이 바로 떠오르지 않아서 char[]로 사용
- 일단 컬렉션으로 변경하여 순서를 정렬하고, 정렬된 순서를 더해서 다시 Long으로 변환
- 답을 리턴, 코틀린답게 함수 일부 수

### Discussion
- [ ] toList랑 sortedDescending 원리 알아보면 재밌을 듯

### References
- (If there is any reference)