package com.Lifelink.HeathCareBridge.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "donors")
@DiscriminatorValue("DONOR")
public class Donor extends User {
    @Enumerated(EnumType.STRING)
    @NotNull(message = "Blood group is required")
    private BloodGroup bloodGroup;
    @Enumerated(EnumType.STRING)
    @NotNull(message = "Blood component is required")
    private BloodComponent bloodComponent;
    private String city;
    private int age ;

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public BloodComponent getBloodComponent() {
        return bloodComponent;
    }

    public void setBloodComponent(BloodComponent bloodComponent) {
        this.bloodComponent = bloodComponent;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}