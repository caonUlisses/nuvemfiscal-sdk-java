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


package io.github.com.caonulisses.nuvemfiscalsdk.model;

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

import io.github.com.caonulisses.nuvemfiscalsdk.JSON;

/**
 * CIDE Combustíveis.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfeSefazCIDE {
  public static final String SERIALIZED_NAME_Q_B_C_PROD = "qBCProd";
  @SerializedName(SERIALIZED_NAME_Q_B_C_PROD)
  @javax.annotation.Nullable
  private BigDecimal qBCProd;

  public static final String SERIALIZED_NAME_V_ALIQ_PROD = "vAliqProd";
  @SerializedName(SERIALIZED_NAME_V_ALIQ_PROD)
  @javax.annotation.Nullable
  private BigDecimal vAliqProd;

  public static final String SERIALIZED_NAME_V_C_I_D_E = "vCIDE";
  @SerializedName(SERIALIZED_NAME_V_C_I_D_E)
  @javax.annotation.Nullable
  private BigDecimal vCIDE;

  public NfeSefazCIDE() {
  }

  public NfeSefazCIDE qBCProd(@javax.annotation.Nullable BigDecimal qBCProd) {
    this.qBCProd = qBCProd;
    return this;
  }

  /**
   * BC do CIDE ( Quantidade comercializada).
   * minimum: 0
   * @return qBCProd
   */
  @javax.annotation.Nullable
  public BigDecimal getqBCProd() {
    return qBCProd;
  }

  public void setqBCProd(@javax.annotation.Nullable BigDecimal qBCProd) {
    this.qBCProd = qBCProd;
  }


  public NfeSefazCIDE vAliqProd(@javax.annotation.Nullable BigDecimal vAliqProd) {
    this.vAliqProd = vAliqProd;
    return this;
  }

  /**
   * Alíquota do CIDE  (em reais).
   * minimum: 0
   * @return vAliqProd
   */
  @javax.annotation.Nullable
  public BigDecimal getvAliqProd() {
    return vAliqProd;
  }

  public void setvAliqProd(@javax.annotation.Nullable BigDecimal vAliqProd) {
    this.vAliqProd = vAliqProd;
  }


  public NfeSefazCIDE vCIDE(@javax.annotation.Nullable BigDecimal vCIDE) {
    this.vCIDE = vCIDE;
    return this;
  }

  /**
   * Valor do CIDE.
   * minimum: 0
   * @return vCIDE
   */
  @javax.annotation.Nullable
  public BigDecimal getvCIDE() {
    return vCIDE;
  }

  public void setvCIDE(@javax.annotation.Nullable BigDecimal vCIDE) {
    this.vCIDE = vCIDE;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfeSefazCIDE nfeSefazCIDE = (NfeSefazCIDE) o;
    return Objects.equals(this.qBCProd, nfeSefazCIDE.qBCProd) &&
        Objects.equals(this.vAliqProd, nfeSefazCIDE.vAliqProd) &&
        Objects.equals(this.vCIDE, nfeSefazCIDE.vCIDE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qBCProd, vAliqProd, vCIDE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NfeSefazCIDE {\n");
    sb.append("    qBCProd: ").append(toIndentedString(qBCProd)).append("\n");
    sb.append("    vAliqProd: ").append(toIndentedString(vAliqProd)).append("\n");
    sb.append("    vCIDE: ").append(toIndentedString(vCIDE)).append("\n");
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
    openapiFields.add("qBCProd");
    openapiFields.add("vAliqProd");
    openapiFields.add("vCIDE");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("qBCProd");
    openapiRequiredFields.add("vAliqProd");
    openapiRequiredFields.add("vCIDE");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfeSefazCIDE
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfeSefazCIDE.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfeSefazCIDE is not found in the empty JSON string", NfeSefazCIDE.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfeSefazCIDE.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfeSefazCIDE` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NfeSefazCIDE.openapiRequiredFields) {
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
       if (!NfeSefazCIDE.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfeSefazCIDE' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfeSefazCIDE> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfeSefazCIDE.class));

       return (TypeAdapter<T>) new TypeAdapter<NfeSefazCIDE>() {
           @Override
           public void write(JsonWriter out, NfeSefazCIDE value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfeSefazCIDE read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfeSefazCIDE given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfeSefazCIDE
   * @throws IOException if the JSON string is invalid with respect to NfeSefazCIDE
   */
  public static NfeSefazCIDE fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfeSefazCIDE.class);
  }

  /**
   * Convert an instance of NfeSefazCIDE to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

