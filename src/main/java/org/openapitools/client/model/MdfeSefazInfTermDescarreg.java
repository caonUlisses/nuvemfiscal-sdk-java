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
 * Grupo de informações dos terminais de descarregamento.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class MdfeSefazInfTermDescarreg {
  public static final String SERIALIZED_NAME_C_TERM_DESCARREG = "cTermDescarreg";
  @SerializedName(SERIALIZED_NAME_C_TERM_DESCARREG)
  @javax.annotation.Nullable
  private String cTermDescarreg;

  public static final String SERIALIZED_NAME_X_TERM_DESCARREG = "xTermDescarreg";
  @SerializedName(SERIALIZED_NAME_X_TERM_DESCARREG)
  @javax.annotation.Nullable
  private String xTermDescarreg;

  public MdfeSefazInfTermDescarreg() {
  }

  public MdfeSefazInfTermDescarreg cTermDescarreg(@javax.annotation.Nullable String cTermDescarreg) {
    this.cTermDescarreg = cTermDescarreg;
    return this;
  }

  /**
   * Código do Terminal de Descarregamento.  Preencher de acordo com a Tabela de Terminais de Descarregamento. O código de cada Porto está definido no Ministério de Transportes.
   * @return cTermDescarreg
   */
  @javax.annotation.Nullable
  public String getcTermDescarreg() {
    return cTermDescarreg;
  }

  public void setcTermDescarreg(@javax.annotation.Nullable String cTermDescarreg) {
    this.cTermDescarreg = cTermDescarreg;
  }


  public MdfeSefazInfTermDescarreg xTermDescarreg(@javax.annotation.Nullable String xTermDescarreg) {
    this.xTermDescarreg = xTermDescarreg;
    return this;
  }

  /**
   * Nome do Terminal de Descarregamento.
   * @return xTermDescarreg
   */
  @javax.annotation.Nullable
  public String getxTermDescarreg() {
    return xTermDescarreg;
  }

  public void setxTermDescarreg(@javax.annotation.Nullable String xTermDescarreg) {
    this.xTermDescarreg = xTermDescarreg;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MdfeSefazInfTermDescarreg mdfeSefazInfTermDescarreg = (MdfeSefazInfTermDescarreg) o;
    return Objects.equals(this.cTermDescarreg, mdfeSefazInfTermDescarreg.cTermDescarreg) &&
        Objects.equals(this.xTermDescarreg, mdfeSefazInfTermDescarreg.xTermDescarreg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cTermDescarreg, xTermDescarreg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MdfeSefazInfTermDescarreg {\n");
    sb.append("    cTermDescarreg: ").append(toIndentedString(cTermDescarreg)).append("\n");
    sb.append("    xTermDescarreg: ").append(toIndentedString(xTermDescarreg)).append("\n");
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
    openapiFields.add("cTermDescarreg");
    openapiFields.add("xTermDescarreg");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cTermDescarreg");
    openapiRequiredFields.add("xTermDescarreg");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MdfeSefazInfTermDescarreg
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MdfeSefazInfTermDescarreg.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MdfeSefazInfTermDescarreg is not found in the empty JSON string", MdfeSefazInfTermDescarreg.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MdfeSefazInfTermDescarreg.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MdfeSefazInfTermDescarreg` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MdfeSefazInfTermDescarreg.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cTermDescarreg") != null && !jsonObj.get("cTermDescarreg").isJsonNull()) && !jsonObj.get("cTermDescarreg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cTermDescarreg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cTermDescarreg").toString()));
      }
      if ((jsonObj.get("xTermDescarreg") != null && !jsonObj.get("xTermDescarreg").isJsonNull()) && !jsonObj.get("xTermDescarreg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xTermDescarreg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xTermDescarreg").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MdfeSefazInfTermDescarreg.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MdfeSefazInfTermDescarreg' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MdfeSefazInfTermDescarreg> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MdfeSefazInfTermDescarreg.class));

       return (TypeAdapter<T>) new TypeAdapter<MdfeSefazInfTermDescarreg>() {
           @Override
           public void write(JsonWriter out, MdfeSefazInfTermDescarreg value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MdfeSefazInfTermDescarreg read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MdfeSefazInfTermDescarreg given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MdfeSefazInfTermDescarreg
   * @throws IOException if the JSON string is invalid with respect to MdfeSefazInfTermDescarreg
   */
  public static MdfeSefazInfTermDescarreg fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MdfeSefazInfTermDescarreg.class);
  }

  /**
   * Convert an instance of MdfeSefazInfTermDescarreg to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

