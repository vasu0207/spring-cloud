package com.spring.cloud.client.dto;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;
import java.util.Set;

@XmlRootElement
@Entity
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String fName;
    private String lName;
    @OneToMany(cascade =  CascadeType.ALL)
    @JoinColumn(name = "team_id")
    Set<Address> addresses = new HashSet<>();

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", id=" + id +
                ", addresses=" + addresses +
                '}';
    }
}
