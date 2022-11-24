package ru.synergy;

public class Main {
    public static void main(String[] args) {
/*        System.out.println("hello world");

        int a = 6;
        int b = 8;
        System.out.println(a+b);*/

        //инициализация переменных
/*        {
            System.out.println("Введите два числа и я посчитаю их сумму"); //Выводим сообщение в консоль
            System.out.println("_______________________________________"); //Выводим сообщение в консоль

            double a = 0, b = 0; // ОбЪявление двух переменных (double позволяет вводить не только целые числа)

            Scanner in = new Scanner(System.in); //Создание сканера

            in.useLocale(Locale.US); //Ввод чисел через точку, а не запятую

            System.out.println("Введите сюда первое число:  "); //Ввод первого числа
            a = in.nextDouble();

            System.out.println("Введите сюда второе число:  "); //Ввод второго числа
            b = in.nextDouble();

            System.out.println("Сумма ваших чисел равна:  " + (a + b)); //Сумма первого и второго числа

        }*/


        //types
/*        {
            //int g = ( (a + b) / c);
            // a+ ((b+c)
            long x = 100000;
            //Int размер 32 бита, int должен быть не более 2^31
            // long размер 64 бита
            System.out.println((int) (x*x) );
            System.out.println( x );
        }*/
        //Operations
        {
/*
            System.out.println((5) / 3); //Можем разделить один раз.
            System.out.println((double) (5)); //Это double поэтому 5.0
            System.out.println((double) (5) / 3); //Можем разделить 1.(6) раз
*/

            //проверим четное/нечетное
/*
            Scanner in = new Scanner(System.in);

            double value = in.nextDouble();

            if (value % 2 == 0) {
                System.out.println("Вы ввели четное число");
            } else System.out.println("Вы ввели нечетное число");

            System.out.println(12.2 % 2);
        }*/
/*            {
                Scanner in = new Scanner(System.in);
                double value = in.nextDouble();

                if (value % 2 == 0) {

                    System.out.println("Вы ввели четное число");
                } else System.out.println("Вы ввели нечетное число");

                System.out.println(12.2 % 2);
            }*/
            //minutes
/*        {
            int minutes = 10;

            System.out.println(minutes++); //сли увеличить на единицу.

            System.out.println(minutes); //

            minutes += 2; //

            System.out.println(minutes); //
        }*/
            //Объяснение переменной char
/*        //[01010101010011] 31
        {
            char a = 8667;
            char b = '\u21DB';
            char c = '⇛';
            System.out.println("a-" + a + "Числовое представление");
            System.out.println("b-" + b + "Юникод");
            System.out.println("c-" + (int) c + "Символ");
        }*/
            // || - Или, && - И, == - Равно-Равно, != - Неравно
/*

        {
            Scanner in = new Scanner(System.in);


            if ( in.nextInt() > 10){ // ! - Отрицание== - Сравнение, > - Больше, < - Меньше, >= - Больше или равно,
                // <= - Меньше или равно, != - Неравно, || - Или, && - И; true false
                System.out.println( "Условие сгенерировало true"); // true != 0 boolean
            } else {
                System.out.println("Условие сгенирировало false");
            }

            int x = in.nextInt();
            boolean a = !(x < 5 || x > 5 && x < 7); //&#x412;&#x441;&#x435; &#x447;&#x438;&#x441;&#x43B;&#x430; &#x43C;&#x435;&#x43D;&#x44C;&#x448;&#x435; 5 &#x43D;&#x435; &#x432;&#x43A;&#x43B;&#x44E;&#x447;&#x430; // &#x438; 6
            System.out.println(a);

        }*/
/*        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        boolean a = x<5 || x>5 && x<7; // все числа меньше 5 не включая 5 // и 6 будет выводить true
        System.out.println(a);*/
            //boolean
/*        {
         boolean a = true;
         boolean b = false;

         int x = 5;
         boolean b1 = x > 0;
         boolean b2 = b1 && (x < 20);
        }*/
            //Тернарные операции
/*        {

            * <условие>? <значение если условие истино> : <значение если условие ложно>

            int a = -10;
            int b = 20;
            int max = a > b ? a : b;
            System.out.println(max);

            System.out.println( a > 0 ? a * a : "Ошибка");

        }*/
/*        //Шаблон решения
        {
            Scanner in = new Scanner(System.in);
            in.useLocale(Locale.US);
            double x = in.nextDouble();
            double y = in.nextDouble();
            System.out.println(<условие> ? "YES" : "NO");
        }     */
            //Шаблон решения 112165
/*        {
            Scanner in = new Scanner(System.in);
            in.useLocale(Locale.US);
            double x = in.nextDouble();
            double y = in.nextDouble();
            System.out.println( x < 2 && y < x && x * x + y * y > 4 && y > 0 ? "YES" : "NO" );
        }    */
            //Шаблон решения 112167
/*        {
            Scanner in = new Scanner(System.in);
            in.useLocale(Locale.US);
            double x = in.nextDouble();
            double y = in.nextDouble();
            System.out.println( ( y < 2 - x * x && y > x && x < 0 )|| ( y < 2 - x*x && y > 0 && x >= 0 ) ? "YES" : "NO" );
        }*/
            // if else
/*        {
            int max = 0;
            int a = 10, b = 5;
            if (a > b) {
                max = a;
            } else {
                max = b;
            }
        }

        {
            Scanner in = new Scanner(System.in);
            int x1, x2;
            x1 = in.nextInt();
            if (x1 > 9 && x1 < 100) {
                x2 = x1 % 10;
                x1 = x1 / 10;
                System.out.println(x1 + ";" + x2);
                if (x1 == x2) {
                    System.out.println("В числе одинаковые цифры");
                } else if (x2 < x1) {
                    System.out.println("Первая цифра больше второй");
                } else System.out.println("Вторая цифра больше");
            } else System.out.println("Введено не двухзначное число");
        }*/
            // switch case
            /*        *//* switch( a ){
         * case значение1 : команды 1
         * break;
         * case значение2 : команды 2
         * break;
         * case значение3 : команды 3
         * break;
         * case значение4 : команды 4
         * break;
         * }
         *//*
       {

            Scanner in = new Scanner(System.in);
            switch (in.nextInt()) {
                case 1:
                    System.out.println("31");
                    break;
                case 2:
                    System.out.println("28");
                    break;
                case 3:
                    System.out.println("31");
                    break;
                case 4:
                    System.out.println("30");
                    break;
                case 5:
                    System.out.println("31");
                    break;
                case 6:
                    System.out.println("30");
                    break;
                case 7:
                    System.out.println("31");
                    break;
                case 8:
                    System.out.println("31");
                    break;
                case 9:
                    System.out.println("30");
                    break;
                case 10:
                    System.out.println("31");
                    break;
                case 11:
                    System.out.println("30");
                    break;
                case 12:
                    System.out.println("31");
                    break;

            }
        }*/
            // Blocks
/*        {
            {
                int inf = 10;
                int price = 4;
                if (inf > 0) {
                    price += inf * price / 100;
                    System.out.println(price);
                }
                System.out.println(price);
            }
        }

        {
            Scanner in = new Scanner(System.in);
            int x1, x2;
            x1 = in.nextInt();
            x2 = x1 %10;
            x1 = x1/10;
            if(x2 == 3 || x1 == 3){
                System.out.println("В числе присутствует цифра 3");
            }
            else {
                System.out.println("В числе отсутствует цифра 3");
            }
        }*/
            // while циклы
            /*        {

             *//* while(<Условие>){
         * Действие к выполнению;
         *}
         *//*

            int x = 0;
            while (x < 5) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println(x);
            do {
                System.out.print(x + " ");
                x++;
            }
            while (x < 5);
            System.out.println(x);
        }*/
            //Задача про мосты
/*        //Bus height 437 cm
        // 1 754 || No crash
        // 2 300 800 || Crash 1

        Scanner in = new Scanner(System.in);
        int t = 0;
        int i = 1;
        int N = in.nextInt();
        while (i < N) {
            t = in.nextInt();
            if (t < 437) {
                System.out.println("Авария" + i);
                break;
            }
            i++;
        }
        if (t > 437) {
            System.out.println("Едем дальше)");
        }*/


        }

    }
}
