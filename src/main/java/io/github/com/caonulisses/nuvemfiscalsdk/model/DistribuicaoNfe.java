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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.github.com.caonulisses.nuvemfiscalsdk.model.DistribuicaoNfeDocumento;
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
 * DistribuicaoNfe
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class DistribuicaoNfe {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime createdAt;

  /**
   * Indica o status da distribuição.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PROCESSANDO("processando"),
    
    CONCLUIDO("concluido"),
    
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
  @javax.annotation.Nonnull
  private StatusEnum status;

  /**
   * Identificação do Ambiente.
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
  @javax.annotation.Nonnull
  private AmbienteEnum ambiente;

  public static final String SERIALIZED_NAME_UF_AUTOR = "uf_autor";
  @SerializedName(SERIALIZED_NAME_UF_AUTOR)
  @javax.annotation.Nullable
  private String ufAutor;

  /**
   * Gets or Sets tipoConsulta
   */
  @JsonAdapter(TipoConsultaEnum.Adapter.class)
  public enum TipoConsultaEnum {
    DIST_NSU("dist-nsu"),
    
    CONS_NSU("cons-nsu"),
    
    CONS_CHAVE("cons-chave");

    private String value;

    TipoConsultaEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TipoConsultaEnum fromValue(String value) {
      for (TipoConsultaEnum b : TipoConsultaEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TipoConsultaEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TipoConsultaEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TipoConsultaEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TipoConsultaEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TipoConsultaEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TIPO_CONSULTA = "tipo_consulta";
  @SerializedName(SERIALIZED_NAME_TIPO_CONSULTA)
  @javax.annotation.Nonnull
  private TipoConsultaEnum tipoConsulta;

  public static final String SERIALIZED_NAME_DIST_NSU = "dist_nsu";
  @SerializedName(SERIALIZED_NAME_DIST_NSU)
  @javax.annotation.Nullable
  private Integer distNsu;

  public static final String SERIALIZED_NAME_CONS_NSU = "cons_nsu";
  @SerializedName(SERIALIZED_NAME_CONS_NSU)
  @javax.annotation.Nullable
  private Integer consNsu;

  public static final String SERIALIZED_NAME_CONS_CHAVE = "cons_chave";
  @SerializedName(SERIALIZED_NAME_CONS_CHAVE)
  @javax.annotation.Nullable
  private String consChave;

  public static final String SERIALIZED_NAME_CODIGO_STATUS = "codigo_status";
  @SerializedName(SERIALIZED_NAME_CODIGO_STATUS)
  @javax.annotation.Nullable
  private Integer codigoStatus;

  public static final String SERIALIZED_NAME_MOTIVO_STATUS = "motivo_status";
  @SerializedName(SERIALIZED_NAME_MOTIVO_STATUS)
  @javax.annotation.Nullable
  private String motivoStatus;

  public static final String SERIALIZED_NAME_DATA_HORA_RESPOSTA = "data_hora_resposta";
  @SerializedName(SERIALIZED_NAME_DATA_HORA_RESPOSTA)
  @javax.annotation.Nullable
  private OffsetDateTime dataHoraResposta;

  public static final String SERIALIZED_NAME_ULTIMO_NSU = "ultimo_nsu";
  @SerializedName(SERIALIZED_NAME_ULTIMO_NSU)
  @javax.annotation.Nullable
  private Integer ultimoNsu;

  public static final String SERIALIZED_NAME_MAX_NSU = "max_nsu";
  @SerializedName(SERIALIZED_NAME_MAX_NSU)
  @javax.annotation.Nullable
  private Integer maxNsu;

  public static final String SERIALIZED_NAME_DOCUMENTOS = "documentos";
  @SerializedName(SERIALIZED_NAME_DOCUMENTOS)
  @javax.annotation.Nullable
  private List<DistribuicaoNfeDocumento> documentos = new ArrayList<>();

  public DistribuicaoNfe() {
  }

  public DistribuicaoNfe id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * ID único gerado pela Nuvem Fiscal para o pedido de distribuição.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public DistribuicaoNfe createdAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Data/hora em que o pedido foi criado na Nuvem Fiscal. Representado no formato &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot; target&#x3D;\&quot;blank\&quot;&gt;&#x60;ISO 8601&#x60;&lt;/a&gt;.
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public DistribuicaoNfe status(@javax.annotation.Nonnull StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Indica o status da distribuição.
   * @return status
   */
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull StatusEnum status) {
    this.status = status;
  }


  public DistribuicaoNfe ambiente(@javax.annotation.Nonnull AmbienteEnum ambiente) {
    this.ambiente = ambiente;
    return this;
  }

  /**
   * Identificação do Ambiente.
   * @return ambiente
   */
  @javax.annotation.Nonnull
  public AmbienteEnum getAmbiente() {
    return ambiente;
  }

  public void setAmbiente(@javax.annotation.Nonnull AmbienteEnum ambiente) {
    this.ambiente = ambiente;
  }


  public DistribuicaoNfe ufAutor(@javax.annotation.Nullable String ufAutor) {
    this.ufAutor = ufAutor;
    return this;
  }

  /**
   * Sigla da UF do autor.
   * @return ufAutor
   */
  @javax.annotation.Nullable
  public String getUfAutor() {
    return ufAutor;
  }

  public void setUfAutor(@javax.annotation.Nullable String ufAutor) {
    this.ufAutor = ufAutor;
  }


  public DistribuicaoNfe tipoConsulta(@javax.annotation.Nonnull TipoConsultaEnum tipoConsulta) {
    this.tipoConsulta = tipoConsulta;
    return this;
  }

  /**
   * Get tipoConsulta
   * @return tipoConsulta
   */
  @javax.annotation.Nonnull
  public TipoConsultaEnum getTipoConsulta() {
    return tipoConsulta;
  }

  public void setTipoConsulta(@javax.annotation.Nonnull TipoConsultaEnum tipoConsulta) {
    this.tipoConsulta = tipoConsulta;
  }


  public DistribuicaoNfe distNsu(@javax.annotation.Nullable Integer distNsu) {
    this.distNsu = distNsu;
    return this;
  }

  /**
   * Distribuição de conjunto de DF-e a partir do NSU informado.    *Obrigatório quando &#x60;tipo_consulta&#x60; for &#x60;distNSU&#x60;.*
   * @return distNsu
   */
  @javax.annotation.Nullable
  public Integer getDistNsu() {
    return distNsu;
  }

  public void setDistNsu(@javax.annotation.Nullable Integer distNsu) {
    this.distNsu = distNsu;
  }


  public DistribuicaoNfe consNsu(@javax.annotation.Nullable Integer consNsu) {
    this.consNsu = consNsu;
    return this;
  }

  /**
   * Consulta DF-e vinculado ao NSU informado.    *Obrigatório quando &#x60;tipo_consulta&#x60; for &#x60;consNSU&#x60;.*
   * @return consNsu
   */
  @javax.annotation.Nullable
  public Integer getConsNsu() {
    return consNsu;
  }

  public void setConsNsu(@javax.annotation.Nullable Integer consNsu) {
    this.consNsu = consNsu;
  }


  public DistribuicaoNfe consChave(@javax.annotation.Nullable String consChave) {
    this.consChave = consChave;
    return this;
  }

  /**
   * Consulta de NF-e por chave de acesso informada.    *Obrigatório quando &#x60;tipo_consulta&#x60; for &#x60;consChNFe&#x60;.*
   * @return consChave
   */
  @javax.annotation.Nullable
  public String getConsChave() {
    return consChave;
  }

  public void setConsChave(@javax.annotation.Nullable String consChave) {
    this.consChave = consChave;
  }


  public DistribuicaoNfe codigoStatus(@javax.annotation.Nullable Integer codigoStatus) {
    this.codigoStatus = codigoStatus;
    return this;
  }

  /**
   * Código do status de processamento da requisição.
   * @return codigoStatus
   */
  @javax.annotation.Nullable
  public Integer getCodigoStatus() {
    return codigoStatus;
  }

  public void setCodigoStatus(@javax.annotation.Nullable Integer codigoStatus) {
    this.codigoStatus = codigoStatus;
  }


  public DistribuicaoNfe motivoStatus(@javax.annotation.Nullable String motivoStatus) {
    this.motivoStatus = motivoStatus;
    return this;
  }

  /**
   * Descrição do status de processamento da requisição.
   * @return motivoStatus
   */
  @javax.annotation.Nullable
  public String getMotivoStatus() {
    return motivoStatus;
  }

  public void setMotivoStatus(@javax.annotation.Nullable String motivoStatus) {
    this.motivoStatus = motivoStatus;
  }


  public DistribuicaoNfe dataHoraResposta(@javax.annotation.Nullable OffsetDateTime dataHoraResposta) {
    this.dataHoraResposta = dataHoraResposta;
    return this;
  }

  /**
   * Data e Hora de processamento da requisição.
   * @return dataHoraResposta
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDataHoraResposta() {
    return dataHoraResposta;
  }

  public void setDataHoraResposta(@javax.annotation.Nullable OffsetDateTime dataHoraResposta) {
    this.dataHoraResposta = dataHoraResposta;
  }


  public DistribuicaoNfe ultimoNsu(@javax.annotation.Nullable Integer ultimoNsu) {
    this.ultimoNsu = ultimoNsu;
    return this;
  }

  /**
   * Último NSU pesquisado no Ambiente Nacional. Se for o caso, o solicitante pode continuar a consulta a partir deste NSU para obter novos resultados.
   * @return ultimoNsu
   */
  @javax.annotation.Nullable
  public Integer getUltimoNsu() {
    return ultimoNsu;
  }

  public void setUltimoNsu(@javax.annotation.Nullable Integer ultimoNsu) {
    this.ultimoNsu = ultimoNsu;
  }


  public DistribuicaoNfe maxNsu(@javax.annotation.Nullable Integer maxNsu) {
    this.maxNsu = maxNsu;
    return this;
  }

  /**
   * Maior NSU existente no Ambiente Nacional para o CNPJ/CPF informado.
   * @return maxNsu
   */
  @javax.annotation.Nullable
  public Integer getMaxNsu() {
    return maxNsu;
  }

  public void setMaxNsu(@javax.annotation.Nullable Integer maxNsu) {
    this.maxNsu = maxNsu;
  }


  public DistribuicaoNfe documentos(@javax.annotation.Nullable List<DistribuicaoNfeDocumento> documentos) {
    this.documentos = documentos;
    return this;
  }

  public DistribuicaoNfe addDocumentosItem(DistribuicaoNfeDocumento documentosItem) {
    if (this.documentos == null) {
      this.documentos = new ArrayList<>();
    }
    this.documentos.add(documentosItem);
    return this;
  }

  /**
   * Conjunto de informações resumidas e documentos fiscais eletrônicos de interesse da pessoa ou empresa.
   * @return documentos
   */
  @javax.annotation.Nullable
  public List<DistribuicaoNfeDocumento> getDocumentos() {
    return documentos;
  }

  public void setDocumentos(@javax.annotation.Nullable List<DistribuicaoNfeDocumento> documentos) {
    this.documentos = documentos;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistribuicaoNfe distribuicaoNfe = (DistribuicaoNfe) o;
    return Objects.equals(this.id, distribuicaoNfe.id) &&
        Objects.equals(this.createdAt, distribuicaoNfe.createdAt) &&
        Objects.equals(this.status, distribuicaoNfe.status) &&
        Objects.equals(this.ambiente, distribuicaoNfe.ambiente) &&
        Objects.equals(this.ufAutor, distribuicaoNfe.ufAutor) &&
        Objects.equals(this.tipoConsulta, distribuicaoNfe.tipoConsulta) &&
        Objects.equals(this.distNsu, distribuicaoNfe.distNsu) &&
        Objects.equals(this.consNsu, distribuicaoNfe.consNsu) &&
        Objects.equals(this.consChave, distribuicaoNfe.consChave) &&
        Objects.equals(this.codigoStatus, distribuicaoNfe.codigoStatus) &&
        Objects.equals(this.motivoStatus, distribuicaoNfe.motivoStatus) &&
        Objects.equals(this.dataHoraResposta, distribuicaoNfe.dataHoraResposta) &&
        Objects.equals(this.ultimoNsu, distribuicaoNfe.ultimoNsu) &&
        Objects.equals(this.maxNsu, distribuicaoNfe.maxNsu) &&
        Objects.equals(this.documentos, distribuicaoNfe.documentos);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, status, ambiente, ufAutor, tipoConsulta, distNsu, consNsu, consChave, codigoStatus, motivoStatus, dataHoraResposta, ultimoNsu, maxNsu, documentos);
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
    sb.append("class DistribuicaoNfe {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    ambiente: ").append(toIndentedString(ambiente)).append("\n");
    sb.append("    ufAutor: ").append(toIndentedString(ufAutor)).append("\n");
    sb.append("    tipoConsulta: ").append(toIndentedString(tipoConsulta)).append("\n");
    sb.append("    distNsu: ").append(toIndentedString(distNsu)).append("\n");
    sb.append("    consNsu: ").append(toIndentedString(consNsu)).append("\n");
    sb.append("    consChave: ").append(toIndentedString(consChave)).append("\n");
    sb.append("    codigoStatus: ").append(toIndentedString(codigoStatus)).append("\n");
    sb.append("    motivoStatus: ").append(toIndentedString(motivoStatus)).append("\n");
    sb.append("    dataHoraResposta: ").append(toIndentedString(dataHoraResposta)).append("\n");
    sb.append("    ultimoNsu: ").append(toIndentedString(ultimoNsu)).append("\n");
    sb.append("    maxNsu: ").append(toIndentedString(maxNsu)).append("\n");
    sb.append("    documentos: ").append(toIndentedString(documentos)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("ambiente");
    openapiFields.add("uf_autor");
    openapiFields.add("tipo_consulta");
    openapiFields.add("dist_nsu");
    openapiFields.add("cons_nsu");
    openapiFields.add("cons_chave");
    openapiFields.add("codigo_status");
    openapiFields.add("motivo_status");
    openapiFields.add("data_hora_resposta");
    openapiFields.add("ultimo_nsu");
    openapiFields.add("max_nsu");
    openapiFields.add("documentos");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("ambiente");
    openapiRequiredFields.add("tipo_consulta");
    openapiRequiredFields.add("codigo_status");
    openapiRequiredFields.add("data_hora_resposta");
    openapiRequiredFields.add("ultimo_nsu");
    openapiRequiredFields.add("max_nsu");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DistribuicaoNfe
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DistribuicaoNfe.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DistribuicaoNfe is not found in the empty JSON string", DistribuicaoNfe.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DistribuicaoNfe.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DistribuicaoNfe` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DistribuicaoNfe.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `status`
      StatusEnum.validateJsonElement(jsonObj.get("status"));
      if (!jsonObj.get("ambiente").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ambiente` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ambiente").toString()));
      }
      // validate the required field `ambiente`
      AmbienteEnum.validateJsonElement(jsonObj.get("ambiente"));
      if ((jsonObj.get("uf_autor") != null && !jsonObj.get("uf_autor").isJsonNull()) && !jsonObj.get("uf_autor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uf_autor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uf_autor").toString()));
      }
      if (!jsonObj.get("tipo_consulta").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tipo_consulta` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tipo_consulta").toString()));
      }
      // validate the required field `tipo_consulta`
      TipoConsultaEnum.validateJsonElement(jsonObj.get("tipo_consulta"));
      if ((jsonObj.get("cons_chave") != null && !jsonObj.get("cons_chave").isJsonNull()) && !jsonObj.get("cons_chave").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cons_chave` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cons_chave").toString()));
      }
      if ((jsonObj.get("motivo_status") != null && !jsonObj.get("motivo_status").isJsonNull()) && !jsonObj.get("motivo_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `motivo_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("motivo_status").toString()));
      }
      if (jsonObj.get("documentos") != null && !jsonObj.get("documentos").isJsonNull()) {
        JsonArray jsonArraydocumentos = jsonObj.getAsJsonArray("documentos");
        if (jsonArraydocumentos != null) {
          // ensure the json data is an array
          if (!jsonObj.get("documentos").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `documentos` to be an array in the JSON string but got `%s`", jsonObj.get("documentos").toString()));
          }

          // validate the optional field `documentos` (array)
          for (int i = 0; i < jsonArraydocumentos.size(); i++) {
            DistribuicaoNfeDocumento.validateJsonElement(jsonArraydocumentos.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DistribuicaoNfe.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DistribuicaoNfe' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DistribuicaoNfe> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DistribuicaoNfe.class));

       return (TypeAdapter<T>) new TypeAdapter<DistribuicaoNfe>() {
           @Override
           public void write(JsonWriter out, DistribuicaoNfe value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DistribuicaoNfe read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DistribuicaoNfe given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DistribuicaoNfe
   * @throws IOException if the JSON string is invalid with respect to DistribuicaoNfe
   */
  public static DistribuicaoNfe fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DistribuicaoNfe.class);
  }

  /**
   * Convert an instance of DistribuicaoNfe to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

