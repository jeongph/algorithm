- Elapsed time: ???

# 알파벳 찾기
출처: https://www.acmicpc.net/problem/10809

## :question: Problem
알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

## Input/Output example
### Input
첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

### Output
각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.

만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.

## :exclamation: Submit
### Solved code
(Important part only)
``` java
static int[] findAlpa( String str )
{
    int len = str.length();
    int char_count[] = new int[26];

    for( int i = 0; i < 26; i++ )
    {
        char_count[i] = -1;
    }

    for( int i = 0; i < len; i++ )
    {
        if( char_count[( int ) str.charAt( i ) - 97] != -1 ) continue;
        char_count[( int ) str.charAt( i ) - 97] = i;
    }

    return char_count;
}
```

### Commentary
- 처음 든 생각은 아스키코드 사이즈만큼의 배열 만들고, 해당 값에 위치를 저장하자
- 처음부터 돌면서 아스키값을 확인하고 해당 값의 배열에 위치를 기록
- 없는 경우를 위해 초기화를 `-1`로

### Discussion
- [ ] x

### References
- (If there is any reference)