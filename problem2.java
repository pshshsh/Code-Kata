//정수 num1, num2가 매개변수 주어집니다. num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.

class problem2 {

    public int solution(int num1, int num2) {

        if (num1 < 0 || num1 > 100 || num2 < 0 || num2 > 100) {
            throw new IllegalArgumentException("Input 0 and 100.");
        }
        return num1 * num2;
    }
}
