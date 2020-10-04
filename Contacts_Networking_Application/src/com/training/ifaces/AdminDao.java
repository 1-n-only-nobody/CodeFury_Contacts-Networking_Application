/**
 * 
 */
package com.training.ifaces;

import com.training.entity.Person;

/**
 * @author manan
 *
 */
public interface AdminDao {

	boolean disableUser(Person user);
	boolean deleteUser(Person user);
	void showSummary();
}
