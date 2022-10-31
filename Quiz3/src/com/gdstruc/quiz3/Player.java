package com.gdstruc.quiz3;

import java.util.Random;

public class Player {
    private int level;
    private String name;

    public Player() {
        setLevel();
        setName();
    }

    public int getLevel() {
        return level;
    }

    public void setLevel() {
        Random random = new Random();

        /// random set level from 1-100
        int randomLevel = random.nextInt(100 - 1) + 1;
        this.level = randomLevel;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        Random random = new Random();

        /// set name
        int namePicker = random.nextInt( 59); // 60 names. -1 since count starts 0.

        String[] names = new String[]{
                "Huffe", "Gerarda", "Harrelsone", "Edith", "Haleye",
                "Primrose", "Aiken", "Sigeberht", "Arkwrighte", "Melba",
                "Combose", "Haige", "Edvin", "Brooke", "Leofric",
                "Haywarde", "Mildred", "Fenne", "Whitakere", "Appletone",
                "Harper", "Lili", "Greye", "Rovena", "Algere",
                "Hailie", "Hortone", "Haywoode", "Alveye", "Fairley",
                "Royce", "Hoggarde", "Annice", "Egbert", "Irvine",
                "Eoforhild", "Waynee", "Baine", "Fultone", "Melinda",
                "Eldrede", "Æðelric", "Beorhtric", "Waltone", "Averil",
                "Sunniva", "Headleye", "Varnhame", "Heartha", "Fenne",
                "Garry", "Edda", "Greene", "Marlee", "Hillame",
                "Mildgyð", "Warricke", "Langley", "Blythe", "Wallis"}; // 60 Names in total

        this.name = names[namePicker];
    }

    @Override
    public String toString() {
        return "Player{" +
                "Name : " + name +
                ", Level : " + level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com.gdstruc.quiz3.Player player = (com.gdstruc.quiz3.Player) o;
        return level == player.level && java.util.Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(level, name);
    }
}
