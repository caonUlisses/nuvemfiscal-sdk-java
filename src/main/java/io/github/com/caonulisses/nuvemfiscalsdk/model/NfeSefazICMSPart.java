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


package io.github.com.caonulisses.nuvemfiscalsdk.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
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

import io.github.com.caonulisses.nuvemfiscalsdk.JSON;

/**
 * Partilha do ICMS entre a UF de origem e UF de destino ou a UF definida na legislação  Operação interestadual para consumidor final com partilha do ICMS  devido na operação entre a UF de origem e a UF do destinatário ou ou a UF definida na legislação. (Ex. UF da concessionária de entrega do  veículos).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfeSefazICMSPart {
  public static final String SERIALIZED_NAME_ORIG = "orig";
  @SerializedName(SERIALIZED_NAME_ORIG)
  @javax.annotation.Nullable
  private Integer orig;

  public static final String SERIALIZED_NAME_C_S_T = "CST";
  @SerializedName(SERIALIZED_NAME_C_S_T)
  @javax.annotation.Nullable
  private String CST;

  public static final String SERIALIZED_NAME_MOD_B_C = "modBC";
  @SerializedName(SERIALIZED_NAME_MOD_B_C)
  @javax.annotation.Nullable
  private Integer modBC;

  public static final String SERIALIZED_NAME_V_B_C = "vBC";
  @SerializedName(SERIALIZED_NAME_V_B_C)
  @javax.annotation.Nullable
  private BigDecimal vBC;

  public static final String SERIALIZED_NAME_P_RED_B_C = "pRedBC";
  @SerializedName(SERIALIZED_NAME_P_RED_B_C)
  @javax.annotation.Nullable
  private BigDecimal pRedBC;

  public static final String SERIALIZED_NAME_P_I_C_M_S = "pICMS";
  @SerializedName(SERIALIZED_NAME_P_I_C_M_S)
  @javax.annotation.Nullable
  private BigDecimal pICMS;

  public static final String SERIALIZED_NAME_V_I_C_M_S = "vICMS";
  @SerializedName(SERIALIZED_NAME_V_I_C_M_S)
  @javax.annotation.Nullable
  private BigDecimal vICMS;

  public static final String SERIALIZED_NAME_MOD_B_C_S_T = "modBCST";
  @SerializedName(SERIALIZED_NAME_MOD_B_C_S_T)
  @javax.annotation.Nullable
  private Integer modBCST;

  public static final String SERIALIZED_NAME_P_M_V_A_S_T = "pMVAST";
  @SerializedName(SERIALIZED_NAME_P_M_V_A_S_T)
  @javax.annotation.Nullable
  private BigDecimal pMVAST;

  public static final String SERIALIZED_NAME_P_RED_B_C_S_T = "pRedBCST";
  @SerializedName(SERIALIZED_NAME_P_RED_B_C_S_T)
  @javax.annotation.Nullable
  private BigDecimal pRedBCST;

  public static final String SERIALIZED_NAME_V_B_C_S_T = "vBCST";
  @SerializedName(SERIALIZED_NAME_V_B_C_S_T)
  @javax.annotation.Nullable
  private BigDecimal vBCST;

  public static final String SERIALIZED_NAME_P_I_C_M_S_S_T = "pICMSST";
  @SerializedName(SERIALIZED_NAME_P_I_C_M_S_S_T)
  @javax.annotation.Nullable
  private BigDecimal pICMSST;

  public static final String SERIALIZED_NAME_V_I_C_M_S_S_T = "vICMSST";
  @SerializedName(SERIALIZED_NAME_V_I_C_M_S_S_T)
  @javax.annotation.Nullable
  private BigDecimal vICMSST;

  public static final String SERIALIZED_NAME_V_B_C_F_C_P_S_T = "vBCFCPST";
  @SerializedName(SERIALIZED_NAME_V_B_C_F_C_P_S_T)
  @javax.annotation.Nullable
  private BigDecimal vBCFCPST;

  public static final String SERIALIZED_NAME_P_F_C_P_S_T = "pFCPST";
  @SerializedName(SERIALIZED_NAME_P_F_C_P_S_T)
  @javax.annotation.Nullable
  private BigDecimal pFCPST;

  public static final String SERIALIZED_NAME_V_F_C_P_S_T = "vFCPST";
  @SerializedName(SERIALIZED_NAME_V_F_C_P_S_T)
  @javax.annotation.Nullable
  private BigDecimal vFCPST;

  public static final String SERIALIZED_NAME_P_B_C_OP = "pBCOp";
  @SerializedName(SERIALIZED_NAME_P_B_C_OP)
  @javax.annotation.Nullable
  private BigDecimal pBCOp;

  public static final String SERIALIZED_NAME_U_F_S_T = "UFST";
  @SerializedName(SERIALIZED_NAME_U_F_S_T)
  @javax.annotation.Nullable
  private String UFST;

  public NfeSefazICMSPart() {
  }

  public NfeSefazICMSPart orig(@javax.annotation.Nullable Integer orig) {
    this.orig = orig;
    return this;
  }

  /**
   * Origem da mercadoria:  * 0 - Nacional, exceto as indicadas nos códigos 3, 4, 5 e 8;  * 1 - Estrangeira - Importação direta, exceto a indicada no código 6;  * 2 - Estrangeira - Adquirida no mercado interno, exceto a indicada no código 7;  * 3 - Nacional, mercadoria ou bem com Conteúdo de Importação superior a 40%% e inferior ou igual a 70%%;  * 4 - Nacional, cuja produção tenha sido feita em conformidade com os processos produtivos básicos de que tratam as legislações citadas nos Ajustes;  * 5 - Nacional, mercadoria ou bem com Conteúdo de Importação inferior ou igual a 40%%;  * 6 - Estrangeira - Importação direta, sem similar nacional, constante em lista da CAMEX e gás natural;  * 7 - Estrangeira - Adquirida no mercado interno, sem similar nacional, constante lista CAMEX e gás natural;  * 8 - Nacional, mercadoria ou bem com Conteúdo de Importação superior a 70%%.
   * @return orig
   */
  @javax.annotation.Nullable
  public Integer getOrig() {
    return orig;
  }

  public void setOrig(@javax.annotation.Nullable Integer orig) {
    this.orig = orig;
  }


  public NfeSefazICMSPart CST(@javax.annotation.Nullable String CST) {
    this.CST = CST;
    return this;
  }

  /**
   * Tributação pelo ICMS  * 10 - Tributada e com cobrança do ICMS por substituição tributária  * 90 - Outros
   * @return CST
   */
  @javax.annotation.Nullable
  public String getCST() {
    return CST;
  }

  public void setCST(@javax.annotation.Nullable String CST) {
    this.CST = CST;
  }


  public NfeSefazICMSPart modBC(@javax.annotation.Nullable Integer modBC) {
    this.modBC = modBC;
    return this;
  }

  /**
   * Modalidade de determinação da BC do ICMS:  * 0 - Margem Valor Agregado (%%)  * 1 - Pauta (valor)  * 2 - Preço Tabelado Máximo (valor)  * 3 - Valor da Operação
   * @return modBC
   */
  @javax.annotation.Nullable
  public Integer getModBC() {
    return modBC;
  }

  public void setModBC(@javax.annotation.Nullable Integer modBC) {
    this.modBC = modBC;
  }


  public NfeSefazICMSPart vBC(@javax.annotation.Nullable BigDecimal vBC) {
    this.vBC = vBC;
    return this;
  }

  /**
   * Valor da BC do ICMS.
   * minimum: 0
   * @return vBC
   */
  @javax.annotation.Nullable
  public BigDecimal getvBC() {
    return vBC;
  }

  public void setvBC(@javax.annotation.Nullable BigDecimal vBC) {
    this.vBC = vBC;
  }


  public NfeSefazICMSPart pRedBC(@javax.annotation.Nullable BigDecimal pRedBC) {
    this.pRedBC = pRedBC;
    return this;
  }

  /**
   * Percentual de redução da BC.
   * minimum: 0
   * @return pRedBC
   */
  @javax.annotation.Nullable
  public BigDecimal getpRedBC() {
    return pRedBC;
  }

  public void setpRedBC(@javax.annotation.Nullable BigDecimal pRedBC) {
    this.pRedBC = pRedBC;
  }


  public NfeSefazICMSPart pICMS(@javax.annotation.Nullable BigDecimal pICMS) {
    this.pICMS = pICMS;
    return this;
  }

  /**
   * Alíquota do ICMS.
   * minimum: 0
   * @return pICMS
   */
  @javax.annotation.Nullable
  public BigDecimal getpICMS() {
    return pICMS;
  }

  public void setpICMS(@javax.annotation.Nullable BigDecimal pICMS) {
    this.pICMS = pICMS;
  }


  public NfeSefazICMSPart vICMS(@javax.annotation.Nullable BigDecimal vICMS) {
    this.vICMS = vICMS;
    return this;
  }

  /**
   * Valor do ICMS.
   * minimum: 0
   * @return vICMS
   */
  @javax.annotation.Nullable
  public BigDecimal getvICMS() {
    return vICMS;
  }

  public void setvICMS(@javax.annotation.Nullable BigDecimal vICMS) {
    this.vICMS = vICMS;
  }


  public NfeSefazICMSPart modBCST(@javax.annotation.Nullable Integer modBCST) {
    this.modBCST = modBCST;
    return this;
  }

  /**
   * Modalidade de determinação da BC do ICMS ST:  * 0 - Preço tabelado ou máximo  sugerido  * 1 - Lista Negativa (valor)  * 2 - Lista Positiva (valor)  * 3 - Lista Neutra (valor)  * 4 - Margem Valor Agregado (%%)  * 5 - Pauta (valor)  * 6 - Valor da Operação
   * @return modBCST
   */
  @javax.annotation.Nullable
  public Integer getModBCST() {
    return modBCST;
  }

  public void setModBCST(@javax.annotation.Nullable Integer modBCST) {
    this.modBCST = modBCST;
  }


  public NfeSefazICMSPart pMVAST(@javax.annotation.Nullable BigDecimal pMVAST) {
    this.pMVAST = pMVAST;
    return this;
  }

  /**
   * Percentual da Margem de Valor Adicionado ICMS ST.
   * minimum: 0
   * @return pMVAST
   */
  @javax.annotation.Nullable
  public BigDecimal getpMVAST() {
    return pMVAST;
  }

  public void setpMVAST(@javax.annotation.Nullable BigDecimal pMVAST) {
    this.pMVAST = pMVAST;
  }


  public NfeSefazICMSPart pRedBCST(@javax.annotation.Nullable BigDecimal pRedBCST) {
    this.pRedBCST = pRedBCST;
    return this;
  }

  /**
   * Percentual de redução da BC ICMS ST.
   * minimum: 0
   * @return pRedBCST
   */
  @javax.annotation.Nullable
  public BigDecimal getpRedBCST() {
    return pRedBCST;
  }

  public void setpRedBCST(@javax.annotation.Nullable BigDecimal pRedBCST) {
    this.pRedBCST = pRedBCST;
  }


  public NfeSefazICMSPart vBCST(@javax.annotation.Nullable BigDecimal vBCST) {
    this.vBCST = vBCST;
    return this;
  }

  /**
   * Valor da BC do ICMS ST.
   * minimum: 0
   * @return vBCST
   */
  @javax.annotation.Nullable
  public BigDecimal getvBCST() {
    return vBCST;
  }

  public void setvBCST(@javax.annotation.Nullable BigDecimal vBCST) {
    this.vBCST = vBCST;
  }


  public NfeSefazICMSPart pICMSST(@javax.annotation.Nullable BigDecimal pICMSST) {
    this.pICMSST = pICMSST;
    return this;
  }

  /**
   * Alíquota do ICMS ST.
   * minimum: 0
   * @return pICMSST
   */
  @javax.annotation.Nullable
  public BigDecimal getpICMSST() {
    return pICMSST;
  }

  public void setpICMSST(@javax.annotation.Nullable BigDecimal pICMSST) {
    this.pICMSST = pICMSST;
  }


  public NfeSefazICMSPart vICMSST(@javax.annotation.Nullable BigDecimal vICMSST) {
    this.vICMSST = vICMSST;
    return this;
  }

  /**
   * Valor do ICMS ST.
   * minimum: 0
   * @return vICMSST
   */
  @javax.annotation.Nullable
  public BigDecimal getvICMSST() {
    return vICMSST;
  }

  public void setvICMSST(@javax.annotation.Nullable BigDecimal vICMSST) {
    this.vICMSST = vICMSST;
  }


  public NfeSefazICMSPart vBCFCPST(@javax.annotation.Nullable BigDecimal vBCFCPST) {
    this.vBCFCPST = vBCFCPST;
    return this;
  }

  /**
   * Valor da Base de cálculo do FCP retido por substituicao tributaria.
   * minimum: 0
   * @return vBCFCPST
   */
  @javax.annotation.Nullable
  public BigDecimal getvBCFCPST() {
    return vBCFCPST;
  }

  public void setvBCFCPST(@javax.annotation.Nullable BigDecimal vBCFCPST) {
    this.vBCFCPST = vBCFCPST;
  }


  public NfeSefazICMSPart pFCPST(@javax.annotation.Nullable BigDecimal pFCPST) {
    this.pFCPST = pFCPST;
    return this;
  }

  /**
   * Percentual de FCP retido por substituição tributária.
   * minimum: 0
   * @return pFCPST
   */
  @javax.annotation.Nullable
  public BigDecimal getpFCPST() {
    return pFCPST;
  }

  public void setpFCPST(@javax.annotation.Nullable BigDecimal pFCPST) {
    this.pFCPST = pFCPST;
  }


  public NfeSefazICMSPart vFCPST(@javax.annotation.Nullable BigDecimal vFCPST) {
    this.vFCPST = vFCPST;
    return this;
  }

  /**
   * Valor do FCP retido por substituição tributária.
   * minimum: 0
   * @return vFCPST
   */
  @javax.annotation.Nullable
  public BigDecimal getvFCPST() {
    return vFCPST;
  }

  public void setvFCPST(@javax.annotation.Nullable BigDecimal vFCPST) {
    this.vFCPST = vFCPST;
  }


  public NfeSefazICMSPart pBCOp(@javax.annotation.Nullable BigDecimal pBCOp) {
    this.pBCOp = pBCOp;
    return this;
  }

  /**
   * Percentual para determinação do valor  da Base de Cálculo da operação própria.
   * minimum: 0
   * @return pBCOp
   */
  @javax.annotation.Nullable
  public BigDecimal getpBCOp() {
    return pBCOp;
  }

  public void setpBCOp(@javax.annotation.Nullable BigDecimal pBCOp) {
    this.pBCOp = pBCOp;
  }


  public NfeSefazICMSPart UFST(@javax.annotation.Nullable String UFST) {
    this.UFST = UFST;
    return this;
  }

  /**
   * Sigla da UF para qual é devido o ICMS ST da operação.
   * @return UFST
   */
  @javax.annotation.Nullable
  public String getUFST() {
    return UFST;
  }

  public void setUFST(@javax.annotation.Nullable String UFST) {
    this.UFST = UFST;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfeSefazICMSPart nfeSefazICMSPart = (NfeSefazICMSPart) o;
    return Objects.equals(this.orig, nfeSefazICMSPart.orig) &&
        Objects.equals(this.CST, nfeSefazICMSPart.CST) &&
        Objects.equals(this.modBC, nfeSefazICMSPart.modBC) &&
        Objects.equals(this.vBC, nfeSefazICMSPart.vBC) &&
        Objects.equals(this.pRedBC, nfeSefazICMSPart.pRedBC) &&
        Objects.equals(this.pICMS, nfeSefazICMSPart.pICMS) &&
        Objects.equals(this.vICMS, nfeSefazICMSPart.vICMS) &&
        Objects.equals(this.modBCST, nfeSefazICMSPart.modBCST) &&
        Objects.equals(this.pMVAST, nfeSefazICMSPart.pMVAST) &&
        Objects.equals(this.pRedBCST, nfeSefazICMSPart.pRedBCST) &&
        Objects.equals(this.vBCST, nfeSefazICMSPart.vBCST) &&
        Objects.equals(this.pICMSST, nfeSefazICMSPart.pICMSST) &&
        Objects.equals(this.vICMSST, nfeSefazICMSPart.vICMSST) &&
        Objects.equals(this.vBCFCPST, nfeSefazICMSPart.vBCFCPST) &&
        Objects.equals(this.pFCPST, nfeSefazICMSPart.pFCPST) &&
        Objects.equals(this.vFCPST, nfeSefazICMSPart.vFCPST) &&
        Objects.equals(this.pBCOp, nfeSefazICMSPart.pBCOp) &&
        Objects.equals(this.UFST, nfeSefazICMSPart.UFST);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(orig, CST, modBC, vBC, pRedBC, pICMS, vICMS, modBCST, pMVAST, pRedBCST, vBCST, pICMSST, vICMSST, vBCFCPST, pFCPST, vFCPST, pBCOp, UFST);
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
    sb.append("class NfeSefazICMSPart {\n");
    sb.append("    orig: ").append(toIndentedString(orig)).append("\n");
    sb.append("    CST: ").append(toIndentedString(CST)).append("\n");
    sb.append("    modBC: ").append(toIndentedString(modBC)).append("\n");
    sb.append("    vBC: ").append(toIndentedString(vBC)).append("\n");
    sb.append("    pRedBC: ").append(toIndentedString(pRedBC)).append("\n");
    sb.append("    pICMS: ").append(toIndentedString(pICMS)).append("\n");
    sb.append("    vICMS: ").append(toIndentedString(vICMS)).append("\n");
    sb.append("    modBCST: ").append(toIndentedString(modBCST)).append("\n");
    sb.append("    pMVAST: ").append(toIndentedString(pMVAST)).append("\n");
    sb.append("    pRedBCST: ").append(toIndentedString(pRedBCST)).append("\n");
    sb.append("    vBCST: ").append(toIndentedString(vBCST)).append("\n");
    sb.append("    pICMSST: ").append(toIndentedString(pICMSST)).append("\n");
    sb.append("    vICMSST: ").append(toIndentedString(vICMSST)).append("\n");
    sb.append("    vBCFCPST: ").append(toIndentedString(vBCFCPST)).append("\n");
    sb.append("    pFCPST: ").append(toIndentedString(pFCPST)).append("\n");
    sb.append("    vFCPST: ").append(toIndentedString(vFCPST)).append("\n");
    sb.append("    pBCOp: ").append(toIndentedString(pBCOp)).append("\n");
    sb.append("    UFST: ").append(toIndentedString(UFST)).append("\n");
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
    openapiFields.add("orig");
    openapiFields.add("CST");
    openapiFields.add("modBC");
    openapiFields.add("vBC");
    openapiFields.add("pRedBC");
    openapiFields.add("pICMS");
    openapiFields.add("vICMS");
    openapiFields.add("modBCST");
    openapiFields.add("pMVAST");
    openapiFields.add("pRedBCST");
    openapiFields.add("vBCST");
    openapiFields.add("pICMSST");
    openapiFields.add("vICMSST");
    openapiFields.add("vBCFCPST");
    openapiFields.add("pFCPST");
    openapiFields.add("vFCPST");
    openapiFields.add("pBCOp");
    openapiFields.add("UFST");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("orig");
    openapiRequiredFields.add("CST");
    openapiRequiredFields.add("modBC");
    openapiRequiredFields.add("vBC");
    openapiRequiredFields.add("pICMS");
    openapiRequiredFields.add("vICMS");
    openapiRequiredFields.add("modBCST");
    openapiRequiredFields.add("vBCST");
    openapiRequiredFields.add("pICMSST");
    openapiRequiredFields.add("vICMSST");
    openapiRequiredFields.add("pBCOp");
    openapiRequiredFields.add("UFST");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfeSefazICMSPart
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfeSefazICMSPart.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfeSefazICMSPart is not found in the empty JSON string", NfeSefazICMSPart.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfeSefazICMSPart.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfeSefazICMSPart` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NfeSefazICMSPart.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("CST") != null && !jsonObj.get("CST").isJsonNull()) && !jsonObj.get("CST").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CST` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CST").toString()));
      }
      if ((jsonObj.get("UFST") != null && !jsonObj.get("UFST").isJsonNull()) && !jsonObj.get("UFST").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `UFST` to be a primitive type in the JSON string but got `%s`", jsonObj.get("UFST").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NfeSefazICMSPart.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfeSefazICMSPart' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfeSefazICMSPart> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfeSefazICMSPart.class));

       return (TypeAdapter<T>) new TypeAdapter<NfeSefazICMSPart>() {
           @Override
           public void write(JsonWriter out, NfeSefazICMSPart value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfeSefazICMSPart read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfeSefazICMSPart given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfeSefazICMSPart
   * @throws IOException if the JSON string is invalid with respect to NfeSefazICMSPart
   */
  public static NfeSefazICMSPart fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfeSefazICMSPart.class);
  }

  /**
   * Convert an instance of NfeSefazICMSPart to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
