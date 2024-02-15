// 📌 Напишите метод, который вернет содержимое текущей папки в виде
// массива строк.
// 📌 Напишите метод, который запишет массив, возвращенный предыдущим
// методом в файл.
// 📌 Обработайте ошибки с помощью try-catch конструкции. В случае
// возникновения исключения, оно должно записаться в лог-файл.

package Seminar02;

// import java.io.File;
// import java.io.FileWriter;
// import java.util.Arrays;
// import java.util.logging.FileHandler;
// import java.util.logging.Level;
// import java.util.logging.Logger;
// import java.util.logging.SimpleFormatter;

// public class ContentFolder {
//     private static Logger logger = Logger.getLogger(ContentFolder.class.getName());
//     public static void main(String[] args) {
//         configureLogger();
//         String[] res = contentFolder(".");
//         System.out.println(Arrays.toString(res));
//         logger.info("Test");        
//         logger.info("Огого");
//         logger.log(Level.INFO, "Test02");
//     }

//     public static String[] contentFolder (String path) {
//         File folder = new File(path);
//         return folder.list();
//     }

//     public static void wtiteToFile(String[] arr, String name) {
//     try (FileWriter fw = new FileWriter(name, false)){
//         for (int i = 0; i < arr.length; i++) {
//             fw.append(arr[i]);
//             fw.append(" ");
//         }

//         // fw.write(str);
//         // fw.append('\n');
//         // fw.flush();
//     } catch (Exception e) {
//         System.out.println(e.getMessage());
//         logger.info("ошибка");
//         logger.info(e.toString());
//     }
//     }

//     public static void configureLogger () {
//         try {
//             FileHandler fh = new FileHandler("log.txt");
//             logger.addHandler(fh);
//             SimpleFormatter sm = new SimpleFormatter();
//             fh.setFormatter(sm);
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }

// }

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ContentFolder {
    private static Logger logger = Logger.getLogger(ContentFolder.class.getName());

    public static void main(String[] args) {
        configureLogger();
        String[] res = contentFolder(".");
        System.out.println(Arrays.toString(res));
        writeFile(res);
        logger.info("Тест");
        logger.log(Level.INFO, "test");

    }

    public static String[] contentFolder(String folderName) {
        File folder = new File(folderName);

        return folder.list();
    }

    public static void writeFile(String[] arr) {

        try (FileWriter fw = new FileWriter(".", false)) {
            for (int i = 0; i < arr.length; i++) {
                fw.append(arr[i]);
                fw.append(" ");
            }

        } catch (IOException ex) {
            // logger.info("Ошибка записи в файл");
            logger.severe(ex.toString());
        }

    }

    public static void configureLogger() {
        try {
            FileHandler fh = new FileHandler("log.txt");
            logger.addHandler(fh);
            SimpleFormatter sm = new SimpleFormatter();
            fh.setFormatter(sm);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}