public class ZadanieRekrutacyjne1 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

/*        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        numbers[0] = last;
        numbers[numbers.length - 1] = first;

        for (int number : numbers) {
            System.out.println(number);
       }*/

/*        int first = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = first;
        for (int number : numbers) {
            System.out.println(number);
        }*/

        numbers[numbers.length - 1] = numbers[numbers.length - 1] + numbers[0];
        numbers[0] = numbers[numbers.length - 1] - numbers[0];
        numbers[numbers.length - 1] = numbers[numbers.length - 1] - numbers[0];

        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
