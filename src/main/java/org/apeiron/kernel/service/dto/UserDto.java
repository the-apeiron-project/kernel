package org.apeiron.kernel.service.dto;

import java.io.Serializable;
import org.apeiron.kernel.domain.User;

/**
 * A Dto representing a user, with only the public attributes.
 */
public class UserDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String login;

    public UserDto() {
        // Empty constructor needed for Jackson.
    }

    public UserDto(User user) {
        this.id = user.getId();
        // Customize it here if you need, or not, firstName/lastName/etc
        this.login = user.getLogin();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "UserDto{" +
            "id='" + id + '\'' +
            ", login='" + login + '\'' +
            "}";
    }
}