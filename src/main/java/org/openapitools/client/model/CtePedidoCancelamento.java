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
 * CtePedidoCancelamento
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class CtePedidoCancelamento {
  public static final String SERIALIZED_NAME_JUSTIFICATIVA = "justificativa";
  @SerializedName(SERIALIZED_NAME_JUSTIFICATIVA)
  @javax.annotation.Nullable
  private String justificativa;

  public CtePedidoCancelamento() {
  }

  public CtePedidoCancelamento justificativa(@javax.annotation.Nullable String justificativa) {
    this.justificativa = justificativa;
    return this;
  }

  /**
   * Justificativa para o cancelamento. Preencheremos automaticamente, caso esteja em branco.
   * @return justificativa
   */
  @javax.annotation.Nullable
  public String getJustificativa() {
    return justificativa;
  }

  public void setJustificativa(@javax.annotation.Nullable String justificativa) {
    this.justificativa = justificativa;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CtePedidoCancelamento ctePedidoCancelamento = (CtePedidoCancelamento) o;
    return Objects.equals(this.justificativa, ctePedidoCancelamento.justificativa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(justificativa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CtePedidoCancelamento {\n");
    sb.append("    justificativa: ").append(toIndentedString(justificativa)).append("\n");
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
    openapiFields.add("justificativa");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CtePedidoCancelamento
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CtePedidoCancelamento.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CtePedidoCancelamento is not found in the empty JSON string", CtePedidoCancelamento.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CtePedidoCancelamento.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CtePedidoCancelamento` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("justificativa") != null && !jsonObj.get("justificativa").isJsonNull()) && !jsonObj.get("justificativa").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `justificativa` to be a primitive type in the JSON string but got `%s`", jsonObj.get("justificativa").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CtePedidoCancelamento.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CtePedidoCancelamento' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CtePedidoCancelamento> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CtePedidoCancelamento.class));

       return (TypeAdapter<T>) new TypeAdapter<CtePedidoCancelamento>() {
           @Override
           public void write(JsonWriter out, CtePedidoCancelamento value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CtePedidoCancelamento read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CtePedidoCancelamento given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CtePedidoCancelamento
   * @throws IOException if the JSON string is invalid with respect to CtePedidoCancelamento
   */
  public static CtePedidoCancelamento fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CtePedidoCancelamento.class);
  }

  /**
   * Convert an instance of CtePedidoCancelamento to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

