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
 * Grupo a ser informado nas vendas interestarduais para consumidor final, não contribuinte de ICMS.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfeSefazICMSUFDest {
  public static final String SERIALIZED_NAME_V_B_C_U_F_DEST = "vBCUFDest";
  @SerializedName(SERIALIZED_NAME_V_B_C_U_F_DEST)
  @javax.annotation.Nullable
  private BigDecimal vBCUFDest;

  public static final String SERIALIZED_NAME_V_B_C_F_C_P_U_F_DEST = "vBCFCPUFDest";
  @SerializedName(SERIALIZED_NAME_V_B_C_F_C_P_U_F_DEST)
  @javax.annotation.Nullable
  private BigDecimal vBCFCPUFDest;

  public static final String SERIALIZED_NAME_P_F_C_P_U_F_DEST = "pFCPUFDest";
  @SerializedName(SERIALIZED_NAME_P_F_C_P_U_F_DEST)
  @javax.annotation.Nullable
  private BigDecimal pFCPUFDest;

  public static final String SERIALIZED_NAME_P_I_C_M_S_U_F_DEST = "pICMSUFDest";
  @SerializedName(SERIALIZED_NAME_P_I_C_M_S_U_F_DEST)
  @javax.annotation.Nullable
  private BigDecimal pICMSUFDest;

  public static final String SERIALIZED_NAME_P_I_C_M_S_INTER = "pICMSInter";
  @SerializedName(SERIALIZED_NAME_P_I_C_M_S_INTER)
  @javax.annotation.Nullable
  private BigDecimal pICMSInter;

  public static final String SERIALIZED_NAME_P_I_C_M_S_INTER_PART = "pICMSInterPart";
  @SerializedName(SERIALIZED_NAME_P_I_C_M_S_INTER_PART)
  @javax.annotation.Nullable
  private BigDecimal pICMSInterPart;

  public static final String SERIALIZED_NAME_V_F_C_P_U_F_DEST = "vFCPUFDest";
  @SerializedName(SERIALIZED_NAME_V_F_C_P_U_F_DEST)
  @javax.annotation.Nullable
  private BigDecimal vFCPUFDest;

  public static final String SERIALIZED_NAME_V_I_C_M_S_U_F_DEST = "vICMSUFDest";
  @SerializedName(SERIALIZED_NAME_V_I_C_M_S_U_F_DEST)
  @javax.annotation.Nullable
  private BigDecimal vICMSUFDest;

  public static final String SERIALIZED_NAME_V_I_C_M_S_U_F_REMET = "vICMSUFRemet";
  @SerializedName(SERIALIZED_NAME_V_I_C_M_S_U_F_REMET)
  @javax.annotation.Nullable
  private BigDecimal vICMSUFRemet;

  public NfeSefazICMSUFDest() {
  }

  public NfeSefazICMSUFDest vBCUFDest(@javax.annotation.Nullable BigDecimal vBCUFDest) {
    this.vBCUFDest = vBCUFDest;
    return this;
  }

  /**
   * Valor da Base de Cálculo do ICMS na UF do destinatário.
   * minimum: 0
   * @return vBCUFDest
   */
  @javax.annotation.Nullable
  public BigDecimal getvBCUFDest() {
    return vBCUFDest;
  }

  public void setvBCUFDest(@javax.annotation.Nullable BigDecimal vBCUFDest) {
    this.vBCUFDest = vBCUFDest;
  }


  public NfeSefazICMSUFDest vBCFCPUFDest(@javax.annotation.Nullable BigDecimal vBCFCPUFDest) {
    this.vBCFCPUFDest = vBCFCPUFDest;
    return this;
  }

  /**
   * Valor da Base de Cálculo do FCP na UF do destinatário.
   * minimum: 0
   * @return vBCFCPUFDest
   */
  @javax.annotation.Nullable
  public BigDecimal getvBCFCPUFDest() {
    return vBCFCPUFDest;
  }

  public void setvBCFCPUFDest(@javax.annotation.Nullable BigDecimal vBCFCPUFDest) {
    this.vBCFCPUFDest = vBCFCPUFDest;
  }


  public NfeSefazICMSUFDest pFCPUFDest(@javax.annotation.Nullable BigDecimal pFCPUFDest) {
    this.pFCPUFDest = pFCPUFDest;
    return this;
  }

  /**
   * Percentual adicional inserido na alíquota interna da UF de destino, relativo ao Fundo de Combate à Pobreza (FCP) naquela UF.
   * minimum: 0
   * @return pFCPUFDest
   */
  @javax.annotation.Nullable
  public BigDecimal getpFCPUFDest() {
    return pFCPUFDest;
  }

  public void setpFCPUFDest(@javax.annotation.Nullable BigDecimal pFCPUFDest) {
    this.pFCPUFDest = pFCPUFDest;
  }


  public NfeSefazICMSUFDest pICMSUFDest(@javax.annotation.Nullable BigDecimal pICMSUFDest) {
    this.pICMSUFDest = pICMSUFDest;
    return this;
  }

  /**
   * Alíquota adotada nas operações internas na UF do destinatário para o produto / mercadoria.
   * minimum: 0
   * @return pICMSUFDest
   */
  @javax.annotation.Nullable
  public BigDecimal getpICMSUFDest() {
    return pICMSUFDest;
  }

  public void setpICMSUFDest(@javax.annotation.Nullable BigDecimal pICMSUFDest) {
    this.pICMSUFDest = pICMSUFDest;
  }


  public NfeSefazICMSUFDest pICMSInter(@javax.annotation.Nullable BigDecimal pICMSInter) {
    this.pICMSInter = pICMSInter;
    return this;
  }

  /**
   * Alíquota interestadual das UF envolvidas:  * 4%% alíquota interestadual para produtos importados  * 7%% para os Estados de origem do Sul e Sudeste (exceto ES), destinado para os Estados do Norte e Nordeste  ou ES  * 12%% para os demais casos.
   * minimum: 0
   * @return pICMSInter
   */
  @javax.annotation.Nullable
  public BigDecimal getpICMSInter() {
    return pICMSInter;
  }

  public void setpICMSInter(@javax.annotation.Nullable BigDecimal pICMSInter) {
    this.pICMSInter = pICMSInter;
  }


  public NfeSefazICMSUFDest pICMSInterPart(@javax.annotation.Nullable BigDecimal pICMSInterPart) {
    this.pICMSInterPart = pICMSInterPart;
    return this;
  }

  /**
   * Percentual de partilha para a UF do destinatário:  * 40%% em 2016  * 60%% em 2017  * 80%% em 2018  * 100%% a partir de 2019.
   * minimum: 0
   * @return pICMSInterPart
   */
  @javax.annotation.Nullable
  public BigDecimal getpICMSInterPart() {
    return pICMSInterPart;
  }

  public void setpICMSInterPart(@javax.annotation.Nullable BigDecimal pICMSInterPart) {
    this.pICMSInterPart = pICMSInterPart;
  }


  public NfeSefazICMSUFDest vFCPUFDest(@javax.annotation.Nullable BigDecimal vFCPUFDest) {
    this.vFCPUFDest = vFCPUFDest;
    return this;
  }

  /**
   * Valor do ICMS relativo ao Fundo de Combate à Pobreza (FCP) da UF de destino.
   * minimum: 0
   * @return vFCPUFDest
   */
  @javax.annotation.Nullable
  public BigDecimal getvFCPUFDest() {
    return vFCPUFDest;
  }

  public void setvFCPUFDest(@javax.annotation.Nullable BigDecimal vFCPUFDest) {
    this.vFCPUFDest = vFCPUFDest;
  }


  public NfeSefazICMSUFDest vICMSUFDest(@javax.annotation.Nullable BigDecimal vICMSUFDest) {
    this.vICMSUFDest = vICMSUFDest;
    return this;
  }

  /**
   * Valor do ICMS de partilha para a UF do destinatário.
   * minimum: 0
   * @return vICMSUFDest
   */
  @javax.annotation.Nullable
  public BigDecimal getvICMSUFDest() {
    return vICMSUFDest;
  }

  public void setvICMSUFDest(@javax.annotation.Nullable BigDecimal vICMSUFDest) {
    this.vICMSUFDest = vICMSUFDest;
  }


  public NfeSefazICMSUFDest vICMSUFRemet(@javax.annotation.Nullable BigDecimal vICMSUFRemet) {
    this.vICMSUFRemet = vICMSUFRemet;
    return this;
  }

  /**
   * Valor do ICMS de partilha para a UF do remetente. Nota: A partir de 2019, este valor será zero.
   * minimum: 0
   * @return vICMSUFRemet
   */
  @javax.annotation.Nullable
  public BigDecimal getvICMSUFRemet() {
    return vICMSUFRemet;
  }

  public void setvICMSUFRemet(@javax.annotation.Nullable BigDecimal vICMSUFRemet) {
    this.vICMSUFRemet = vICMSUFRemet;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfeSefazICMSUFDest nfeSefazICMSUFDest = (NfeSefazICMSUFDest) o;
    return Objects.equals(this.vBCUFDest, nfeSefazICMSUFDest.vBCUFDest) &&
        Objects.equals(this.vBCFCPUFDest, nfeSefazICMSUFDest.vBCFCPUFDest) &&
        Objects.equals(this.pFCPUFDest, nfeSefazICMSUFDest.pFCPUFDest) &&
        Objects.equals(this.pICMSUFDest, nfeSefazICMSUFDest.pICMSUFDest) &&
        Objects.equals(this.pICMSInter, nfeSefazICMSUFDest.pICMSInter) &&
        Objects.equals(this.pICMSInterPart, nfeSefazICMSUFDest.pICMSInterPart) &&
        Objects.equals(this.vFCPUFDest, nfeSefazICMSUFDest.vFCPUFDest) &&
        Objects.equals(this.vICMSUFDest, nfeSefazICMSUFDest.vICMSUFDest) &&
        Objects.equals(this.vICMSUFRemet, nfeSefazICMSUFDest.vICMSUFRemet);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(vBCUFDest, vBCFCPUFDest, pFCPUFDest, pICMSUFDest, pICMSInter, pICMSInterPart, vFCPUFDest, vICMSUFDest, vICMSUFRemet);
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
    sb.append("class NfeSefazICMSUFDest {\n");
    sb.append("    vBCUFDest: ").append(toIndentedString(vBCUFDest)).append("\n");
    sb.append("    vBCFCPUFDest: ").append(toIndentedString(vBCFCPUFDest)).append("\n");
    sb.append("    pFCPUFDest: ").append(toIndentedString(pFCPUFDest)).append("\n");
    sb.append("    pICMSUFDest: ").append(toIndentedString(pICMSUFDest)).append("\n");
    sb.append("    pICMSInter: ").append(toIndentedString(pICMSInter)).append("\n");
    sb.append("    pICMSInterPart: ").append(toIndentedString(pICMSInterPart)).append("\n");
    sb.append("    vFCPUFDest: ").append(toIndentedString(vFCPUFDest)).append("\n");
    sb.append("    vICMSUFDest: ").append(toIndentedString(vICMSUFDest)).append("\n");
    sb.append("    vICMSUFRemet: ").append(toIndentedString(vICMSUFRemet)).append("\n");
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
    openapiFields.add("vBCUFDest");
    openapiFields.add("vBCFCPUFDest");
    openapiFields.add("pFCPUFDest");
    openapiFields.add("pICMSUFDest");
    openapiFields.add("pICMSInter");
    openapiFields.add("pICMSInterPart");
    openapiFields.add("vFCPUFDest");
    openapiFields.add("vICMSUFDest");
    openapiFields.add("vICMSUFRemet");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("vBCUFDest");
    openapiRequiredFields.add("pICMSUFDest");
    openapiRequiredFields.add("pICMSInter");
    openapiRequiredFields.add("pICMSInterPart");
    openapiRequiredFields.add("vICMSUFDest");
    openapiRequiredFields.add("vICMSUFRemet");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfeSefazICMSUFDest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfeSefazICMSUFDest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfeSefazICMSUFDest is not found in the empty JSON string", NfeSefazICMSUFDest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfeSefazICMSUFDest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfeSefazICMSUFDest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NfeSefazICMSUFDest.openapiRequiredFields) {
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
       if (!NfeSefazICMSUFDest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfeSefazICMSUFDest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfeSefazICMSUFDest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfeSefazICMSUFDest.class));

       return (TypeAdapter<T>) new TypeAdapter<NfeSefazICMSUFDest>() {
           @Override
           public void write(JsonWriter out, NfeSefazICMSUFDest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfeSefazICMSUFDest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfeSefazICMSUFDest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfeSefazICMSUFDest
   * @throws IOException if the JSON string is invalid with respect to NfeSefazICMSUFDest
   */
  public static NfeSefazICMSUFDest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfeSefazICMSUFDest.class);
  }

  /**
   * Convert an instance of NfeSefazICMSUFDest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

