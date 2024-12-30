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
 * Código de Situação Tributária do COFINS.  * 01 - Operação Tributável - Base de Cálculo &#x3D; Valor da Operação Alíquota Normal (Cumulativo/Não Cumulativo)  * 02 - Operação Tributável - Base de Calculo &#x3D; Valor da Operação (Alíquota Diferenciada)
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfeSefazCOFINSAliq {
  public static final String SERIALIZED_NAME_C_S_T = "CST";
  @SerializedName(SERIALIZED_NAME_C_S_T)
  @javax.annotation.Nullable
  private String CST;

  public static final String SERIALIZED_NAME_V_B_C = "vBC";
  @SerializedName(SERIALIZED_NAME_V_B_C)
  @javax.annotation.Nullable
  private BigDecimal vBC;

  public static final String SERIALIZED_NAME_P_C_O_F_I_N_S = "pCOFINS";
  @SerializedName(SERIALIZED_NAME_P_C_O_F_I_N_S)
  @javax.annotation.Nullable
  private BigDecimal pCOFINS;

  public static final String SERIALIZED_NAME_V_C_O_F_I_N_S = "vCOFINS";
  @SerializedName(SERIALIZED_NAME_V_C_O_F_I_N_S)
  @javax.annotation.Nullable
  private BigDecimal vCOFINS;

  public NfeSefazCOFINSAliq() {
  }

  public NfeSefazCOFINSAliq CST(@javax.annotation.Nullable String CST) {
    this.CST = CST;
    return this;
  }

  /**
   * Código de Situação Tributária do COFINS.  * 01 - Operação Tributável - Base de Cálculo &#x3D; Valor da Operação Alíquota Normal (Cumulativo/Não Cumulativo)  * 02 - Operação Tributável - Base de Calculo &#x3D; Valor da Operação (Alíquota Diferenciada)
   * @return CST
   */
  @javax.annotation.Nullable
  public String getCST() {
    return CST;
  }

  public void setCST(@javax.annotation.Nullable String CST) {
    this.CST = CST;
  }


  public NfeSefazCOFINSAliq vBC(@javax.annotation.Nullable BigDecimal vBC) {
    this.vBC = vBC;
    return this;
  }

  /**
   * Valor da BC do COFINS.
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


  public NfeSefazCOFINSAliq pCOFINS(@javax.annotation.Nullable BigDecimal pCOFINS) {
    this.pCOFINS = pCOFINS;
    return this;
  }

  /**
   * Alíquota do COFINS (em percentual).
   * minimum: 0
   * @return pCOFINS
   */
  @javax.annotation.Nullable
  public BigDecimal getpCOFINS() {
    return pCOFINS;
  }

  public void setpCOFINS(@javax.annotation.Nullable BigDecimal pCOFINS) {
    this.pCOFINS = pCOFINS;
  }


  public NfeSefazCOFINSAliq vCOFINS(@javax.annotation.Nullable BigDecimal vCOFINS) {
    this.vCOFINS = vCOFINS;
    return this;
  }

  /**
   * Valor do COFINS.
   * minimum: 0
   * @return vCOFINS
   */
  @javax.annotation.Nullable
  public BigDecimal getvCOFINS() {
    return vCOFINS;
  }

  public void setvCOFINS(@javax.annotation.Nullable BigDecimal vCOFINS) {
    this.vCOFINS = vCOFINS;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfeSefazCOFINSAliq nfeSefazCOFINSAliq = (NfeSefazCOFINSAliq) o;
    return Objects.equals(this.CST, nfeSefazCOFINSAliq.CST) &&
        Objects.equals(this.vBC, nfeSefazCOFINSAliq.vBC) &&
        Objects.equals(this.pCOFINS, nfeSefazCOFINSAliq.pCOFINS) &&
        Objects.equals(this.vCOFINS, nfeSefazCOFINSAliq.vCOFINS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CST, vBC, pCOFINS, vCOFINS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NfeSefazCOFINSAliq {\n");
    sb.append("    CST: ").append(toIndentedString(CST)).append("\n");
    sb.append("    vBC: ").append(toIndentedString(vBC)).append("\n");
    sb.append("    pCOFINS: ").append(toIndentedString(pCOFINS)).append("\n");
    sb.append("    vCOFINS: ").append(toIndentedString(vCOFINS)).append("\n");
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
    openapiFields.add("pCOFINS");
    openapiFields.add("vCOFINS");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("CST");
    openapiRequiredFields.add("vBC");
    openapiRequiredFields.add("pCOFINS");
    openapiRequiredFields.add("vCOFINS");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfeSefazCOFINSAliq
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfeSefazCOFINSAliq.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfeSefazCOFINSAliq is not found in the empty JSON string", NfeSefazCOFINSAliq.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfeSefazCOFINSAliq.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfeSefazCOFINSAliq` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NfeSefazCOFINSAliq.openapiRequiredFields) {
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
       if (!NfeSefazCOFINSAliq.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfeSefazCOFINSAliq' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfeSefazCOFINSAliq> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfeSefazCOFINSAliq.class));

       return (TypeAdapter<T>) new TypeAdapter<NfeSefazCOFINSAliq>() {
           @Override
           public void write(JsonWriter out, NfeSefazCOFINSAliq value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfeSefazCOFINSAliq read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfeSefazCOFINSAliq given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfeSefazCOFINSAliq
   * @throws IOException if the JSON string is invalid with respect to NfeSefazCOFINSAliq
   */
  public static NfeSefazCOFINSAliq fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfeSefazCOFINSAliq.class);
  }

  /**
   * Convert an instance of NfeSefazCOFINSAliq to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

