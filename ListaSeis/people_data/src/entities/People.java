package entities;

public class People {
    private char gender;
    private double height;

    public People(double height, char gender) {
        this.height = height;
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public char getGender() {
        return gender;
    }
}
