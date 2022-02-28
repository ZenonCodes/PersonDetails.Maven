package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        int pArrayLen = personArray.length;
        StringBuilder result = new StringBuilder(pArrayLen);
        // create a `counter`
        int counter = 0;
        // while `counter` is less than length of array
        while (counter < pArrayLen) {
            // begin loop

            // use `counter` to identify the `current Person` in the array
            Person currentPerson = personArray[counter];
            // get `string Representation` of `currentPerson`
            currentPerson.toString();
            // append `stringRepresentation` to `result` variable
            result.append(currentPerson);
            counter++;

            // end loop
        }
        return result.toString();
    }



    public String forLoop() {
        int pArrayLen = personArray.length;
        StringBuilder result = new StringBuilder(pArrayLen);
        // identify initial value
        // identify terminal condition
        // identify increment


        // use the above clauses to declare for-loop signature
            // begin loop

        for (int counter = 0; counter < pArrayLen; counter++) {
            // use `counter` to identify the `current Person` in the array
            Person currentPerson = personArray[counter];
            // get `string Representation` of `currentPerson`
            currentPerson.toString();
            // append `stringRepresentation` to `result` variable
            result.append(currentPerson);
            // end loop
        }
        return result.toString();
    }



    public String forEachLoop() {
        StringBuilder result = new StringBuilder(personArray.length);
        String pString = "";

        // identify array's type
        // identify array's variable-name
        Person [] personList = personArray;


        // use the above discoveries to declare for-each-loop signature
        for (Person currentPerson : personList) {
            // begin loop
            // get `string Representation` of `currentPerson`
            pString = currentPerson.toString();
            // append `stringRepresentation` to `result` variable
            result.append(pString);
            // end loop
        }
        return result.toString();
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
