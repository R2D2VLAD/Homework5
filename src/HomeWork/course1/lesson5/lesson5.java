package HomeWork.course1.lesson5;

public class lesson5 {
    public static void main(String[] args) {

        //Домашнее задание - 1
        System.out.println("Домашнее задание - 1");
        // Задание 1
        System.out.println("Задание 1");

        int age = 17;
        if (age >= 18) {
            System.out.println("Вам уже " + age + " Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Вам ещё только " + age + " возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }

        //Задание 2
        System.out.println("Задание 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребёнок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу, ему пора идти в университет");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет, ему пора искать первую работу");
        }

        //Задание 3
        System.out.println("Задание 3");
        int carCapacity = 102;
        int seats = 60;
        int standingPlaces = (carCapacity - seats);

        int seatsPlaces = 39;
        int standinPlaces = 30;
        if (seats > seatsPlaces) {
            System.out.println("Сидячих мест в вагоне " + (seats - seatsPlaces));

            if (standingPlaces > standinPlaces) {
                System.out.println("Стоячих мест в вагоне " + (standingPlaces - standinPlaces));
            }

            // Домашнее задание 2
            System.out.println("Домашнее задание 2");
            //Задание 1
            System.out.println("Задание 1");

            int age1 = 17;
            if (age1 >= 18) {
                System.out.println("Вам уже " + age1 + " Поздравляем с совершеннолетием!");
            } else {
                System.out.println("Вам ещё только " + age1 + " возраст совершеннолетия ещё не наступил, нужно немного подождать");
            }

            //Задание 2
            System.out.println("Задание 2");
            if (age1 >= 7 && age1 < 18) {
                System.out.println("Ребёнок ходит в школу");
            } else if (age1 >= 18 && age1 < 24) {
                System.out.println("Человек уже закончил школу, ему пора идти в университет");
            } else if (age1 >= 24) {
                System.out.println("Человек окончил университет, ему пора искать первую работу");
            }

            //Задание 3
            System.out.println("Задание 3");
            int carCapacity1 = 102;
            int seats1 = 60;
            int standingPlaces1 = (carCapacity1 - seats1);

            int seatsPlaces1 = 39;
            int standinPlaces1 = 30;
            if (seats1 > seatsPlaces1) {
                System.out.println("Сидячих мест в вагоне " + (seats1 - seatsPlaces1));

            } else if (standingPlaces1 > standinPlaces1) {
                System.out.println("Стоячих мест в вагоне " + (standingPlaces1 - standinPlaces1));
            }

            //Домашнее задание 3
            System.out.println("Домашнее задание 3");
            //Задание 1
            System.out.println("Задание 1");
            int yers = 10;
            if (yers >= 2 && yers <= 6) {
                System.out.println("Если возраст человека равен " + yers + ", то ему нужно ходить в детский сад");
            } else if (yers >= 7 && yers <= 18) {
                System.out.println("Если возраст человека равен " + yers + ", то ему нужно ходить в школу");
            } else if (yers > 18 && yers < 24) {
                System.out.println("Если возраст человека равен " + yers + ", то ему нужно ходить в университет");
            } else if (yers > 24) {
                System.out.println("Если возраст человека равен " + yers + ", то ему нужно ходить на работу");
            }

            //Задание 2
            System.out.println("Задание 2");
            int yers1 = 16;
            if (yers1 < 5) {
                System.out.println("Ребёнку " + yers1 + " лет, он может кататься на атракционе");
            } else if (yers1 > 5 && yers1 < 14) {
                System.out.println("Ребёнку " + yers1 + " лет, он может кататься на атракционнах только в сопровождении взрослого, если взрослого нет, то кататься нельзя!");
            } else if (yers1 > 14) {
                System.out.println("Ребёнку " + yers1 + " лет, он может кататься на атракционах без сопровождения взрослого");
            }

            //Задание 3
            System.out.println("Задание 3");
            int one = 1;
            int two = 1;
            int three = 1;
            if (one > two) {
                if (one >= three) {
                    System.out.println("Максимальное число " + one);
                } else {
                    System.out.println("Максималье число " + three);
                }
            } else if (two > one) {
                if (two >= three) {
                    System.out.println("Максимальное число " + two);
                } else {
                    System.out.println("Максимальное число " + three);
                }
            } else if (three > one) {
                if (three >= two) {
                    System.out.println("Максимальное число " + three);
                } else {
                    System.out.println("Все 3 числа равны!");
                }
            }


        }
    }
}
