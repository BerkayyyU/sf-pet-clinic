package tr.edu.trakya.berkayulguel.sfpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tr.edu.trakya.berkayulguel.sfpetclinic.services.map.OwnerServiceMap;
import tr.edu.trakya.berkayulguel.sfpetclinic.services.map.PetServiceMap;


@Controller
public class PetController {

    private final PetServiceMap petServiceMap;

    public PetController(PetServiceMap petServiceMap, OwnerServiceMap ownerServiceMap) {
        this.petServiceMap = petServiceMap;
    }

    @RequestMapping({"/pets","pets/index","pets/index.html"})
    public String listPets(Model model){
        model.addAttribute("pets",petServiceMap.findAll());
        return "pets/index";
    }
}
