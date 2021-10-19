---
layout: default
title: 문자열을 정수로 바꾸기
parent: Programmers
nav_order: 12925
---

- Elapsed time: 00:00:00
- Language: Java

<!-- 문제 -->
# 문자열을 정수로 바꾸기

[출처](https://programmers.co.kr/learn/courses/30/lessons/12925?language=java)

## 문제 설명

문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

## 제한 사항

- s의 길이는 1 이상 5이하입니다.
- s의 맨앞에는 부호(+, -)가 올 수 있습니다.
- s는 부호와 숫자로만 이루어져있습니다.
- s는 0으로 시작하지 않습니다.

## 입출력 예

예를들어 str이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면 됩니다.

str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.

<!-- 풀이 -->
# 풀이

## Code

``` java
public int solution( String s )
{
    int answer = 0;
    int len = s.length();

    boolean sign = true;
    char firstChar = s.charAt( 0 );
    if( !Character.isDigit( firstChar ) )
    {
        if( firstChar == '-' ) sign = false;
        else if( firstChar == '+' ) sign = true;

        answer = Integer.parseInt( s.substring( 1, len ) );
    }
    else
        answer = Integer.parseInt( s );

    return sign ? answer : answer * (-1);
}
```

## Commentary

- 뭔가 바로바로 될 것 같았는데 이것저것 많이 만들었네
- 일단 문자열 맨 앞이 "-/+" 일 경우를 판별해서 `sign`값에 저장
- 문자열에 포함된 숫자부분 자체를 `answer`에 숫자로 저장
- 음수값이면 숫자 자체에 `-1` 곱해서 음수로 변환, 아닐경우 그대로 저장
- 리턴

## Discussion

- [x] 분명 `isNumeric` 이라는 단어였던것 같은데 `isDigit` 이었음 Docs 최고.
- [ ] 음수로 변환하는건 당장 저것 밖에 생각이 안났는데 뭔가 더 좋은 방법이 있긴 할 듯.

## References

- [Character.isDigit](https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html#isDigit-char-)
- [Integer.parseInt](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html#parseInt-java.lang.String-)