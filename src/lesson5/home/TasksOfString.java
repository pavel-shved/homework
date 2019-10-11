package lesson5.home;

public class TasksOfString {
    public static void main(String[] args) {
        String defaultStr = "Строка - объект класса String. Строка является неизменяемой (immutable). Ссылку на объект класса String можно изменить так, чтобы она указывала на другой объект.";
        System.out.println("Строка на входе:");
        System.out.println(defaultStr);
        task1(defaultStr);
        task2(defaultStr);
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
    }

//1. Преобразовать текст так, чтобы каждое слово начиналось с заглавной буквы.
private static void task1(String strIn){
    System.out.println("1) Каждое слово начинается с заглавной буквы:");
    String[] strArray = strIn.split(" ");
    String strOut = "";

    for (String s : strArray) {
        char firstSymbol = s.charAt(0);
        if (!isLetter(firstSymbol)){
            char[] symbols = s.toCharArray();
            for (char symbol : symbols) {
                if (isLetter(symbol)) {
                    firstSymbol = symbol;
                    break;
                }
            }
        }

        String strTemp =  s.replaceFirst(String.valueOf(firstSymbol), String.valueOf(firstSymbol).toUpperCase());
        if (strOut.equals("")){
            strOut = strTemp;
        } else {
            strOut = strOut + " " + strTemp;
        }

    }
    System.out.println(strOut);
}

private static boolean isLetter(char c){
        char[] notLetters = {' ','(',')','.',',','-'};
    for (char notLetter : notLetters) {
        if (c == notLetter) return false;
    }
    return true;
}

//2. Подсчитать количество содержащихся в данном тексте знаков препинания
private static void task2(String strIn){
    int punctuationMarkCounter = 0;
    char[] symbols = strIn.toCharArray();
    for (char symbol : symbols) {
        if (!isLetter(symbol) && symbol != ' ') punctuationMarkCounter++;
    }
    System.out.println("2) Количество содержащихся в тексте знаков препинания: " + punctuationMarkCounter);
}

//3.  Определить сумму всех целых чисел, встречающихся в заданном тексте
private static void task3(){

}

//4. В каждом слове текста k-ю букву заменить заданным символом. Если  k больше длины слова, корректировку не выполнять.
private static void task4(){}

//5. Удалить из текста его часть, заключенную между двумя символами, которые вводятся (например, между скобками ‘(’ и ‘)’ или между звездочками ‘*’ и т.п.).
private static void task5(){}

// 6.  Найти и напечатать, сколько раз повторяется в тексте каждое слово, которое встречается в нем.
private static void task6(){}

//7. Найти, каких букв, гласных или согласных, больше в каждом предложении текста
private static void task7(){}

//8. Во всех вопросительных предложениях текста найти и напечатать без повторений слова заданной длины
private static void task8(){}

}
