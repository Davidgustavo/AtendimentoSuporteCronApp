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
@Repository("AtendimentoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface AtendimentoDAO extends JpaRepository<Atendimento, java.lang.String> {

  /**
   * Obtém a instância de Atendimento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Atendimento entity WHERE entity.id = :id")
  public Atendimento findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Atendimento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Atendimento entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM UserAtendimento entity WHERE entity.atendimento.id = :id")
  public Page<UserAtendimento> findUserAtendimento(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Resposta entity WHERE entity.atendimento.id = :id")
  public Page<Resposta> findResposta(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM AvaliacaoAtendimento entity WHERE entity.atendimento.id = :id")
  public Page<AvaliacaoAtendimento> findAvaliacaoAtendimento(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Chamados entity WHERE entity.atendimento.id = :id")
  public Page<Chamados> findChamados(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.user FROM UserAtendimento entity WHERE entity.atendimento.id = :id")
  public Page<User> listUser(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM UserAtendimento entity WHERE entity.atendimento.id = :instanceId AND entity.user.id = :relationId")
  public int deleteUser(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.resposta FROM AvaliacaoAtendimento entity WHERE entity.atendimento.id = :id")
  public Page<Resposta> listResposta_2(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM AvaliacaoAtendimento entity WHERE entity.atendimento.id = :instanceId AND entity.resposta.id = :relationId")
  public int deleteResposta_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Atendimento entity WHERE entity.id like concat('%',coalesce(:search,''),'%')")
  public Page<Atendimento> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Atendimento entity WHERE (:id is null OR entity.id like concat('%',:id,'%'))")
  public Page<Atendimento> specificSearch(@Param(value="id") java.lang.String id, Pageable pageable);
  
}
