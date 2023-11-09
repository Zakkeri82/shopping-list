import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {

        System.out.println("Вас приветствует список покупок!");

        String[] shoppingList = new String[8];

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
                if (productCount < shoppingList.length) {
                    System.out.println("Введите название товара");
                    String product = scanner.next();
                    for (int i = 0; i < shoppingList.length; i++) {
                        if (shoppingList[i] == null) {
                            shoppingList[i] = product;
                            break;
                        }
                    }
                    productCount++;
                } else {
                    System.out.println("Список переполнен");
                }
                System.out.println("Товар добавлен");
            } else if (actionNumber == 2) {
                if (shoppingList[0] != null) {
                    System.out.println("В списке присутствуют следующие товары:");
                    for (int i = 0; i < shoppingList.length; i++) {
                        if (shoppingList[i] != null) {
                            System.out.println((i + 1) + ". -" + shoppingList[i]);
                        }
                    }
                } else {
                    System.out.println("В списке покупок товаров нет");
                }
            } else if (actionNumber == 3) {
                for (int i = 0; i < shoppingList.length; i++) {
                    if (shoppingList[i] != null) {
                        shoppingList[i] = null;
                    }
                }
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