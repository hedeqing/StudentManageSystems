package controllers;

import models.Manage;
import models.Student;
import models.Teacher;

public class Security extends  Secure.Security {
    static  boolean authenticate(String adminId,String name){
        if (Manage.connect(adminId,name)!=null){
            return true;
        }
        else if(Student.connect(adminId,name)!=null){
            return  true;
        }else if(Teacher.connect(adminId,name)!=null){
            return  true;
        }else return  false;
//        return Admin.connect(adminId,name) != null;
    }

    public static boolean check(String profile) {
        if(Security.isConnected()){
            if(profile.equals("adminer")) {

                String name = Security.connected();
                System.out.println(name);
                Manage a= Manage.find("byAdminID", name).first();
                System.out.println(a);
                return a!=null;
            }
            else {
                // 其他角色的判断...
                String  names = Security.connected();
                Student student = Student.find("byName",names).first();
                Teacher teacher = Teacher.find("byName",names).first();
                System.out.println(names);
                System.out.println(student);
                System.out.println(teacher);
                return student != null||teacher!=null;
            }
        }
        else
            return false;
    }

}
