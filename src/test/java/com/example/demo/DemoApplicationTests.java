package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	TrashRepository trashRepository;

	@Autowired
	TrashCanRepository trashCanRepository;


	@Test
	void contextLoads() {
	}

	@Test
	void testGetAllTrash() {
		List<Trash> trash =  trashRepository.getAllTrash();
		Assertions.assertEquals(32, trash.size());
	}

	@Test
	void testGetAllTrashCans() {
		List<TrashCan> trashCans =  trashCanRepository.getTrashCans();
		Assertions.assertEquals(5, trashCans.size());
	}

}
