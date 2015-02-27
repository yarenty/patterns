package com.yarenty.filter;

/**
 * Created by yarenty on 02/02/15.
 */

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(final List<Person> persons) {
        final List<Person> malePersons = new ArrayList<Person>();

        for (final Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
