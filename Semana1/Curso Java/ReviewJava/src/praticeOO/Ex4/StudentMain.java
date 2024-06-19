package praticeOO.Ex4;

public class StudentMain {
    public static void main(String[] args) {
        double[] notes = {8.5, 7.0, 6.5};
        Student s1 = new Student("João", 123456 , notes);

        System.out.println("Nome: " + s1.getName());
        System.out.println("Matrícula: " + s1.getId());
        System.out.println("Média: " + s1.avg());
        System.out.println("Situação: " + s1.isAprovved());
    }
}
