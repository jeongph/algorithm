---
layout: default
title: 두 정수 사이의 합
parent: Programmers
nav_order: 12912
---

- Elapsed time: 00:00:00
- Language: Kotlin

# 두 정수 사이의 합

[출처](https://programmers.co.kr/learn/courses/30/lessons/12912?language=kotlin)

## 문제 설명

두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.

예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

## 제한 조건

- a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
- a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
- a와 b의 대소관계는 정해져있지 않습니다.

## 입출력 예

| a   | b   | return |
| --- | --- | ------ |
| 3   | 5   | 12     |
| 3   | 3   | 3      |
| 5   | 3   | 12     |

# 풀이

## Code

``` kotlin
class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0

        for (cnt in max(a, b) downTo min(a, b)) {
            answer += cnt
        }
        
        return answer
    }
}
```

## Commentary

- ... 설명이 필요한 문제인가..! 마이크로프로세스 구현 해보겠다고 함수로 나눠서 구현
- 시작값하고 끝값을 더해주는함수 calcSum에 넣어서 값을 모두더하고 리턴
- a/b 크기차이에 따라 함수 호출을 달리하고, 정답 리턴

## Discussion

- [ ] x

## References
- x