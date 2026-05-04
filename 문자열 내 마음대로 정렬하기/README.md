## 문제 설명
문자열로 구성된 strings와 정수 n이 주어졌을 때, n 번째 글자를 기준으로 오름차순 정렬하려 합니다.

입출력 예<br>
s : ["sun", "bed", "car"]<br>
n : 1<br>
result : ["car", "bed", "sun"] <br>

s : ["abce", "abcd", "cdx"]<br>
n : 2<br>
result : ["abcd", "abce", "cdx"] <br>

## 어려웠던 점
각 문자열로 구성된 배열 안의 n번째 글자를 추출해서 서로 비교 정렬 해야하는 점<br>
구체적으로 어떻게 해야할지 감이 안잡힌다.<br>

## 새로 배운 점
solution.java n번째 글자를 원래의 문자열 앞에 붙여서 list에 넣은 다음 Collection.sort를 하는 법

