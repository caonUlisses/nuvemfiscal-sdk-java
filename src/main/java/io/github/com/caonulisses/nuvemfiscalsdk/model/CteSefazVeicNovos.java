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
 * informações dos veículos transportados.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class CteSefazVeicNovos {
  public static final String SERIALIZED_NAME_CHASSI = "chassi";
  @SerializedName(SERIALIZED_NAME_CHASSI)
  @javax.annotation.Nullable
  private String chassi;

  public static final String SERIALIZED_NAME_C_COR = "cCor";
  @SerializedName(SERIALIZED_NAME_C_COR)
  @javax.annotation.Nullable
  private String cCor;

  public static final String SERIALIZED_NAME_X_COR = "xCor";
  @SerializedName(SERIALIZED_NAME_X_COR)
  @javax.annotation.Nullable
  private String xCor;

  public static final String SERIALIZED_NAME_C_MOD = "cMod";
  @SerializedName(SERIALIZED_NAME_C_MOD)
  @javax.annotation.Nullable
  private String cMod;

  public static final String SERIALIZED_NAME_V_UNIT = "vUnit";
  @SerializedName(SERIALIZED_NAME_V_UNIT)
  @javax.annotation.Nullable
  private BigDecimal vUnit;

  public static final String SERIALIZED_NAME_V_FRETE = "vFrete";
  @SerializedName(SERIALIZED_NAME_V_FRETE)
  @javax.annotation.Nullable
  private BigDecimal vFrete;

  public CteSefazVeicNovos() {
  }

  public CteSefazVeicNovos chassi(@javax.annotation.Nullable String chassi) {
    this.chassi = chassi;
    return this;
  }

  /**
   * Chassi do veículo.
   * @return chassi
   */
  @javax.annotation.Nullable
  public String getChassi() {
    return chassi;
  }

  public void setChassi(@javax.annotation.Nullable String chassi) {
    this.chassi = chassi;
  }


  public CteSefazVeicNovos cCor(@javax.annotation.Nullable String cCor) {
    this.cCor = cCor;
    return this;
  }

  /**
   * Cor do veículo.  Código de cada montadora.
   * @return cCor
   */
  @javax.annotation.Nullable
  public String getcCor() {
    return cCor;
  }

  public void setcCor(@javax.annotation.Nullable String cCor) {
    this.cCor = cCor;
  }


  public CteSefazVeicNovos xCor(@javax.annotation.Nullable String xCor) {
    this.xCor = xCor;
    return this;
  }

  /**
   * Descrição da cor.
   * @return xCor
   */
  @javax.annotation.Nullable
  public String getxCor() {
    return xCor;
  }

  public void setxCor(@javax.annotation.Nullable String xCor) {
    this.xCor = xCor;
  }


  public CteSefazVeicNovos cMod(@javax.annotation.Nullable String cMod) {
    this.cMod = cMod;
    return this;
  }

  /**
   * Código Marca Modelo.  Utilizar tabela RENAVAM.
   * @return cMod
   */
  @javax.annotation.Nullable
  public String getcMod() {
    return cMod;
  }

  public void setcMod(@javax.annotation.Nullable String cMod) {
    this.cMod = cMod;
  }


  public CteSefazVeicNovos vUnit(@javax.annotation.Nullable BigDecimal vUnit) {
    this.vUnit = vUnit;
    return this;
  }

  /**
   * Valor Unitário do Veículo.
   * minimum: 0
   * @return vUnit
   */
  @javax.annotation.Nullable
  public BigDecimal getvUnit() {
    return vUnit;
  }

  public void setvUnit(@javax.annotation.Nullable BigDecimal vUnit) {
    this.vUnit = vUnit;
  }


  public CteSefazVeicNovos vFrete(@javax.annotation.Nullable BigDecimal vFrete) {
    this.vFrete = vFrete;
    return this;
  }

  /**
   * Frete Unitário.
   * minimum: 0
   * @return vFrete
   */
  @javax.annotation.Nullable
  public BigDecimal getvFrete() {
    return vFrete;
  }

  public void setvFrete(@javax.annotation.Nullable BigDecimal vFrete) {
    this.vFrete = vFrete;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CteSefazVeicNovos cteSefazVeicNovos = (CteSefazVeicNovos) o;
    return Objects.equals(this.chassi, cteSefazVeicNovos.chassi) &&
        Objects.equals(this.cCor, cteSefazVeicNovos.cCor) &&
        Objects.equals(this.xCor, cteSefazVeicNovos.xCor) &&
        Objects.equals(this.cMod, cteSefazVeicNovos.cMod) &&
        Objects.equals(this.vUnit, cteSefazVeicNovos.vUnit) &&
        Objects.equals(this.vFrete, cteSefazVeicNovos.vFrete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chassi, cCor, xCor, cMod, vUnit, vFrete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CteSefazVeicNovos {\n");
    sb.append("    chassi: ").append(toIndentedString(chassi)).append("\n");
    sb.append("    cCor: ").append(toIndentedString(cCor)).append("\n");
    sb.append("    xCor: ").append(toIndentedString(xCor)).append("\n");
    sb.append("    cMod: ").append(toIndentedString(cMod)).append("\n");
    sb.append("    vUnit: ").append(toIndentedString(vUnit)).append("\n");
    sb.append("    vFrete: ").append(toIndentedString(vFrete)).append("\n");
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
    openapiFields.add("chassi");
    openapiFields.add("cCor");
    openapiFields.add("xCor");
    openapiFields.add("cMod");
    openapiFields.add("vUnit");
    openapiFields.add("vFrete");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("chassi");
    openapiRequiredFields.add("cCor");
    openapiRequiredFields.add("xCor");
    openapiRequiredFields.add("cMod");
    openapiRequiredFields.add("vUnit");
    openapiRequiredFields.add("vFrete");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CteSefazVeicNovos
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CteSefazVeicNovos.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CteSefazVeicNovos is not found in the empty JSON string", CteSefazVeicNovos.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CteSefazVeicNovos.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CteSefazVeicNovos` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CteSefazVeicNovos.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("chassi") != null && !jsonObj.get("chassi").isJsonNull()) && !jsonObj.get("chassi").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chassi` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chassi").toString()));
      }
      if ((jsonObj.get("cCor") != null && !jsonObj.get("cCor").isJsonNull()) && !jsonObj.get("cCor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cCor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cCor").toString()));
      }
      if ((jsonObj.get("xCor") != null && !jsonObj.get("xCor").isJsonNull()) && !jsonObj.get("xCor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xCor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xCor").toString()));
      }
      if ((jsonObj.get("cMod") != null && !jsonObj.get("cMod").isJsonNull()) && !jsonObj.get("cMod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cMod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cMod").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CteSefazVeicNovos.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CteSefazVeicNovos' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CteSefazVeicNovos> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CteSefazVeicNovos.class));

       return (TypeAdapter<T>) new TypeAdapter<CteSefazVeicNovos>() {
           @Override
           public void write(JsonWriter out, CteSefazVeicNovos value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CteSefazVeicNovos read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CteSefazVeicNovos given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CteSefazVeicNovos
   * @throws IOException if the JSON string is invalid with respect to CteSefazVeicNovos
   */
  public static CteSefazVeicNovos fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CteSefazVeicNovos.class);
  }

  /**
   * Convert an instance of CteSefazVeicNovos to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

