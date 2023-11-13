import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {

        System.out.println("Вас приветствует список покупок!");

        List<String> shoppingList = new ArrayList<>();

        int productCount = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите одну из команд:");
            System.out.println("1. Добавить товар в список");
            System.out.println("2. Показать список");
            System.out.println("3. Очистить список");
            System.out.println("4. Завершить работу");

            int actionNumber = scanner.nextInt();

            if (actionNumber == 1) {
                System.out.println("Введите название товара");
                String product = scanner.next();
                boolean copy = true;
                for (int i = 0; i < productCount; i++) {
                    if (shoppingList.get(i).equals(product)) {
                        System.out.println("Такой товар уже есть в списке.");
                        copy = false;
                        break;
                    }
                }
                if (copy) {
                    shoppingList.add(product);
                    System.out.println("Товар " + product + " добавлен в список под номером " + (productCount + 1));
                    productCount++;
                }

            } else if (actionNumber == 2) {
                if (productCount == 0) {
                    System.out.println("В списке покупок товаров нет");
                } else {
                    System.out.println("В списке присутствуют следующие товары:");
                    for (int i = 0; i < productCount; i++) {
                        System.out.println((i + 1) + ". " + shoppingList.get(i));
                    }
                }

            } else if (actionNumber == 3) {
                shoppingList.clear();
                productCount = 0;
                System.out.println("Список очищен");

            } else if (actionNumber == 4) {
                break;

            } else {
                System.out.println("Неизвестная команда!");
            }
        }
        System.out.println("Список покупок закрыт");
    }
}