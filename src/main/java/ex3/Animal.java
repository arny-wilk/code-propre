package ex3;

import java.util.Objects;

public class Animal {
    private String types;
    private String noms;
    private String comportements;

    public Animal(String types, String noms, String comportements) {
        this.types = types;
        this.noms = noms;
        this.comportements = comportements;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getNoms() {
        return noms;
    }

    public void setNoms(String noms) {
        this.noms = noms;
    }

    public String getComportements() {
        return comportements;
    }

    public void setComportements(String comportements) {
        this.comportements = comportements;
    }

    @Override
    public String toString() {
        return "types='" + types + '\'' +
                ", noms='" + noms + '\'' +
                ", comportements='" + comportements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(types, animal.types) && Objects.equals(noms, animal.noms) && Objects.equals(comportements, animal.comportements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(types, noms, comportements);
    }
}
