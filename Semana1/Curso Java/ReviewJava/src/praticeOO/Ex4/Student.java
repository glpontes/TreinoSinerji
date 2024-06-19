package praticeOO.Ex4;

/*
Implemente uma classe chamada “Aluno” que possua atributos para armazenar o nome,
a matrícula e as notas de um aluno. Adicione métodos para calcular a média das notas
e verificar a situação do aluno (aprovado ou reprovado).
*/

public class Student {
    private String name;
    private int id;
    private double [] notes;

    public Student(String name, int id, double [] notes) {
        this.name = name;
        this.id = id;
        this.notes = notes;
    }

    public double avg(){
        double sum = 0;
        for (int i = 0; i < notes.length; i++) {
            sum += notes[i];
        }
        return sum/notes.length;
    }

    public String isAprovved() {
        double average = avg();
        if (avg() >= 7.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double[] getNotes() {
        return notes;
    }

    public void setNotes(double[] notes) {
        this.notes = notes;
    }
}
