# :bookmark_tabs: [직사각형 별찍기][title]

## :question: Problem
이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.

### :information_source: Function description
X

### :warning: Constraints
- n과 m은 각각 1000 이하인 자연수입니다.

### :arrow_right: Input format example
5 3

### :arrow_left: Output format example
```
*****
*****
*****
```

## :white_check_mark: Submit
### Solved code
(Important part only)
``` java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i = 0; i < b; i++ )
        {
            for(int j = 0; j < a; j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
```
### Commentary
- 별찍기 문제... 그중에서도 꽤 쉬운 편에 속하는
- 별문제라 별 문제 없이 풀었다.

### Discussion
- [ ] (번외)혹시나 하고 다른언어로도 풀어봤는데 풀이한 문제 갯수는 안올라가네

### References
(If there is any reference)

[title]: https://programmers.co.kr/learn/courses/30/lessons/12969