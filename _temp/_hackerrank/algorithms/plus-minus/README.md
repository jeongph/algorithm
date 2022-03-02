Language: [English](./README.md) / [한글](./README_ko.md)
- Elapsed time: ???

# Plus Minus
Original: https://www.hackerrank.com/challenges/plus-minus/problem

## :question: Problem
Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros. Print the decimal value of each fraction on a new line.

__Note:__ This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to ![$10^{-4}$](https://latex.codecogs.com/svg.latex?10^{-4}) are acceptable.

For example, given the array ![$arr=[1,1,0,-1,-1]$](https://latex.codecogs.com/svg.latex?arr=[1,1,0,-1,-1]) there are ![$5$](https://latex.codecogs.com/svg.latex?5) elements, two positive, two negative and one zero. Their ratios would be ![$\frac{2}{5}=0.400000$](https://latex.codecogs.com/svg.latex?\frac{2}{5}=0.400000), ![$\frac{2}{5}=0.400000$](https://latex.codecogs.com/svg.latex?\frac{2}{5}=0.400000) and ![$\frac{1}{2}=0.200000$](https://latex.codecogs.com/svg.latex?\frac{1}{2}=0.200000). It should be printed as

### Function Description
Complete the plusMinus function in the editor below. It should print out the ratio of positive, negative and zero items in the array, each on a separate line rounded to six decimals.

plusMinus has the following parameter(s):

- arr: an array of integers

### Input Format
The first line contains an integer, ![$n$](https://latex.codecogs.com/svg.latex?n), denoting the size of the array.
The second line contains ![$n$](https://latex.codecogs.com/svg.latex?n) space-separated integers describing an array of numbers ![$arr(arr[0],arr[1],arr[2],...,arr[n-1])$](https://latex.codecogs.com/svg.latex?arr(arr[0],arr[1],arr[2],...,arr[n-1])).

### Constraints
- ![$0 < n \leq 100$](https://latex.codecogs.com/svg.latex?0%20%3C%20n%20\leq%20100)
- ![$-100\leq arr[i] \leq 100$](https://latex.codecogs.com/svg.latex?-100\leq%20arr[i]%20\leq%20100)

### Output Format
You must print the following ![$3$](https://latex.codecogs.com/svg.latex?3) lines:

1. A decimal representing of the fraction of positive numbers in the array compared to its size.
2. A decimal representing of the fraction of negative numbers in the array compared to its size.
3. A decimal representing of the fraction of zeros in the array compared to its size.

### Sample Input 0
```
6
-4 3 -9 0 4 1         
```

### Sample Output 0
```
0.500000
0.333333
0.166667
```

### Explanation 0
There are ![$3$](https://latex.codecogs.com/svg.latex?3) positive numbers, ![$2$](https://latex.codecogs.com/svg.latex?2) negative numbers, and ![$1$](https://latex.codecogs.com/svg.latex?1) zero in the array.
The proportions of occurrence are positive: ![$\frac{3}{6} = 0.500000$](https://latex.codecogs.com/svg.latex?\frac{3}{6}%20=%200.500000), negative: ![$\frac{1}{6} = 0.166667$](https://latex.codecogs.com/svg.latex?\frac{2}{6}%20=%200.333333) and zeros: ![$\frac{1}{6} = 0.166667$](https://latex.codecogs.com/svg.latex?\frac{1}{6}%20=%200.166667).

## :exclamation: Submit
### Solved code
(Important part only)
``` java
static void plusMinus(int[] arr) {
    int arr_len = arr.length;
    double total[] = {0, 0, 0};
    for (int i = 0; i < arr_len; i++) {
        if (arr[i] > 0) total[0]++;
        else if (arr[i] < 0) total[1]++;
        else if (arr[i] == 0) total[2]++;
    }

    String out = "";
    for (int i = 0; i < total.length; i++) {
        System.out.printf("%.6f%s", total[i] / arr_len, "\n");
    }
}
```

### Commentary
- 풀이 필요 x

### Discussion
- [ ] x

### References
- (If there is any reference)