package com.ken.tutorial.twitterclone.sample.domain.repositories.mappers;

import com.ken.tutorial.twitterclone.sample.entities.UserAccount;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class UserAccountMapper implements RowMapper<UserAccount> {
    UserAccount userAccount;

    public UserAccountMapper() {
        this.userAccount = new UserAccount();
    }

    @Override
    public UserAccount mapRow(ResultSet rs, int rowNum) throws SQLException {
        userAccount.setUserId(rs.getInt("user_id"));
        userAccount.setUserPassword(rs.getString("user_password"));
        userAccount.setUserName(rs.getString("user_name"));
        userAccount.setUserEmail(rs.getString("user_email"));
        return userAccount;
    }
}
