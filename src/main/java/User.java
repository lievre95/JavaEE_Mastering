import java.io.Serializable;

public class User implements Serializable {
    private static final long serialversioUID = 399324824284280L;
    private String name;
    private int age;

    public User() {
        this.name = "";
        this.age = 0;
    }
    public User(String name, int age) {
        this.name = "";
        this.age = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

