package com.ken.tutorial.twitterclone.domain.repositories.DAO;

import com.ken.tutorial.twitterclone.entities.UserAccount;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

/**
 * どこをメソッド化するとか，どれをクラス変数に持たせるとか
 * 何かパフォーマンスの観点からあれば知りたい．
 *
 * DAO class を作成したが Hibernateとの関係は？
 * どの様にO／R mapperが動作するのか？
 */
public class UserAccountDAO {
    private UserAccount userAccount;

    // ResultSet interface は user のためのインタフェース
    // ResultSet interface の実装クラス群が，なんらかの方法をとって，データベースからのレコードを保持する形をとる
    // 最終的にResultSet Interfaceの実装クラスが，各ゲッターメソッドを経由して，さらに末端のクラスから値を取ってくる感じ
    private ResultSet resultSet = null;

    public UserAccountDAO() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "password");
        Statement statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM user_account WHERE user_id");

        recodeStore();

        connection.close();
        statement.close();
        resultSet.close();
    }

    private void recodeStore() throws SQLException {
        while (resultSet.next()) {
            userAccount.setUserId(resultSet.getInt("user_id"));
            userAccount.setUserPassword(resultSet.getString("user_password"));
            userAccount.setUserName(resultSet.getString("user_name"));
            userAccount.setUserEmail(resultSet.getString("user_email"));
        }
    }
}
