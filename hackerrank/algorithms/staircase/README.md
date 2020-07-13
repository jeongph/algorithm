Language: [English](./README.md) / [한글](./README_ko.md)
- Elapsed time: ???

# Staircase
Original: https://www.hackerrank.com/challenges/staircase/problem

## :question: Problem
Consider a staircase of size ![$n = 4$](https://latex.codecogs.com/svg.latex?n%20=%204):
```
   #
  ##
 ###
####
```
Observe that its base and height are both equal to ![$n$](https://latex.codecogs.com/svg.latex?n), and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size ![$n$](https://latex.codecogs.com/svg.latex?n).

### Function Description
Complete the staircase function in the editor below. It should print a staircase as described above.

staircase has the following parameter(s):

- n: an integer

### Input Format
A single integer, ![$n$](https://latex.codecogs.com/svg.latex?n), denoting the size of the staircase.

### Constraints
![$0 < n \leq 100$](https://latex.codecogs.com/svg.latex?0%20%3C%20n%20\leq%20100).

### Output Format
Print a staircase of size ![$n$](https://latex.codecogs.com/svg.latex?n) using # symbols and spaces.

Note: The last line must have ![$0$](https://latex.codecogs.com/svg.latex?0) spaces in it.

### Sample Input 0
```
6 
```

### Sample Output 0
```
     #
    ##
   ###
  ####
 #####
######
```

### Explanation 0
The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of ![$n = 6$](https://latex.codecogs.com/svg.latex?n%20=%206).

## :exclamation: Submit
### Solved code
(Important part only)
``` java
static void staircase(int n) {
    for (int i = n; i > 0; i--) {
        for (int j = 1; j <= n; j++) {
            if (j < i) System.out.print(" ");
            else System.out.print("#");
        }
        System.out.println();
    }
}
```

### Commentary
- (크 영어판 별찍기;) 풀이 필요 x

### Discussion
- [ ] x

### References
- (If there is any reference)