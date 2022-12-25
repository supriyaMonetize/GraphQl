package com.graphql.dem0.graphqlproject.beans;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AllObjectsInput {

  private String objectName;
  private List<FieldsInput> fieldsInputs;
}
