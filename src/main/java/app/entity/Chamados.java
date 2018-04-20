package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CHAMADOS
 * @generated
 */
@Entity
@Table(name = "\"CHAMADOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Chamados")
public class Chamados implements Serializable {

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
  @Column(name = "link", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String link;

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
  public Chamados(){
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
  public Chamados setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém link
   * return link
   * @generated
   */
  
  public java.lang.String getLink(){
    return this.link;
  }

  /**
   * Define link
   * @param link link
   * @generated
   */
  public Chamados setLink(java.lang.String link){
    this.link = link;
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
  public Chamados setAtendimento(Atendimento atendimento){
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
    Chamados object = (Chamados)obj;
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
