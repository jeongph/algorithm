Language: [English](./README.md) / [한글](./README_ko.md)
- Elapsed time: ???

# Diagonal Difference
Original: https://www.hackerrank.com/challenges/diagonal-difference/problem

## :question: Problem
Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix ![$arr$](https://latex.codecogs.com/svg.latex?arr) is shown below:
```
1 2 3
4 5 6
9 8 9  
```
The left-to-right diagonal =![$1+5+9=15$](https://latex.codecogs.com/svg.latex?1+5+9=15). The right to left diagonal =![$3+5+9=17$](https://latex.codecogs.com/svg.latex?3+5+9=17) . Their absolute difference is ![$|15-17|=2$](https://latex.codecogs.com/svg.latex?|15-17|=2).

### Function Description
Complete the ![$diagonalDifference$](https://latex.codecogs.com/svg.latex?diagonalDifference) function in the editor below. It must return an integer representing the absolute diagonal difference.

diagonalDifference takes the following parameter:

- arr: an array of integers .

### Input Format
The first line contains a single integer, ![$n$](https://latex.codecogs.com/svg.latex?n), the number of rows and columns in the matrix ![$arr$](https://latex.codecogs.com/svg.latex?arr).

Each of the next ![$n$](https://latex.codecogs.com/svg.latex?n) lines describes a row, ![$arr[i]$](https://latex.codecogs.com/svg.latex?arr[i]), and consists of ![$n$](https://latex.codecogs.com/svg.latex?n) space-separated integers ![$arr[i][j]$](https://latex.codecogs.com/svg.latex?arr[i][j]).

### Constraints
- ![$-100<=arr[i][j]<=100$](https://latex.codecogs.com/svg.latex?-100\leq%20arr[i][j]\leq%20100)

### Output Format
Print the absolute difference between the sums of the matrix's two diagonals as a single integer.

### Sample Input 0
```
3
11 2 4
4 5 6
10 8 -12
```

### Sample Output 0
```
15
```

### Explanation 0
The primary diagonal is:
```
11
   5
     -12
```
Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:
```
     4
   5
10
```
Sum across the secondary diagonal: 4 + 5 + 10 = 19
Difference: |4 - 19| = 15

### Note:
|x| is the [absolute value](https://www.mathsisfun.com/numbers/absolute-value.html) of x

## :exclamation: Submit
### Solved code
(Important part only)
``` java
static int diagonalDifference(int[][] arr) {
    int sum1 = 0, sum2 = 0;
    int count1 = 0;
    int count2 = arr[0].length - 1;

    for (int i = 0; i < arr[0].length; i++) {
        sum1 += arr[i][count1];
        sum2 += arr[i][count2];
        count1++;
        count2--;
    }

    return Math.abs(sum1 - sum2);
}
```

### Commentary
- `Math.abs` 함수를 사용해서 쉽게 구했으나, 직접 제작하라는 문제였는지..?
- 풀이 필요 x

### Discussion
- [ ] x

### References
- (If there is any reference)