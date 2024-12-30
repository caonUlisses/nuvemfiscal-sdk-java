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
 * NfsePedidoCancelamento
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfsePedidoCancelamento {
  public static final String SERIALIZED_NAME_CODIGO = "codigo";
  @SerializedName(SERIALIZED_NAME_CODIGO)
  @javax.annotation.Nullable
  private String codigo;

  public static final String SERIALIZED_NAME_MOTIVO = "motivo";
  @SerializedName(SERIALIZED_NAME_MOTIVO)
  @javax.annotation.Nullable
  private String motivo;

  public NfsePedidoCancelamento() {
  }

  public NfsePedidoCancelamento codigo(@javax.annotation.Nullable String codigo) {
    this.codigo = codigo;
    return this;
  }

  /**
   * Código de cancelamento, exigido por algumas prefeituras.  Para saber quais valores são aceitos, consulte o manual da prefeitura.
   * @return codigo
   */
  @javax.annotation.Nullable
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(@javax.annotation.Nullable String codigo) {
    this.codigo = codigo;
  }


  public NfsePedidoCancelamento motivo(@javax.annotation.Nullable String motivo) {
    this.motivo = motivo;
    return this;
  }

  /**
   * Motivo de cancelamento, exigido por algumas prefeituras.
   * @return motivo
   */
  @javax.annotation.Nullable
  public String getMotivo() {
    return motivo;
  }

  public void setMotivo(@javax.annotation.Nullable String motivo) {
    this.motivo = motivo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfsePedidoCancelamento nfsePedidoCancelamento = (NfsePedidoCancelamento) o;
    return Objects.equals(this.codigo, nfsePedidoCancelamento.codigo) &&
        Objects.equals(this.motivo, nfsePedidoCancelamento.motivo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, motivo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NfsePedidoCancelamento {\n");
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    motivo: ").append(toIndentedString(motivo)).append("\n");
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
    openapiFields.add("motivo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfsePedidoCancelamento
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfsePedidoCancelamento.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfsePedidoCancelamento is not found in the empty JSON string", NfsePedidoCancelamento.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfsePedidoCancelamento.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfsePedidoCancelamento` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("codigo") != null && !jsonObj.get("codigo").isJsonNull()) && !jsonObj.get("codigo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codigo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codigo").toString()));
      }
      if ((jsonObj.get("motivo") != null && !jsonObj.get("motivo").isJsonNull()) && !jsonObj.get("motivo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `motivo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("motivo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NfsePedidoCancelamento.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfsePedidoCancelamento' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfsePedidoCancelamento> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfsePedidoCancelamento.class));

       return (TypeAdapter<T>) new TypeAdapter<NfsePedidoCancelamento>() {
           @Override
           public void write(JsonWriter out, NfsePedidoCancelamento value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfsePedidoCancelamento read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfsePedidoCancelamento given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfsePedidoCancelamento
   * @throws IOException if the JSON string is invalid with respect to NfsePedidoCancelamento
   */
  public static NfsePedidoCancelamento fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfsePedidoCancelamento.class);
  }

  /**
   * Convert an instance of NfsePedidoCancelamento to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
