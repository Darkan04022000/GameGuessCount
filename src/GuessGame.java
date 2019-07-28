public class GuessGame {
    Player p1;
    Player p2;                   // GuessGame содержит три переменных экземпляра для трех объектов Player.
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();         // Создаем три объекта Player  присваеваем их трем переменным экземпляра
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;          // Объявляем три пременные для хранения вариантов от каждого игрока
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false; // Объявляем три переменные для хранения правильности или неправильности (true или false) ответов игроков
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю число от 0 до 9...");  // Содаем число которое игроки должны угадать

        while(true) {
            System.out.println("Число, которое нужно угадать, - " + targetNumber);

            p1.guess();
            p2.guess();  // Вызываем метод guess() из каждого объекта Player
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Первый игрок думает, что это " + guessp1);

            guessp2 = p2.number;
            System.out.println("Второй игрок думает, что это " + guessp2); // Извлекаем варианты каждого игрока (результаты работы из методов guess()),
                                                                          // получая доступ к их переменным number
            guessp3 = p3.number;
            System.out.println("Третий игрок думает, что это " + guessp3);


            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {   // Проверяем варианты каждого из игроков на соответствие загаданному числу. Если игрок угадал,
                p2isRight = true;            // то присваиваем соответствущей пременной значение true (помните, что по умолчанию она хранит значение false)
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }



            if (p1isRight || p2isRight || p3isRight) { // Если первый игрок, ИЛИ второй игрок, ИЛИ третий игрок угадал (оператор || означает ИЛИ)...

                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал?" + p1isRight);
                System.out.println("Второй игрок угадал?" + p2isRight);
                System.out.println("Третий игрок угадал?" + p3isRight);
                System.out.println("Конец игры.");
                break;

            } else {
                // Мы должны продолжать, так как никто не угадал!
                System.out.println("Игроки должны попробвать еще раз.");

            } // конец if/else

        } // конец цикла
    } // конец метода
} // конец класса
