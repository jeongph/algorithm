---
layout: default
title: 정수 내림차순으로 배치하기
parent: Programmers
grand_parent: Problems
nav_order: 12933
---

- Elapsed time: 00:20:00
- Language: Kotlin

# 정수 내림차순으로 배치하기

[출처](https://programmers.co.kr/learn/courses/30/lessons/12933?language=kotlin)

## 문제 설명

함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

## 제한 사항

- `n`은 1이상 8000000000 이하인 자연수입니다.

## 입출력 예

| n      | return |
| ------ | ------ |
| 118372 | 873211 |

# 풀이

## Code

``` kotlin
class Solution {
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
}
```

## Commentary

- 일단 Long 자체를 각각의 자릿수로 제어할 방법이 바로 떠오르지 않아서 char[]로 사용
- 일단 컬렉션으로 변경하여 순서를 정렬하고, 정렬된 순서를 더해서 다시 Long으로 변환
- 답을 리턴, 코틀린답게 함수 일부 수

## Discussion

- [ ] toList랑 sortedDescending 원리 알아보면 재밌을 듯

## References

- x