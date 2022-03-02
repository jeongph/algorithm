- Elapsed time: ???

# 최소, 최대
출처: https://www.acmicpc.net/problem/10818

## :question: Problem
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

## Input/Output example
### Input
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

### Output
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

## :exclamation: Submit
### Solved code
(Important part only)
``` java
static String calcMinMax( int arr[] )
{
    int max = -1000001, min = 1000001;

    for( int i = 0; i < arr.length; i++ )
    {
        if( arr[i] > max ) max = arr[i];
        if( arr[i] < min ) min = arr[i];
    }

    return min + " " + max;
}
```

### Commentary
- 풀이 필요 x

### Discussion
- [ ] x

### References
- (If there is any reference)