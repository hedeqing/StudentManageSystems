package models;

import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
public class Recording extends Model {
    @Required
    @OneToOne
    public  Courser  courser;

//    @Required
//    @OneToOne
//    public  Teacher teacher;

    @Required
    @OneToOne
    public Student student;

    @Override
    public String toString() {
        return  courser.courserName;
    }
}
