package commands;

import daba.DataBaseManager;
import models.User;

import java.io.IOException;
import java.io.Serializable;

public class Register extends ServerCommand implements Serializable {
    public Register(){
        super("register", "регистрация пользователя.");
    }

    @Override
    public Object executionForResponse(Object value) throws IOException {
        DataBaseManager dataBaseManager = new DataBaseManager();
        User user = (User) value;
        System.out.println(user.getUserName() + user.getPassword());
        dataBaseManager.registerUser(user.getUserName(), user.getPassword());
        return "New user successfully register!";
    }
}
