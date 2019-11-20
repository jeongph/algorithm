class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        int pLen = participant.length;
        int cLen = completion.length;

        for( int i = 0; i < cLen; i++ )
        {
            int location = is_in(completion[i], participant);
            if( location >= 0 )
            {
                participant[location] = "N";
                completion[i] = "";
            }
        }

        for( int i = 0; i < pLen; i++ )
        {
            if( !participant[i].equalsIgnoreCase("N") ) answer = participant[i];
        }
        return answer;
    }

    static int is_in( String temp, String arr[] )
    {
        for( int i = 0; i < arr.length; i++ )
        {
            if( temp.equalsIgnoreCase(arr[i]) ) return i;
        }
        return -1;
    }
}