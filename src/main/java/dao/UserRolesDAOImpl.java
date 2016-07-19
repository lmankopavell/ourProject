package dao;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by hp on 18.07.2016.
 */
public class UserRolesDAOImpl extends HibernateDaoSupport implements UserRolesDAO {
    public List findAllUsers() {
        List users = getHibernateTemplate().loadAll(UserRoles.class);
        return  users;
    }
}
