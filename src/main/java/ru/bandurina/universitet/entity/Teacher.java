package ru.bandurina.universitet.entity;

import ru.bandurina.universitet.service.ConductsLectures;
import ru.bandurina.universitet.service.GoToUniversity;

public class Teacher implements GoToUniversity, ConductsLectures {
    Student learner;//ученик
    University work;//работа

    @Override
    public void goToUniver(){
        System.out.println("I go to work at the University!");
    }

    @Override
    public void conductsLectur(){
        System.out.println("I conduct lectures for students!");
    }
}
