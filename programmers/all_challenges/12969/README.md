- Elapsed time: ???

# 직사각형 별찍기
출처: https://programmers.co.kr/learn/courses/30/lessons/12969

## :question: Problem
이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.

### Function description
x

### Constraints
- `n`과 `m`은 각각 1000 이하인 자연수입니다.

### Input/Output example
- input
```
5 3
```
- 출력
```
*****
*****
*****
```

## :exclamation: Submit
### Solved code
(Important part only)
``` kotlin
fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)

    for (line in 0..b) {
        for (star in 0..a)
            print("*")
        println()
    }
}

```

### Commentary
- 별문제라 별 문제 없이 풀었다.
- 자바로 풀었던 문제들 코틀린으로 다시 푸는중 -> 확실히 코드가 짧고 간결

### Discussion
- [x] (번외)혹시나 하고 다른언어로도 풀어봤는데 풀이한 문제 갯수는 안올라가네

### References
- (If there is any reference)