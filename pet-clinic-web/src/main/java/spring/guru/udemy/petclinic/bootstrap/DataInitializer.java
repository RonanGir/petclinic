package spring.guru.udemy.petclinic.bootstrap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.guru.udemy.petclinic.model.Owner;
import spring.guru.udemy.petclinic.model.Vet;
import spring.guru.udemy.petclinic.services.OwnerService;
import spring.guru.udemy.petclinic.services.VetService;
import spring.guru.udemy.petclinic.services.map.OwnerServiceMap;
import spring.guru.udemy.petclinic.services.map.VetServiceMap;


@Component
public class DataInitializer implements CommandLineRunner {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataInitializer() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner(1L, "John", "Doe");
        ownerService.save(owner1);
        Owner owner2 = new Owner(2L, "Jane", "Doe");
        ownerService.save(owner2);

        log.info("----- LOADED OWNERS ----");

        Vet vet1 = new Vet(1L, "Flore", "Delacour");
        vetService.save(vet1);
        Vet vet2 = new Vet(2L, "Barney", "Stinson");
        vetService.save(vet2);

        log.info("----- LOADED VETS ----");

    }
}
