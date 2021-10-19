---
layout: default
title: 직사각형 별찍기
parent: Programmers
nav_order: 12969
---

- Elapsed time: 00:00:00
- Language: Kotlin

<!-- 문제 -->
# 직사각형 별찍기

[출처](https://programmers.co.kr/learn/courses/30/lessons/12969?language=kotlin)

## 문제 설명

이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.

별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.

## 제한 사항

- n과 m은 각각 1000 이하인 자연수입니다.

## 입출력 예

입력

```
5 3
```

출력

```
*****
*****
*****
```

<!-- 풀이 -->
# 풀이

## Code

``` kotlin
fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)

    for (line in 1..b) {
        for (star in 1..a)
            print("*")
        println()
    }
}
```

## Commentary

- 별문제라 별 문제 없이 풀었다.

## Discussion

- [x] (번외)혹시나 하고 다른언어로도 풀어봤는데 풀이한 문제 갯수는 안올라가네

## References
- x