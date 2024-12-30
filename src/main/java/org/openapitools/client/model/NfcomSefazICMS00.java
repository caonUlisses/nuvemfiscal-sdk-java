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
 * Prestação sujeito à tributação normal do ICMS.  Tributada integralmente.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfcomSefazICMS00 {
  public static final String SERIALIZED_NAME_C_S_T = "CST";
  @SerializedName(SERIALIZED_NAME_C_S_T)
  @javax.annotation.Nullable
  private String CST;

  public static final String SERIALIZED_NAME_V_B_C = "vBC";
  @SerializedName(SERIALIZED_NAME_V_B_C)
  @javax.annotation.Nullable
  private BigDecimal vBC;

  public static final String SERIALIZED_NAME_P_I_C_M_S = "pICMS";
  @SerializedName(SERIALIZED_NAME_P_I_C_M_S)
  @javax.annotation.Nullable
  private BigDecimal pICMS;

  public static final String SERIALIZED_NAME_V_I_C_M_S = "vICMS";
  @SerializedName(SERIALIZED_NAME_V_I_C_M_S)
  @javax.annotation.Nullable
  private BigDecimal vICMS;

  public static final String SERIALIZED_NAME_P_F_C_P = "pFCP";
  @SerializedName(SERIALIZED_NAME_P_F_C_P)
  @javax.annotation.Nullable
  private BigDecimal pFCP;

  public static final String SERIALIZED_NAME_V_F_C_P = "vFCP";
  @SerializedName(SERIALIZED_NAME_V_F_C_P)
  @javax.annotation.Nullable
  private BigDecimal vFCP;

  public NfcomSefazICMS00() {
  }

  public NfcomSefazICMS00 CST(@javax.annotation.Nullable String CST) {
    this.CST = CST;
    return this;
  }

  /**
   * classificação Tributária do Serviço.  * 00 - tributação normal ICMS
   * @return CST
   */
  @javax.annotation.Nullable
  public String getCST() {
    return CST;
  }

  public void setCST(@javax.annotation.Nullable String CST) {
    this.CST = CST;
  }


  public NfcomSefazICMS00 vBC(@javax.annotation.Nullable BigDecimal vBC) {
    this.vBC = vBC;
    return this;
  }

  /**
   * Valor da BC do ICMS.
   * minimum: 0
   * @return vBC
   */
  @javax.annotation.Nullable
  public BigDecimal getvBC() {
    return vBC;
  }

  public void setvBC(@javax.annotation.Nullable BigDecimal vBC) {
    this.vBC = vBC;
  }


  public NfcomSefazICMS00 pICMS(@javax.annotation.Nullable BigDecimal pICMS) {
    this.pICMS = pICMS;
    return this;
  }

  /**
   * Alíquota do ICMS.
   * minimum: 0
   * @return pICMS
   */
  @javax.annotation.Nullable
  public BigDecimal getpICMS() {
    return pICMS;
  }

  public void setpICMS(@javax.annotation.Nullable BigDecimal pICMS) {
    this.pICMS = pICMS;
  }


  public NfcomSefazICMS00 vICMS(@javax.annotation.Nullable BigDecimal vICMS) {
    this.vICMS = vICMS;
    return this;
  }

  /**
   * Valor do ICMS.
   * minimum: 0
   * @return vICMS
   */
  @javax.annotation.Nullable
  public BigDecimal getvICMS() {
    return vICMS;
  }

  public void setvICMS(@javax.annotation.Nullable BigDecimal vICMS) {
    this.vICMS = vICMS;
  }


  public NfcomSefazICMS00 pFCP(@javax.annotation.Nullable BigDecimal pFCP) {
    this.pFCP = pFCP;
    return this;
  }

  /**
   * Percentual de ICMS relativo ao Fundo de Combate à Pobreza (FCP).
   * minimum: 0
   * @return pFCP
   */
  @javax.annotation.Nullable
  public BigDecimal getpFCP() {
    return pFCP;
  }

  public void setpFCP(@javax.annotation.Nullable BigDecimal pFCP) {
    this.pFCP = pFCP;
  }


  public NfcomSefazICMS00 vFCP(@javax.annotation.Nullable BigDecimal vFCP) {
    this.vFCP = vFCP;
    return this;
  }

  /**
   * Valor do ICMS relativo ao Fundo de Combate à Pobreza (FCP).
   * minimum: 0
   * @return vFCP
   */
  @javax.annotation.Nullable
  public BigDecimal getvFCP() {
    return vFCP;
  }

  public void setvFCP(@javax.annotation.Nullable BigDecimal vFCP) {
    this.vFCP = vFCP;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfcomSefazICMS00 nfcomSefazICMS00 = (NfcomSefazICMS00) o;
    return Objects.equals(this.CST, nfcomSefazICMS00.CST) &&
        Objects.equals(this.vBC, nfcomSefazICMS00.vBC) &&
        Objects.equals(this.pICMS, nfcomSefazICMS00.pICMS) &&
        Objects.equals(this.vICMS, nfcomSefazICMS00.vICMS) &&
        Objects.equals(this.pFCP, nfcomSefazICMS00.pFCP) &&
        Objects.equals(this.vFCP, nfcomSefazICMS00.vFCP);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(CST, vBC, pICMS, vICMS, pFCP, vFCP);
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
    sb.append("class NfcomSefazICMS00 {\n");
    sb.append("    CST: ").append(toIndentedString(CST)).append("\n");
    sb.append("    vBC: ").append(toIndentedString(vBC)).append("\n");
    sb.append("    pICMS: ").append(toIndentedString(pICMS)).append("\n");
    sb.append("    vICMS: ").append(toIndentedString(vICMS)).append("\n");
    sb.append("    pFCP: ").append(toIndentedString(pFCP)).append("\n");
    sb.append("    vFCP: ").append(toIndentedString(vFCP)).append("\n");
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
    openapiFields.add("vBC");
    openapiFields.add("pICMS");
    openapiFields.add("vICMS");
    openapiFields.add("pFCP");
    openapiFields.add("vFCP");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("CST");
    openapiRequiredFields.add("vBC");
    openapiRequiredFields.add("pICMS");
    openapiRequiredFields.add("vICMS");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfcomSefazICMS00
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfcomSefazICMS00.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfcomSefazICMS00 is not found in the empty JSON string", NfcomSefazICMS00.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfcomSefazICMS00.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfcomSefazICMS00` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NfcomSefazICMS00.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("CST") != null && !jsonObj.get("CST").isJsonNull()) && !jsonObj.get("CST").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CST` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CST").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NfcomSefazICMS00.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfcomSefazICMS00' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfcomSefazICMS00> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfcomSefazICMS00.class));

       return (TypeAdapter<T>) new TypeAdapter<NfcomSefazICMS00>() {
           @Override
           public void write(JsonWriter out, NfcomSefazICMS00 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfcomSefazICMS00 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfcomSefazICMS00 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfcomSefazICMS00
   * @throws IOException if the JSON string is invalid with respect to NfcomSefazICMS00
   */
  public static NfcomSefazICMS00 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfcomSefazICMS00.class);
  }

  /**
   * Convert an instance of NfcomSefazICMS00 to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

