package br.com.zup.orangetalents.transacao.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.zup.orangetalents.transacao.model.Estabelecimento;

public class EstabelecimentoKafkaResponse {

	@JsonProperty("nome")
	private String nome;
	@JsonProperty("cidade")
	private String cidade;
	@JsonProperty("endereco")
	private String endereco;

	public EstabelecimentoKafkaResponse(@JsonProperty("nome") String nome, @JsonProperty("cidade") String cidade,
			@JsonProperty("endereco") String endereco) {
		this.nome = nome;
		this.cidade = cidade;
		this.endereco = endereco;
	}

	public Estabelecimento toModel() {
		return new Estabelecimento(this.nome, this.cidade, this.endereco);
	}

	@Override
	public String toString() {
		return "EstabelecimentoResponse [nome=" + nome + ", cidade=" + cidade + ", endereco=" + endereco + "]";
	}

}
