---
layout: default
title: K번째수
parent: Programmers
nav_order: 42748
---

- Elapsed time: ???

# K번째수

[출처](https://programmers.co.kr/learn/courses/30/lessons/42748?language=kotlin)

## 문제 설명

배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면

1. array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
2. 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
3. 2에서 나온 배열의 3번째 숫자는 5입니다.

배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.

## 제한사항

- array의 길이는 1 이상 100 이하입니다.
- array의 각 원소는 1 이상 100 이하입니다.
- commands의 길이는 1 이상 50 이하입니다.
- commands의 각 원소는 길이가 3입니다.

## 입출력 예

| array                 | commands                          | return    |
| --------------------- | --------------------------------- | --------- |
| [1, 5, 2, 6, 3, 7, 4] | [[2, 5, 3], [4, 4, 1], [1, 7, 3]] | [5, 6, 3] |

## 입출력 예 설명

[1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째 숫자는 5입니다.

[1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다.

[1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3입니다.


# 풀이

## Code

``` kotlin
class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = mutableListOf<Int>()

        var temp = mutableListOf<Int>()
        commands.forEach { cmd -> // [[2, 5, 3], [4, 4, 1], [1, 7, 3]]
            answer.add(array.copyOfRange(cmd[0]-1, cmd[1]).sorted()[cmd[2]-1])
        }

        return answer.toIntArray()
    }
}
```

## Commentary

- 커맨드 배열을 `forEach`로 순회
- 각각 순회하면서 첫번째 위치와 두번째 위치 `i`, `j` 위치를 새 배열로 만듦 -> `copyOfRange` 사용
- 해당 배열을 정렬 -> `sorted()` 사용
- 정렬된 배열에서 `k` 위치를 `answer`에 대입
- 결과 리턴

## Discussion

- [ ] 코틀린 특성 이용해서 더 코드를 줄일 수 있을거같긴한데 일단 문제 형태를 유지

## References
- x