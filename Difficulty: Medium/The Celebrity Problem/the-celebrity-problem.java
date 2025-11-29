class Solution {
    public int celebrity(int mat[][]) {
        int n = mat.length;
        Stack<Integer> st = new Stack<>();

        // Push all persons
        for(int i = 0; i < n; i++){
            st.push(i);
        }

        //  Find potential candidate
        while(st.size() > 1){
            int a = st.pop();
            int b = st.pop();

            // If a knows b, then a cannot be celebrity
            if(mat[a][b] == 1)
                st.push(b);
            else
                st.push(a);
        }

        if(st.size() == 0) return -1;

        int celeb = st.pop();

        // Verify celebrity
        for(int i = 0; i < n; i++){
            if(i == celeb) continue;

            // celeb should know no one
            if(mat[celeb][i] == 1) return -1;

            // everyone should know celeb
            if(mat[i][celeb] == 0) return -1;
        }

        return celeb;
    }
}
