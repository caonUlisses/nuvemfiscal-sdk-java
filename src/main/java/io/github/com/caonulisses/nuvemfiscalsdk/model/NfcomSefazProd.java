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
import java.time.LocalDate;
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
 * Dados do Produto ou Serviço.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfcomSefazProd {
  public static final String SERIALIZED_NAME_C_PROD = "cProd";
  @SerializedName(SERIALIZED_NAME_C_PROD)
  @javax.annotation.Nullable
  private String cProd;

  public static final String SERIALIZED_NAME_X_PROD = "xProd";
  @SerializedName(SERIALIZED_NAME_X_PROD)
  @javax.annotation.Nullable
  private String xProd;

  public static final String SERIALIZED_NAME_C_CLASS = "cClass";
  @SerializedName(SERIALIZED_NAME_C_CLASS)
  @javax.annotation.Nullable
  private String cClass;

  public static final String SERIALIZED_NAME_C_F_O_P = "CFOP";
  @SerializedName(SERIALIZED_NAME_C_F_O_P)
  @javax.annotation.Nullable
  private String CFOP;

  public static final String SERIALIZED_NAME_C_N_P_J_L_D = "CNPJLD";
  @SerializedName(SERIALIZED_NAME_C_N_P_J_L_D)
  @javax.annotation.Nullable
  private String CNPJLD;

  public static final String SERIALIZED_NAME_U_MED = "uMed";
  @SerializedName(SERIALIZED_NAME_U_MED)
  @javax.annotation.Nullable
  private Integer uMed;

  public static final String SERIALIZED_NAME_Q_FATURADA = "qFaturada";
  @SerializedName(SERIALIZED_NAME_Q_FATURADA)
  @javax.annotation.Nullable
  private BigDecimal qFaturada;

  public static final String SERIALIZED_NAME_V_ITEM = "vItem";
  @SerializedName(SERIALIZED_NAME_V_ITEM)
  @javax.annotation.Nullable
  private BigDecimal vItem;

  public static final String SERIALIZED_NAME_V_DESC = "vDesc";
  @SerializedName(SERIALIZED_NAME_V_DESC)
  @javax.annotation.Nullable
  private BigDecimal vDesc;

  public static final String SERIALIZED_NAME_V_OUTRO = "vOutro";
  @SerializedName(SERIALIZED_NAME_V_OUTRO)
  @javax.annotation.Nullable
  private BigDecimal vOutro;

  public static final String SERIALIZED_NAME_V_PROD = "vProd";
  @SerializedName(SERIALIZED_NAME_V_PROD)
  @javax.annotation.Nullable
  private BigDecimal vProd;

  public static final String SERIALIZED_NAME_D_EXPIRACAO = "dExpiracao";
  @SerializedName(SERIALIZED_NAME_D_EXPIRACAO)
  @javax.annotation.Nullable
  private LocalDate dExpiracao;

  public static final String SERIALIZED_NAME_IND_DEVOLUCAO = "indDevolucao";
  @SerializedName(SERIALIZED_NAME_IND_DEVOLUCAO)
  @javax.annotation.Nullable
  private Integer indDevolucao;

  public NfcomSefazProd() {
  }

  public NfcomSefazProd cProd(@javax.annotation.Nullable String cProd) {
    this.cProd = cProd;
    return this;
  }

  /**
   * Código do produto ou serviço.
   * @return cProd
   */
  @javax.annotation.Nullable
  public String getcProd() {
    return cProd;
  }

  public void setcProd(@javax.annotation.Nullable String cProd) {
    this.cProd = cProd;
  }


  public NfcomSefazProd xProd(@javax.annotation.Nullable String xProd) {
    this.xProd = xProd;
    return this;
  }

  /**
   * Descrição do produto ou serviço.
   * @return xProd
   */
  @javax.annotation.Nullable
  public String getxProd() {
    return xProd;
  }

  public void setxProd(@javax.annotation.Nullable String xProd) {
    this.xProd = xProd;
  }


  public NfcomSefazProd cClass(@javax.annotation.Nullable String cClass) {
    this.cClass = cClass;
    return this;
  }

  /**
   * Código de classificação.  Tabela de Classificação de Item da NFCom (validar por RV).
   * @return cClass
   */
  @javax.annotation.Nullable
  public String getcClass() {
    return cClass;
  }

  public void setcClass(@javax.annotation.Nullable String cClass) {
    this.cClass = cClass;
  }


  public NfcomSefazProd CFOP(@javax.annotation.Nullable String CFOP) {
    this.CFOP = CFOP;
    return this;
  }

  /**
   * CFOP.  Utilizar Tabela de CFOP.
   * @return CFOP
   */
  @javax.annotation.Nullable
  public String getCFOP() {
    return CFOP;
  }

  public void setCFOP(@javax.annotation.Nullable String CFOP) {
    this.CFOP = CFOP;
  }


  public NfcomSefazProd CNPJLD(@javax.annotation.Nullable String CNPJLD) {
    this.CNPJLD = CNPJLD;
    return this;
  }

  /**
   * CNPJ da operadora LD.  Informar o CNPJ da operadora LD que irá lançar o item de cofaturamento em nota do tipo faturamento 2.
   * @return CNPJLD
   */
  @javax.annotation.Nullable
  public String getCNPJLD() {
    return CNPJLD;
  }

  public void setCNPJLD(@javax.annotation.Nullable String CNPJLD) {
    this.CNPJLD = CNPJLD;
  }


  public NfcomSefazProd uMed(@javax.annotation.Nullable Integer uMed) {
    this.uMed = uMed;
    return this;
  }

  /**
   * Unidade Básica de Medida.  * 1 - Minuto  * 2 - MB  * 3 - GB  * 4 - UN
   * @return uMed
   */
  @javax.annotation.Nullable
  public Integer getuMed() {
    return uMed;
  }

  public void setuMed(@javax.annotation.Nullable Integer uMed) {
    this.uMed = uMed;
  }


  public NfcomSefazProd qFaturada(@javax.annotation.Nullable BigDecimal qFaturada) {
    this.qFaturada = qFaturada;
    return this;
  }

  /**
   * Quantidade Faturada.  Informar a quantidade de comercialização do produto .
   * minimum: 0
   * @return qFaturada
   */
  @javax.annotation.Nullable
  public BigDecimal getqFaturada() {
    return qFaturada;
  }

  public void setqFaturada(@javax.annotation.Nullable BigDecimal qFaturada) {
    this.qFaturada = qFaturada;
  }


  public NfcomSefazProd vItem(@javax.annotation.Nullable BigDecimal vItem) {
    this.vItem = vItem;
    return this;
  }

  /**
   * Valor unitário do item.
   * @return vItem
   */
  @javax.annotation.Nullable
  public BigDecimal getvItem() {
    return vItem;
  }

  public void setvItem(@javax.annotation.Nullable BigDecimal vItem) {
    this.vItem = vItem;
  }


  public NfcomSefazProd vDesc(@javax.annotation.Nullable BigDecimal vDesc) {
    this.vDesc = vDesc;
    return this;
  }

  /**
   * Valor do Desconto.
   * minimum: 0
   * @return vDesc
   */
  @javax.annotation.Nullable
  public BigDecimal getvDesc() {
    return vDesc;
  }

  public void setvDesc(@javax.annotation.Nullable BigDecimal vDesc) {
    this.vDesc = vDesc;
  }


  public NfcomSefazProd vOutro(@javax.annotation.Nullable BigDecimal vOutro) {
    this.vOutro = vOutro;
    return this;
  }

  /**
   * Outras despesas acessórias.
   * minimum: 0
   * @return vOutro
   */
  @javax.annotation.Nullable
  public BigDecimal getvOutro() {
    return vOutro;
  }

  public void setvOutro(@javax.annotation.Nullable BigDecimal vOutro) {
    this.vOutro = vOutro;
  }


  public NfcomSefazProd vProd(@javax.annotation.Nullable BigDecimal vProd) {
    this.vProd = vProd;
    return this;
  }

  /**
   * Valor total do item.
   * @return vProd
   */
  @javax.annotation.Nullable
  public BigDecimal getvProd() {
    return vProd;
  }

  public void setvProd(@javax.annotation.Nullable BigDecimal vProd) {
    this.vProd = vProd;
  }


  public NfcomSefazProd dExpiracao(@javax.annotation.Nullable LocalDate dExpiracao) {
    this.dExpiracao = dExpiracao;
    return this;
  }

  /**
   * Data de expiração de crédito.  Formato AAAA-MM-DD.
   * @return dExpiracao
   */
  @javax.annotation.Nullable
  public LocalDate getdExpiracao() {
    return dExpiracao;
  }

  public void setdExpiracao(@javax.annotation.Nullable LocalDate dExpiracao) {
    this.dExpiracao = dExpiracao;
  }


  public NfcomSefazProd indDevolucao(@javax.annotation.Nullable Integer indDevolucao) {
    this.indDevolucao = indDevolucao;
    return this;
  }

  /**
   * Indicador de devolução do valor do item.  * 1 - Devolução do valor do item
   * @return indDevolucao
   */
  @javax.annotation.Nullable
  public Integer getIndDevolucao() {
    return indDevolucao;
  }

  public void setIndDevolucao(@javax.annotation.Nullable Integer indDevolucao) {
    this.indDevolucao = indDevolucao;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfcomSefazProd nfcomSefazProd = (NfcomSefazProd) o;
    return Objects.equals(this.cProd, nfcomSefazProd.cProd) &&
        Objects.equals(this.xProd, nfcomSefazProd.xProd) &&
        Objects.equals(this.cClass, nfcomSefazProd.cClass) &&
        Objects.equals(this.CFOP, nfcomSefazProd.CFOP) &&
        Objects.equals(this.CNPJLD, nfcomSefazProd.CNPJLD) &&
        Objects.equals(this.uMed, nfcomSefazProd.uMed) &&
        Objects.equals(this.qFaturada, nfcomSefazProd.qFaturada) &&
        Objects.equals(this.vItem, nfcomSefazProd.vItem) &&
        Objects.equals(this.vDesc, nfcomSefazProd.vDesc) &&
        Objects.equals(this.vOutro, nfcomSefazProd.vOutro) &&
        Objects.equals(this.vProd, nfcomSefazProd.vProd) &&
        Objects.equals(this.dExpiracao, nfcomSefazProd.dExpiracao) &&
        Objects.equals(this.indDevolucao, nfcomSefazProd.indDevolucao);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cProd, xProd, cClass, CFOP, CNPJLD, uMed, qFaturada, vItem, vDesc, vOutro, vProd, dExpiracao, indDevolucao);
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
    sb.append("class NfcomSefazProd {\n");
    sb.append("    cProd: ").append(toIndentedString(cProd)).append("\n");
    sb.append("    xProd: ").append(toIndentedString(xProd)).append("\n");
    sb.append("    cClass: ").append(toIndentedString(cClass)).append("\n");
    sb.append("    CFOP: ").append(toIndentedString(CFOP)).append("\n");
    sb.append("    CNPJLD: ").append(toIndentedString(CNPJLD)).append("\n");
    sb.append("    uMed: ").append(toIndentedString(uMed)).append("\n");
    sb.append("    qFaturada: ").append(toIndentedString(qFaturada)).append("\n");
    sb.append("    vItem: ").append(toIndentedString(vItem)).append("\n");
    sb.append("    vDesc: ").append(toIndentedString(vDesc)).append("\n");
    sb.append("    vOutro: ").append(toIndentedString(vOutro)).append("\n");
    sb.append("    vProd: ").append(toIndentedString(vProd)).append("\n");
    sb.append("    dExpiracao: ").append(toIndentedString(dExpiracao)).append("\n");
    sb.append("    indDevolucao: ").append(toIndentedString(indDevolucao)).append("\n");
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
    openapiFields.add("cProd");
    openapiFields.add("xProd");
    openapiFields.add("cClass");
    openapiFields.add("CFOP");
    openapiFields.add("CNPJLD");
    openapiFields.add("uMed");
    openapiFields.add("qFaturada");
    openapiFields.add("vItem");
    openapiFields.add("vDesc");
    openapiFields.add("vOutro");
    openapiFields.add("vProd");
    openapiFields.add("dExpiracao");
    openapiFields.add("indDevolucao");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cProd");
    openapiRequiredFields.add("xProd");
    openapiRequiredFields.add("cClass");
    openapiRequiredFields.add("uMed");
    openapiRequiredFields.add("qFaturada");
    openapiRequiredFields.add("vItem");
    openapiRequiredFields.add("vProd");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfcomSefazProd
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfcomSefazProd.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfcomSefazProd is not found in the empty JSON string", NfcomSefazProd.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfcomSefazProd.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfcomSefazProd` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NfcomSefazProd.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cProd") != null && !jsonObj.get("cProd").isJsonNull()) && !jsonObj.get("cProd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cProd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cProd").toString()));
      }
      if ((jsonObj.get("xProd") != null && !jsonObj.get("xProd").isJsonNull()) && !jsonObj.get("xProd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xProd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xProd").toString()));
      }
      if ((jsonObj.get("cClass") != null && !jsonObj.get("cClass").isJsonNull()) && !jsonObj.get("cClass").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cClass` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cClass").toString()));
      }
      if ((jsonObj.get("CFOP") != null && !jsonObj.get("CFOP").isJsonNull()) && !jsonObj.get("CFOP").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CFOP` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CFOP").toString()));
      }
      if ((jsonObj.get("CNPJLD") != null && !jsonObj.get("CNPJLD").isJsonNull()) && !jsonObj.get("CNPJLD").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CNPJLD` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CNPJLD").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NfcomSefazProd.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfcomSefazProd' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfcomSefazProd> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfcomSefazProd.class));

       return (TypeAdapter<T>) new TypeAdapter<NfcomSefazProd>() {
           @Override
           public void write(JsonWriter out, NfcomSefazProd value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfcomSefazProd read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfcomSefazProd given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfcomSefazProd
   * @throws IOException if the JSON string is invalid with respect to NfcomSefazProd
   */
  public static NfcomSefazProd fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfcomSefazProd.class);
  }

  /**
   * Convert an instance of NfcomSefazProd to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

