Language: [English](./README.md) / [한글](./README_ko.md)
- Elapsed time: ???

# Mini-Max Sum
Original: https://www.hackerrank.com/challenges/mini-max-sum/problem

## :question: Problem
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

For example, ![$arr = [1, 3, 5, 7, 9]$](https://latex.codecogs.com/svg.latex?arr%20=%20[1,%203,%205,%207,%209]). Our minimum sum is ![$1 + 3 + 5 + 7 = 16$](https://latex.codecogs.com/svg.latex?1%20+%203%20+%205%20+%207%20=%2016) and our maximum sum is ![$3 + 5 + 7 + 9 = 24$](https://latex.codecogs.com/svg.latex?3%20+%205%20+%207%20+%209%20=%2024). We would print
```
16 24
```

### Function Description
Complete the miniMaxSum function in the editor below. It should print two space-separated integers on one line: the minimum sum and the maximum sum of ![$4$](https://latex.codecogs.com/svg.latex?4) of ![$5$](https://latex.codecogs.com/svg.latex?5) elements.

miniMaxSum has the following parameter(s):

- arr: an array of ![$5$](https://latex.codecogs.com/svg.latex?5) integers

### Input Format
A single line of five space-separated integers.

### Constraints
![$1 \leq arr[i] \leq 10^9$](https://latex.codecogs.com/svg.latex?1%20\leq%20arr[i]%20\leq%2010^9)

### Output Format
Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)

### Sample Input 0
```
1 2 3 4 5
```

### Sample Output 0
```
10 14
```

### Explanation 0
Our initial numbers are ![$1$](https://latex.codecogs.com/svg.latex?1), ![$2$](https://latex.codecogs.com/svg.latex?2), ![$3$](https://latex.codecogs.com/svg.latex?3), ![$4$](https://latex.codecogs.com/svg.latex?4), and ![$5$](https://latex.codecogs.com/svg.latex?5). We can calculate the following sums using four of the five integers:
1. If we sum everything except ![$1$](https://latex.codecogs.com/svg.latex?1), our sum is ![$2 + 3 + 4 + 5 = 14$](https://latex.codecogs.com/svg.latex?2%20+%203%20+%204%20+%205%20=%2014).
2. If we sum everything except ![$2$](https://latex.codecogs.com/svg.latex?2), our sum is ![$1+3+4+5=13$](https://latex.codecogs.com/svg.latex?1+3+4+5=13).
3. If we sum everything except ![$3$](https://latex.codecogs.com/svg.latex?3), our sum is ![$1+2+4+5=12$](https://latex.codecogs.com/svg.latex?1+2+4+5=12).
4. If we sum everything except ![$4$](https://latex.codecogs.com/svg.latex?4), our sum is ![$1+2+3+5=11$](https://latex.codecogs.com/svg.latex?1+2+3+5=11).
5. If we sum everything except ![$5$](https://latex.codecogs.com/svg.latex?5), our sum is ![$1+2+3+4=10$](https://latex.codecogs.com/svg.latex?1+2+3+4=10).
__Hints:__ Beware of integer overflow! Use 64-bit Integer.

## :exclamation: Submit
### Solved code
(Important part only)
``` java
static void miniMaxSum(int[] arr) {
    long sum[] = {0, 0, 0, 0, 0};

    int arrlen = arr.length;
    int pointer = 0;
    for (int i = 0; i < arrlen; i++) {
        for (int j = 0; j < arrlen; j++) {
            if (j == i) continue;
            sum[pointer] += arr[j];
        }
        pointer++;
    }

    long max = 0;
    long min = sum[0];
    for (int i = 0; i < sum.length; i++) {
        if (sum[i] > max) max = sum[i];
        if (sum[i] < min) min = sum[i];
    }
    System.out.printf("%d %d", min, max);
}
```

### Commentary
- 풀이 필요 x

### Discussion
- [ ] x

### References
- (If there is any reference)