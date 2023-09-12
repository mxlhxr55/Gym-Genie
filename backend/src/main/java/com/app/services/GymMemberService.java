package com.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.entities.GymMember;

@Service
public interface GymMemberService {
	GymMember findById(int memberId );
    List<GymMember>findAll();
    GymMember save(GymMember gm);
    GymMember update(GymMember gm);
    void deleteById(int memberId);
//    GymMember findByEmail(String email);
	//List<GymMember> findByRole(String role) ;
}