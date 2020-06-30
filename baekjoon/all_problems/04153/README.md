- Elapsed time: ???

# 직각삼각형
출처: https://www.acmicpc.net/problem/4153

## :question: Problem
과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다. 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.

## Input/Output example
### Input
입력은 여러개의 테스트케이스로 주어지며 마지막줄에는 0 0 0이 입력된다. 각 테스트케이스는 모두 30,000보다 작은 양의 정수로 주어지며, 각 입력은 변의 길이를 의미한다.

### Output
각 입력에 대해 직각 삼각형이 맞다면 "right", 아니라면 "wrong"을 출력한다.

## :exclamation: Submit
### Solved code
(Important part only)
``` java
public static String isRight( int a, int b, int c )
{
    String re_str = "";

    int db_a = a * a;
    int db_b = b * b;
    int db_c = c * c;
    int max = 0;
    int else_two = 0;

    if( db_a >= db_b && db_a >= db_c )
    {
        max = db_a;
        else_two = db_b + db_c;
    }

    if( db_b >= db_a && db_b >= db_c )
    {
        max = db_b;
        else_two = db_a + db_c;
    }

    if( db_c >= db_a && db_c >= db_b )
    {
        max = db_c;
        else_two = db_a + db_b;
    }

    if( else_two == max ) re_str = "right";
    else re_str = "wrong";

    return re_str;
}
```

### Commentary
- (너무 대충 풀었나..) 풀이 필요 x

### Discussion
- [ ] x

### References
- (If there is any reference)