package com.github;

public class Main {

    public static void main(String[] args) {
        Player[] player = {
                 new Cat("Барсик", 1650, 300),
                 new Cat("Котик", 1700, 110),
                 new Robot("ATLAS", 80000, 466),
                 new Robot("Робот Фёдор", 5000, 41),
                 new Human("Вова", 2500, 220),
                 new Human("Боб", 8530, 120)
        };

        Barrier[]  barrier = {
                new Track(440),
                new Wall(30),
                new Track(55),
                new Wall(144),
                new Track(7000),
                new Wall(850)
        };

        int i = 0;
        for (int j = 0; j < barrier.length; j++) {
            if(i < player.length) {
                if (!(barrier[j].run(player[i]))) {
                    i++;
                    j = 0;
                }
            }
        }

    }
}
