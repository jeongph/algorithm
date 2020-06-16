- Elapsed time: ???

# 문자열 내 p와 y의 개수
출처: https://programmers.co.kr/learn/courses/30/lessons/12916?language=java

## :question: Problem
대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

예를 들어 s가 pPoooyY면 true를 return하고 Pyy라면 false를 return합니다.

### Function description
- s : 대문자와 소문자가 섞여있는 문자열
- __return__ : s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False

### Constraints
- 문자열 s의 길이 : 50 이하의 자연수
- 문자열 s는 알파벳으로만 이루어져 있습니다.

### Input/Output example
| s       | answer |
| ------- | ------ |
| pPoooyY | true   |
| Pyy     | false  |

## :exclamation: Submit
### Solved code
(Important part only)
``` java
boolean solution( String s )
{
    boolean answer = true;

    int cP = 0;
    int cY = 0;
    for( int i = 0; i < s.length(); i++ )
    {
        if( s.charAt( i ) == 'p' || s.charAt( i ) == 'P' )
        {
            cP++;
        }
        else if( s.charAt( i ) == 'y' || s.charAt( i ) == 'Y' )
        {
            cY++;
        }
    }

    return answer = (cP == cY ? true : false);
}
```

### Commentary
- 중요한거 없이 p랑 P 문자, y랑 Y문자 확인해서 갯수 비교한 뒤 리턴

### Discussion
- [ ] x

### References
- x