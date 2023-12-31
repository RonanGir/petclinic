package spring.guru.udemy.petclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity{

    private LocalDate birthDate;
    private PetType petType;
    private Owner owner;

    public Pet(Long id, LocalDate birthDate, PetType petType, Owner owner) {
        super(id);
        this.birthDate = birthDate;
        this.petType = petType;
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
