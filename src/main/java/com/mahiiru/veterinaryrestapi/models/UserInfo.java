package com.mahiiru.veterinaryrestapi.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserInfo {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String zipCode;
    private String phoneNumber;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
