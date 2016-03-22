package br.com.gazin.location.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestOperations;

import br.com.gazin.location.model.Address;

public class PostmonService implements Localizable {

	@Autowired
	private RestOperations service;

	public Address doSearch(String zipcode) {
		Address endereco = service
				.getForObject(Localizable.URL + "/" + Localizable.VERSION + "/cep/"+zipcode+"?format=json", Address.class);
		return endereco;
	}

}
