public class CompareArrays {
    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false; // Если длины массивов не совпадают, возвращаем false
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == null || array2[i] == null || !array1[i].getClass().equals(array2[i].getClass()) || !array1[i].equals(array2[i])) {
                return false; // Если тип элементов не совпадает или элементы не равны, возвращаем false
            }
        }

        return true; // Если все проверки прошли успешно, возвращаем true
    }
}
