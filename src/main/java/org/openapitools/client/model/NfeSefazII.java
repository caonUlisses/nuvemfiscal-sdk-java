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
 * Dados do Imposto de Importação.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfeSefazII {
  public static final String SERIALIZED_NAME_V_B_C = "vBC";
  @SerializedName(SERIALIZED_NAME_V_B_C)
  @javax.annotation.Nullable
  private BigDecimal vBC;

  public static final String SERIALIZED_NAME_V_DESP_ADU = "vDespAdu";
  @SerializedName(SERIALIZED_NAME_V_DESP_ADU)
  @javax.annotation.Nullable
  private BigDecimal vDespAdu;

  public static final String SERIALIZED_NAME_V_I_I = "vII";
  @SerializedName(SERIALIZED_NAME_V_I_I)
  @javax.annotation.Nullable
  private BigDecimal vII;

  public static final String SERIALIZED_NAME_V_I_O_F = "vIOF";
  @SerializedName(SERIALIZED_NAME_V_I_O_F)
  @javax.annotation.Nullable
  private BigDecimal vIOF;

  public NfeSefazII() {
  }

  public NfeSefazII vBC(@javax.annotation.Nullable BigDecimal vBC) {
    this.vBC = vBC;
    return this;
  }

  /**
   * Base da BC do Imposto de Importação.
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


  public NfeSefazII vDespAdu(@javax.annotation.Nullable BigDecimal vDespAdu) {
    this.vDespAdu = vDespAdu;
    return this;
  }

  /**
   * Valor das despesas aduaneiras.
   * minimum: 0
   * @return vDespAdu
   */
  @javax.annotation.Nullable
  public BigDecimal getvDespAdu() {
    return vDespAdu;
  }

  public void setvDespAdu(@javax.annotation.Nullable BigDecimal vDespAdu) {
    this.vDespAdu = vDespAdu;
  }


  public NfeSefazII vII(@javax.annotation.Nullable BigDecimal vII) {
    this.vII = vII;
    return this;
  }

  /**
   * Valor do Imposto de Importação.
   * minimum: 0
   * @return vII
   */
  @javax.annotation.Nullable
  public BigDecimal getvII() {
    return vII;
  }

  public void setvII(@javax.annotation.Nullable BigDecimal vII) {
    this.vII = vII;
  }


  public NfeSefazII vIOF(@javax.annotation.Nullable BigDecimal vIOF) {
    this.vIOF = vIOF;
    return this;
  }

  /**
   * Valor do Imposto sobre Operações Financeiras.
   * minimum: 0
   * @return vIOF
   */
  @javax.annotation.Nullable
  public BigDecimal getvIOF() {
    return vIOF;
  }

  public void setvIOF(@javax.annotation.Nullable BigDecimal vIOF) {
    this.vIOF = vIOF;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfeSefazII nfeSefazII = (NfeSefazII) o;
    return Objects.equals(this.vBC, nfeSefazII.vBC) &&
        Objects.equals(this.vDespAdu, nfeSefazII.vDespAdu) &&
        Objects.equals(this.vII, nfeSefazII.vII) &&
        Objects.equals(this.vIOF, nfeSefazII.vIOF);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vBC, vDespAdu, vII, vIOF);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NfeSefazII {\n");
    sb.append("    vBC: ").append(toIndentedString(vBC)).append("\n");
    sb.append("    vDespAdu: ").append(toIndentedString(vDespAdu)).append("\n");
    sb.append("    vII: ").append(toIndentedString(vII)).append("\n");
    sb.append("    vIOF: ").append(toIndentedString(vIOF)).append("\n");
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
    openapiFields.add("vBC");
    openapiFields.add("vDespAdu");
    openapiFields.add("vII");
    openapiFields.add("vIOF");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("vBC");
    openapiRequiredFields.add("vDespAdu");
    openapiRequiredFields.add("vII");
    openapiRequiredFields.add("vIOF");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfeSefazII
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfeSefazII.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfeSefazII is not found in the empty JSON string", NfeSefazII.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfeSefazII.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfeSefazII` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NfeSefazII.openapiRequiredFields) {
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
       if (!NfeSefazII.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfeSefazII' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfeSefazII> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfeSefazII.class));

       return (TypeAdapter<T>) new TypeAdapter<NfeSefazII>() {
           @Override
           public void write(JsonWriter out, NfeSefazII value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfeSefazII read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfeSefazII given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfeSefazII
   * @throws IOException if the JSON string is invalid with respect to NfeSefazII
   */
  public static NfeSefazII fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfeSefazII.class);
  }

  /**
   * Convert an instance of NfeSefazII to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

