package spring.guru.udemy.petclinic.model;

public class PetType extends BaseEntity{

    private String name;

    public PetType(Long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
