package com.github;

public class Wall implements Barrier {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean run(Player player) {
        if (player.jump(this.height)) {
            System.out.println(player.getName()+" Перепрыгнул");
            return true;
        }else {
            System.out.println(player.getName()+" Не перепрыгнул");
        }
        System.out.println();
        return false;
    }
}
