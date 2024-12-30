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
 * Informações da seguradora.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class MdfeSefazInfSeg {
  public static final String SERIALIZED_NAME_X_SEG = "xSeg";
  @SerializedName(SERIALIZED_NAME_X_SEG)
  @javax.annotation.Nullable
  private String xSeg;

  public static final String SERIALIZED_NAME_C_N_P_J = "CNPJ";
  @SerializedName(SERIALIZED_NAME_C_N_P_J)
  @javax.annotation.Nullable
  private String CNPJ;

  public MdfeSefazInfSeg() {
  }

  public MdfeSefazInfSeg xSeg(@javax.annotation.Nullable String xSeg) {
    this.xSeg = xSeg;
    return this;
  }

  /**
   * Nome da Seguradora.
   * @return xSeg
   */
  @javax.annotation.Nullable
  public String getxSeg() {
    return xSeg;
  }

  public void setxSeg(@javax.annotation.Nullable String xSeg) {
    this.xSeg = xSeg;
  }


  public MdfeSefazInfSeg CNPJ(@javax.annotation.Nullable String CNPJ) {
    this.CNPJ = CNPJ;
    return this;
  }

  /**
   * Número do CNPJ da seguradora.  Obrigatório apenas se responsável pelo seguro for (2) responsável pela contratação do transporte - pessoa jurídica.
   * @return CNPJ
   */
  @javax.annotation.Nullable
  public String getCNPJ() {
    return CNPJ;
  }

  public void setCNPJ(@javax.annotation.Nullable String CNPJ) {
    this.CNPJ = CNPJ;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MdfeSefazInfSeg mdfeSefazInfSeg = (MdfeSefazInfSeg) o;
    return Objects.equals(this.xSeg, mdfeSefazInfSeg.xSeg) &&
        Objects.equals(this.CNPJ, mdfeSefazInfSeg.CNPJ);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xSeg, CNPJ);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MdfeSefazInfSeg {\n");
    sb.append("    xSeg: ").append(toIndentedString(xSeg)).append("\n");
    sb.append("    CNPJ: ").append(toIndentedString(CNPJ)).append("\n");
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
    openapiFields.add("xSeg");
    openapiFields.add("CNPJ");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("xSeg");
    openapiRequiredFields.add("CNPJ");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MdfeSefazInfSeg
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MdfeSefazInfSeg.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MdfeSefazInfSeg is not found in the empty JSON string", MdfeSefazInfSeg.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MdfeSefazInfSeg.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MdfeSefazInfSeg` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MdfeSefazInfSeg.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("xSeg") != null && !jsonObj.get("xSeg").isJsonNull()) && !jsonObj.get("xSeg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xSeg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xSeg").toString()));
      }
      if ((jsonObj.get("CNPJ") != null && !jsonObj.get("CNPJ").isJsonNull()) && !jsonObj.get("CNPJ").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CNPJ` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CNPJ").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MdfeSefazInfSeg.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MdfeSefazInfSeg' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MdfeSefazInfSeg> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MdfeSefazInfSeg.class));

       return (TypeAdapter<T>) new TypeAdapter<MdfeSefazInfSeg>() {
           @Override
           public void write(JsonWriter out, MdfeSefazInfSeg value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MdfeSefazInfSeg read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MdfeSefazInfSeg given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MdfeSefazInfSeg
   * @throws IOException if the JSON string is invalid with respect to MdfeSefazInfSeg
   */
  public static MdfeSefazInfSeg fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MdfeSefazInfSeg.class);
  }

  /**
   * Convert an instance of MdfeSefazInfSeg to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

