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
 * Campo de uso livre do contribuinte.  Informar o nome do campo no atributo xCampo e o conteúdo do campo no XTexto.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class CteSefazObsCont {
  public static final String SERIALIZED_NAME_X_CAMPO = "xCampo";
  @SerializedName(SERIALIZED_NAME_X_CAMPO)
  @javax.annotation.Nullable
  private String xCampo;

  public static final String SERIALIZED_NAME_X_TEXTO = "xTexto";
  @SerializedName(SERIALIZED_NAME_X_TEXTO)
  @javax.annotation.Nullable
  private String xTexto;

  public CteSefazObsCont() {
  }

  public CteSefazObsCont xCampo(@javax.annotation.Nullable String xCampo) {
    this.xCampo = xCampo;
    return this;
  }

  /**
   * Identificação do campo.
   * @return xCampo
   */
  @javax.annotation.Nullable
  public String getxCampo() {
    return xCampo;
  }

  public void setxCampo(@javax.annotation.Nullable String xCampo) {
    this.xCampo = xCampo;
  }


  public CteSefazObsCont xTexto(@javax.annotation.Nullable String xTexto) {
    this.xTexto = xTexto;
    return this;
  }

  /**
   * Conteúdo do campo.
   * @return xTexto
   */
  @javax.annotation.Nullable
  public String getxTexto() {
    return xTexto;
  }

  public void setxTexto(@javax.annotation.Nullable String xTexto) {
    this.xTexto = xTexto;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CteSefazObsCont cteSefazObsCont = (CteSefazObsCont) o;
    return Objects.equals(this.xCampo, cteSefazObsCont.xCampo) &&
        Objects.equals(this.xTexto, cteSefazObsCont.xTexto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xCampo, xTexto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CteSefazObsCont {\n");
    sb.append("    xCampo: ").append(toIndentedString(xCampo)).append("\n");
    sb.append("    xTexto: ").append(toIndentedString(xTexto)).append("\n");
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
    openapiFields.add("xCampo");
    openapiFields.add("xTexto");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("xCampo");
    openapiRequiredFields.add("xTexto");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CteSefazObsCont
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CteSefazObsCont.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CteSefazObsCont is not found in the empty JSON string", CteSefazObsCont.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CteSefazObsCont.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CteSefazObsCont` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CteSefazObsCont.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("xCampo") != null && !jsonObj.get("xCampo").isJsonNull()) && !jsonObj.get("xCampo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xCampo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xCampo").toString()));
      }
      if ((jsonObj.get("xTexto") != null && !jsonObj.get("xTexto").isJsonNull()) && !jsonObj.get("xTexto").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xTexto` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xTexto").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CteSefazObsCont.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CteSefazObsCont' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CteSefazObsCont> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CteSefazObsCont.class));

       return (TypeAdapter<T>) new TypeAdapter<CteSefazObsCont>() {
           @Override
           public void write(JsonWriter out, CteSefazObsCont value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CteSefazObsCont read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CteSefazObsCont given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CteSefazObsCont
   * @throws IOException if the JSON string is invalid with respect to CteSefazObsCont
   */
  public static CteSefazObsCont fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CteSefazObsCont.class);
  }

  /**
   * Convert an instance of CteSefazObsCont to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

