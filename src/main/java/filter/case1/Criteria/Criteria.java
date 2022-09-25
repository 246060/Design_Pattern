package filter.case1.Criteria;

import filter.case1.Person;

import java.util.List;

public interface Criteria {
	List<Person> meetCriteria(List<Person> persons);
}
