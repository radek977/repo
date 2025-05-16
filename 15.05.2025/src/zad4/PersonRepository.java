package zad4;
import java.util.HashSet;
import java.util.Set;

public class PersonRepository implements PersonRepositoryInterface {

    private Set<Person> people;

    public PersonRepository() {
        this.people = new HashSet<>();
    }

    @Override
    public void save(Person person) {
        if (person != null) {
            people.add(person);
        }
    }

    @Override
    public boolean remove(Id id) {
        for (Person person : people) {
            if (person.getId().getId().equals(id.getId())) {
                people.remove(person);
                return true;
            }
        }
        return false;
    }
}
