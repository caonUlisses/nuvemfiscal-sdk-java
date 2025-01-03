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
 * informações dos Vagões.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class MdfeSefazVag {
  public static final String SERIALIZED_NAME_PESO_B_C = "pesoBC";
  @SerializedName(SERIALIZED_NAME_PESO_B_C)
  @javax.annotation.Nullable
  private BigDecimal pesoBC;

  public static final String SERIALIZED_NAME_PESO_R = "pesoR";
  @SerializedName(SERIALIZED_NAME_PESO_R)
  @javax.annotation.Nullable
  private BigDecimal pesoR;

  public static final String SERIALIZED_NAME_TP_VAG = "tpVag";
  @SerializedName(SERIALIZED_NAME_TP_VAG)
  @javax.annotation.Nullable
  private String tpVag;

  public static final String SERIALIZED_NAME_SERIE = "serie";
  @SerializedName(SERIALIZED_NAME_SERIE)
  @javax.annotation.Nullable
  private String serie;

  public static final String SERIALIZED_NAME_N_VAG = "nVag";
  @SerializedName(SERIALIZED_NAME_N_VAG)
  @javax.annotation.Nullable
  private Integer nVag;

  public static final String SERIALIZED_NAME_N_SEQ = "nSeq";
  @SerializedName(SERIALIZED_NAME_N_SEQ)
  @javax.annotation.Nullable
  private Integer nSeq;

  public static final String SERIALIZED_NAME_T_U = "TU";
  @SerializedName(SERIALIZED_NAME_T_U)
  @javax.annotation.Nullable
  private BigDecimal TU;

  public MdfeSefazVag() {
  }

  public MdfeSefazVag pesoBC(@javax.annotation.Nullable BigDecimal pesoBC) {
    this.pesoBC = pesoBC;
    return this;
  }

  /**
   * Peso Base de Cálculo de Frete em Toneladas.
   * minimum: 0
   * @return pesoBC
   */
  @javax.annotation.Nullable
  public BigDecimal getPesoBC() {
    return pesoBC;
  }

  public void setPesoBC(@javax.annotation.Nullable BigDecimal pesoBC) {
    this.pesoBC = pesoBC;
  }


  public MdfeSefazVag pesoR(@javax.annotation.Nullable BigDecimal pesoR) {
    this.pesoR = pesoR;
    return this;
  }

  /**
   * Peso Real em Toneladas.
   * minimum: 0
   * @return pesoR
   */
  @javax.annotation.Nullable
  public BigDecimal getPesoR() {
    return pesoR;
  }

  public void setPesoR(@javax.annotation.Nullable BigDecimal pesoR) {
    this.pesoR = pesoR;
  }


  public MdfeSefazVag tpVag(@javax.annotation.Nullable String tpVag) {
    this.tpVag = tpVag;
    return this;
  }

  /**
   * Tipo de Vagão.
   * @return tpVag
   */
  @javax.annotation.Nullable
  public String getTpVag() {
    return tpVag;
  }

  public void setTpVag(@javax.annotation.Nullable String tpVag) {
    this.tpVag = tpVag;
  }


  public MdfeSefazVag serie(@javax.annotation.Nullable String serie) {
    this.serie = serie;
    return this;
  }

  /**
   * Serie de Identificação do vagão.
   * @return serie
   */
  @javax.annotation.Nullable
  public String getSerie() {
    return serie;
  }

  public void setSerie(@javax.annotation.Nullable String serie) {
    this.serie = serie;
  }


  public MdfeSefazVag nVag(@javax.annotation.Nullable Integer nVag) {
    this.nVag = nVag;
    return this;
  }

  /**
   * Número de Identificação do vagão.
   * minimum: 1
   * maximum: 99999999
   * @return nVag
   */
  @javax.annotation.Nullable
  public Integer getnVag() {
    return nVag;
  }

  public void setnVag(@javax.annotation.Nullable Integer nVag) {
    this.nVag = nVag;
  }


  public MdfeSefazVag nSeq(@javax.annotation.Nullable Integer nSeq) {
    this.nSeq = nSeq;
    return this;
  }

  /**
   * Sequencia do vagão na composição.
   * minimum: 1
   * maximum: 999
   * @return nSeq
   */
  @javax.annotation.Nullable
  public Integer getnSeq() {
    return nSeq;
  }

  public void setnSeq(@javax.annotation.Nullable Integer nSeq) {
    this.nSeq = nSeq;
  }


  public MdfeSefazVag TU(@javax.annotation.Nullable BigDecimal TU) {
    this.TU = TU;
    return this;
  }

  /**
   * Tonelada Útil.  Unidade de peso referente à carga útil (apenas o peso da carga transportada), expressa em toneladas.
   * @return TU
   */
  @javax.annotation.Nullable
  public BigDecimal getTU() {
    return TU;
  }

  public void setTU(@javax.annotation.Nullable BigDecimal TU) {
    this.TU = TU;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MdfeSefazVag mdfeSefazVag = (MdfeSefazVag) o;
    return Objects.equals(this.pesoBC, mdfeSefazVag.pesoBC) &&
        Objects.equals(this.pesoR, mdfeSefazVag.pesoR) &&
        Objects.equals(this.tpVag, mdfeSefazVag.tpVag) &&
        Objects.equals(this.serie, mdfeSefazVag.serie) &&
        Objects.equals(this.nVag, mdfeSefazVag.nVag) &&
        Objects.equals(this.nSeq, mdfeSefazVag.nSeq) &&
        Objects.equals(this.TU, mdfeSefazVag.TU);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(pesoBC, pesoR, tpVag, serie, nVag, nSeq, TU);
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
    sb.append("class MdfeSefazVag {\n");
    sb.append("    pesoBC: ").append(toIndentedString(pesoBC)).append("\n");
    sb.append("    pesoR: ").append(toIndentedString(pesoR)).append("\n");
    sb.append("    tpVag: ").append(toIndentedString(tpVag)).append("\n");
    sb.append("    serie: ").append(toIndentedString(serie)).append("\n");
    sb.append("    nVag: ").append(toIndentedString(nVag)).append("\n");
    sb.append("    nSeq: ").append(toIndentedString(nSeq)).append("\n");
    sb.append("    TU: ").append(toIndentedString(TU)).append("\n");
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
    openapiFields.add("pesoBC");
    openapiFields.add("pesoR");
    openapiFields.add("tpVag");
    openapiFields.add("serie");
    openapiFields.add("nVag");
    openapiFields.add("nSeq");
    openapiFields.add("TU");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pesoBC");
    openapiRequiredFields.add("pesoR");
    openapiRequiredFields.add("serie");
    openapiRequiredFields.add("nVag");
    openapiRequiredFields.add("TU");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MdfeSefazVag
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MdfeSefazVag.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MdfeSefazVag is not found in the empty JSON string", MdfeSefazVag.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MdfeSefazVag.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MdfeSefazVag` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MdfeSefazVag.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tpVag") != null && !jsonObj.get("tpVag").isJsonNull()) && !jsonObj.get("tpVag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tpVag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tpVag").toString()));
      }
      if ((jsonObj.get("serie") != null && !jsonObj.get("serie").isJsonNull()) && !jsonObj.get("serie").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serie` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serie").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MdfeSefazVag.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MdfeSefazVag' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MdfeSefazVag> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MdfeSefazVag.class));

       return (TypeAdapter<T>) new TypeAdapter<MdfeSefazVag>() {
           @Override
           public void write(JsonWriter out, MdfeSefazVag value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MdfeSefazVag read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MdfeSefazVag given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MdfeSefazVag
   * @throws IOException if the JSON string is invalid with respect to MdfeSefazVag
   */
  public static MdfeSefazVag fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MdfeSefazVag.class);
  }

  /**
   * Convert an instance of MdfeSefazVag to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

