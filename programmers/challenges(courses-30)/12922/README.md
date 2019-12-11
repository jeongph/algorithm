# :bookmark_tabs: [수박수박수박수박수박수?][title]

## :question: Problem
길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.

### :information_source: Function description
- n : 자연수

### :warning: Constraints
- n은 길이 10,000이하인 자연수입니다.

### :arrow_right: Input/Output example
| n   | return |
| --- | ------ |
| 3   | 수박수    |
| 4   | 수박수박   |

## :white_check_mark: Submit
### Solved code
(Important part only)
``` java
public String solution(int n) {
    String s = "";
    for(int i = 0; i < n; i++){
        s += (i%2==0 ? "수":"박");           
    }
    return s;  
  }  
```
### Commentary
- ...? (왜 똑같은 레벨인데 문제별로 난이도가 천차만별이지..)
- 별다를건 없다.. 그냥 앞에는 "수" 뒤에 "박"을 n개 숫자만큼 붙여서 return
- 굳이 설명하자면 삼항연산자를 썼다는거..?! if문 2개 쓰려니까 문득 떠올라서 ..
- 설명이 필요없는 문제.

### Discussion
```
class Solution {
    String text = "수박" // * 1000
    public String solution(int n)
    {
        String answer = text.substring(0, n);
        return answer;
    }
}
```
- [ ] 첨부한 코드는 엄청 대단한건 아닌데 문제의 허점(?!)을 잘 노린거 같기도하고... 멍청해보이지만 이 코드가 내 답보다 빠를 것 같기도 하고,,

### References
(If there is any reference)

[title]: https://programmers.co.kr/learn/courses/30/lessons/12922