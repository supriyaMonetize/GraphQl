package com.graphql.dem0.graphqlproject.beans;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ObjectRepository extends JpaRepository<AllObjects, UUID> {

}
