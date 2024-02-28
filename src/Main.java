public class Main {
    public static void main(String[] args) {
        System.out.println("task 1:");
        System.out.println(Calculator.sum(5, 3));
        System.out.println(Calculator.multiply(5.5, 2));
        System.out.println(Calculator.divide(10, 2));
        System.out.println(Calculator.subtract(8.66, 3.99));
        System.out.println();

        System.out.println("task 2:");
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {1, 2, 3};
        String[] strArr1 = {"naruto", "sasuke", "hinata"};
        String[] strArr2 = {"naruto", "sasuke", "picachu"};
        System.out.println(CompareArrays.compareArrays(arr1, arr2)); // true - классы одинаковы во всём
        System.out.println(CompareArrays.compareArrays(strArr1, strArr2)); // false - разное содержание классов
        System.out.println(CompareArrays.compareArrays(arr1, strArr1)); // false - разные классы
        System.out.println();

        System.out.println("task 3:");
        Pair<Integer, String> pair1 = new Pair<>(10, "AC/DC");
        Pair<Float, String> pair2 = new Pair<>(777.9f, "AC/DC");
        System.out.println("Первый элемент первой пары: " + pair1.getFirst());
        System.out.println("Второй элемент первой пары: " + pair1.getSecond());
        System.out.println("Первая пара: " + pair1);
        System.out.println("Первый элемент второй пары: " + pair2.getFirst());
        System.out.println("Второй элемент второй пары: " + pair2.getSecond());
        System.out.println("Вторая пара: " + pair2);
    }
}
