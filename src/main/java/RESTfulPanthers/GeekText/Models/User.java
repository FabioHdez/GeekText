package Models;

//Record type to create classes
public record User(Integer id, String Name) {

    public String fullName() {
        return Name + " ";
    }

}
