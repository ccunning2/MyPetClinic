package com.cameroncunning.my_pet_clinic.bootstrap;

import com.cameroncunning.my_pet_clinic.model.Owner;
import com.cameroncunning.my_pet_clinic.model.Vet;
import com.cameroncunning.my_pet_clinic.services.OwnerService;
import com.cameroncunning.my_pet_clinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    private final VetService vetService;




    public DataLoader(OwnerService ownerService, VetService vetService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();

        owner1.setFirstName("Cameron");
        owner1.setLastName("Rogerson");

        ownerService.save(owner1);

        Owner owner2 = new Owner();

        owner2.setFirstName("Billy");
        owner2.setLastName("Mays");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();

        vet1.setFirstName("Bill");
        vet1.setLastName("Bellichick");

        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setFirstName("Angelina");
        vet2.setLastName("Jolie");

        vetService.save(vet2);

        System.out.println("Loaded vets...");

    }
}
