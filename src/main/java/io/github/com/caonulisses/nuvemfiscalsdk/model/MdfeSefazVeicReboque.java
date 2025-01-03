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
import io.github.com.caonulisses.nuvemfiscalsdk.model.MdfeSefazVeicReboqueProp;
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
 * Dados dos reboques.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class MdfeSefazVeicReboque {
  public static final String SERIALIZED_NAME_C_INT = "cInt";
  @SerializedName(SERIALIZED_NAME_C_INT)
  @javax.annotation.Nullable
  private String cInt;

  public static final String SERIALIZED_NAME_PLACA = "placa";
  @SerializedName(SERIALIZED_NAME_PLACA)
  @javax.annotation.Nullable
  private String placa;

  public static final String SERIALIZED_NAME_R_E_N_A_V_A_M = "RENAVAM";
  @SerializedName(SERIALIZED_NAME_R_E_N_A_V_A_M)
  @javax.annotation.Nullable
  private String RENAVAM;

  public static final String SERIALIZED_NAME_TARA = "tara";
  @SerializedName(SERIALIZED_NAME_TARA)
  @javax.annotation.Nullable
  private Integer tara;

  public static final String SERIALIZED_NAME_CAP_K_G = "capKG";
  @SerializedName(SERIALIZED_NAME_CAP_K_G)
  @javax.annotation.Nullable
  private Integer capKG;

  public static final String SERIALIZED_NAME_CAP_M3 = "capM3";
  @SerializedName(SERIALIZED_NAME_CAP_M3)
  @javax.annotation.Nullable
  private Integer capM3;

  public static final String SERIALIZED_NAME_PROP = "prop";
  @SerializedName(SERIALIZED_NAME_PROP)
  @javax.annotation.Nullable
  private MdfeSefazVeicReboqueProp prop;

  public static final String SERIALIZED_NAME_TP_CAR = "tpCar";
  @SerializedName(SERIALIZED_NAME_TP_CAR)
  @javax.annotation.Nullable
  private String tpCar;

  public static final String SERIALIZED_NAME_U_F = "UF";
  @SerializedName(SERIALIZED_NAME_U_F)
  @javax.annotation.Nullable
  private String UF;

  public MdfeSefazVeicReboque() {
  }

  public MdfeSefazVeicReboque cInt(@javax.annotation.Nullable String cInt) {
    this.cInt = cInt;
    return this;
  }

  /**
   * Código interno do veículo.
   * @return cInt
   */
  @javax.annotation.Nullable
  public String getcInt() {
    return cInt;
  }

  public void setcInt(@javax.annotation.Nullable String cInt) {
    this.cInt = cInt;
  }


  public MdfeSefazVeicReboque placa(@javax.annotation.Nullable String placa) {
    this.placa = placa;
    return this;
  }

  /**
   * Placa do veículo.
   * @return placa
   */
  @javax.annotation.Nullable
  public String getPlaca() {
    return placa;
  }

  public void setPlaca(@javax.annotation.Nullable String placa) {
    this.placa = placa;
  }


  public MdfeSefazVeicReboque RENAVAM(@javax.annotation.Nullable String RENAVAM) {
    this.RENAVAM = RENAVAM;
    return this;
  }

  /**
   * RENAVAM do veículo.
   * @return RENAVAM
   */
  @javax.annotation.Nullable
  public String getRENAVAM() {
    return RENAVAM;
  }

  public void setRENAVAM(@javax.annotation.Nullable String RENAVAM) {
    this.RENAVAM = RENAVAM;
  }


  public MdfeSefazVeicReboque tara(@javax.annotation.Nullable Integer tara) {
    this.tara = tara;
    return this;
  }

  /**
   * Tara em KG.
   * minimum: 0
   * maximum: 999999
   * @return tara
   */
  @javax.annotation.Nullable
  public Integer getTara() {
    return tara;
  }

  public void setTara(@javax.annotation.Nullable Integer tara) {
    this.tara = tara;
  }


  public MdfeSefazVeicReboque capKG(@javax.annotation.Nullable Integer capKG) {
    this.capKG = capKG;
    return this;
  }

  /**
   * Capacidade em KG.
   * minimum: 0
   * maximum: 999999
   * @return capKG
   */
  @javax.annotation.Nullable
  public Integer getCapKG() {
    return capKG;
  }

  public void setCapKG(@javax.annotation.Nullable Integer capKG) {
    this.capKG = capKG;
  }


  public MdfeSefazVeicReboque capM3(@javax.annotation.Nullable Integer capM3) {
    this.capM3 = capM3;
    return this;
  }

  /**
   * Capacidade em M3.
   * minimum: 0
   * maximum: 999
   * @return capM3
   */
  @javax.annotation.Nullable
  public Integer getCapM3() {
    return capM3;
  }

  public void setCapM3(@javax.annotation.Nullable Integer capM3) {
    this.capM3 = capM3;
  }


  public MdfeSefazVeicReboque prop(@javax.annotation.Nullable MdfeSefazVeicReboqueProp prop) {
    this.prop = prop;
    return this;
  }

  /**
   * Get prop
   * @return prop
   */
  @javax.annotation.Nullable
  public MdfeSefazVeicReboqueProp getProp() {
    return prop;
  }

  public void setProp(@javax.annotation.Nullable MdfeSefazVeicReboqueProp prop) {
    this.prop = prop;
  }


  public MdfeSefazVeicReboque tpCar(@javax.annotation.Nullable String tpCar) {
    this.tpCar = tpCar;
    return this;
  }

  /**
   * Tipo de Carroceria.  Preencher com:  * 00 - não aplicável  * 01 - Aberta  * 02 - Fechada/Baú  * 03 - Granelera  * 04 - Porta Container  * 05 - Sider
   * @return tpCar
   */
  @javax.annotation.Nullable
  public String getTpCar() {
    return tpCar;
  }

  public void setTpCar(@javax.annotation.Nullable String tpCar) {
    this.tpCar = tpCar;
  }


  public MdfeSefazVeicReboque UF(@javax.annotation.Nullable String UF) {
    this.UF = UF;
    return this;
  }

  /**
   * UF em que veículo está licenciado.  Sigla da UF de licenciamento do veículo.
   * @return UF
   */
  @javax.annotation.Nullable
  public String getUF() {
    return UF;
  }

  public void setUF(@javax.annotation.Nullable String UF) {
    this.UF = UF;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MdfeSefazVeicReboque mdfeSefazVeicReboque = (MdfeSefazVeicReboque) o;
    return Objects.equals(this.cInt, mdfeSefazVeicReboque.cInt) &&
        Objects.equals(this.placa, mdfeSefazVeicReboque.placa) &&
        Objects.equals(this.RENAVAM, mdfeSefazVeicReboque.RENAVAM) &&
        Objects.equals(this.tara, mdfeSefazVeicReboque.tara) &&
        Objects.equals(this.capKG, mdfeSefazVeicReboque.capKG) &&
        Objects.equals(this.capM3, mdfeSefazVeicReboque.capM3) &&
        Objects.equals(this.prop, mdfeSefazVeicReboque.prop) &&
        Objects.equals(this.tpCar, mdfeSefazVeicReboque.tpCar) &&
        Objects.equals(this.UF, mdfeSefazVeicReboque.UF);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cInt, placa, RENAVAM, tara, capKG, capM3, prop, tpCar, UF);
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
    sb.append("class MdfeSefazVeicReboque {\n");
    sb.append("    cInt: ").append(toIndentedString(cInt)).append("\n");
    sb.append("    placa: ").append(toIndentedString(placa)).append("\n");
    sb.append("    RENAVAM: ").append(toIndentedString(RENAVAM)).append("\n");
    sb.append("    tara: ").append(toIndentedString(tara)).append("\n");
    sb.append("    capKG: ").append(toIndentedString(capKG)).append("\n");
    sb.append("    capM3: ").append(toIndentedString(capM3)).append("\n");
    sb.append("    prop: ").append(toIndentedString(prop)).append("\n");
    sb.append("    tpCar: ").append(toIndentedString(tpCar)).append("\n");
    sb.append("    UF: ").append(toIndentedString(UF)).append("\n");
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
    openapiFields.add("cInt");
    openapiFields.add("placa");
    openapiFields.add("RENAVAM");
    openapiFields.add("tara");
    openapiFields.add("capKG");
    openapiFields.add("capM3");
    openapiFields.add("prop");
    openapiFields.add("tpCar");
    openapiFields.add("UF");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("placa");
    openapiRequiredFields.add("tara");
    openapiRequiredFields.add("capKG");
    openapiRequiredFields.add("tpCar");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MdfeSefazVeicReboque
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MdfeSefazVeicReboque.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MdfeSefazVeicReboque is not found in the empty JSON string", MdfeSefazVeicReboque.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MdfeSefazVeicReboque.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MdfeSefazVeicReboque` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MdfeSefazVeicReboque.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cInt") != null && !jsonObj.get("cInt").isJsonNull()) && !jsonObj.get("cInt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cInt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cInt").toString()));
      }
      if ((jsonObj.get("placa") != null && !jsonObj.get("placa").isJsonNull()) && !jsonObj.get("placa").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `placa` to be a primitive type in the JSON string but got `%s`", jsonObj.get("placa").toString()));
      }
      if ((jsonObj.get("RENAVAM") != null && !jsonObj.get("RENAVAM").isJsonNull()) && !jsonObj.get("RENAVAM").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RENAVAM` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RENAVAM").toString()));
      }
      // validate the optional field `prop`
      if (jsonObj.get("prop") != null && !jsonObj.get("prop").isJsonNull()) {
        MdfeSefazVeicReboqueProp.validateJsonElement(jsonObj.get("prop"));
      }
      if ((jsonObj.get("tpCar") != null && !jsonObj.get("tpCar").isJsonNull()) && !jsonObj.get("tpCar").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tpCar` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tpCar").toString()));
      }
      if ((jsonObj.get("UF") != null && !jsonObj.get("UF").isJsonNull()) && !jsonObj.get("UF").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `UF` to be a primitive type in the JSON string but got `%s`", jsonObj.get("UF").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MdfeSefazVeicReboque.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MdfeSefazVeicReboque' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MdfeSefazVeicReboque> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MdfeSefazVeicReboque.class));

       return (TypeAdapter<T>) new TypeAdapter<MdfeSefazVeicReboque>() {
           @Override
           public void write(JsonWriter out, MdfeSefazVeicReboque value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MdfeSefazVeicReboque read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MdfeSefazVeicReboque given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MdfeSefazVeicReboque
   * @throws IOException if the JSON string is invalid with respect to MdfeSefazVeicReboque
   */
  public static MdfeSefazVeicReboque fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MdfeSefazVeicReboque.class);
  }

  /**
   * Convert an instance of MdfeSefazVeicReboque to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

