package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela RESPOSTA
 * @generated
 */
@Entity
@Table(name = "\"RESPOSTA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Resposta")
public class Resposta implements Serializable {

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
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "inicioResposta", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date inicioResposta;

  /**
  * @generated
  */
  @Column(name = "resumoResposta", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String resumoResposta;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_atendimento", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Atendimento atendimento;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "fimAtendimento", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date fimAtendimento;

  /**
   * Construtor
   * @generated
   */
  public Resposta(){
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
  public Resposta setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém inicioResposta
   * return inicioResposta
   * @generated
   */
  
  public java.util.Date getInicioResposta(){
    return this.inicioResposta;
  }

  /**
   * Define inicioResposta
   * @param inicioResposta inicioResposta
   * @generated
   */
  public Resposta setInicioResposta(java.util.Date inicioResposta){
    this.inicioResposta = inicioResposta;
    return this;
  }

  /**
   * Obtém resumoResposta
   * return resumoResposta
   * @generated
   */
  
  public java.lang.String getResumoResposta(){
    return this.resumoResposta;
  }

  /**
   * Define resumoResposta
   * @param resumoResposta resumoResposta
   * @generated
   */
  public Resposta setResumoResposta(java.lang.String resumoResposta){
    this.resumoResposta = resumoResposta;
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
  public Resposta setAtendimento(Atendimento atendimento){
    this.atendimento = atendimento;
    return this;
  }

  /**
   * Obtém fimAtendimento
   * return fimAtendimento
   * @generated
   */
  
  public java.util.Date getFimAtendimento(){
    return this.fimAtendimento;
  }

  /**
   * Define fimAtendimento
   * @param fimAtendimento fimAtendimento
   * @generated
   */
  public Resposta setFimAtendimento(java.util.Date fimAtendimento){
    this.fimAtendimento = fimAtendimento;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Resposta object = (Resposta)obj;
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
