package edu.dao;

import edu.model.Role;
import edu.model.RoleName;
import java.util.Optional;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getRoleByName(RoleName roleName);
}
