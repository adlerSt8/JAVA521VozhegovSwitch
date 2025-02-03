import java.util.Scanner;

//TODO: Программа, которая принимает номер месяца от пользователя
// и выводит текстовое описание месяца с использованием оператора switch.
public class TaskFirst {
    public static void main(String[] args) {

        String nameMonth = "";
        int monthNumber = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка: введите целое число!");
        } else {
            monthNumber = scanner.nextInt();
        }
        scanner.close();

        switch (monthNumber) {
            case 1:
                nameMonth = "Январь";
                break;
            case 2:
                nameMonth = "Февраль";
                break;
            case 3:
                nameMonth = "Март";
                break;
            case 4:
                nameMonth = "Апрель";
                break;
            case 5:
                nameMonth = "Май";
                break;
            case 6:
                nameMonth = "Июнь";
                break;
            case 7:
                nameMonth = "Июль";
                break;
            case 8:
                nameMonth = "Август";
                break;
            case 9:
                nameMonth = "Сентябрь";
                break;
            case 10:
                nameMonth = "Октябрь";
                break;
            case 11:
                nameMonth = "Ноябрь";
                break;
            case 12:
                nameMonth = "Декабрь";
                break;
            default:
                System.out.println("Введен неверный номер месяца");
        }

        System.out.println(nameMonth);
    }
}

