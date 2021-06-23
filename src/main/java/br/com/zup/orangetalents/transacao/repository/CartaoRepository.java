package br.com.zup.orangetalents.transacao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.zup.orangetalents.transacao.model.Cartao;

@Repository
public interface CartaoRepository extends CrudRepository<Cartao, String>{

}
