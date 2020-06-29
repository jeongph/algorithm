- Elapsed time: ???

# 문자열 반복
출처: https://www.acmicpc.net/problem/2675

## :question: Problem
문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.

QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.

## Input/Output example
### Input
첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 

### Output
각 테스트 케이스에 대해 P를 출력한다.

## :exclamation: Submit
### Solved code
(Important part only)
``` java
static String cycleStr( int to_cycle, String str )
{
    int len = str.length();
    //		int to_cycle = Integer.parseInt( cycle );

    String temp = "";
    for( int i = 0; i < len; i++ )
    {
        for( int j = 0; j < to_cycle; j++ )
        {
            temp += str.charAt( i );
        }
    }

    return temp;
}
```

### Commentary
- 풀이 필요 x

### Discussion
- [ ] x

### References
- (If there is any reference)