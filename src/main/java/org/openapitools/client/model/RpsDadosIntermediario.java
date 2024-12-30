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
import java.util.Arrays;

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
 * RpsDadosIntermediario
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class RpsDadosIntermediario {
  public static final String SERIALIZED_NAME_CPF_CNPJ = "cpf_cnpj";
  @SerializedName(SERIALIZED_NAME_CPF_CNPJ)
  @javax.annotation.Nullable
  private String cpfCnpj;

  public static final String SERIALIZED_NAME_NOME_RAZAO_SOCIAL = "nome_razao_social";
  @SerializedName(SERIALIZED_NAME_NOME_RAZAO_SOCIAL)
  @javax.annotation.Nullable
  private String nomeRazaoSocial;

  public static final String SERIALIZED_NAME_INSCRICAO_MUNICIPAL = "inscricao_municipal";
  @SerializedName(SERIALIZED_NAME_INSCRICAO_MUNICIPAL)
  @javax.annotation.Nullable
  private String inscricaoMunicipal;

  public RpsDadosIntermediario() {
  }

  public RpsDadosIntermediario cpfCnpj(@javax.annotation.Nullable String cpfCnpj) {
    this.cpfCnpj = cpfCnpj;
    return this;
  }

  /**
   * Get cpfCnpj
   * @return cpfCnpj
   */
  @javax.annotation.Nullable
  public String getCpfCnpj() {
    return cpfCnpj;
  }

  public void setCpfCnpj(@javax.annotation.Nullable String cpfCnpj) {
    this.cpfCnpj = cpfCnpj;
  }


  public RpsDadosIntermediario nomeRazaoSocial(@javax.annotation.Nullable String nomeRazaoSocial) {
    this.nomeRazaoSocial = nomeRazaoSocial;
    return this;
  }

  /**
   * Get nomeRazaoSocial
   * @return nomeRazaoSocial
   */
  @javax.annotation.Nullable
  public String getNomeRazaoSocial() {
    return nomeRazaoSocial;
  }

  public void setNomeRazaoSocial(@javax.annotation.Nullable String nomeRazaoSocial) {
    this.nomeRazaoSocial = nomeRazaoSocial;
  }


  public RpsDadosIntermediario inscricaoMunicipal(@javax.annotation.Nullable String inscricaoMunicipal) {
    this.inscricaoMunicipal = inscricaoMunicipal;
    return this;
  }

  /**
   * Get inscricaoMunicipal
   * @return inscricaoMunicipal
   */
  @javax.annotation.Nullable
  public String getInscricaoMunicipal() {
    return inscricaoMunicipal;
  }

  public void setInscricaoMunicipal(@javax.annotation.Nullable String inscricaoMunicipal) {
    this.inscricaoMunicipal = inscricaoMunicipal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RpsDadosIntermediario rpsDadosIntermediario = (RpsDadosIntermediario) o;
    return Objects.equals(this.cpfCnpj, rpsDadosIntermediario.cpfCnpj) &&
        Objects.equals(this.nomeRazaoSocial, rpsDadosIntermediario.nomeRazaoSocial) &&
        Objects.equals(this.inscricaoMunicipal, rpsDadosIntermediario.inscricaoMunicipal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpfCnpj, nomeRazaoSocial, inscricaoMunicipal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RpsDadosIntermediario {\n");
    sb.append("    cpfCnpj: ").append(toIndentedString(cpfCnpj)).append("\n");
    sb.append("    nomeRazaoSocial: ").append(toIndentedString(nomeRazaoSocial)).append("\n");
    sb.append("    inscricaoMunicipal: ").append(toIndentedString(inscricaoMunicipal)).append("\n");
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
    openapiFields.add("cpf_cnpj");
    openapiFields.add("nome_razao_social");
    openapiFields.add("inscricao_municipal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RpsDadosIntermediario
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RpsDadosIntermediario.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RpsDadosIntermediario is not found in the empty JSON string", RpsDadosIntermediario.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RpsDadosIntermediario.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RpsDadosIntermediario` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cpf_cnpj") != null && !jsonObj.get("cpf_cnpj").isJsonNull()) && !jsonObj.get("cpf_cnpj").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cpf_cnpj` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cpf_cnpj").toString()));
      }
      if ((jsonObj.get("nome_razao_social") != null && !jsonObj.get("nome_razao_social").isJsonNull()) && !jsonObj.get("nome_razao_social").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nome_razao_social` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nome_razao_social").toString()));
      }
      if ((jsonObj.get("inscricao_municipal") != null && !jsonObj.get("inscricao_municipal").isJsonNull()) && !jsonObj.get("inscricao_municipal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inscricao_municipal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inscricao_municipal").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RpsDadosIntermediario.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RpsDadosIntermediario' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RpsDadosIntermediario> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RpsDadosIntermediario.class));

       return (TypeAdapter<T>) new TypeAdapter<RpsDadosIntermediario>() {
           @Override
           public void write(JsonWriter out, RpsDadosIntermediario value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RpsDadosIntermediario read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RpsDadosIntermediario given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RpsDadosIntermediario
   * @throws IOException if the JSON string is invalid with respect to RpsDadosIntermediario
   */
  public static RpsDadosIntermediario fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RpsDadosIntermediario.class);
  }

  /**
   * Convert an instance of RpsDadosIntermediario to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

