---
layout: default
title: 문자열 다루기 기본
parent: Programmers
nav_order: 12918
---

- Elapsed time: 00:00:00
- Language: Java

<!-- 문제 -->
# 문자열 다루기 기본

[출처](https://programmers.co.kr/learn/courses/30/lessons/12918?language=java)

## 문제 설명

문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

## 제한 사항

- `s`는 길이 1 이상, 길이 8 이하인 문자열입니다.

## 입출력 예

| s    | return |
| ---- | ------ |
| a234 | false  |
| 1234 | true   |

<!-- 풀이 -->
# 풀이

## Code

``` java
public boolean solution( String s )
{
    boolean answer = true;
    int len = s.length();

    if( !(len == 4 || len == 6) ) return false;

    for( int i = 0; i < s.length(); i++ )
    {
        if( s.charAt( i ) >= '0' && s.charAt( i ) <= '9' ) answer = true;
        else
        {
            return false;
        }
    }

    return answer;
}
```

## Commentary

- 별로 설명할건 없지만, 길이가 4 or 6인지 판별하고 바로 `while` 돌려도 좋았을 것 같다.
- Flag 처럼 `answer` 를 사용했다면 더 좋았겠지만, 일단은 그냥 문자열의 모든 단어를 돌면서 숫자 범위인지 판단하고 아닐경우 `false`, 맞는경우 `true`
- 리턴

## Discussion

- [ ] x

## References

- x