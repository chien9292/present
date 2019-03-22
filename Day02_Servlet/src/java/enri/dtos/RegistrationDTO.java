/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enri.dtos;

import java.io.Serializable;

/**
 *
 * @author ib.enrique
 */
public class RegistrationDTO implements Serializable{
    private String username, role, fullname;

    public RegistrationDTO(String username, String role, String fullname) {
        this.username = username;
        this.role = role;
        this.fullname = fullname;
    }

    public RegistrationDTO() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    
    
}
