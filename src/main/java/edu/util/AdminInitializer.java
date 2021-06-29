package edu.util;

import edu.model.Role;
import edu.model.RoleName;
import edu.model.User;
import edu.service.RoleService;
import edu.service.UserService;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.Set;

@Component
public class AdminInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public AdminInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        roleService.add(new Role(RoleName.ROLE_ADMIN));
        roleService.add(new Role(RoleName.ROLE_USER));

        User alice = new User();
        alice.setEmail("admin");
        alice.setPassword("admin");
        alice.setRoles(Set.of(roleService.getRoleByName(RoleName.ROLE_ADMIN)));
        userService.add(alice);
    }
}