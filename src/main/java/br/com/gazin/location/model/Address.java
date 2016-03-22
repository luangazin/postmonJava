package br.com.gazin.location.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address {

	@XmlElement(name = "logradouro")
	private String logradouro;

	@XmlElement(name = "cep")
	private String cep;

	@XmlElement(name = "bairro")
	private String bairro;

	@XmlElement(name = "cidade")
	private String cidade;

	@XmlElement(name = "estado")
	private String estado;

	@XmlElement(name = "complemento")
	private String complemento;

	@XmlElement(name = "unidade")
	private String unidade;

	@XmlElement(name = "endereco")
	private String endereco;

	public Address() {
	}

	public Address(String logradouro, String cep, String bairro, String cidade, String estado) {
		super();
		this.logradouro = logradouro;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return logradouro + ", " + bairro + " - Cidade: " + cidade + " / " + estado + " - CEP: " + cep;
	}
}