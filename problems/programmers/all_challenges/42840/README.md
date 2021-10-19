---
layout: default
title: 모의고사
parent: Programmers
grand_parent: Problems
nav_order: 42840
---

- Elapsed time: 00:00:00
- Language: Java

<!-- 문제 -->
# 모의고사

[출처](https://programmers.co.kr/learn/courses/30/lessons/42840?language=java)

## 문제 설명

수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

## 제한 사항

- 시험은 최대 10,000 문제로 구성되어있습니다.
- 문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
- 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.

## 입출력 예

| answers     | return  |
| ----------- | ------- |
| [1,2,3,4,5] | [1]     |
| [1,3,2,4,2] | [1,2,3] |

## 입출력 예 설명

입출력 예 #1

- 수포자 1은 모든 문제를 맞혔습니다.
- 수포자 2는 모든 문제를 틀렸습니다.
- 수포자 3은 모든 문제를 틀렸습니다.
따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.

입출력 예 #2

- 모든 사람이 2문제씩을 맞췄습니다.

<!-- 풀이 -->
# 풀이

## Code

``` java
public int[] solution( int[] answers )
{
    int[] answer = { 0, 0, 0 };
    int ans[][] = { { 1, 2, 3, 4, 5 }, { 2, 1, 2, 3, 2, 4, 2, 5 }, { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };
    int pointer[] = { 0, 0, 0 };

    int c_answers = answers.length;
    int c_ans = pointer.length; // 수포자 3명
    for( int i = 0; i < c_answers; i++ ) // 일단 모든 문제를 돌아
    {
        for( int k = 0; k < c_ans; k++ ) // 각각의 문제를 수포자 배열 3개와 비교해야함
        {
            if( answers[i] == ans[k][pointer[k]] ) answer[k]++;
            pointer[k] = movePointer( pointer[k], ans[k].length );
        }
    }

    return calcRank( answer );
}

public int movePointer( int point, int max )
{
    int re_point = point;
    if( re_point + 1 >= max ) return 0;
    else return re_point + 1;
}

public int[] calcRank( int arr[] )
{
    int len = arr.length;
    int max = 0;
    ArrayList<Integer> re_arr = new ArrayList<>();

    for( int i = 0; i < len; i++ )
    {
        if( arr[i] > max )
        {
            re_arr.clear();
            max = arr[i];
            re_arr.add( i );
        }
        else if( arr[i] == max ) re_arr.add( i );
    }

    Collections.sort( re_arr );
    int temp[] = new int[re_arr.size()];
    for( int i = 0; i < re_arr.size(); i++ )
    {
        temp[i] = re_arr.get( i ) + 1;
    }

    return temp;
}
```

## Commentary

- 중요한건 수포자 3명이 찍는 방식이 고정의 어떤 `루틴`이 있다는 것
- 정해진 규칙(?)대로 함수를 일단 고정 생성 (수포자 1, 2, 3)
- 들어온 답지를 처음부터 끝까지 돌면서 정해진 수포자들의 규칙과 비교하며 정답인지 판단하고 `pointer` 배열에 넣음
- 수포자들의 답지가 길이가 똑같지 않고, `movePointer` 함수는 그냥 `for`문이 너무 더러워질 것 같아서 외부로 빼서 제작
- 정답의 갯수를 가지고 있는 배열 `answer`를 정렬하는 함수 `calcRank`에 돌려서 리턴

## Discussion

- [x] 문제를 풀면 그때 생각했던 풀이 방식을 바로바로 적어놔야 까먹지 않을 것 같다.

## References
- x