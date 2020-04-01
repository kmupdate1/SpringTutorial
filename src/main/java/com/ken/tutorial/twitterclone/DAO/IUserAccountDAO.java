package com.ken.tutorial.twitterclone.DAO;

import com.ken.tutorial.twitterclone.entities.UserAccount;

import javax.sql.DataSource;
import java.util.List;

public interface IUserAccountDAO {
    public void setDataSource(DataSource dataSource);
    public void create(Integer userId, String userPassword, String userName, String userEmail);
    public UserAccount getUserAccount(Integer userId);
    public List<UserAccount> getUserList();
    public void updateUserEmail(Integer userId, String userEmail);
    public void deleteUser(Integer userId);
}
