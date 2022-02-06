---
layout: default
title: 13. Roman to Integer
parent: LeetCode
grand_parent: Problems
nav_order: 13
---

- Elapsed time: 00:00:00
- Language: Java
- Time & Space complexity: ?/?

<!-- 문제 -->
# Roman to Integer

[출처][출처]

## 문제 설명

로마 숫자는 다음 7개 각각의 다른 기호로 표시된다: `I`, `V`, `X`, `L`, `C`, `D` and `M`.  
| Symbol | Value |
| ------ | ----- |
| I      | 1     |
| V      | 5     |
| X      | 10    |
| L      | 50    |
| C      | 100   |
| D      | 500   |
| M      | 1000  |  
예를들어, `2`는 로마 숫자 `II`로 각각을 더해서 쓰고, `12`는 `X + II`를 합쳐서 `XII`로 쓴다. `27`은 `XX + V + II`를 합쳐서 `XXVII`로 쓴다.
  
로마 숫자는 

## 제한 사항

- `1 <= s.length <= 15`
- `s` contains only the characters `('I', 'V', 'X', 'L', 'C', 'D', 'M')`.
- It is __guaranteed__ that `s` is a valid roman numeral in the range `[1, 3999]`.

## 입출력 예

Example 1:
```
Input: s = "III"
Output: 3
Explanation: III = 3.
```

Example 2:
```
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
```

Example 3:
```
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
```

<!-- 풀이 -->
# 풀이

## Code

``` java
__code_here__
```

## Commentary

- __edit_here__

## Discussion

- [ ] x

## References

- x

<!-- URL -->
[출처]: https://leetcode.com/problems/roman-to-integer/