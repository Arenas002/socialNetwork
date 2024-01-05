package com.socialnetwork.SocialNetwork.model.repository;

import com.socialnetwork.SocialNetwork.model.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
