package com.graphql.dem0.graphqlproject.beans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@ToString
public class Fields implements Serializable {
  private String fieldname;
  private String value;
//  POC:
//
//  Create custom object with few fields   ( e.g.   Founding Member (yes/No), Rebate (Yes/N), Referred by - Txt fld and so on...
//
//  Create GraphQL Api that can perform CRUD on Account and above custom object
//  Create a simple UI to create the Graphql schema/query  (see if our query builder type of UI can be used or such)

}
