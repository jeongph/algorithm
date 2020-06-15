- Elapsed time: ???

# 같은 숫자는 싫어
출처: https://programmers.co.kr/learn/courses/30/lessons/12906?language=java

## :question: Problem
배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,

- arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
- arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

### Function description
- arr : 배열 array
- __return__ : 연속적으로 나타나는 숫자는 제거하고 남은 수들

### Constraints
- 배열 arr의 크기 : 1,000,000 이하의 자연수
- 배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수

### Input/Output example
| arr             | answer    |
| --------------- | --------- |
| [1,1,3,3,0,1,1] | [1,3,0,1] |
| [4,4,4,3,3]     | [4,3]     |

## :exclamation: Submit
### Solved code
(Important part only)
``` java
public int[] solution( int[] arr )
{
    int[] answer;
    int len = arr.length;

    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add( arr[0] );

    for( int i = 1; i < len; i++ )
    {
        int temp = arr[i - 1];

        if( temp == arr[i] ) continue;
        else al.add( arr[i] );
    }

    answer = new int[al.size()];
    for( int i = 0; i < al.size(); i++ )
    {
        answer[i] = al.get( i );
    }

    return answer;
}
```

### Commentary
- 일단 시간문제로 빨리 풀긴 했다만 썩 맘에들진 않는 정답.. 효율도 통과;
- 처음엔 answer에 들어가는 변수가 몇갠지 모르니까 무조껀 arrayList를 생각하고 생성
- 그리고 ArrayList에 혹시나 하고 찾아보니까 `contains​(Object o)` 메소드가 있음(레퍼런스 참고)
- 해당 방법으로 풀이했지만, 잘 생각해보니 일련의 연속된 숫자가 아닌것은 또 넣어줘야 함(중복처리가 아니고 축약임)
- 따라서 이전값을 temp에 저장, 이전값과 현재값을 비교하고 다른값이 들어왔다면 늦게 들어온 값을 배열에 add
- 하지만 배열 참조를 -1번째를 할 수 없으니 (그냥 쉽게 풀기 위해) 1 index부터 참조하고 단, 0번째 인덱스는 무조껀 add
- 해당 ArrayList를 answer에 복사하고 리턴

### Discussion
- [ ] 아무리 생각해도 0번째 넣어놓고 뒤에꺼 넣는방법은 썩 좋은방법은 아닌 것 같음

### References
- [Java ArrayList Docs(java 13)](https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/util/ArrayList.html)