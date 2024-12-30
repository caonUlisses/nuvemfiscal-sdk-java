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
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * ICMS  Isento, não Tributado ou diferido.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class CteSefazICMS45 {
  public static final String SERIALIZED_NAME_C_S_T = "CST";
  @SerializedName(SERIALIZED_NAME_C_S_T)
  @javax.annotation.Nullable
  private String CST;

  public static final String SERIALIZED_NAME_V_I_C_M_S_DESON = "vICMSDeson";
  @SerializedName(SERIALIZED_NAME_V_I_C_M_S_DESON)
  @javax.annotation.Nullable
  private BigDecimal vICMSDeson;

  public static final String SERIALIZED_NAME_C_BENEF = "cBenef";
  @SerializedName(SERIALIZED_NAME_C_BENEF)
  @javax.annotation.Nullable
  private String cBenef;

  public CteSefazICMS45() {
  }

  public CteSefazICMS45 CST(@javax.annotation.Nullable String CST) {
    this.CST = CST;
    return this;
  }

  /**
   * Classificação Tributária do Serviço.  Preencher com:  * 40 - ICMS isenção  * 41 - ICMS não tributada  * 51 - ICMS diferido
   * @return CST
   */
  @javax.annotation.Nullable
  public String getCST() {
    return CST;
  }

  public void setCST(@javax.annotation.Nullable String CST) {
    this.CST = CST;
  }


  public CteSefazICMS45 vICMSDeson(@javax.annotation.Nullable BigDecimal vICMSDeson) {
    this.vICMSDeson = vICMSDeson;
    return this;
  }

  /**
   * Valor do ICMS de desoneração.
   * minimum: 0
   * @return vICMSDeson
   */
  @javax.annotation.Nullable
  public BigDecimal getvICMSDeson() {
    return vICMSDeson;
  }

  public void setvICMSDeson(@javax.annotation.Nullable BigDecimal vICMSDeson) {
    this.vICMSDeson = vICMSDeson;
  }


  public CteSefazICMS45 cBenef(@javax.annotation.Nullable String cBenef) {
    this.cBenef = cBenef;
    return this;
  }

  /**
   * Código de Benefício Fiscal na UF.  Código de Benefício Fiscal utilizado pela UF.
   * @return cBenef
   */
  @javax.annotation.Nullable
  public String getcBenef() {
    return cBenef;
  }

  public void setcBenef(@javax.annotation.Nullable String cBenef) {
    this.cBenef = cBenef;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CteSefazICMS45 cteSefazICMS45 = (CteSefazICMS45) o;
    return Objects.equals(this.CST, cteSefazICMS45.CST) &&
        Objects.equals(this.vICMSDeson, cteSefazICMS45.vICMSDeson) &&
        Objects.equals(this.cBenef, cteSefazICMS45.cBenef);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(CST, vICMSDeson, cBenef);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CteSefazICMS45 {\n");
    sb.append("    CST: ").append(toIndentedString(CST)).append("\n");
    sb.append("    vICMSDeson: ").append(toIndentedString(vICMSDeson)).append("\n");
    sb.append("    cBenef: ").append(toIndentedString(cBenef)).append("\n");
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
    openapiFields.add("CST");
    openapiFields.add("vICMSDeson");
    openapiFields.add("cBenef");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("CST");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CteSefazICMS45
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CteSefazICMS45.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CteSefazICMS45 is not found in the empty JSON string", CteSefazICMS45.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CteSefazICMS45.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CteSefazICMS45` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CteSefazICMS45.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("CST") != null && !jsonObj.get("CST").isJsonNull()) && !jsonObj.get("CST").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CST` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CST").toString()));
      }
      if ((jsonObj.get("cBenef") != null && !jsonObj.get("cBenef").isJsonNull()) && !jsonObj.get("cBenef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cBenef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cBenef").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CteSefazICMS45.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CteSefazICMS45' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CteSefazICMS45> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CteSefazICMS45.class));

       return (TypeAdapter<T>) new TypeAdapter<CteSefazICMS45>() {
           @Override
           public void write(JsonWriter out, CteSefazICMS45 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CteSefazICMS45 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CteSefazICMS45 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CteSefazICMS45
   * @throws IOException if the JSON string is invalid with respect to CteSefazICMS45
   */
  public static CteSefazICMS45 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CteSefazICMS45.class);
  }

  /**
   * Convert an instance of CteSefazICMS45 to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

