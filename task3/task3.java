package v2.Seminar2.homework2.task1.task3;
//Задача 3. Удаление пустых строк из текста
//Дана строка с несколькими строками текста, разделенными переводами строки.
//        Напишите метод, который удаляет все пустые строки из текста.

public class task3 {
    public static void main(String[] args) {
        String text = "";
        if (args.length == 0) {
            text = "line1\n\nline2\n\nline3";
        } else {
            text = args[0];
        }
        TextCleaner ans = new TextCleaner();
        System.out.println(ans.removeEmptyLines(text));
    }
}
