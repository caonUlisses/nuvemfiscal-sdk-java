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
 * Dados do FUST.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfcomSefazFUST {
  public static final String SERIALIZED_NAME_V_B_C = "vBC";
  @SerializedName(SERIALIZED_NAME_V_B_C)
  @javax.annotation.Nullable
  private BigDecimal vBC;

  public static final String SERIALIZED_NAME_P_F_U_S_T = "pFUST";
  @SerializedName(SERIALIZED_NAME_P_F_U_S_T)
  @javax.annotation.Nullable
  private BigDecimal pFUST;

  public static final String SERIALIZED_NAME_V_F_U_S_T = "vFUST";
  @SerializedName(SERIALIZED_NAME_V_F_U_S_T)
  @javax.annotation.Nullable
  private BigDecimal vFUST;

  public NfcomSefazFUST() {
  }

  public NfcomSefazFUST vBC(@javax.annotation.Nullable BigDecimal vBC) {
    this.vBC = vBC;
    return this;
  }

  /**
   * Valor da BC do FUST.
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


  public NfcomSefazFUST pFUST(@javax.annotation.Nullable BigDecimal pFUST) {
    this.pFUST = pFUST;
    return this;
  }

  /**
   * Alíquota do FUST (em percentual).
   * minimum: 0
   * @return pFUST
   */
  @javax.annotation.Nullable
  public BigDecimal getpFUST() {
    return pFUST;
  }

  public void setpFUST(@javax.annotation.Nullable BigDecimal pFUST) {
    this.pFUST = pFUST;
  }


  public NfcomSefazFUST vFUST(@javax.annotation.Nullable BigDecimal vFUST) {
    this.vFUST = vFUST;
    return this;
  }

  /**
   * Valor do FUST.
   * minimum: 0
   * @return vFUST
   */
  @javax.annotation.Nullable
  public BigDecimal getvFUST() {
    return vFUST;
  }

  public void setvFUST(@javax.annotation.Nullable BigDecimal vFUST) {
    this.vFUST = vFUST;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfcomSefazFUST nfcomSefazFUST = (NfcomSefazFUST) o;
    return Objects.equals(this.vBC, nfcomSefazFUST.vBC) &&
        Objects.equals(this.pFUST, nfcomSefazFUST.pFUST) &&
        Objects.equals(this.vFUST, nfcomSefazFUST.vFUST);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vBC, pFUST, vFUST);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NfcomSefazFUST {\n");
    sb.append("    vBC: ").append(toIndentedString(vBC)).append("\n");
    sb.append("    pFUST: ").append(toIndentedString(pFUST)).append("\n");
    sb.append("    vFUST: ").append(toIndentedString(vFUST)).append("\n");
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
    openapiFields.add("pFUST");
    openapiFields.add("vFUST");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("vBC");
    openapiRequiredFields.add("pFUST");
    openapiRequiredFields.add("vFUST");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfcomSefazFUST
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfcomSefazFUST.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfcomSefazFUST is not found in the empty JSON string", NfcomSefazFUST.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfcomSefazFUST.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfcomSefazFUST` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NfcomSefazFUST.openapiRequiredFields) {
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
       if (!NfcomSefazFUST.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfcomSefazFUST' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfcomSefazFUST> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfcomSefazFUST.class));

       return (TypeAdapter<T>) new TypeAdapter<NfcomSefazFUST>() {
           @Override
           public void write(JsonWriter out, NfcomSefazFUST value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfcomSefazFUST read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfcomSefazFUST given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfcomSefazFUST
   * @throws IOException if the JSON string is invalid with respect to NfcomSefazFUST
   */
  public static NfcomSefazFUST fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfcomSefazFUST.class);
  }

  /**
   * Convert an instance of NfcomSefazFUST to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

