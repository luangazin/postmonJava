package br.com.gazin.location.service;

import br.com.gazin.location.model.Address;

public interface Localizable {
	public static final String URL = "http://api.postmon.com.br";
	public static final String VERSION = "v1";
	public static final String FORMAT = "json";

	Address doSearch(String zipcode);
}
