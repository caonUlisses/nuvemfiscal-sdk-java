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
 * Informações do grupo de \&quot;encerrante\&quot;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfeSefazEncerrante {
  public static final String SERIALIZED_NAME_N_BICO = "nBico";
  @SerializedName(SERIALIZED_NAME_N_BICO)
  @javax.annotation.Nullable
  private Integer nBico;

  public static final String SERIALIZED_NAME_N_BOMBA = "nBomba";
  @SerializedName(SERIALIZED_NAME_N_BOMBA)
  @javax.annotation.Nullable
  private Integer nBomba;

  public static final String SERIALIZED_NAME_N_TANQUE = "nTanque";
  @SerializedName(SERIALIZED_NAME_N_TANQUE)
  @javax.annotation.Nullable
  private Integer nTanque;

  public static final String SERIALIZED_NAME_V_ENC_INI = "vEncIni";
  @SerializedName(SERIALIZED_NAME_V_ENC_INI)
  @javax.annotation.Nullable
  private BigDecimal vEncIni;

  public static final String SERIALIZED_NAME_V_ENC_FIN = "vEncFin";
  @SerializedName(SERIALIZED_NAME_V_ENC_FIN)
  @javax.annotation.Nullable
  private BigDecimal vEncFin;

  public NfeSefazEncerrante() {
  }

  public NfeSefazEncerrante nBico(@javax.annotation.Nullable Integer nBico) {
    this.nBico = nBico;
    return this;
  }

  /**
   * Numero de identificação do Bico utilizado no abastecimento.
   * minimum: 0
   * maximum: 999
   * @return nBico
   */
  @javax.annotation.Nullable
  public Integer getnBico() {
    return nBico;
  }

  public void setnBico(@javax.annotation.Nullable Integer nBico) {
    this.nBico = nBico;
  }


  public NfeSefazEncerrante nBomba(@javax.annotation.Nullable Integer nBomba) {
    this.nBomba = nBomba;
    return this;
  }

  /**
   * Numero de identificação da bomba ao qual o bico está interligado.
   * minimum: 0
   * maximum: 999
   * @return nBomba
   */
  @javax.annotation.Nullable
  public Integer getnBomba() {
    return nBomba;
  }

  public void setnBomba(@javax.annotation.Nullable Integer nBomba) {
    this.nBomba = nBomba;
  }


  public NfeSefazEncerrante nTanque(@javax.annotation.Nullable Integer nTanque) {
    this.nTanque = nTanque;
    return this;
  }

  /**
   * Numero de identificação do tanque ao qual o bico está interligado.
   * minimum: 0
   * maximum: 999
   * @return nTanque
   */
  @javax.annotation.Nullable
  public Integer getnTanque() {
    return nTanque;
  }

  public void setnTanque(@javax.annotation.Nullable Integer nTanque) {
    this.nTanque = nTanque;
  }


  public NfeSefazEncerrante vEncIni(@javax.annotation.Nullable BigDecimal vEncIni) {
    this.vEncIni = vEncIni;
    return this;
  }

  /**
   * Valor do Encerrante no ínicio do abastecimento.
   * minimum: 0
   * @return vEncIni
   */
  @javax.annotation.Nullable
  public BigDecimal getvEncIni() {
    return vEncIni;
  }

  public void setvEncIni(@javax.annotation.Nullable BigDecimal vEncIni) {
    this.vEncIni = vEncIni;
  }


  public NfeSefazEncerrante vEncFin(@javax.annotation.Nullable BigDecimal vEncFin) {
    this.vEncFin = vEncFin;
    return this;
  }

  /**
   * Valor do Encerrante no final do abastecimento.
   * minimum: 0
   * @return vEncFin
   */
  @javax.annotation.Nullable
  public BigDecimal getvEncFin() {
    return vEncFin;
  }

  public void setvEncFin(@javax.annotation.Nullable BigDecimal vEncFin) {
    this.vEncFin = vEncFin;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfeSefazEncerrante nfeSefazEncerrante = (NfeSefazEncerrante) o;
    return Objects.equals(this.nBico, nfeSefazEncerrante.nBico) &&
        Objects.equals(this.nBomba, nfeSefazEncerrante.nBomba) &&
        Objects.equals(this.nTanque, nfeSefazEncerrante.nTanque) &&
        Objects.equals(this.vEncIni, nfeSefazEncerrante.vEncIni) &&
        Objects.equals(this.vEncFin, nfeSefazEncerrante.vEncFin);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(nBico, nBomba, nTanque, vEncIni, vEncFin);
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
    sb.append("class NfeSefazEncerrante {\n");
    sb.append("    nBico: ").append(toIndentedString(nBico)).append("\n");
    sb.append("    nBomba: ").append(toIndentedString(nBomba)).append("\n");
    sb.append("    nTanque: ").append(toIndentedString(nTanque)).append("\n");
    sb.append("    vEncIni: ").append(toIndentedString(vEncIni)).append("\n");
    sb.append("    vEncFin: ").append(toIndentedString(vEncFin)).append("\n");
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
    openapiFields.add("nBico");
    openapiFields.add("nBomba");
    openapiFields.add("nTanque");
    openapiFields.add("vEncIni");
    openapiFields.add("vEncFin");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("nBico");
    openapiRequiredFields.add("nTanque");
    openapiRequiredFields.add("vEncIni");
    openapiRequiredFields.add("vEncFin");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfeSefazEncerrante
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfeSefazEncerrante.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfeSefazEncerrante is not found in the empty JSON string", NfeSefazEncerrante.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfeSefazEncerrante.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfeSefazEncerrante` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NfeSefazEncerrante.openapiRequiredFields) {
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
       if (!NfeSefazEncerrante.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfeSefazEncerrante' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfeSefazEncerrante> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfeSefazEncerrante.class));

       return (TypeAdapter<T>) new TypeAdapter<NfeSefazEncerrante>() {
           @Override
           public void write(JsonWriter out, NfeSefazEncerrante value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfeSefazEncerrante read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfeSefazEncerrante given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfeSefazEncerrante
   * @throws IOException if the JSON string is invalid with respect to NfeSefazEncerrante
   */
  public static NfeSefazEncerrante fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfeSefazEncerrante.class);
  }

  /**
   * Convert an instance of NfeSefazEncerrante to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
