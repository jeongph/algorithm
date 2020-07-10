Language: [English](./README.md) / [한글](./README_ko.md)
- Elapsed time: ???

# Simple Array Sum
Original: https://www.hackerrank.com/challenges/simple-array-sum/problem

## :question: Problem
정수 배열이 주어질 때, 이 구성원의 합을 구하여라

예를 들어, 배열 ![$ar=[1,2,3]$](https://latex.codecogs.com/svg.latex?ar=[1,2,3])은, ![$1+2+3=6$](https://latex.codecogs.com/svg.latex?1+2+3=6), 따라서 ![$6$](https://latex.codecogs.com/svg.latex?6)을 리턴.


### Function Description
하단 에디터의 `simpleArraySum` 함수를 완성하라. 그건 반드시 정수 배열의 요소들의 합을 리턴해야 한다.

`simpleArraySum` 는 다음과 같은 파라메타를 가짐:
- `ar`: 정수 배열

### Input Format
첫번째 줄은 배열의 크기를 나타내는 정수 ![$n$](https://latex.codecogs.com/svg.latex?n),

두번째 줄 ![$n$](https://latex.codecogs.com/svg.latex?n)은 스페이스로 구분되어 배열의 요소를 나타낸다.

### Constraints
![$0<n, ar[i] <= 1000$](https://latex.codecogs.com/svg.latex?0%3Cn,%20ar[i]%20%3C=%201000)

### Output Format
배열 요소의 합을 단일 정수로 출력하라.

### Sample Input 0
```
6
1 2 3 4 10 11
```

### Sample Output 0
```
31
```

### Explanation 0
우리는 배열 정수의 요소의 합을 출력한다: ![$1+2+3+4+10+11=31$](https://latex.codecogs.com/svg.latex?1+2+3+4+10+11=31).

## :exclamation: Submit
### Solved code
(Important part only)
``` java
static int simpleArraySum(int[] ar) {
    int sum = 0;

    for (int i = 0; i < ar.length; i++) {
        sum += ar[i];
    }

    return sum;
}
```

### Commentary
- (그냥 다 더하면 됨) 풀이 필요 x

### Discussion
- [ ] x

### References
- (If there is any reference)