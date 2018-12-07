package controllers;

import play.mvc.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        String num = "16070941";
        for(int i=1;i<57;i++){
            Student s = new Student(num+i,num+i);
            s.save();
        }
        Manage admin = new Manage("1607094153","hedeqing");
        admin.save();

        Teacher teacher  = new Teacher("1","王老师");
        teacher.save();
        Courser courser  = new Courser("英语",teacher);
        courser.save();
        render();
    }
}