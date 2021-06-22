package br.com.zup.orangetalents.transacao.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CartaoResponse {

	@JsonProperty("id")
	private String id;

	@JsonProperty("email")
	private String email;

	public CartaoResponse(@JsonProperty("id") String id, @JsonProperty("email") String email) {
		this.id = id;
		this.email = email;
	}

	@Override
	public String toString() {
		return "CartaoResponse [id=" + id + ", email=" + email + "]";
	}
}
