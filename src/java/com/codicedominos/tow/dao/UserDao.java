<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codicedominos.tow.dao;

import com.codicedominos.tow.model.User;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Asha
 */
public interface UserDao {
    public boolean isuserExist(String email, String userName, Connection c) throws SQLException, ClassNotFoundException;

    public boolean userLogIn(String email, String password, Connection c) throws SQLException, ClassNotFoundException;

    public User user(String email, String password, Connection c) throws SQLException, ClassNotFoundException;
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codicedominos.tow.dao;

import com.codicedominos.tow.model.User;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Asha
 */
public interface UserDao {
    public boolean isuserExist(String email, String userName, Connection c) throws SQLException, ClassNotFoundException;

    public boolean userLogIn(String email, String password, Connection c) throws SQLException, ClassNotFoundException;

    public User user(String email, String password, Connection c) throws SQLException, ClassNotFoundException;
}
>>>>>>> b592174b925c384ece0f31f55557df5f7d33b354
