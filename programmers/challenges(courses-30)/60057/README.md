# :bookmark_tabs: [[2020카카오공채] 문자열 압축][title]

## :question: Problem
데이터 처리 전문가가 되고 싶은 어피치는 문자열을 압축하는 방법에 대해 공부를 하고 있습니다. 최근에 대량의 데이터 처리를 위한 간단한 비손실 압축 방법에 대해 공부를 하고 있는데, 문자열에서 같은 값이 연속해서 나타나는 것을 그 문자의 개수와 반복되는 값으로 표현하여 더 짧은 문자열로 줄여서 표현하는 알고리즘을 공부하고 있습니다.
간단한 예로 aabbaccc의 경우 2a2ba3c(문자가 반복되지 않아 한번만 나타난 경우 1은 생략함)와 같이 표현할 수 있는데, 이러한 방식은 반복되는 문자가 적은 경우 압축률이 낮다는 단점이 있습니다. 예를 들면, abcabcdede와 같은 문자열은 전혀 압축되지 않습니다. 어피치는 이러한 단점을 해결하기 위해 문자열을 1개 이상의 단위로 잘라서 압축하여 더 짧은 문자열로 표현할 수 있는지 방법을 찾아보려고 합니다.

예를 들어, ababcdcdababcdcd의 경우 문자를 1개 단위로 자르면 전혀 압축되지 않지만, 2개 단위로 잘라서 압축한다면 2ab2cd2ab2cd로 표현할 수 있습니다. 다른 방법으로 8개 단위로 잘라서 압축한다면 2ababcdcd로 표현할 수 있으며, 이때가 가장 짧게 압축하여 표현할 수 있는 방법입니다.

다른 예로, abcabcdede와 같은 경우, 문자를 2개 단위로 잘라서 압축하면 abcabc2de가 되지만, 3개 단위로 자른다면 2abcdede가 되어 3개 단위가 가장 짧은 압축 방법이 됩니다. 이때 3개 단위로 자르고 마지막에 남는 문자열은 그대로 붙여주면 됩니다.

압축할 문자열 s가 매개변수로 주어질 때, 위에 설명한 방법으로 1개 이상 단위로 문자열을 잘라 압축하여 표현한 문자열 중 가장 짧은 것의 길이를 return 하도록 solution 함수를 완성해주세요.

### :information_source: Function description
- s : 압축할 문자열 s
- __return__ : 1개 이상 단위로 문자열을 잘라 압축하여 표현한 문자열 중 가장 짧은 것의 길이

### :warning: Constraints
- s의 길이는 1 이상 1,000 이하입니다.
- s는 알파벳 소문자로만 이루어져 있습니다.

### :arrow_right: Input/Output example
| s                          | result |
| -------------------------- | ------ |
| "aabbaccc"                 | 7      |
| "ababcdcdababcdcd"         | 9      |
| "abcabcdede"               | 8      |
| "abcabcabcabcdededededede" | 14     |
| "xababcdcdababcdcd"        | 17     |

## :white_check_mark: Submit
### Solved code
(Important part only)
``` java
public int solution( String s )
{
    int len = s.length();
    int answer = len;

    int splitter = 1;
    while( splitter < len )
    {
        ArrayList<String> al = new ArrayList<String>();
        String ans_str = "";

        for( int i = 0; i < len; i += splitter )
        {
            String temp;
            if( i + splitter > len ) temp = s.substring( i, len );
            else temp = s.substring( i, i + splitter );
            al.add( temp ); // add subStrings
        }

        int same_counter = 0;
        int splitter_size = al.size() - 1;
        boolean isSame = false;
        for( int i = 0 + 1; i <= splitter_size; i++ )
        {
            String pre_temp = al.get( i - 1 );
            String temp = al.get( i );

            if( pre_temp.equals( temp ) )
            {
                ++same_counter;
                isSame = true;
            }
            else if( !pre_temp.equals( temp ) )
            {
                ans_str += same_counter != 0 ? "" + (same_counter + 1) + pre_temp : "" + pre_temp;
                isSame = false;
                same_counter = 0;
            }

            if(i == splitter_size)
            {
                ans_str += isSame ? "" + (same_counter + 1) + pre_temp : "" + temp;
            }
        }

        int new_len = ans_str.length();
        if( new_len < answer ) answer = new_len;

        splitter++;
    }

    return answer;
}
```
### Commentary
- (split으로 뻘짓 하다가, 특정 문자열로 자르는것이 아닌것을 판단.)
- 생각 자체는 단순했다, 일단 `n`으로 잘라서 최소의 길이를 판단하는건데 (이것도 다중분할인줄 알고 고생함)
- 우선, 1단어부터 단어 전체 길이까지 각각 잘라보면서 어떤 `n`의 길이가 가장 짧은지 판단
- 이때, 자른 단어를 array에 넣고 같은것이 있으면 압축, 아닐경우 비압축
- 압축된 단어의 길이를 최소값으로 비교해서 answer에 담음
- 리턴

### Discussion
- [x] 문제좀 똑바로, 자세히 읽고 풀 것 (제약사항이 있다는 것 == 한계가 정해져 있다는 것)
- [ ] 풀이 자체는 엄청 어렵지도, 엄청 길지도 않았는데, 문제를 어렵게 생각한 나머지 못풀뻔 했다.
- [ ] 이건 똑똑한분들의 풀이를 좀 확인해서 효율적인 코드가 있는지 봐야할 듯

### References
(If there is any reference)

[title]: https://programmers.co.kr/learn/courses/30/lessons/60057?language=java
