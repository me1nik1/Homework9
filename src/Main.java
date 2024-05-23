public class Main {
    public static void main(String[] args) {

        {
            System.out.println("Задание 1");

            int[] arr = {135, 256, 12363, 2312, 7563, 15236};
            int sum = 0;
            for (int i : arr) {
                sum += i;
            }
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        }
        System.out.println();
        {
            System.out.println("Задание 2");

            int[] arr = {15435, 45, 1741243, 19632454, 65496};
            int min = arr[0];
            int max = arr[0];
            for (int i : arr) {
                if (i < min) {
                    min = i;
                }
                if (i > max) {
                    max = i;
                }
            }
            System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей." +
                    " Максимальная сумма трат за неделю составила " + max + " рублей.");
        }
        System.out.println();
        {
            System.out.println("Задание 3");

            int[] arr = {45, 541632, 313, 6734, 645863};
            int sum = 0;
            for (int i : arr) {
                sum += i;
            }
            double arri = sum / 4.0;
            System.out.println("Средняя сумма трат за месяц составила " + arri + " рублей");
        }
        System.out.println();
        {
            System.out.println("Задание 4");

            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
            }
        }
    }
}