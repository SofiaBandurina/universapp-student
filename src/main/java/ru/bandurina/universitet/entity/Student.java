package ru.bandurina.universitet.entity;

import ru.bandurina.universitet.service.GoToUniversity;
import ru.bandurina.universitet.service.TeachesExamTickets;

public class Student implements GoToUniversity, TeachesExamTickets {
    Teacher lecturer;//преподаватель
    University educationalInstitution;//образовательное учреждение

    @Override
    public void goToUniver(){
        System.out.println("I go to study at the University!");
    }

    @Override
    public void teachesExamTick(){
        System.out.println("I am studying exam tickets!");
    }
}
