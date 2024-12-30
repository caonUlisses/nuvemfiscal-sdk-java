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
import java.time.OffsetDateTime;
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
 * DistribuicaoNfeEvento
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class DistribuicaoNfeEvento {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime createdAt;

  /**
   * Identificação do ambiente.
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

  /**
   * Status do Evento.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDENTE("pendente"),
    
    REGISTRADO("registrado"),
    
    REJEITADO("rejeitado"),
    
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

  public static final String SERIALIZED_NAME_CPF_CNPJ_AUTOR = "cpf_cnpj_autor";
  @SerializedName(SERIALIZED_NAME_CPF_CNPJ_AUTOR)
  @javax.annotation.Nullable
  private String cpfCnpjAutor;

  public static final String SERIALIZED_NAME_CHAVE_ACESSO = "chave_acesso";
  @SerializedName(SERIALIZED_NAME_CHAVE_ACESSO)
  @javax.annotation.Nullable
  private String chaveAcesso;

  public static final String SERIALIZED_NAME_TIPO_EVENTO = "tipo_evento";
  @SerializedName(SERIALIZED_NAME_TIPO_EVENTO)
  @javax.annotation.Nullable
  private String tipoEvento;

  public static final String SERIALIZED_NAME_DATA_EVENTO = "data_evento";
  @SerializedName(SERIALIZED_NAME_DATA_EVENTO)
  @javax.annotation.Nullable
  private OffsetDateTime dataEvento;

  public static final String SERIALIZED_NAME_NUMERO_SEQUENCIAL = "numero_sequencial";
  @SerializedName(SERIALIZED_NAME_NUMERO_SEQUENCIAL)
  @javax.annotation.Nullable
  private Integer numeroSequencial;

  public static final String SERIALIZED_NAME_JUSTIFICATIVA = "justificativa";
  @SerializedName(SERIALIZED_NAME_JUSTIFICATIVA)
  @javax.annotation.Nullable
  private String justificativa;

  public static final String SERIALIZED_NAME_DATA_REGISTRO = "data_registro";
  @SerializedName(SERIALIZED_NAME_DATA_REGISTRO)
  @javax.annotation.Nullable
  private OffsetDateTime dataRegistro;

  public static final String SERIALIZED_NAME_CODIGO_STATUS = "codigo_status";
  @SerializedName(SERIALIZED_NAME_CODIGO_STATUS)
  @javax.annotation.Nullable
  private Integer codigoStatus;

  public static final String SERIALIZED_NAME_MOTIVO_STATUS = "motivo_status";
  @SerializedName(SERIALIZED_NAME_MOTIVO_STATUS)
  @javax.annotation.Nullable
  private String motivoStatus;

  public static final String SERIALIZED_NAME_NUMERO_PROTOCOLO = "numero_protocolo";
  @SerializedName(SERIALIZED_NAME_NUMERO_PROTOCOLO)
  @javax.annotation.Nullable
  private String numeroProtocolo;

  public DistribuicaoNfeEvento() {
  }

  public DistribuicaoNfeEvento id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * ID único gerado pela Nuvem Fiscal para este evento.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public DistribuicaoNfeEvento createdAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Data/hora em que o evento foi criado na Nuvem Fiscal. Representado no formato &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot; target&#x3D;\&quot;blank\&quot;&gt;&#x60;ISO 8601&#x60;&lt;/a&gt;.
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public DistribuicaoNfeEvento ambiente(@javax.annotation.Nullable AmbienteEnum ambiente) {
    this.ambiente = ambiente;
    return this;
  }

  /**
   * Identificação do ambiente.
   * @return ambiente
   */
  @javax.annotation.Nullable
  public AmbienteEnum getAmbiente() {
    return ambiente;
  }

  public void setAmbiente(@javax.annotation.Nullable AmbienteEnum ambiente) {
    this.ambiente = ambiente;
  }


  public DistribuicaoNfeEvento status(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status do Evento.
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
  }


  public DistribuicaoNfeEvento cpfCnpjAutor(@javax.annotation.Nullable String cpfCnpjAutor) {
    this.cpfCnpjAutor = cpfCnpjAutor;
    return this;
  }

  /**
   * CPF/CNPJ do autor do evento.
   * @return cpfCnpjAutor
   */
  @javax.annotation.Nullable
  public String getCpfCnpjAutor() {
    return cpfCnpjAutor;
  }

  public void setCpfCnpjAutor(@javax.annotation.Nullable String cpfCnpjAutor) {
    this.cpfCnpjAutor = cpfCnpjAutor;
  }


  public DistribuicaoNfeEvento chaveAcesso(@javax.annotation.Nullable String chaveAcesso) {
    this.chaveAcesso = chaveAcesso;
    return this;
  }

  /**
   * Chave de Acesso do documento vinculado ao evento.
   * @return chaveAcesso
   */
  @javax.annotation.Nullable
  public String getChaveAcesso() {
    return chaveAcesso;
  }

  public void setChaveAcesso(@javax.annotation.Nullable String chaveAcesso) {
    this.chaveAcesso = chaveAcesso;
  }


  public DistribuicaoNfeEvento tipoEvento(@javax.annotation.Nullable String tipoEvento) {
    this.tipoEvento = tipoEvento;
    return this;
  }

  /**
   * Tipo do evento vinculado.
   * @return tipoEvento
   */
  @javax.annotation.Nullable
  public String getTipoEvento() {
    return tipoEvento;
  }

  public void setTipoEvento(@javax.annotation.Nullable String tipoEvento) {
    this.tipoEvento = tipoEvento;
  }


  public DistribuicaoNfeEvento dataEvento(@javax.annotation.Nullable OffsetDateTime dataEvento) {
    this.dataEvento = dataEvento;
    return this;
  }

  /**
   * Data e hora do Evento.
   * @return dataEvento
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDataEvento() {
    return dataEvento;
  }

  public void setDataEvento(@javax.annotation.Nullable OffsetDateTime dataEvento) {
    this.dataEvento = dataEvento;
  }


  public DistribuicaoNfeEvento numeroSequencial(@javax.annotation.Nullable Integer numeroSequencial) {
    this.numeroSequencial = numeroSequencial;
    return this;
  }

  /**
   * Sequencial do evento para o mesmo tipo de evento.
   * @return numeroSequencial
   */
  @javax.annotation.Nullable
  public Integer getNumeroSequencial() {
    return numeroSequencial;
  }

  public void setNumeroSequencial(@javax.annotation.Nullable Integer numeroSequencial) {
    this.numeroSequencial = numeroSequencial;
  }


  public DistribuicaoNfeEvento justificativa(@javax.annotation.Nullable String justificativa) {
    this.justificativa = justificativa;
    return this;
  }

  /**
   * Justificativa para o desconhecimento ou não-realização da operação.
   * @return justificativa
   */
  @javax.annotation.Nullable
  public String getJustificativa() {
    return justificativa;
  }

  public void setJustificativa(@javax.annotation.Nullable String justificativa) {
    this.justificativa = justificativa;
  }


  public DistribuicaoNfeEvento dataRegistro(@javax.annotation.Nullable OffsetDateTime dataRegistro) {
    this.dataRegistro = dataRegistro;
    return this;
  }

  /**
   * Data e hora do registro do evento pela SEFAZ.
   * @return dataRegistro
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDataRegistro() {
    return dataRegistro;
  }

  public void setDataRegistro(@javax.annotation.Nullable OffsetDateTime dataRegistro) {
    this.dataRegistro = dataRegistro;
  }


  public DistribuicaoNfeEvento codigoStatus(@javax.annotation.Nullable Integer codigoStatus) {
    this.codigoStatus = codigoStatus;
    return this;
  }

  /**
   * Código do status de registro do evento.
   * @return codigoStatus
   */
  @javax.annotation.Nullable
  public Integer getCodigoStatus() {
    return codigoStatus;
  }

  public void setCodigoStatus(@javax.annotation.Nullable Integer codigoStatus) {
    this.codigoStatus = codigoStatus;
  }


  public DistribuicaoNfeEvento motivoStatus(@javax.annotation.Nullable String motivoStatus) {
    this.motivoStatus = motivoStatus;
    return this;
  }

  /**
   * Descrição literal do status do registro do evento.
   * @return motivoStatus
   */
  @javax.annotation.Nullable
  public String getMotivoStatus() {
    return motivoStatus;
  }

  public void setMotivoStatus(@javax.annotation.Nullable String motivoStatus) {
    this.motivoStatus = motivoStatus;
  }


  public DistribuicaoNfeEvento numeroProtocolo(@javax.annotation.Nullable String numeroProtocolo) {
    this.numeroProtocolo = numeroProtocolo;
    return this;
  }

  /**
   * Número do Protocolo de registro do evento.
   * @return numeroProtocolo
   */
  @javax.annotation.Nullable
  public String getNumeroProtocolo() {
    return numeroProtocolo;
  }

  public void setNumeroProtocolo(@javax.annotation.Nullable String numeroProtocolo) {
    this.numeroProtocolo = numeroProtocolo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistribuicaoNfeEvento distribuicaoNfeEvento = (DistribuicaoNfeEvento) o;
    return Objects.equals(this.id, distribuicaoNfeEvento.id) &&
        Objects.equals(this.createdAt, distribuicaoNfeEvento.createdAt) &&
        Objects.equals(this.ambiente, distribuicaoNfeEvento.ambiente) &&
        Objects.equals(this.status, distribuicaoNfeEvento.status) &&
        Objects.equals(this.cpfCnpjAutor, distribuicaoNfeEvento.cpfCnpjAutor) &&
        Objects.equals(this.chaveAcesso, distribuicaoNfeEvento.chaveAcesso) &&
        Objects.equals(this.tipoEvento, distribuicaoNfeEvento.tipoEvento) &&
        Objects.equals(this.dataEvento, distribuicaoNfeEvento.dataEvento) &&
        Objects.equals(this.numeroSequencial, distribuicaoNfeEvento.numeroSequencial) &&
        Objects.equals(this.justificativa, distribuicaoNfeEvento.justificativa) &&
        Objects.equals(this.dataRegistro, distribuicaoNfeEvento.dataRegistro) &&
        Objects.equals(this.codigoStatus, distribuicaoNfeEvento.codigoStatus) &&
        Objects.equals(this.motivoStatus, distribuicaoNfeEvento.motivoStatus) &&
        Objects.equals(this.numeroProtocolo, distribuicaoNfeEvento.numeroProtocolo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, ambiente, status, cpfCnpjAutor, chaveAcesso, tipoEvento, dataEvento, numeroSequencial, justificativa, dataRegistro, codigoStatus, motivoStatus, numeroProtocolo);
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
    sb.append("class DistribuicaoNfeEvento {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    ambiente: ").append(toIndentedString(ambiente)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    cpfCnpjAutor: ").append(toIndentedString(cpfCnpjAutor)).append("\n");
    sb.append("    chaveAcesso: ").append(toIndentedString(chaveAcesso)).append("\n");
    sb.append("    tipoEvento: ").append(toIndentedString(tipoEvento)).append("\n");
    sb.append("    dataEvento: ").append(toIndentedString(dataEvento)).append("\n");
    sb.append("    numeroSequencial: ").append(toIndentedString(numeroSequencial)).append("\n");
    sb.append("    justificativa: ").append(toIndentedString(justificativa)).append("\n");
    sb.append("    dataRegistro: ").append(toIndentedString(dataRegistro)).append("\n");
    sb.append("    codigoStatus: ").append(toIndentedString(codigoStatus)).append("\n");
    sb.append("    motivoStatus: ").append(toIndentedString(motivoStatus)).append("\n");
    sb.append("    numeroProtocolo: ").append(toIndentedString(numeroProtocolo)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("ambiente");
    openapiFields.add("status");
    openapiFields.add("cpf_cnpj_autor");
    openapiFields.add("chave_acesso");
    openapiFields.add("tipo_evento");
    openapiFields.add("data_evento");
    openapiFields.add("numero_sequencial");
    openapiFields.add("justificativa");
    openapiFields.add("data_registro");
    openapiFields.add("codigo_status");
    openapiFields.add("motivo_status");
    openapiFields.add("numero_protocolo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DistribuicaoNfeEvento
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DistribuicaoNfeEvento.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DistribuicaoNfeEvento is not found in the empty JSON string", DistribuicaoNfeEvento.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DistribuicaoNfeEvento.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DistribuicaoNfeEvento` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if ((jsonObj.get("cpf_cnpj_autor") != null && !jsonObj.get("cpf_cnpj_autor").isJsonNull()) && !jsonObj.get("cpf_cnpj_autor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cpf_cnpj_autor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cpf_cnpj_autor").toString()));
      }
      if ((jsonObj.get("chave_acesso") != null && !jsonObj.get("chave_acesso").isJsonNull()) && !jsonObj.get("chave_acesso").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chave_acesso` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chave_acesso").toString()));
      }
      if ((jsonObj.get("tipo_evento") != null && !jsonObj.get("tipo_evento").isJsonNull()) && !jsonObj.get("tipo_evento").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tipo_evento` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tipo_evento").toString()));
      }
      if ((jsonObj.get("justificativa") != null && !jsonObj.get("justificativa").isJsonNull()) && !jsonObj.get("justificativa").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `justificativa` to be a primitive type in the JSON string but got `%s`", jsonObj.get("justificativa").toString()));
      }
      if ((jsonObj.get("motivo_status") != null && !jsonObj.get("motivo_status").isJsonNull()) && !jsonObj.get("motivo_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `motivo_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("motivo_status").toString()));
      }
      if ((jsonObj.get("numero_protocolo") != null && !jsonObj.get("numero_protocolo").isJsonNull()) && !jsonObj.get("numero_protocolo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `numero_protocolo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("numero_protocolo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DistribuicaoNfeEvento.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DistribuicaoNfeEvento' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DistribuicaoNfeEvento> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DistribuicaoNfeEvento.class));

       return (TypeAdapter<T>) new TypeAdapter<DistribuicaoNfeEvento>() {
           @Override
           public void write(JsonWriter out, DistribuicaoNfeEvento value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DistribuicaoNfeEvento read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DistribuicaoNfeEvento given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DistribuicaoNfeEvento
   * @throws IOException if the JSON string is invalid with respect to DistribuicaoNfeEvento
   */
  public static DistribuicaoNfeEvento fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DistribuicaoNfeEvento.class);
  }

  /**
   * Convert an instance of DistribuicaoNfeEvento to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
