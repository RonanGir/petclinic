package spring.guru.udemy.petclinic.services;

import spring.guru.udemy.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
