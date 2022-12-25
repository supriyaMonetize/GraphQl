package com.graphql.dem0.graphqlproject.beans;

import javax.persistence.*;

import lombok.*;


import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Table(name = "objects")
@ToString
@Entity
public class AllObjects implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  // account, custom object
  @Column(name = "object_name")
  private String objectName;
  @Column
  @ElementCollection(targetClass=Fields.class)
  private List<Fields> fields;

//  @Convert(converter = Fields.class)
//  private Map<String,Object> fields;
}
