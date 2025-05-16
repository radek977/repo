package zad4;
import java.util.List;

public interface PersonRepositoryInterface {

    void save (Person person);
    boolean remove (Id id);
    boolean update (Person person);
    Person findById(Id id);
    List<Person> findByName(String name);
    List<Person> findByLastName(String lastName);
    List<Person> findByAge(int age);
}
