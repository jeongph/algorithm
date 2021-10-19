---
layout: default
title: 문자열 내림차순으로 배치하기
parent: Programmers
grand_parent: Problems
nav_order: 12917
---

- Elapsed time: 00:00:00
- Language: Kotlin

# 문자열 내림차순으로 배치하기

[출처](https://programmers.co.kr/learn/courses/30/lessons/12917?language=kotlin)

## 문제 설명

문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.

s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

## 제한 사항

- str은 길이 1 이상인 문자열입니다.

## 입출력 예

| s         | return    |
| --------- | --------- |
| "Zbcdefg" | "gfedcbZ" |

# 풀이

## Code

``` kotlin
class Solution {
    fun solution(s: String): String = s.toList()
        .sortedDescending()
        .let { list ->
            var temp = ""
            list.forEach {
                temp += it
            }

            temp
        }
}
```

## Commentary

- .. 코틀린 `sortedDescending` 자체가 워낙 문제에 딱맞는 함수라 바로 해결
- 문자열 자체를 리스트로 반환해서 정렬 후 다시 문자열로 변환하여 리턴

## Discussion

- [ ] 함수 없이 구현했어야 하나?

## References
- x