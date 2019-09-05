package com.snmi.singleResponsiblity.company;

import com.snmi.singleResponsiblity.Employee;

/**
 * Responsible interface which company need to implement
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public interface Responsible {

    void addToCompany(Employee employee);

}
