import java.util.Objects;

public class magazine extends printable {
    private String name;

    public magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print(){
        System.out.println("printable magazine " + getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        magazine magazine = (magazine) o;
        return Objects.equals(name, magazine.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "magazine{" +
                "name='" + name + '\'' +
                '}';
    }
    public void    printMagazines(printable[] printable){
        System.out.println(name);
    }
}
