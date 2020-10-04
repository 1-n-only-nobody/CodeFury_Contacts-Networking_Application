/**
 * 
 */
package com.training.ifaces;

import com.training.entity.Person;

/**
 * @author manan
 *
 */
public interface RequestBlockDao {

	boolean sendRequest(Person user1, Person user2);
	boolean blockUser(Person user1, Person user2);
	boolean unblockUser(Person user1, Person user2);
}
