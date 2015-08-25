package sourseit.homeworks.homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patient {

        private int id;
        private String surname;
        private String name;
        private String patronymic;
        private String address;
        private String phoneNumber;
        private int numberOfCard;
        private String diagnosis;

        Patient(int id, String surname, String name, String patronymic, String address, String phoneNumber, int numberOfCard, String diagnosis){
            this.setId(id);
            this.setSurname(surname);
            this.setName(name);
            this.setPatronymic(patronymic);
            this.setAddress(address);
            this.setPhoneNumber(phoneNumber);
            this.setNumberOfCard(numberOfCard);
            this.setDiagnosis(diagnosis);
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPatronymic() {
            return patronymic;
        }

        public void setPatronymic(String patronymic) {
            this.patronymic = patronymic;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public int getNumberOfCard() {
            return numberOfCard;
        }

        public void setNumberOfCard(int numberOfCard) {
            this.numberOfCard = numberOfCard;
        }

        public String getDiagnosis() {
            return diagnosis;
        }

        public void setDiagnosis(String diagnosis) {
            this.diagnosis = diagnosis;
        }

        @Override
        public String toString() {
            return getId() + " " + surname + " " + name + " " + patronymic + ", " + "адрес: "+ getAddress() + ", " + "телефон: " + getPhoneNumber() + ", "+ "номер карты: " + numberOfCard + ", " + "диагноз: " + diagnosis;
        }

        //choozer
        public static boolean yes(String entry, String deny) throws IOException {
            String yes = "Да";
            if (entry.equalsIgnoreCase(deny)) {
                System.out.println("Ну нет, так нет...");
                return false;
            }
            if (!entry.equalsIgnoreCase(yes)) {
                System.out.println("Ух ты, среди двух возможных вариантов вы придумали третий");
                System.out.println("Но, к сожалению, он не подходит");
                return false;
            } else return true;
        }


        public static void patientList(Patient[] patients) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Желаете ознакомиться со списком пациентов?" + " (Да/Нет)");

        //patients list
        String g = reader.readLine();
        String no = "Нет";

        if (yes(g, no)) {
            for (Patient patient : patients) {
                System.out.println(patient.getSurname() + " " + patient.getName() + " " + patient.getPatronymic());
            }
        }
        }

        public static void diagnozisList(Patient[] patients) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Желаете ознакомиться со списком диагнозов? (Да/Нет)");

            //diagnozis list
            String s = reader.readLine();
            String no = "Нет";
            if (yes(s, no))
                for (Patient patient : patients) {

                    System.out.println(patient.getDiagnosis());

                }
        }

        public static void choozeDiagnoz(Patient[] patients) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите название диагноза для классификации пациентов");
            String d = reader.readLine();

            //chooze diagnoz
            for (Patient patient : patients) {
                if ((patient.getDiagnosis().equalsIgnoreCase(d))) {
                    System.out.println(patient.toString());
                }
            }
        }

        public static void numberSearch(Patient[] patients) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            //medical sheet number search
            System.out.println("задайте интервал для поиска больничных карт по номеру");
            System.out.println();

            //set first number to search
            System.out.println("для этого введите начальное число поиска");
            String n = reader.readLine();
            int firstNumber = Integer.parseInt(n);

            //set second number to search
            System.out.println("и конечное число поиска");
            String n1 = reader.readLine();
            int lastNumber = Integer.parseInt(n1);

            for (Patient patient : patients) {
                if (((patient.getNumberOfCard() >= firstNumber) && (patient.getNumberOfCard() <= lastNumber))) {
                    System.out.println(patient.toString());
                }
            }
    }


    public static void main(String[] args) throws IOException {


            Patient[] patients;
            patients = new Patient[]{
                    new Patient(1, "Киркоров", "Филипп", "Бедросович", "ул.Ленина 69", "093-43-23-567", 1, "Хронический невроз"),
                    new Patient(2, "Джигурда", "Никита", "Борисович", "Планета Нептун", "90-44-56", 2, "Шизофрения"),
                    new Patient(3, "Бурда", "Борис", "Оскарович", "ул.Комсомольцев 23", "23-45-567", 3, "Обсессивно-компульсивный синдром"),
                    new Patient(4, "Жириновский", "Владимир", "Вольфович", "ул.Конечная 148", "34-34-567", 4, "Шизофрения"),
                    new Patient(5, "Агузарова", "Жанна", "Хасановна", "Альфа Центавра", "144-144-3", 5, "Маниакально-депрессивный синдром"),
                    new Patient(6, "Моисеев", "Борис", "Михайлович", "ул.Блюхера 64", "011-01-02", 6, "Хронический невроз")

            };


            System.out.println("Добрый день, вас приветствует Городская психиатрическая больница №15");

            patientList(patients);
            System.out.println();

            diagnozisList(patients);
            System.out.println();

            choozeDiagnoz(patients);
            System.out.println();

            numberSearch(patients);

            System.out.println("На данный момент новых поступлений не предвидется. Всего доброго!");
    }
}





//        3. Patient:  id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер
//           медицинской карты, Диагноз.

//        Создать массив объектов. Вывести:
//        a)  список пациентов, имеющих данный диагноз;
//        b)  список пациентов, номер медицинской карты у которых находится
//        в заданном интервале.


