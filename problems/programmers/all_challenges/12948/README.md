---
layout: default
title: 핸드폰 번호 가리기
parent: Programmers
grand_parent: Problems
nav_order: __문제번호__
---

- Elapsed time: 00:00:00
- Language: Java

<!-- 문제 -->
# 핸드폰 번호 가리기

[출처](https://programmers.co.kr/learn/courses/30/lessons/12948?language=java)

## 문제 설명

프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 `*`으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

## 제한 사항

- s는 길이 4 이상, 20이하인 문자열입니다.

## 입출력 예

| phone_number  | return        |
| ------------- | ------------- |
| "01033334444" | "*******4444" |
| "027778888"   | "*****8888"   |

<!-- 풀이 -->
# 풀이

## Code

``` java
public String solution(String phone_number) {
    String answer = "";
    int len = phone_number.length();

    for(int i = 0; i < len-4; i++ )
    {
        answer += "*";
    }
    answer += phone_number.substring(len-4, len);

    return answer;
}
```

## Commentary

- (시간 없었는데 쉬운 문제라 다행이네..)
- 전화번호 길이에서 4개 뺀 값만큼 `*` 앞에 추가
- 뒤에 자른 4글자 번호 추가
- 리턴

## Discussion

- [ ] 전화번호 별표 출력시에 `+=` 말고 좋은방법 있는지 알아보기

## References
- x