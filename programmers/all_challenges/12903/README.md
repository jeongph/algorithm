---
layout: default
title: 가운데 글자 가져오기
parent: Programmers
nav_order: 12903
---

- Elapsed time: 00:00:00
- Language: Kotlin

# 가운데 글자 가져오기

[출처](https://programmers.co.kr/learn/courses/30/lessons/12903?language=kotlin)

## 문제 설명

단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

## 제한 조건

- s는 길이가 1 이상, 100이하인 스트링입니다.

## 입출력 예

| s     | return |
| ----- | ------ |
| abcde | c      |
| qwer  | we     |

# 풀이

## Code

``` kotlin
class Solution {
    fun solution(s: String): String = s.let {
        val count = it.count()

        if (count % 2 == 0) it.substring(count / 2 - 1, count / 2 + 1) // 짝
        else it.substring(count / 2, count / 2 + 1) // 홀
    }
}
```

### Commentary

- 코틀린으로 수정했더니 더 쉽게 해결
- 일단 리턴값을 주긴 하는데 `ans`로 다시 분할하긴 아깝기에 바로 함수처리해서 `let`으로 처리
- 리턴값 전에 짝수/홀수 구분해서 짝수면 -> 중간 2개, 홀수면 -> 중간에 1개로 리턴

### Discussion

- [ ] `Kotlin` 특징을 잘 이용하면 더 짧은 코드로도 가능할듯

### References
- x