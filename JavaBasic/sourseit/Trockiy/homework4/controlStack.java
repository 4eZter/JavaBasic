package org3.sourseit.Trockiy.homework.homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class controlStack {

    public void handsControl() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("ведите размер стека");

        int stackSize = Integer.parseInt(reader.readLine());


        StackIml Stack = new StackIml(stackSize);

        POINT1:

        while(true) {
            printList();

            int chooze = Integer.parseInt(reader.readLine());
            try {

                switch (chooze) {
                    case 0:
                        System.out.println("Всего доброго");
                        break POINT1;

                    case 1:

                        System.out.println("введите элемент");
                        Stack.push(reader.readLine());

                        break;

                    case 2:

                        Stack.pop();
                        System.out.println("элемент удален");
                        break;

                    case 3:

                        Stack.clear();
                        System.out.println("стэк очищен");
                        break;

                    case 4:

                        Stack.print();
                        break;
                    default:
                        System.out.println("некорректный ввод! введите число пожалуйста");

                }

            } catch (StackException e) {
                System.out.println("Ошибочка вышла");
            }
        }

    }

    private void auto() {

        StackIml Stack = new StackIml(5);

        Stack.clear();
        try {
            System.out.println("Добавляю 4 элемента");
            Stack.push("E1");
            Stack.push("E2");
            Stack.push("E3");
            Stack.push("E4");
            Stack.print();

            System.out.println("Удаляю 2 элемента");
            Stack.pop();
            Stack.pop();
            Stack.print();

            System.out.println("\nУдаляю оставшиеся элементы для загрузки новых");
            Stack.pop();
            Stack.pop();
            Stack.print();

            System.out.println("\nДобавляю 5 элементов в заданном порядке");
            Stack.push("E6");
            Stack.push("E7");
            Stack.push("E3");
            Stack.push("E4");
            Stack.push("E5");
            Stack.print();

//            System.out.println("делаю попытку добавить лишний элемент");
//            Stack.push("redundant");

            System.out.println("\nПроизвожу очистку");
            Stack.clear();
            Stack.print();

//            System.out.println("делаю попытку удалить несуществующий элемент");
//            Stack.pop();


        } catch (StackException e) {

        }



    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        controlStack control = new controlStack();

        System.out.println("1. ручное управление стеком" + "\n2. автоматическое управление стеком" + "\nпожалуйста, сделайте ваш выбор");

        int chooze = Integer.parseInt(reader.readLine());


        if(chooseWay(chooze)) {
            System.out.println("Выбрано ручное управление");
            control.handsControl();
        }else if(!chooseWay(chooze)){
            System.out.println("Выбрано автоматическое выполнение программы");
            control.auto();
        }
    }





    //список действий со стеком
    public static void printList() {
        System.out.println("\n Пожалуйста, выберите одну из операций над стеком:");

        System.out.println(" 1. добавить элемент в стек"
                + "\n 2. удалить элемент из стека"
                + "\n 3. полностью очистить стек"
                + "\n 4. вывести содержимое стека на экран"
                + "\n 0. выйти из программы");
    }



    //выбор режима работы программы
    public static boolean chooseWay(int i) {

        if (i == 1) {

            return true;
        } else if (i == 2) {

            return false;
        }else System.out.println("неправильный ввод!");
            return chooseWay(i);
    }




}


