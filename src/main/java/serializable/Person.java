package serializable;

import java.io.Serializable;

/**
 * @author luliangliang9534@100.me
 */
public class Person implements Serializable {

    private static final long serialVersionUID = -5496450872578488311L;

    private transient InnerPerson innerPerson;

    private String name;

    public Integer age;

    private static Integer height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public InnerPerson getInnerPerson() {
        return innerPerson;
    }

    public static Integer getHeight() {
        return height;
    }

    public static void setHeight(Integer height) {
        Person.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
            "innerPerson=" + innerPerson +
            ", name='" + name + '\'' +
            ", age=" + age +
            '}';
    }

    public void setInnerPerson(InnerPerson innerPerson) {
        this.innerPerson = innerPerson;
    }
}
