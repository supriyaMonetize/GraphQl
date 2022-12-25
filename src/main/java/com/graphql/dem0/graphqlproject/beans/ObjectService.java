package com.graphql.dem0.graphqlproject.beans;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ObjectService {
  AllObjects create(AllObjects objects);
  List<AllObjects> getAllObjects();

  AllObjects getObject(String id);
}
