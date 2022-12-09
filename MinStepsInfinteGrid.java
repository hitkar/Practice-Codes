public class Solution {
    
    public int coverPoints(int[] A, int[] B) {
        int sum = 0;
        for(int i =1;i<A.length;i++){
            int h  = Math.abs(A[i] - A[i-1]);
            int w = Math.abs(B[i] - B[i-1]);
            
            sum += Math.max(h,w);
            
            
        }
        return sum;
    }
}
