public class Solution {
    public int solve(int[] A, int B) {
        int sum = 0;
        for(int i =0;i<B;i++){
            sum += A[i];
        }
        
        int i = B-1;
        int j = A.length-1;
        int maxSum = sum;
        while(i >=0){
            int temp = sum - A[i] + A[j];
            sum = temp;
            maxSum = Math.max(maxSum, temp);
            i--;
            j--;
            
            
        }
        return maxSum;
    }
}
