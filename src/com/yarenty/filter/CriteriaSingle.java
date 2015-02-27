package com.yarenty.filter;

/**
 * Created by yarenty on 02/02/15.
 */

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(final List<Person> persons) {
        final List<Person> singlePersons = new ArrayList<Person>();

        for (final Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
