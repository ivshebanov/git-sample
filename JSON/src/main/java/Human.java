import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Human {
    private String firstName;
    private String lastName;

    public Human() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
