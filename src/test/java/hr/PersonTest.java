package hr;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {
    @Test
    public void personShouldHaveFullName() {
        Person p1 = new Person("Kalina", "Jędrusik");
        String fullName = p1.getPersonFullName();

        assertThat(fullName)
                .isEqualTo("Kalina Jędrusik");
    }

    @Test
    public void twoPeopleWithSameAttributesNameShouldHaveSameName() {
        Person p1 = new Person("Kalina", "Jędrusik");
        Person p2 = new Person("Kalina", "Jędrusik");
        String fullName = p1.getPersonFullName();

        assertThat(p1.sameNameAndSurname(p2))
                .isTrue();
    }
}
