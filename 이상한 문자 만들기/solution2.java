public String solution2(String s) {
    String[] words = s.split(" ", -1);
    StringBuilder answer = new StringBuilder();

    for (int i = 0; i < words.length; i++) {
        answer.append(transformWord(words[i]));
        
        if (i < words.length - 1) {
            answer.append(" ");
        }
    }
    return answer.toString();
}

private String transformWord(String word) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < word.length(); i++) {
        if (i % 2 == 0) sb.append(Character.toUpperCase(word.charAt(i)));
        else sb.append(Character.toLowerCase(word.charAt(i)));
    }
    return sb.toString();
}
