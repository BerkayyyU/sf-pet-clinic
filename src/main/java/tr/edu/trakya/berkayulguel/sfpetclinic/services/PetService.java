package tr.edu.trakya.berkayulguel.sfpetclinic.services;

import tr.edu.trakya.berkayulguel.sfpetclinic.model.Owner;
import tr.edu.trakya.berkayulguel.sfpetclinic.model.Pet;

import java.util.Set;

public interface PetService extends CrudService<Pet,Long>{

    //Pet findById(Long id); // return pet by pet id
    //Pet save(Owner owner); // save pet
    //Set<Pet> findAll(); // find all pets thats why we use Set. return list of pets
}
