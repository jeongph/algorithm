# :bookmark_tabs: [문자열 내 마음대로 정렬하기][title]

## :question: Problem
문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 예를 들어 strings가 [sun, bed, car]이고 n이 1이면 각 단어의 인덱스 1의 문자 u, e, a로 strings를 정렬합니다.

### :information_source: Function description
- strings : 문자열로 구성된 리스트(배열)
- n : 인덱스 n
- __return__ : 인덱스 기준으로 오름차순으로 정렬된 배열

### :warning: Constraints
- strings는 길이 1 이상, 50이하인 배열입니다.
- strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
- strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
- 모든 strings의 원소의 길이는 n보다 큽니다.
- 인덱스 n의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.

### :arrow_right: Input format example

### :arrow_left: Output format example

## :white_check_mark: Submit
### Solved code
(Important part only)
``` java
    public String[] solution(String[] strings, int n) {
        int len = strings.length;
        String[] answer = new String[len];

        for(int i = 0; i < len; i++ )
        {
            String temp = strings[i].charAt(n) + strings[i];
            strings[i] = temp;
        }
        Arrays.sort(strings);

        for(int i = 0; i < len; i++ )
        {
            answer[i] = strings[i].substring(1, strings[i].length());
        }

        return answer;
    }
```
### Commentary
- 어짜피 사전순으로 배열 출력할 것이기 때문에, n번째 위치만 기준이 될 뿐 정렬하는것은 동일함.
- 따라서 맨앞에 구분자를 사전적으로 추가하고 해당 배열을 그냥 sort메소드에 넣어서 정렬
- 배열 크기만큼 for문 돌아서 새로운 형태(사전 정렬을 위한)로 기존의 문자열 수정
- 수정된 정렬 가능한 문자열 배열을 메소드를 사용하여 정렬
- 정렬된 순서대로 앞에 정렬을 위해 사용한 인덱스를 빼고 answer에 추가
- 리턴 
### Discussion
- 원레 key-value로 풀려고 했던 방법으론 힘든가?
- comparator를 사용한 풀이가 더 확실해보이긴 한다.

### References
(If there is any reference)

[title]: https://programmers.co.kr/learn/courses/30/lessons/12915