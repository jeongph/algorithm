class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int len = s.length();

        for(int i = 0; i < len; i++)
		{
			char temp = s.charAt(i);
			if( (int)temp != 32 )
			{
				if(temp >= 65 && temp <= 90 && (temp+n) > 90) temp = (char)((temp + n) - 90 + 65 -1);
				else if(temp >= 97 && temp <= 122 && (temp+n) > 122) temp = (char)((temp + n) - 122 + 97 -1);
				else temp += n;
			}

			answer += temp;
		}

        return answer;
    }

    public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.solution("a B z", 4));
	}
}