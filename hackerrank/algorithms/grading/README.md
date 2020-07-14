Language: [English](./README.md) / [한글](./README_ko.md)
- Elapsed time: ???

# Grading Students
Original: https://www.hackerrank.com/challenges/grading/problem

## :question: Problem
HackerLand University has the following grading policy:

- Every student receives a $grade$ in the inclusive range from $0$ to $100$.
- Any $grade$ less than $40$ is a failing grade.

Sam is a professor at the university and likes to round each student's $grade$ according to these rules:
- If the difference between the $grade$ and the next multiple of $5$ is less than $3$, round $grade$ up to the next multiple of $5$.
- If the value of $grade$ is less than $38$, no rounding occurs as the result will still be a failing grade.

For example, $grade = 84$ will be rounded to $85$ but $grade = 29$ will not be rounded because the rounding would result in a number that is less than $40$.
Given the initial value of $grade$ for each of Sam's $n$ students, write code to automate the rounding process.

### Function Description
Complete the function gradingStudents in the editor below. It should return an integer array consisting of rounded grades.

gradingStudents has the following parameter(s):

- grades: an array of integers representing grades before rounding

### Input Format
- The first line contains a single integer, $n$, the number of students.
- Each line $i$ of the $n$ subsequent lines contains a single integer, $grades[i]$, denoting student $i$'s grade.

### Constraints
- $1 \leq n \leq 60$
- $0 \leq grades[i] \leq 100$

### Output Format
For each $grades[i]$, print the rounded grade on a new line.

### Sample Input 0
```
4
73
67
38
33
```

### Sample Output 0
```
75
67
40
33
```

### Explanation 0
![image](https://s3.amazonaws.com/hr-challenge-images/0/1484768684-54439977a1-curving2.png)
1. Student $1$ received a $73$, and the next multiple of $5$ from $73$ is $75$. Since $75 - 73 < 3$, the student's grade is rounded to $75$.
2. Student $2$ received a $67$, and the next multiple of $5$ from $67$ is $70$. Since $70 - 67 = 3$, the grade will not be modified and the student's final grade is $67$.
3. Student $3$ received a $38$, and the next multiple of $5$ from $38$ is $40$. Since $40 - 38 < 3$, the student's grade will be rounded to $40$.
4. Student $4$ received a grade below $38$, so the grade will not be modified and the student's final grade is $33$.

## :exclamation: Submit
### Solved code
(Important part only)
``` java
static int[] gradingStudents(int[] grades) {
    int len = grades.length;
    for (int i = 0; i < len; i++) {
        if (grades[i] < 38) continue;
        else {
            int sub = (grades[i] + 5) % 5;
            if ((sub) > 2) grades[i] += (5 - sub);
        }
    }
    return grades;
}
```

### Commentary
- 일단 38이하의 낙제점은 모두 원래랑 동일한 점수로 출력해버린다.
- 이제 낙제가 아닌 점수가 문젠데, 5를 더해서 생각한다면 5로 나눈 나머지가 (5 - sub)값으로 출력된다.
- 근데 이게 뺀 값이니까 반대로 3보다 작은게 아니고 2보다 큰 경우로 계산.
- 2보다 큰 경우는 자신이 5를 더하고 5로 나눠서 나온 값을 5에서 빼서 다시 재합산하면 원래 계산하려고 했던 값이 나온다.
- 그대로 배열에 다시 재입력하여 출력.

### Discussion
- [ ] x

### References
- (If there is any reference)