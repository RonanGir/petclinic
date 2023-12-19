package spring.guru.udemy.petclinic.services.map;

import org.springframework.stereotype.Service;
import spring.guru.udemy.petclinic.model.Vet;
import spring.guru.udemy.petclinic.services.AbstractMapService;
import spring.guru.udemy.petclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
}
