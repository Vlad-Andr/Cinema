package edu.service;

import edu.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
