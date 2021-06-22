package br.com.zup.orangetalents.transacao.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EstabelecimentoResponse {

	@JsonProperty("nome")
	private String nome;
	@JsonProperty("cidade")
	private String cidade;
	@JsonProperty("endereco")
	private String endereco;

	public EstabelecimentoResponse(@JsonProperty("nome") String nome, @JsonProperty("cidade") String cidade,
			@JsonProperty("endereco") String endereco) {
		this.nome = nome;
		this.cidade = cidade;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "EstabelecimentoResponse [nome=" + nome + ", cidade=" + cidade + ", endereco=" + endereco + "]";
	}

}
