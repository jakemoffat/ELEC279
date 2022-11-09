/* Name: Jake Moffat
 * Student #: 20212243
 * April 13, 2022
 */

package com.example.guessmaster;

public class Person extends Entity{
    private String gender;

    public Person(String name, Date birthDate) {
        super(name, birthDate);
    }

    public Person(String name,
                  Date birthDate,
                  String gender,
                  double difficulty) {
        super(name, birthDate, difficulty);
        this.gender = gender;
    }

    public Person(Person person) {
        super(person);
        this.gender = person.gender;
    }

    public String entityType() {
        return "This entity is a person!";
    }

//	public String welcomeMessage() {
//		return "Welcome! Letís start the game! "+entityType();
//	}

    public String toString() {
        return super.toString() + "Gender: " + gender + "\n";
    }

    public Person clone() {
        return new Person(this);
    }
}
