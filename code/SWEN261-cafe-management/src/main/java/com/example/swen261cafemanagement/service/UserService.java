package com.example.swen261cafemanagement.service;

import com.example.swen261cafemanagement.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
        private ArrayList<User> users = new ArrayList<>();

        public void createUser(User user) {
            users.add(user);
        }

        public ArrayList<User> getAllUsers() {
            return users;
        }

        public User findByUserByEmail(String email) {
            for (User user : users) {
                if (user.getEmail().equals(email)) {
                    return user;
                }

            }
            return null;
        }

        public boolean authenticate(String email, String password) {
            User user = findByUserByEmail(email);
            if (user == null) {
                return false;
            }
            return password.equals(user.getPassword());
        }

        public UserService() {
           User test_user = new User("test user","test@gmail.com", "testpassword");
           User test2 = new User("test user2","test@test.com", "password");
           createUser(test_user);
           createUser(test2);
        }


}