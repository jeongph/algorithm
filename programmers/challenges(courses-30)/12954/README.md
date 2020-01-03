# :bookmark_tabs: [x만큼 간격이 있는 n개의 숫자][title]

## :question: Problem
함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

### :information_source: Function description
- x : 정수 x
- n : 자연수 n
- __return__ : x씩 증가하는 숫자를 n개 지니는 리스트

### :warning: Constraints
- x는 -10000000 이상, 10,000,000 이하인 정수입니다.
- n은 1000 이하인 자연수입니다.

### :arrow_right: Input/Output example
| x   | n   | answer       |
| --- | --- | ------------ |
| 2   | 5   | [2,4,6,8,10] |
| 4   | 3   | [4,8,12]     |
| -4  | 2   | [-4, -8]     |

## :white_check_mark: Submit
### Solved code
(Important part only)
``` java
public long[] solution( int x, int n )
{
    long[] answer = new long[n];

    long added = x;
    int adder = x;
    for( int i = 0; i < n; i++ )
    {
        answer[i] = added;
        added += adder;
    }

    return answer;
}
```
### Commentary
- 제일 먼저 든 생각은 ArrayList로 만들고 add하고, 다시 array로 리턴하는 것
- 근데 길이 자체가 `n`으로 정해져있으니까 더 많은 리소스를 사용하지 않기로 함.
- 맨첨에 x에 x를 더하는식으로 계산했는데 `x`의 단위만큼 `n`번 반복했을 때 `int` 범위를 넘는 경우가 있는 것 같아서 합계를 나타내는 `added`와 합성을 위한 `adder`를 사용
- 어려운건 없고, 합계에 계속 `x`만큼 더하면서 `answer`의 `n`위치에 계속 `add`
- 리턴

### Discussion
- [x] `x`의 최대값이 10,000,000이고, `n`의 최대값이 1,000라서, `x`가 최대고, `n`이 21정도만 되도 21억(int 최대값)을 넘겨버림
- [x] Commentary 쓰면서 생각난건데 변수를 따로 쓸꺼면 합계 변수 `added`나 `adder` 둘 중 한개만 사용해도 됐다.

### References
(If there is any reference)

[title]: https://programmers.co.kr/learn/courses/30/lessons/12954?language=java