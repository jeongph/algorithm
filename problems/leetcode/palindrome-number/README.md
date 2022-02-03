---
layout: default
title: Palindrome Number
parent: LeetCode
grand_parent: Problems
nav_order: 9
---

- Elapsed time: 00:00:00
- Language: Java
- Time & Space complexity: ?/?

<!-- 문제 -->
# Palindrome Number

[출처](https://leetcode.com/problems/palindrome-number/)

## 문제 설명

정수 `x`가 주어졌을 때, 만약 `x`가 [Palindrome] (회문) 이면 `true`를 반환하라.  
어떤 정수를 앞으로 읽을때와 뒤로 읽을때가 같을때 __[Palindrome]__ 입니다.
- 예를들어, `121`은 [Palindrome]이고, `123`은 아닙니다.

## 제한 사항
- `-2^31 <= x <= 2^31 - 1`

## 입출력 예

### Example 1:

```
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
```

### Example 2:

```
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
```

<!-- 풀이 -->
# 풀이

## Code

``` java
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        boolean ans = true;
        String xToStr = Integer.toString(x);
        int decalPointer = xToStr.length() - 1;

        if (xToStr.charAt(0) == '-') ans = false;
        else {  // negative check
            for (int i = 0; i < (xToStr.length() / 2); i++) {
                if (xToStr.charAt(i) != xToStr.charAt(decalPointer)) ans = false;
                else --decalPointer;
            }
        }

        return ans;
    }
}

```

## Commentary

- 먼저, 정수형 자체로 비교하기 쉽지않으므로 문자열로 변환( use `Integer.toString`)
- 리턴형을 바로 던져도 되지만 함수를 모두 타고나서 결과를 반환하기 위해 리턴값 `ans`를 정의
- (초기값을 `false`로 하려고 했지만, 아래 나오는 `if`문의 더 명확한 파이프라인을 위해 `true`로 정의)
- 음수의 경우 뒤에도 `-`가 붙을 수 없으므로 나오자마자 `false`, 이후 추가 계산은 하지않음
- 양수의 경우 각각 앞과 뒤에서 포인터를 한칸씩 옮겨가며 앞뒤가 똑같은지 비교 -> 아닐경우 `false`를 리턴
- 해당 조건문에 하나도 걸리지 않으면 `true`

## Discussion

- [ ] Follow up: Could you solve it without converting the integer to a string?

## References

- [Palindrome]

<!-- 링크 -->
[Palindrome]: https://ko.wikipedia.org/wiki/%ED%9A%8C%EB%AC%B8