public String solution(String s) {
    char[] chars = s.toCharArray(); // C언어의 char arr[]와 거의 같음
    int idx = 0;
    
    for (int i = 0; i < chars.length; i++) {
        if (chars[i] == ' ') {
            idx = 0;
        } else {
            // 이제 chars[i]를 직접 가져와서 수정 가능!
            if (idx % 2 == 0) chars[i] = Character.toUpperCase(chars[i]);
            else chars[i] = Character.toLowerCase(chars[i]);
            idx++;
        }
    }
    return new String(chars); // char 배열을 다시 String으로 합쳐서 반환
}
