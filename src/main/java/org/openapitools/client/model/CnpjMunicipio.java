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
 * Município de jurisdição onde se encontra o estabelecimento.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class CnpjMunicipio {
  public static final String SERIALIZED_NAME_CODIGO_TOM = "codigo_tom";
  @SerializedName(SERIALIZED_NAME_CODIGO_TOM)
  @javax.annotation.Nullable
  private String codigoTom;

  public static final String SERIALIZED_NAME_CODIGO_IBGE = "codigo_ibge";
  @SerializedName(SERIALIZED_NAME_CODIGO_IBGE)
  @javax.annotation.Nullable
  private String codigoIbge;

  public static final String SERIALIZED_NAME_DESCRICAO = "descricao";
  @SerializedName(SERIALIZED_NAME_DESCRICAO)
  @javax.annotation.Nullable
  private String descricao;

  public CnpjMunicipio() {
  }

  public CnpjMunicipio codigoTom(@javax.annotation.Nullable String codigoTom) {
    this.codigoTom = codigoTom;
    return this;
  }

  /**
   * Código TOM do município.
   * @return codigoTom
   */
  @javax.annotation.Nullable
  public String getCodigoTom() {
    return codigoTom;
  }

  public void setCodigoTom(@javax.annotation.Nullable String codigoTom) {
    this.codigoTom = codigoTom;
  }


  public CnpjMunicipio codigoIbge(@javax.annotation.Nullable String codigoIbge) {
    this.codigoIbge = codigoIbge;
    return this;
  }

  /**
   * Código IBGE do município.
   * @return codigoIbge
   */
  @javax.annotation.Nullable
  public String getCodigoIbge() {
    return codigoIbge;
  }

  public void setCodigoIbge(@javax.annotation.Nullable String codigoIbge) {
    this.codigoIbge = codigoIbge;
  }


  public CnpjMunicipio descricao(@javax.annotation.Nullable String descricao) {
    this.descricao = descricao;
    return this;
  }

  /**
   * Nome do município.
   * @return descricao
   */
  @javax.annotation.Nullable
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(@javax.annotation.Nullable String descricao) {
    this.descricao = descricao;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CnpjMunicipio cnpjMunicipio = (CnpjMunicipio) o;
    return Objects.equals(this.codigoTom, cnpjMunicipio.codigoTom) &&
        Objects.equals(this.codigoIbge, cnpjMunicipio.codigoIbge) &&
        Objects.equals(this.descricao, cnpjMunicipio.descricao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigoTom, codigoIbge, descricao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CnpjMunicipio {\n");
    sb.append("    codigoTom: ").append(toIndentedString(codigoTom)).append("\n");
    sb.append("    codigoIbge: ").append(toIndentedString(codigoIbge)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
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
    openapiFields.add("codigo_tom");
    openapiFields.add("codigo_ibge");
    openapiFields.add("descricao");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CnpjMunicipio
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CnpjMunicipio.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CnpjMunicipio is not found in the empty JSON string", CnpjMunicipio.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CnpjMunicipio.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CnpjMunicipio` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("codigo_tom") != null && !jsonObj.get("codigo_tom").isJsonNull()) && !jsonObj.get("codigo_tom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codigo_tom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codigo_tom").toString()));
      }
      if ((jsonObj.get("codigo_ibge") != null && !jsonObj.get("codigo_ibge").isJsonNull()) && !jsonObj.get("codigo_ibge").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codigo_ibge` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codigo_ibge").toString()));
      }
      if ((jsonObj.get("descricao") != null && !jsonObj.get("descricao").isJsonNull()) && !jsonObj.get("descricao").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descricao` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descricao").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CnpjMunicipio.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CnpjMunicipio' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CnpjMunicipio> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CnpjMunicipio.class));

       return (TypeAdapter<T>) new TypeAdapter<CnpjMunicipio>() {
           @Override
           public void write(JsonWriter out, CnpjMunicipio value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CnpjMunicipio read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CnpjMunicipio given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CnpjMunicipio
   * @throws IOException if the JSON string is invalid with respect to CnpjMunicipio
   */
  public static CnpjMunicipio fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CnpjMunicipio.class);
  }

  /**
   * Convert an instance of CnpjMunicipio to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
