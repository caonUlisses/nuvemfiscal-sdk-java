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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.NfeSefazLacres;
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
 * Dados dos volumes.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfeSefazVol {
  public static final String SERIALIZED_NAME_Q_VOL = "qVol";
  @SerializedName(SERIALIZED_NAME_Q_VOL)
  @javax.annotation.Nullable
  private Integer qVol;

  public static final String SERIALIZED_NAME_ESP = "esp";
  @SerializedName(SERIALIZED_NAME_ESP)
  @javax.annotation.Nullable
  private String esp;

  public static final String SERIALIZED_NAME_MARCA = "marca";
  @SerializedName(SERIALIZED_NAME_MARCA)
  @javax.annotation.Nullable
  private String marca;

  public static final String SERIALIZED_NAME_N_VOL = "nVol";
  @SerializedName(SERIALIZED_NAME_N_VOL)
  @javax.annotation.Nullable
  private String nVol;

  public static final String SERIALIZED_NAME_PESO_L = "pesoL";
  @SerializedName(SERIALIZED_NAME_PESO_L)
  @javax.annotation.Nullable
  private BigDecimal pesoL;

  public static final String SERIALIZED_NAME_PESO_B = "pesoB";
  @SerializedName(SERIALIZED_NAME_PESO_B)
  @javax.annotation.Nullable
  private BigDecimal pesoB;

  public static final String SERIALIZED_NAME_LACRES = "lacres";
  @SerializedName(SERIALIZED_NAME_LACRES)
  @javax.annotation.Nullable
  private List<NfeSefazLacres> lacres = new ArrayList<>();

  public NfeSefazVol() {
  }

  public NfeSefazVol qVol(@javax.annotation.Nullable Integer qVol) {
    this.qVol = qVol;
    return this;
  }

  /**
   * Quantidade de volumes transportados.
   * @return qVol
   */
  @javax.annotation.Nullable
  public Integer getqVol() {
    return qVol;
  }

  public void setqVol(@javax.annotation.Nullable Integer qVol) {
    this.qVol = qVol;
  }


  public NfeSefazVol esp(@javax.annotation.Nullable String esp) {
    this.esp = esp;
    return this;
  }

  /**
   * Espécie dos volumes transportados.
   * @return esp
   */
  @javax.annotation.Nullable
  public String getEsp() {
    return esp;
  }

  public void setEsp(@javax.annotation.Nullable String esp) {
    this.esp = esp;
  }


  public NfeSefazVol marca(@javax.annotation.Nullable String marca) {
    this.marca = marca;
    return this;
  }

  /**
   * Marca dos volumes transportados.
   * @return marca
   */
  @javax.annotation.Nullable
  public String getMarca() {
    return marca;
  }

  public void setMarca(@javax.annotation.Nullable String marca) {
    this.marca = marca;
  }


  public NfeSefazVol nVol(@javax.annotation.Nullable String nVol) {
    this.nVol = nVol;
    return this;
  }

  /**
   * Numeração dos volumes transportados.
   * @return nVol
   */
  @javax.annotation.Nullable
  public String getnVol() {
    return nVol;
  }

  public void setnVol(@javax.annotation.Nullable String nVol) {
    this.nVol = nVol;
  }


  public NfeSefazVol pesoL(@javax.annotation.Nullable BigDecimal pesoL) {
    this.pesoL = pesoL;
    return this;
  }

  /**
   * Peso líquido (em kg).
   * minimum: 0
   * @return pesoL
   */
  @javax.annotation.Nullable
  public BigDecimal getPesoL() {
    return pesoL;
  }

  public void setPesoL(@javax.annotation.Nullable BigDecimal pesoL) {
    this.pesoL = pesoL;
  }


  public NfeSefazVol pesoB(@javax.annotation.Nullable BigDecimal pesoB) {
    this.pesoB = pesoB;
    return this;
  }

  /**
   * Peso bruto (em kg).
   * minimum: 0
   * @return pesoB
   */
  @javax.annotation.Nullable
  public BigDecimal getPesoB() {
    return pesoB;
  }

  public void setPesoB(@javax.annotation.Nullable BigDecimal pesoB) {
    this.pesoB = pesoB;
  }


  public NfeSefazVol lacres(@javax.annotation.Nullable List<NfeSefazLacres> lacres) {
    this.lacres = lacres;
    return this;
  }

  public NfeSefazVol addLacresItem(NfeSefazLacres lacresItem) {
    if (this.lacres == null) {
      this.lacres = new ArrayList<>();
    }
    this.lacres.add(lacresItem);
    return this;
  }

  /**
   * Get lacres
   * @return lacres
   */
  @javax.annotation.Nullable
  public List<NfeSefazLacres> getLacres() {
    return lacres;
  }

  public void setLacres(@javax.annotation.Nullable List<NfeSefazLacres> lacres) {
    this.lacres = lacres;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfeSefazVol nfeSefazVol = (NfeSefazVol) o;
    return Objects.equals(this.qVol, nfeSefazVol.qVol) &&
        Objects.equals(this.esp, nfeSefazVol.esp) &&
        Objects.equals(this.marca, nfeSefazVol.marca) &&
        Objects.equals(this.nVol, nfeSefazVol.nVol) &&
        Objects.equals(this.pesoL, nfeSefazVol.pesoL) &&
        Objects.equals(this.pesoB, nfeSefazVol.pesoB) &&
        Objects.equals(this.lacres, nfeSefazVol.lacres);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(qVol, esp, marca, nVol, pesoL, pesoB, lacres);
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
    sb.append("class NfeSefazVol {\n");
    sb.append("    qVol: ").append(toIndentedString(qVol)).append("\n");
    sb.append("    esp: ").append(toIndentedString(esp)).append("\n");
    sb.append("    marca: ").append(toIndentedString(marca)).append("\n");
    sb.append("    nVol: ").append(toIndentedString(nVol)).append("\n");
    sb.append("    pesoL: ").append(toIndentedString(pesoL)).append("\n");
    sb.append("    pesoB: ").append(toIndentedString(pesoB)).append("\n");
    sb.append("    lacres: ").append(toIndentedString(lacres)).append("\n");
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
    openapiFields.add("qVol");
    openapiFields.add("esp");
    openapiFields.add("marca");
    openapiFields.add("nVol");
    openapiFields.add("pesoL");
    openapiFields.add("pesoB");
    openapiFields.add("lacres");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfeSefazVol
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfeSefazVol.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfeSefazVol is not found in the empty JSON string", NfeSefazVol.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfeSefazVol.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfeSefazVol` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("esp") != null && !jsonObj.get("esp").isJsonNull()) && !jsonObj.get("esp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `esp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("esp").toString()));
      }
      if ((jsonObj.get("marca") != null && !jsonObj.get("marca").isJsonNull()) && !jsonObj.get("marca").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `marca` to be a primitive type in the JSON string but got `%s`", jsonObj.get("marca").toString()));
      }
      if ((jsonObj.get("nVol") != null && !jsonObj.get("nVol").isJsonNull()) && !jsonObj.get("nVol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nVol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nVol").toString()));
      }
      if (jsonObj.get("lacres") != null && !jsonObj.get("lacres").isJsonNull()) {
        JsonArray jsonArraylacres = jsonObj.getAsJsonArray("lacres");
        if (jsonArraylacres != null) {
          // ensure the json data is an array
          if (!jsonObj.get("lacres").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `lacres` to be an array in the JSON string but got `%s`", jsonObj.get("lacres").toString()));
          }

          // validate the optional field `lacres` (array)
          for (int i = 0; i < jsonArraylacres.size(); i++) {
            NfeSefazLacres.validateJsonElement(jsonArraylacres.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NfeSefazVol.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfeSefazVol' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfeSefazVol> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfeSefazVol.class));

       return (TypeAdapter<T>) new TypeAdapter<NfeSefazVol>() {
           @Override
           public void write(JsonWriter out, NfeSefazVol value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfeSefazVol read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfeSefazVol given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfeSefazVol
   * @throws IOException if the JSON string is invalid with respect to NfeSefazVol
   */
  public static NfeSefazVol fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfeSefazVol.class);
  }

  /**
   * Convert an instance of NfeSefazVol to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

