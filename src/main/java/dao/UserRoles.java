package dao;

/**
 * Created by hp on 18.07.2016.
 */
public class UserRoles {
    private int roleId;
    private String userName;
    private String userRole;

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public int getRoleId() {
        return roleId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserRole() {
        return userRole;
    }
}
