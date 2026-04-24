## 문제 설명
명합 지갑의 크기를 정하려고 합니다.<br>
다양한 크기의 명함들을 수납할 수 있으면서 최소한의 크기를 가져야합니다.<br>
모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 받고 가장 작은 지갑을 만들 때, 지갑의 크기를 return합니다

## 어려웠던 점
명함이 90도 회전이 가능하다는 것을 고려해야하 한다는 점<br>
그래서 초기 계획은 가능한 가장 큰 범위를 잡아두고 회전했을때 공간이

## 새로 배운 점
(solution) String으로 받아서 StringBuilder에 append로 변환한 문자를 추가한 뒤 .toString으로 return하는 점<br>
(solution2) 그냥 char[] chars 에 toCharArray로 문자열을 변환 해서 넣고 char[]안에서 수정하고 new String(chars)로 return점<br>
(solution3)<br>

StringBuilder와 toCharArray의 쓰임새 차이<br>
배열과 문자열 리터럴의 차이<br>
