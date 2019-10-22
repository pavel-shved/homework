package lesson5.home;

import java.util.ArrayList;
import java.util.List;

public class TasksOfString {
    public static void main(String[] args) {
        String defaultStr = "Строка - объект класса String. Строка является неизменяемой (immutable). Ссылку на объект класса String можно изменить так, чтобы она указывала на другой объект.";
        System.out.println("Строка на входе:");
        System.out.println(defaultStr);
        task1(defaultStr);
        task2(defaultStr);

        String strWithNumbers = "1, 2, 3 - целые числа, также как и 11, и 111. А вот 11.1 - число дробное! ";
        System.out.println("3) Строка на входе:");
        System.out.println(strWithNumbers);
        task3(strWithNumbers);
        task4(defaultStr);
        task5(defaultStr);
        task6(defaultStr);
        task7(defaultStr);

        String strWithQuestion = "Строка - объект класса String. Строка является неизменяемой (immutable). Ссылку на объект класса String можно изменить так, чтобы она указывала на другой объект?";
        task8(strWithQuestion);
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
                    if (tempCheck) {
                        if (isNumber(symbols[i])) {
                            tempStr = tempStr + symbols[i];
                        } else {
                            tempCheck = false;
                        }
                    } else {
                        if (isNumber(symbols[i])) {
                            tempStr = tempStr + symbols[i];
                            tempCheck = true;
                        }
                    }
                }
                if (!tempStr.equals("")) {
                    sum = sum + Integer.parseInt(tempStr);
                }

            }
        }
        System.out.println("Сумма целых чисел = " + sum);
    }

    //4. В каждом слове текста k-ю букву заменить заданным символом. Если  k больше длины слова, корректировку не выполнять.
    private static void task4(String strIn) {
        int k = 4;
        char symbol = '^';
        System.out.println("4) Заменили " + k + " букву каждого слова на символ '" + symbol + "':");

        String[] strArray = strIn.split(" ");
        String strOut = "";
        for (String s : strArray) {
            if (k > s.length()) {
                strOut = strOut + " " + s;
            } else {
                String tempStr;
                char[] word = s.toCharArray();
                word[k - 1] = symbol;
                tempStr = new String(word);
                if (strOut.equals("")) {
                    strOut = tempStr;
                } else {
                    strOut = strOut + " " + tempStr;
                }

            }
        }
        System.out.println(strOut);
    }

    //5. Удалить из текста его часть, заключенную между двумя символами, которые вводятся (например, между скобками ‘(’ и ‘)’ или между звездочками ‘*’ и т.п.).
    private static void task5(String strIn) {
        char symbolStart = '(';
        char symbolFinish = ')';
        int startIndex = 0;
        int finishIndex = 0;
        System.out.println("5) Удаляем часть текста между '" + symbolStart + "' и '" + symbolFinish + "'.");
        if (strIn.contains("(") && strIn.contains(")")) {
            String strOut = "";
            char[] symbols = strIn.toCharArray();
            for (int i = 0; i < symbols.length; i++) {
                if (symbols[i] == symbolStart) {
                    startIndex = i;
                }
                if (symbols[i] == symbolFinish) {
                    finishIndex = i;
                }
            }
            strOut = strIn.substring(0, startIndex + 1) + strIn.substring(finishIndex);
            System.out.println(strOut);
        } else System.out.println("В строке на входе нет символов '" + symbolStart + "' и '" + symbolFinish + "'.");

    }

    // 6.  Найти и напечатать, сколько раз повторяется в тексте каждое слово, которое встречается в нем.
    private static void task6(String strIn) {
        System.out.println("6) Столько раз повторяется в тексте каждое слово:");
        String[] strArray = strIn.split(" ");
        List<String> wordsList = new ArrayList<>();
        for (String s : strArray) {
            if (!isLetter(s.charAt(s.length() - 1))) {
                String word = s.substring(0, s.length() - 1);
                if (!word.equals("")) {
                    wordsList.add(word);
                }
            } else {
                wordsList.add(s);
            }
        }
        for (String s : wordsList) {
            int counter = 0;
            for (String s1 : wordsList) {
                if (s.equalsIgnoreCase(s1)) {
                    counter++;
                }
            }
            System.out.println(s + " " + counter);
        }
    }

    private static boolean isVowel(char c) {
        char[] vowels = {'А', 'а', 'О', 'о', 'У', 'у', 'Ы', 'ы', 'Э', 'э', 'Я', 'я', 'Ё', 'ё', 'Ю', 'ю', 'И', 'и', 'Е', 'е', 'A', 'a', 'E', 'e', 'I', 'i', 'Y', 'y', 'U', 'u', 'O', 'o'};
        for (char vowel : vowels) {
            if (c == vowel) return true;
        }
        return false;
    }

    //7. Найти, каких букв, гласных или согласных, больше в каждом предложении текста
    private static void task7(String strIn) {
        System.out.println("7) Гласные и согласные");
        String[] sentences = strIn.split("[.!?] ");
        for (String sentence : sentences) {
            int countVowel = 0;
            int countConsonant = 0;
            char[] sentenceArray = sentence.toCharArray();
            for (char c : sentenceArray) {
                if (isLetter(c)) {
                    if (isVowel(c)) {
                        countVowel++;
                    } else countConsonant++;
                }
            }
            System.out.println(sentence + " (Гласных = " + countVowel + ", Согласных = " + countConsonant + ")");
        }
    }

    //8. Во всех вопросительных предложениях текста найти и напечатать без повторений слова заданной длины
    private static void task8(String strIn) {
        System.out.println("8) Сторка на входе:");
        System.out.println(strIn);
        int wordLength = 6;
        List<String> wordList = new ArrayList<>();
        System.out.println("Слова с длинной " + wordLength + " во всех вопросительных предложениях:");
        String str = strIn.replaceAll("[?]", "<question>?");
        String[] sentences = str.split("[.!?] ");
        for (String sentence : sentences) {
            if (sentence.contains("<question>")) {
                sentence = sentence.substring(0, sentence.indexOf("<question>"));
                String[] words = sentence.split(" ");
                for (String word : words) {
                    if (word.length() == wordLength && !wordList.contains(word)) {
                        wordList.add(word);
                    }
                }
            }
        }
        for (String s : wordList) {
            System.out.println(s);
        }
    }

}
