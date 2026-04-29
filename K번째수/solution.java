import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int selected = commands[i][2];

            int[] new_arr = new int[end - start + 1];

            int index = 0;
            for(int j = start - 1; j < end; j++) {
                new_arr[index++] = array[j];
            }

            Arrays.sort(new_arr);

            answer[i] = new_arr[selected - 1];
        }
        return answer;
    }
}
