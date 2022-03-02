Language: [English](./README.md) / [한글](./README_ko.md)
- Elapsed time: ???

# A Very Big Sum
Original: https://www.hackerrank.com/challenges/a-very-big-sum/problem

## :question: Problem
Calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.

### Function Description
Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.

aVeryBigSum has the following parameter(s):

- ar: an array of integers .

### Input Format
The first line of the input consists of an integer ![$n$](https://latex.codecogs.com/svg.latex?n).
The next line contains ![$n$](https://latex.codecogs.com/svg.latex?n) space-separated integers contained in the array.

### Output Format
Print the integer sum of the elements in the array.

### Constraints
![$1<=n<=10$](https://latex.codecogs.com/svg.latex?1\leq%20n\leq%2010)

![$0<=ar[i]<=10^{10}$](https://latex.codecogs.com/svg.latex?0\leq%20ar[i]\leq%2010^{10})

### Sample Input
```
5
1000000001 1000000002 1000000003 1000000004 1000000005
```

### Sample Output
```
5000000015
```

### Note:
The range of the 32-bit integer is ![$(-2^{31}) to (2^{31}-1) or [-217483647, 2147483647]$](https://latex.codecogs.com/svg.latex?(-2^{31})%20to%20(2^{31}-1)%20or%20[-217483647,%202147483647]).
When we add several integer values, the resulting sum might exceed the above range. You might need to use long long int in C/C++ or long data type in Java to store such sums.

## :exclamation: Submit
### Solved code
(Important part only)
``` java
static long aVeryBigSum(long[] ar) {
    long sum = 0;
    for (int i = 0; i < ar.length; i++) {
        sum += ar[i];
    }
    return sum;

}
```

### Commentary
- 이때는 대강 `long` 으로 해결 한 것 같은데, 원래대로라면 `big int 객체` 사용하면 됨
- 풀이 필요 x

### Discussion
- [ ] x

### References
- (If there is any reference)