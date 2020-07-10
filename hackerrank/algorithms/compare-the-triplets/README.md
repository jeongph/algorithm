Language: [English](./README.md) / [한글](./README_ko.md)
- Elapsed time: ???

# Compare the Triplets
Original: https://www.hackerrank.com/challenges/compare-the-triplets/problem

## :question: Problem
Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.

The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]), and the rating for Bob's challenge is the triplet b = (b[0], b[1], b[2]).

The task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].

- If a[i] > b[i], then Alice is awarded 1 point.
- If a[i] , then Bob is awarded 1 point.
- If a[i] = b[i], then neither person receives a point.
Comparison points is the total points a person earned.

Given a and b, determine their respective comparison points.

### Example
a = [1, 2, 3]
b = [3, 2, 1]
- For elements `*0*`, Bob is awarded a point because a[0] .
- For the equal elements a[1] and b[1], no points are earned.
- Finally, for elements 2, a[2] > b[2] so Alice receives a point.
The return array is [1, 1] with Alice's score first and Bob's second.

### Function Description
Complete the function compareTriplets in the editor below.

compareTriplets has the following parameter(s):

- __int a[3]: Alice's challenge rating__
- __int b[3]: Bob's challenge rating__

### Return
- int[2]: Alice's score is in the first position, and Bob's score is in the second.

### Input Format
The first line contains 3 space-separated integers, a[0], a[1], and a[2], the respective values in triplet a.
The second line contains 3 space-separated integers, b[0], b[1], and b[2], the respective values in triplet b.

### Constraints
- 1 ≤ a[i] ≤ 100
- 1 ≤ b[i] ≤ 100

### Sample Input 0
```
5 6 7
3 6 10
```

### Sample Output 0
```
1 1
```

### Explanation 0
In this example:
- ![$a=(a[0], a[1], a[2]) = (5, 6, 7)$](https://latex.codecogs.com/svg.latex?a=(a[0],%20a[1],%20a[2])%20=%20(5,%206,%207))
- ![$b=(b[0], b[1], b[2]) = (3, 6, 10)$](https://latex.codecogs.com/svg.latex?b=(b[0],%20b[1],%20b[2])%20=%20(3,%206,%2010))

Now, let's compare each individual score:

- ![$a[0] > b[0]$](https://latex.codecogs.com/svg.latex?a[0]%20%3E%20b[0]),so Alice receives ![$1$](https://latex.codecogs.com/svg.latex?1) point.
- ![$a[1] = b[1]$](https://latex.codecogs.com/svg.latex?a[1]%20=%20b[1]), so nobody receives a point.
- ![$a[2] < b[2]$](https://latex.codecogs.com/svg.latex?a[2]%20%3C%20b[2]), so Bob receives  point.
Alice's comparison score is ![$1$](https://latex.codecogs.com/svg.latex?1), and Bob's comparison score is ![$1$](https://latex.codecogs.com/svg.latex?1). Thus, we return the array ![$[1, 1]$](https://latex.codecogs.com/svg.latex?[1,%201]).

### Sample Input 1
```
17 28 30
99 16 8
```

### Sample Output 1
```
2 1
```

### Explanation 1
Comparing the ![$0^{th}$](https://latex.codecogs.com/svg.latex?0^{th}) elements, ![$17 < 99$](https://latex.codecogs.com/svg.latex?17%20%3C%2099) so Bob receives a point.


Comparing the ![$1^{st}$](https://latex.codecogs.com/svg.latex?1^{st}) and ![$2^{nd}$](https://latex.codecogs.com/svg.latex?2^{nd}) elements, ![$28 < 16$](https://latex.codecogs.com/svg.latex?28%20%3C%2016) and ![$30 > 8$](https://latex.codecogs.com/svg.latex?30%20%3E%208) so Alice receives two points.

The return array is ![$[2, 1]$](https://latex.codecogs.com/svg.latex?[2,%201]).

## :exclamation: Submit
### Solved code
(Important part only)
``` java
static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    List return_num = new ArrayList();
    int alice_win = 0;
    int bob_win = 0;

    for (int i = 0; i < 3; i++) {
        int numa = a.get(i);
        int numb = b.get(i);

        if (numa > numb)
            alice_win++;
        else if (numa < numb)
            bob_win++;
        else {

        }
    }

    return_num.add(0, alice_win);
    return_num.add(1, bob_win);

    return return_num;
}
```

### Commentary

### Discussion
- [ ] x

### References
- (If there is any reference)