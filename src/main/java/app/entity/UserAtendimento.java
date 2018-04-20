package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela USERATENDIMENTO
 * @generated
 */
@Entity
@Table(name = "\"USERATENDIMENTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.UserAtendimento")
public class UserAtendimento implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private User user;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_atendimento", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Atendimento atendimento;

  /**
   * Construtor
   * @generated
   */
  public UserAtendimento(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public UserAtendimento setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém user
   * return user
   * @generated
   */
  
  public User getUser(){
    return this.user;
  }

  /**
   * Define user
   * @param user user
   * @generated
   */
  public UserAtendimento setUser(User user){
    this.user = user;
    return this;
  }

  /**
   * Obtém atendimento
   * return atendimento
   * @generated
   */
  
  public Atendimento getAtendimento(){
    return this.atendimento;
  }

  /**
   * Define atendimento
   * @param atendimento atendimento
   * @generated
   */
  public UserAtendimento setAtendimento(Atendimento atendimento){
    this.atendimento = atendimento;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    UserAtendimento object = (UserAtendimento)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
