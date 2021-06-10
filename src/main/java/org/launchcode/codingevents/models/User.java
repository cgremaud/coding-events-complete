package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class User {

    @NotNull
    private String username;

    @NotNull
    private String pwHash;

    public User(String username, String pwHash) {
        this.username = username;
        this.pwHash = pwHash;
    }

    public String getUsername() {
        return username;
    }
}
