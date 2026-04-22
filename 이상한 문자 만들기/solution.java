class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] chars = s.split("");
        int idx = 0;

        for (String c : chars) {
            if (c.equals(" ")) {
                idx = 0;
                answer.append(" ");
            } else {
                answer.append(idx % 2 == 0 ? c.toUpperCase() : c.toLowerCase());
                idx++;
            }
        }
        
        return answer.toString();
    }
}
