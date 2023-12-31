package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet {

    private PetType petType;
    private Owner owner;
    private LocalDate birDate;
    
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
    public LocalDate getBirDate() {
        return birDate;
    }
    public void setBirDate(LocalDate birDate) {
        this.birDate = birDate;
    }

    
}
