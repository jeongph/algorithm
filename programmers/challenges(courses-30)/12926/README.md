- Elapsed time: ???

# 시저 암호
출처: https://programmers.co.kr/learn/courses/30/lessons/12926?language=java

## :question: Problem
어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 예를 들어 AB는 1만큼 밀면 BC가 되고, 3만큼 밀면 DE가 됩니다. z는 1만큼 밀면 a가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

### Function description
- `s`: 문자열
- `n`: 거리

### Constraints
- 공백은 아무리 밀어도 공백입니다.
- s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
- s의 길이는 8000이하입니다.
- n은 1 이상, 25이하인 자연수입니다.

### Input/Output example
| s     | n   | result |
| ----- | --- | ------ |
| AB    | 1   | BC     |
| z     | 1   | a      |
| a B z | 4   | e F d  |

## :exclamation: Submit
### Solved code
(Important part only)
``` java
public String solution(String s, int n) {
    String answer = "";
    int len = s.length();

    for(int i = 0; i < len; i++)
    {
        char temp = s.charAt(i);
        if( (int)temp != 32 )
        {
            if(temp >= 65 && temp <= 90 && (temp+n) > 90) temp = (char)((temp + n) - 90 + 65 -1);
            else if(temp >= 97 && temp <= 122 && (temp+n) > 122) temp = (char)((temp + n) - 122 + 97 -1);
            else temp += n;
        }

        answer += temp;
    }

    return answer;
}
```

### Commentary
- 단순히 알파벳 순서면 아스키코드로 해결이 가능 할 것이라 생각
- 들어온 문자열을 분해해서 한 단어에 `n`값씩 밀어서 새 값을 만들어 줄껀데,
- 스페이스바가 들어오면 무시하고 아닌경우 대문자는 `A(65)`, 소문자는 `a(97)`을 기준으로 넘을 경우 초기화
- 아닌경우 `n`을 그대로 더하고 문자열로 새로 만들어서 리턴

### Discussion
- [ ] 너무 생각나는대로 코딩해서 리펙토링 해야할 듯

### References
- [ASCII - 위키백과, 우리 모두의 백과사전](https://ko.wikipedia.org/wiki/ASCII)