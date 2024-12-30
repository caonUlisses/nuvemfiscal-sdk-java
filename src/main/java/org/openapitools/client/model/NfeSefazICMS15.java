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
 * Tributação monofásica própria e com responsabilidade pela retenção sobre combustíveis.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfeSefazICMS15 {
  public static final String SERIALIZED_NAME_ORIG = "orig";
  @SerializedName(SERIALIZED_NAME_ORIG)
  @javax.annotation.Nullable
  private Integer orig;

  public static final String SERIALIZED_NAME_C_S_T = "CST";
  @SerializedName(SERIALIZED_NAME_C_S_T)
  @javax.annotation.Nullable
  private String CST;

  public static final String SERIALIZED_NAME_Q_B_C_MONO = "qBCMono";
  @SerializedName(SERIALIZED_NAME_Q_B_C_MONO)
  @javax.annotation.Nullable
  private BigDecimal qBCMono;

  public static final String SERIALIZED_NAME_AD_REM_I_C_M_S = "adRemICMS";
  @SerializedName(SERIALIZED_NAME_AD_REM_I_C_M_S)
  @javax.annotation.Nullable
  private BigDecimal adRemICMS;

  public static final String SERIALIZED_NAME_V_I_C_M_S_MONO = "vICMSMono";
  @SerializedName(SERIALIZED_NAME_V_I_C_M_S_MONO)
  @javax.annotation.Nullable
  private BigDecimal vICMSMono;

  public static final String SERIALIZED_NAME_Q_B_C_MONO_RETEN = "qBCMonoReten";
  @SerializedName(SERIALIZED_NAME_Q_B_C_MONO_RETEN)
  @javax.annotation.Nullable
  private BigDecimal qBCMonoReten;

  public static final String SERIALIZED_NAME_AD_REM_I_C_M_S_RETEN = "adRemICMSReten";
  @SerializedName(SERIALIZED_NAME_AD_REM_I_C_M_S_RETEN)
  @javax.annotation.Nullable
  private BigDecimal adRemICMSReten;

  public static final String SERIALIZED_NAME_V_I_C_M_S_MONO_RETEN = "vICMSMonoReten";
  @SerializedName(SERIALIZED_NAME_V_I_C_M_S_MONO_RETEN)
  @javax.annotation.Nullable
  private BigDecimal vICMSMonoReten;

  public static final String SERIALIZED_NAME_P_RED_AD_REM = "pRedAdRem";
  @SerializedName(SERIALIZED_NAME_P_RED_AD_REM)
  @javax.annotation.Nullable
  private BigDecimal pRedAdRem;

  public static final String SERIALIZED_NAME_MOT_RED_AD_REM = "motRedAdRem";
  @SerializedName(SERIALIZED_NAME_MOT_RED_AD_REM)
  @javax.annotation.Nullable
  private Integer motRedAdRem;

  public NfeSefazICMS15() {
  }

  public NfeSefazICMS15 orig(@javax.annotation.Nullable Integer orig) {
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


  public NfeSefazICMS15 CST(@javax.annotation.Nullable String CST) {
    this.CST = CST;
    return this;
  }

  /**
   * Tributção pelo ICMS  * 15 - Tributação monofásica própria e com responsabilidade pela retenção sobre combustíveis
   * @return CST
   */
  @javax.annotation.Nullable
  public String getCST() {
    return CST;
  }

  public void setCST(@javax.annotation.Nullable String CST) {
    this.CST = CST;
  }


  public NfeSefazICMS15 qBCMono(@javax.annotation.Nullable BigDecimal qBCMono) {
    this.qBCMono = qBCMono;
    return this;
  }

  /**
   * Quantidade tributada.
   * minimum: 0
   * @return qBCMono
   */
  @javax.annotation.Nullable
  public BigDecimal getqBCMono() {
    return qBCMono;
  }

  public void setqBCMono(@javax.annotation.Nullable BigDecimal qBCMono) {
    this.qBCMono = qBCMono;
  }


  public NfeSefazICMS15 adRemICMS(@javax.annotation.Nullable BigDecimal adRemICMS) {
    this.adRemICMS = adRemICMS;
    return this;
  }

  /**
   * Alíquota ad rem do imposto.
   * minimum: 0
   * @return adRemICMS
   */
  @javax.annotation.Nullable
  public BigDecimal getAdRemICMS() {
    return adRemICMS;
  }

  public void setAdRemICMS(@javax.annotation.Nullable BigDecimal adRemICMS) {
    this.adRemICMS = adRemICMS;
  }


  public NfeSefazICMS15 vICMSMono(@javax.annotation.Nullable BigDecimal vICMSMono) {
    this.vICMSMono = vICMSMono;
    return this;
  }

  /**
   * Valor do ICMS próprio.
   * minimum: 0
   * @return vICMSMono
   */
  @javax.annotation.Nullable
  public BigDecimal getvICMSMono() {
    return vICMSMono;
  }

  public void setvICMSMono(@javax.annotation.Nullable BigDecimal vICMSMono) {
    this.vICMSMono = vICMSMono;
  }


  public NfeSefazICMS15 qBCMonoReten(@javax.annotation.Nullable BigDecimal qBCMonoReten) {
    this.qBCMonoReten = qBCMonoReten;
    return this;
  }

  /**
   * Quantidade tributada sujeita a retenção.
   * minimum: 0
   * @return qBCMonoReten
   */
  @javax.annotation.Nullable
  public BigDecimal getqBCMonoReten() {
    return qBCMonoReten;
  }

  public void setqBCMonoReten(@javax.annotation.Nullable BigDecimal qBCMonoReten) {
    this.qBCMonoReten = qBCMonoReten;
  }


  public NfeSefazICMS15 adRemICMSReten(@javax.annotation.Nullable BigDecimal adRemICMSReten) {
    this.adRemICMSReten = adRemICMSReten;
    return this;
  }

  /**
   * Alíquota ad rem do imposto com retenção.
   * minimum: 0
   * @return adRemICMSReten
   */
  @javax.annotation.Nullable
  public BigDecimal getAdRemICMSReten() {
    return adRemICMSReten;
  }

  public void setAdRemICMSReten(@javax.annotation.Nullable BigDecimal adRemICMSReten) {
    this.adRemICMSReten = adRemICMSReten;
  }


  public NfeSefazICMS15 vICMSMonoReten(@javax.annotation.Nullable BigDecimal vICMSMonoReten) {
    this.vICMSMonoReten = vICMSMonoReten;
    return this;
  }

  /**
   * Valor do ICMS com retenção.
   * minimum: 0
   * @return vICMSMonoReten
   */
  @javax.annotation.Nullable
  public BigDecimal getvICMSMonoReten() {
    return vICMSMonoReten;
  }

  public void setvICMSMonoReten(@javax.annotation.Nullable BigDecimal vICMSMonoReten) {
    this.vICMSMonoReten = vICMSMonoReten;
  }


  public NfeSefazICMS15 pRedAdRem(@javax.annotation.Nullable BigDecimal pRedAdRem) {
    this.pRedAdRem = pRedAdRem;
    return this;
  }

  /**
   * Percentual de redução do valor da alíquota ad rem do ICMS.
   * minimum: 0
   * maximum: 1E+2
   * @return pRedAdRem
   */
  @javax.annotation.Nullable
  public BigDecimal getpRedAdRem() {
    return pRedAdRem;
  }

  public void setpRedAdRem(@javax.annotation.Nullable BigDecimal pRedAdRem) {
    this.pRedAdRem = pRedAdRem;
  }


  public NfeSefazICMS15 motRedAdRem(@javax.annotation.Nullable Integer motRedAdRem) {
    this.motRedAdRem = motRedAdRem;
    return this;
  }

  /**
   * Motivo da redução do adrem  * 1 - Transporte coletivo de passageiros  * 9 - Outros
   * @return motRedAdRem
   */
  @javax.annotation.Nullable
  public Integer getMotRedAdRem() {
    return motRedAdRem;
  }

  public void setMotRedAdRem(@javax.annotation.Nullable Integer motRedAdRem) {
    this.motRedAdRem = motRedAdRem;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfeSefazICMS15 nfeSefazICMS15 = (NfeSefazICMS15) o;
    return Objects.equals(this.orig, nfeSefazICMS15.orig) &&
        Objects.equals(this.CST, nfeSefazICMS15.CST) &&
        Objects.equals(this.qBCMono, nfeSefazICMS15.qBCMono) &&
        Objects.equals(this.adRemICMS, nfeSefazICMS15.adRemICMS) &&
        Objects.equals(this.vICMSMono, nfeSefazICMS15.vICMSMono) &&
        Objects.equals(this.qBCMonoReten, nfeSefazICMS15.qBCMonoReten) &&
        Objects.equals(this.adRemICMSReten, nfeSefazICMS15.adRemICMSReten) &&
        Objects.equals(this.vICMSMonoReten, nfeSefazICMS15.vICMSMonoReten) &&
        Objects.equals(this.pRedAdRem, nfeSefazICMS15.pRedAdRem) &&
        Objects.equals(this.motRedAdRem, nfeSefazICMS15.motRedAdRem);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(orig, CST, qBCMono, adRemICMS, vICMSMono, qBCMonoReten, adRemICMSReten, vICMSMonoReten, pRedAdRem, motRedAdRem);
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
    sb.append("class NfeSefazICMS15 {\n");
    sb.append("    orig: ").append(toIndentedString(orig)).append("\n");
    sb.append("    CST: ").append(toIndentedString(CST)).append("\n");
    sb.append("    qBCMono: ").append(toIndentedString(qBCMono)).append("\n");
    sb.append("    adRemICMS: ").append(toIndentedString(adRemICMS)).append("\n");
    sb.append("    vICMSMono: ").append(toIndentedString(vICMSMono)).append("\n");
    sb.append("    qBCMonoReten: ").append(toIndentedString(qBCMonoReten)).append("\n");
    sb.append("    adRemICMSReten: ").append(toIndentedString(adRemICMSReten)).append("\n");
    sb.append("    vICMSMonoReten: ").append(toIndentedString(vICMSMonoReten)).append("\n");
    sb.append("    pRedAdRem: ").append(toIndentedString(pRedAdRem)).append("\n");
    sb.append("    motRedAdRem: ").append(toIndentedString(motRedAdRem)).append("\n");
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
    openapiFields.add("qBCMono");
    openapiFields.add("adRemICMS");
    openapiFields.add("vICMSMono");
    openapiFields.add("qBCMonoReten");
    openapiFields.add("adRemICMSReten");
    openapiFields.add("vICMSMonoReten");
    openapiFields.add("pRedAdRem");
    openapiFields.add("motRedAdRem");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("orig");
    openapiRequiredFields.add("CST");
    openapiRequiredFields.add("adRemICMS");
    openapiRequiredFields.add("vICMSMono");
    openapiRequiredFields.add("adRemICMSReten");
    openapiRequiredFields.add("vICMSMonoReten");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfeSefazICMS15
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfeSefazICMS15.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfeSefazICMS15 is not found in the empty JSON string", NfeSefazICMS15.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfeSefazICMS15.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfeSefazICMS15` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NfeSefazICMS15.openapiRequiredFields) {
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
       if (!NfeSefazICMS15.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfeSefazICMS15' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfeSefazICMS15> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfeSefazICMS15.class));

       return (TypeAdapter<T>) new TypeAdapter<NfeSefazICMS15>() {
           @Override
           public void write(JsonWriter out, NfeSefazICMS15 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfeSefazICMS15 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfeSefazICMS15 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfeSefazICMS15
   * @throws IOException if the JSON string is invalid with respect to NfeSefazICMS15
   */
  public static NfeSefazICMS15 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfeSefazICMS15.class);
  }

  /**
   * Convert an instance of NfeSefazICMS15 to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

