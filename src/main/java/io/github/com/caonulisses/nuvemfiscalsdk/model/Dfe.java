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
import java.time.OffsetDateTime;
import java.util.Arrays;
import io.github.com.caonulisses.nuvemfiscalsdk.model.DfeAutorizacao;
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
 * Dfe
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class Dfe {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  /**
   * Gets or Sets ambiente
   */
  @JsonAdapter(AmbienteEnum.Adapter.class)
  public enum AmbienteEnum {
    HOMOLOGACAO("homologacao"),
    
    PRODUCAO("producao");

    private String value;

    AmbienteEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AmbienteEnum fromValue(String value) {
      for (AmbienteEnum b : AmbienteEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AmbienteEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AmbienteEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AmbienteEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AmbienteEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AmbienteEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_AMBIENTE = "ambiente";
  @SerializedName(SERIALIZED_NAME_AMBIENTE)
  @javax.annotation.Nullable
  private AmbienteEnum ambiente;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime createdAt;

  /**
   * * &#x60;pendente&#x60;: o pedido de emissão do documento foi recebido pela Nuvem Fiscal e está na fila de processamento.  * &#x60;autorizado&#x60;, &#x60;rejeitado&#x60; ou &#x60;denegado&#x60;: o documento foi transmitido para a SEFAZ, que retornou um desses status.  * &#x60;cancelado&#x60;: um evento de cancelamento foi homologado pela SEFAZ e associado ao documento.  * &#x60;encerrado&#x60;: um evento de encerramento foi homologado pela SEFAZ e associado a um MDF-e.  * &#x60;erro&#x60;: status próprio da Nuvem Fiscal que significa, na maioria das vezes, que houve algum erro que impediu a transmissão do documento para a SEFAZ (erros de validação, erros interno do servidor, timeouts, etc).
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDENTE("pendente"),
    
    AUTORIZADO("autorizado"),
    
    REJEITADO("rejeitado"),
    
    DENEGADO("denegado"),
    
    ENCERRADO("encerrado"),
    
    CANCELADO("cancelado"),
    
    ERRO("erro");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private StatusEnum status;

  public static final String SERIALIZED_NAME_REFERENCIA = "referencia";
  @SerializedName(SERIALIZED_NAME_REFERENCIA)
  @javax.annotation.Nullable
  private String referencia;

  public static final String SERIALIZED_NAME_DATA_EMISSAO = "data_emissao";
  @SerializedName(SERIALIZED_NAME_DATA_EMISSAO)
  @javax.annotation.Nullable
  private OffsetDateTime dataEmissao;

  public static final String SERIALIZED_NAME_MODELO = "modelo";
  @SerializedName(SERIALIZED_NAME_MODELO)
  @javax.annotation.Nullable
  private Integer modelo;

  public static final String SERIALIZED_NAME_SERIE = "serie";
  @SerializedName(SERIALIZED_NAME_SERIE)
  @javax.annotation.Nullable
  private Integer serie;

  public static final String SERIALIZED_NAME_NUMERO = "numero";
  @SerializedName(SERIALIZED_NAME_NUMERO)
  @javax.annotation.Nullable
  private Integer numero;

  public static final String SERIALIZED_NAME_TIPO_EMISSAO = "tipo_emissao";
  @SerializedName(SERIALIZED_NAME_TIPO_EMISSAO)
  @javax.annotation.Nullable
  private Integer tipoEmissao;

  public static final String SERIALIZED_NAME_VALOR_TOTAL = "valor_total";
  @SerializedName(SERIALIZED_NAME_VALOR_TOTAL)
  @javax.annotation.Nullable
  private BigDecimal valorTotal;

  public static final String SERIALIZED_NAME_CHAVE = "chave";
  @SerializedName(SERIALIZED_NAME_CHAVE)
  @javax.annotation.Nullable
  private String chave;

  public static final String SERIALIZED_NAME_AUTORIZACAO = "autorizacao";
  @SerializedName(SERIALIZED_NAME_AUTORIZACAO)
  @javax.annotation.Nullable
  private DfeAutorizacao autorizacao;

  public Dfe() {
  }

  public Dfe id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * ID único gerado pela Nuvem Fiscal para este documento.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public Dfe ambiente(@javax.annotation.Nullable AmbienteEnum ambiente) {
    this.ambiente = ambiente;
    return this;
  }

  /**
   * Get ambiente
   * @return ambiente
   */
  @javax.annotation.Nullable
  public AmbienteEnum getAmbiente() {
    return ambiente;
  }

  public void setAmbiente(@javax.annotation.Nullable AmbienteEnum ambiente) {
    this.ambiente = ambiente;
  }


  public Dfe createdAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Data/hora em que o documento foi criado na Nuvem Fiscal. Representado no formato &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot; target&#x3D;\&quot;blank\&quot;&gt;&#x60;ISO 8601&#x60;&lt;/a&gt;.
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Dfe status(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * * &#x60;pendente&#x60;: o pedido de emissão do documento foi recebido pela Nuvem Fiscal e está na fila de processamento.  * &#x60;autorizado&#x60;, &#x60;rejeitado&#x60; ou &#x60;denegado&#x60;: o documento foi transmitido para a SEFAZ, que retornou um desses status.  * &#x60;cancelado&#x60;: um evento de cancelamento foi homologado pela SEFAZ e associado ao documento.  * &#x60;encerrado&#x60;: um evento de encerramento foi homologado pela SEFAZ e associado a um MDF-e.  * &#x60;erro&#x60;: status próprio da Nuvem Fiscal que significa, na maioria das vezes, que houve algum erro que impediu a transmissão do documento para a SEFAZ (erros de validação, erros interno do servidor, timeouts, etc).
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
  }


  public Dfe referencia(@javax.annotation.Nullable String referencia) {
    this.referencia = referencia;
    return this;
  }

  /**
   * Seu identificador único para este documento. Opcional, ajuda a evitar o envio duplicado de um mesmo documento.
   * @return referencia
   */
  @javax.annotation.Nullable
  public String getReferencia() {
    return referencia;
  }

  public void setReferencia(@javax.annotation.Nullable String referencia) {
    this.referencia = referencia;
  }


  public Dfe dataEmissao(@javax.annotation.Nullable OffsetDateTime dataEmissao) {
    this.dataEmissao = dataEmissao;
    return this;
  }

  /**
   * Get dataEmissao
   * @return dataEmissao
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDataEmissao() {
    return dataEmissao;
  }

  public void setDataEmissao(@javax.annotation.Nullable OffsetDateTime dataEmissao) {
    this.dataEmissao = dataEmissao;
  }


  public Dfe modelo(@javax.annotation.Nullable Integer modelo) {
    this.modelo = modelo;
    return this;
  }

  /**
   * Get modelo
   * @return modelo
   */
  @javax.annotation.Nullable
  public Integer getModelo() {
    return modelo;
  }

  public void setModelo(@javax.annotation.Nullable Integer modelo) {
    this.modelo = modelo;
  }


  public Dfe serie(@javax.annotation.Nullable Integer serie) {
    this.serie = serie;
    return this;
  }

  /**
   * Get serie
   * @return serie
   */
  @javax.annotation.Nullable
  public Integer getSerie() {
    return serie;
  }

  public void setSerie(@javax.annotation.Nullable Integer serie) {
    this.serie = serie;
  }


  public Dfe numero(@javax.annotation.Nullable Integer numero) {
    this.numero = numero;
    return this;
  }

  /**
   * Get numero
   * @return numero
   */
  @javax.annotation.Nullable
  public Integer getNumero() {
    return numero;
  }

  public void setNumero(@javax.annotation.Nullable Integer numero) {
    this.numero = numero;
  }


  public Dfe tipoEmissao(@javax.annotation.Nullable Integer tipoEmissao) {
    this.tipoEmissao = tipoEmissao;
    return this;
  }

  /**
   * Get tipoEmissao
   * @return tipoEmissao
   */
  @javax.annotation.Nullable
  public Integer getTipoEmissao() {
    return tipoEmissao;
  }

  public void setTipoEmissao(@javax.annotation.Nullable Integer tipoEmissao) {
    this.tipoEmissao = tipoEmissao;
  }


  public Dfe valorTotal(@javax.annotation.Nullable BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
    return this;
  }

  /**
   * Get valorTotal
   * @return valorTotal
   */
  @javax.annotation.Nullable
  public BigDecimal getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(@javax.annotation.Nullable BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
  }


  public Dfe chave(@javax.annotation.Nullable String chave) {
    this.chave = chave;
    return this;
  }

  /**
   * Chave de acesso do DF-e.
   * @return chave
   */
  @javax.annotation.Nullable
  public String getChave() {
    return chave;
  }

  public void setChave(@javax.annotation.Nullable String chave) {
    this.chave = chave;
  }


  public Dfe autorizacao(@javax.annotation.Nullable DfeAutorizacao autorizacao) {
    this.autorizacao = autorizacao;
    return this;
  }

  /**
   * Get autorizacao
   * @return autorizacao
   */
  @javax.annotation.Nullable
  public DfeAutorizacao getAutorizacao() {
    return autorizacao;
  }

  public void setAutorizacao(@javax.annotation.Nullable DfeAutorizacao autorizacao) {
    this.autorizacao = autorizacao;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dfe dfe = (Dfe) o;
    return Objects.equals(this.id, dfe.id) &&
        Objects.equals(this.ambiente, dfe.ambiente) &&
        Objects.equals(this.createdAt, dfe.createdAt) &&
        Objects.equals(this.status, dfe.status) &&
        Objects.equals(this.referencia, dfe.referencia) &&
        Objects.equals(this.dataEmissao, dfe.dataEmissao) &&
        Objects.equals(this.modelo, dfe.modelo) &&
        Objects.equals(this.serie, dfe.serie) &&
        Objects.equals(this.numero, dfe.numero) &&
        Objects.equals(this.tipoEmissao, dfe.tipoEmissao) &&
        Objects.equals(this.valorTotal, dfe.valorTotal) &&
        Objects.equals(this.chave, dfe.chave) &&
        Objects.equals(this.autorizacao, dfe.autorizacao);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ambiente, createdAt, status, referencia, dataEmissao, modelo, serie, numero, tipoEmissao, valorTotal, chave, autorizacao);
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
    sb.append("class Dfe {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ambiente: ").append(toIndentedString(ambiente)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    referencia: ").append(toIndentedString(referencia)).append("\n");
    sb.append("    dataEmissao: ").append(toIndentedString(dataEmissao)).append("\n");
    sb.append("    modelo: ").append(toIndentedString(modelo)).append("\n");
    sb.append("    serie: ").append(toIndentedString(serie)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    tipoEmissao: ").append(toIndentedString(tipoEmissao)).append("\n");
    sb.append("    valorTotal: ").append(toIndentedString(valorTotal)).append("\n");
    sb.append("    chave: ").append(toIndentedString(chave)).append("\n");
    sb.append("    autorizacao: ").append(toIndentedString(autorizacao)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("ambiente");
    openapiFields.add("created_at");
    openapiFields.add("status");
    openapiFields.add("referencia");
    openapiFields.add("data_emissao");
    openapiFields.add("modelo");
    openapiFields.add("serie");
    openapiFields.add("numero");
    openapiFields.add("tipo_emissao");
    openapiFields.add("valor_total");
    openapiFields.add("chave");
    openapiFields.add("autorizacao");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Dfe
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Dfe.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Dfe is not found in the empty JSON string", Dfe.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Dfe.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Dfe` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("ambiente") != null && !jsonObj.get("ambiente").isJsonNull()) && !jsonObj.get("ambiente").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ambiente` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ambiente").toString()));
      }
      // validate the optional field `ambiente`
      if (jsonObj.get("ambiente") != null && !jsonObj.get("ambiente").isJsonNull()) {
        AmbienteEnum.validateJsonElement(jsonObj.get("ambiente"));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("referencia") != null && !jsonObj.get("referencia").isJsonNull()) && !jsonObj.get("referencia").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referencia` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referencia").toString()));
      }
      if ((jsonObj.get("chave") != null && !jsonObj.get("chave").isJsonNull()) && !jsonObj.get("chave").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chave` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chave").toString()));
      }
      // validate the optional field `autorizacao`
      if (jsonObj.get("autorizacao") != null && !jsonObj.get("autorizacao").isJsonNull()) {
        DfeAutorizacao.validateJsonElement(jsonObj.get("autorizacao"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Dfe.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Dfe' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Dfe> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Dfe.class));

       return (TypeAdapter<T>) new TypeAdapter<Dfe>() {
           @Override
           public void write(JsonWriter out, Dfe value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Dfe read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Dfe given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Dfe
   * @throws IOException if the JSON string is invalid with respect to Dfe
   */
  public static Dfe fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Dfe.class);
  }

  /**
   * Convert an instance of Dfe to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

