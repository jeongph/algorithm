- Elapsed time: ???

# 단어의 개수
출처: https://www.acmicpc.net/problem/1152

## :question: Problem
영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.

## Input/Output example
### Input
첫 줄에 영어 대소문자와 띄어쓰기로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다. 단어는 띄어쓰기 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열의 앞과 뒤에는 공백이 있을 수도 있다.

### Output
첫째 줄에 단어의 개수를 출력한다.

## :exclamation: Submit
### Solved code
(Important part only)
``` java
static int wordCounter( String str )
{
    int len = str.length();
    boolean is_word = false;   // 플래그 형식으로 수정
    int words_cnt = 0;

    if( len == 0 ) return 0;
    for( int i = 0; i < len; i++ )
    {
        // 앞에서부터 차근차근 char면 취하고 아니면 버리면서 단어로 인식
        if( str.charAt( i ) != ' ' && str.charAt( i ) != '\n' )    // 공백이 아니고 문자가 나오면
        {
            is_word = true; // 단어가 나왔다고 플래그 면경
        }
        else if( str.charAt( i ) == ' ' || str.charAt( i ) == '\n' )
        {
            if( is_word )
            {
                is_word = false;
                words_cnt++;
            }
        }
    }

    if( str.charAt( len - 1 ) != ' ' && str.charAt( len - 1 ) != '\n' ) words_cnt++;
    return words_cnt;
}
```

### Commentary
- 앞에서부터 차근차근 `char`면 취하고 아니면 버리면서 단어로 인식
- 공백이 아니고 문자가 나오면 단어가 나왔다고 플래그 면경
- 단어 갯수를 세고, 정상범위에서 단어 갯수를 1개 추가
- 리턴

### Discussion
- [x] 테스트 케이스가 너무 다양해서 좀 고생

### References
- (If there is any reference)