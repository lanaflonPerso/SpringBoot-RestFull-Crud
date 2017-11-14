package mc.entity;

import javax.persistence.*;


@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    protected User(){

    }

    public User(int id , String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public User(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
