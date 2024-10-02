package kr.or.ddit.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DataServiceTest {

	DataService service = new DataService();
	
	@Test
	void testGetData() {
		System.out.println(service.getData());
	}

}
