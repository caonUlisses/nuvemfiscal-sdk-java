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
 * Código de Situação Tributária do COFINS:  * 49 - Outras Operações de Saída  * 50 - Operação com Direito a Crédito - Vinculada Exclusivamente a Receita Tributada no Mercado Interno  * 51 - Operação com Direito a Crédito - Vinculada Exclusivamente a Receita Não Tributada no Mercado Interno  * 52 - Operação com Direito a Crédito - Vinculada Exclusivamente a Receita de Exportação  * 53 - Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno  * 54 - Operação com Direito a Crédito - Vinculada a Receitas Tributadas no Mercado Interno e de Exportação  * 55 - Operação com Direito a Crédito - Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação  * 56 - Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação  * 60 - Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Tributada no Mercado Interno  * 61 - Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Não-Tributada no Mercado Interno  * 62 - Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita de Exportação  * 63 - Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno  * 64 - Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas no Mercado Interno e de Exportação  * 65 - Crédito Presumido - Operação de Aquisição Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação  * 66 - Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação  * 67 - Crédito Presumido - Outras Operações  * 70 - Operação de Aquisição sem Direito a Crédito  * 71 - Operação de Aquisição com Isenção  * 72 - Operação de Aquisição com Suspensão  * 73 - Operação de Aquisição a Alíquota Zero  * 74 - Operação de Aquisição sem Incidência da Contribuição  * 75 - Operação de Aquisição por Substituição Tributária  * 98 - Outras Operações de Entrada  * 99 - Outras Operações
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfeSefazCOFINSOutr {
  public static final String SERIALIZED_NAME_C_S_T = "CST";
  @SerializedName(SERIALIZED_NAME_C_S_T)
  @javax.annotation.Nullable
  private String CST;

  public static final String SERIALIZED_NAME_V_B_C = "vBC";
  @SerializedName(SERIALIZED_NAME_V_B_C)
  @javax.annotation.Nullable
  private BigDecimal vBC;

  public static final String SERIALIZED_NAME_P_C_O_F_I_N_S = "pCOFINS";
  @SerializedName(SERIALIZED_NAME_P_C_O_F_I_N_S)
  @javax.annotation.Nullable
  private BigDecimal pCOFINS;

  public static final String SERIALIZED_NAME_Q_B_C_PROD = "qBCProd";
  @SerializedName(SERIALIZED_NAME_Q_B_C_PROD)
  @javax.annotation.Nullable
  private BigDecimal qBCProd;

  public static final String SERIALIZED_NAME_V_ALIQ_PROD = "vAliqProd";
  @SerializedName(SERIALIZED_NAME_V_ALIQ_PROD)
  @javax.annotation.Nullable
  private BigDecimal vAliqProd;

  public static final String SERIALIZED_NAME_V_C_O_F_I_N_S = "vCOFINS";
  @SerializedName(SERIALIZED_NAME_V_C_O_F_I_N_S)
  @javax.annotation.Nullable
  private BigDecimal vCOFINS;

  public NfeSefazCOFINSOutr() {
  }

  public NfeSefazCOFINSOutr CST(@javax.annotation.Nullable String CST) {
    this.CST = CST;
    return this;
  }

  /**
   * Código de Situação Tributária do COFINS:  * 49 - Outras Operações de Saída  * 50 - Operação com Direito a Crédito - Vinculada Exclusivamente a Receita Tributada no Mercado Interno  * 51 - Operação com Direito a Crédito - Vinculada Exclusivamente a Receita Não Tributada no Mercado Interno  * 52 - Operação com Direito a Crédito - Vinculada Exclusivamente a Receita de Exportação  * 53 - Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno  * 54 - Operação com Direito a Crédito - Vinculada a Receitas Tributadas no Mercado Interno e de Exportação  * 55 - Operação com Direito a Crédito - Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação  * 56 - Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação  * 60 - Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Tributada no Mercado Interno  * 61 - Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Não-Tributada no Mercado Interno  * 62 - Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita de Exportação  * 63 - Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno  * 64 - Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas no Mercado Interno e de Exportação  * 65 - Crédito Presumido - Operação de Aquisição Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação  * 66 - Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação  * 67 - Crédito Presumido - Outras Operações  * 70 - Operação de Aquisição sem Direito a Crédito  * 71 - Operação de Aquisição com Isenção  * 72 - Operação de Aquisição com Suspensão  * 73 - Operação de Aquisição a Alíquota Zero  * 74 - Operação de Aquisição sem Incidência da Contribuição  * 75 - Operação de Aquisição por Substituição Tributária  * 98 - Outras Operações de Entrada  * 99 - Outras Operações
   * @return CST
   */
  @javax.annotation.Nullable
  public String getCST() {
    return CST;
  }

  public void setCST(@javax.annotation.Nullable String CST) {
    this.CST = CST;
  }


  public NfeSefazCOFINSOutr vBC(@javax.annotation.Nullable BigDecimal vBC) {
    this.vBC = vBC;
    return this;
  }

  /**
   * Valor da BC do COFINS.
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


  public NfeSefazCOFINSOutr pCOFINS(@javax.annotation.Nullable BigDecimal pCOFINS) {
    this.pCOFINS = pCOFINS;
    return this;
  }

  /**
   * Alíquota do COFINS (em percentual).
   * minimum: 0
   * @return pCOFINS
   */
  @javax.annotation.Nullable
  public BigDecimal getpCOFINS() {
    return pCOFINS;
  }

  public void setpCOFINS(@javax.annotation.Nullable BigDecimal pCOFINS) {
    this.pCOFINS = pCOFINS;
  }


  public NfeSefazCOFINSOutr qBCProd(@javax.annotation.Nullable BigDecimal qBCProd) {
    this.qBCProd = qBCProd;
    return this;
  }

  /**
   * Quantidade Vendida (NT2011/004).
   * minimum: 0
   * @return qBCProd
   */
  @javax.annotation.Nullable
  public BigDecimal getqBCProd() {
    return qBCProd;
  }

  public void setqBCProd(@javax.annotation.Nullable BigDecimal qBCProd) {
    this.qBCProd = qBCProd;
  }


  public NfeSefazCOFINSOutr vAliqProd(@javax.annotation.Nullable BigDecimal vAliqProd) {
    this.vAliqProd = vAliqProd;
    return this;
  }

  /**
   * Alíquota do COFINS (em reais) (NT2011/004).
   * minimum: 0
   * @return vAliqProd
   */
  @javax.annotation.Nullable
  public BigDecimal getvAliqProd() {
    return vAliqProd;
  }

  public void setvAliqProd(@javax.annotation.Nullable BigDecimal vAliqProd) {
    this.vAliqProd = vAliqProd;
  }


  public NfeSefazCOFINSOutr vCOFINS(@javax.annotation.Nullable BigDecimal vCOFINS) {
    this.vCOFINS = vCOFINS;
    return this;
  }

  /**
   * Valor do COFINS.
   * minimum: 0
   * @return vCOFINS
   */
  @javax.annotation.Nullable
  public BigDecimal getvCOFINS() {
    return vCOFINS;
  }

  public void setvCOFINS(@javax.annotation.Nullable BigDecimal vCOFINS) {
    this.vCOFINS = vCOFINS;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfeSefazCOFINSOutr nfeSefazCOFINSOutr = (NfeSefazCOFINSOutr) o;
    return Objects.equals(this.CST, nfeSefazCOFINSOutr.CST) &&
        Objects.equals(this.vBC, nfeSefazCOFINSOutr.vBC) &&
        Objects.equals(this.pCOFINS, nfeSefazCOFINSOutr.pCOFINS) &&
        Objects.equals(this.qBCProd, nfeSefazCOFINSOutr.qBCProd) &&
        Objects.equals(this.vAliqProd, nfeSefazCOFINSOutr.vAliqProd) &&
        Objects.equals(this.vCOFINS, nfeSefazCOFINSOutr.vCOFINS);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(CST, vBC, pCOFINS, qBCProd, vAliqProd, vCOFINS);
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
    sb.append("class NfeSefazCOFINSOutr {\n");
    sb.append("    CST: ").append(toIndentedString(CST)).append("\n");
    sb.append("    vBC: ").append(toIndentedString(vBC)).append("\n");
    sb.append("    pCOFINS: ").append(toIndentedString(pCOFINS)).append("\n");
    sb.append("    qBCProd: ").append(toIndentedString(qBCProd)).append("\n");
    sb.append("    vAliqProd: ").append(toIndentedString(vAliqProd)).append("\n");
    sb.append("    vCOFINS: ").append(toIndentedString(vCOFINS)).append("\n");
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
    openapiFields.add("pCOFINS");
    openapiFields.add("qBCProd");
    openapiFields.add("vAliqProd");
    openapiFields.add("vCOFINS");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("CST");
    openapiRequiredFields.add("vCOFINS");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfeSefazCOFINSOutr
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfeSefazCOFINSOutr.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfeSefazCOFINSOutr is not found in the empty JSON string", NfeSefazCOFINSOutr.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfeSefazCOFINSOutr.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfeSefazCOFINSOutr` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NfeSefazCOFINSOutr.openapiRequiredFields) {
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
       if (!NfeSefazCOFINSOutr.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfeSefazCOFINSOutr' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfeSefazCOFINSOutr> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfeSefazCOFINSOutr.class));

       return (TypeAdapter<T>) new TypeAdapter<NfeSefazCOFINSOutr>() {
           @Override
           public void write(JsonWriter out, NfeSefazCOFINSOutr value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfeSefazCOFINSOutr read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfeSefazCOFINSOutr given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfeSefazCOFINSOutr
   * @throws IOException if the JSON string is invalid with respect to NfeSefazCOFINSOutr
   */
  public static NfeSefazCOFINSOutr fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfeSefazCOFINSOutr.class);
  }

  /**
   * Convert an instance of NfeSefazCOFINSOutr to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

