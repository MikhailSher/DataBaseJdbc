package ru.db.jdbc.dao;

import ru.db.jdbc.models.User;

import java.util.List;

/**
 * 02.11.2020
 * DaoForUser
 *
 * @author Sherstobitov Mikhail
 * @version v1.0
 */
public interface DaoForUser extends Dao<User> {
    List<User> findAllByFirstName(String firstName);
}
