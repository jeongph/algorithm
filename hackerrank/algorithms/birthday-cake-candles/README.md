Language: [English](./README.md) / [한글](./README_ko.md)
- Elapsed time: ???

# Birthday Cake Candles
Original: https://www.hackerrank.com/challenges/birthday-cake-candles/problem

## :question: Problem
You are in charge of the cake for your niece's birthday and have decided the cake will have one candle for each year of her total age. When she blows out the candles, she’ll only be able to blow out the tallest ones. Your task is to find out how many candles she can successfully blow out.

For example, if your niece is turning ![$4$](https://latex.codecogs.com/svg.latex?4) years old, and the cake will have ![$4$](https://latex.codecogs.com/svg.latex?4) candles of height ![$4$](https://latex.codecogs.com/svg.latex?4), ![$4$](https://latex.codecogs.com/svg.latex?4), ![$1$](https://latex.codecogs.com/svg.latex?1), ![$3$](https://latex.codecogs.com/svg.latex?3), she will be able to blow out ![$2$](https://latex.codecogs.com/svg.latex?2) candles successfully, since the tallest candles are of height ![$4$](https://latex.codecogs.com/svg.latex?4) and there are ![$2$](https://latex.codecogs.com/svg.latex?2) such candles.

### Function Description
Complete the function `birthdayCakeCandles` in the editor below. It must return an integer representing the number of candles she can blow out.

birthdayCakeCandles has the following parameter(s):

- ar: an array of integers representing candle heights

### Input Format
The first line contains a single integer, ![$n$](https://latex.codecogs.com/svg.latex?n), denoting the number of candles on the cake.
The second line contains ![$n$](https://latex.codecogs.com/svg.latex?n) space-separated integers, where each integer ![$i$](https://latex.codecogs.com/svg.latex?i) describes the height of candle ![$i$](https://latex.codecogs.com/svg.latex?i).

### Constraints
- ![$1 \leq n \leq 10^5$](https://latex.codecogs.com/svg.latex?1%20\leq%20n%20\leq%2010^5)
- ![$1 \leq ar[i] \leq 10^7$](https://latex.codecogs.com/svg.latex?1%20\leq%20ar[i]%20\leq%2010^7)

### Output Format
Return the number of candles that can be blown out on a new line.

### Sample Input 0
```
4
3 2 1 3
```

### Sample Output 0
```
2
```

### Explanation 0
We have one candle of height ![$1$](https://latex.codecogs.com/svg.latex?1), one candle of height ![$2$](https://latex.codecogs.com/svg.latex?2), and two candles of height ![$3$](https://latex.codecogs.com/svg.latex?3). Your niece only blows out the tallest candles, meaning the candles where ![$height = 3$](https://latex.codecogs.com/svg.latex?height%20=%203). Because there are ![$2$](https://latex.codecogs.com/svg.latex?2) such candles, we print ![$2$](https://latex.codecogs.com/svg.latex?2) on a new line.

## :exclamation: Submit
### Solved code
(Important part only)
``` java
static int birthdayCakeCandles(int[] ar) {
    int len = ar.length;

    int max = 0;
    int count = 0;
    for (int i = 0; i < len; i++) {
        if (ar[i] > max) {
            max = ar[i];
            count = 1;
        } else if (ar[i] == max) count++;
    }
    return (count);
}
```

### Commentary
- 풀이 필요 x

### Discussion
- [ ] x

### References
- (If there is any reference)