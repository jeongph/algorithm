# [Cats and a Mouse]

## Problem
두마리의 고양이와 쥐가 줄 위에(직선 말하는듯) 여러 포지션에 있다.
너는 그들의 시작지점을 받을것이다.
너의 할일은 어떤 고양이가 먼저 쥐에 닿는지 결정하는것이다, 쥐는 움직이지 않고 고양이는 같은속도로 움직인다고 가정한다.
만약에 고양이들이 동시에 도착하면 걔네끼리 다투게되고, 그사이 쥐는 움직여서 도망친다.
- ***A***고양이가 먼저 잡을경우 `Cat A`를 출력
- ***B*** 고양이가 먼저 잡을경우 `Cat B`를 출력
- 두 고양이가 동시에 도착할 경우 도망간 쥐를 `Mouse C`로 출력

각각 ***x***, ***y***, ***z***를 포함하는 쿼리들 ***q***가 주어지고, 이것에는 각각 고양이 A, B와 쥐 C의 위치가 들어있다. 

## Function Description
`catAndMouse`함수를 완성하세요. 아래에서 한가지가 출력되어야 합니다.
catAndMouse has the following parameter(s):
- x: an integer, Cat ***A***'s position
- y: an integer, Cat ***B***'s position
- z: an integer, Mouse ***C***'s position

## Input Format
첫줄은 ***q*** 쿼리의 갯수
각각의 쿼리 ***q***는 스페이스로 구분된 x(A고양이 위치), y(B고양이 위치), z(쥐 위치)로 구분된다.

## Output Format
각각의 쿼리에서 A, B, C를 출력하라.

## Submit
<pre><code> # 중요 코드
    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        if( Math.abs(z - x) < Math.abs(z - y) ) return "Cat A";
        else if( Math.abs(z - x) > Math.abs(z - y) ) return "Cat B";
        else return "Mouse C";
    }
</code></pre>
- (문제만 뭐 겁나 어려운거같고 왤케쉬워..?)
- 직선상의 위치니까 고양이는 앞으로나 뒤로 갈 수 있다. 
- 쥐는 당장 잡히지만 않으면 고려 할 필요가 없다.(잡히면 C로 출력하니까)
- 직선상에서 이동거리가 같으므로 각각의 거리는 n씩 이동한다고 가정(길이가 너무 길면 한번에 이동하는게 빠름)
- 그러므로, 이동하는 길이가 중요한게 아니고 각각의 거리가 얼만큼씩 벌어져있는지가 중요하다.
- 고로; 거리차이만 구해서 더 짧은애 출력하고 똑같으면 쥐가 이긴걸로 출력하면 됨.

[Cats and a Mouse]: https://www.hackerrank.com/challenges/cats-and-a-mouse/problem