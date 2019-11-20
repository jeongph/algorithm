# [Migratory Birds]

## Problem
당신은 대륙을 횡단하는 철새들의 개체 조사에 도움을 요청 받았다.
각 타입의 새들을 당신은 정수값으로 구분하려고 한다.
특별한 종의 새들이 스팟(?)될때, 그 id 숫자를 당신의 배열에 추가한다.
당신은 그 배열에서 어떤 타입의 새가 가장 일반적인 종류인지 알고싶다.
당신은 그 새 종을 출력하고, 중복된 값이 있다면 더 작은 ID를 출력하면 된다.

## Function Description
Complete the migratoryBirds function in the editor below. It should return the lowest type number of the most frequently sighted bird.
migratoryBirds has the following parameter(s):
- arr: an array of integers representing types of birds sighted

## Input Format
The first line contains an integer denoting ***n***, the number of birds sighted and reported in the array ***arr***. 
The second line describes ***arr*** as ***n*** space-separated integers representing the type numbers of each bird sighted.

## Output Format
Print the type number of the most common bird; if two or more types of birds are equally common, choose the type with the smallest ID number.

## Submit
<pre><code> # 중요 코드
    static int migratoryBirds(List<Integer> arr)
    {
        HashMap<Integer, Integer> type = new HashMap<Integer, Integer>();
        int c_Birds = arr.size();

        int temp_type = 0;
        int ret = 0;

        for( int i = 0; i < c_Birds; i++ )
        {
            int temp = arr.get(i);
            if( type.containsKey(temp) )
                type.put( temp, (type.get(temp) + 1) );
            else
                type.put(temp, 1);

            if( type.get(temp) > ret )
            {
                temp_type = temp;
                ret = type.get(temp);
            }
            else if( type.get(temp) == ret )
            {
                if( temp < temp_type)
                {
                    temp_type = temp;
                    ret = type.get(temp);
                }
            }
        }

        return temp_type;
    }
</code></pre>
- 맨첨에 배열로할까 리스트로 할까 했는데, 이미 예제가 ID값이 순차적이지 않아서 map을 선택
- 각각 대입되는 Key와 Value를 가지고 Type id와 매개체 개수를 구분하면 딱 좋을 것 같았음
- 먼저 개채를 위한 Hashmap type을 지정하고 for문으로 arr의 갯수만큼 돌림
- 각 arr의 요소를 꺼내보면서 이게 type에 있는 Key값이면 기존값을 1개 증가시키고, 없으면 1로 초기화
- 다 꺼내봤을 때 다시 반복문을 쓰기 아까워서 해당 type에서 temp상태의 값를 꺼내어 확인하고 이보다 큰 값이 있다면 그걸 temp_type에 지정
- (원래 갯수를 출력하는줄 착각해서 이름이 ret)만약에 ret 값이 중복이라면 더 작은 값으로 temp_type을 대체
- temp_type을 리턴  

[Migratory Birds]: https://www.hackerrank.com/challenges/migratory-birds/problem