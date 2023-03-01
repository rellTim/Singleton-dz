import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();
        logger.log("Старт программы");
        logger.log("Просим пользователя вести размер списка для фильтрации");
        System.out.println("Введите размер списка");
        int size = scanner.nextInt();
        List<Integer> list = new ArrayList<>(size);
        System.out.println("Введите верхнюю границу списка");
        int upSize = scanner.nextInt();
        Random random = new Random(upSize);
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(upSize));
        }
        System.out.println("Вот случайный список " + list);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра");
        int filterNumber = scanner.nextInt();
        Filter filter = new Filter(filterNumber);
        logger.log("Запускаем фильтрацию");
        System.out.println("Отфильтрованный список " + filter.filterOut(list));
        logger.log("Работа завершена");
    }
}
