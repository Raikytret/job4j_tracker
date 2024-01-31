package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Михаил");
        student.setSurname("Жарков");
        student.setPatronum("Викторович");
        student.setGroup("5-2");
        student.setDate("28.08.2010");
        System.out.println("Студент группы " + student.getGroup() + ", " + student.getSurname() + " "
                + student.getName() + " " + student.getPatronum() + ", зачислен " + student.getDate());
    }
}
