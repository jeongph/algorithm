---
layout: default
title: 완주하지 못한 선수
parent: Programmers
grand_parent: Problems
nav_order: 42576
---

- Elapsed time: 00:00:00
- Language: Java

<!-- 문제 -->
# 완주하지 못한 선수

[출처](https://programmers.co.kr/learn/courses/30/lessons/42576?language=java)

## 문제 설명

수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

## 제한 사항

- 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
- completion의 길이는 participant의 길이보다 1 작습니다.
- 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
- 참가자 중에는 동명이인이 있을 수 있습니다.

## 입출력 예

| participant                             | completion                       | return |
| --------------------------------------- | -------------------------------- | ------ |
| [leo, kiki, eden]                       | [eden, kiki]                     | leo    |
| [marina, josipa, nikola, vinko, filipa] | [josipa, filipa, marina, nikola] | vinko  |
| [mislav, stanko, mislav, ana]           | [stanko, ana, mislav]            | mislav |

## 입출력 예 설명

예제 #1
"leo"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #2
"vinko"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #3
"mislav"는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.

<!-- 풀이 -->
# 풀이

## Code

``` java
public String solution( String[] participant, String[] completion )
{
    String answer = "";

    Arrays.sort( participant );
    Arrays.sort( completion );

    for( int i = 0; i < participant.length; i++ )
    {
        if( i == (participant.length - 1) || !participant[i].equalsIgnoreCase( completion[i] ))
        {
            answer = participant[i];
            break;
        }
    }

    return answer;
}
```

## Commentary

- 단순하고, 단순하게 생각했다. 정렬해서 같은 위상에 다른 값을 가지면 없는 것.
- 따라서 정렬하고 순서대로 비교 했다.
- 없는 값이 있다면 해당 위치를 리턴

## Discussion

- [ ] x

## References
- x