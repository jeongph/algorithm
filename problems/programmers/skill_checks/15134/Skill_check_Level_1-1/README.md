---
layout: default
title: 스킬 체크 테스트 Level 1-1
parent: Programmers
grand_parent: Problems
nav_order: 99999
---

# 스킬 체크 테스트 Level 1-1

## 문제 설명
문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

## 제한 사항
- 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야 합니다.
- 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.

## 입출력 예
| s         | return    |
| --------- | --------- |
| try hello | TrY HeLlO |

## 입출력 예 설명
"try hello"는 두 단어 "try", "Hello"로 구성되어 있습니다.
각 단어의 짝수번째 문자를 대문자로, 홀수번째 문자를 소문자로 바꾸면 오른쪽과 같은 출력을 리턴합니다.

## Submit
``` java 
// 중요 코드
public String solution(String s) {
        String answer = "";

        int isFirst = 0;
        for( int i = 0; i < s.length(); i++ )
        {
            char temp = s.charAt(i);
            if( temp == ' ' )
            {
                answer += Character.toString(temp);
                isFirst = 0;
                continue;
            }

            if( isFirst % 2 == 0 )
            {
                if( 'a' <= temp && temp <= 'z' ) temp -= 32;
                answer += Character.toString(temp);
            }else
            {
                if( 'A' <= temp && 'Z' >= temp ) temp += 32;
                answer += Character.toString(temp);
            }
            isFirst++;
        }

        return answer;
    }
```

- 처음에 구분이 공백기준인지 모르고 전체 문자열 기준으로 했다가 삽질 계속함..
- 먼저 전체 출력문을 돌면서 해당 문자가 공백인지 판단해야함(이걸 판단해야 처음 시작 위치를 구할 수 있음)
- 시작위치가 구해지고 지금 이 단어가 공백다음에 처음 나오는거면 짝수를 대문자로, 홀수를 소문자로 변경
- 구해진값을 모두 더해서 리턴
- 이미 알겠지만 소문자에 32를 빼면 대문자, 대문자에 32를 더하면 아스키 소문자가 된다. 