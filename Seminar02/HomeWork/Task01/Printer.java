// /* Дана строка sql-запроса:
// select * from students where "
// Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные (параметры) для фильтрации приведены в виде json-строки в примере ниже. Если значение null, то параметр не должен попадать в запрос.
// Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:
// String QUERY - начало SQL-запроса String PARAMS - JSON с параметрами
// Пример: Строка sql-запроса:
// select * from students where 
// Параметры для фильтрации:
//  {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Результат:
// select * from students where name='Ivanov' and country='Russia' and city='Moscow'

package Seminar02.HomeWork.Task01;

class Answer {
  public static StringBuilder answer(String QUERY, String PARAMS) {
    // Напишите свое решение ниже
    StringBuilder sb = new StringBuilder();
    sb.append(QUERY);


    String temp = PARAMS.trim().replace("{", "").replace("}", "");

    String[] arr = temp.split(", ");

    String[][] arr2 = new String[arr.length][arr[0].split(":").length];

    for (int i = 0; i < arr.length; i++) {
      String[] keyValue = arr[i].split(":");
      for (int j = 0; j < arr2[0].length; j++) {
        arr2[i][j] = keyValue[j];
      }
    }

    for (int i = 0; i < arr2.length; i++) {
      for (int j = arr2[0].length - 1; j > 0; j--) {
        if (arr2[i][j].equals("\"null\"")) {
          continue;
        } else if (i > 0) {
          sb.append(" and ");
          sb.append(arr2[i][j - 1].replace("\"", "")).append("=");
          sb.append(arr2[i][j].replace("\"", "'"));
        } else {
          sb.append(arr2[i][j - 1].replace("\"", "")).append("=");
          sb.append(arr2[i][j].replace("\"", "'"));
        }
      }
    }
    return sb;
  }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
  public static void main(String[] args) {
    String QUERY = "";
    String PARAMS = "";

    if (args.length == 0) {
      // При отправке кода на Выполнение, вы можете варьировать эти параметры
      QUERY = "select * from students where ";
      // PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\",
      // \"age\":\"null\"} ";
      // PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\",
      // \"age\":\"null\"}";
      PARAMS = "{\"name\":\"Andron\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
    } else {
      QUERY = args[0];
      PARAMS = args[1];
    }

    Answer ans = new Answer();
    System.out.println(ans.answer(QUERY, PARAMS));
  }
}
