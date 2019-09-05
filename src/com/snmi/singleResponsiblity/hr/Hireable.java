package com.snmi.singleResponsiblity.hr;

import com.snmi.singleResponsiblity.company.JobPositionType;
import com.snmi.singleResponsiblity.Person;
import com.snmi.singleResponsiblity.company.Company;

/**
 * Interface Hireable which every human resource need to implement
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public interface Hireable {

    void hireNewEmployee(Person person, int systemId, JobPositionType jobPositionType, Company company);

}
