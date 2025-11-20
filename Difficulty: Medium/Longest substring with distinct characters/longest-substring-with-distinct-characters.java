class Solution {
    public int longestUniqueSubstr(String s) {
    int n =s.length() , res =0;
    
        for (int i = 0; i < n; i++) {
    boolean[] visited=new boolean[256];
for(int j=i;j<n;j++ ){
    char c=s.charAt(j);
      
    if(visited[c]){
       break;
       }else {
    visited[c] = true;
    res = Math.max(res, j - i + 1);
}
    }
        }

    return res;
    }
}