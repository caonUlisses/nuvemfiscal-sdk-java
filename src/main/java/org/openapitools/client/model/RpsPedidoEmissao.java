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
import org.openapitools.client.model.RpsDadosConstrucaoCivil;
import org.openapitools.client.model.RpsDadosIntermediario;
import org.openapitools.client.model.RpsDadosServico;
import org.openapitools.client.model.RpsDadosTomador;
import org.openapitools.client.model.RpsIdentificacaoPrestador;

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
 * RpsPedidoEmissao
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class RpsPedidoEmissao {
  public static final String SERIALIZED_NAME_REFERENCIA = "referencia";
  @SerializedName(SERIALIZED_NAME_REFERENCIA)
  @javax.annotation.Nullable
  private String referencia;

  public static final String SERIALIZED_NAME_DATA_EMISSAO = "data_emissao";
  @SerializedName(SERIALIZED_NAME_DATA_EMISSAO)
  @javax.annotation.Nullable
  private OffsetDateTime dataEmissao;

  public static final String SERIALIZED_NAME_COMPETENCIA = "competencia";
  @SerializedName(SERIALIZED_NAME_COMPETENCIA)
  @javax.annotation.Nullable
  private OffsetDateTime competencia;

  public static final String SERIALIZED_NAME_NATUREZA_TRIBUTACAO = "natureza_tributacao";
  @SerializedName(SERIALIZED_NAME_NATUREZA_TRIBUTACAO)
  @javax.annotation.Nullable
  private Integer naturezaTributacao;

  public static final String SERIALIZED_NAME_PRESTADOR = "prestador";
  @SerializedName(SERIALIZED_NAME_PRESTADOR)
  @javax.annotation.Nonnull
  private RpsIdentificacaoPrestador prestador;

  public static final String SERIALIZED_NAME_TOMADOR = "tomador";
  @SerializedName(SERIALIZED_NAME_TOMADOR)
  @javax.annotation.Nonnull
  private RpsDadosTomador tomador;

  public static final String SERIALIZED_NAME_INTERMEDIARIO = "intermediario";
  @SerializedName(SERIALIZED_NAME_INTERMEDIARIO)
  @javax.annotation.Nullable
  private RpsDadosIntermediario intermediario;

  public static final String SERIALIZED_NAME_CONSTRUCAO_CIVIL = "construcao_civil";
  @SerializedName(SERIALIZED_NAME_CONSTRUCAO_CIVIL)
  @javax.annotation.Nullable
  private RpsDadosConstrucaoCivil construcaoCivil;

  public static final String SERIALIZED_NAME_SERVICOS = "servicos";
  @SerializedName(SERIALIZED_NAME_SERVICOS)
  @javax.annotation.Nonnull
  private List<RpsDadosServico> servicos = new ArrayList<>();

  public static final String SERIALIZED_NAME_OUTRAS_INFORMACOES = "outras_informacoes";
  @SerializedName(SERIALIZED_NAME_OUTRAS_INFORMACOES)
  @javax.annotation.Nullable
  private String outrasInformacoes;

  public RpsPedidoEmissao() {
  }

  public RpsPedidoEmissao referencia(@javax.annotation.Nullable String referencia) {
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


  public RpsPedidoEmissao dataEmissao(@javax.annotation.Nullable OffsetDateTime dataEmissao) {
    this.dataEmissao = dataEmissao;
    return this;
  }

  /**
   * Data e Hora de Emissão do RPS, no formato AAAA-MM-DDTHH:MM:SSTZD.  Caso não informado, será considerada a data/hora da requisição à API da Nuvem Fiscal.
   * @return dataEmissao
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDataEmissao() {
    return dataEmissao;
  }

  public void setDataEmissao(@javax.annotation.Nullable OffsetDateTime dataEmissao) {
    this.dataEmissao = dataEmissao;
  }


  public RpsPedidoEmissao competencia(@javax.annotation.Nullable OffsetDateTime competencia) {
    this.competencia = competencia;
    return this;
  }

  /**
   * Competência do RPS, no formato AAAA-MM-DD.  Caso não informado, será considerada a data da requisição à API da Nuvem Fiscal.
   * @return competencia
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCompetencia() {
    return competencia;
  }

  public void setCompetencia(@javax.annotation.Nullable OffsetDateTime competencia) {
    this.competencia = competencia;
  }


  public RpsPedidoEmissao naturezaTributacao(@javax.annotation.Nullable Integer naturezaTributacao) {
    this.naturezaTributacao = naturezaTributacao;
    return this;
  }

  /**
   * Natureza da tributação:  * 1 - Simples Nacional;  * 2 - Fixo;  * 3 - Depósito em juízo;  * 4 - Exigibilidade suspensa por decisão judicial;  * 5 - Exigibilidade suspensa por procedimento administrativo;  * 6 - Isenção parcial.
   * @return naturezaTributacao
   */
  @javax.annotation.Nullable
  public Integer getNaturezaTributacao() {
    return naturezaTributacao;
  }

  public void setNaturezaTributacao(@javax.annotation.Nullable Integer naturezaTributacao) {
    this.naturezaTributacao = naturezaTributacao;
  }


  public RpsPedidoEmissao prestador(@javax.annotation.Nonnull RpsIdentificacaoPrestador prestador) {
    this.prestador = prestador;
    return this;
  }

  /**
   * Get prestador
   * @return prestador
   */
  @javax.annotation.Nonnull
  public RpsIdentificacaoPrestador getPrestador() {
    return prestador;
  }

  public void setPrestador(@javax.annotation.Nonnull RpsIdentificacaoPrestador prestador) {
    this.prestador = prestador;
  }


  public RpsPedidoEmissao tomador(@javax.annotation.Nonnull RpsDadosTomador tomador) {
    this.tomador = tomador;
    return this;
  }

  /**
   * Get tomador
   * @return tomador
   */
  @javax.annotation.Nonnull
  public RpsDadosTomador getTomador() {
    return tomador;
  }

  public void setTomador(@javax.annotation.Nonnull RpsDadosTomador tomador) {
    this.tomador = tomador;
  }


  public RpsPedidoEmissao intermediario(@javax.annotation.Nullable RpsDadosIntermediario intermediario) {
    this.intermediario = intermediario;
    return this;
  }

  /**
   * Get intermediario
   * @return intermediario
   */
  @javax.annotation.Nullable
  public RpsDadosIntermediario getIntermediario() {
    return intermediario;
  }

  public void setIntermediario(@javax.annotation.Nullable RpsDadosIntermediario intermediario) {
    this.intermediario = intermediario;
  }


  public RpsPedidoEmissao construcaoCivil(@javax.annotation.Nullable RpsDadosConstrucaoCivil construcaoCivil) {
    this.construcaoCivil = construcaoCivil;
    return this;
  }

  /**
   * Get construcaoCivil
   * @return construcaoCivil
   */
  @javax.annotation.Nullable
  public RpsDadosConstrucaoCivil getConstrucaoCivil() {
    return construcaoCivil;
  }

  public void setConstrucaoCivil(@javax.annotation.Nullable RpsDadosConstrucaoCivil construcaoCivil) {
    this.construcaoCivil = construcaoCivil;
  }


  public RpsPedidoEmissao servicos(@javax.annotation.Nonnull List<RpsDadosServico> servicos) {
    this.servicos = servicos;
    return this;
  }

  public RpsPedidoEmissao addServicosItem(RpsDadosServico servicosItem) {
    if (this.servicos == null) {
      this.servicos = new ArrayList<>();
    }
    this.servicos.add(servicosItem);
    return this;
  }

  /**
   * Get servicos
   * @return servicos
   */
  @javax.annotation.Nonnull
  public List<RpsDadosServico> getServicos() {
    return servicos;
  }

  public void setServicos(@javax.annotation.Nonnull List<RpsDadosServico> servicos) {
    this.servicos = servicos;
  }


  public RpsPedidoEmissao outrasInformacoes(@javax.annotation.Nullable String outrasInformacoes) {
    this.outrasInformacoes = outrasInformacoes;
    return this;
  }

  /**
   * Informações adicionais ao documento.
   * @return outrasInformacoes
   */
  @javax.annotation.Nullable
  public String getOutrasInformacoes() {
    return outrasInformacoes;
  }

  public void setOutrasInformacoes(@javax.annotation.Nullable String outrasInformacoes) {
    this.outrasInformacoes = outrasInformacoes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RpsPedidoEmissao rpsPedidoEmissao = (RpsPedidoEmissao) o;
    return Objects.equals(this.referencia, rpsPedidoEmissao.referencia) &&
        Objects.equals(this.dataEmissao, rpsPedidoEmissao.dataEmissao) &&
        Objects.equals(this.competencia, rpsPedidoEmissao.competencia) &&
        Objects.equals(this.naturezaTributacao, rpsPedidoEmissao.naturezaTributacao) &&
        Objects.equals(this.prestador, rpsPedidoEmissao.prestador) &&
        Objects.equals(this.tomador, rpsPedidoEmissao.tomador) &&
        Objects.equals(this.intermediario, rpsPedidoEmissao.intermediario) &&
        Objects.equals(this.construcaoCivil, rpsPedidoEmissao.construcaoCivil) &&
        Objects.equals(this.servicos, rpsPedidoEmissao.servicos) &&
        Objects.equals(this.outrasInformacoes, rpsPedidoEmissao.outrasInformacoes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referencia, dataEmissao, competencia, naturezaTributacao, prestador, tomador, intermediario, construcaoCivil, servicos, outrasInformacoes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RpsPedidoEmissao {\n");
    sb.append("    referencia: ").append(toIndentedString(referencia)).append("\n");
    sb.append("    dataEmissao: ").append(toIndentedString(dataEmissao)).append("\n");
    sb.append("    competencia: ").append(toIndentedString(competencia)).append("\n");
    sb.append("    naturezaTributacao: ").append(toIndentedString(naturezaTributacao)).append("\n");
    sb.append("    prestador: ").append(toIndentedString(prestador)).append("\n");
    sb.append("    tomador: ").append(toIndentedString(tomador)).append("\n");
    sb.append("    intermediario: ").append(toIndentedString(intermediario)).append("\n");
    sb.append("    construcaoCivil: ").append(toIndentedString(construcaoCivil)).append("\n");
    sb.append("    servicos: ").append(toIndentedString(servicos)).append("\n");
    sb.append("    outrasInformacoes: ").append(toIndentedString(outrasInformacoes)).append("\n");
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
    openapiFields.add("referencia");
    openapiFields.add("data_emissao");
    openapiFields.add("competencia");
    openapiFields.add("natureza_tributacao");
    openapiFields.add("prestador");
    openapiFields.add("tomador");
    openapiFields.add("intermediario");
    openapiFields.add("construcao_civil");
    openapiFields.add("servicos");
    openapiFields.add("outras_informacoes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("prestador");
    openapiRequiredFields.add("tomador");
    openapiRequiredFields.add("servicos");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RpsPedidoEmissao
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RpsPedidoEmissao.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RpsPedidoEmissao is not found in the empty JSON string", RpsPedidoEmissao.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RpsPedidoEmissao.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RpsPedidoEmissao` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RpsPedidoEmissao.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("referencia") != null && !jsonObj.get("referencia").isJsonNull()) && !jsonObj.get("referencia").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referencia` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referencia").toString()));
      }
      // validate the required field `prestador`
      RpsIdentificacaoPrestador.validateJsonElement(jsonObj.get("prestador"));
      // validate the required field `tomador`
      RpsDadosTomador.validateJsonElement(jsonObj.get("tomador"));
      // validate the optional field `intermediario`
      if (jsonObj.get("intermediario") != null && !jsonObj.get("intermediario").isJsonNull()) {
        RpsDadosIntermediario.validateJsonElement(jsonObj.get("intermediario"));
      }
      // validate the optional field `construcao_civil`
      if (jsonObj.get("construcao_civil") != null && !jsonObj.get("construcao_civil").isJsonNull()) {
        RpsDadosConstrucaoCivil.validateJsonElement(jsonObj.get("construcao_civil"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("servicos").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `servicos` to be an array in the JSON string but got `%s`", jsonObj.get("servicos").toString()));
      }

      JsonArray jsonArrayservicos = jsonObj.getAsJsonArray("servicos");
      // validate the required field `servicos` (array)
      for (int i = 0; i < jsonArrayservicos.size(); i++) {
        RpsDadosServico.validateJsonElement(jsonArrayservicos.get(i));
      };
      if ((jsonObj.get("outras_informacoes") != null && !jsonObj.get("outras_informacoes").isJsonNull()) && !jsonObj.get("outras_informacoes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outras_informacoes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outras_informacoes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RpsPedidoEmissao.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RpsPedidoEmissao' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RpsPedidoEmissao> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RpsPedidoEmissao.class));

       return (TypeAdapter<T>) new TypeAdapter<RpsPedidoEmissao>() {
           @Override
           public void write(JsonWriter out, RpsPedidoEmissao value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RpsPedidoEmissao read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RpsPedidoEmissao given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RpsPedidoEmissao
   * @throws IOException if the JSON string is invalid with respect to RpsPedidoEmissao
   */
  public static RpsPedidoEmissao fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RpsPedidoEmissao.class);
  }

  /**
   * Convert an instance of RpsPedidoEmissao to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
