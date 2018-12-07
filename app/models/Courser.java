package models;

import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Courser  extends Model {
    @Required
    public String courserName;

    @Required
    @OneToOne
    public  Teacher teacher;

    public Courser(String courserName,Teacher teacher) {
        this.courserName = courserName;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return courserName;
    }
}
