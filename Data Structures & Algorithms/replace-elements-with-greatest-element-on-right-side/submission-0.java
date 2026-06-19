class Solution {
    public int[] replaceElements(int[] arr) {
        // initiate max = -1 
        // now iterate from right to left and update max with element 
        int max = -1;
        int n = arr.length - 1;
        for(int i = n;i>=0;i--){
            int localMax = max;
            max = Math.max(arr[i], max);
            arr[i] = localMax;
        }
        return arr;
    }
}