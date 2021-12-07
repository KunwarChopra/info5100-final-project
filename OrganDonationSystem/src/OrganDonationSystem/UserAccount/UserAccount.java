/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrganDonationSystem.UserAccount;
import OrganDonationSystem.Individual.Individual;
import OrganDonationSystem.Role.Role;
/**
 *
 * @author saura
 */
public class UserAccount {
    private String name;
    private String username;
    private String password;
    private Individual individual;
    private Role role;
//    private WorkQueue workQueue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public UserAccount() {
//
//    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setPerson(Individual person) {
        this.individual = individual;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Individual getIndividual() {
        return individual;
    }

    @Override
    public String toString() {
        return name;
    }
}
