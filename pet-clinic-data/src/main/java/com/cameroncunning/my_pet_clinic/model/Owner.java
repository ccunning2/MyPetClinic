package com.cameroncunning.my_pet_clinic.model;

import java.util.Set;

public class Owner extends Person {
    private String address;
    private String ciry;
    private String telephone;
    private Set<Pet> pets;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCiry() {
        return ciry;
    }

    public void setCiry(String ciry) {
        this.ciry = ciry;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
