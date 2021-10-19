---
layout: default
title: 문자열 내 마음대로 정렬하기
parent: Programmers
grand_parent: Problems
nav_order: 12915
---

- Elapsed time: 00:00:00
- Language: Java

<!-- 문제 -->
# 문자열 내 마음대로 정렬하기

[출처](https://programmers.co.kr/learn/courses/30/lessons/12915?language=java)

## 문제 설명

문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.

## 제한 사항

- strings는 길이 1 이상, 50이하인 배열입니다.
- strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
- strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
- 모든 strings의 원소의 길이는 n보다 큽니다.
- 인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.

## 입출력 예

| strings           | n   | return            |
| ----------------- | --- | ----------------- |
| [sun, bed, car]   | 1   | [car, bed, sun]   |
| [abce, abcd, cdx] | 2   | [abcd, abce, cdx] |

## 입출력 예 설명

입출력 예 1

"sun", "bed", "car"의 1번째 인덱스 값은 각각 "u", "e", "a" 입니다. 이를 기준으로 strings를 정렬하면 ["car", "bed", "sun"] 입니다.

입출력 예 2

"abce"와 "abcd", "cdx"의 2번째 인덱스 값은 "c", "c", "x"입니다. 따라서 정렬 후에는 "cdx"가 가장 뒤에 위치합니다. "abce"와 "abcd"는 사전순으로 정렬하면 "abcd"가 우선하므로, 답은 ["abcd", "abce", "cdx"] 입니다.

<!-- 풀이 -->
# 풀이

## Code

``` java
public String[] solution( String[] strings, int n )
{
    int len = strings.length;
    String[] answer = new String[len];

    for( int i = 0; i < len; i++ )
    {
        String temp = strings[i].charAt( n ) + strings[i];
        strings[i] = temp;
    }
    Arrays.sort( strings );

    for( int i = 0; i < len; i++ )
    {
        answer[i] = strings[i].substring( 1, strings[i].length() );
    }

    return answer;
}
```

## Commentary

- 어짜피 사전순으로 배열 출력할 것이기 때문에, n번째 위치만 기준이 될 뿐 정렬하는것은 동일함.
- 따라서 맨앞에 구분자를 사전적으로 추가하고 해당 배열을 그냥 sort메소드에 넣어서 정렬
- 배열 크기만큼 for문 돌아서 새로운 형태(사전 정렬을 위한)로 기존의 문자열 수정
- 수정된 정렬 가능한 문자열 배열을 메소드를 사용하여 정렬
- 정렬된 순서대로 앞에 정렬을 위해 사용한 인덱스를 빼고 answer에 추가
- 리턴 

## Discussion

- [ ] 원레 key-value로 풀려고 했던 방법으론 힘든가?
- [ ] comparator를 사용한 풀이가 더 확실해보이긴 한다.

## References

- x