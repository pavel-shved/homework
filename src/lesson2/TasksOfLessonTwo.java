package lesson2;

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
//        runTask11();
//        runTask12();
//        runTask13();
//        runTask14();
//        runTask15();
//        runTask16();
//        runTask17();
//        runTask18();
//        runTask19();
//        runTask20();
    }


    //Task 1. Write a Java program to sort a numeric array and a string array.
//        Задача 1. Напишите Java-программу для сортировки числового массива и строкового массива.
    private static void runTask1() {
        double[] numArray = new double[]{1, 4, -3, 5};
        System.out.print("1) Числовой массив на входе: ");
        for (double v : numArray) {
            System.out.print(v + " ");
        }
        System.out.println();

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
        for (double v : numArray) {
            System.out.print(v + " ");
        }
        System.out.println();

        String[] stringArray = new String[]{"баян", "банан", "ананас", "картофель"};
        System.out.print("Строковый массив на входе: ");
        for (String v : stringArray) {
            System.out.print(v + " ");
        }
        System.out.println();

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
        for (String v : stringArray) {
            System.out.print(v + " ");
        }
        System.out.println();
    }


    //Task 2. Write a Java program to sum values of an array.
//        Задача 2. Напишите Java-программу для суммирования значений массива.
    private static void runTask2() {
        double[] numArray = new double[]{1, 4, -3, 5};
        double sumArray = 0;
        System.out.print("2) Массив на входе: ");
        for (double v : numArray) {
            System.out.print(v + " ");
            sumArray = sumArray + v;
        }
        System.out.println();
        System.out.println("Сумма элементов массива: " + sumArray);
    }


    //Task 4.  Write a Java program to calculate the average value of array elements.
//        Задача 4. Напишите Java-программу для расчета среднего значения элементов массива.
    private static void runTask4() {
        double[] numArray = new double[]{1, 4, -3, 6};
        double sumArray = 0;
        System.out.print("4) Массив на входе: ");
        for (double v : numArray) {
            System.out.print(v + " ");
            sumArray = sumArray + v;
        }
        System.out.println();
        System.out.println("Среднее значение элементов массива: " + (sumArray / numArray.length));
    }

    //Task 5.  Write a Java program to test if an array contains a specific value.
//        Задача 5. Напишите Java-программу для проверки, содержит ли массив конкретное значение.
    private static void runTask5() {
        double[] numArray = new double[]{1, 4, -3, 6};
        System.out.print("5) Массив на входе: ");
        for (double v : numArray) {
            System.out.print(v + " ");
        }
        System.out.println();
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
        for (double v : numArray) {
            System.out.print(v + " ");
        }
        System.out.println();
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
        for (double v : numArray) {
            System.out.print(v + " ");
        }
        System.out.println();

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
            for (double v : numArray) {
                System.out.print(v + " ");
            }
            System.out.println();
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
        for (double v : numArray) {
            System.out.print(v + " ");
        }
        System.out.println();

        for (int i = 0; i < numArray.length; i++) {
            copyNumArray[i] = numArray[i];
        }

        System.out.print("Скопированный массив на выходе: ");
        for (double v : copyNumArray) {
            System.out.print(v + " ");
        }
        System.out.println();

    }

    //Task 9.  Write a Java program to insert an element (specific position) into an array.
//        Задача 9. Напишите Java-программу для вставки элемента (определенной позиции) в массив.
    private static void runTask9() {
        double[] numArray = new double[]{1, 4, -3, 6, 4};
        System.out.print("9) Массив на входе: ");
        for (double v : numArray) {
            System.out.print(v + " ");
        }
        System.out.println();

        int position = 3;
        double value = 5.5;
        System.out.println("Вставляем элемент со значением "+value+" в позицию "+position);

        double[] tempArray = new double[numArray.length+1];
        for (int i = 0; i < tempArray.length; i++) {
            if (i < position){
                tempArray[i] = numArray[i];
            } else if (i == position){
                tempArray[i] = value;
            } else{
                tempArray[i] = numArray[i-1];
            }
        }

        numArray = tempArray;
        System.out.print("Массив на выходе: ");
        for (double v : numArray) {
            System.out.print(v + " ");
        }
        System.out.println();

    }

    //Task 10. Write a Java program to find the maximum and minimum value of an array.
//        Задача 10. Напишите программу на Java, чтобы найти максимальное и минимальное значение массива.
    private static void runTask10() {
        double[] numArray = new double[]{1, 4, -3, 6, 4};
        System.out.print("10) Массив на входе: ");
        for (double v : numArray) {
            System.out.print(v + " ");
        }
        System.out.println();

        double maxValue = numArray[0];
        double minValue = numArray[0];
        for (double v : numArray) {
            if (v < maxValue){
                maxValue = v;
            }
            if (v > minValue){
                minValue = v;
            }
        }
        System.out.println("Минимальное значение массива: "+minValue);
        System.out.println("Максимальное значение массива: "+maxValue);
    }

    //Task 11. Write a Java program to reverse an array of integer values.
//        Задача 11. Напишите Java-программу для обращения к массиву целочисленных значений.

    //Task 12. Write a Java program to find the duplicate values of an array of integer values.
//        Задача 12. Напишите программу на Java, чтобы найти повторяющиеся значения в массиве целочисленных значений.

    //Task 13. Write a Java program to find the duplicate values of an array of string values.
//        Задача 13. Написать Java-программу для поиска дублирующихся значений массива строковых значений.

    //Task 14. Write a Java program to find the common elements between two arrays (string values).
//        Задача 14. Напишите программу на Java, чтобы найти общие элементы между двумя массивами (строковые значения).

    //Task 15. Write a Java program to find the common elements between two arrays of integers.
//        Задача 15. Напишите программу на Java, чтобы найти общие элементы между двумя массивами целых чисел.

    //Task 16. Write a Java program to remove duplicate elements from an array.
//        Задача 16. Напишите Java-программу для удаления дублирующихся элементов из массива.

    //Task 17. Write a Java program to find the second largest element in an array.
//        Задача 17. Написать программу на Java, чтобы найти второй по величине элемент в массиве.

    //Task 18. Write a Java program to find the second smallest element in an array.
//        Задача 18. Напишите программу на Java, чтобы найти второй наименьший элемент в массиве.

    //Task 19. Write a Java program to add two matrices of the same size.
//        Задача 19. Напишите Java-программу для добавления двух матриц одинакового размера.

    //Task 20. Write a Java program to convert an array to ArrayList.
//        Задача 20. Напишите Java-программу для преобразования массива в ArrayList.


}
