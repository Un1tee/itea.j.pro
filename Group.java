package Lesson5_tasks;

public class Group {


    Student[] students;
    private int size;

    public Group(){
        students = new Student[10];
        size = 0;
    }

    public void addStudent(Student student) {
        if (size < 10) {
            students[size] = student;
            size++;
        } else {
            System.out.println("Group is full");
        }
    }

    public void deleteStudent(Student student) {
        for (int i = 0; i < size; i++) {
            if (students[i].equals(student)) {
                for (int j = i; j < size - 1; j++) {
                    students[j] = students[j + 1];
                    students[size - 1] = null;
                }
                size--;
                break;
            }
        }
    }

    public Student findStudentBySurname(String surname) {
        for (int i = 0; i < size; i++) {
            if (students[i].getSurname().equals(surname)) {
                return students[i];
            }
        }
        return null;
    }
}

