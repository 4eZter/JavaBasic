package org3.sourseit.Trockiy.homework.third;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class guessNumber {

    void Jarvis(int randomNumber) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        randomEnter();
        try {
            String n = reader.readLine();
            int number = Integer.parseInt(n);

            if (randomNumber == number) {
                randomCongratulate();
            } else if (number > randomNumber) {
                randomHigh();
                Jarvis(randomNumber);
            } else if (number == 0) {
                System.out.println("Сектор ноль на барабане! И как вы докатились до такой жизни?");
                Jarvis(randomNumber);
            } else {
                randomLow();
                Jarvis(randomNumber);
            }
        } catch (NumberFormatException e) {
        System.out.println("Баловаться и просто так нажимать клавишу Enter нельзя! Карму испортите и волосы на руках выростут!");

        Jarvis(randomNumber);
    }
    }



    private void randomLow() {
        String[] lowAnswers = new String[]{
                "Рожденный ползать обречен стремится к полету. А число должно быть больше",
                "Все выше и выше и выыыше! Числодолжно быть больше",
                "Чтоб ви так жили, как пгибедняетесь! Число должно быть больше",
                "Слишком маленькое число! Чиселко, так сказать, должно быть больше",
                "Маловато будет! Введите большее число",
                "Заниженная самооценка тоже делу не помошник! Введите большее число!",
                "Так и до плинтуса недалеко. Число должно быть больше!",
                "Ну вот, сходил за хлебушком. Число должно быть больше",
                "Опять не угадали. Нужно кушать растишку и вводить большее число!",
                "Надо к подводникам обратиться, чтоб измерили глубину Марианской впадины... Введите большее число"
        };


        Random random = new Random();
        for (int i = 0; i < 1; i++) {
            System.out.println(

                    lowAnswers[random.nextInt(lowAnswers.length)]
            );
        }

    }


    private void randomHigh() {
        String[] highAnswers = new String[]{
                "Высоко стреляешь, боец, перелет! Число должно быть меньше",
                "Не-а, число ниже немного. Введите меньшее число",
                "У вас наблюдается склонность к завышению. Число ниже",
                "Число должно быть меньше",
                "Шеф, ну так нельзя, опять перебор. Введите меньшее число",
                "Вот так и в жизни, все время тянет ввысь. Но число должно быть меньше",
                "Опять не угадали. Keep calm and guess number. Число должно быть меньше",
                "Еще не предел, но уже перебор. Введите меньшее число",
                "Число практически валяется на полу, пока вы тут в воздухе витаете. Число должно быть меньше!",
                "Знал бы, что вы так высоко заберетесь, не настраивал бы генератор на 100. Число должно быть меньше"
        };


        Random random = new Random();
        for (int i = 0; i < 1; i++)
            System.out.println(

                    highAnswers[random.nextInt(highAnswers.length)]
            );

    }

    private void randomCongratulate() {
        String[] congratulate = new String[]{
                "Ай маладЭц!",
                "Ну вот в ком в ком, а в вас я точно не сомневался!",
                "А ведь могли бы с вами угадывать до утра. Да я такой!",
                "Потенциал не пропьешь!",
                "Дядя обещал конфетку? Получите и распишитесь",
                "Правильный ответ, как пуля. Даже если не вовремя, то уже не остановишь",
                "Мои поздравления! Вы прям как Стивен Хокинг без бабочки!!",
                "Таки да! Вы пгавы!",
                "Все, спасибо, с вас 5 гривен ...Шутка",
                "Вы победили, а Петросян из меня не очень, скажу я вам"
        };


        Random random = new Random();
        for (int i = 0; i < 1; i++) {
            System.out.println(

                    congratulate[random.nextInt(congratulate.length)]
            );
        }

    }

    private void randomEnter() {
        String[] entry = new String[]{
                "Вас приветствует Джарвис! Попробуйте угадать число",
                "Чем-то напоминает русскую рулетку, вы не находите? Введите ваш вариант, проверим :)",
                "Вводим новое число! Раз попытка, два попытка - будет пыточная камера!",
                "Чем бы дитя не тешилось... Лишь бы вводило числа правильно",
                "Этот шанс был дарован вам свыше, не упустите его! Введите число быстрее! ",
                "У нас мало времени, введите число",
                "Все гениальное - просто. Пробуем угадать число",
                "Число ведь легкое! Делов то - начать и кончить!",
                "Вот введете число и добрый дяденька вам конфетку даст",
                "Знаю, знаю... сейчас бы на рыбалку, а не в какие-то дурацкие игры играть. Давайте закончим это грязное дело!"
        };


        Random random = new Random();
        for (int i = 0; i < 1; i++) {
            System.out.println(
                    entry[random.nextInt(entry.length)]
            );
        }
    }


    public static void main(String[] args) throws IOException {
        guessNumber guessNumber=new guessNumber();

        Random r= new Random();
        int number=r.nextInt(99+1);

        guessNumber.Jarvis(number);
    }

}

