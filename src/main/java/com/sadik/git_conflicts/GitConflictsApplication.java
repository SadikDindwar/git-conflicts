package com.sadik.git_conflicts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitConflictsApplication {

	public static void main(String[] args) {
		String name ="mike";
		int a = 6;
		int x = 100;
		int y = 200;
		double z = 34.5;
		float f = 23.4f;
		boolean isPresent = false;
		SpringApplication.run(GitConflictsApplication.class, args);
	}

}
