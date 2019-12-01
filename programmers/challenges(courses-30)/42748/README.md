# :bookmark_tabs: [K번째수][title]

## :question: Problem(문제)
배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
2에서 나온 배열의 3번째 숫자는 5입니다.

### :information_source: Function Description(함수 속성(매개변수, return 등))
- array: 배열
- commands: [i, j, k]를 원소로 가진 2차원 배열
- __return: commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열__

### :warning: Constraints(제약 조건)
- array의 길이는 1 이상 100 이하입니다.
- array의 각 원소는 1 이상 100 이하입니다.
- commands의 길이는 1 이상 50 이하입니다.
- commands의 각 원소는 길이가 3입니다.

### :arrow_left: input/Output Format example
| array                 | commands                          | return    |
| --------------------- | --------------------------------- | --------- |
| [1, 5, 2, 6, 3, 7, 4] | [[2, 5, 3], [4, 4, 1], [1, 7, 3]] | [5, 6, 3] |

## :white_check_mark: Submit
### Solved code
``` java
    public int[] arrCutNCopy(int[] in_arr, int p_start, int p_end)
    {
        int len = (p_end - p_start)+1;
        ArrayList<Integer> temp_al = new ArrayList<>();

        for(int i = p_start-1; i < p_end; i++ )
        {
            temp_al.add(in_arr[i]);
        }
        Collections.sort(temp_al);

        int[] out_arr = new int[len];
        for(int i = 0; i < len; i++ )
        {
            out_arr[i] = temp_al.get(i);
        }

        return out_arr;
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int p_commands_row = 0; p_commands_row < commands.length; p_commands_row++ )
        {
            int i = commands[p_commands_row][0];
            int j = commands[p_commands_row][1];
            int k = commands[p_commands_row][2];

            int[] temp = arrCutNCopy(array, i, j);
            answer[p_commands_row] = temp[k-1];
        }

        return answer;
    }
```
### Commentary
- 먼저, return 할 answer을 commands의 행 갯수만큼 생성.
- 그리고 그만큼 반복문을 돌면서 i, j, k값 도출 및 arrCutNCopy 함수를 만들어 별도로 배열을 잘라서 가져옴
- arrCutNCopy는 받아온 배열과 시작지점, 종료지점을 가지고 반복문을 돌면서 해당 위치를 배열로 만듦
- (시작지점과 종료지점은 랜덤값이므로 list로 생성)
- 리스트를 정렬하는건 list의 특성상 Collections 메소드를 사용, 배열로 변환은 그냥 반복문으로 처리
- 해당 리턴값을 k위치에서 반환하여 결과를 리턴할 배열 answer에 반환
- 결과값 리턴

### Discussion
- [ ] Arraylist 사용이 최선인가?
- [ ] 예시에 없었지만 제약에 없으면 원래는 start지점이 end지점보다 클때 예외처리 했어야 할거다
- [ ] list -> array의 효율적인 복사 방법?
- [ ] arrCutNCopy 함수로 분할하지 말고도 쉽게 구할 수 있는 방법?

[title]: https://programmers.co.kr/learn/courses/30/lessons/42748