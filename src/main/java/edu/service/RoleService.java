package edu.service;

import edu.model.Role;
import edu.model.RoleName;

public interface RoleService {
    void add(Role role);

    Role getRoleByName(RoleName roleName);
}
