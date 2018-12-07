package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Manage extends Model {
    public  String adminID;
    public  String name;

    public Manage(String adminID,String name) {
        this.adminID = adminID;
        this.name =name;
    }

    @Override
    public String toString() {
        return name;
    }
    public  static Manage connect(String adminID,String name){
        return find("byAdminIDAndName", adminID, name).first();
    }
}
