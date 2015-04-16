package com.photobook.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;

import com.photobook.model.User;
import org.hibernate.SQLQuery;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl extends AbstractDao implements UserDao
{

	@Override
	public List<User> findAll() {
		return getSession().createSQLQuery("select u from User u").list();
	}

	@Override
	public User findUserById(Long id) {
		return (User)getSession().get(User.class, id);
	}

    @Override
	public User create(User user) {
		if(user.getId() <= 0){
            getSession().persist(user);
		} else {
			user = (User)getSession().merge(user);
		}
		return user;
	}

	@Override
	public User login(String email) {
        SQLQuery query = getSession().createSQLQuery("select u from User u where u.email=?1");
		query.setParameter(1, email);
		try {
			return (User)query.uniqueResult();
		} catch (NonUniqueResultException e) {
			return null;
        } catch (NoResultException e) {
            return null;
        }
	}

    @Override
    public void removeUser(Long userId) {
        User entity = findUserById(userId);
        if (entity != null) {
            delete(entity);
        }
    }

}

