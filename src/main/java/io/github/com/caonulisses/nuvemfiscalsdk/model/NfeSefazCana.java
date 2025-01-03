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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.github.com.caonulisses.nuvemfiscalsdk.model.NfeSefazDeduc;
import io.github.com.caonulisses.nuvemfiscalsdk.model.NfeSefazForDia;

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
 * Informações de registro aquisições de cana.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfeSefazCana {
  public static final String SERIALIZED_NAME_SAFRA = "safra";
  @SerializedName(SERIALIZED_NAME_SAFRA)
  @javax.annotation.Nullable
  private String safra;

  public static final String SERIALIZED_NAME_REF = "ref";
  @SerializedName(SERIALIZED_NAME_REF)
  @javax.annotation.Nullable
  private String ref;

  public static final String SERIALIZED_NAME_FOR_DIA = "forDia";
  @SerializedName(SERIALIZED_NAME_FOR_DIA)
  @javax.annotation.Nonnull
  private List<NfeSefazForDia> forDia = new ArrayList<>();

  public static final String SERIALIZED_NAME_Q_TOT_MES = "qTotMes";
  @SerializedName(SERIALIZED_NAME_Q_TOT_MES)
  @javax.annotation.Nullable
  private BigDecimal qTotMes;

  public static final String SERIALIZED_NAME_Q_TOT_ANT = "qTotAnt";
  @SerializedName(SERIALIZED_NAME_Q_TOT_ANT)
  @javax.annotation.Nullable
  private BigDecimal qTotAnt;

  public static final String SERIALIZED_NAME_Q_TOT_GER = "qTotGer";
  @SerializedName(SERIALIZED_NAME_Q_TOT_GER)
  @javax.annotation.Nullable
  private BigDecimal qTotGer;

  public static final String SERIALIZED_NAME_DEDUC = "deduc";
  @SerializedName(SERIALIZED_NAME_DEDUC)
  @javax.annotation.Nullable
  private List<NfeSefazDeduc> deduc = new ArrayList<>();

  public static final String SERIALIZED_NAME_V_FOR = "vFor";
  @SerializedName(SERIALIZED_NAME_V_FOR)
  @javax.annotation.Nullable
  private BigDecimal vFor;

  public static final String SERIALIZED_NAME_V_TOT_DED = "vTotDed";
  @SerializedName(SERIALIZED_NAME_V_TOT_DED)
  @javax.annotation.Nullable
  private BigDecimal vTotDed;

  public static final String SERIALIZED_NAME_V_LIQ_FOR = "vLiqFor";
  @SerializedName(SERIALIZED_NAME_V_LIQ_FOR)
  @javax.annotation.Nullable
  private BigDecimal vLiqFor;

  public NfeSefazCana() {
  }

  public NfeSefazCana safra(@javax.annotation.Nullable String safra) {
    this.safra = safra;
    return this;
  }

  /**
   * Identificação da safra.
   * @return safra
   */
  @javax.annotation.Nullable
  public String getSafra() {
    return safra;
  }

  public void setSafra(@javax.annotation.Nullable String safra) {
    this.safra = safra;
  }


  public NfeSefazCana ref(@javax.annotation.Nullable String ref) {
    this.ref = ref;
    return this;
  }

  /**
   * Mês e Ano de Referência, formato: MM/AAAA.
   * @return ref
   */
  @javax.annotation.Nullable
  public String getRef() {
    return ref;
  }

  public void setRef(@javax.annotation.Nullable String ref) {
    this.ref = ref;
  }


  public NfeSefazCana forDia(@javax.annotation.Nonnull List<NfeSefazForDia> forDia) {
    this.forDia = forDia;
    return this;
  }

  public NfeSefazCana addForDiaItem(NfeSefazForDia forDiaItem) {
    if (this.forDia == null) {
      this.forDia = new ArrayList<>();
    }
    this.forDia.add(forDiaItem);
    return this;
  }

  /**
   * Get forDia
   * @return forDia
   */
  @javax.annotation.Nonnull
  public List<NfeSefazForDia> getForDia() {
    return forDia;
  }

  public void setForDia(@javax.annotation.Nonnull List<NfeSefazForDia> forDia) {
    this.forDia = forDia;
  }


  public NfeSefazCana qTotMes(@javax.annotation.Nullable BigDecimal qTotMes) {
    this.qTotMes = qTotMes;
    return this;
  }

  /**
   * Total do mês.
   * minimum: 0
   * @return qTotMes
   */
  @javax.annotation.Nullable
  public BigDecimal getqTotMes() {
    return qTotMes;
  }

  public void setqTotMes(@javax.annotation.Nullable BigDecimal qTotMes) {
    this.qTotMes = qTotMes;
  }


  public NfeSefazCana qTotAnt(@javax.annotation.Nullable BigDecimal qTotAnt) {
    this.qTotAnt = qTotAnt;
    return this;
  }

  /**
   * Total Anterior.
   * minimum: 0
   * @return qTotAnt
   */
  @javax.annotation.Nullable
  public BigDecimal getqTotAnt() {
    return qTotAnt;
  }

  public void setqTotAnt(@javax.annotation.Nullable BigDecimal qTotAnt) {
    this.qTotAnt = qTotAnt;
  }


  public NfeSefazCana qTotGer(@javax.annotation.Nullable BigDecimal qTotGer) {
    this.qTotGer = qTotGer;
    return this;
  }

  /**
   * Total Geral.
   * minimum: 0
   * @return qTotGer
   */
  @javax.annotation.Nullable
  public BigDecimal getqTotGer() {
    return qTotGer;
  }

  public void setqTotGer(@javax.annotation.Nullable BigDecimal qTotGer) {
    this.qTotGer = qTotGer;
  }


  public NfeSefazCana deduc(@javax.annotation.Nullable List<NfeSefazDeduc> deduc) {
    this.deduc = deduc;
    return this;
  }

  public NfeSefazCana addDeducItem(NfeSefazDeduc deducItem) {
    if (this.deduc == null) {
      this.deduc = new ArrayList<>();
    }
    this.deduc.add(deducItem);
    return this;
  }

  /**
   * Get deduc
   * @return deduc
   */
  @javax.annotation.Nullable
  public List<NfeSefazDeduc> getDeduc() {
    return deduc;
  }

  public void setDeduc(@javax.annotation.Nullable List<NfeSefazDeduc> deduc) {
    this.deduc = deduc;
  }


  public NfeSefazCana vFor(@javax.annotation.Nullable BigDecimal vFor) {
    this.vFor = vFor;
    return this;
  }

  /**
   * Valor  dos fornecimentos.
   * minimum: 0
   * @return vFor
   */
  @javax.annotation.Nullable
  public BigDecimal getvFor() {
    return vFor;
  }

  public void setvFor(@javax.annotation.Nullable BigDecimal vFor) {
    this.vFor = vFor;
  }


  public NfeSefazCana vTotDed(@javax.annotation.Nullable BigDecimal vTotDed) {
    this.vTotDed = vTotDed;
    return this;
  }

  /**
   * Valor Total das Deduções.
   * minimum: 0
   * @return vTotDed
   */
  @javax.annotation.Nullable
  public BigDecimal getvTotDed() {
    return vTotDed;
  }

  public void setvTotDed(@javax.annotation.Nullable BigDecimal vTotDed) {
    this.vTotDed = vTotDed;
  }


  public NfeSefazCana vLiqFor(@javax.annotation.Nullable BigDecimal vLiqFor) {
    this.vLiqFor = vLiqFor;
    return this;
  }

  /**
   * Valor Líquido dos fornecimentos.
   * minimum: 0
   * @return vLiqFor
   */
  @javax.annotation.Nullable
  public BigDecimal getvLiqFor() {
    return vLiqFor;
  }

  public void setvLiqFor(@javax.annotation.Nullable BigDecimal vLiqFor) {
    this.vLiqFor = vLiqFor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfeSefazCana nfeSefazCana = (NfeSefazCana) o;
    return Objects.equals(this.safra, nfeSefazCana.safra) &&
        Objects.equals(this.ref, nfeSefazCana.ref) &&
        Objects.equals(this.forDia, nfeSefazCana.forDia) &&
        Objects.equals(this.qTotMes, nfeSefazCana.qTotMes) &&
        Objects.equals(this.qTotAnt, nfeSefazCana.qTotAnt) &&
        Objects.equals(this.qTotGer, nfeSefazCana.qTotGer) &&
        Objects.equals(this.deduc, nfeSefazCana.deduc) &&
        Objects.equals(this.vFor, nfeSefazCana.vFor) &&
        Objects.equals(this.vTotDed, nfeSefazCana.vTotDed) &&
        Objects.equals(this.vLiqFor, nfeSefazCana.vLiqFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(safra, ref, forDia, qTotMes, qTotAnt, qTotGer, deduc, vFor, vTotDed, vLiqFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NfeSefazCana {\n");
    sb.append("    safra: ").append(toIndentedString(safra)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    forDia: ").append(toIndentedString(forDia)).append("\n");
    sb.append("    qTotMes: ").append(toIndentedString(qTotMes)).append("\n");
    sb.append("    qTotAnt: ").append(toIndentedString(qTotAnt)).append("\n");
    sb.append("    qTotGer: ").append(toIndentedString(qTotGer)).append("\n");
    sb.append("    deduc: ").append(toIndentedString(deduc)).append("\n");
    sb.append("    vFor: ").append(toIndentedString(vFor)).append("\n");
    sb.append("    vTotDed: ").append(toIndentedString(vTotDed)).append("\n");
    sb.append("    vLiqFor: ").append(toIndentedString(vLiqFor)).append("\n");
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
    openapiFields.add("safra");
    openapiFields.add("ref");
    openapiFields.add("forDia");
    openapiFields.add("qTotMes");
    openapiFields.add("qTotAnt");
    openapiFields.add("qTotGer");
    openapiFields.add("deduc");
    openapiFields.add("vFor");
    openapiFields.add("vTotDed");
    openapiFields.add("vLiqFor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("safra");
    openapiRequiredFields.add("ref");
    openapiRequiredFields.add("forDia");
    openapiRequiredFields.add("qTotMes");
    openapiRequiredFields.add("qTotAnt");
    openapiRequiredFields.add("qTotGer");
    openapiRequiredFields.add("vFor");
    openapiRequiredFields.add("vTotDed");
    openapiRequiredFields.add("vLiqFor");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfeSefazCana
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfeSefazCana.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfeSefazCana is not found in the empty JSON string", NfeSefazCana.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfeSefazCana.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfeSefazCana` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NfeSefazCana.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("safra") != null && !jsonObj.get("safra").isJsonNull()) && !jsonObj.get("safra").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `safra` to be a primitive type in the JSON string but got `%s`", jsonObj.get("safra").toString()));
      }
      if ((jsonObj.get("ref") != null && !jsonObj.get("ref").isJsonNull()) && !jsonObj.get("ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ref").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("forDia").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `forDia` to be an array in the JSON string but got `%s`", jsonObj.get("forDia").toString()));
      }

      JsonArray jsonArrayforDia = jsonObj.getAsJsonArray("forDia");
      // validate the required field `forDia` (array)
      for (int i = 0; i < jsonArrayforDia.size(); i++) {
        NfeSefazForDia.validateJsonElement(jsonArrayforDia.get(i));
      };
      if (jsonObj.get("deduc") != null && !jsonObj.get("deduc").isJsonNull()) {
        JsonArray jsonArraydeduc = jsonObj.getAsJsonArray("deduc");
        if (jsonArraydeduc != null) {
          // ensure the json data is an array
          if (!jsonObj.get("deduc").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `deduc` to be an array in the JSON string but got `%s`", jsonObj.get("deduc").toString()));
          }

          // validate the optional field `deduc` (array)
          for (int i = 0; i < jsonArraydeduc.size(); i++) {
            NfeSefazDeduc.validateJsonElement(jsonArraydeduc.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NfeSefazCana.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfeSefazCana' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfeSefazCana> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfeSefazCana.class));

       return (TypeAdapter<T>) new TypeAdapter<NfeSefazCana>() {
           @Override
           public void write(JsonWriter out, NfeSefazCana value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfeSefazCana read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfeSefazCana given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfeSefazCana
   * @throws IOException if the JSON string is invalid with respect to NfeSefazCana
   */
  public static NfeSefazCana fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfeSefazCana.class);
  }

  /**
   * Convert an instance of NfeSefazCana to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

