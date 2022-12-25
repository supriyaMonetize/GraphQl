package com.graphql.dem0.graphqlproject;

import com.graphql.dem0.graphqlproject.beans.AllObjects;
import com.graphql.dem0.graphqlproject.beans.AllObjectsInput;
import com.graphql.dem0.graphqlproject.beans.Fields;
import com.graphql.dem0.graphqlproject.beans.ObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ObjectsController {
  @Autowired
  ObjectService objectService;
  @MutationMapping("createObject")
  public AllObjects create(@Argument AllObjectsInput allObjects){
    AllObjects allObj = new AllObjects();
    allObj.setObjectName(allObjects.getObjectName());
    List list = new ArrayList();
    allObjects.getFieldsInputs().forEach(f->{
      Fields fields = new Fields();
      fields.setValue(f.getValue());
      fields.setFieldname(f.getFieldname());
      list.add(fields);
    });
    allObj.setFields(list);
    return this.objectService.create(allObj);
  }
  // get all
  @QueryMapping("getAllObjects")
  public List<AllObjects> getAllObjects(){
    return this.objectService.getAllObjects();
  }
  //get single
  @QueryMapping("getObject")
  public AllObjects getObject(@Argument String objectId){
    return this.objectService.getObject(objectId);
  }
  //Todo: getvia object name

}
