package kz.lesson.dbpractic;

import kz.lesson.dbpractic.db.Database;
import kz.lesson.dbpractic.menu.Menu;
import kz.lesson.dbpractic.scaner.ScanerDeply;
import kz.lesson.dbpractic.model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner scanmenu1 = new Scanner(System.in);
        Scanner scanmenu2 = new Scanner(System.in);
        Scanner scanmenu3 = new Scanner(System.in);
        Scanner scanmenu4 = new Scanner(System.in);
        Scanner scanmenu5 = new Scanner(System.in);
        Scanner scanafter4 = new Scanner(System.in);
        Scanner scanId = new Scanner(System.in);


        int choice = 0, choice1 = 0, choice3 = 0, choice4 = 0, choice5 = 0, choice6 = 0;

        Menu.hi();

        while (choice != 5) {
            Menu.glavMenu();
            choice = scanmenu1.nextInt();

            if (choice == 1) {
                ScanerDeply scanner = new ScanerDeply();
                User member = scanner.getPersone();
                Database db = new Database();
                db.setUser(member);

                choice1 = 0;


                while (choice1 != 2) {
                    Menu.menu1();
                    choice1 = scanmenu2.nextInt();
                    if (choice1 == 1) {
                        ScanerDeply scanner1 = new ScanerDeply();
                        User member1 = scanner1.getPersone();
                        Database db1 = new Database();
                        db1.setUser(member1);
                    }
                }
            }

            if (choice == 2) {
                choice3 = 0;
                while (choice3 != 6) {
                    Menu.menu2();
                    choice3 = scanmenu3.nextInt();

                    if (choice3 == 1) {
                        Database db = new Database();
                        ArrayList<User> usersAll = db.getUsers();
                        System.out.println("Весь список домашки: ");

                        for (User us : usersAll)
                            System.out.println(us.getId() + " " + us.getName() + " " + us.getAge() + " " + us.getLegSize() + " " + us.getSex() + " " + us.getStatus() + " " + us.pensiya());
                        ScanerDeply scanner = new ScanerDeply();
                        User member = scanner.getPersoneName();
                        String name = "name";
                        db.changeByfield(name, member.getName(), member.getId());
                    }

                    if (choice3 == 2) {
                        Database db = new Database();
                        ArrayList<User> usersAll = db.getUsers();
                        System.out.println("Весь список домашки: ");

                        for (User us : usersAll)
                            System.out.println(us.getId() + " " + us.getName() + " " + us.getAge() + " " + us.getLegSize() + " " + us.getSex() + " " + us.getStatus() + " " + us.pensiya());
                        ScanerDeply scanerDeply = new ScanerDeply();
                        User member = scanerDeply.getPersoneAge();
                        String age = "age";
                        db.changeByField(age, member.getAge(), member.getId());

                    }
                    if (choice3 == 3) {
                        Database db = new Database();
                        ArrayList<User> usersAll = db.getUsers();
                        System.out.println("Весь список домашки: ");

                        for (User us : usersAll)
                            System.out.println(us.getId() + " " + us.getName() + " " + us.getAge() + " " + us.getLegSize() + " " + us.getSex() + " " + us.getStatus() + " " + us.pensiya());
                        ScanerDeply scanerDeply = new ScanerDeply();
                        User member = scanerDeply.getPersoneLegsize();
                        String legsize = "legsize";
                        db.changeByField(legsize, member.getLegSize(), member.getId());

                    }
                    if (choice3 == 4) {
                        Database db = new Database();
                        ArrayList<User> usersAll = db.getUsers();
                        System.out.println("Весь список домашки: ");

                        for (User us : usersAll)
                            System.out.println(us.getId() + " " + us.getName() + " " + us.getAge() + " " + us.getLegSize() + " " + us.getSex() + " " + us.getStatus() + " " + us.pensiya());
                        ScanerDeply scanerDeply = new ScanerDeply();
                        User member = scanerDeply.getPersoneSex();
                        String sex = "sex";
                        db.changeByfield(sex, member.getSex(), member.getId());

                    }
                    if (choice3 == 5) {
                        Database db = new Database();
                        ArrayList<User> usersAll = db.getUsers();
                        System.out.println("Весь список домашки: ");

                        for (User us : usersAll)
                            System.out.println(us.getId() + " " + us.getName() + " " + us.getAge() + " " + us.getLegSize() + " " + us.getSex() + " " + us.getStatus() + " " + us.pensiya());
                        ScanerDeply scanerDeply = new ScanerDeply();
                        User member = scanerDeply.getPersoneStatus();
                        String status = "status";
                        db.changeByfield(status, member.getStatus(), member.getId());

                    }
                }
            }
            if (choice == 3) {
                choice4 = 0;
                Database db = new Database();
                ArrayList<User> usersAll = db.getUsers();
                System.out.println("Весь список домашки: ");

                for (User us : usersAll)
                    System.out.println(us.getId() + " " + us.getName() + " " + us.getAge() + " " + us.getLegSize() + " " + us.getSex() + " " + us.getStatus() + " " + us.pensiya());
                System.out.println("Введите id человека: ");
                db.deleteUser(scanId.nextInt());

                while (choice4!=2) {
                    Menu.menu3();

                choice4 = scanmenu4.nextInt();
                if (choice4 == 1) {
                    Database db1 = new Database();
                    ArrayList<User> usersAll1 = db1.getUsers();
                    System.out.println("Весь список домашки: ");

                    for (User us : usersAll1)
                        System.out.println(us.getId() + " " + us.getName() + " " + us.getAge() + " " + us.getLegSize() + " " + us.getSex() + " " + us.getStatus() + " " + us.pensiya());
                    System.out.println("Введите id человека: ");
                    db1.deleteUser(scanId.nextInt());
                }}

            }


            if (choice == 4) {
                choice5 = 0;
                while (choice5 != 4) {
                    Menu.menu4();
                    choice5 = scanmenu5.nextInt();
                    if (choice5 == 1) {
                        Database db = new Database();
                        ArrayList<User> usersAll = db.getUsers();
                        System.out.println("Весь список домашки: ");
                        for (User us : usersAll)
                            System.out.println(us.getId() + " " + us.getName() + " " + us.getAge() + " " + us.getLegSize() + " " + us.getSex() + " " + us.getStatus() + " " + us.pensiya());
                        choice6 = 0;
                        while (choice6 != 1) {
                            Menu.menuAfter4();
                            choice6 = scanafter4.nextInt();

                        }
                    }
                    if (choice5 == 2) {
                        Database db = new Database();
                        String field = ">";
                        ArrayList<User> usersOver = db.getUsers2(field);
                        System.out.println("Люди старше 24: ");
                        for (User over : usersOver)
                            System.out.println(over.getId() + " " + over.getName() + " " + over.getAge() + " " + over.getLegSize() + " " + over.getSex() + " " + over.getStatus() + " " + over.pensiya());
                        choice6 = 0;
                        while (choice6 != 1) {
                            Menu.menuAfter4();
                            choice6 = scanafter4.nextInt();
                        }
                    }
                    if (choice5 == 3) {
                        Database db = new Database();
                        String field = "<";
                        ArrayList<User> usersLess = db.getUsers2(field);
                        System.out.println("Люди младше 24: ");
                        for (User less : usersLess)
                            System.out.println(less.getId() + " " + less.getName() + " " + less.getAge() + " " + less.getLegSize() + " " + less.getSex() + " " + less.getStatus() + " " + less.pensiya());
                        choice6 = 0;
                        while (choice6 != 1) {
                            Menu.menuAfter4();
                            choice6 = scanafter4.nextInt();
                        }
                    }
                }


            }
        }
    }
}


