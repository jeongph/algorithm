class Solution {
  public String solution(int n) {
    String s = "";
    for(int i = 0; i < n; i++){
        s += (i%2==0 ? "수":"박");           
    }
    return s;  
  }  
}