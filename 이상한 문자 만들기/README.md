## 문제 설명
문자열을 받아 짝수번째 알파벳은 대문자로 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수를 완성하시오<br>
s<br>
"try hello world"<br><br>
return<br>
"TrY HeLlO WoRlD"<br><br>

solution.java(split으로 재배열)<br>
solution2.java(toCharArray 활용)<br>
solution3.java(메서드 활용)<br>

## 어려웠던 점
문자열 안에서 띄워쓰기를 기준으로 홀짝 카운팅을 다시 해야 한다는 점

## 새로 배운 점
String으로 받아서 StringBuilder에 append로 자유롭게 추가한 뒤 .toString으로 return하는 점<br>
배열과 문자열 리터럴의 차이<br>
