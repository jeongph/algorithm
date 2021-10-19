---
layout: default
title: 두 개 뽑아서 더하기
parent: Programmers
grand_parent: Problems
nav_order: 68644
---

- Elapsed time: 00:10:00
- Language: Kotlin

# 두 개 뽑아서 더하기

[출처](https://programmers.co.kr/learn/courses/30/lessons/68644?language=kotlin)

## 문제 설명

정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

## 제한사항

- numbers의 길이는 2 이상 100 이하입니다.
  - numbers의 모든 수는 0 이상 100 이하입니다.

## 입출력 예

| numbers     | result        |
| ----------- | ------------- |
| [2,1,3,4,1] | [2,3,4,5,6,7] |
| [5,0,2,7]   | [2,5,7,9,12]  |

## 입출력 예 설명

입출력 예 #1

- 2 = 1 + 1 입니다. (1이 numbers에 두 개 있습니다.)
- 3 = 2 + 1 입니다.
- 4 = 1 + 3 입니다.
- 5 = 1 + 4 = 2 + 3 입니다.
- 6 = 2 + 4 입니다.
- 7 = 3 + 4 입니다.
- 따라서 `[2,3,4,5,6,7]` 을 return 해야 합니다.

입출력 예 #2

- 2 = 0 + 2 입니다.
- 5 = 5 + 0 입니다.
- 7 = 0 + 7 = 5 + 2 입니다.
- 9 = 2 + 7 입니다.
- 12 = 5 + 7 입니다.
- 따라서 `[2,5,7,9,12]` 를 return 해야 합니다.

# 풀이

## Code

``` kotlin
class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = intArrayOf()

        var temp = mutableListOf<Int>()
        numbers.forEachIndexed { index, x ->
            numbers.forEachIndexed { index2, y ->
                if (index != index2) {
                    temp.add(x + y)
                }

            }
        }
        answer = temp.distinct().toIntArray()
        answer.sort()

        return answer
    }
}
```

## Commentary

- 코틀린의 `forEachIndexed` 함수를 사용해서 간단히 배열의 모든 개체에 접근 가능
- 바로 떠오른 아이디어론 "모든 개체를 한번씩 돌아서 더한다"로 접근
- 일단 더하기의 주체가 되는 `x`와, 그 이외의 배열 개체인 `y`로 구분
- 조건문으로 `index != index2` (내 위치가 아닌 것들)만 다 더함
- 문제에서 중복을 허락하지 않으므로, `distinct`처리 후 리턴

## Discussion

- [ ] 이중 반복문은 간단하지만 많은 시간이 필요하기에 다른 해결책으로 접근하는게 시간복잡도에서 우위를 가짐
- [ ] 코틀린의 특성을 더 이용하면 코드를 더 간단히 리펙토링 가능

## References
- x