package br.com.zup.orangetalents.transacao.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.zup.orangetalents.transacao.model.Transacao;

@Repository
public interface TransacaoRepository extends PagingAndSortingRepository<Transacao, String>{

	Page<Transacao> findAllByCartaoId(String idCartao, Pageable pageable);

}
