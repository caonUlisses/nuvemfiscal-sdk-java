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
import io.github.com.caonulisses.nuvemfiscalsdk.model.NfeSefazImpostoDevolIPI;

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
 * NfeSefazImpostoDevol
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfeSefazImpostoDevol {
  public static final String SERIALIZED_NAME_P_DEVOL = "pDevol";
  @SerializedName(SERIALIZED_NAME_P_DEVOL)
  @javax.annotation.Nullable
  private BigDecimal pDevol;

  public static final String SERIALIZED_NAME_I_P_I = "IPI";
  @SerializedName(SERIALIZED_NAME_I_P_I)
  @javax.annotation.Nonnull
  private NfeSefazImpostoDevolIPI IPI;

  public NfeSefazImpostoDevol() {
  }

  public NfeSefazImpostoDevol pDevol(@javax.annotation.Nullable BigDecimal pDevol) {
    this.pDevol = pDevol;
    return this;
  }

  /**
   * Percentual de mercadoria devolvida.
   * minimum: 0
   * maximum: 1E+2
   * @return pDevol
   */
  @javax.annotation.Nullable
  public BigDecimal getpDevol() {
    return pDevol;
  }

  public void setpDevol(@javax.annotation.Nullable BigDecimal pDevol) {
    this.pDevol = pDevol;
  }


  public NfeSefazImpostoDevol IPI(@javax.annotation.Nonnull NfeSefazImpostoDevolIPI IPI) {
    this.IPI = IPI;
    return this;
  }

  /**
   * Get IPI
   * @return IPI
   */
  @javax.annotation.Nonnull
  public NfeSefazImpostoDevolIPI getIPI() {
    return IPI;
  }

  public void setIPI(@javax.annotation.Nonnull NfeSefazImpostoDevolIPI IPI) {
    this.IPI = IPI;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfeSefazImpostoDevol nfeSefazImpostoDevol = (NfeSefazImpostoDevol) o;
    return Objects.equals(this.pDevol, nfeSefazImpostoDevol.pDevol) &&
        Objects.equals(this.IPI, nfeSefazImpostoDevol.IPI);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pDevol, IPI);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NfeSefazImpostoDevol {\n");
    sb.append("    pDevol: ").append(toIndentedString(pDevol)).append("\n");
    sb.append("    IPI: ").append(toIndentedString(IPI)).append("\n");
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
    openapiFields.add("pDevol");
    openapiFields.add("IPI");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pDevol");
    openapiRequiredFields.add("IPI");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfeSefazImpostoDevol
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfeSefazImpostoDevol.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfeSefazImpostoDevol is not found in the empty JSON string", NfeSefazImpostoDevol.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfeSefazImpostoDevol.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfeSefazImpostoDevol` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NfeSefazImpostoDevol.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `IPI`
      NfeSefazImpostoDevolIPI.validateJsonElement(jsonObj.get("IPI"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NfeSefazImpostoDevol.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfeSefazImpostoDevol' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfeSefazImpostoDevol> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfeSefazImpostoDevol.class));

       return (TypeAdapter<T>) new TypeAdapter<NfeSefazImpostoDevol>() {
           @Override
           public void write(JsonWriter out, NfeSefazImpostoDevol value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfeSefazImpostoDevol read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfeSefazImpostoDevol given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfeSefazImpostoDevol
   * @throws IOException if the JSON string is invalid with respect to NfeSefazImpostoDevol
   */
  public static NfeSefazImpostoDevol fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfeSefazImpostoDevol.class);
  }

  /**
   * Convert an instance of NfeSefazImpostoDevol to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

