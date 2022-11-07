package _2_1;
import java.lang.*;
public class Author {
    private final String name;
    private String email;
    private final char gender;
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {return name;}
    public String getEmail() {return email;}
    public void setemail(String email) {this.email=email;}
    public char getGender() {return gender;}
    public String toString() {
        return "Author{" + "name" + name + "email" + email + "gender" + gender + "}";
    }}
