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
 * Tributação pelo ICMS  * 60 - ICMS cobrado anteriormente por substituição tributária
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfeSefazICMS60 {
  public static final String SERIALIZED_NAME_ORIG = "orig";
  @SerializedName(SERIALIZED_NAME_ORIG)
  @javax.annotation.Nullable
  private Integer orig;

  public static final String SERIALIZED_NAME_C_S_T = "CST";
  @SerializedName(SERIALIZED_NAME_C_S_T)
  @javax.annotation.Nullable
  private String CST;

  public static final String SERIALIZED_NAME_V_B_C_S_T_RET = "vBCSTRet";
  @SerializedName(SERIALIZED_NAME_V_B_C_S_T_RET)
  @javax.annotation.Nullable
  private BigDecimal vBCSTRet;

  public static final String SERIALIZED_NAME_P_S_T = "pST";
  @SerializedName(SERIALIZED_NAME_P_S_T)
  @javax.annotation.Nullable
  private BigDecimal pST;

  public static final String SERIALIZED_NAME_V_I_C_M_S_SUBSTITUTO = "vICMSSubstituto";
  @SerializedName(SERIALIZED_NAME_V_I_C_M_S_SUBSTITUTO)
  @javax.annotation.Nullable
  private BigDecimal vICMSSubstituto;

  public static final String SERIALIZED_NAME_V_I_C_M_S_S_T_RET = "vICMSSTRet";
  @SerializedName(SERIALIZED_NAME_V_I_C_M_S_S_T_RET)
  @javax.annotation.Nullable
  private BigDecimal vICMSSTRet;

  public static final String SERIALIZED_NAME_V_B_C_F_C_P_S_T_RET = "vBCFCPSTRet";
  @SerializedName(SERIALIZED_NAME_V_B_C_F_C_P_S_T_RET)
  @javax.annotation.Nullable
  private BigDecimal vBCFCPSTRet;

  public static final String SERIALIZED_NAME_P_F_C_P_S_T_RET = "pFCPSTRet";
  @SerializedName(SERIALIZED_NAME_P_F_C_P_S_T_RET)
  @javax.annotation.Nullable
  private BigDecimal pFCPSTRet;

  public static final String SERIALIZED_NAME_V_F_C_P_S_T_RET = "vFCPSTRet";
  @SerializedName(SERIALIZED_NAME_V_F_C_P_S_T_RET)
  @javax.annotation.Nullable
  private BigDecimal vFCPSTRet;

  public static final String SERIALIZED_NAME_P_RED_B_C_EFET = "pRedBCEfet";
  @SerializedName(SERIALIZED_NAME_P_RED_B_C_EFET)
  @javax.annotation.Nullable
  private BigDecimal pRedBCEfet;

  public static final String SERIALIZED_NAME_V_B_C_EFET = "vBCEfet";
  @SerializedName(SERIALIZED_NAME_V_B_C_EFET)
  @javax.annotation.Nullable
  private BigDecimal vBCEfet;

  public static final String SERIALIZED_NAME_P_I_C_M_S_EFET = "pICMSEfet";
  @SerializedName(SERIALIZED_NAME_P_I_C_M_S_EFET)
  @javax.annotation.Nullable
  private BigDecimal pICMSEfet;

  public static final String SERIALIZED_NAME_V_I_C_M_S_EFET = "vICMSEfet";
  @SerializedName(SERIALIZED_NAME_V_I_C_M_S_EFET)
  @javax.annotation.Nullable
  private BigDecimal vICMSEfet;

  public NfeSefazICMS60() {
  }

  public NfeSefazICMS60 orig(@javax.annotation.Nullable Integer orig) {
    this.orig = orig;
    return this;
  }

  /**
   * Origem da mercadoria:  * 0 - Nacional, exceto as indicadas nos códigos 3, 4, 5 e 8;  * 1 - Estrangeira - Importação direta, exceto a indicada no código 6;  * 2 - Estrangeira - Adquirida no mercado interno, exceto a indicada no código 7;  * 3 - Nacional, mercadoria ou bem com Conteúdo de Importação superior a 40%% e inferior ou igual a 70%%;  * 4 - Nacional, cuja produção tenha sido feita em conformidade com os processos produtivos básicos de que tratam as legislações citadas nos Ajustes;  * 5 - Nacional, mercadoria ou bem com Conteúdo de Importação inferior ou igual a 40%%;  * 6 - Estrangeira - Importação direta, sem similar nacional, constante em lista da CAMEX e gás natural;  * 7 - Estrangeira - Adquirida no mercado interno, sem similar nacional, constante lista CAMEX e gás natural;  * 8 - Nacional, mercadoria ou bem com Conteúdo de Importação superior a 70%%.
   * @return orig
   */
  @javax.annotation.Nullable
  public Integer getOrig() {
    return orig;
  }

  public void setOrig(@javax.annotation.Nullable Integer orig) {
    this.orig = orig;
  }


  public NfeSefazICMS60 CST(@javax.annotation.Nullable String CST) {
    this.CST = CST;
    return this;
  }

  /**
   * Tributação pelo ICMS  * 60 - ICMS cobrado anteriormente por substituição tributária
   * @return CST
   */
  @javax.annotation.Nullable
  public String getCST() {
    return CST;
  }

  public void setCST(@javax.annotation.Nullable String CST) {
    this.CST = CST;
  }


  public NfeSefazICMS60 vBCSTRet(@javax.annotation.Nullable BigDecimal vBCSTRet) {
    this.vBCSTRet = vBCSTRet;
    return this;
  }

  /**
   * Valor da BC do ICMS ST retido anteriormente.
   * minimum: 0
   * @return vBCSTRet
   */
  @javax.annotation.Nullable
  public BigDecimal getvBCSTRet() {
    return vBCSTRet;
  }

  public void setvBCSTRet(@javax.annotation.Nullable BigDecimal vBCSTRet) {
    this.vBCSTRet = vBCSTRet;
  }


  public NfeSefazICMS60 pST(@javax.annotation.Nullable BigDecimal pST) {
    this.pST = pST;
    return this;
  }

  /**
   * Aliquota suportada pelo consumidor final.
   * minimum: 0
   * @return pST
   */
  @javax.annotation.Nullable
  public BigDecimal getpST() {
    return pST;
  }

  public void setpST(@javax.annotation.Nullable BigDecimal pST) {
    this.pST = pST;
  }


  public NfeSefazICMS60 vICMSSubstituto(@javax.annotation.Nullable BigDecimal vICMSSubstituto) {
    this.vICMSSubstituto = vICMSSubstituto;
    return this;
  }

  /**
   * Valor do ICMS Próprio do Substituto cobrado em operação anterior.
   * minimum: 0
   * @return vICMSSubstituto
   */
  @javax.annotation.Nullable
  public BigDecimal getvICMSSubstituto() {
    return vICMSSubstituto;
  }

  public void setvICMSSubstituto(@javax.annotation.Nullable BigDecimal vICMSSubstituto) {
    this.vICMSSubstituto = vICMSSubstituto;
  }


  public NfeSefazICMS60 vICMSSTRet(@javax.annotation.Nullable BigDecimal vICMSSTRet) {
    this.vICMSSTRet = vICMSSTRet;
    return this;
  }

  /**
   * Valor do ICMS ST retido anteriormente.
   * minimum: 0
   * @return vICMSSTRet
   */
  @javax.annotation.Nullable
  public BigDecimal getvICMSSTRet() {
    return vICMSSTRet;
  }

  public void setvICMSSTRet(@javax.annotation.Nullable BigDecimal vICMSSTRet) {
    this.vICMSSTRet = vICMSSTRet;
  }


  public NfeSefazICMS60 vBCFCPSTRet(@javax.annotation.Nullable BigDecimal vBCFCPSTRet) {
    this.vBCFCPSTRet = vBCFCPSTRet;
    return this;
  }

  /**
   * Valor da Base de cálculo do FCP retido anteriormente por ST.
   * minimum: 0
   * @return vBCFCPSTRet
   */
  @javax.annotation.Nullable
  public BigDecimal getvBCFCPSTRet() {
    return vBCFCPSTRet;
  }

  public void setvBCFCPSTRet(@javax.annotation.Nullable BigDecimal vBCFCPSTRet) {
    this.vBCFCPSTRet = vBCFCPSTRet;
  }


  public NfeSefazICMS60 pFCPSTRet(@javax.annotation.Nullable BigDecimal pFCPSTRet) {
    this.pFCPSTRet = pFCPSTRet;
    return this;
  }

  /**
   * Percentual de FCP retido anteriormente por substituição tributária.
   * minimum: 0
   * @return pFCPSTRet
   */
  @javax.annotation.Nullable
  public BigDecimal getpFCPSTRet() {
    return pFCPSTRet;
  }

  public void setpFCPSTRet(@javax.annotation.Nullable BigDecimal pFCPSTRet) {
    this.pFCPSTRet = pFCPSTRet;
  }


  public NfeSefazICMS60 vFCPSTRet(@javax.annotation.Nullable BigDecimal vFCPSTRet) {
    this.vFCPSTRet = vFCPSTRet;
    return this;
  }

  /**
   * Valor do FCP retido por substituição tributária.
   * minimum: 0
   * @return vFCPSTRet
   */
  @javax.annotation.Nullable
  public BigDecimal getvFCPSTRet() {
    return vFCPSTRet;
  }

  public void setvFCPSTRet(@javax.annotation.Nullable BigDecimal vFCPSTRet) {
    this.vFCPSTRet = vFCPSTRet;
  }


  public NfeSefazICMS60 pRedBCEfet(@javax.annotation.Nullable BigDecimal pRedBCEfet) {
    this.pRedBCEfet = pRedBCEfet;
    return this;
  }

  /**
   * Percentual de redução da base de cálculo efetiva.
   * minimum: 0
   * @return pRedBCEfet
   */
  @javax.annotation.Nullable
  public BigDecimal getpRedBCEfet() {
    return pRedBCEfet;
  }

  public void setpRedBCEfet(@javax.annotation.Nullable BigDecimal pRedBCEfet) {
    this.pRedBCEfet = pRedBCEfet;
  }


  public NfeSefazICMS60 vBCEfet(@javax.annotation.Nullable BigDecimal vBCEfet) {
    this.vBCEfet = vBCEfet;
    return this;
  }

  /**
   * Valor da base de cálculo efetiva.
   * minimum: 0
   * @return vBCEfet
   */
  @javax.annotation.Nullable
  public BigDecimal getvBCEfet() {
    return vBCEfet;
  }

  public void setvBCEfet(@javax.annotation.Nullable BigDecimal vBCEfet) {
    this.vBCEfet = vBCEfet;
  }


  public NfeSefazICMS60 pICMSEfet(@javax.annotation.Nullable BigDecimal pICMSEfet) {
    this.pICMSEfet = pICMSEfet;
    return this;
  }

  /**
   * Alíquota do ICMS efetiva.
   * minimum: 0
   * @return pICMSEfet
   */
  @javax.annotation.Nullable
  public BigDecimal getpICMSEfet() {
    return pICMSEfet;
  }

  public void setpICMSEfet(@javax.annotation.Nullable BigDecimal pICMSEfet) {
    this.pICMSEfet = pICMSEfet;
  }


  public NfeSefazICMS60 vICMSEfet(@javax.annotation.Nullable BigDecimal vICMSEfet) {
    this.vICMSEfet = vICMSEfet;
    return this;
  }

  /**
   * Valor do ICMS efetivo.
   * minimum: 0
   * @return vICMSEfet
   */
  @javax.annotation.Nullable
  public BigDecimal getvICMSEfet() {
    return vICMSEfet;
  }

  public void setvICMSEfet(@javax.annotation.Nullable BigDecimal vICMSEfet) {
    this.vICMSEfet = vICMSEfet;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfeSefazICMS60 nfeSefazICMS60 = (NfeSefazICMS60) o;
    return Objects.equals(this.orig, nfeSefazICMS60.orig) &&
        Objects.equals(this.CST, nfeSefazICMS60.CST) &&
        Objects.equals(this.vBCSTRet, nfeSefazICMS60.vBCSTRet) &&
        Objects.equals(this.pST, nfeSefazICMS60.pST) &&
        Objects.equals(this.vICMSSubstituto, nfeSefazICMS60.vICMSSubstituto) &&
        Objects.equals(this.vICMSSTRet, nfeSefazICMS60.vICMSSTRet) &&
        Objects.equals(this.vBCFCPSTRet, nfeSefazICMS60.vBCFCPSTRet) &&
        Objects.equals(this.pFCPSTRet, nfeSefazICMS60.pFCPSTRet) &&
        Objects.equals(this.vFCPSTRet, nfeSefazICMS60.vFCPSTRet) &&
        Objects.equals(this.pRedBCEfet, nfeSefazICMS60.pRedBCEfet) &&
        Objects.equals(this.vBCEfet, nfeSefazICMS60.vBCEfet) &&
        Objects.equals(this.pICMSEfet, nfeSefazICMS60.pICMSEfet) &&
        Objects.equals(this.vICMSEfet, nfeSefazICMS60.vICMSEfet);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(orig, CST, vBCSTRet, pST, vICMSSubstituto, vICMSSTRet, vBCFCPSTRet, pFCPSTRet, vFCPSTRet, pRedBCEfet, vBCEfet, pICMSEfet, vICMSEfet);
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
    sb.append("class NfeSefazICMS60 {\n");
    sb.append("    orig: ").append(toIndentedString(orig)).append("\n");
    sb.append("    CST: ").append(toIndentedString(CST)).append("\n");
    sb.append("    vBCSTRet: ").append(toIndentedString(vBCSTRet)).append("\n");
    sb.append("    pST: ").append(toIndentedString(pST)).append("\n");
    sb.append("    vICMSSubstituto: ").append(toIndentedString(vICMSSubstituto)).append("\n");
    sb.append("    vICMSSTRet: ").append(toIndentedString(vICMSSTRet)).append("\n");
    sb.append("    vBCFCPSTRet: ").append(toIndentedString(vBCFCPSTRet)).append("\n");
    sb.append("    pFCPSTRet: ").append(toIndentedString(pFCPSTRet)).append("\n");
    sb.append("    vFCPSTRet: ").append(toIndentedString(vFCPSTRet)).append("\n");
    sb.append("    pRedBCEfet: ").append(toIndentedString(pRedBCEfet)).append("\n");
    sb.append("    vBCEfet: ").append(toIndentedString(vBCEfet)).append("\n");
    sb.append("    pICMSEfet: ").append(toIndentedString(pICMSEfet)).append("\n");
    sb.append("    vICMSEfet: ").append(toIndentedString(vICMSEfet)).append("\n");
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
    openapiFields.add("orig");
    openapiFields.add("CST");
    openapiFields.add("vBCSTRet");
    openapiFields.add("pST");
    openapiFields.add("vICMSSubstituto");
    openapiFields.add("vICMSSTRet");
    openapiFields.add("vBCFCPSTRet");
    openapiFields.add("pFCPSTRet");
    openapiFields.add("vFCPSTRet");
    openapiFields.add("pRedBCEfet");
    openapiFields.add("vBCEfet");
    openapiFields.add("pICMSEfet");
    openapiFields.add("vICMSEfet");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("orig");
    openapiRequiredFields.add("CST");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfeSefazICMS60
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfeSefazICMS60.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfeSefazICMS60 is not found in the empty JSON string", NfeSefazICMS60.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfeSefazICMS60.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfeSefazICMS60` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NfeSefazICMS60.openapiRequiredFields) {
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
       if (!NfeSefazICMS60.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfeSefazICMS60' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfeSefazICMS60> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfeSefazICMS60.class));

       return (TypeAdapter<T>) new TypeAdapter<NfeSefazICMS60>() {
           @Override
           public void write(JsonWriter out, NfeSefazICMS60 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfeSefazICMS60 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfeSefazICMS60 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfeSefazICMS60
   * @throws IOException if the JSON string is invalid with respect to NfeSefazICMS60
   */
  public static NfeSefazICMS60 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfeSefazICMS60.class);
  }

  /**
   * Convert an instance of NfeSefazICMS60 to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
