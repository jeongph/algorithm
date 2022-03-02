Language: [English](./README.md) / [한글](./README_ko.md)
- Elapsed time: ???

# Time Conversion
Original: https://www.hackerrank.com/challenges/time-conversion/problem

## :question: Problem
Given a time in ![$12$](https://latex.codecogs.com/svg.latex?12)-[hour AM/PM format](https://en.wikipedia.org/wiki/12-hour_clock), convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

### Function Description
Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

- s: a string representing time in ![$12$](https://latex.codecogs.com/svg.latex?12) hour format

### Input Format
A single string ![$s$](https://latex.codecogs.com/svg.latex?s) containing a time in ![$12$](https://latex.codecogs.com/svg.latex?12)-hour clock format (i.e.: ![$hh:mm:ssAM$](https://latex.codecogs.com/svg.latex?hh:mm:ssAM) or ![$hh:mm:ssPM$](https://latex.codecogs.com/svg.latex?hh:mm:ssPM)), where ![$01 \leq hh \leq 12$](https://latex.codecogs.com/svg.latex?01%20\leq%20hh%20\leq%2012) and ![$00 \leq mm, ss \leq 59$](https://latex.codecogs.com/svg.latex?00%20\leq%20mm,%20ss%20\leq%2059).

### Constraints
- All input times are valid

### Output Format
Convert and print the given time in ![$24$](https://latex.codecogs.com/svg.latex?24)-hour format, where ![$00 \leq hh \leq 23$](https://latex.codecogs.com/svg.latex?00%20\leq%20hh%20\leq%2023).

### Sample Input 0
```
07:05:45PM
```

### Sample Output 0
```
19:05:45
```

## :exclamation: Submit
### Solved code
(Important part only)
``` java
static String timeConversion(String s) {
    String out = "";
    String str[] = s.split(":");
    String apm = s.substring(8, 10);

    if (apm.equals("PM")) {
        if (Integer.parseInt(str[0]) == 12) out = "12";
        else
            out = Integer.toString(Integer.parseInt(str[0]) + Integer.parseInt("12"));
        out += s.substring(2, 8);
    } else {
        if (Integer.parseInt(str[0]) == 12) out = "00";
        else out = s.substring(0, 2);
        out += s.substring(2, 8);
    }

    return out;
}
```

### Commentary
- 받아온 문자열을 `:`로 분할해서 시, 분, 초를 나눔

### Discussion
- [x]] 지금 와서 보니까 더 효율적으로 고민했어야 했는데 너무 문제대로 짠듯;

### References
- (If there is any reference)