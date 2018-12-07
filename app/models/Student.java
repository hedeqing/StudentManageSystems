package models;

import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Student extends Model {

        @Required
        public String nameStudent;

        public String studentID;



        public Student(String nameStudent,String studentID) {
                this.nameStudent = nameStudent;
                this.studentID = studentID;
        }

        @Override
        public String toString() {
                return nameStudent;
        }
        public static Student connect(String nameStudent,String studentID){
                return  find("byNameStudentAndStudentID",nameStudent,studentID).first();
        }

}
