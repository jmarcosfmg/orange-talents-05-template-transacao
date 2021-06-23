package br.com.zup.orangetalents.transacao.model;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Estabelecimento {

	@Id
	@Column(columnDefinition = "BINARY(32)")
	private byte[] id;

	@NotBlank
	private String nome;

	@NotBlank
	private String cidade;

	@NotBlank
	private String endereco;

	@Override
	public String toString() {
		return "Estabelecimento [nome=" + nome + ", endereco=" + endereco + "]";
	}

	public Estabelecimento(String nome, String cidade, String endereco) {
		this.nome = nome;
		this.cidade = cidade;
		this.endereco = endereco;
		this.id = generateId();
	}
	
	@Deprecated
	public Estabelecimento() {
		
	}

	private byte[] generateId() {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA3-256");
			return md.digest(toString().getBytes());
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public String getNome() {
		return nome;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEndereco() {
		return endereco;
	}
}
