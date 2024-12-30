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
import org.openapitools.client.model.RpsDados;
import org.openapitools.client.model.RpsDadosConstrucaoCivil;
import org.openapitools.client.model.RpsDadosIntermediario;
import org.openapitools.client.model.RpsDadosPrestador;
import org.openapitools.client.model.RpsDadosServico;
import org.openapitools.client.model.RpsDadosTomador;

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
 * *Propriedade obsoleta. Não é mais retornada pela API.*
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class Rps {
  public static final String SERIALIZED_NAME_RPS = "rps";
  @SerializedName(SERIALIZED_NAME_RPS)
  @javax.annotation.Nullable
  private RpsDados rps;

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
  @javax.annotation.Nullable
  private RpsDadosPrestador prestador;

  public static final String SERIALIZED_NAME_TOMADOR = "tomador";
  @SerializedName(SERIALIZED_NAME_TOMADOR)
  @javax.annotation.Nullable
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

  public Rps() {
  }

  public Rps rps(@javax.annotation.Nullable RpsDados rps) {
    this.rps = rps;
    return this;
  }

  /**
   * Get rps
   * @return rps
   */
  @javax.annotation.Nullable
  public RpsDados getRps() {
    return rps;
  }

  public void setRps(@javax.annotation.Nullable RpsDados rps) {
    this.rps = rps;
  }


  public Rps competencia(@javax.annotation.Nullable OffsetDateTime competencia) {
    this.competencia = competencia;
    return this;
  }

  /**
   * Get competencia
   * @return competencia
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCompetencia() {
    return competencia;
  }

  public void setCompetencia(@javax.annotation.Nullable OffsetDateTime competencia) {
    this.competencia = competencia;
  }


  public Rps naturezaTributacao(@javax.annotation.Nullable Integer naturezaTributacao) {
    this.naturezaTributacao = naturezaTributacao;
    return this;
  }

  /**
   * Natureza da tributação  1 - Simples Nacional;  2 - Fixo;  3 - Depósito em juízo;  4 - Exigibilidade suspensa por decisão judicial;  5 - Exigibilidade suspensa por procedimento administrativo;  6 - Isenção parcial.
   * @return naturezaTributacao
   */
  @javax.annotation.Nullable
  public Integer getNaturezaTributacao() {
    return naturezaTributacao;
  }

  public void setNaturezaTributacao(@javax.annotation.Nullable Integer naturezaTributacao) {
    this.naturezaTributacao = naturezaTributacao;
  }


  public Rps prestador(@javax.annotation.Nullable RpsDadosPrestador prestador) {
    this.prestador = prestador;
    return this;
  }

  /**
   * Get prestador
   * @return prestador
   */
  @javax.annotation.Nullable
  public RpsDadosPrestador getPrestador() {
    return prestador;
  }

  public void setPrestador(@javax.annotation.Nullable RpsDadosPrestador prestador) {
    this.prestador = prestador;
  }


  public Rps tomador(@javax.annotation.Nullable RpsDadosTomador tomador) {
    this.tomador = tomador;
    return this;
  }

  /**
   * Get tomador
   * @return tomador
   */
  @javax.annotation.Nullable
  public RpsDadosTomador getTomador() {
    return tomador;
  }

  public void setTomador(@javax.annotation.Nullable RpsDadosTomador tomador) {
    this.tomador = tomador;
  }


  public Rps intermediario(@javax.annotation.Nullable RpsDadosIntermediario intermediario) {
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


  public Rps construcaoCivil(@javax.annotation.Nullable RpsDadosConstrucaoCivil construcaoCivil) {
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


  public Rps servicos(@javax.annotation.Nonnull List<RpsDadosServico> servicos) {
    this.servicos = servicos;
    return this;
  }

  public Rps addServicosItem(RpsDadosServico servicosItem) {
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


  public Rps outrasInformacoes(@javax.annotation.Nullable String outrasInformacoes) {
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
    Rps rps = (Rps) o;
    return Objects.equals(this.rps, rps.rps) &&
        Objects.equals(this.competencia, rps.competencia) &&
        Objects.equals(this.naturezaTributacao, rps.naturezaTributacao) &&
        Objects.equals(this.prestador, rps.prestador) &&
        Objects.equals(this.tomador, rps.tomador) &&
        Objects.equals(this.intermediario, rps.intermediario) &&
        Objects.equals(this.construcaoCivil, rps.construcaoCivil) &&
        Objects.equals(this.servicos, rps.servicos) &&
        Objects.equals(this.outrasInformacoes, rps.outrasInformacoes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rps, competencia, naturezaTributacao, prestador, tomador, intermediario, construcaoCivil, servicos, outrasInformacoes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rps {\n");
    sb.append("    rps: ").append(toIndentedString(rps)).append("\n");
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
    openapiFields.add("rps");
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
    openapiRequiredFields.add("servicos");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Rps
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Rps.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Rps is not found in the empty JSON string", Rps.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Rps.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Rps` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Rps.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `rps`
      if (jsonObj.get("rps") != null && !jsonObj.get("rps").isJsonNull()) {
        RpsDados.validateJsonElement(jsonObj.get("rps"));
      }
      // validate the optional field `prestador`
      if (jsonObj.get("prestador") != null && !jsonObj.get("prestador").isJsonNull()) {
        RpsDadosPrestador.validateJsonElement(jsonObj.get("prestador"));
      }
      // validate the optional field `tomador`
      if (jsonObj.get("tomador") != null && !jsonObj.get("tomador").isJsonNull()) {
        RpsDadosTomador.validateJsonElement(jsonObj.get("tomador"));
      }
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
       if (!Rps.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Rps' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Rps> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Rps.class));

       return (TypeAdapter<T>) new TypeAdapter<Rps>() {
           @Override
           public void write(JsonWriter out, Rps value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Rps read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Rps given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Rps
   * @throws IOException if the JSON string is invalid with respect to Rps
   */
  public static Rps fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Rps.class);
  }

  /**
   * Convert an instance of Rps to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

