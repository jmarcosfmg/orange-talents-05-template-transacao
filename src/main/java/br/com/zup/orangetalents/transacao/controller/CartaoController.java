package br.com.zup.orangetalents.transacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.zup.orangetalents.transacao.repository.CartaoRepository;
import br.com.zup.orangetalents.transacao.repository.TransacaoRepository;
import br.com.zup.orangetalents.transacao.response.TransacaoApiResponse;

@Controller
@RequestMapping("/cartao")
public class CartaoController {

	@Autowired
	TransacaoRepository transacaoRepo;

	@Autowired
	CartaoRepository cartaoRepo;

	@GetMapping("/{idCartao}/transacoes")
	public ResponseEntity<?> findLast10Transacao(@PathVariable("idCartao") String idCartao, @PageableDefault(sort = {
			"efetivadaEm", "id" }, direction = Sort.Direction.DESC, value = 10) Pageable pageable) {
		return cartaoRepo.findById(idCartao).isEmpty() ? ResponseEntity.notFound().build()
				: ResponseEntity.ok(transacaoRepo.findAllByCartaoId(idCartao, pageable).map(TransacaoApiResponse::new));
	}
}
