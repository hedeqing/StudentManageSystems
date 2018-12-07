package models;

import play.data.validation.Max;
import play.data.validation.MaxSize;
import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Teacher extends Model {
    @Required
    @MaxSize(8)
    public  String teacherId;
    @Required
    @MaxSize(8)
    public String nameTeacher;

    public Teacher(String teacherId,String nameTeacher) {
        this.teacherId = teacherId;
        this.nameTeacher = nameTeacher;
    }

    @Override
    public String toString() {
        return nameTeacher;
    }
    public static Teacher connect(String teacherId,String nameTeacher){
        return  find("byTeacherIDAndNameTeacher",teacherId,nameTeacher).first();
    }
}
