package entities;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Double> notes = new ArrayList<>();

    public Student() {

    }

    public void addNote(double note) {
        this.notes.add(note);
    }

    public double calculateAverage() {
        if (notes.isEmpty()) return 0.0;
        
        double sum = 0;
        for (double note : notes) {
            sum += note;
        }
        return sum / notes.size();
    }

    @Override
    public String toString() {
        return String.format("Aluno: %s | Média: %.2f", name, calculateAverage());
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
