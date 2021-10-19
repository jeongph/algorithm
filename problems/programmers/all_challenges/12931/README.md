---
layout: default
title: 자릿수 더하기
parent: Programmers
grand_parent: Problems
nav_order: 12931
---

- Elapsed time: 00:00:00
- Language: Java

<!-- 문제 -->
# 자릿수 더하기

[출처](https://programmers.co.kr/learn/courses/30/lessons/12931?language=java)

## 문제 설명

자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

## 제한 사항

- N의 범위 : 100,000,000 이하의 자연수

## 입출력 예

| N   | answer |
| --- | ------ |
| 123 | 6      |
| 987 | 24     |

## 입출력 예 설명

입출력 예 #1

문제의 예시와 같습니다.

입출력 예 #2

9 + 8 + 7 = 24이므로 24를 return 하면 됩니다.

<!-- 풀이 -->
# 풀이

## Code

``` java
public int solution( int n )
{
    int answer = 0;

    do
    {
        answer += n % 10;
        n /= 10;
    } while( n >= 1 );

    return answer;
}
```

## Commentary

- 삼항연산자로 더 줄이고싶었는데 그냥 이게 더 보기 쉬운 것 같음..
- 딱히 설명이 필요없을정도로 쉬운 문제

## Discussion

- 한계 `N`의 범위가 있었어서 크기한계두고 `for문`돌렸어도 될듯?

## References
- x