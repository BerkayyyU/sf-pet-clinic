package tr.edu.trakya.berkayulguel.sfpetclinic.services;

import tr.edu.trakya.berkayulguel.sfpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName); // return owner by searching lastName

    //Owner findById(Long id); // return owner by owner id
    //Owner save(Owner owner); // save owner
    //Set<Owner> findAll(); // find all owners thats why we use Set. return list of owners
}
