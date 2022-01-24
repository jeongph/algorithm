---
layout: default
title: 스킬 체크 테스트 Level 1-2
parent: Programmers
grand_parent: Problems
nav_order: 99999
---

# 스킬 체크 테스트 Level 1-2

## 문제 설명
함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지닌 리스트를 리턴.
다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

## 제한 조건
- x는 -10,000,000이상, 10,000,000이하인 정수
- n은 1000이하인 자연수.

## 입출력 예
| x   | n   | answer       |
| --- | --- | ------------ |
| 2   | 5   | [2,4,6,8,10] |
| 4   | 3   | [4, 8, 12]   |
| -4  | 2   | [-4, -8]     |

## Submit
``` java
// 중요 코드
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        answer[0] = x;
        for( int i = 1; i < n; i++ )
        {
            answer[i] = (answer[i-1] + x);
        }

        return answer;
    }
}
```

- 첫번째 문제가 작은 함정이 있었어서 그런지 생각보다 두번째문제는 직구
- 그냥 long(범위가 천만밖에 안됨)으로 선언해서 n개를 돌아가는 반복문 for를 돌림
- 반복문에서 x값만큼 계속 더하는데, 이전값에서 더해서 계속해서 증감
- 마지막에 해당 배열을 리턴