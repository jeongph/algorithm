# :bookmark_tabs: [문자열 다루기 기본][title]

## :question: Problem
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.

### :information_source: Function description
- s : 문자열
- __return__ : 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인

### :warning: Constraints
- `s`는 길이 1 이상, 길이 8 이하인 문자열입니다.

### :arrow_right: Input/Output example
\-

## :white_check_mark: Submit
### Solved code
(Important part only)
``` java
public boolean solution(String s) {
    boolean answer = true;
    int len = s.length();

    if( !(len == 4 || len == 6) ) return false;

    for(int i = 0 ; i < s.length(); i++ )
    {
        if( s.charAt(i) >= '0' && s.charAt(i) <= '9' ) answer = true;
        else
        {
            return false;
        }
    }

    return answer;
}
```
### Commentary
- 문제 자체도 쉽긴 했지만.. 빨리 풀고 잘 생각에 단조롭게 풀기도 했다.
- 별로 설명할건 없지만, 길이가 4 or 6인지 판별하고 바로 while 돌려도 좋았을 것 같다.
- flag 처럼 answer를 사용했다면 더 좋았겠지만, 일단은 그냥 문자열의 모든 단어를 돌면서 숫자 범위인지 판단하고 아닐경우 false, 맞는경우 true
- 리턴

### Discussion
- [ ] -

### References
(If there is any reference)

[title]: https://programmers.co.kr/learn/courses/30/lessons/12918