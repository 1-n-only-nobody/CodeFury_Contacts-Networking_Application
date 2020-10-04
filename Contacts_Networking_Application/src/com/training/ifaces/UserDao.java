/**
 * 
 */
package com.training.ifaces;

import java.util.Set;

import com.training.entity.Contact;
import com.training.entity.Person;

/**
 * @author manan
 *
 */
public interface UserDao {

	boolean addContact(Contact contact);
	Set<Contact> viewContacts();
	Set<Person> viewFriends();
	void searchUsers();
	Set<Person> viewBlockedUsers();
	
}
