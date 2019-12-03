# :bookmark_tabs: [단어 공부][title]

## :question: Problem
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

### :information_source: Function description
- 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다.
- 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

### :warning: Constraints
주어지는 단어의 길이는 1,000,000을 넘지 않는다.

### :arrow_right: Input format example
` Mississipi `

### :arrow_left: Output format example
` ? `

## :white_check_mark: Submit
### Solved code
(Important part only)
``` java
public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );

		Map<Character, Integer> map = new HashMap<>();

		String in_str = in.next();
		in_str = in_str.toLowerCase();
		for( int i = 0; i < in_str.length(); i++ )
		{
			char temp_ch = in_str.charAt( i );
			if( map.containsKey( temp_ch ) ) map.put( temp_ch, (map.get( temp_ch ) + 1) );
			else map.put( temp_ch, 1 );
		}

		int max = 0;
		int isOver = 0;
		char save_key = ' ';
		for(char key: map.keySet())
		{
			if( map.get(key) >= max )
			{
				save_key = key;
				isOver = max;
				max = map.get(key);

			}
		}

		if( max == isOver ) System.out.println( '?' );
		else System.out.println(Character.toUpperCase( save_key ));
	}
```
### Commentary
- 제일 먼저 든 생각은 각각의 단어를 키값으로 저장하고 나올때마다 1씩 증감시켜서 최종적으로 갯수를 구하는 것.
- Key-Value 쌍으로 구하려면 java로 Map이 최적일거라고 추측
- (흠.. 코드 아주 비효율적이군) 일단 추측한대로 Map으로 생성, map에 키값이 들어있다면 +1시키고, 없다면 1을 추가로 put
- 데이터를 Map에 모두 쌓았다면 다시 Map에 있는걸 꺼내면서 최대값과 그때의 키값 비교
- 중복인경우 '?'를 출력해야 하기 때문에, 중복값을 체크하기 위해 isOver로 이전값을 임시저장
- 중복이라면 ?, 아닌경우 uppercase로 출력

### Discussion
- Map에 적재하는 과정/ Map에서 최대값을 찾는 과정을 메소드로 구현하는것도 마이크로아키텍쳐로 가는 과정인가?
- 생각대로 코딩했기 때문에, 묘하게 데이터를 쌓는 과정과 다시 뽑아내는 과정에서 반복문이 많이 쓰이는게 거슬리는데 이걸 간략화 한다면 더 좋을 것 같다.
- 저번처럼 노트부터 꺼내서 일단 생각나는걸 적어보고 알고리즘을 만든 후에 코딩에 들어가는 것이 더 깔끔하게 코딩되는거 같다.
- 당장에 떠오르는 방법이 없어서 일단 중복체크를 "이전 값 임시저장"이라는 방법을 사용했는데 이거 뭔가 더 효율적인 방법이 있을 것 같다.

### References
1. [Java Map 메소드 참조](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html)
2. [Char toUpperCase 참조](https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html#toUpperCase(char))

[title]: https://www.acmicpc.net/problem/1157
