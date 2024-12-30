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
 * Atividade econômica principal do estabelecimento.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class CnpjCnae {
  public static final String SERIALIZED_NAME_CODIGO = "codigo";
  @SerializedName(SERIALIZED_NAME_CODIGO)
  @javax.annotation.Nullable
  private String codigo;

  public static final String SERIALIZED_NAME_DESCRICAO = "descricao";
  @SerializedName(SERIALIZED_NAME_DESCRICAO)
  @javax.annotation.Nullable
  private String descricao;

  public CnpjCnae() {
  }

  public CnpjCnae codigo(@javax.annotation.Nullable String codigo) {
    this.codigo = codigo;
    return this;
  }

  /**
   * Código da atividade econômica.
   * @return codigo
   */
  @javax.annotation.Nullable
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(@javax.annotation.Nullable String codigo) {
    this.codigo = codigo;
  }


  public CnpjCnae descricao(@javax.annotation.Nullable String descricao) {
    this.descricao = descricao;
    return this;
  }

  /**
   * Nome da atividade econômica.
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
    CnpjCnae cnpjCnae = (CnpjCnae) o;
    return Objects.equals(this.codigo, cnpjCnae.codigo) &&
        Objects.equals(this.descricao, cnpjCnae.descricao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, descricao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CnpjCnae {\n");
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
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
    openapiFields.add("codigo");
    openapiFields.add("descricao");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CnpjCnae
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CnpjCnae.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CnpjCnae is not found in the empty JSON string", CnpjCnae.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CnpjCnae.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CnpjCnae` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("codigo") != null && !jsonObj.get("codigo").isJsonNull()) && !jsonObj.get("codigo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codigo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codigo").toString()));
      }
      if ((jsonObj.get("descricao") != null && !jsonObj.get("descricao").isJsonNull()) && !jsonObj.get("descricao").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descricao` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descricao").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CnpjCnae.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CnpjCnae' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CnpjCnae> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CnpjCnae.class));

       return (TypeAdapter<T>) new TypeAdapter<CnpjCnae>() {
           @Override
           public void write(JsonWriter out, CnpjCnae value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CnpjCnae read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CnpjCnae given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CnpjCnae
   * @throws IOException if the JSON string is invalid with respect to CnpjCnae
   */
  public static CnpjCnae fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CnpjCnae.class);
  }

  /**
   * Convert an instance of CnpjCnae to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

