package com.example.QFJavaDemo;

import com.example.pbDemo.Persion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QfJavaDemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void pb() {
		Persion.Person person = Persion.Person.newBuilder()
				.setId(100).setName("zhuliangliang").setEmail("zhuliangliang.me@gmail.com").build();
		System.out.println(person);
		//Assert.assertEquals(100, person.getId());
	}

}
