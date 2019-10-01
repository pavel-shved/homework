package lesson2;

import java.util.ArrayList;
import java.util.Arrays;

public class TasksOfLessonTwo {
    public static void main(String[] args) {
        System.out.println("TasksOfLessonTwo");
        runTask1();
        runTask2();
        runTask4();
        runTask5();
        runTask6();
        runTask7();
        runTask8();
        runTask9();
        runTask10();
        runTask11();
        runTask12();
        runTask13();
        runTask14();
        runTask15();
        runTask16();
        runTask17();
        runTask18();
        runTask19();
        runTask20();
    }

    private static void printArray(double[] array) {
        for (double d : array) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printArray(String[] array) {
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static void printMatrix(int[][] matrix){
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    //Task 1. Write a Java program to sort a numeric array and a string array.
//        Задача 1. Напишите Java-программу для сортировки числового массива и строкового массива.
    private static void runTask1() {
        double[] numArray = new double[]{1, 4, -3, 5};
        System.out.print("1) Числовой массив на входе: ");
        printArray(numArray);

        double temp;
        for (int i = 0; i < numArray.length; i++) {
            for (int j = numArray.length - 1; j >= i + 1; j--) {
                if (numArray[j] < numArray[j - 1]) {
                    temp = numArray[j];
                    numArray[j] = numArray[j - 1];
                    numArray[j - 1] = temp;
                }
            }
        }

        System.out.print("Числовой массив на выходе: ");
        printArray(numArray);

        String[] stringArray = new String[]{"баян", "банан", "ананас", "картофель"};
        System.out.print("Строковый массив на входе: ");
        printArray(stringArray);

        String tempStr;
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = stringArray.length - 1; j >= i + 1; j--) {
                if (stringArray[j].compareTo(stringArray[j - 1]) < 0) {
                    tempStr = stringArray[j];
                    stringArray[j] = stringArray[j - 1];
                    stringArray[j - 1] = tempStr;
                }
            }
        }
        System.out.print("Строковый массив на выходе: ");
        printArray(stringArray);
    }


    //Task 2. Write a Java program to sum values of an array.
//        Задача 2. Напишите Java-программу для суммирования значений массива.
    private static void runTask2() {
        double[] numArray = new double[]{1, 4, -3, 5};
        double sumArray = 0;
        System.out.print("2) Массив на входе: ");
        printArray(numArray);
        for (double d : numArray) {
            sumArray = sumArray + d;
        }
        System.out.println("Сумма элементов массива: " + sumArray);
    }


    //Task 4.  Write a Java program to calculate the average value of array elements.
//        Задача 4. Напишите Java-программу для расчета среднего значения элементов массива.
    private static void runTask4() {
        double[] numArray = new double[]{1, 4, -3, 6};
        double sumArray = 0;
        System.out.print("4) Массив на входе: ");
        printArray(numArray);
        for (double v : numArray) {
            sumArray = sumArray + v;
        }
        System.out.println("Среднее значение элементов массива: " + (sumArray / numArray.length));
    }

    //Task 5.  Write a Java program to test if an array contains a specific value.
//        Задача 5. Напишите Java-программу для проверки, содержит ли массив конкретное значение.
    private static void runTask5() {
        double[] numArray = new double[]{1, 4, -3, 6};
        System.out.print("5) Массив на входе: ");
        printArray(numArray);

        double findValue = 6;
        System.out.print("Содержит ли массив елемент со значением " + findValue + "? Ответ: ");
        String answer = "";
        for (double v : numArray) {
            if (v == findValue) {
                answer = "да";
                break;
            }
        }
        if (!answer.equals("да")) {
            answer = "нет";
        }
        System.out.print(answer);
        System.out.println();
    }

    //Task 6.  Write a Java program to find the index of an array element.
//        Задача 6. Напишите программу на Java, чтобы найти индекс элемента массива.
    private static void runTask6() {
        double[] numArray = new double[]{1, 4, -3, 6};
        System.out.print("6) Массив на входе: ");
        printArray(numArray);

        double findIndexOfValue = 4;
        System.out.print("Какой индекс у элемента со значением " + findIndexOfValue + "? Ответ: ");
        int i;
        for (i = 0; i < numArray.length; i++) {
            if (numArray[i] == findIndexOfValue) {
                break;
            }
        }

        System.out.print(i);
        System.out.println();
    }

    //Task 7.  Write a Java program to remove a specific element from an array.
//        Задача 7. Напишите Java-программу для удаления определенного элемента из массива.
    private static void runTask7() {
        double[] numArray = new double[]{1, 4, -3, 6, 4};
        System.out.print("7) Массив на входе: ");
        printArray(numArray);

        double findValue = 4;
        int countDelElements = 0;
        for (double v : numArray) {
            if (v == findValue) {
                countDelElements++;
            }
        }

        if (countDelElements > 0) {
            System.out.println("Удаляем из массива элементы со значением " + findValue + "...");
            int i = 0;
            double[] tempArray = new double[numArray.length - countDelElements];
            for (double v : numArray) {
                if (v != findValue) {
                    tempArray[i] = v;
                    i++;
                }
            }
            numArray = tempArray;
            System.out.print("Массив на выходе: ");
            printArray(numArray);
        } else {
            System.out.println("В массиве нет элементов со значением " + findValue + "...");
        }
    }

    //Task 8.  Write a Java program to copy an array by iterating the array.
//        Задача 8. Напишите Java-программу для копирования массива путем итерации массива.
    private static void runTask8() {
        double[] numArray = new double[]{1, 4, -3, 6, 4};
        double[] copyNumArray = new double[numArray.length];
        System.out.print("8) Массив на входе: ");
        printArray(numArray);

        for (int i = 0; i < numArray.length; i++) {
            copyNumArray[i] = numArray[i];
        }

        System.out.print("Скопированный массив на выходе: ");
        printArray(copyNumArray);

    }

    //Task 9.  Write a Java program to insert an element (specific position) into an array.
//        Задача 9. Напишите Java-программу для вставки элемента (определенной позиции) в массив.
    private static void runTask9() {
        double[] numArray = new double[]{1, 4, -3, 6, 4};
        System.out.print("9) Массив на входе: ");
        printArray(numArray);

        int position = 3;
        double value = 5.5;
        System.out.println("Вставляем элемент со значением " + value + " в позицию " + position);

        double[] tempArray = new double[numArray.length + 1];
        for (int i = 0; i < tempArray.length; i++) {
            if (i < position) {
                tempArray[i] = numArray[i];
            } else if (i == position) {
                tempArray[i] = value;
            } else {
                tempArray[i] = numArray[i - 1];
            }
        }

        numArray = tempArray;
        System.out.print("Массив на выходе: ");
        printArray(numArray);

    }

    //Task 10. Write a Java program to find the maximum and minimum value of an array.
//        Задача 10. Напишите программу на Java, чтобы найти максимальное и минимальное значение массива.
    private static void runTask10() {
        double[] numArray = new double[]{1, 4, -3, 6, 4};
        System.out.print("10) Массив на входе: ");
        printArray(numArray);

        double maxValue = numArray[0];
        double minValue = numArray[0];
        for (double v : numArray) {
            if (v < maxValue) {
                maxValue = v;
            }
            if (v > minValue) {
                minValue = v;
            }
        }
        System.out.println("Минимальное значение массива: " + minValue);
        System.out.println("Максимальное значение массива: " + maxValue);
    }

    //Task 11. Write a Java program to reverse an array of integer values.
//        Задача 11. Напишите Java-программу для обращения к массиву целочисленных значений.
    private static void runTask11() {
        int[] numArray = new int[]{1, 4, -3, 6, 4};
        System.out.print("11) Массив на входе: ");
        printArray(numArray);

        int j = 0;
        int[] tempArray = new int[numArray.length];
        for (int i = tempArray.length - 1; i >= 0; i--) {
            tempArray[j] = numArray[i];
            j++;
        }
        numArray = tempArray;
        System.out.print("Перевернутый массив на выходе: ");
        printArray(numArray);
    }

    //Task 12. Write a Java program to find the duplicate values of an array of integer values.
//        Задача 12. Напишите программу на Java, чтобы найти повторяющиеся значения в массиве целочисленных значений.
    private static void runTask12() {
        int[] numArray = new int[]{1, 4, -3, 6, 6, 6, 6, 4};
        System.out.print("12) Массив на входе: ");
        printArray(numArray);

        int[] iteratorsArray = new int[numArray.length];
        int tempIterator = 0;

        for (int i = 0; i < numArray.length; i++) {
            for (int j = i + 1; j < numArray.length; j++) {
                if (numArray[i] == numArray[j]) {
                    iteratorsArray[tempIterator] = i;
                    tempIterator++;
                    break;
                }
            }
        }

        System.out.print("Повторяющиеся значения в массиве: ");
        for (int i = 0; i < tempIterator; i++) {
            System.out.print(numArray[iteratorsArray[i]] + " ");
        }
        System.out.println();
    }

    //Task 13. Write a Java program to find the duplicate values of an array of string values.
//        Задача 13. Написать Java-программу для поиска дублирующихся значений массива строковых значений.
    private static void runTask13() {
        String[] stringArray = new String[]{"Java", "Piton", "Java", "Kotlin", "Java"};
        System.out.print("13) Массив на входе: ");
        printArray(stringArray);

        int[] iteratorsArray = new int[stringArray.length];
        int tempIterator = 0;

        for (int i = 0; i < stringArray.length; i++) {
            for (int j = i + 1; j < stringArray.length; j++) {
                if (stringArray[i].equals(stringArray[j])) {
                    iteratorsArray[tempIterator] = i;
                    tempIterator++;
                    break;
                }
            }
        }

        if (tempIterator > 0) {
            System.out.print("Повторяющиеся значения в массиве: ");
            for (int i = 0; i < tempIterator; i++) {
                System.out.print(stringArray[iteratorsArray[i]] + " ");
            }
            System.out.println();
        } else System.out.println("Повторяющихся значений в массиве нет!");

    }

    //Task 14. Write a Java program to find the common elements between two arrays (string values).
//        Задача 14. Напишите программу на Java, чтобы найти общие элементы между двумя массивами (строковые значения).
    private static void runTask14() {
        String[] stringFirstArray = new String[]{"Java", "Piton", "Kotlin"};
        String[] stringSecondArray = new String[]{"Банан", "Java", "Баян", "Султан"};

        System.out.print("14) Первый массив: ");
        printArray(stringFirstArray);
        System.out.print("Второй массив: ");
        printArray(stringSecondArray);

        int[] iteratorsArray = new int[Math.max(stringFirstArray.length, stringSecondArray.length)];
        int tempIterator = 0;

        for (int i = 0; i < stringFirstArray.length; i++) {
            for (String s : stringSecondArray) {
                if (stringFirstArray[i].equals(s)) {
                    iteratorsArray[tempIterator] = i;
                    tempIterator++;
                    break;
                }
            }
        }

        if (tempIterator > 0) {
            System.out.print("Общие значения в массивах: ");
            for (int i = 0; i < tempIterator; i++) {
                System.out.print(stringFirstArray[iteratorsArray[i]] + " ");
            }
            System.out.println();
        } else System.out.println("Общих значений в массивах нет!");
    }

    //Task 15. Write a Java program to find the common elements between two arrays of integers.
//        Задача 15. Напишите программу на Java, чтобы найти общие элементы между двумя массивами целых чисел.
    private static void runTask15() {
        int[] intFirstArray = new int[]{1, 4, -3, 6};
        int[] intSecondArray = new int[]{6, 0, -5, 0, 4};

        System.out.print("15) Первый массив: ");
        printArray(intFirstArray);
        System.out.print("Второй массив: ");
        printArray(intSecondArray);

        int[] iteratorsArray = new int[Math.max(intFirstArray.length, intSecondArray.length)];
        int tempIterator = 0;

        for (int i = 0; i < intFirstArray.length; i++) {
            for (int j : intSecondArray) {
                if (intFirstArray[i] == j) {
                    iteratorsArray[tempIterator] = i;
                    tempIterator++;
                    break;
                }
            }
        }

        if (tempIterator > 0) {
            System.out.print("Общие значения в массивах: ");
            for (int i = 0; i < tempIterator; i++) {
                System.out.print(intFirstArray[iteratorsArray[i]] + " ");
            }
            System.out.println();
        } else System.out.println("Общих значений в массивах нет!");
    }

    //Task 16. Write a Java program to remove duplicate elements from an array.
//        Задача 16. Напишите Java-программу для удаления дублирующихся элементов из массива.
    private static void runTask16() {
        int[] numArray = new int[]{1, 4, -3, 6, 4, 7, 6, 4};
        System.out.print("16) Массив на входе: ");
        printArray(numArray);
        Arrays.sort(numArray);

        int tempArrayLength = 1;
        for (int i = 1; i < numArray.length; i++) {
            if (numArray[i] != numArray[i - 1]) {
                tempArrayLength++;
            }
        }

        int[] tempArray = new int[tempArrayLength];
        tempArray[0] = numArray[0];
        int j = 1;
        for (int i = 1; i < numArray.length; i++) {
            if (numArray[i] != numArray[i - 1]) {
                tempArray[j++] = numArray[i];
            }
        }
        numArray = tempArray;
        System.out.print("Массив без дубликатов: ");
        printArray(numArray);
    }

    //Task 17. Write a Java program to find the second largest element in an array.
//        Задача 17. Написать программу на Java, чтобы найти второй по величине элемент в массиве.
    private static void runTask17() {
        int[] numArray = new int[]{1, 4, -3, 6, 5, 7, 12};
        System.out.print("17) Массив на входе: ");
        printArray(numArray);

        int maxElement = numArray[0];
        int minElement = numArray[0];
        for (int i : numArray) {
            if (i > maxElement) {
                maxElement = i;
            } else if (i < minElement) {
                minElement = i;
            }
        }

        int secondMaxElement = minElement;
        for (int i : numArray) {
            if (i == maxElement) {
                break;
            } else if (i > secondMaxElement) {
                secondMaxElement = i;
            }
        }

        System.out.println("Второй по величине элемент: " + secondMaxElement);
    }

    //Task 18. Write a Java program to find the second smallest element in an array.
//        Задача 18. Напишите программу на Java, чтобы найти второй наименьший элемент в массиве.
    private static void runTask18() {
        int[] numArray = new int[]{1, 4, -3, 6, 5, 7, 12};
        System.out.print("18) Массив на входе: ");
        printArray(numArray);

        int maxElement = numArray[0];
        int minElement = numArray[0];
        for (int i : numArray) {
            if (i > maxElement) {
                maxElement = i;
            } else if (i < minElement) {
                minElement = i;
            }
        }

        int secondMinElement = maxElement;
        for (int i : numArray) {
            if (i == minElement) {
                break;
            } else if (i < secondMinElement) {
                secondMinElement = i;
            }
        }

        System.out.println("Второй наименьший элемент: " + secondMinElement);
    }

    //Task 19. Write a Java program to add two matrices of the same size.
//        Задача 19. Напишите Java-программу для добавления двух матриц одинакового размера.
    private static void runTask19() {
        int[][] numMatrix1 = new int[][]{{1, 4, -3, 6, 5, 7, 12},{2, 2, 3, 5, 1, 0 ,0}};
        int[][] numMatrix2 = new int[][]{{0, 3, 2, 1, 3, 0, 1},{3, -2, -3, 0, 0, 2 ,3}};
        int[][] sumMatrix = new int[numMatrix1.length][numMatrix1[0].length];
        System.out.println("19) Матрица1 на входе: ");
        printMatrix(numMatrix1);
        System.out.println("Матрица2 на входе: ");
        printMatrix(numMatrix2);

        for (int i = 0; i < numMatrix1.length; i++) {
            for (int j = 0; j < numMatrix1[i].length; j++) {
                sumMatrix[i][j] = numMatrix1[i][j] + numMatrix2[i][j];
            }
        }

        System.out.println("Сумма матрица1+матрица2 на выходе: ");
        printMatrix(sumMatrix);


    }



    //Task 20. Write a Java program to convert an array to ArrayList.
//        Задача 20. Напишите Java-программу для преобразования массива в ArrayList.
    private static void runTask20() {
        int[] numArray = new int[]{1, 4, -3, 6, 5, 7, 12};
        System.out.print("20) Массив на входе: ");
        printArray(numArray);

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : numArray) {
            arrayList.add(i);
        }

        System.out.println("ArrayList на выходе :");
        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }

    }

}
