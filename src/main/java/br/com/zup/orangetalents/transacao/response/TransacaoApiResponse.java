package br.com.zup.orangetalents.transacao.response;

import java.math.BigDecimal;
import java.util.Date;

import br.com.zup.orangetalents.transacao.model.Estabelecimento;
import br.com.zup.orangetalents.transacao.model.Transacao;

public class TransacaoApiResponse {

	private BigDecimal valor;
	private EstabelecimentoApiResponse estabelecimento;
	private Date efetivadaEm;

	public TransacaoApiResponse(Transacao transacao) {
		this.valor = transacao.getValor();
		this.estabelecimento = new EstabelecimentoApiResponse(transacao.getEstabelecimento());
		this.efetivadaEm = transacao.getEfetivadaEm();
	}

	private class EstabelecimentoApiResponse {

		private String nome;
		private String cidade;
		private String endereco;

		public EstabelecimentoApiResponse(Estabelecimento estabelecimento) {
			this.nome = estabelecimento.getEndereco();
			this.cidade = estabelecimento.getCidade();
			this.endereco = estabelecimento.getEndereco();
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

	public BigDecimal getValor() {
		return valor;
	}

	public EstabelecimentoApiResponse getEstabelecimento() {
		return estabelecimento;
	}

	public Date getEfetivadaEm() {
		return efetivadaEm;
	}

}
