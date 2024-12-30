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
 * Dados da retenção  ICMS do Transporte.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfeSefazRetTransp {
  public static final String SERIALIZED_NAME_V_SERV = "vServ";
  @SerializedName(SERIALIZED_NAME_V_SERV)
  @javax.annotation.Nullable
  private BigDecimal vServ;

  public static final String SERIALIZED_NAME_V_B_C_RET = "vBCRet";
  @SerializedName(SERIALIZED_NAME_V_B_C_RET)
  @javax.annotation.Nullable
  private BigDecimal vBCRet;

  public static final String SERIALIZED_NAME_P_I_C_M_S_RET = "pICMSRet";
  @SerializedName(SERIALIZED_NAME_P_I_C_M_S_RET)
  @javax.annotation.Nullable
  private BigDecimal pICMSRet;

  public static final String SERIALIZED_NAME_V_I_C_M_S_RET = "vICMSRet";
  @SerializedName(SERIALIZED_NAME_V_I_C_M_S_RET)
  @javax.annotation.Nullable
  private BigDecimal vICMSRet;

  public static final String SERIALIZED_NAME_C_F_O_P = "CFOP";
  @SerializedName(SERIALIZED_NAME_C_F_O_P)
  @javax.annotation.Nullable
  private String CFOP;

  public static final String SERIALIZED_NAME_C_MUN_F_G = "cMunFG";
  @SerializedName(SERIALIZED_NAME_C_MUN_F_G)
  @javax.annotation.Nullable
  private String cMunFG;

  public NfeSefazRetTransp() {
  }

  public NfeSefazRetTransp vServ(@javax.annotation.Nullable BigDecimal vServ) {
    this.vServ = vServ;
    return this;
  }

  /**
   * Valor do Serviço.
   * minimum: 0
   * @return vServ
   */
  @javax.annotation.Nullable
  public BigDecimal getvServ() {
    return vServ;
  }

  public void setvServ(@javax.annotation.Nullable BigDecimal vServ) {
    this.vServ = vServ;
  }


  public NfeSefazRetTransp vBCRet(@javax.annotation.Nullable BigDecimal vBCRet) {
    this.vBCRet = vBCRet;
    return this;
  }

  /**
   * BC da Retenção do ICMS.
   * minimum: 0
   * @return vBCRet
   */
  @javax.annotation.Nullable
  public BigDecimal getvBCRet() {
    return vBCRet;
  }

  public void setvBCRet(@javax.annotation.Nullable BigDecimal vBCRet) {
    this.vBCRet = vBCRet;
  }


  public NfeSefazRetTransp pICMSRet(@javax.annotation.Nullable BigDecimal pICMSRet) {
    this.pICMSRet = pICMSRet;
    return this;
  }

  /**
   * Alíquota da Retenção.
   * minimum: 0
   * @return pICMSRet
   */
  @javax.annotation.Nullable
  public BigDecimal getpICMSRet() {
    return pICMSRet;
  }

  public void setpICMSRet(@javax.annotation.Nullable BigDecimal pICMSRet) {
    this.pICMSRet = pICMSRet;
  }


  public NfeSefazRetTransp vICMSRet(@javax.annotation.Nullable BigDecimal vICMSRet) {
    this.vICMSRet = vICMSRet;
    return this;
  }

  /**
   * Valor do ICMS Retido.
   * minimum: 0
   * @return vICMSRet
   */
  @javax.annotation.Nullable
  public BigDecimal getvICMSRet() {
    return vICMSRet;
  }

  public void setvICMSRet(@javax.annotation.Nullable BigDecimal vICMSRet) {
    this.vICMSRet = vICMSRet;
  }


  public NfeSefazRetTransp CFOP(@javax.annotation.Nullable String CFOP) {
    this.CFOP = CFOP;
    return this;
  }

  /**
   * Código Fiscal de Operações e Prestações.
   * @return CFOP
   */
  @javax.annotation.Nullable
  public String getCFOP() {
    return CFOP;
  }

  public void setCFOP(@javax.annotation.Nullable String CFOP) {
    this.CFOP = CFOP;
  }


  public NfeSefazRetTransp cMunFG(@javax.annotation.Nullable String cMunFG) {
    this.cMunFG = cMunFG;
    return this;
  }

  /**
   * Código do Município de Ocorrência do Fato Gerador (utilizar a tabela do IBGE).
   * @return cMunFG
   */
  @javax.annotation.Nullable
  public String getcMunFG() {
    return cMunFG;
  }

  public void setcMunFG(@javax.annotation.Nullable String cMunFG) {
    this.cMunFG = cMunFG;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfeSefazRetTransp nfeSefazRetTransp = (NfeSefazRetTransp) o;
    return Objects.equals(this.vServ, nfeSefazRetTransp.vServ) &&
        Objects.equals(this.vBCRet, nfeSefazRetTransp.vBCRet) &&
        Objects.equals(this.pICMSRet, nfeSefazRetTransp.pICMSRet) &&
        Objects.equals(this.vICMSRet, nfeSefazRetTransp.vICMSRet) &&
        Objects.equals(this.CFOP, nfeSefazRetTransp.CFOP) &&
        Objects.equals(this.cMunFG, nfeSefazRetTransp.cMunFG);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vServ, vBCRet, pICMSRet, vICMSRet, CFOP, cMunFG);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NfeSefazRetTransp {\n");
    sb.append("    vServ: ").append(toIndentedString(vServ)).append("\n");
    sb.append("    vBCRet: ").append(toIndentedString(vBCRet)).append("\n");
    sb.append("    pICMSRet: ").append(toIndentedString(pICMSRet)).append("\n");
    sb.append("    vICMSRet: ").append(toIndentedString(vICMSRet)).append("\n");
    sb.append("    CFOP: ").append(toIndentedString(CFOP)).append("\n");
    sb.append("    cMunFG: ").append(toIndentedString(cMunFG)).append("\n");
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
    openapiFields.add("vServ");
    openapiFields.add("vBCRet");
    openapiFields.add("pICMSRet");
    openapiFields.add("vICMSRet");
    openapiFields.add("CFOP");
    openapiFields.add("cMunFG");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("vServ");
    openapiRequiredFields.add("vBCRet");
    openapiRequiredFields.add("pICMSRet");
    openapiRequiredFields.add("vICMSRet");
    openapiRequiredFields.add("CFOP");
    openapiRequiredFields.add("cMunFG");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfeSefazRetTransp
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfeSefazRetTransp.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfeSefazRetTransp is not found in the empty JSON string", NfeSefazRetTransp.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfeSefazRetTransp.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfeSefazRetTransp` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NfeSefazRetTransp.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("CFOP") != null && !jsonObj.get("CFOP").isJsonNull()) && !jsonObj.get("CFOP").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CFOP` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CFOP").toString()));
      }
      if ((jsonObj.get("cMunFG") != null && !jsonObj.get("cMunFG").isJsonNull()) && !jsonObj.get("cMunFG").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cMunFG` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cMunFG").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NfeSefazRetTransp.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfeSefazRetTransp' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfeSefazRetTransp> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfeSefazRetTransp.class));

       return (TypeAdapter<T>) new TypeAdapter<NfeSefazRetTransp>() {
           @Override
           public void write(JsonWriter out, NfeSefazRetTransp value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfeSefazRetTransp read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfeSefazRetTransp given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfeSefazRetTransp
   * @throws IOException if the JSON string is invalid with respect to NfeSefazRetTransp
   */
  public static NfeSefazRetTransp fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfeSefazRetTransp.class);
  }

  /**
   * Convert an instance of NfeSefazRetTransp to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

