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

import io.github.com.caonulisses.nuvemfiscalsdk.JSON;

/**
 * RpsIdentificacao
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class RpsIdentificacao {
  public static final String SERIALIZED_NAME_NUMERO = "numero";
  @SerializedName(SERIALIZED_NAME_NUMERO)
  @javax.annotation.Nullable
  private String numero;

  public static final String SERIALIZED_NAME_SERIE = "serie";
  @SerializedName(SERIALIZED_NAME_SERIE)
  @javax.annotation.Nullable
  private String serie;

  public static final String SERIALIZED_NAME_TIPO = "tipo";
  @SerializedName(SERIALIZED_NAME_TIPO)
  @javax.annotation.Nullable
  private String tipo;

  public RpsIdentificacao() {
  }

  public RpsIdentificacao numero(@javax.annotation.Nullable String numero) {
    this.numero = numero;
    return this;
  }

  /**
   * Get numero
   * @return numero
   */
  @javax.annotation.Nullable
  public String getNumero() {
    return numero;
  }

  public void setNumero(@javax.annotation.Nullable String numero) {
    this.numero = numero;
  }


  public RpsIdentificacao serie(@javax.annotation.Nullable String serie) {
    this.serie = serie;
    return this;
  }

  /**
   * Get serie
   * @return serie
   */
  @javax.annotation.Nullable
  public String getSerie() {
    return serie;
  }

  public void setSerie(@javax.annotation.Nullable String serie) {
    this.serie = serie;
  }


  public RpsIdentificacao tipo(@javax.annotation.Nullable String tipo) {
    this.tipo = tipo;
    return this;
  }

  /**
   * Get tipo
   * @return tipo
   */
  @javax.annotation.Nullable
  public String getTipo() {
    return tipo;
  }

  public void setTipo(@javax.annotation.Nullable String tipo) {
    this.tipo = tipo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RpsIdentificacao rpsIdentificacao = (RpsIdentificacao) o;
    return Objects.equals(this.numero, rpsIdentificacao.numero) &&
        Objects.equals(this.serie, rpsIdentificacao.serie) &&
        Objects.equals(this.tipo, rpsIdentificacao.tipo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numero, serie, tipo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RpsIdentificacao {\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    serie: ").append(toIndentedString(serie)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
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
    openapiFields.add("numero");
    openapiFields.add("serie");
    openapiFields.add("tipo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RpsIdentificacao
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RpsIdentificacao.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RpsIdentificacao is not found in the empty JSON string", RpsIdentificacao.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RpsIdentificacao.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RpsIdentificacao` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("numero") != null && !jsonObj.get("numero").isJsonNull()) && !jsonObj.get("numero").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `numero` to be a primitive type in the JSON string but got `%s`", jsonObj.get("numero").toString()));
      }
      if ((jsonObj.get("serie") != null && !jsonObj.get("serie").isJsonNull()) && !jsonObj.get("serie").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serie` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serie").toString()));
      }
      if ((jsonObj.get("tipo") != null && !jsonObj.get("tipo").isJsonNull()) && !jsonObj.get("tipo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tipo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tipo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RpsIdentificacao.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RpsIdentificacao' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RpsIdentificacao> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RpsIdentificacao.class));

       return (TypeAdapter<T>) new TypeAdapter<RpsIdentificacao>() {
           @Override
           public void write(JsonWriter out, RpsIdentificacao value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RpsIdentificacao read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RpsIdentificacao given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RpsIdentificacao
   * @throws IOException if the JSON string is invalid with respect to RpsIdentificacao
   */
  public static RpsIdentificacao fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RpsIdentificacao.class);
  }

  /**
   * Convert an instance of RpsIdentificacao to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

