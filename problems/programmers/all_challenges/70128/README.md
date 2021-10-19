---
layout: default
title: 내적
parent: Programmers
grand_parent: Problems
nav_order: 70128
---

- Elapsed time: 00:05:00
- Language: Kotlin

<!-- 문제 -->
# 내적

[출처](https://programmers.co.kr/learn/courses/30/lessons/70128?language=kotlin)

## 문제 설명

길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.

이때, a와 b의 내적은 `a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1]` 입니다. (n은 a, b의 길이)

## 제한 사항

- a, b의 길이는 1 이상 1,000 이하입니다.
- a, b의 모든 수는 -1,000 이상 1,000 이하입니다.

## 입출력 예

| a         | b           | result |
| --------- | ----------- | ------ |
| [1,2,3,4] | [-3,-1,0,2] | 3      |
| [-1,0,1]  | [1,0,-1]    | -2     |

## 입출력 예 설명

입출력 예 #1

- a와 b의 내적은 `1*(-3) + 2*(-1) + 3*0 + 4*2 = 3` 입니다.

입출력 예 #2

- a와 b의 내적은 `(-1)*1 + 0*0 + 1*(-1) = -2` 입니다.

<!-- 풀이 -->
# 풀이

## Code

``` kotlin
fun solution(a: IntArray, b: IntArray): Int {
    var answer: Int = 0

    a.forEachIndexed { index, i ->

        answer += a[index] * b[index]
    }

    return answer
}
```

## Commentary

- 나름 엄청 어려운 문제인줄 알았는데 아님..
- 일차적으로 생각난게 `forEachIndexed` 라서 쓰긴했는데, 거슬림

## Discussion

- [ ] x

## References

- x