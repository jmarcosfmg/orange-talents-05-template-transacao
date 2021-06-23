package br.com.zup.orangetalents.transacao.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.zup.orangetalents.transacao.model.Cartao;

public class CartaoKafkaResponse {

	@JsonProperty("id")
	private String id;

	@JsonProperty("email")
	private String email;

	public CartaoKafkaResponse(@JsonProperty("id") String id, @JsonProperty("email") String email) {
		this.id = id;
		this.email = email;
	}

	public Cartao toModel() {
		return new Cartao(this.id, this.email);
	}

	@Override
	public String toString() {
		return "CartaoResponse [id=" + id + ", email=" + email + "]";
	}
	
	
}
