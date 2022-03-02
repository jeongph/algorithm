Language: [English](./README.md) / [한글](./README_ko.md)
- Elapsed time: ???

# Title_here
Original: 

## :question: Problem

### Function Description

### Input Format

### Constraints

### Output Format

### Sample Input 0

### Sample Output 0

### Explanation 0

## :exclamation: Submit
### Solved code
(Important part only)
``` java
```

### Commentary
- (1분차이 아쉽군..) 캥거루 녀석들을 우습게 봤는데 생각보다 쉬운문제였다.
- 일단 한녀석을 x1+v1\*n 즉 초기값 + n씩 증가하도록 유도, 나머지 녀석도 마찬가지로 계산 x2+v2\*n
- 이렇게 값이 무한대로 가정하면, 0을 찾는건 쉽지만 언제까지 달려나가야 하는지 모르므로 pre값인 이전값과 비교하기로 한다.
- x1 - x2과 v1\*n - v2\*n을 계산해서 더한 값 즉 (x1 - x2) + (v1 - v2)n이 0으로 수렴해야 만날 수 있는거고 미친듯이 양수로뛰거나 음수로 뛰면 절때 못만남.
- 따라서 바로 이전값이 음수인데 음수로계속가면 NO, 이전값이 양수인데 계속 커지면 NO
- n을 하나씩 증가시키면서 0으로 수렴하면 YES 반환;

### Discussion
- [ ] x

### References
- (If there is any reference)