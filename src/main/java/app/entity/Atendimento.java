package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela ATENDIMENTO
 * @generated
 */
@Entity
@Table(name = "\"ATENDIMENTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Atendimento")
public class Atendimento implements Serializable {

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
  @Column(name = "canalAtendimento", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String canalAtendimento;

  /**
  * @generated
  */
  @Column(name = "clienteAtendimento", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String clienteAtendimento;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIME)
  @Column(name = "inicioAtendimento", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date inicioAtendimento;

  /**
  * @generated
  */
  @Column(name = "resumoAtendimento", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String resumoAtendimento;

  /**
  * @generated
  */
  @Column(name = "duvidaAtendimento", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String duvidaAtendimento;

  /**
  * @generated
  */
  @Column(name = "statusAtendimento", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Boolean statusAtendimento = false;

  /**
  * @generated
  */
  @Column(name = "observacaoAtendimento", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String observacaoAtendimento;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIME)
  @Column(name = "fimAtendimento", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date fimAtendimento;

  /**
  * @generated
  */
  @Column(name = "dataAtendimento", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String dataAtendimento;

  /**
   * Construtor
   * @generated
   */
  public Atendimento(){
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
  public Atendimento setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém canalAtendimento
   * return canalAtendimento
   * @generated
   */
  
  public java.lang.String getCanalAtendimento(){
    return this.canalAtendimento;
  }

  /**
   * Define canalAtendimento
   * @param canalAtendimento canalAtendimento
   * @generated
   */
  public Atendimento setCanalAtendimento(java.lang.String canalAtendimento){
    this.canalAtendimento = canalAtendimento;
    return this;
  }

  /**
   * Obtém clienteAtendimento
   * return clienteAtendimento
   * @generated
   */
  
  public java.lang.String getClienteAtendimento(){
    return this.clienteAtendimento;
  }

  /**
   * Define clienteAtendimento
   * @param clienteAtendimento clienteAtendimento
   * @generated
   */
  public Atendimento setClienteAtendimento(java.lang.String clienteAtendimento){
    this.clienteAtendimento = clienteAtendimento;
    return this;
  }

  /**
   * Obtém inicioAtendimento
   * return inicioAtendimento
   * @generated
   */
  
  public java.util.Date getInicioAtendimento(){
    return this.inicioAtendimento;
  }

  /**
   * Define inicioAtendimento
   * @param inicioAtendimento inicioAtendimento
   * @generated
   */
  public Atendimento setInicioAtendimento(java.util.Date inicioAtendimento){
    this.inicioAtendimento = inicioAtendimento;
    return this;
  }

  /**
   * Obtém resumoAtendimento
   * return resumoAtendimento
   * @generated
   */
  
  public java.lang.String getResumoAtendimento(){
    return this.resumoAtendimento;
  }

  /**
   * Define resumoAtendimento
   * @param resumoAtendimento resumoAtendimento
   * @generated
   */
  public Atendimento setResumoAtendimento(java.lang.String resumoAtendimento){
    this.resumoAtendimento = resumoAtendimento;
    return this;
  }

  /**
   * Obtém duvidaAtendimento
   * return duvidaAtendimento
   * @generated
   */
  
  public java.lang.String getDuvidaAtendimento(){
    return this.duvidaAtendimento;
  }

  /**
   * Define duvidaAtendimento
   * @param duvidaAtendimento duvidaAtendimento
   * @generated
   */
  public Atendimento setDuvidaAtendimento(java.lang.String duvidaAtendimento){
    this.duvidaAtendimento = duvidaAtendimento;
    return this;
  }

  /**
   * Obtém statusAtendimento
   * return statusAtendimento
   * @generated
   */
  
  public java.lang.Boolean getStatusAtendimento(){
    return this.statusAtendimento;
  }

  /**
   * Define statusAtendimento
   * @param statusAtendimento statusAtendimento
   * @generated
   */
  public Atendimento setStatusAtendimento(java.lang.Boolean statusAtendimento){
    this.statusAtendimento = statusAtendimento;
    return this;
  }

  /**
   * Obtém observacaoAtendimento
   * return observacaoAtendimento
   * @generated
   */
  
  public java.lang.String getObservacaoAtendimento(){
    return this.observacaoAtendimento;
  }

  /**
   * Define observacaoAtendimento
   * @param observacaoAtendimento observacaoAtendimento
   * @generated
   */
  public Atendimento setObservacaoAtendimento(java.lang.String observacaoAtendimento){
    this.observacaoAtendimento = observacaoAtendimento;
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
  public Atendimento setFimAtendimento(java.util.Date fimAtendimento){
    this.fimAtendimento = fimAtendimento;
    return this;
  }

  /**
   * Obtém dataAtendimento
   * return dataAtendimento
   * @generated
   */
  
  public java.lang.String getDataAtendimento(){
    return this.dataAtendimento;
  }

  /**
   * Define dataAtendimento
   * @param dataAtendimento dataAtendimento
   * @generated
   */
  public Atendimento setDataAtendimento(java.lang.String dataAtendimento){
    this.dataAtendimento = dataAtendimento;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Atendimento object = (Atendimento)obj;
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
