package dao;

import java.util.List;

/**
 * Created by hp on 18.07.2016.
 */
public class UserRolesServiceImpl implements UserRolesService {
    private UserRolesDAO usersDao;

    public List findAllUsers() {
        return usersDao.findAllUsers();
    }
}
