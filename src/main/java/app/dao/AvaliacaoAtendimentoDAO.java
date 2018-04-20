package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("AvaliacaoAtendimentoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface AvaliacaoAtendimentoDAO extends JpaRepository<AvaliacaoAtendimento, java.lang.String> {

  /**
   * Obtém a instância de AvaliacaoAtendimento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM AvaliacaoAtendimento entity WHERE entity.id = :id")
  public AvaliacaoAtendimento findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de AvaliacaoAtendimento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM AvaliacaoAtendimento entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key atendimento
   * @generated
   */
  @Query("SELECT entity FROM AvaliacaoAtendimento entity WHERE entity.atendimento.id = :id")
  public Page<AvaliacaoAtendimento> findAvaliacaoAtendimentosByAtendimento(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key resposta
   * @generated
   */
  @Query("SELECT entity FROM AvaliacaoAtendimento entity WHERE entity.resposta.id = :id")
  public Page<AvaliacaoAtendimento> findAvaliacaoAtendimentosByResposta(@Param(value="id") java.lang.String id, Pageable pageable);

}
