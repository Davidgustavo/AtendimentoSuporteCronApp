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
@Repository("RespostaDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface RespostaDAO extends JpaRepository<Resposta, java.lang.String> {

  /**
   * Obtém a instância de Resposta utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Resposta entity WHERE entity.id = :id")
  public Resposta findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Resposta utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Resposta entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM AvaliacaoAtendimento entity WHERE entity.resposta.id = :id")
  public Page<AvaliacaoAtendimento> findAvaliacaoAtendimento(@Param(value="id") java.lang.String id, Pageable pageable);
  
  /**
   * ManyToOne Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity.atendimento FROM AvaliacaoAtendimento entity WHERE entity.resposta.id = :id AND (entity.atendimento.id like concat('%',coalesce(:search,''),'%'))")
  public Page<Atendimento> listAtendimentoGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity.atendimento FROM AvaliacaoAtendimento entity WHERE entity.resposta.id = :id AND (:id is null OR entity.atendimento.id like concat('%',:id,'%'))")
  public Page<Atendimento> listAtendimentoSpecificSearch(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.atendimento FROM AvaliacaoAtendimento entity WHERE entity.resposta.id = :id")
  public Page<Atendimento> listAtendimento(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM AvaliacaoAtendimento entity WHERE entity.resposta.id = :instanceId AND entity.atendimento.id = :relationId")
  public int deleteAtendimento(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * Foreign Key atendimento
   * @generated
   */
  @Query("SELECT entity FROM Resposta entity WHERE entity.atendimento.id = :id")
  public Page<Resposta> findRespostasByAtendimento(@Param(value="id") java.lang.String id, Pageable pageable);

}
