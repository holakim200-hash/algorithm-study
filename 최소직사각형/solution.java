class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[] width = new int[sizes.length];
        int[] height = new int[sizes.length];
        
        for(int i = 0; i < sizes.length; i++) {
            width[i] = sizes[i][0];
            height[i] = sizes[i][1];
            
            if(width[i] < height[i]) {
                int temp = width[i];
                width[i] = height[i];
                height[i] = temp;
            }
        }

        int width_M = width[0];
        int height_M = height[0]; 
        
        for (int w : width) {
            if (w > width_M) {
                width_M = w;
            }
        }

        for (int h : height) {
            if (h > height_M) {
                height_M = h;
            }
        }

        answer = width_M * height_M;
        return answer;
    }
}
