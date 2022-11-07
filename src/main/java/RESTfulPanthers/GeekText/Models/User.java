package Models;

public record User(Integer id, String Name) {

    public String fullName() {
        return Name + " ";
    }

}
