package br.com.zup.orangetalents.transacao.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity
public class Transacao {
	
	@NotBlank
	@Id
	private String id;
	
	@NotNull
	@Positive
	private BigDecimal valor;
	
	@NotNull
	@ManyToOne(cascade = CascadeType.ALL)
	private Estabelecimento estabelecimento;
	
	@NotNull
	@ManyToOne(cascade = CascadeType.ALL)
	private Cartao cartao;
	
	@NotNull
	private Date efetivadaEm;

	public Transacao(@NotBlank String id, @NotNull @Positive BigDecimal valor, @NotNull Estabelecimento estabelecimento,
			@NotNull Cartao cartao, @NotNull Date efetivadaEm) {
		this.id = id;
		this.valor = valor;
		this.estabelecimento = estabelecimento;
		this.cartao = cartao;
		this.efetivadaEm = efetivadaEm;
	}
	
	@Deprecated
	public Transacao() {
		
	}

	public BigDecimal getValor() {
		return valor;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public Date getEfetivadaEm() {
		return efetivadaEm;
	}
}
