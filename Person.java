public class Person extends Exception {

    String firstname;
    String lastname;
    int age;
    char gender;

    public Person(String lname, String fname, int age, char gender)
            throws InvalidGenderException, InvalidNumberException {
        if (age < 0)
            throw new InvalidNumberException();
        if (gender != 'M' || gender != 'F')
            throw new InvalidGenderException();
        else {
            this.firstname = fname;
            this.lastname = lname;
            this.age = age;
            this.gender = gender;
        }
    }

    public static void main(String[] args) {
        Person p_ = null;
        try {
            p_ = new Person("Skywalker", "Anakin", 42, 'M');
        } catch (InvalidNumberException ex) {
            System.err.println(ex.getMessage());
        } catch (InvalidGenderException ex) {
            System.err.println(ex.getMessage());
        }
    }

}

