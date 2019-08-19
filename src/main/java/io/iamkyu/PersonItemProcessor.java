package io.iamkyu;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

@Slf4j
public class PersonItemProcessor implements ItemProcessor<Person, Person> {
    @Override
    public Person process(Person item) throws Exception {
        String firstName = item.getFirstName();
        String lastName = item.getLastName();

        Person transform = Person.builder()
                .firstName(firstName.toUpperCase())
                .lastName(lastName.toLowerCase())
                .build();

        log.info("Converting (" + item + ") into (" + transform + ")");

        return transform;
    }
}
