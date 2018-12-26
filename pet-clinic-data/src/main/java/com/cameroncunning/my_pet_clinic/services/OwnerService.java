package com.cameroncunning.my_pet_clinic.services;

import com.cameroncunning.my_pet_clinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);


}
