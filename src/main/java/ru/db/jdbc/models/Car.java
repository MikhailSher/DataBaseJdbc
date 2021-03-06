package ru.db.jdbc.models;

/**
 * 02.11.2020
 * Car
 *
 * @author Sherstobitov Mikhail
 * @version v1.0
 */
public class Car {
    private Integer id;
    private String model;
    private User owner;

    public Car() {
    }

    public Car(Integer id, String model, User owner) {
        this.id = id;
        this.model = model;
        this.owner = owner;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
