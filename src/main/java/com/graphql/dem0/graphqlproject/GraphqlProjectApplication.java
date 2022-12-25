package com.graphql.dem0.graphqlproject;

import com.graphql.dem0.graphqlproject.beans.AllObjects;
import com.graphql.dem0.graphqlproject.beans.Fields;
import com.graphql.dem0.graphqlproject.beans.ObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication()
public class GraphqlProjectApplication implements CommandLineRunner {

	@Autowired
	ObjectService objectService;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlProjectApplication.class, args);
	}
	@Override
	public void run(String... args)throws Exception{
		AllObjects o1 = new AllObjects();
		o1.setObjectName("account");
		Fields f1 = new Fields();
		f1.setFieldname("account_name");
		f1.setValue("acbd");
		List<Fields> list = new ArrayList<>();
		list.add(f1);
		o1.setFields(list);
		o1.setId(1234);

		this.objectService.create(o1);

	}

}