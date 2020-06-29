- Elapsed time: ???

# 곱셈
출처: https://www.acmicpc.net/problem/2588

## :question: Problem
(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.

![](https://www.acmicpc.net/upload/images/f5NhGHVLM4Ix74DtJrwfC97KepPl27s%20(1).png)

(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
## Input/Output example
### Input
첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

### Output
첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.

## :exclamation: Submit
### Solved code
(Important part only)
``` java
public static void main( String[] args )
{
    Scanner in = new Scanner( System.in );
    String a = null, b = null;
    int aint, bint, a1, a10, a100;

    b = in.nextLine();
    a = in.nextLine();

    aint = Integer.parseInt( a );
    bint = Integer.parseInt( b );

    a1 = aint % 10;
    a10 = (aint % 100 - a1) / 10;
    a100 = aint / 100;

    System.out.println( bint * a1 );
    System.out.println( bint * a10 );
    System.out.println( bint * a100 );
    System.out.println( bint * aint );
}
```

### Commentary
- 조금 난잡하게 풀긴 했지만, 풀이는 필요 없을 정도
- 각 자릿수 그냥 곱해서 출력해주면 됨

### Discussion
- [ ] 다시 보니까 함수화 할 걸 그랬다.

### References
- (If there is any reference)