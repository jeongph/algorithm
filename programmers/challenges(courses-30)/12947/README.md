- Elapsed time: ???

# 하샤드 수
출처: https://programmers.co.kr/learn/courses/30/lessons/12947?language=java

## :question: Problem
양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

### Function description
x

### Constraints
- `x`는 1 이상, 10000 이하인 정수입니다.

### Input/Output example
| arr | return |
| --- | ------ |
| 10  | true   |
| 12  | true   |
| 11  | false  |
| 13  | false  |

## :exclamation: Submit
### Solved code
(Important part only)
``` java
public boolean solution( int x )
{
    int origin_x = x;
    boolean answer = true;

    int temp = 0;
    while( x / 10 != 0 || x % 10 != 0 )
    {
        temp += x % 10;

        x /= 10;
    }

    answer = (origin_x % temp == 0) ? true : false;
    return answer;
}
```

### Commentary
- 주어진 수 `x`를 10으로 나누면서 1의 자리를 각각 더한 값을 `temp`로 정의
- 1의 자리를 더하고 나면 `x`를 한자리씩 1의 자리 쪽으로 당김 (ex> 100->10, 10->1)
- `temp`를 사용하여 처음에 주어진 수 `x`를 나누어서 0이 된다면 하샤드, 아닐경우 아니므로 t/f
- 생각보다 어렵진 않았는데 if문 조건 주의 할 것.

### Discussion
- [ ] x

### References
- (If there is any reference)