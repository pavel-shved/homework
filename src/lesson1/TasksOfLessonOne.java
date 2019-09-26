package lesson1;

public class TasksOfLessonOne {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        /* 18. Напишите метод переводящий рубли в доллары по заданному курсу. В качестве аргументов укажите кол-во рублей и курс. */
        double rubles = 13.2;
        double ratePerDollar = 2.05;
        getDollars(rubles,ratePerDollar);
    }


    /* 1. Напишите программу, которая вычисляет ваш вес на Луне с учетом того, что сила
    тяжести равна 16% от силы тяжести на Земле. */
    private static void task1() {
        double weightOnEarth = 73.5;
        double weightOnMoon = 0.16 * weightOnEarth;
        System.out.println("1) Вес на Луне = " + weightOnMoon);
    }

    /* 2. Напишите метод, который будет увеличивать каждый элемент массива на 10%. */
    private static void task2() {
        double[] array = new double[]{1.0, 2.5, 3.6};
        System.out.println("2) Массив на входе:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            array[i] += array[i] * 0.1;
        }
        System.out.println();
        System.out.println("Массив на выходе:");
        for (double v : array) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    /*3. Напишите метод, который будет проверять является ли число палиндромом
    (одинаково читающееся в обоих направлениях).*/
    private static void task3() {
        int number = 12343210;
        String strNumber = String.valueOf(number);
        String strNumberReverse = "";
        int i = strNumber.length() - 1;
        while (i > -1) {
            strNumberReverse += strNumber.charAt(i);
            i--;
        }
        System.out.print("3) Число " + number + " полиндром? Ответ: ");
        if (strNumber.equals(strNumberReverse)) {
            System.out.println("да");
        } else {
            System.out.println("нет");
        }
    }

    /* 4. Вывести на экран все четные цифры от 1 до 100 (используйте остаток от деления) */
    private static void task4() {
        int beginCycleValue = 1;
        int endCycleValue = 100;
        System.out.print("4) Все четные числа от "+beginCycleValue+" до "+endCycleValue+": ");
        for (int i = beginCycleValue; i <= endCycleValue; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    /* 5. Вывести на  экран все нечетные цифры от 1 до 15 (используйте остаток от деления) */
    private static void task5() {
        int beginCycleValue = 1;
        int endCycleValue = 15;
        System.out.print("5) Все нечетные числа от "+beginCycleValue+" до "+endCycleValue+": ");
        for (int i = beginCycleValue; i <= endCycleValue; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    /* 6. Вывести на  экран все четные цифры от 1 до 100 не используя остаток от деления (используя только цикл for) */
    private static void task6() {
        int beginCycleValue = 1;
        int endCycleValue = 100;
        System.out.print("6) Все четные числа от "+beginCycleValue+" до "+endCycleValue+": ");
        for (int i = beginCycleValue+1; i <= endCycleValue; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /* 7. Посчитать сумму цифр от 20 до 200 и результат вывести на экран (используя цикл for) */
    private static void task7() {
        int beginCycleValue = 20;
        int endCycleValue = 200;
        int sum = 0;
        for (int i = beginCycleValue; i <= endCycleValue; i++) {
            sum += i;
        }
        System.out.println("7) Сумма чисел от 20 до 200 = " + sum);
    }

    /* 8. Пройти циклом по числам от 1 до 12 и вывести название месяца, соответствующее каждому числу (используя цикл и оператор if else) */
    private static void task8() {
        System.out.println("8) ");
        for (int i = 1; i <= 12; i++) {
            if (i == 1) {
                System.out.println(i + " - Январь");
            } else if (i == 2) {
                System.out.println(i + " - Февраль");
            } else if (i == 3) {
                System.out.println(i + " - Март");
            } else if (i == 4) {
                System.out.println(i + " - Апрель");
            } else if (i == 5) {
                System.out.println(i + " - Май");
            } else if (i == 6) {
                System.out.println(i + " - Июнь");
            } else if (i == 7) {
                System.out.println(i + " - Июль");
            } else if (i == 8) {
                System.out.println(i + " - Август");
            } else if (i == 9) {
                System.out.println(i + " - Сентябрь");
            } else if (i == 10) {
                System.out.println(i + " - Октябрь");
            } else if (i == 11) {
                System.out.println(i + " - Ноябрь");
            } else {
                System.out.println(i + " - Декабрь");
            }
        }
    }

    /* 9. Объявить 2 переменных целого типа. Необходимо поменять значения переменных так, чтобы значение первой оказалось во второй, а второй - в первой. */
    private static void task9() {
        int firstIntVar = 3;
        int secondIntVar = 5;
        System.out.println("9) На входе: " + "firstIntVar=" + firstIntVar + "; " + "secondIntVar=" + secondIntVar);
        int temp = firstIntVar;
        firstIntVar = secondIntVar;
        secondIntVar = temp;
        System.out.println("На выходе: " + "firstIntVar=" + firstIntVar + "; " + "secondIntVar=" + secondIntVar);
    }

    /* 10. Напишите программу с тремя переменными целого типа, первым двум присвойте значения, а третьей переменной присвойте их сумму. Выведете значение третей переменной на экран. */
    private static void task10() {
        int firstIntVar = 12;
        int secondIntVar = 6;
        int sum = firstIntVar + secondIntVar;
        System.out.println("10) Сумма " + firstIntVar + " и " + secondIntVar + " = " + sum);
    }

    /* 11. Напишите программу с тремя переменными целого типа. Определить какое из них наибольшее. */
    private static void task11() {
        int firstIntVar = 8;
        int secondIntVar = 6;
        int thirdIntVar = -9;
        int maxVar = firstIntVar;
        if ((firstIntVar == secondIntVar) && (firstIntVar == thirdIntVar)) {
            System.out.println("11) Cреди " + firstIntVar + ", " + secondIntVar + ", " + thirdIntVar + ": Все числа равны!");
        } else {
            if (secondIntVar > maxVar) {
                maxVar = secondIntVar;
            }
            if (thirdIntVar > maxVar) {
                maxVar = thirdIntVar;
            }
            System.out.println("11) Наибольшее число среди " + firstIntVar + ", " + secondIntVar + ", " + thirdIntVar + ": " + maxVar);
        }


    }

    /* 12. Напишите программу, в которой используются две переменные логического типа (boolean),
    присвойте им значения и выведете для каждой переменной на экран строку "истина", если переменная имеет значение true и "ложь", если переменная имеет значение false.
     */
    private static void task12() {
        boolean firstBoolVar = true;
        boolean secondBoolVar = false;

        System.out.print("12) firstBoolVar - ");
        isTrueOrFalse(firstBoolVar);
        System.out.print("secondBoolVar - ");
        isTrueOrFalse(secondBoolVar);
    }

    private static void isTrueOrFalse(boolean boolVar) {
        if (boolVar) {
            System.out.println("истина");
        } else {
            System.out.println("ложь");
        }
    }

    /* 13. Напишите программу, где двум строковым переменным присваиваются значения, третей же строковой
    переменных присвойте объединение (конкатенацию) двух предыдущих строк. Затем напечатайте значение третьей строковой переменной.
     */
    private static void task13() {
        String firstStrVar = "Hello, ";
        String secondStrVar = "World!";
        String thirdStrVar = firstStrVar + secondStrVar;
        System.out.println("13) " + thirdStrVar);
    }

    /* 14. Создайте программу с двумя переменными целого типа, присвойте им значения, если первая переменная
    больше второй, то увеличьте её значение на 3, иначе увеличьте значение второй переменной на 8. В конце программы выведите значения обоих чисел на экран.
     */
    private static void task14() {
        int firstIntVar = 7;
        int secondIntVar = 8;
        int increaseFirstVar = 3;
        int increaseSecondVar = 8;
        System.out.println("14) На входе: " + "firstIntVar=" + firstIntVar + "; " + "secondIntVar=" + secondIntVar);
        if (firstIntVar > secondIntVar) {
            firstIntVar += increaseFirstVar;
        } else {
            secondIntVar += increaseSecondVar;
        }
        System.out.println("На выходе: " + "firstIntVar=" + firstIntVar + "; " + "secondIntVar=" + secondIntVar);
    }

    /* 15. Выведете на экран все числа от 1 до 100 с помощью цикла (можно все три варианта в одной программе):
    for
    while
    do while
    */
    private static void task15() {
        int beginCycleValue = 1;
        int endCycleValue = 100;
        System.out.print("15) Цикл for: ");
        for (int i = beginCycleValue; i <= endCycleValue; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Цикл while: ");
        int i = beginCycleValue;
        while (i <= endCycleValue) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        System.out.print("Цикл do while: ");
        i = beginCycleValue;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= endCycleValue);
        System.out.println();
    }

    /* 16. Вывести на экран ряд натуральных чисел от минимума до максимума с шагом.
    Например, если минимум 10, максимум 35, шаг 5, то вывод должен быть таким: 10 15 20 25 30 35. Минимум, максимум и шаг указываются пользователем (можно захардкодить). */
    private static void task16(){
        int min = 10;
        int max = 35;
        int step = 5;
        System.out.print("16) Ряд натуральных чисел: ");
        for (int i = min; i <= max; i+=step){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    /* 17. Все элементы массива поделить на значение наибольшего элемента этого массива. */
    private static void task17(){
        double[] array = new double[]{1,4,-3,5};
        System.out.print("17) Массив на входе: ");
        for (double v: array){
            System.out.print(v + " ");
        }
        System.out.println();
        double maxArrayValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>maxArrayValue) {
                maxArrayValue = array[i];
            }
        }
        System.out.print("Массив на выходе: ");
        for (double v: array) {
            System.out.print(v/maxArrayValue+" ");
        }
        System.out.println();
    }

    /* 18. Напишите метод переводящий рубли в доллары по заданному курсу. В качестве аргументов укажите кол-во рублей и курс. */
    private static void getDollars(double rubles, double ratePerDollar){
        System.out.print("18) ");
        if (ratePerDollar != 0){
            System.out.println(rubles/ratePerDollar);
        }else {
            System.out.println("Курс не может быть равен нулю!");
        }
    }
}
