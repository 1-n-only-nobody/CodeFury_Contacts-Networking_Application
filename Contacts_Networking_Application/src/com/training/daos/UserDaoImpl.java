/**
 * 
 */
package com.training.daos;

import java.util.Set;

import com.training.entity.Contact;
import com.training.entity.Person;
import com.training.ifaces.UserDao;

/**
 * @author manan
 *
 */
public class UserDaoImpl implements UserDao {

	@Override
	public boolean addContact(Contact contact) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Contact> viewContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Person> viewFriends() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void searchUsers() {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<Person> viewBlockedUsers() {
		// TODO Auto-generated method stub
		return null;
	}


}
