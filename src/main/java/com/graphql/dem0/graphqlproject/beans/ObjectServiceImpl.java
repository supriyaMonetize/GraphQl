package com.graphql.dem0.graphqlproject.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ExpressionException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ObjectServiceImpl implements ObjectService{

  @Autowired
  ObjectRepository objectRepository;

  @Override
  public AllObjects create(AllObjects objects) {
    return objectRepository.save(objects);
  }

  @Override
  public List<AllObjects> getAllObjects() {
    return objectRepository.findAll();
  }

  public AllObjects getObject(String id) {
    Optional<AllObjects> optObj = objectRepository.findById(UUID.fromString(id));
    return optObj.orElseThrow(() -> new ExpressionException("no id "));
  }

}
