package com.ken.tutorial.twitterclone.DAO;

import com.ken.tutorial.twitterclone.entities.UserAccount;
import com.ken.tutorial.twitterclone.mappers.UserAccountMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class UserAccountJDBC implements IUserAccountDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate();
    }

    @Override
    public void create(Integer userId, String userPassword, String userName, String userEmail) {
        String sql = "INSERT INTO user_account (userId, userPassword, userName, userEmail) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, userId, userPassword, userName, userEmail);
    }

    @Override
    public UserAccount getUserAccount(Integer userId) {
        String sql = "SELECT * FROM user_account WHERE user_id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{userId}, new UserAccountMapper());
    }

    @Override
    public List<UserAccount> getUserList() {
        String sql = "SELECT * FROM user_account";
        return jdbcTemplate.query(sql, new UserAccountMapper());
    }

    @Override
    public void updateUserEmail(Integer userId, String userEmail) {
        String sql = "UPDATE user_account SET user_email = ?, WHERE = ?";
        jdbcTemplate.update(sql, userId, userEmail);
    }

    @Override
    public void deleteUser(Integer userId) {
        String sql = "DELETE * FROM user_account WHERE = ?";
        jdbcTemplate.update(sql, userId);
    }
}
