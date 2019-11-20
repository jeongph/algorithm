# [The Hurdle Race]
## Problem
Dan은 그의 캐릭터가 장애물 달리기를 경쟁하는 컴퓨터게임 플레이어다.
허들(장애물)은 높이가 다양하고, Dan이 높이 뛸 수 있는 최대 높이가 있다.
마법의 물약을 먹으면 그의 최대높이가 1만큼 증가한다.
얼마나 많은 물약을 마셔야 모든 허들을 점프할 수 있는가.

## Function Description
Complete the hurdleRace function in the editor below. It should return the minimum units of potion Dan needs to drink to jump all of the hurdles.
hurdleRace has the following parameter(s):

- k: an integer denoting the height Dan can jump naturally
- height: an array of integers denoting the heights of each hurdle

## Input Format
The first line contains two space-separated integers ***n*** and ***k***, the number of hurdles and the maximum height Dan can jump naturally. 

## Output Format
Print an integer denoting the minimum doses of magic potion Dan must drink to complete the hurdle race.

## Submit
```java
// 중요 코드
    static int hurdleRace(int k, int[] height) {
        int max = 0;

        for(int i = 0; i < height.length; i++ )
        {
            if( height[i] > max ) max = height[i];
            else continue;
        }

        return max - k < 0 ? 0:max - k;
    }
```
- 어짜피 모든 허들을 넘고싶으면 최대높이의 허들만 넘을 수 있으면 된다.
- 따라서 배열의 모든 요소를 돌아서 최대값을 알아낸뒤 그 값에서 얼마만큼 물약을 먹어야 하는지 계산
- 시간이 얼마 없어서 그냥 for, if, 3항 연산자로 계산  

[The Hurdle Race]: https://www.hackerrank.com/challenges/the-hurdle-race/problem