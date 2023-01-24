package org.example;

public class Child{
    private String name;
    private String subname;
    private int ball;

    public Child(String name, String subname, int ball) {
        this.name = name;
        this.subname = subname;
        this.ball = ball;
    }

    public String getName() {
        return name;
    }

    public String getSubname() {
        return subname;
    }

    public int getBall() {
        return ball;
    }

    @Override
    public String toString() {
        return String.format("name: %s, subname: %s, ball: %d", name, subname, ball);
    }
}
