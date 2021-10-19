---
layout: default
title: 제일 작은 수 제거하기
parent: Programmers
nav_order: 12935
---

- Elapsed time: 00:00:00
- Language: Java

<!-- 문제 -->
# 제일 작은 수 제거하기

[출처](https://programmers.co.kr/learn/courses/30/lessons/12935?language=java)

## 문제 설명

정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

## 제한 사항

- arr은 길이 1 이상인 배열입니다.
- 인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.

## 입출력 예

| arr       | return  |
| --------- | ------- |
| [4,3,2,1] | [4,3,2] |
| [10]      | [-1]    |

<!-- 풀이 -->
# 풀이

## Code

``` java
class Solution {
    public int[] solution(int[] arr) {
        int[] answer;

        if (arr.length <= 1) {
            answer = new int[arr.length];
            answer[0] = -1;
        }
        else {
            answer = new int[arr.length-1];
            int temp = arr[0];
            for (int arr_index : arr) {
                if (temp > arr_index) temp = arr_index;
            }

            int i = 0;
            for (int arr_index : arr) {
                if (arr_index != temp) {
                    answer[i] = arr_index;
                    i++;
                }
            }
        }

        return answer;
    }
}
```

## Commentary

- 배열을 원래 한번에 초기화 하려고 했는데 타임어택이라 코드 퀄리티는 좀 낮게;
- 배열 크기가 1보다 작으면 당연히 -1
- 해당 배열을 돌면서 최소값을 구하고, 다시 최솟값을 제외한 값을 `answer`에 대입하여 리턴
- foreach는 가져다 썻고, 큰 이슈는 없음

## Discussion

- [ ] x

## References
- x