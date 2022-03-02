- Elapsed time: ???

# OX퀴즈
출처: https://www.acmicpc.net/problem/8958

## :question: Problem
"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.

"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.

OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

## Input/Output example
### Input
첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.

### Output
각 테스트 케이스마다 점수를 출력한다.

## :exclamation: Submit
### Solved code
(Important part only)
``` java
static int[] calcOCount( String arr[] )
{
    int len = arr.length;
    int return_arr[] = new int[len];

    for( int i = 0; i < len; i++ )
    {
        int total = 0;
        int point = 0;
        int temp_len = arr[i].length();
        for( int j = 0; j < temp_len; j++ )
        {
            char tempChar = arr[i].charAt( j );

            if( tempChar == 'O' )
            {
                point++;
                total += point;
            }
            else if( tempChar == 'X' )
            {
                point = 0;
            }
        }
        return_arr[i] = total;
    }

    return return_arr;
}

static void printOCount( int arr[] )
{
    for( int i = 0; i < arr.length; i++ )
    {
        System.out.println( arr[i] );
    }
}
```

### Commentary
- (문제 난이도치고 풀이가 너무길다.)

### Discussion
- [ ] x

### References
- (If there is any reference)