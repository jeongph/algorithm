# [가운데 글자 가져오기][title]
출처: https://programmers.co.kr/learn/courses/30/lessons/12903

[title]: https://programmers.co.kr/learn/courses/30/lessons/12903

## :question: Problem
### :information_source: Function description
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

### :ballot_box_with_check: Constraints
- s는 길이가 1 이상, 100이하인 스트링입니다.

### :repeat: Input/Output example
| s     | return |
| ----- | ------ |
| abcde | c      |
| qwer  | we     |

## :exclamation: Submit
### Solved code
(Important part only)
``` java
class Solution {
  public String solution(String s) {
      String answer = "";
      
      int len = s.length();
      if( len % 2 == 0) answer = s.substring(len / 2-1, len / 2+1);
      else answer = s.substring(len / 2, len /2+1);
      
      return answer;
  }
}
```
### Commentary
- 음... 1레벨이라그런지 어려운게 없었다. 짝수인지 판별하고 맞으면 길이에서 1뺀값 2글자 아닌경우 중간글자 리턴

### Discussion
- [ ] -

### References
(If there is any reference)