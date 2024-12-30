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
 * Exportação indireta.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfeSefazExportInd {
  public static final String SERIALIZED_NAME_N_R_E = "nRE";
  @SerializedName(SERIALIZED_NAME_N_R_E)
  @javax.annotation.Nullable
  private String nRE;

  public static final String SERIALIZED_NAME_CH_N_FE = "chNFe";
  @SerializedName(SERIALIZED_NAME_CH_N_FE)
  @javax.annotation.Nullable
  private String chNFe;

  public static final String SERIALIZED_NAME_Q_EXPORT = "qExport";
  @SerializedName(SERIALIZED_NAME_Q_EXPORT)
  @javax.annotation.Nullable
  private BigDecimal qExport;

  public NfeSefazExportInd() {
  }

  public NfeSefazExportInd nRE(@javax.annotation.Nullable String nRE) {
    this.nRE = nRE;
    return this;
  }

  /**
   * Registro de exportação.
   * @return nRE
   */
  @javax.annotation.Nullable
  public String getnRE() {
    return nRE;
  }

  public void setnRE(@javax.annotation.Nullable String nRE) {
    this.nRE = nRE;
  }


  public NfeSefazExportInd chNFe(@javax.annotation.Nullable String chNFe) {
    this.chNFe = chNFe;
    return this;
  }

  /**
   * Chave de acesso da NF-e recebida para exportação.
   * @return chNFe
   */
  @javax.annotation.Nullable
  public String getChNFe() {
    return chNFe;
  }

  public void setChNFe(@javax.annotation.Nullable String chNFe) {
    this.chNFe = chNFe;
  }


  public NfeSefazExportInd qExport(@javax.annotation.Nullable BigDecimal qExport) {
    this.qExport = qExport;
    return this;
  }

  /**
   * Quantidade do item efetivamente exportado.
   * minimum: 0
   * @return qExport
   */
  @javax.annotation.Nullable
  public BigDecimal getqExport() {
    return qExport;
  }

  public void setqExport(@javax.annotation.Nullable BigDecimal qExport) {
    this.qExport = qExport;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfeSefazExportInd nfeSefazExportInd = (NfeSefazExportInd) o;
    return Objects.equals(this.nRE, nfeSefazExportInd.nRE) &&
        Objects.equals(this.chNFe, nfeSefazExportInd.chNFe) &&
        Objects.equals(this.qExport, nfeSefazExportInd.qExport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nRE, chNFe, qExport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NfeSefazExportInd {\n");
    sb.append("    nRE: ").append(toIndentedString(nRE)).append("\n");
    sb.append("    chNFe: ").append(toIndentedString(chNFe)).append("\n");
    sb.append("    qExport: ").append(toIndentedString(qExport)).append("\n");
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
    openapiFields.add("nRE");
    openapiFields.add("chNFe");
    openapiFields.add("qExport");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("nRE");
    openapiRequiredFields.add("chNFe");
    openapiRequiredFields.add("qExport");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfeSefazExportInd
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfeSefazExportInd.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfeSefazExportInd is not found in the empty JSON string", NfeSefazExportInd.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfeSefazExportInd.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfeSefazExportInd` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NfeSefazExportInd.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("nRE") != null && !jsonObj.get("nRE").isJsonNull()) && !jsonObj.get("nRE").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nRE` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nRE").toString()));
      }
      if ((jsonObj.get("chNFe") != null && !jsonObj.get("chNFe").isJsonNull()) && !jsonObj.get("chNFe").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chNFe` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chNFe").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NfeSefazExportInd.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfeSefazExportInd' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfeSefazExportInd> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfeSefazExportInd.class));

       return (TypeAdapter<T>) new TypeAdapter<NfeSefazExportInd>() {
           @Override
           public void write(JsonWriter out, NfeSefazExportInd value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfeSefazExportInd read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfeSefazExportInd given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfeSefazExportInd
   * @throws IOException if the JSON string is invalid with respect to NfeSefazExportInd
   */
  public static NfeSefazExportInd fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfeSefazExportInd.class);
  }

  /**
   * Convert an instance of NfeSefazExportInd to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
