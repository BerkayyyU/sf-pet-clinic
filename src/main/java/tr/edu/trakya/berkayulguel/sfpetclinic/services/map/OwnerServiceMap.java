package tr.edu.trakya.berkayulguel.sfpetclinic.services.map;

import org.springframework.stereotype.Service;
import tr.edu.trakya.berkayulguel.sfpetclinic.model.Owner;
import tr.edu.trakya.berkayulguel.sfpetclinic.services.CrudService;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(),owner);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
