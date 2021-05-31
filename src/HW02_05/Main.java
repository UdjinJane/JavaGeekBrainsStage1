package HW02_05;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        // То, что задано. Заголовки.
        String[] header = {"Value1", "Value2", "Value3"};
        // Массив, ка данные в файле.
        int [][] data = {{100, 200, 300}, { 400, 500, 600}, {700, 800, 900}};
        // В тексте ДЗ ошибка. Видимо имелось ввиду использовать разделитель ";".
        // Иначе csv не распарсится таблицами с ходу, придется строить импорт.
        final String SEPARATOR = ";";
        final String PATH_AND_FILENAME = "./temp/file.csv";
        // Создаме объект, чтобы было с чем работать.
        AppData appData = new AppData(header, data);
        // Пишем в файл.
        writeFile(PATH_AND_FILENAME, appData, SEPARATOR);
        // Считываем данные из файла.
        readFile(PATH_AND_FILENAME, SEPARATOR);
    }

    public static void writeFile( String pathAndFile, AppData appData, String separator) throws IOException {
        File tempFile = new File(pathAndFile);
        // Обвязка на проверку и создание файла.
        System.out.println("Файл присутствует? " + tempFile.exists());
        System.out.println("Заданный каталог расположения файла: " + tempFile.getParentFile()); // Парсим каталог.

       if (!tempFile.exists()){
           tempFile.getParentFile().mkdirs();
           tempFile.createNewFile();
       }
        // Конец. Обвязка на проверку и создание файла.

        try(PrintWriter out = new PrintWriter(pathAndFile)){
            for (String printWrite: appData.getHeaders()){
                out.print(printWrite + separator);
            }
            out.println(); // На новую строку.

            int [][] bodyData = appData.getData();
            for (int i = 0; i< bodyData.length; i++){
                for (int j = 0; j < bodyData[i].length; j++){
                    out.print(bodyData[i][j] + separator);
                }
                out.write("\r\n"); // Возврат каретки для надеги.
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static AppData readFile (String pathAndFile, String separator) throws IOException {

        List<int[]> data = new ArrayList<>();
        // Try with res ..
        try (BufferedReader in = new BufferedReader(new FileReader(pathAndFile))) {

            String[] dataHead = in.readLine().split(separator);
            String line = null;

            while ((line = in.readLine()) != null) {
                List<Integer> list = new ArrayList<>();
                String[] string = line.split(separator);
                for (int i = 0; i < string.length; i++) {
                    list.add(Integer.parseInt(string[i]));
                }
                data.add(list.stream().mapToInt(i -> i).toArray());
            }
            // И создаем объект используя считанные из файла данные.
            AppData appData = new AppData(dataHead, data.toArray(new int[0][]));
            int[][] array = appData.getData();
            System.out.println("Считанные из файла данные:");
            System.out.println((appData.toString()));
            // Контрольная перезапись после считанного.
            // Раскомменировать для проверки. Контроль просто просмотром файла.
            // writeFile(pathAndFile, appData, separator);

            return  appData;
        }

    }


}
