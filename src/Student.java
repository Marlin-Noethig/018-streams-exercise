import java.util.Objects;

public class Student {
    private String ID;
    private String Name;
    private String postalCode;
    private String age;

    public Student(String ID, String name, String postalCode, String age) {
        this.ID = ID;
        this.Name = name;
        this.postalCode = postalCode;
        this.age = age;
    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(getID(), student.getID()) && Objects.equals(getName(), student.getName()) && Objects.equals(getPostalCode(), student.getPostalCode()) && Objects.equals(getAge(), student.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getID(), getName(), getPostalCode(), getAge());
    }
}
