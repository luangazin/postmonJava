package br.com.gazin.location.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import br.com.gazin.location.PostmonJavaApplication;
import br.com.gazin.location.model.Address;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = { PostmonJavaApplication.class })
@WebAppConfiguration
public class PostmonServiceTest {
	@Autowired
	private Localizable service;

	@Test
	public void searchZipcode() {
		Address address = service.doSearch("18095450");
		System.out.println("Result: " + address.toString());
		Assert.assertNotNull(address);
	}
}
