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
 * Tributação pelo ICMS  * 40 - Isenta  * 41 - Não tributada  * 50 - Suspensão
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfeSefazICMS40 {
  public static final String SERIALIZED_NAME_ORIG = "orig";
  @SerializedName(SERIALIZED_NAME_ORIG)
  @javax.annotation.Nullable
  private Integer orig;

  public static final String SERIALIZED_NAME_C_S_T = "CST";
  @SerializedName(SERIALIZED_NAME_C_S_T)
  @javax.annotation.Nullable
  private String CST;

  public static final String SERIALIZED_NAME_V_I_C_M_S_DESON = "vICMSDeson";
  @SerializedName(SERIALIZED_NAME_V_I_C_M_S_DESON)
  @javax.annotation.Nullable
  private BigDecimal vICMSDeson;

  public static final String SERIALIZED_NAME_MOT_DES_I_C_M_S = "motDesICMS";
  @SerializedName(SERIALIZED_NAME_MOT_DES_I_C_M_S)
  @javax.annotation.Nullable
  private Integer motDesICMS;

  public static final String SERIALIZED_NAME_IND_DEDUZ_DESON = "indDeduzDeson";
  @SerializedName(SERIALIZED_NAME_IND_DEDUZ_DESON)
  @javax.annotation.Nullable
  private Integer indDeduzDeson;

  public NfeSefazICMS40() {
  }

  public NfeSefazICMS40 orig(@javax.annotation.Nullable Integer orig) {
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


  public NfeSefazICMS40 CST(@javax.annotation.Nullable String CST) {
    this.CST = CST;
    return this;
  }

  /**
   * Tributação pelo ICMS  * 40 - Isenta  * 41 - Não tributada  * 50 - Suspensão  * 51 - Diferimento
   * @return CST
   */
  @javax.annotation.Nullable
  public String getCST() {
    return CST;
  }

  public void setCST(@javax.annotation.Nullable String CST) {
    this.CST = CST;
  }


  public NfeSefazICMS40 vICMSDeson(@javax.annotation.Nullable BigDecimal vICMSDeson) {
    this.vICMSDeson = vICMSDeson;
    return this;
  }

  /**
   * O valor do ICMS será informado apenas nas operações com veículos beneficiados com a desoneração condicional do ICMS.
   * minimum: 0
   * @return vICMSDeson
   */
  @javax.annotation.Nullable
  public BigDecimal getvICMSDeson() {
    return vICMSDeson;
  }

  public void setvICMSDeson(@javax.annotation.Nullable BigDecimal vICMSDeson) {
    this.vICMSDeson = vICMSDeson;
  }


  public NfeSefazICMS40 motDesICMS(@javax.annotation.Nullable Integer motDesICMS) {
    this.motDesICMS = motDesICMS;
    return this;
  }

  /**
   * Este campo será preenchido quando o campo anterior estiver preenchido.  Informar o motivo da desoneração:  * 1 - Táxi  * 3 - Produtor Agropecuário  * 4 - Frotista/Locadora  * 5 - Diplomático/Consular  * 6 - Utilitários e Motocicletas da Amazônia Ocidental e Áreas de Livre Comércio (Resolução 714/88 e 790/94 - CONTRAN e suas alterações)  * 7 - SUFRAMA  * 8 - Venda a órgão Público  * 9 - Outros  * 10 - Deficiente Condutor  * 11 - Deficiente não condutor  * 16 - Olimpíadas Rio 2016  * 90 - Solicitado pelo Fisco
   * @return motDesICMS
   */
  @javax.annotation.Nullable
  public Integer getMotDesICMS() {
    return motDesICMS;
  }

  public void setMotDesICMS(@javax.annotation.Nullable Integer motDesICMS) {
    this.motDesICMS = motDesICMS;
  }


  public NfeSefazICMS40 indDeduzDeson(@javax.annotation.Nullable Integer indDeduzDeson) {
    this.indDeduzDeson = indDeduzDeson;
    return this;
  }

  /**
   * Indica se o valor do ICMS desonerado (vICMSDeson) deduz do valor do item (vProd):  * 0 - Valor do ICMS desonerado (vICMSDeson) não deduz do valor do item (vProd) / total da NF-e  * 1 - Valor do ICMS desonerado (vICMSDeson) deduz do valor do item (vProd) / total da NF-e
   * @return indDeduzDeson
   */
  @javax.annotation.Nullable
  public Integer getIndDeduzDeson() {
    return indDeduzDeson;
  }

  public void setIndDeduzDeson(@javax.annotation.Nullable Integer indDeduzDeson) {
    this.indDeduzDeson = indDeduzDeson;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfeSefazICMS40 nfeSefazICMS40 = (NfeSefazICMS40) o;
    return Objects.equals(this.orig, nfeSefazICMS40.orig) &&
        Objects.equals(this.CST, nfeSefazICMS40.CST) &&
        Objects.equals(this.vICMSDeson, nfeSefazICMS40.vICMSDeson) &&
        Objects.equals(this.motDesICMS, nfeSefazICMS40.motDesICMS) &&
        Objects.equals(this.indDeduzDeson, nfeSefazICMS40.indDeduzDeson);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(orig, CST, vICMSDeson, motDesICMS, indDeduzDeson);
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
    sb.append("class NfeSefazICMS40 {\n");
    sb.append("    orig: ").append(toIndentedString(orig)).append("\n");
    sb.append("    CST: ").append(toIndentedString(CST)).append("\n");
    sb.append("    vICMSDeson: ").append(toIndentedString(vICMSDeson)).append("\n");
    sb.append("    motDesICMS: ").append(toIndentedString(motDesICMS)).append("\n");
    sb.append("    indDeduzDeson: ").append(toIndentedString(indDeduzDeson)).append("\n");
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
    openapiFields.add("vICMSDeson");
    openapiFields.add("motDesICMS");
    openapiFields.add("indDeduzDeson");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("orig");
    openapiRequiredFields.add("CST");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfeSefazICMS40
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfeSefazICMS40.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfeSefazICMS40 is not found in the empty JSON string", NfeSefazICMS40.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfeSefazICMS40.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfeSefazICMS40` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NfeSefazICMS40.openapiRequiredFields) {
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
       if (!NfeSefazICMS40.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfeSefazICMS40' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfeSefazICMS40> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfeSefazICMS40.class));

       return (TypeAdapter<T>) new TypeAdapter<NfeSefazICMS40>() {
           @Override
           public void write(JsonWriter out, NfeSefazICMS40 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfeSefazICMS40 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfeSefazICMS40 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfeSefazICMS40
   * @throws IOException if the JSON string is invalid with respect to NfeSefazICMS40
   */
  public static NfeSefazICMS40 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfeSefazICMS40.class);
  }

  /**
   * Convert an instance of NfeSefazICMS40 to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

