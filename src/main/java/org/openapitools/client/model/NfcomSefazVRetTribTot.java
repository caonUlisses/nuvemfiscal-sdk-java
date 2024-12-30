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
 * Total da retenção de tributos federais.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfcomSefazVRetTribTot {
  public static final String SERIALIZED_NAME_V_RET_P_I_S = "vRetPIS";
  @SerializedName(SERIALIZED_NAME_V_RET_P_I_S)
  @javax.annotation.Nullable
  private BigDecimal vRetPIS;

  public static final String SERIALIZED_NAME_V_RET_COFINS = "vRetCofins";
  @SerializedName(SERIALIZED_NAME_V_RET_COFINS)
  @javax.annotation.Nullable
  private BigDecimal vRetCofins;

  public static final String SERIALIZED_NAME_V_RET_C_S_L_L = "vRetCSLL";
  @SerializedName(SERIALIZED_NAME_V_RET_C_S_L_L)
  @javax.annotation.Nullable
  private BigDecimal vRetCSLL;

  public static final String SERIALIZED_NAME_V_I_R_R_F = "vIRRF";
  @SerializedName(SERIALIZED_NAME_V_I_R_R_F)
  @javax.annotation.Nullable
  private BigDecimal vIRRF;

  public NfcomSefazVRetTribTot() {
  }

  public NfcomSefazVRetTribTot vRetPIS(@javax.annotation.Nullable BigDecimal vRetPIS) {
    this.vRetPIS = vRetPIS;
    return this;
  }

  /**
   * Valor do PIS retido.
   * minimum: 0
   * @return vRetPIS
   */
  @javax.annotation.Nullable
  public BigDecimal getvRetPIS() {
    return vRetPIS;
  }

  public void setvRetPIS(@javax.annotation.Nullable BigDecimal vRetPIS) {
    this.vRetPIS = vRetPIS;
  }


  public NfcomSefazVRetTribTot vRetCofins(@javax.annotation.Nullable BigDecimal vRetCofins) {
    this.vRetCofins = vRetCofins;
    return this;
  }

  /**
   * Valor do COFNS retido.
   * minimum: 0
   * @return vRetCofins
   */
  @javax.annotation.Nullable
  public BigDecimal getvRetCofins() {
    return vRetCofins;
  }

  public void setvRetCofins(@javax.annotation.Nullable BigDecimal vRetCofins) {
    this.vRetCofins = vRetCofins;
  }


  public NfcomSefazVRetTribTot vRetCSLL(@javax.annotation.Nullable BigDecimal vRetCSLL) {
    this.vRetCSLL = vRetCSLL;
    return this;
  }

  /**
   * Valor da CSLL retida.
   * minimum: 0
   * @return vRetCSLL
   */
  @javax.annotation.Nullable
  public BigDecimal getvRetCSLL() {
    return vRetCSLL;
  }

  public void setvRetCSLL(@javax.annotation.Nullable BigDecimal vRetCSLL) {
    this.vRetCSLL = vRetCSLL;
  }


  public NfcomSefazVRetTribTot vIRRF(@javax.annotation.Nullable BigDecimal vIRRF) {
    this.vIRRF = vIRRF;
    return this;
  }

  /**
   * Valor do IRRF retido.
   * minimum: 0
   * @return vIRRF
   */
  @javax.annotation.Nullable
  public BigDecimal getvIRRF() {
    return vIRRF;
  }

  public void setvIRRF(@javax.annotation.Nullable BigDecimal vIRRF) {
    this.vIRRF = vIRRF;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfcomSefazVRetTribTot nfcomSefazVRetTribTot = (NfcomSefazVRetTribTot) o;
    return Objects.equals(this.vRetPIS, nfcomSefazVRetTribTot.vRetPIS) &&
        Objects.equals(this.vRetCofins, nfcomSefazVRetTribTot.vRetCofins) &&
        Objects.equals(this.vRetCSLL, nfcomSefazVRetTribTot.vRetCSLL) &&
        Objects.equals(this.vIRRF, nfcomSefazVRetTribTot.vIRRF);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vRetPIS, vRetCofins, vRetCSLL, vIRRF);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NfcomSefazVRetTribTot {\n");
    sb.append("    vRetPIS: ").append(toIndentedString(vRetPIS)).append("\n");
    sb.append("    vRetCofins: ").append(toIndentedString(vRetCofins)).append("\n");
    sb.append("    vRetCSLL: ").append(toIndentedString(vRetCSLL)).append("\n");
    sb.append("    vIRRF: ").append(toIndentedString(vIRRF)).append("\n");
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
    openapiFields.add("vRetPIS");
    openapiFields.add("vRetCofins");
    openapiFields.add("vRetCSLL");
    openapiFields.add("vIRRF");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("vRetPIS");
    openapiRequiredFields.add("vRetCofins");
    openapiRequiredFields.add("vRetCSLL");
    openapiRequiredFields.add("vIRRF");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfcomSefazVRetTribTot
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfcomSefazVRetTribTot.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfcomSefazVRetTribTot is not found in the empty JSON string", NfcomSefazVRetTribTot.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfcomSefazVRetTribTot.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfcomSefazVRetTribTot` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NfcomSefazVRetTribTot.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NfcomSefazVRetTribTot.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfcomSefazVRetTribTot' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfcomSefazVRetTribTot> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfcomSefazVRetTribTot.class));

       return (TypeAdapter<T>) new TypeAdapter<NfcomSefazVRetTribTot>() {
           @Override
           public void write(JsonWriter out, NfcomSefazVRetTribTot value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfcomSefazVRetTribTot read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfcomSefazVRetTribTot given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfcomSefazVRetTribTot
   * @throws IOException if the JSON string is invalid with respect to NfcomSefazVRetTribTot
   */
  public static NfcomSefazVRetTribTot fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfcomSefazVRetTribTot.class);
  }

  /**
   * Convert an instance of NfcomSefazVRetTribTot to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
