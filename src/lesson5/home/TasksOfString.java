package lesson5.home;

public class TasksOfString {
    public static void main(String[] args) {
        String defaultStr = "Строка - объект класса String. Строка является неизменяемой (immutable). Ссылку на объект класса String можно изменить так, чтобы она указывала на другой объект.";
        System.out.println("Строка на входе:");
        System.out.println(defaultStr);
        task1(defaultStr);
        task2(defaultStr);

        defaultStr = "1, 2, 3 - целые ч2исла, также как и 11, и 111. А вот 11.1 - число дробное! ";
        System.out.println("3) Строка на входе:");
        System.out.println(defaultStr);
        task3(defaultStr);
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
    }

    //1. Преобразовать текст так, чтобы каждое слово начиналось с заглавной буквы.
    private static void task1(String strIn) {
        System.out.println("1) Каждое слово начинается с заглавной буквы:");
        String[] strArray = strIn.split(" ");
        String strOut = "";

        for (String s : strArray) {
            char firstSymbol = s.charAt(0);
            if (!isLetter(firstSymbol)) {
                char[] symbols = s.toCharArray();
                for (char symbol : symbols) {
                    if (isLetter(symbol)) {
                        firstSymbol = symbol;
                        break;
                    }
                }
            }

            String strTemp = s.replaceFirst(String.valueOf(firstSymbol), String.valueOf(firstSymbol).toUpperCase());
            if (strOut.equals("")) {
                strOut = strTemp;
            } else {
                strOut = strOut + " " + strTemp;
            }

        }
        System.out.println(strOut);
    }

    private static boolean isLetter(char c) {
        char[] notLetters = {' ', '(', ')', '.', ',', '-'};
        for (char notLetter : notLetters) {
            if (c == notLetter) return false;
        }
        return true;
    }

    //2. Подсчитать количество содержащихся в данном тексте знаков препинания
    private static void task2(String strIn) {
        int punctuationMarkCounter = 0;
        char[] symbols = strIn.toCharArray();
        for (char symbol : symbols) {
            if (!isLetter(symbol) && symbol != ' ') punctuationMarkCounter++;
        }
        System.out.println("2) Количество содержащихся в тексте знаков препинания: " + punctuationMarkCounter);
    }

    private static boolean isNumber(char c) {
        char[] numbers = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        for (char number : numbers) {
            if (c == number) return true;
        }
        return false;
    }

    //3.  Определить сумму всех целых чисел, встречающихся в заданном тексте
    private static void task3(String strIn) {
        String[] strArray = strIn.split(" ");
        int sum = 0;
        for (String s : strArray) {
            if (!s.contains(".") || (s.contains(".") && s.indexOf(".") == s.length() - 1)) {

                char[] symbols = s.toCharArray();
                boolean tempCheck = isNumber(symbols[0]);
                String tempStr = "";
                if (tempCheck) {
                    tempStr = tempStr + symbols[0];
                }

                for (int i = 1; i < symbols.length; i++) {
                    if (isNumber(symbols[i])) {
                        if (tempCheck) {
                            tempStr = tempStr + symbols[i];
                        } else {
                            if (!tempStr.equals("")){
                                sum = sum + Integer.parseInt(tempStr);
                            }
                        }
                        tempCheck = true;
                    } else {
                        tempCheck = false;
                    }
                }
                if (!tempStr.equals("")){
                    sum = sum + Integer.parseInt(tempStr);
                }

            }
        }
        System.out.println("Сумма целых чисел = " + sum);
    }

    //4. В каждом слове текста k-ю букву заменить заданным символом. Если  k больше длины слова, корректировку не выполнять.
    private static void task4() {

    }

    //5. Удалить из текста его часть, заключенную между двумя символами, которые вводятся (например, между скобками ‘(’ и ‘)’ или между звездочками ‘*’ и т.п.).
    private static void task5() {
    }

    // 6.  Найти и напечатать, сколько раз повторяется в тексте каждое слово, которое встречается в нем.
    private static void task6() {
    }

    //7. Найти, каких букв, гласных или согласных, больше в каждом предложении текста
    private static void task7() {
    }

    //8. Во всех вопросительных предложениях текста найти и напечатать без повторений слова заданной длины
    private static void task8() {
    }

}
