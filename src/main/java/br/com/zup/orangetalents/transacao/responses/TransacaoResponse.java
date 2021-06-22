package br.com.zup.orangetalents.transacao.responses;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.zup.orangetalents.transacao.TransacaoApplication;

public class TransacaoResponse extends TransacaoApplication {

	@JsonProperty("id")
	private String id;
	@JsonProperty("valor")
	private BigDecimal valor;
	@JsonProperty("estabelecimento")
	private EstabelecimentoResponse estabelecimento;
	@JsonProperty("cartao")
	private CartaoResponse cartao;
	@JsonProperty("efetivadaEm")
	private Date efetivadaEm;

	public TransacaoResponse(@JsonProperty("id") String id, @JsonProperty("valor") BigDecimal valor,
			@JsonProperty("estabelecimento") EstabelecimentoResponse estabelecimento,
			@JsonProperty("cartao") CartaoResponse cartao, @JsonProperty("efetivadaEm") Date efetivadaEm) {
		this.id = id;
		this.valor = valor;
		this.estabelecimento = estabelecimento;
		this.cartao = cartao;
		this.efetivadaEm = efetivadaEm;
	}

	@Override
	public String toString() {
		return "TransacaoResponse [id=" + id + ", valor=" + valor + ", estabelecimento=" + estabelecimento + ", cartao="
				+ cartao + ", efetivadaEm=" + efetivadaEm + "]";
	}	
}
