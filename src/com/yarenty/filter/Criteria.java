package com.yarenty.filter;

/**
 * Created by yarenty on 02/02/15.
 */

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(final List<Person> persons);
}
