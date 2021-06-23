package br.com.zup.orangetalents.transacao.response;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.zup.orangetalents.transacao.model.Transacao;

public class TransacaoKafkaResponse {

	@JsonProperty("id")
	private String id;
	@JsonProperty("valor")
	private BigDecimal valor;
	@JsonProperty("estabelecimento")
	private EstabelecimentoKafkaResponse estabelecimento;
	@JsonProperty("cartao")
	private CartaoKafkaResponse cartao;
	@JsonProperty("efetivadaEm")
	private Date efetivadaEm;

	public TransacaoKafkaResponse(@JsonProperty("id") String id, @JsonProperty("valor") BigDecimal valor,
			@JsonProperty("estabelecimento") EstabelecimentoKafkaResponse estabelecimento,
			@JsonProperty("cartao") CartaoKafkaResponse cartao, @JsonProperty("efetivadaEm") Date efetivadaEm) {
		this.id = id;
		this.valor = valor;
		this.estabelecimento = estabelecimento;
		this.cartao = cartao;
		this.efetivadaEm = efetivadaEm;
	}

	public Transacao toModel() {
		return new Transacao(this.id, this.valor, this.estabelecimento.toModel(), this.cartao.toModel(),
				this.efetivadaEm);
	}

	@Override
	public String toString() {
		return "TransacaoResponse [id=" + id + ", valor=" + valor + ", estabelecimento=" + estabelecimento + ", cartao="
				+ cartao + ", efetivadaEm=" + efetivadaEm + "]";
	}
	
	
}
