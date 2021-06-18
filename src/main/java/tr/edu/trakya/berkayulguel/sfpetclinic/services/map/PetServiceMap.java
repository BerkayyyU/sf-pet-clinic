package tr.edu.trakya.berkayulguel.sfpetclinic.services.map;

import org.springframework.stereotype.Service;
import tr.edu.trakya.berkayulguel.sfpetclinic.model.Pet;
import tr.edu.trakya.berkayulguel.sfpetclinic.services.CrudService;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet,Long> implements CrudService<Pet,Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
