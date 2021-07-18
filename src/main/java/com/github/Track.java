package com.github;

public class Track implements Barrier{
    private int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean run(Player player) {
        if (player.run(this.length)) {
            System.out.println(player.getName()+" Пробежал");
            return true;
        }else {
            System.out.println(player.getName()+" Не пробежал");
        }
        System.out.println();
        return false;
    }
}
