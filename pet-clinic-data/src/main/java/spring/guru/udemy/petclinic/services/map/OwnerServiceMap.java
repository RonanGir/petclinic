package spring.guru.udemy.petclinic.services.map;

import spring.guru.udemy.petclinic.model.Owner;
import spring.guru.udemy.petclinic.services.AbstractMapService;
import spring.guru.udemy.petclinic.services.OwnerService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long>  implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
