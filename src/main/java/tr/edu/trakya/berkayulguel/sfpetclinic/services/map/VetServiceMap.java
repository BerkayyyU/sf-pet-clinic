package tr.edu.trakya.berkayulguel.sfpetclinic.services.map;

import org.springframework.stereotype.Service;
import tr.edu.trakya.berkayulguel.sfpetclinic.model.Vet;
import tr.edu.trakya.berkayulguel.sfpetclinic.services.CrudService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements CrudService<Vet,Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(),vet);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
