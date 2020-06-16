- Elapsed time: ???

# 평균 구하기
출처: https://programmers.co.kr/learn/courses/30/lessons/12944?language=java

## :question: Problem
정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

### Function description
- arr : 정수를 담고 있는 배열
- __return__ : 평균값

### Constraints
- arr은 길이 1 이상, 100 이하인 배열입니다.
- arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.

### Input/Output example
| arr       | return |
| --------- | ------ |
| [1,2,3,4] | 2.5    |
| [5,5]     | 5      |

## :exclamation: Submit
### Solved code
(Important part only)
``` java
public double solution( int[] arr )
{
    double answer = 0;

    int sum = 0;
    for( int i = 0; i < arr.length; i++ )
    {
        sum += arr[i];
    }

    answer = ( double ) sum / arr.length;
    return answer;
}
```

### Commentary
- (엄,, 어마어마한 난이도의 문제가 나왔네..)
- 평균구하기니까 들어온 값 다 더해서 len만큼 나눠서 리턴

### Discussion
- [ ] x

### References
- (If there is any reference)