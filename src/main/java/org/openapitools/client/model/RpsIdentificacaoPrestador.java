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
 * RpsIdentificacaoPrestador
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class RpsIdentificacaoPrestador {
  public static final String SERIALIZED_NAME_CPF_CNPJ = "cpf_cnpj";
  @SerializedName(SERIALIZED_NAME_CPF_CNPJ)
  @javax.annotation.Nonnull
  private String cpfCnpj;

  public RpsIdentificacaoPrestador() {
  }

  public RpsIdentificacaoPrestador cpfCnpj(@javax.annotation.Nonnull String cpfCnpj) {
    this.cpfCnpj = cpfCnpj;
    return this;
  }

  /**
   * CPF ou CNPJ do prestador.  Utilize o valor sem máscara.
   * @return cpfCnpj
   */
  @javax.annotation.Nonnull
  public String getCpfCnpj() {
    return cpfCnpj;
  }

  public void setCpfCnpj(@javax.annotation.Nonnull String cpfCnpj) {
    this.cpfCnpj = cpfCnpj;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RpsIdentificacaoPrestador rpsIdentificacaoPrestador = (RpsIdentificacaoPrestador) o;
    return Objects.equals(this.cpfCnpj, rpsIdentificacaoPrestador.cpfCnpj);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpfCnpj);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RpsIdentificacaoPrestador {\n");
    sb.append("    cpfCnpj: ").append(toIndentedString(cpfCnpj)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cpf_cnpj");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RpsIdentificacaoPrestador
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RpsIdentificacaoPrestador.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RpsIdentificacaoPrestador is not found in the empty JSON string", RpsIdentificacaoPrestador.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RpsIdentificacaoPrestador.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RpsIdentificacaoPrestador` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RpsIdentificacaoPrestador.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("cpf_cnpj").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cpf_cnpj` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cpf_cnpj").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RpsIdentificacaoPrestador.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RpsIdentificacaoPrestador' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RpsIdentificacaoPrestador> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RpsIdentificacaoPrestador.class));

       return (TypeAdapter<T>) new TypeAdapter<RpsIdentificacaoPrestador>() {
           @Override
           public void write(JsonWriter out, RpsIdentificacaoPrestador value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RpsIdentificacaoPrestador read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RpsIdentificacaoPrestador given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RpsIdentificacaoPrestador
   * @throws IOException if the JSON string is invalid with respect to RpsIdentificacaoPrestador
   */
  public static RpsIdentificacaoPrestador fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RpsIdentificacaoPrestador.class);
  }

  /**
   * Convert an instance of RpsIdentificacaoPrestador to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
