class Solution2 {
        public int[] solution(int n, int m) {
            int gcd = getGCD(n, m);
            int lcm = (n * m) / gcd;

            return new int[]{gcd, lcm};
        }

        private int getGCD(int a, int b) {
            if (b == 0) return a; // 종료 조건
            return getGCD(b, a % b); // 재귀 호출
        }
    }
