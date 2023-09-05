package ru.bandurina.universitet._main;

import ru.bandurina.universitet.entity.*;
import ru.bandurina.universitet.service.Executor;

public class _Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();
        University university = new University();
        Executor executor = new Executor();
        Executor.makeGoToUniver(teacher);
        Executor.makeGoToUniver(student);
        Executor.makeConductsLectur(teacher);
        Executor.makeTeachesExamTick(student);
    }
}
