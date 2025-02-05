import java.util.Scanner;
//TODO:
public class TaskSecond {
    public static void main(String[] args) {

        int codeMenu = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                """
                        *** МЕНЮ ***
                        1. Закуски \s
                        2. Основные блюда \s
                        3. Десерты \s
                        4. Напитки \s
                        5. Салаты\s
                """
        );

        System.out.println("Выберите номер пункта меню: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка: введите целое число!");
        } else {
            codeMenu = scanner.nextInt();
        }

        switch (codeMenu) {
            case 1:
                System.out.println(
                        """     
                                       ***** ЗАКУСКИ *****
                                1. Гренки с чесноком — 150 руб. \s
                                2. Сельдь с картофелем — 250 руб. \s
                                3. Солёные огурцы и квашеная капуста — 200 руб. \s
                                4. Ветчина с сыром — 300 руб. \s
                        """
                );
                break;
            case 2:
                System.out.println(
                        """
                                           ***** ОСНОВНЫЕ БЛЮДА *****
                                1. Стейк рибай с картофелем и соусом демиглас — 1200 руб. \s
                                2. Паста карбонара с беконом и пармезаном — 550 руб. \s
                                3. Лосось на гриле с овощами — 750 руб. \s
                                4. Жареная утка с яблоками — 900 руб. \s
                        """
                );
                break;
            case 3:
                System.out.println(
                        """
                                           ***** ДЕСЕРТЫ *****
                                1. Чизкейк "Нью-Йорк" с малиновым соусом — 400 руб. \s
                                2. Тирамису по классическому рецепту — 450 руб. \s
                                3. Шоколадный фондан с мороженым — 500 руб. \s
                                4. Яблочный штрудель с корицей 380 руб. \s
                        """
                );
                break;
            case 4:
                System.out.println(
                        """
                                      ***** НАПИТКИ ***** 
                                1. Капучино (250 мл) — 200 руб.\s
                                2. Апельсиновый свежевыжатый сок (300 мл) — 350 руб.\s
                                3. Лимонад с мятой и лаймом (500 мл) — 300 руб.\s
                                4. Домашний глинтвейн (250 мл) — 450 руб.\s
                        """
                );
                break;
            case 5:
                System.out.println(
                        """
                                      ***** Салаты *****
                                1. Цезарь с курицей и пармезаном — 480 руб.\s
                                2. Греческий салат с фетой и маслинами — 400 руб.\s
                                3. Оливье с говядиной — 450 руб.\s
                                4. Винегрет с квашеной капустой — 350 руб.\s
                        """
                );
                break;
            default:
                System.out.println("Такого пункта меню не существует");
        }
        scanner.close();
    }
}
