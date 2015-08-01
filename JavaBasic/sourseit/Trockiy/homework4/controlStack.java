package org3.sourseit.Trockiy.homework.homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class controlStack {

    private static int size;
    StackIml Stack = new StackIml(size);

    //ручное управление стэком
    public void stackHand(int chooze){

        try{

            switch (chooze) {
                case 0: break;
                case 1: Stack.push("E"); System.out.println("элемент добавлен"); break;
                case 2: Stack.pop(); System.out.println("элемент удален"); break;
                case 3: Stack.clear(); System.out.println("стэк очищен"); break;
                case 4: Stack.print(); break;
            }

        }catch (StackException e){
        }
    }

    //установить размер стека
    public void setSize(int i) throws IOException {

        controlStack.size = i;

    }

    // выполнение. Проверка стека на размерность 5
    public boolean firstStep(int i){
        if(i == 5){
            Stack.clear();
            System.out.println("Стек пуст. Программа приступает к работе");
            return true;
        }else return false;
    }

    //автоматическое выполнение. Занесение в стек 4 элементов
    public  void secondStep() throws StackException {
        for(int i = 1; i < 5; ++i) {
            Stack.push("E" + i);
        }
    }

    //автоматическое выполнение. Удаление из стека 1го, 4го и 5го элементов
    public  void thirdStep() throws StackException {
        for(int i = 1; i < 5; i++) Stack.pop();
        for(int i = 1; i < 6; i++){
            switch (i){
                case 1: Stack.push(null);break;
                case 2: Stack.push(null); break;
                case 3: Stack.push("E3"); break;
                case 4: Stack.push("E4"); break;
                case 5: Stack.push(null); break;
                default: break;
            }
        }
    }

    //автоматическое выполнение. Занесение 5го, 6го и 7го элементов в оставшиеся свободные места стека
    public  void fourthStep() throws StackException{
        for(int i = 1; i < 6; i++) Stack.pop();
        for(int i = 1; i < 6; i++){
            switch (i){
                case 1: Stack.push("E6"); break;
                case 2: Stack.push("E7"); break;
                case 3: Stack.push("E3"); break;
                case 4: Stack.push("E4"); break;
                case 5: Stack.push("E5"); break;
                default: break;
            }
        }
    }

    //выбор режима работы программы
    public boolean chooseWay(int i){

        if(i == 1){
            System.out.println("Выбрано ручное управление");
            return true;
        }else if(i == 2)
            System.out.println("Выбрано автоматическое выполнение программы");
            return false;
    }

    public void printList(){
        System.out.println("Пожалуйста, выберите одну из операций над стеком:");

        System.out.println(" 1. добавить элемент в стек"
                + "\n 2. удалить элемент из стека"
                + "\n 3. полностью очистить стек"
                + "\n 4. вывести содержимое стека на экран"
                + "\n 0. выйти из программы");
    }



    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        controlStack control = new controlStack();

        System.out.println("Для начала выберите режим работы программы: "
                + "\n 1. ручной режим работы со стеком"
                + "\n 2. автоматическое выполнение программы");
        int chooze = Integer.parseInt(reader.readLine());

        if(control.chooseWay(chooze)){

            System.out.println("Пожалуйста, установите размер стека");
            int size = Integer.parseInt(reader.readLine());
            control.setSize(size);

            control.printList();

            int select = Integer.parseInt(reader.readLine());
            control.stackHand(select);


        }else if(!control.chooseWay(chooze)){

            try{
            System.out.println("Автоматическое выполнение программы началось!");

            control.stackHand(3);
            System.out.println("Произведена автоматическая очистка стека");

            control.setSize(5);
            System.out.println("Размер стека автоматически установлен на 5 ячеек");

            control.firstStep(5);
            System.out.println("Выполнена проверка размера стека для успешного начала работы");


                control.secondStep();



            System.out.println("Элементы Е1, Е2, Е3 и Е4 успешно добавлены в стек");


                control.thirdStep();


            System.out.println("Элементы Е1 и Е2 успешно удалены из стека");


                control.fourthStep();


            System.out.println("Элементы Е5, Е6 и Е7 успешно добавлены на свободные ячейки стека");

                control.stackHand(4);

        }catch(StackException e){}
    }
    }
}


