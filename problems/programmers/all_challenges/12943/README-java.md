---
layout: default
title: 콜라츠 추측
parent: Programmers
nav_order: 12943
---

- Elapsed time: 00:00:00
- Language: Java

<!-- 문제 -->
# 콜라츠 추측

[출처](https://programmers.co.kr/learn/courses/30/lessons/12943?language=java)

## 문제 설명

1937년 Collatz란 사람에 의해 제기된 이 추측은, 주어진 수가 1이 될때까지 다음 작업을 반복하면, 모든 수를 1로 만들 수 있다는 추측입니다. 작업은 다음과 같습니다.
```
1-1. 입력된 수가 짝수라면 2로 나눕니다. 
1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
```
예를 들어, 입력된 수가 6이라면 6→3→10→5→16→8→4→2→1 이 되어 총 8번 만에 1이 됩니다. 위 작업을 몇 번이나 반복해야하는지 반환하는 함수, solution을 완성해 주세요. 단, 작업을 500번을 반복해도 1이 되지 않는다면 –1을 반환해 주세요.

## 제한 사항

- 입력된 수, `num`은 1 이상 8000000 미만인 정수입니다.

## 입출력 예

| n      | result |
| ------ | ------ |
| 6      | 8      |
| 16     | 4      |
| 626331 | -1     |

## 입출력 예 설명

입출력 예 #1

문제의 설명과 같습니다.

입출력 예 #2

16 -> 8 -> 4 -> 2 -> 1 이되어 총 4번만에 1이 됩니다.

입출력 예 #3

626331은 500번을 시도해도 1이 되지 못하므로 -1을 리턴해야합니다.

<!-- 풀이 -->
# 풀이

## Code

``` java
public static int solution(int num) {
    int answer = 0;
    long longNum = num;
    boolean isEven;

    if( num == 1 ) return 0;

    for(int i = 500; i > 0; i-- ){
        isEven = (longNum % 2 == 0 ? true : false);
        answer++;
        if(isEven) {
            longNum /= 2;
        } else {
            longNum = longNum * 3 + 1;
        }

        if( longNum == 1 )
            return answer;
    }
    return -1;
}
```

## Commentary

- 원래 재귀로 풀이하려 했으나, 카운트를 따로 `static`으로 빼거나 `Main` 함수를 사용하는 구조가 아니라서 그냥 반복문으로
- 일단 `500`회 돌면서 문제대로 짝수/홀수 처리
- 돌았던 최종 카운터를 리턴
- 문제가 형편없다고 생각한게, 이상하게 `626331` 테스트 케이스가 계속 오류에 걸리길래 디버깅 찍어보니까 `int` 범위를 넘어가는데; 이건 흠.. 모르겠다 처음부터 `int`가 아닌 `long` 으로 숫자를 주던가..
- 13번 답변이 안나와서 계속 뻘짓했는데 혹시나 봤더니 `1` 테스트 케이스는 `0`을 반환해야 하는 것 이었다.

## Discussion

- [ ] x

## References
- x