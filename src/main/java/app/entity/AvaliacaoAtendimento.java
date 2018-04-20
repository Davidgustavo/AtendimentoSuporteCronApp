package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela AVALIACAOATENDIMENTO
 * @generated
 */
@Entity
@Table(name = "\"AVALIACAOATENDIMENTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.AvaliacaoAtendimento")
public class AvaliacaoAtendimento implements Serializable {

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
  @Column(name = "notaAvalicaoAtendimento", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer notaAvalicaoAtendimento;

  /**
  * @generated
  */
  @Column(name = "resumoAvaliacaoAtendimento", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String resumoAvaliacaoAtendimento;

  /**
  * @generated
  */
  @Column(name = "notaPlataforma", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer notaPlataforma;

  /**
  * @generated
  */
  @Column(name = "indicariaPlataforma", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Boolean indicariaPlataforma;

  /**
  * @generated
  */
  @Column(name = "resumoPlataforma", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String resumoPlataforma;

  /**
  * @generated
  */
  @Column(name = "statusAtendimento", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double statusAtendimento;

  /**
  * @generated
  */
  @Column(name = "sugestaoMelhoria", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String sugestaoMelhoria;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_atendimento", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Atendimento atendimento;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_resposta", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Resposta resposta;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "dataAcaliacao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dataAcaliacao;

  /**
   * Construtor
   * @generated
   */
  public AvaliacaoAtendimento(){
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
  public AvaliacaoAtendimento setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém notaAvalicaoAtendimento
   * return notaAvalicaoAtendimento
   * @generated
   */
  
  public java.lang.Integer getNotaAvalicaoAtendimento(){
    return this.notaAvalicaoAtendimento;
  }

  /**
   * Define notaAvalicaoAtendimento
   * @param notaAvalicaoAtendimento notaAvalicaoAtendimento
   * @generated
   */
  public AvaliacaoAtendimento setNotaAvalicaoAtendimento(java.lang.Integer notaAvalicaoAtendimento){
    this.notaAvalicaoAtendimento = notaAvalicaoAtendimento;
    return this;
  }

  /**
   * Obtém resumoAvaliacaoAtendimento
   * return resumoAvaliacaoAtendimento
   * @generated
   */
  
  public java.lang.String getResumoAvaliacaoAtendimento(){
    return this.resumoAvaliacaoAtendimento;
  }

  /**
   * Define resumoAvaliacaoAtendimento
   * @param resumoAvaliacaoAtendimento resumoAvaliacaoAtendimento
   * @generated
   */
  public AvaliacaoAtendimento setResumoAvaliacaoAtendimento(java.lang.String resumoAvaliacaoAtendimento){
    this.resumoAvaliacaoAtendimento = resumoAvaliacaoAtendimento;
    return this;
  }

  /**
   * Obtém notaPlataforma
   * return notaPlataforma
   * @generated
   */
  
  public java.lang.Integer getNotaPlataforma(){
    return this.notaPlataforma;
  }

  /**
   * Define notaPlataforma
   * @param notaPlataforma notaPlataforma
   * @generated
   */
  public AvaliacaoAtendimento setNotaPlataforma(java.lang.Integer notaPlataforma){
    this.notaPlataforma = notaPlataforma;
    return this;
  }

  /**
   * Obtém indicariaPlataforma
   * return indicariaPlataforma
   * @generated
   */
  
  public java.lang.Boolean getIndicariaPlataforma(){
    return this.indicariaPlataforma;
  }

  /**
   * Define indicariaPlataforma
   * @param indicariaPlataforma indicariaPlataforma
   * @generated
   */
  public AvaliacaoAtendimento setIndicariaPlataforma(java.lang.Boolean indicariaPlataforma){
    this.indicariaPlataforma = indicariaPlataforma;
    return this;
  }

  /**
   * Obtém resumoPlataforma
   * return resumoPlataforma
   * @generated
   */
  
  public java.lang.String getResumoPlataforma(){
    return this.resumoPlataforma;
  }

  /**
   * Define resumoPlataforma
   * @param resumoPlataforma resumoPlataforma
   * @generated
   */
  public AvaliacaoAtendimento setResumoPlataforma(java.lang.String resumoPlataforma){
    this.resumoPlataforma = resumoPlataforma;
    return this;
  }

  /**
   * Obtém statusAtendimento
   * return statusAtendimento
   * @generated
   */
  
  public java.lang.Double getStatusAtendimento(){
    return this.statusAtendimento;
  }

  /**
   * Define statusAtendimento
   * @param statusAtendimento statusAtendimento
   * @generated
   */
  public AvaliacaoAtendimento setStatusAtendimento(java.lang.Double statusAtendimento){
    this.statusAtendimento = statusAtendimento;
    return this;
  }

  /**
   * Obtém sugestaoMelhoria
   * return sugestaoMelhoria
   * @generated
   */
  
  public java.lang.String getSugestaoMelhoria(){
    return this.sugestaoMelhoria;
  }

  /**
   * Define sugestaoMelhoria
   * @param sugestaoMelhoria sugestaoMelhoria
   * @generated
   */
  public AvaliacaoAtendimento setSugestaoMelhoria(java.lang.String sugestaoMelhoria){
    this.sugestaoMelhoria = sugestaoMelhoria;
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
  public AvaliacaoAtendimento setAtendimento(Atendimento atendimento){
    this.atendimento = atendimento;
    return this;
  }

  /**
   * Obtém resposta
   * return resposta
   * @generated
   */
  
  public Resposta getResposta(){
    return this.resposta;
  }

  /**
   * Define resposta
   * @param resposta resposta
   * @generated
   */
  public AvaliacaoAtendimento setResposta(Resposta resposta){
    this.resposta = resposta;
    return this;
  }

  /**
   * Obtém dataAcaliacao
   * return dataAcaliacao
   * @generated
   */
  
  public java.util.Date getDataAcaliacao(){
    return this.dataAcaliacao;
  }

  /**
   * Define dataAcaliacao
   * @param dataAcaliacao dataAcaliacao
   * @generated
   */
  public AvaliacaoAtendimento setDataAcaliacao(java.util.Date dataAcaliacao){
    this.dataAcaliacao = dataAcaliacao;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    AvaliacaoAtendimento object = (AvaliacaoAtendimento)obj;
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
