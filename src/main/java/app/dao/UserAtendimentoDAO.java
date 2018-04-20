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
@Repository("UserAtendimentoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface UserAtendimentoDAO extends JpaRepository<UserAtendimento, java.lang.String> {

  /**
   * Obtém a instância de UserAtendimento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM UserAtendimento entity WHERE entity.id = :id")
  public UserAtendimento findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de UserAtendimento utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM UserAtendimento entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select ua from UserAtendimento ua")
  public Page<UserAtendimento> list(Pageable pageable);
  


  /**
   * Foreign Key user
   * @generated
   */
  @Query("SELECT entity FROM UserAtendimento entity WHERE entity.user.id = :id")
  public Page<UserAtendimento> findUserAtendimentosByUser(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key atendimento
   * @generated
   */
  @Query("SELECT entity FROM UserAtendimento entity WHERE entity.atendimento.id = :id")
  public Page<UserAtendimento> findUserAtendimentosByAtendimento(@Param(value="id") java.lang.String id, Pageable pageable);

}
