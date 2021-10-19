---
layout: default
title: 서울에서 김서방 찾기
parent: Programmers
grand_parent: Problems
nav_order: 12919
---

- Elapsed time: 00:00:00
- Language: Java

<!-- 문제 -->
# 서울에서 김서방 찾기

[출처](https://programmers.co.kr/learn/courses/30/lessons/12919?language=java)

## 문제 설명

String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요. seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

## 제한 사항

- seoul은 길이 1 이상, 1000 이하인 배열입니다.
- seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
- "Kim"은 반드시 seoul 안에 포함되어 있습니다.

## 입출력 예

| seoul       | return            |
| ----------- | ----------------- |
| [Jane, Kim] | 김서방은 1에 있다 |

<!-- 풀이 -->
# 풀이

## Code

``` java
static final String KIM = "kim";

public String solution( String[] seoul )
{
    String answer = "";

    for( int i = 0; i < seoul.length; i++ )
    {
        if( seoul[i].equalsIgnoreCase( KIM ) )
            answer = String.format( "김서방은 %d에 있다", i );
        else continue;
    }

    return answer;
}
```

## Commentary

- 배열도 정해져있고, kim은 반드시 들어간다니까 그냥 배열 길이만큼 돌면서 kim이 있나 확인
- 있을 때의 값을 answer에 넣고 리턴

## Discussion

- [ ] x

## References

- x