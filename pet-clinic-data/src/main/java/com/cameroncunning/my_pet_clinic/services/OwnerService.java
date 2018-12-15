package com.cameroncunning.my_pet_clinic.services;

import com.cameroncunning.my_pet_clinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById();

    Owner save(Owner owner);

    Set<Owner> findAll();
}