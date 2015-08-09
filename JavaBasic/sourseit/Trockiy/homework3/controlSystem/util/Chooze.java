package org3.sourseit.Trockiy.homework.homework3.controlSystem.util;

import java.io.IOException;

public class Chooze {

    public static boolean chooze(String entry) throws IOException {

        String yes = "Y";

        if (entry.equalsIgnoreCase("N")) {

            System.out.println("Запрос отклонен");
            return false;
        }
        if (!entry.equalsIgnoreCase(yes)) {

            System.out.println("Этот вариант ввода не предусмотрен");
            return false;

        } else return true;
    }
}
