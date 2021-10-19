---
layout: default
title: 하샤드 수
parent: Programmers
nav_order: 12947
---

- Elapsed time: 00:00:00
- Language: Java

<!-- 문제 -->
# 하샤드 수

[출처](https://programmers.co.kr/learn/courses/30/lessons/12947?language=java)

## 문제 설명

양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

## 제한 사항

- `x`는 1 이상, 10000 이하인 정수입니다.

## 입출력 예

| arr | return |
| --- | ------ |
| 10  | true   |
| 12  | true   |
| 11  | false  |
| 13  | false  |

## 입출력 예 설명

입출력 예 #1

10의 모든 자릿수의 합은 1입니다. 10은 1로 나누어 떨어지므로 10은 하샤드 수입니다.

입출력 예 #2

12의 모든 자릿수의 합은 3입니다. 12는 3으로 나누어 떨어지므로 12는 하샤드 수입니다.

입출력 예 #3

11의 모든 자릿수의 합은 2입니다. 11은 2로 나누어 떨어지지 않으므로 11는 하샤드 수가 아닙니다.

입출력 예 #4

13의 모든 자릿수의 합은 4입니다. 13은 4로 나누어 떨어지지 않으므로 13은 하샤드 수가 아닙니다.

<!-- 풀이 -->
# 풀이

## Code

``` java
public boolean solution( int x )
{
    int origin_x = x;
    boolean answer = true;

    int temp = 0;
    while( x / 10 != 0 || x % 10 != 0 )
    {
        temp += x % 10;

        x /= 10;
    }

    answer = (origin_x % temp == 0) ? true : false;
    return answer;
}
```

## Commentary

- 주어진 수 `x`를 10으로 나누면서 1의 자리를 각각 더한 값을 `temp`로 정의
- 1의 자리를 더하고 나면 `x`를 한자리씩 1의 자리 쪽으로 당김 (ex> 100->10, 10->1)
- `temp`를 사용하여 처음에 주어진 수 `x`를 나누어서 0이 된다면 하샤드, 아닐경우 아니므로 t/f
- 생각보다 어렵진 않았는데 if문 조건 주의 할 것.

## Discussion

- [ ] x

## References
- x