---
layout: default
title: 평균 구하기
parent: Programmers
nav_order: 12944
---

- Elapsed time: 00:00:00
- Language: Kotlin

# 평균 구하기

[출처](https://programmers.co.kr/learn/courses/30/lessons/12944?language=kotlin)

## 문제 설명

정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

## 제한 사항

- arr은 길이 1 이상, 100 이하인 배열입니다.
- arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.

## 입출력 예

| arr       | return |
| --------- | ------ |
| [1,2,3,4] | 2.5    |
| [5,5]     | 5      |

# 풀이

## Code

``` kotlin
class Solution {
    fun solution(arr: IntArray): Double {
        var answer = 0.0

        answer = arr.average().toDouble()

        return answer
    }
}
```

## Commentary

- ..별다른 풀이 필요없음 그냥 평균 구해서 리턴

## Discussion

- [ ] x

## References
- x