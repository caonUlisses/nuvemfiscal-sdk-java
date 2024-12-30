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
 * Autorizados para download do XML do DF-e.  Informar CNPJ ou CPF. Preencher os zeros não significativos.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfcomSefazAutXML {
  public static final String SERIALIZED_NAME_C_N_P_J = "CNPJ";
  @SerializedName(SERIALIZED_NAME_C_N_P_J)
  @javax.annotation.Nullable
  private String CNPJ;

  public static final String SERIALIZED_NAME_C_P_F = "CPF";
  @SerializedName(SERIALIZED_NAME_C_P_F)
  @javax.annotation.Nullable
  private String CPF;

  public NfcomSefazAutXML() {
  }

  public NfcomSefazAutXML CNPJ(@javax.annotation.Nullable String CNPJ) {
    this.CNPJ = CNPJ;
    return this;
  }

  /**
   * CNPJ do autorizado.  Informar zeros não significativos.
   * @return CNPJ
   */
  @javax.annotation.Nullable
  public String getCNPJ() {
    return CNPJ;
  }

  public void setCNPJ(@javax.annotation.Nullable String CNPJ) {
    this.CNPJ = CNPJ;
  }


  public NfcomSefazAutXML CPF(@javax.annotation.Nullable String CPF) {
    this.CPF = CPF;
    return this;
  }

  /**
   * CPF do autorizado.  Informar zeros não significativos.
   * @return CPF
   */
  @javax.annotation.Nullable
  public String getCPF() {
    return CPF;
  }

  public void setCPF(@javax.annotation.Nullable String CPF) {
    this.CPF = CPF;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfcomSefazAutXML nfcomSefazAutXML = (NfcomSefazAutXML) o;
    return Objects.equals(this.CNPJ, nfcomSefazAutXML.CNPJ) &&
        Objects.equals(this.CPF, nfcomSefazAutXML.CPF);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(CNPJ, CPF);
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
    sb.append("class NfcomSefazAutXML {\n");
    sb.append("    CNPJ: ").append(toIndentedString(CNPJ)).append("\n");
    sb.append("    CPF: ").append(toIndentedString(CPF)).append("\n");
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
    openapiFields.add("CNPJ");
    openapiFields.add("CPF");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfcomSefazAutXML
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfcomSefazAutXML.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfcomSefazAutXML is not found in the empty JSON string", NfcomSefazAutXML.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfcomSefazAutXML.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfcomSefazAutXML` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("CNPJ") != null && !jsonObj.get("CNPJ").isJsonNull()) && !jsonObj.get("CNPJ").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CNPJ` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CNPJ").toString()));
      }
      if ((jsonObj.get("CPF") != null && !jsonObj.get("CPF").isJsonNull()) && !jsonObj.get("CPF").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CPF` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CPF").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NfcomSefazAutXML.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfcomSefazAutXML' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfcomSefazAutXML> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfcomSefazAutXML.class));

       return (TypeAdapter<T>) new TypeAdapter<NfcomSefazAutXML>() {
           @Override
           public void write(JsonWriter out, NfcomSefazAutXML value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfcomSefazAutXML read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfcomSefazAutXML given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfcomSefazAutXML
   * @throws IOException if the JSON string is invalid with respect to NfcomSefazAutXML
   */
  public static NfcomSefazAutXML fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfcomSefazAutXML.class);
  }

  /**
   * Convert an instance of NfcomSefazAutXML to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

