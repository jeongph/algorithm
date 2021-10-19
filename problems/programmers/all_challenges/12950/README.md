---
layout: default
title: 행렬의 덧셈
parent: Programmers
grand_parent: Problems
nav_order: 12950
---

- Elapsed time: __해결시간__
- Language: Java

<!-- 문제 -->
# 행렬의 덧셈

[출처](https://programmers.co.kr/learn/courses/30/lessons/12950?language=java)

## 문제 설명

행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

## 제한 사항

- 행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.

## 입출력 예

| arr1          | arr2          | return        |
| ------------- | ------------- | ------------- |
| [[1,2],[2,3]] | [[3,4],[5,6]] | [[4,6],[7,9]] |
| [[1],[2]]     | [[3],[4]]     | [[4],[6]]     |

<!-- 풀이 -->
# 풀이

## Code

``` java
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for(int i = 0; i < arr1.length; i++ ){
            for(int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}
```

## Commentary

- 생각보다 쉬웠다. 첫번째로 주어진 배열 다 돌면서 해당 위치의 `arr2`와 더하고 그걸 `answer`에 대입
- 리턴

## Discussion

- [ ] x

## References
- x