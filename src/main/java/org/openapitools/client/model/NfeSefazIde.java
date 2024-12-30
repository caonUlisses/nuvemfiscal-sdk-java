/*
 * API Nuvem Fiscal
 * API para automação comercial e documentos fiscais.
 *
 * The version of the OpenAPI document: 2.44.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.NfeSefazNFref;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * identificação da NF-e.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfeSefazIde {
  public static final String SERIALIZED_NAME_C_U_F = "cUF";
  @SerializedName(SERIALIZED_NAME_C_U_F)
  @javax.annotation.Nullable
  private Integer cUF;

  public static final String SERIALIZED_NAME_C_N_F = "cNF";
  @SerializedName(SERIALIZED_NAME_C_N_F)
  @javax.annotation.Nullable
  private String cNF;

  public static final String SERIALIZED_NAME_NAT_OP = "natOp";
  @SerializedName(SERIALIZED_NAME_NAT_OP)
  @javax.annotation.Nullable
  private String natOp;

  public static final String SERIALIZED_NAME_MOD = "mod";
  @SerializedName(SERIALIZED_NAME_MOD)
  @javax.annotation.Nullable
  private Integer mod;

  public static final String SERIALIZED_NAME_SERIE = "serie";
  @SerializedName(SERIALIZED_NAME_SERIE)
  @javax.annotation.Nullable
  private Integer serie;

  public static final String SERIALIZED_NAME_N_N_F = "nNF";
  @SerializedName(SERIALIZED_NAME_N_N_F)
  @javax.annotation.Nullable
  private Integer nNF;

  public static final String SERIALIZED_NAME_DH_EMI = "dhEmi";
  @SerializedName(SERIALIZED_NAME_DH_EMI)
  @javax.annotation.Nullable
  private OffsetDateTime dhEmi;

  public static final String SERIALIZED_NAME_DH_SAI_ENT = "dhSaiEnt";
  @SerializedName(SERIALIZED_NAME_DH_SAI_ENT)
  @javax.annotation.Nullable
  private OffsetDateTime dhSaiEnt;

  public static final String SERIALIZED_NAME_TP_N_F = "tpNF";
  @SerializedName(SERIALIZED_NAME_TP_N_F)
  @javax.annotation.Nullable
  private Integer tpNF;

  public static final String SERIALIZED_NAME_ID_DEST = "idDest";
  @SerializedName(SERIALIZED_NAME_ID_DEST)
  @javax.annotation.Nullable
  private Integer idDest;

  public static final String SERIALIZED_NAME_C_MUN_F_G = "cMunFG";
  @SerializedName(SERIALIZED_NAME_C_MUN_F_G)
  @javax.annotation.Nullable
  private String cMunFG;

  public static final String SERIALIZED_NAME_TP_IMP = "tpImp";
  @SerializedName(SERIALIZED_NAME_TP_IMP)
  @javax.annotation.Nullable
  private Integer tpImp;

  public static final String SERIALIZED_NAME_TP_EMIS = "tpEmis";
  @SerializedName(SERIALIZED_NAME_TP_EMIS)
  @javax.annotation.Nullable
  private Integer tpEmis;

  public static final String SERIALIZED_NAME_C_D_V = "cDV";
  @SerializedName(SERIALIZED_NAME_C_D_V)
  @javax.annotation.Nullable
  private Integer cDV;

  public static final String SERIALIZED_NAME_TP_AMB = "tpAmb";
  @SerializedName(SERIALIZED_NAME_TP_AMB)
  @javax.annotation.Nullable
  private Integer tpAmb;

  public static final String SERIALIZED_NAME_FIN_N_FE = "finNFe";
  @SerializedName(SERIALIZED_NAME_FIN_N_FE)
  @javax.annotation.Nullable
  private Integer finNFe;

  public static final String SERIALIZED_NAME_IND_FINAL = "indFinal";
  @SerializedName(SERIALIZED_NAME_IND_FINAL)
  @javax.annotation.Nullable
  private Integer indFinal;

  public static final String SERIALIZED_NAME_IND_PRES = "indPres";
  @SerializedName(SERIALIZED_NAME_IND_PRES)
  @javax.annotation.Nullable
  private Integer indPres;

  public static final String SERIALIZED_NAME_IND_INTERMED = "indIntermed";
  @SerializedName(SERIALIZED_NAME_IND_INTERMED)
  @javax.annotation.Nullable
  private Integer indIntermed;

  public static final String SERIALIZED_NAME_PROC_EMI = "procEmi";
  @SerializedName(SERIALIZED_NAME_PROC_EMI)
  @javax.annotation.Nullable
  private Integer procEmi;

  public static final String SERIALIZED_NAME_VER_PROC = "verProc";
  @SerializedName(SERIALIZED_NAME_VER_PROC)
  @javax.annotation.Nullable
  private String verProc;

  public static final String SERIALIZED_NAME_DH_CONT = "dhCont";
  @SerializedName(SERIALIZED_NAME_DH_CONT)
  @javax.annotation.Nullable
  private OffsetDateTime dhCont;

  public static final String SERIALIZED_NAME_X_JUST = "xJust";
  @SerializedName(SERIALIZED_NAME_X_JUST)
  @javax.annotation.Nullable
  private String xJust;

  public static final String SERIALIZED_NAME_NFREF = "NFref";
  @SerializedName(SERIALIZED_NAME_NFREF)
  @javax.annotation.Nullable
  private List<NfeSefazNFref> nfref = new ArrayList<>();

  public NfeSefazIde() {
  }

  public NfeSefazIde cUF(@javax.annotation.Nullable Integer cUF) {
    this.cUF = cUF;
    return this;
  }

  /**
   * Código da UF do emitente do Documento Fiscal. Utilizar a Tabela do IBGE.
   * @return cUF
   */
  @javax.annotation.Nullable
  public Integer getcUF() {
    return cUF;
  }

  public void setcUF(@javax.annotation.Nullable Integer cUF) {
    this.cUF = cUF;
  }


  public NfeSefazIde cNF(@javax.annotation.Nullable String cNF) {
    this.cNF = cNF;
    return this;
  }

  /**
   * Código numérico que compõe a Chave de Acesso. Número aleatório gerado pelo emitente para cada NF-e.    *Geramos automaticamente quando nenhum valor é informado.*
   * @return cNF
   */
  @javax.annotation.Nullable
  public String getcNF() {
    return cNF;
  }

  public void setcNF(@javax.annotation.Nullable String cNF) {
    this.cNF = cNF;
  }


  public NfeSefazIde natOp(@javax.annotation.Nullable String natOp) {
    this.natOp = natOp;
    return this;
  }

  /**
   * Descrição da Natureza da Operação.
   * @return natOp
   */
  @javax.annotation.Nullable
  public String getNatOp() {
    return natOp;
  }

  public void setNatOp(@javax.annotation.Nullable String natOp) {
    this.natOp = natOp;
  }


  public NfeSefazIde mod(@javax.annotation.Nullable Integer mod) {
    this.mod = mod;
    return this;
  }

  /**
   * Código do modelo do Documento Fiscal:  * 55 - NF-e  * 65 - NFC-e
   * @return mod
   */
  @javax.annotation.Nullable
  public Integer getMod() {
    return mod;
  }

  public void setMod(@javax.annotation.Nullable Integer mod) {
    this.mod = mod;
  }


  public NfeSefazIde serie(@javax.annotation.Nullable Integer serie) {
    this.serie = serie;
    return this;
  }

  /**
   * Série do Documento Fiscal:  * Série normal 0-889  * Avulsa Fisco 890-899  * SCAN 900-999
   * minimum: 0
   * maximum: 999
   * @return serie
   */
  @javax.annotation.Nullable
  public Integer getSerie() {
    return serie;
  }

  public void setSerie(@javax.annotation.Nullable Integer serie) {
    this.serie = serie;
  }


  public NfeSefazIde nNF(@javax.annotation.Nullable Integer nNF) {
    this.nNF = nNF;
    return this;
  }

  /**
   * Número do Documento Fiscal.
   * minimum: 1
   * maximum: 999999999
   * @return nNF
   */
  @javax.annotation.Nullable
  public Integer getnNF() {
    return nNF;
  }

  public void setnNF(@javax.annotation.Nullable Integer nNF) {
    this.nNF = nNF;
  }


  public NfeSefazIde dhEmi(@javax.annotation.Nullable OffsetDateTime dhEmi) {
    this.dhEmi = dhEmi;
    return this;
  }

  /**
   * Data e Hora de emissão do Documento Fiscal (AAAA-MM-DDThh:mm:ssTZD) ex.: 2012-09-01T13:00:00-03:00.
   * @return dhEmi
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDhEmi() {
    return dhEmi;
  }

  public void setDhEmi(@javax.annotation.Nullable OffsetDateTime dhEmi) {
    this.dhEmi = dhEmi;
  }


  public NfeSefazIde dhSaiEnt(@javax.annotation.Nullable OffsetDateTime dhSaiEnt) {
    this.dhSaiEnt = dhSaiEnt;
    return this;
  }

  /**
   * Data e Hora da saída ou de entrada da mercadoria / produto (AAAA-MM-DDTHH:mm:ssTZD).
   * @return dhSaiEnt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDhSaiEnt() {
    return dhSaiEnt;
  }

  public void setDhSaiEnt(@javax.annotation.Nullable OffsetDateTime dhSaiEnt) {
    this.dhSaiEnt = dhSaiEnt;
  }


  public NfeSefazIde tpNF(@javax.annotation.Nullable Integer tpNF) {
    this.tpNF = tpNF;
    return this;
  }

  /**
   * Tipo do Documento Fiscal:  * 0 - Entrada  * 1 - Saída
   * @return tpNF
   */
  @javax.annotation.Nullable
  public Integer getTpNF() {
    return tpNF;
  }

  public void setTpNF(@javax.annotation.Nullable Integer tpNF) {
    this.tpNF = tpNF;
  }


  public NfeSefazIde idDest(@javax.annotation.Nullable Integer idDest) {
    this.idDest = idDest;
    return this;
  }

  /**
   * Identificador de Local de destino da operação:  * 1 - Interna  * 2 - Interestadual  * 3 - Exterior
   * @return idDest
   */
  @javax.annotation.Nullable
  public Integer getIdDest() {
    return idDest;
  }

  public void setIdDest(@javax.annotation.Nullable Integer idDest) {
    this.idDest = idDest;
  }


  public NfeSefazIde cMunFG(@javax.annotation.Nullable String cMunFG) {
    this.cMunFG = cMunFG;
    return this;
  }

  /**
   * Código do Município de Ocorrência do Fato Gerador (utilizar a tabela do IBGE).
   * @return cMunFG
   */
  @javax.annotation.Nullable
  public String getcMunFG() {
    return cMunFG;
  }

  public void setcMunFG(@javax.annotation.Nullable String cMunFG) {
    this.cMunFG = cMunFG;
  }


  public NfeSefazIde tpImp(@javax.annotation.Nullable Integer tpImp) {
    this.tpImp = tpImp;
    return this;
  }

  /**
   * Formato de impressão do DANFE:  * 0 - Sem DANFE  * 1 - DANFe Retrato  * 2 - DANFe Paisagem  * 3 - DANFe Simplificado  * 4 - DANFe NFC-e  * 5 - DANFe NFC-e em mensagem eletrônica
   * @return tpImp
   */
  @javax.annotation.Nullable
  public Integer getTpImp() {
    return tpImp;
  }

  public void setTpImp(@javax.annotation.Nullable Integer tpImp) {
    this.tpImp = tpImp;
  }


  public NfeSefazIde tpEmis(@javax.annotation.Nullable Integer tpEmis) {
    this.tpEmis = tpEmis;
    return this;
  }

  /**
   * Forma de emissão da NF-e  * 1 - Normal  * 2 - Contingência FS  * 3 - Regime Especial NFF (NT 2021.002)  * 4 - Contingência DPEC  * 5 - Contingência FSDA  * 6 - Contingência SVC - AN  * 7 - Contingência SVC - RS  * 9 - Contingência off-line NFC-e
   * @return tpEmis
   */
  @javax.annotation.Nullable
  public Integer getTpEmis() {
    return tpEmis;
  }

  public void setTpEmis(@javax.annotation.Nullable Integer tpEmis) {
    this.tpEmis = tpEmis;
  }


  public NfeSefazIde cDV(@javax.annotation.Nullable Integer cDV) {
    this.cDV = cDV;
    return this;
  }

  /**
   * Digito Verificador da Chave de Acesso da NF-e.    *Geramos automaticamente quando nenhum valor é informado.*
   * minimum: 0
   * maximum: 9
   * @return cDV
   */
  @javax.annotation.Nullable
  public Integer getcDV() {
    return cDV;
  }

  public void setcDV(@javax.annotation.Nullable Integer cDV) {
    this.cDV = cDV;
  }


  public NfeSefazIde tpAmb(@javax.annotation.Nullable Integer tpAmb) {
    this.tpAmb = tpAmb;
    return this;
  }

  /**
   * Identificação do Ambiente:  * 1 - Produção  * 2 - Homologação
   * @return tpAmb
   */
  @javax.annotation.Nullable
  public Integer getTpAmb() {
    return tpAmb;
  }

  public void setTpAmb(@javax.annotation.Nullable Integer tpAmb) {
    this.tpAmb = tpAmb;
  }


  public NfeSefazIde finNFe(@javax.annotation.Nullable Integer finNFe) {
    this.finNFe = finNFe;
    return this;
  }

  /**
   * Finalidade da emissão da NF-e:  * 1 - NFe normal  * 2 - NFe complementar  * 3 - NFe de ajuste  * 4 - Devolução/Retorno
   * @return finNFe
   */
  @javax.annotation.Nullable
  public Integer getFinNFe() {
    return finNFe;
  }

  public void setFinNFe(@javax.annotation.Nullable Integer finNFe) {
    this.finNFe = finNFe;
  }


  public NfeSefazIde indFinal(@javax.annotation.Nullable Integer indFinal) {
    this.indFinal = indFinal;
    return this;
  }

  /**
   * Indica operação com consumidor final:  * 0 - Não  * 1 - Consumidor Final
   * @return indFinal
   */
  @javax.annotation.Nullable
  public Integer getIndFinal() {
    return indFinal;
  }

  public void setIndFinal(@javax.annotation.Nullable Integer indFinal) {
    this.indFinal = indFinal;
  }


  public NfeSefazIde indPres(@javax.annotation.Nullable Integer indPres) {
    this.indPres = indPres;
    return this;
  }

  /**
   * Indicador de presença do comprador no estabelecimento comercial no momento da operação:  * 0 - Não se aplica (ex.: Nota Fiscal complementar ou de ajuste)  * 1 - Operação presencial  * 2 - Não presencial, internet  * 3 - Não presencial, teleatendimento  * 4 - NFC-e entrega em domicílio  * 5 - Operação presencial, fora do estabelecimento  * 9 - Não presencial, outros
   * @return indPres
   */
  @javax.annotation.Nullable
  public Integer getIndPres() {
    return indPres;
  }

  public void setIndPres(@javax.annotation.Nullable Integer indPres) {
    this.indPres = indPres;
  }


  public NfeSefazIde indIntermed(@javax.annotation.Nullable Integer indIntermed) {
    this.indIntermed = indIntermed;
    return this;
  }

  /**
   * Indicador de intermediador/marketplace  * 0 - Operação sem intermediador (em site ou plataforma própria)  * 1 - Operação em site ou plataforma de terceiros (intermediadores/marketplace)
   * @return indIntermed
   */
  @javax.annotation.Nullable
  public Integer getIndIntermed() {
    return indIntermed;
  }

  public void setIndIntermed(@javax.annotation.Nullable Integer indIntermed) {
    this.indIntermed = indIntermed;
  }


  public NfeSefazIde procEmi(@javax.annotation.Nullable Integer procEmi) {
    this.procEmi = procEmi;
    return this;
  }

  /**
   * Processo de emissão utilizado com a seguinte codificação:  * 0 - emissão de NF-e com aplicativo do contribuinte  * 1 - emissão de NF-e avulsa pelo Fisco  * 2 - emissão de NF-e avulsa, pelo contribuinte com seu certificado digital, através do site  do Fisco  * 3 - emissão de NF-e pelo contribuinte com aplicativo fornecido pelo Fisco
   * @return procEmi
   */
  @javax.annotation.Nullable
  public Integer getProcEmi() {
    return procEmi;
  }

  public void setProcEmi(@javax.annotation.Nullable Integer procEmi) {
    this.procEmi = procEmi;
  }


  public NfeSefazIde verProc(@javax.annotation.Nullable String verProc) {
    this.verProc = verProc;
    return this;
  }

  /**
   * versão do aplicativo utilizado no processo de  emissão.
   * @return verProc
   */
  @javax.annotation.Nullable
  public String getVerProc() {
    return verProc;
  }

  public void setVerProc(@javax.annotation.Nullable String verProc) {
    this.verProc = verProc;
  }


  public NfeSefazIde dhCont(@javax.annotation.Nullable OffsetDateTime dhCont) {
    this.dhCont = dhCont;
    return this;
  }

  /**
   * Informar a data e hora de entrada em contingência contingência no formato  (AAAA-MM-DDThh:mm:ssTZD) ex.: 2012-09-01T13:00:00-03:00.
   * @return dhCont
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDhCont() {
    return dhCont;
  }

  public void setDhCont(@javax.annotation.Nullable OffsetDateTime dhCont) {
    this.dhCont = dhCont;
  }


  public NfeSefazIde xJust(@javax.annotation.Nullable String xJust) {
    this.xJust = xJust;
    return this;
  }

  /**
   * Informar a Justificativa da entrada.
   * @return xJust
   */
  @javax.annotation.Nullable
  public String getxJust() {
    return xJust;
  }

  public void setxJust(@javax.annotation.Nullable String xJust) {
    this.xJust = xJust;
  }


  public NfeSefazIde nfref(@javax.annotation.Nullable List<NfeSefazNFref> nfref) {
    this.nfref = nfref;
    return this;
  }

  public NfeSefazIde addNfrefItem(NfeSefazNFref nfrefItem) {
    if (this.nfref == null) {
      this.nfref = new ArrayList<>();
    }
    this.nfref.add(nfrefItem);
    return this;
  }

  /**
   * Get nfref
   * @return nfref
   */
  @javax.annotation.Nullable
  public List<NfeSefazNFref> getNfref() {
    return nfref;
  }

  public void setNfref(@javax.annotation.Nullable List<NfeSefazNFref> nfref) {
    this.nfref = nfref;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfeSefazIde nfeSefazIde = (NfeSefazIde) o;
    return Objects.equals(this.cUF, nfeSefazIde.cUF) &&
        Objects.equals(this.cNF, nfeSefazIde.cNF) &&
        Objects.equals(this.natOp, nfeSefazIde.natOp) &&
        Objects.equals(this.mod, nfeSefazIde.mod) &&
        Objects.equals(this.serie, nfeSefazIde.serie) &&
        Objects.equals(this.nNF, nfeSefazIde.nNF) &&
        Objects.equals(this.dhEmi, nfeSefazIde.dhEmi) &&
        Objects.equals(this.dhSaiEnt, nfeSefazIde.dhSaiEnt) &&
        Objects.equals(this.tpNF, nfeSefazIde.tpNF) &&
        Objects.equals(this.idDest, nfeSefazIde.idDest) &&
        Objects.equals(this.cMunFG, nfeSefazIde.cMunFG) &&
        Objects.equals(this.tpImp, nfeSefazIde.tpImp) &&
        Objects.equals(this.tpEmis, nfeSefazIde.tpEmis) &&
        Objects.equals(this.cDV, nfeSefazIde.cDV) &&
        Objects.equals(this.tpAmb, nfeSefazIde.tpAmb) &&
        Objects.equals(this.finNFe, nfeSefazIde.finNFe) &&
        Objects.equals(this.indFinal, nfeSefazIde.indFinal) &&
        Objects.equals(this.indPres, nfeSefazIde.indPres) &&
        Objects.equals(this.indIntermed, nfeSefazIde.indIntermed) &&
        Objects.equals(this.procEmi, nfeSefazIde.procEmi) &&
        Objects.equals(this.verProc, nfeSefazIde.verProc) &&
        Objects.equals(this.dhCont, nfeSefazIde.dhCont) &&
        Objects.equals(this.xJust, nfeSefazIde.xJust) &&
        Objects.equals(this.nfref, nfeSefazIde.nfref);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cUF, cNF, natOp, mod, serie, nNF, dhEmi, dhSaiEnt, tpNF, idDest, cMunFG, tpImp, tpEmis, cDV, tpAmb, finNFe, indFinal, indPres, indIntermed, procEmi, verProc, dhCont, xJust, nfref);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NfeSefazIde {\n");
    sb.append("    cUF: ").append(toIndentedString(cUF)).append("\n");
    sb.append("    cNF: ").append(toIndentedString(cNF)).append("\n");
    sb.append("    natOp: ").append(toIndentedString(natOp)).append("\n");
    sb.append("    mod: ").append(toIndentedString(mod)).append("\n");
    sb.append("    serie: ").append(toIndentedString(serie)).append("\n");
    sb.append("    nNF: ").append(toIndentedString(nNF)).append("\n");
    sb.append("    dhEmi: ").append(toIndentedString(dhEmi)).append("\n");
    sb.append("    dhSaiEnt: ").append(toIndentedString(dhSaiEnt)).append("\n");
    sb.append("    tpNF: ").append(toIndentedString(tpNF)).append("\n");
    sb.append("    idDest: ").append(toIndentedString(idDest)).append("\n");
    sb.append("    cMunFG: ").append(toIndentedString(cMunFG)).append("\n");
    sb.append("    tpImp: ").append(toIndentedString(tpImp)).append("\n");
    sb.append("    tpEmis: ").append(toIndentedString(tpEmis)).append("\n");
    sb.append("    cDV: ").append(toIndentedString(cDV)).append("\n");
    sb.append("    tpAmb: ").append(toIndentedString(tpAmb)).append("\n");
    sb.append("    finNFe: ").append(toIndentedString(finNFe)).append("\n");
    sb.append("    indFinal: ").append(toIndentedString(indFinal)).append("\n");
    sb.append("    indPres: ").append(toIndentedString(indPres)).append("\n");
    sb.append("    indIntermed: ").append(toIndentedString(indIntermed)).append("\n");
    sb.append("    procEmi: ").append(toIndentedString(procEmi)).append("\n");
    sb.append("    verProc: ").append(toIndentedString(verProc)).append("\n");
    sb.append("    dhCont: ").append(toIndentedString(dhCont)).append("\n");
    sb.append("    xJust: ").append(toIndentedString(xJust)).append("\n");
    sb.append("    nfref: ").append(toIndentedString(nfref)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("cUF");
    openapiFields.add("cNF");
    openapiFields.add("natOp");
    openapiFields.add("mod");
    openapiFields.add("serie");
    openapiFields.add("nNF");
    openapiFields.add("dhEmi");
    openapiFields.add("dhSaiEnt");
    openapiFields.add("tpNF");
    openapiFields.add("idDest");
    openapiFields.add("cMunFG");
    openapiFields.add("tpImp");
    openapiFields.add("tpEmis");
    openapiFields.add("cDV");
    openapiFields.add("tpAmb");
    openapiFields.add("finNFe");
    openapiFields.add("indFinal");
    openapiFields.add("indPres");
    openapiFields.add("indIntermed");
    openapiFields.add("procEmi");
    openapiFields.add("verProc");
    openapiFields.add("dhCont");
    openapiFields.add("xJust");
    openapiFields.add("NFref");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cUF");
    openapiRequiredFields.add("natOp");
    openapiRequiredFields.add("serie");
    openapiRequiredFields.add("nNF");
    openapiRequiredFields.add("dhEmi");
    openapiRequiredFields.add("tpNF");
    openapiRequiredFields.add("idDest");
    openapiRequiredFields.add("cMunFG");
    openapiRequiredFields.add("tpImp");
    openapiRequiredFields.add("tpEmis");
    openapiRequiredFields.add("finNFe");
    openapiRequiredFields.add("indFinal");
    openapiRequiredFields.add("indPres");
    openapiRequiredFields.add("procEmi");
    openapiRequiredFields.add("verProc");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfeSefazIde
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfeSefazIde.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfeSefazIde is not found in the empty JSON string", NfeSefazIde.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfeSefazIde.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfeSefazIde` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NfeSefazIde.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cNF") != null && !jsonObj.get("cNF").isJsonNull()) && !jsonObj.get("cNF").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cNF` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cNF").toString()));
      }
      if ((jsonObj.get("natOp") != null && !jsonObj.get("natOp").isJsonNull()) && !jsonObj.get("natOp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `natOp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("natOp").toString()));
      }
      if ((jsonObj.get("cMunFG") != null && !jsonObj.get("cMunFG").isJsonNull()) && !jsonObj.get("cMunFG").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cMunFG` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cMunFG").toString()));
      }
      if ((jsonObj.get("verProc") != null && !jsonObj.get("verProc").isJsonNull()) && !jsonObj.get("verProc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verProc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verProc").toString()));
      }
      if ((jsonObj.get("xJust") != null && !jsonObj.get("xJust").isJsonNull()) && !jsonObj.get("xJust").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xJust` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xJust").toString()));
      }
      if (jsonObj.get("NFref") != null && !jsonObj.get("NFref").isJsonNull()) {
        JsonArray jsonArraynfref = jsonObj.getAsJsonArray("NFref");
        if (jsonArraynfref != null) {
          // ensure the json data is an array
          if (!jsonObj.get("NFref").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `NFref` to be an array in the JSON string but got `%s`", jsonObj.get("NFref").toString()));
          }

          // validate the optional field `NFref` (array)
          for (int i = 0; i < jsonArraynfref.size(); i++) {
            NfeSefazNFref.validateJsonElement(jsonArraynfref.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NfeSefazIde.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfeSefazIde' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfeSefazIde> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfeSefazIde.class));

       return (TypeAdapter<T>) new TypeAdapter<NfeSefazIde>() {
           @Override
           public void write(JsonWriter out, NfeSefazIde value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfeSefazIde read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfeSefazIde given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfeSefazIde
   * @throws IOException if the JSON string is invalid with respect to NfeSefazIde
   */
  public static NfeSefazIde fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfeSefazIde.class);
  }

  /**
   * Convert an instance of NfeSefazIde to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

