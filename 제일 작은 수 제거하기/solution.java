class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length == 1)
        {
            return new int[]{-1};
        }
        
        int minimum = arr[0];
        
        for(int i = 1; i < arr.length; i++)
        {
            if(minimum > arr[i])
            {
                minimum = arr[i];
            }
        }
        
        int[] new_arr = new int [arr.length-1];
        int j = 0;
        
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] == minimum)
            {
                continue;
            }
            new_arr[j++] = arr[i];
        }
        return new_arr;
    }
}
