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

import io.github.com.caonulisses.nuvemfiscalsdk.JSON;

/**
 * NfeSefazIPITrib
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfeSefazIPITrib {
  public static final String SERIALIZED_NAME_C_S_T = "CST";
  @SerializedName(SERIALIZED_NAME_C_S_T)
  @javax.annotation.Nullable
  private String CST;

  public static final String SERIALIZED_NAME_V_B_C = "vBC";
  @SerializedName(SERIALIZED_NAME_V_B_C)
  @javax.annotation.Nullable
  private BigDecimal vBC;

  public static final String SERIALIZED_NAME_P_I_P_I = "pIPI";
  @SerializedName(SERIALIZED_NAME_P_I_P_I)
  @javax.annotation.Nullable
  private BigDecimal pIPI;

  public static final String SERIALIZED_NAME_Q_UNID = "qUnid";
  @SerializedName(SERIALIZED_NAME_Q_UNID)
  @javax.annotation.Nullable
  private BigDecimal qUnid;

  public static final String SERIALIZED_NAME_V_UNID = "vUnid";
  @SerializedName(SERIALIZED_NAME_V_UNID)
  @javax.annotation.Nullable
  private BigDecimal vUnid;

  public static final String SERIALIZED_NAME_V_I_P_I = "vIPI";
  @SerializedName(SERIALIZED_NAME_V_I_P_I)
  @javax.annotation.Nullable
  private BigDecimal vIPI;

  public NfeSefazIPITrib() {
  }

  public NfeSefazIPITrib CST(@javax.annotation.Nullable String CST) {
    this.CST = CST;
    return this;
  }

  /**
   * Código da Situação Tributária do IPI:  * 00 - Entrada com recuperação de crédito  * 49 - Outras entradas  * 50 - Saída tributada  * 99 - Outras saídas
   * @return CST
   */
  @javax.annotation.Nullable
  public String getCST() {
    return CST;
  }

  public void setCST(@javax.annotation.Nullable String CST) {
    this.CST = CST;
  }


  public NfeSefazIPITrib vBC(@javax.annotation.Nullable BigDecimal vBC) {
    this.vBC = vBC;
    return this;
  }

  /**
   * Valor da BC do IPI.
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


  public NfeSefazIPITrib pIPI(@javax.annotation.Nullable BigDecimal pIPI) {
    this.pIPI = pIPI;
    return this;
  }

  /**
   * Alíquota do IPI.
   * minimum: 0
   * @return pIPI
   */
  @javax.annotation.Nullable
  public BigDecimal getpIPI() {
    return pIPI;
  }

  public void setpIPI(@javax.annotation.Nullable BigDecimal pIPI) {
    this.pIPI = pIPI;
  }


  public NfeSefazIPITrib qUnid(@javax.annotation.Nullable BigDecimal qUnid) {
    this.qUnid = qUnid;
    return this;
  }

  /**
   * Quantidade total na unidade padrão para tributação.
   * minimum: 0
   * @return qUnid
   */
  @javax.annotation.Nullable
  public BigDecimal getqUnid() {
    return qUnid;
  }

  public void setqUnid(@javax.annotation.Nullable BigDecimal qUnid) {
    this.qUnid = qUnid;
  }


  public NfeSefazIPITrib vUnid(@javax.annotation.Nullable BigDecimal vUnid) {
    this.vUnid = vUnid;
    return this;
  }

  /**
   * Valor por Unidade Tributável. Informar o valor do imposto Pauta por unidade de medida.
   * minimum: 0
   * @return vUnid
   */
  @javax.annotation.Nullable
  public BigDecimal getvUnid() {
    return vUnid;
  }

  public void setvUnid(@javax.annotation.Nullable BigDecimal vUnid) {
    this.vUnid = vUnid;
  }


  public NfeSefazIPITrib vIPI(@javax.annotation.Nullable BigDecimal vIPI) {
    this.vIPI = vIPI;
    return this;
  }

  /**
   * Valor do IPI.
   * minimum: 0
   * @return vIPI
   */
  @javax.annotation.Nullable
  public BigDecimal getvIPI() {
    return vIPI;
  }

  public void setvIPI(@javax.annotation.Nullable BigDecimal vIPI) {
    this.vIPI = vIPI;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfeSefazIPITrib nfeSefazIPITrib = (NfeSefazIPITrib) o;
    return Objects.equals(this.CST, nfeSefazIPITrib.CST) &&
        Objects.equals(this.vBC, nfeSefazIPITrib.vBC) &&
        Objects.equals(this.pIPI, nfeSefazIPITrib.pIPI) &&
        Objects.equals(this.qUnid, nfeSefazIPITrib.qUnid) &&
        Objects.equals(this.vUnid, nfeSefazIPITrib.vUnid) &&
        Objects.equals(this.vIPI, nfeSefazIPITrib.vIPI);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(CST, vBC, pIPI, qUnid, vUnid, vIPI);
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
    sb.append("class NfeSefazIPITrib {\n");
    sb.append("    CST: ").append(toIndentedString(CST)).append("\n");
    sb.append("    vBC: ").append(toIndentedString(vBC)).append("\n");
    sb.append("    pIPI: ").append(toIndentedString(pIPI)).append("\n");
    sb.append("    qUnid: ").append(toIndentedString(qUnid)).append("\n");
    sb.append("    vUnid: ").append(toIndentedString(vUnid)).append("\n");
    sb.append("    vIPI: ").append(toIndentedString(vIPI)).append("\n");
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
    openapiFields.add("pIPI");
    openapiFields.add("qUnid");
    openapiFields.add("vUnid");
    openapiFields.add("vIPI");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("CST");
    openapiRequiredFields.add("vIPI");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfeSefazIPITrib
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfeSefazIPITrib.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfeSefazIPITrib is not found in the empty JSON string", NfeSefazIPITrib.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfeSefazIPITrib.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfeSefazIPITrib` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NfeSefazIPITrib.openapiRequiredFields) {
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
       if (!NfeSefazIPITrib.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfeSefazIPITrib' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfeSefazIPITrib> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfeSefazIPITrib.class));

       return (TypeAdapter<T>) new TypeAdapter<NfeSefazIPITrib>() {
           @Override
           public void write(JsonWriter out, NfeSefazIPITrib value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfeSefazIPITrib read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfeSefazIPITrib given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfeSefazIPITrib
   * @throws IOException if the JSON string is invalid with respect to NfeSefazIPITrib
   */
  public static NfeSefazIPITrib fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfeSefazIPITrib.class);
  }

  /**
   * Convert an instance of NfeSefazIPITrib to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

