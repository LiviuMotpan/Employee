package it.step;

import sun.util.resources.LocaleData;

import java.time.LocalDate;

public interface EmpInterface {

    void view(int id,int type);
    void create(int id, String name, String surname, String gender, LocalDate birthday);
    void update(int id,String name,String surname,String gender, LocalDate birthday);
    void delete(int id);

}
