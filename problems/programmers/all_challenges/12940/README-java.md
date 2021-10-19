---
layout: default
title: 최대공약수와 최소공배수
parent: Programmers
nav_order: 12940
---

- Elapsed time: 00:00:00
- Language: Java

<!-- 문제 -->
# 최대공약수와 최소공배수

[출처](https://programmers.co.kr/learn/courses/30/lessons/12940?language=java)

## 문제 설명

두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

## 제한 사항

- 두 수는 1이상 1000000이하의 자연수입니다.

## 입출력 예

| n   | m   | return  |
| --- | --- | ------- |
| 3   | 12  | [3, 12] |
| 2   | 5   | [1, 10] |

## 입출력 예 설명

입출력 예 #1

위의 설명과 같습니다.

입출력 예 #2

자연수 2와 5의 최대공약수는 1, 최소공배수는 10이므로 [1, 10]을 리턴해야 합니다.

<!-- 풀이 -->
# 풀이

## Code

``` java
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int fi, se;
        if( n > m )
        {
            fi = n;
            se = m;
        }
        else
        {
            fi = m;
            se = n;
        }

        while( se > 0 ) {
            int temp = fi;
            fi = se;
            se = temp % se;
        }

        answer[0] = fi;
        answer[1] = n*m/fi;
        return answer;
    }
}
```

## Commentary

- 방법론이 바로 생각이 안나서, 유클리드호제법(레퍼런스 참고)를 참고하여 최대공약수 식 구함
- `fi`, `se`는 유클리드호제법을 위해 크기를 알 필요가 있었음
- 호제법(수학식)을 토대로 최대공약수를 구하고, 이후에 최대공약수를 이용하면 최소공배수 구하기는 쉬움
- 리턴

## Discussion

- [ ] 몇몇 함수화 했으면 더 코드는 깔금했겠다; 코드가 너무 지저분함

## References

- [유클리드 호제법](https://ko.wikipedia.org/wiki/%EC%9C%A0%ED%81%B4%EB%A6%AC%EB%93%9C_%ED%98%B8%EC%A0%9C%EB%B2%95)