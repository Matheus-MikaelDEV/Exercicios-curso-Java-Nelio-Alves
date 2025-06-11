package entities;

public class Student {
    private String name;
    private double firstNote;
    private double secondNote;

    public Student(String name, double firstNote, double secondNote) {
        this.name = name;
        this.firstNote = firstNote;
        this.secondNote = secondNote;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return (firstNote + secondNote) / 2.0;
    }
}
