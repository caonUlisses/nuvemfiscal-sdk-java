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
import java.util.Arrays;
import io.github.com.caonulisses.nuvemfiscalsdk.model.MdfeSefazInfLotacao;
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
 * Produto predominante.  Informar a descrição do produto predominante.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class MdfeSefazProdPred {
  public static final String SERIALIZED_NAME_TP_CARGA = "tpCarga";
  @SerializedName(SERIALIZED_NAME_TP_CARGA)
  @javax.annotation.Nullable
  private String tpCarga;

  public static final String SERIALIZED_NAME_X_PROD = "xProd";
  @SerializedName(SERIALIZED_NAME_X_PROD)
  @javax.annotation.Nullable
  private String xProd;

  public static final String SERIALIZED_NAME_C_E_A_N = "cEAN";
  @SerializedName(SERIALIZED_NAME_C_E_A_N)
  @javax.annotation.Nullable
  private String cEAN;

  public static final String SERIALIZED_NAME_N_C_M = "NCM";
  @SerializedName(SERIALIZED_NAME_N_C_M)
  @javax.annotation.Nullable
  private String NCM;

  public static final String SERIALIZED_NAME_INF_LOTACAO = "infLotacao";
  @SerializedName(SERIALIZED_NAME_INF_LOTACAO)
  @javax.annotation.Nullable
  private MdfeSefazInfLotacao infLotacao;

  public MdfeSefazProdPred() {
  }

  public MdfeSefazProdPred tpCarga(@javax.annotation.Nullable String tpCarga) {
    this.tpCarga = tpCarga;
    return this;
  }

  /**
   * Tipo de Carga.  Conforme Resolução ANTT nº.  5.849/2019.  * 01 - Granel sólido  * 02 - Granel líquido  * 03 - Frigorificada  * 04 - Conteinerizada  * 05 - Carga Geral  * 06 - Neogranel  * 07 - Perigosa (granel sólido)  * 08 - Perigosa (granel líquido)  * 09 - Perigosa (carga frigorificada)  * 10 - Perigosa (conteinerizada)  * 11 - Perigosa (carga geral)
   * @return tpCarga
   */
  @javax.annotation.Nullable
  public String getTpCarga() {
    return tpCarga;
  }

  public void setTpCarga(@javax.annotation.Nullable String tpCarga) {
    this.tpCarga = tpCarga;
  }


  public MdfeSefazProdPred xProd(@javax.annotation.Nullable String xProd) {
    this.xProd = xProd;
    return this;
  }

  /**
   * Descrição do produto.
   * @return xProd
   */
  @javax.annotation.Nullable
  public String getxProd() {
    return xProd;
  }

  public void setxProd(@javax.annotation.Nullable String xProd) {
    this.xProd = xProd;
  }


  public MdfeSefazProdPred cEAN(@javax.annotation.Nullable String cEAN) {
    this.cEAN = cEAN;
    return this;
  }

  /**
   * GTIN (Global Trade Item Number) do produto, antigo código EAN ou código de barras.
   * @return cEAN
   */
  @javax.annotation.Nullable
  public String getcEAN() {
    return cEAN;
  }

  public void setcEAN(@javax.annotation.Nullable String cEAN) {
    this.cEAN = cEAN;
  }


  public MdfeSefazProdPred NCM(@javax.annotation.Nullable String NCM) {
    this.NCM = NCM;
    return this;
  }

  /**
   * Código NCM.
   * @return NCM
   */
  @javax.annotation.Nullable
  public String getNCM() {
    return NCM;
  }

  public void setNCM(@javax.annotation.Nullable String NCM) {
    this.NCM = NCM;
  }


  public MdfeSefazProdPred infLotacao(@javax.annotation.Nullable MdfeSefazInfLotacao infLotacao) {
    this.infLotacao = infLotacao;
    return this;
  }

  /**
   * Get infLotacao
   * @return infLotacao
   */
  @javax.annotation.Nullable
  public MdfeSefazInfLotacao getInfLotacao() {
    return infLotacao;
  }

  public void setInfLotacao(@javax.annotation.Nullable MdfeSefazInfLotacao infLotacao) {
    this.infLotacao = infLotacao;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MdfeSefazProdPred mdfeSefazProdPred = (MdfeSefazProdPred) o;
    return Objects.equals(this.tpCarga, mdfeSefazProdPred.tpCarga) &&
        Objects.equals(this.xProd, mdfeSefazProdPred.xProd) &&
        Objects.equals(this.cEAN, mdfeSefazProdPred.cEAN) &&
        Objects.equals(this.NCM, mdfeSefazProdPred.NCM) &&
        Objects.equals(this.infLotacao, mdfeSefazProdPred.infLotacao);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tpCarga, xProd, cEAN, NCM, infLotacao);
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
    sb.append("class MdfeSefazProdPred {\n");
    sb.append("    tpCarga: ").append(toIndentedString(tpCarga)).append("\n");
    sb.append("    xProd: ").append(toIndentedString(xProd)).append("\n");
    sb.append("    cEAN: ").append(toIndentedString(cEAN)).append("\n");
    sb.append("    NCM: ").append(toIndentedString(NCM)).append("\n");
    sb.append("    infLotacao: ").append(toIndentedString(infLotacao)).append("\n");
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
    openapiFields.add("tpCarga");
    openapiFields.add("xProd");
    openapiFields.add("cEAN");
    openapiFields.add("NCM");
    openapiFields.add("infLotacao");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tpCarga");
    openapiRequiredFields.add("xProd");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MdfeSefazProdPred
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MdfeSefazProdPred.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MdfeSefazProdPred is not found in the empty JSON string", MdfeSefazProdPred.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MdfeSefazProdPred.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MdfeSefazProdPred` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MdfeSefazProdPred.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tpCarga") != null && !jsonObj.get("tpCarga").isJsonNull()) && !jsonObj.get("tpCarga").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tpCarga` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tpCarga").toString()));
      }
      if ((jsonObj.get("xProd") != null && !jsonObj.get("xProd").isJsonNull()) && !jsonObj.get("xProd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xProd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xProd").toString()));
      }
      if ((jsonObj.get("cEAN") != null && !jsonObj.get("cEAN").isJsonNull()) && !jsonObj.get("cEAN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cEAN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cEAN").toString()));
      }
      if ((jsonObj.get("NCM") != null && !jsonObj.get("NCM").isJsonNull()) && !jsonObj.get("NCM").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NCM` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NCM").toString()));
      }
      // validate the optional field `infLotacao`
      if (jsonObj.get("infLotacao") != null && !jsonObj.get("infLotacao").isJsonNull()) {
        MdfeSefazInfLotacao.validateJsonElement(jsonObj.get("infLotacao"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MdfeSefazProdPred.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MdfeSefazProdPred' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MdfeSefazProdPred> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MdfeSefazProdPred.class));

       return (TypeAdapter<T>) new TypeAdapter<MdfeSefazProdPred>() {
           @Override
           public void write(JsonWriter out, MdfeSefazProdPred value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MdfeSefazProdPred read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MdfeSefazProdPred given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MdfeSefazProdPred
   * @throws IOException if the JSON string is invalid with respect to MdfeSefazProdPred
   */
  public static MdfeSefazProdPred fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MdfeSefazProdPred.class);
  }

  /**
   * Convert an instance of MdfeSefazProdPred to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

