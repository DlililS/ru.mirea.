package _2_5;

public class Dog {
    private String name;
    private Integer id;
    /**
     *
     */
    //private ArrayList<String> list;
    private Double age;
    public Dog(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public Dog(String name, Double age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setAge(Double age) {
        this.age = age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getAge() {
        return age;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name){
        this.name = name;
    }
    public double humandogage(Double age){
        this.age = age;
        return age*7;
    }
    public String toString() {
        return "name: " + name + " age: " + age;
    }

}
