package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("DDD", "dddd", (byte) 3);
        userService.saveUser("aaa", "sss", (byte) 65);
        userService.saveUser("asdf", "zxc", (byte) 25);
        userService.saveUser("asdf", "asdf", (byte) 25);
        userService.getAllUsers().stream().forEach(a -> System.out.println(a));
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

