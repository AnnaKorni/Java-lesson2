package v2.Seminar2.homework2.task1.task2;

public class CSVGenerator {
    public static String generateCSV(String[] headers, String[][] data) {
        StringBuilder csv = new StringBuilder();
// Добавление заголовков
        csv.append(String.join(",", headers)).append("\n");
// Добавление данных
        for (String[] row : data) {
            csv.append(String.join(",", row)).append("\n");
        }
        return csv.toString().trim(); // Удалить последнюю новую
    }
}
