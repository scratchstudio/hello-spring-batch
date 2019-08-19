package io.iamkyu;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter // Caused by: java.lang.IllegalStateException: Could not access method: Class org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper can not access a member of class io.iamkyu.Person with modifiers "private"
@NoArgsConstructor
@ToString
public class Person {
    private String firstName;
    private String lastName;

    @Builder
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
