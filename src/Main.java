public class Main {
    public static void main(String[] args) {

        System.out.println("ЗАДАЧА 1");
        //У банка появилось мобильное приложение. Поэтому теперь, когда пользователь заходит на сайт с телефона,
        //ему предлагается скачать приложение с учетом того, какая операционная система у пользователя.
        //Напишите программу, которая определяет, чем пользуется клиент (iOS или Android),
        //и выдает соответствующее сообщение:
        //Для iOS — «Установите версию приложения для iOS по ссылке».
        //Для Android — «Установите версию приложения для Android по ссылке».
        //Объявите переменную clientOS, которая равна 0 или 1 (0 — iOS, 1 — Android).
        int clientOS = 0;
        int clientAndroid = 1;
        if (clientOS == 0 && clientAndroid ==1){
            System.out.println("Пройдите по ссылке, чтобы выбрать версию приложения:");
            if (clientOS == 0){
                System.out.println("установите версию приложения для iOS по ссылке"); //использовала 2 вложенных оператора
            }
            if (clientAndroid == 1){
                System.out.println("установите версию приложения для Android по ссылке");
            }
        }else {
            System.out.println();
        }
        System.out.println("ЗАДАЧА 2");
        //Усложним предыдущую задачу. Теперь нам нужно знать не только операционную систему телефона, но и год его создания.
        //Ваша задача — написать программу, которая выдает соответствующее сообщение клиенту при наличии двух условий.
        //Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об облегченной версии:
        //Для iOS оно будет звучать так: «Установите облегченную версию приложения для iOS по ссылке».
        //Для Android: «Установите облегченную версию приложения для Android по ссылке».
        //Для пользователей телефонов 2015 года выпуска и позже нужно вывести обычное предложение об установке приложения.
        //Для года создания телефона используйте переменную clientDeviceYear, в которой необходимо указать 2015 год.
        //Важно: вложенность больше двух этажей не допускается (условный оператор внутри условного оператора).
        int clientDeviceYear = 2015;
        if (clientDeviceYear > 2015){
            System.out.println("Пройдите по ссылке, чтобы выбрать версию приложения:");
            if (clientOS == 0){
                System.out.println("установите версию приложения для iOS по ссылке/ios/"); //использовала 2 вложенных оператора
            }
            if (clientAndroid == 1){
                System.out.println("установите версию приложения для Android по ссылке/android/");
            }
        } if (clientDeviceYear <= 2015){
            System.out.println("Пройдите по ссылке, чтобы выбрать версию приложения:");
            if (clientOS == 0){
                System.out.println("установите облегченную версию приложения для iOS по ссылке/ios/"); //использовала 2 вложенных оператора
            }
            if (clientAndroid == 1){
                System.out.println("установите облегченную версию приложения для Android по ссылке/android/");
            }
        }
        //допустим без вложенности
        System.out.println("Второй вариант без вложенности");
        int clientDeviceYesr1 = 2015;
        int clientOS1 = 1;
        int clientAndroid1 = 2;
        if (clientOS1 ==  1 && clientAndroid1 <= 2015){
            System.out.println("Пройдите по ссылке /ios/ и скачайте облегченную версию для IOS!");
        }else if (clientOS1 == 1 && clientAndroid1 > 2015) {
            System.out.println("Пройдите по ссылке /ios/ и скачайте  версию для IOS!");
        }else if (clientAndroid1 == 2 && clientAndroid1 <= 2015){
            System.out.println("Пройдите по ссылке /android/ и скачайте облегченную версию для ANDROID!");
        }else if (clientAndroid1 == 2 && clientAndroid1 >= 2015){
            System.out.println("Пройдите по ссылке /android/ и скачайте облегченную версию для ANDROID!");
        }else {

        }
        //пробую сделать с тернарным оператором
        System.out.println("третий вариант с тернарным оператором");
        int clientDevecyYear2 = 2015;
        String text = clientDevecyYear2 <= 2015 ? "Скачай облегченную версию" : "Скачай версию";
        System.out.println(text);
        System.out.println("ЗАДАЧА 3");
        //Напишите программу, которая определяет, является ли год високосным или нет.
        //Переменную года назовите year, в которую можно подставить значение интересующего нас года.
        //Например, 2021.
        //Программа должна определять, високосный год или нет, и выводить соответствующее сообщение:
        // « …. год является високосным» или «... год не является високосным».
        //Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый.
        //Также високосным является каждый четырехсотый год.
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){  // поставила скобки в первом выражение
            System.out.println(year + " год является высокосным");
        }else{
            System.out.println(year+ " год не является высокосным");
        }
        System.out.println("ЗАДАЧА 4");
        //В банке для клиентов организовывается доставка карт на дом. Чтобы известить клиента о том,
        //когда будет доставлена его карта, нужно знать расстояние от офиса до адреса доставки.
        //Правила доставки такие:
        //Доставка в пределах 20 км занимает сутки.
        //Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
        //Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
        //Свыше 100 км доставки нет.
        //То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
        //Напишите программу, которая выдает сообщение в консоль: "Потребуется дней: " + срок доставки.
        //Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
        int deliveryDistance = 95;
        if (deliveryDistance <= 20){
            System.out.println("Доставка в пределах " +deliveryDistance+ " км занимает сутки.");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("Доставка в пределах " +deliveryDistance+ " км добавляет еще один день доставки.");
        }else if (deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println("Доставка в пределах " + deliveryDistance+ " км добавляет еще одни сутки.");
        }else if (deliveryDistance > 100){
            System.out.println("Свыше " + deliveryDistance+ " км доставки нет.");
        }else {
        }
        System.out.println("ЗАДАЧА 5");
        //Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит.
        //Например, 1-й месяц (он же январь) принадлежит к сезону зима.
        //Для написания программы используйте оператор switch.
        //Для обозначения номера месяца используйте переменную monthNumber = 12.
        //Пропишите условие, при котором программа не будет выполняться (номер месяца больше 13).
        int monthNumber = 7;
        switch (monthNumber){
            case 1:
                System.out.println("Месяц январь, сезон зима!");
                break;
            case 2:
                System.out.println("Месяц февраль, сезон зима!");
                break;
            case 3:
                System.out.println("Месяц март, сезон весна!");
                break;
            case 4:
                System.out.println("Месяц апрель, сезон весна!");
                break;
            case 5:
                System.out.println("Месяц май, сезон весна!");
                break;
            case 6:
                System.out.println("Месяц июнь, сезон лето!");
                break;
            case 7:
                System.out.println("Месяц июль, сезон лето!");
                break;
            case 8:
                System.out.println("Месяц август, сезон лето!");
                break;
            case 9:
                System.out.println("Месяц сентябрь, сезон осень!");
                break;
            case 10:
                System.out.println("Месяц октябрь, сезон осень!");
                break;
            case 11:
                System.out.println("Месяц ноябрь, сезон осень!");
                break;
            case 12:
                System.out.println("Месяц декабрь, сезон зима!");
                break;
            default:
                System.out.println("!Укажите месец от 1 до 12!");
        }
        // второй вариант, типа сокращенный
        int mobthNumber1 = 12;
        switch (mobthNumber1){
            case 12:
            case 1:
            case 2:

                    System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Веснв");
                break;
            case 6:
            case 7:
            case 8:
                    System.out.println("Лето");
                    break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неверный месяц");
        }



    }
}