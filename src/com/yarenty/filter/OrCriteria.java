package com.yarenty.filter;

/**
 * Created by yarenty on 02/02/15.
 */

import java.util.List;

public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(final Criteria criteria, final Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(final List<Person> persons) {
        final List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        final List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        for (final Person person : otherCriteriaItems) {
            if (!firstCriteriaItems.contains(person)) {
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}