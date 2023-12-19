package spring.guru.udemy.petclinic.services.map;


import org.springframework.stereotype.Service;
import spring.guru.udemy.petclinic.model.Pet;
import spring.guru.udemy.petclinic.services.AbstractMapService;
import spring.guru.udemy.petclinic.services.PetService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
}
