Language: [English](./README.md) / [한글](./README_ko.md)
- Elapsed time: ???

# Simple Array Sum
Original: https://www.hackerrank.com/challenges/simple-array-sum/problem

## :question: Problem
Given an array of integers, find the sum of its elements.

For example, if the array ![$ar=[1,2,3]$](https://latex.codecogs.com/svg.latex?ar=[1,2,3]), ![$1+2+3=6$](https://latex.codecogs.com/svg.latex?1+2+3=6), so return ![$6$](https://latex.codecogs.com/svg.latex?6).

### Function Description
Complete the simpleArraySum function in the editor below. It must return the sum of the array elements as an integer.

simpleArraySum has the following parameter(s):
- ar: an array of integers

### Input Format
The first line contains an integer, ![$n$](https://latex.codecogs.com/svg.latex?n), denoting the size of the array.
The second line contains ![$n$](https://latex.codecogs.com/svg.latex?n) space-separated integers representing the array's elements

### Constraints
![$0<n, ar[i] <= 1000$](https://latex.codecogs.com/svg.latex?0%3Cn,%20ar[i]%20%3C=%201000)

### Output Format
Print the sum of the array's elements as a single integer.

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
We print the sum of the array's elements: ![$1+2+3+4+10+11=31$](https://latex.codecogs.com/svg.latex?1+2+3+4+10+11=31).

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
- 그냥 다 더하면 됨

### Discussion
- [ ] x

### References
- (If there is any reference)