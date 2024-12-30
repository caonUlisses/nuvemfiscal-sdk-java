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
 * Tributação do ICMS pelo SIMPLES NACIONAL e CSOSN&#x3D;202 ou 203 (v.2.0).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfeSefazICMSSN202 {
  public static final String SERIALIZED_NAME_ORIG = "orig";
  @SerializedName(SERIALIZED_NAME_ORIG)
  @javax.annotation.Nullable
  private Integer orig;

  public static final String SERIALIZED_NAME_C_S_O_S_N = "CSOSN";
  @SerializedName(SERIALIZED_NAME_C_S_O_S_N)
  @javax.annotation.Nullable
  private String CSOSN;

  public static final String SERIALIZED_NAME_MOD_B_C_S_T = "modBCST";
  @SerializedName(SERIALIZED_NAME_MOD_B_C_S_T)
  @javax.annotation.Nullable
  private Integer modBCST;

  public static final String SERIALIZED_NAME_P_M_V_A_S_T = "pMVAST";
  @SerializedName(SERIALIZED_NAME_P_M_V_A_S_T)
  @javax.annotation.Nullable
  private BigDecimal pMVAST;

  public static final String SERIALIZED_NAME_P_RED_B_C_S_T = "pRedBCST";
  @SerializedName(SERIALIZED_NAME_P_RED_B_C_S_T)
  @javax.annotation.Nullable
  private BigDecimal pRedBCST;

  public static final String SERIALIZED_NAME_V_B_C_S_T = "vBCST";
  @SerializedName(SERIALIZED_NAME_V_B_C_S_T)
  @javax.annotation.Nullable
  private BigDecimal vBCST;

  public static final String SERIALIZED_NAME_P_I_C_M_S_S_T = "pICMSST";
  @SerializedName(SERIALIZED_NAME_P_I_C_M_S_S_T)
  @javax.annotation.Nullable
  private BigDecimal pICMSST;

  public static final String SERIALIZED_NAME_V_I_C_M_S_S_T = "vICMSST";
  @SerializedName(SERIALIZED_NAME_V_I_C_M_S_S_T)
  @javax.annotation.Nullable
  private BigDecimal vICMSST;

  public static final String SERIALIZED_NAME_V_B_C_F_C_P_S_T = "vBCFCPST";
  @SerializedName(SERIALIZED_NAME_V_B_C_F_C_P_S_T)
  @javax.annotation.Nullable
  private BigDecimal vBCFCPST;

  public static final String SERIALIZED_NAME_P_F_C_P_S_T = "pFCPST";
  @SerializedName(SERIALIZED_NAME_P_F_C_P_S_T)
  @javax.annotation.Nullable
  private BigDecimal pFCPST;

  public static final String SERIALIZED_NAME_V_F_C_P_S_T = "vFCPST";
  @SerializedName(SERIALIZED_NAME_V_F_C_P_S_T)
  @javax.annotation.Nullable
  private BigDecimal vFCPST;

  public NfeSefazICMSSN202() {
  }

  public NfeSefazICMSSN202 orig(@javax.annotation.Nullable Integer orig) {
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


  public NfeSefazICMSSN202 CSOSN(@javax.annotation.Nullable String CSOSN) {
    this.CSOSN = CSOSN;
    return this;
  }

  /**
   * * 202 - Tributada pelo Simples Nacional sem permissão de crédito e com cobrança do ICMS por Substituição Tributária  * 203 - Isenção do ICMS nos Simples Nacional para faixa de receita bruta e com cobrança do ICMS por Substituição Tributária (v.2.0)
   * @return CSOSN
   */
  @javax.annotation.Nullable
  public String getCSOSN() {
    return CSOSN;
  }

  public void setCSOSN(@javax.annotation.Nullable String CSOSN) {
    this.CSOSN = CSOSN;
  }


  public NfeSefazICMSSN202 modBCST(@javax.annotation.Nullable Integer modBCST) {
    this.modBCST = modBCST;
    return this;
  }

  /**
   * Modalidade de determinação da BC do ICMS ST:  * 0 - Preço tabelado ou máximo  sugerido  * 1 - Lista Negativa (valor)  * 2 - Lista Positiva (valor)  * 3 - Lista Neutra (valor)  * 4 - Margem Valor Agregado (%%)  * 5 - Pauta (valor). (v2.0)  * 6 - Valor da Operação
   * @return modBCST
   */
  @javax.annotation.Nullable
  public Integer getModBCST() {
    return modBCST;
  }

  public void setModBCST(@javax.annotation.Nullable Integer modBCST) {
    this.modBCST = modBCST;
  }


  public NfeSefazICMSSN202 pMVAST(@javax.annotation.Nullable BigDecimal pMVAST) {
    this.pMVAST = pMVAST;
    return this;
  }

  /**
   * Percentual da Margem de Valor Adicionado ICMS ST (v2.0).
   * minimum: 0
   * @return pMVAST
   */
  @javax.annotation.Nullable
  public BigDecimal getpMVAST() {
    return pMVAST;
  }

  public void setpMVAST(@javax.annotation.Nullable BigDecimal pMVAST) {
    this.pMVAST = pMVAST;
  }


  public NfeSefazICMSSN202 pRedBCST(@javax.annotation.Nullable BigDecimal pRedBCST) {
    this.pRedBCST = pRedBCST;
    return this;
  }

  /**
   * Percentual de redução da BC ICMS ST  (v2.0).
   * minimum: 0
   * @return pRedBCST
   */
  @javax.annotation.Nullable
  public BigDecimal getpRedBCST() {
    return pRedBCST;
  }

  public void setpRedBCST(@javax.annotation.Nullable BigDecimal pRedBCST) {
    this.pRedBCST = pRedBCST;
  }


  public NfeSefazICMSSN202 vBCST(@javax.annotation.Nullable BigDecimal vBCST) {
    this.vBCST = vBCST;
    return this;
  }

  /**
   * Valor da BC do ICMS ST (v2.0).
   * minimum: 0
   * @return vBCST
   */
  @javax.annotation.Nullable
  public BigDecimal getvBCST() {
    return vBCST;
  }

  public void setvBCST(@javax.annotation.Nullable BigDecimal vBCST) {
    this.vBCST = vBCST;
  }


  public NfeSefazICMSSN202 pICMSST(@javax.annotation.Nullable BigDecimal pICMSST) {
    this.pICMSST = pICMSST;
    return this;
  }

  /**
   * Alíquota do ICMS ST (v2.0).
   * minimum: 0
   * @return pICMSST
   */
  @javax.annotation.Nullable
  public BigDecimal getpICMSST() {
    return pICMSST;
  }

  public void setpICMSST(@javax.annotation.Nullable BigDecimal pICMSST) {
    this.pICMSST = pICMSST;
  }


  public NfeSefazICMSSN202 vICMSST(@javax.annotation.Nullable BigDecimal vICMSST) {
    this.vICMSST = vICMSST;
    return this;
  }

  /**
   * Valor do ICMS ST (v2.0).
   * minimum: 0
   * @return vICMSST
   */
  @javax.annotation.Nullable
  public BigDecimal getvICMSST() {
    return vICMSST;
  }

  public void setvICMSST(@javax.annotation.Nullable BigDecimal vICMSST) {
    this.vICMSST = vICMSST;
  }


  public NfeSefazICMSSN202 vBCFCPST(@javax.annotation.Nullable BigDecimal vBCFCPST) {
    this.vBCFCPST = vBCFCPST;
    return this;
  }

  /**
   * Valor da Base de cálculo do FCP.
   * minimum: 0
   * @return vBCFCPST
   */
  @javax.annotation.Nullable
  public BigDecimal getvBCFCPST() {
    return vBCFCPST;
  }

  public void setvBCFCPST(@javax.annotation.Nullable BigDecimal vBCFCPST) {
    this.vBCFCPST = vBCFCPST;
  }


  public NfeSefazICMSSN202 pFCPST(@javax.annotation.Nullable BigDecimal pFCPST) {
    this.pFCPST = pFCPST;
    return this;
  }

  /**
   * Percentual de FCP retido por substituição tributária.
   * minimum: 0
   * @return pFCPST
   */
  @javax.annotation.Nullable
  public BigDecimal getpFCPST() {
    return pFCPST;
  }

  public void setpFCPST(@javax.annotation.Nullable BigDecimal pFCPST) {
    this.pFCPST = pFCPST;
  }


  public NfeSefazICMSSN202 vFCPST(@javax.annotation.Nullable BigDecimal vFCPST) {
    this.vFCPST = vFCPST;
    return this;
  }

  /**
   * Valor do FCP retido por substituição tributária.
   * minimum: 0
   * @return vFCPST
   */
  @javax.annotation.Nullable
  public BigDecimal getvFCPST() {
    return vFCPST;
  }

  public void setvFCPST(@javax.annotation.Nullable BigDecimal vFCPST) {
    this.vFCPST = vFCPST;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfeSefazICMSSN202 nfeSefazICMSSN202 = (NfeSefazICMSSN202) o;
    return Objects.equals(this.orig, nfeSefazICMSSN202.orig) &&
        Objects.equals(this.CSOSN, nfeSefazICMSSN202.CSOSN) &&
        Objects.equals(this.modBCST, nfeSefazICMSSN202.modBCST) &&
        Objects.equals(this.pMVAST, nfeSefazICMSSN202.pMVAST) &&
        Objects.equals(this.pRedBCST, nfeSefazICMSSN202.pRedBCST) &&
        Objects.equals(this.vBCST, nfeSefazICMSSN202.vBCST) &&
        Objects.equals(this.pICMSST, nfeSefazICMSSN202.pICMSST) &&
        Objects.equals(this.vICMSST, nfeSefazICMSSN202.vICMSST) &&
        Objects.equals(this.vBCFCPST, nfeSefazICMSSN202.vBCFCPST) &&
        Objects.equals(this.pFCPST, nfeSefazICMSSN202.pFCPST) &&
        Objects.equals(this.vFCPST, nfeSefazICMSSN202.vFCPST);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(orig, CSOSN, modBCST, pMVAST, pRedBCST, vBCST, pICMSST, vICMSST, vBCFCPST, pFCPST, vFCPST);
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
    sb.append("class NfeSefazICMSSN202 {\n");
    sb.append("    orig: ").append(toIndentedString(orig)).append("\n");
    sb.append("    CSOSN: ").append(toIndentedString(CSOSN)).append("\n");
    sb.append("    modBCST: ").append(toIndentedString(modBCST)).append("\n");
    sb.append("    pMVAST: ").append(toIndentedString(pMVAST)).append("\n");
    sb.append("    pRedBCST: ").append(toIndentedString(pRedBCST)).append("\n");
    sb.append("    vBCST: ").append(toIndentedString(vBCST)).append("\n");
    sb.append("    pICMSST: ").append(toIndentedString(pICMSST)).append("\n");
    sb.append("    vICMSST: ").append(toIndentedString(vICMSST)).append("\n");
    sb.append("    vBCFCPST: ").append(toIndentedString(vBCFCPST)).append("\n");
    sb.append("    pFCPST: ").append(toIndentedString(pFCPST)).append("\n");
    sb.append("    vFCPST: ").append(toIndentedString(vFCPST)).append("\n");
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
    openapiFields.add("CSOSN");
    openapiFields.add("modBCST");
    openapiFields.add("pMVAST");
    openapiFields.add("pRedBCST");
    openapiFields.add("vBCST");
    openapiFields.add("pICMSST");
    openapiFields.add("vICMSST");
    openapiFields.add("vBCFCPST");
    openapiFields.add("pFCPST");
    openapiFields.add("vFCPST");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("orig");
    openapiRequiredFields.add("CSOSN");
    openapiRequiredFields.add("modBCST");
    openapiRequiredFields.add("vBCST");
    openapiRequiredFields.add("pICMSST");
    openapiRequiredFields.add("vICMSST");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfeSefazICMSSN202
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfeSefazICMSSN202.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfeSefazICMSSN202 is not found in the empty JSON string", NfeSefazICMSSN202.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfeSefazICMSSN202.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfeSefazICMSSN202` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NfeSefazICMSSN202.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("CSOSN") != null && !jsonObj.get("CSOSN").isJsonNull()) && !jsonObj.get("CSOSN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CSOSN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CSOSN").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NfeSefazICMSSN202.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfeSefazICMSSN202' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfeSefazICMSSN202> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfeSefazICMSSN202.class));

       return (TypeAdapter<T>) new TypeAdapter<NfeSefazICMSSN202>() {
           @Override
           public void write(JsonWriter out, NfeSefazICMSSN202 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfeSefazICMSSN202 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfeSefazICMSSN202 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfeSefazICMSSN202
   * @throws IOException if the JSON string is invalid with respect to NfeSefazICMSSN202
   */
  public static NfeSefazICMSSN202 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfeSefazICMSSN202.class);
  }

  /**
   * Convert an instance of NfeSefazICMSSN202 to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
