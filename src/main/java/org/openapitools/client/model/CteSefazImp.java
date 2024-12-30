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
import java.util.Arrays;
import org.openapitools.client.model.CteSefazICMS00;
import org.openapitools.client.model.CteSefazICMS20;
import org.openapitools.client.model.CteSefazICMS45;
import org.openapitools.client.model.CteSefazICMS60;
import org.openapitools.client.model.CteSefazICMS90;
import org.openapitools.client.model.CteSefazICMSOutraUF;
import org.openapitools.client.model.CteSefazICMSSN;

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
 * Informações relativas ao ICMS.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class CteSefazImp {
  public static final String SERIALIZED_NAME_I_C_M_S00 = "ICMS00";
  @SerializedName(SERIALIZED_NAME_I_C_M_S00)
  @javax.annotation.Nullable
  private CteSefazICMS00 ICMS00;

  public static final String SERIALIZED_NAME_I_C_M_S20 = "ICMS20";
  @SerializedName(SERIALIZED_NAME_I_C_M_S20)
  @javax.annotation.Nullable
  private CteSefazICMS20 ICMS20;

  public static final String SERIALIZED_NAME_I_C_M_S45 = "ICMS45";
  @SerializedName(SERIALIZED_NAME_I_C_M_S45)
  @javax.annotation.Nullable
  private CteSefazICMS45 ICMS45;

  public static final String SERIALIZED_NAME_I_C_M_S60 = "ICMS60";
  @SerializedName(SERIALIZED_NAME_I_C_M_S60)
  @javax.annotation.Nullable
  private CteSefazICMS60 ICMS60;

  public static final String SERIALIZED_NAME_I_C_M_S90 = "ICMS90";
  @SerializedName(SERIALIZED_NAME_I_C_M_S90)
  @javax.annotation.Nullable
  private CteSefazICMS90 ICMS90;

  public static final String SERIALIZED_NAME_IC_M_S_OUTRA_U_F = "ICMSOutraUF";
  @SerializedName(SERIALIZED_NAME_IC_M_S_OUTRA_U_F)
  @javax.annotation.Nullable
  private CteSefazICMSOutraUF icMSOutraUF;

  public static final String SERIALIZED_NAME_I_C_M_S_S_N = "ICMSSN";
  @SerializedName(SERIALIZED_NAME_I_C_M_S_S_N)
  @javax.annotation.Nullable
  private CteSefazICMSSN ICMSSN;

  public CteSefazImp() {
  }

  public CteSefazImp ICMS00(@javax.annotation.Nullable CteSefazICMS00 ICMS00) {
    this.ICMS00 = ICMS00;
    return this;
  }

  /**
   * Get ICMS00
   * @return ICMS00
   */
  @javax.annotation.Nullable
  public CteSefazICMS00 getICMS00() {
    return ICMS00;
  }

  public void setICMS00(@javax.annotation.Nullable CteSefazICMS00 ICMS00) {
    this.ICMS00 = ICMS00;
  }


  public CteSefazImp ICMS20(@javax.annotation.Nullable CteSefazICMS20 ICMS20) {
    this.ICMS20 = ICMS20;
    return this;
  }

  /**
   * Get ICMS20
   * @return ICMS20
   */
  @javax.annotation.Nullable
  public CteSefazICMS20 getICMS20() {
    return ICMS20;
  }

  public void setICMS20(@javax.annotation.Nullable CteSefazICMS20 ICMS20) {
    this.ICMS20 = ICMS20;
  }


  public CteSefazImp ICMS45(@javax.annotation.Nullable CteSefazICMS45 ICMS45) {
    this.ICMS45 = ICMS45;
    return this;
  }

  /**
   * Get ICMS45
   * @return ICMS45
   */
  @javax.annotation.Nullable
  public CteSefazICMS45 getICMS45() {
    return ICMS45;
  }

  public void setICMS45(@javax.annotation.Nullable CteSefazICMS45 ICMS45) {
    this.ICMS45 = ICMS45;
  }


  public CteSefazImp ICMS60(@javax.annotation.Nullable CteSefazICMS60 ICMS60) {
    this.ICMS60 = ICMS60;
    return this;
  }

  /**
   * Get ICMS60
   * @return ICMS60
   */
  @javax.annotation.Nullable
  public CteSefazICMS60 getICMS60() {
    return ICMS60;
  }

  public void setICMS60(@javax.annotation.Nullable CteSefazICMS60 ICMS60) {
    this.ICMS60 = ICMS60;
  }


  public CteSefazImp ICMS90(@javax.annotation.Nullable CteSefazICMS90 ICMS90) {
    this.ICMS90 = ICMS90;
    return this;
  }

  /**
   * Get ICMS90
   * @return ICMS90
   */
  @javax.annotation.Nullable
  public CteSefazICMS90 getICMS90() {
    return ICMS90;
  }

  public void setICMS90(@javax.annotation.Nullable CteSefazICMS90 ICMS90) {
    this.ICMS90 = ICMS90;
  }


  public CteSefazImp icMSOutraUF(@javax.annotation.Nullable CteSefazICMSOutraUF icMSOutraUF) {
    this.icMSOutraUF = icMSOutraUF;
    return this;
  }

  /**
   * Get icMSOutraUF
   * @return icMSOutraUF
   */
  @javax.annotation.Nullable
  public CteSefazICMSOutraUF getIcMSOutraUF() {
    return icMSOutraUF;
  }

  public void setIcMSOutraUF(@javax.annotation.Nullable CteSefazICMSOutraUF icMSOutraUF) {
    this.icMSOutraUF = icMSOutraUF;
  }


  public CteSefazImp ICMSSN(@javax.annotation.Nullable CteSefazICMSSN ICMSSN) {
    this.ICMSSN = ICMSSN;
    return this;
  }

  /**
   * Get ICMSSN
   * @return ICMSSN
   */
  @javax.annotation.Nullable
  public CteSefazICMSSN getICMSSN() {
    return ICMSSN;
  }

  public void setICMSSN(@javax.annotation.Nullable CteSefazICMSSN ICMSSN) {
    this.ICMSSN = ICMSSN;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CteSefazImp cteSefazImp = (CteSefazImp) o;
    return Objects.equals(this.ICMS00, cteSefazImp.ICMS00) &&
        Objects.equals(this.ICMS20, cteSefazImp.ICMS20) &&
        Objects.equals(this.ICMS45, cteSefazImp.ICMS45) &&
        Objects.equals(this.ICMS60, cteSefazImp.ICMS60) &&
        Objects.equals(this.ICMS90, cteSefazImp.ICMS90) &&
        Objects.equals(this.icMSOutraUF, cteSefazImp.icMSOutraUF) &&
        Objects.equals(this.ICMSSN, cteSefazImp.ICMSSN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ICMS00, ICMS20, ICMS45, ICMS60, ICMS90, icMSOutraUF, ICMSSN);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CteSefazImp {\n");
    sb.append("    ICMS00: ").append(toIndentedString(ICMS00)).append("\n");
    sb.append("    ICMS20: ").append(toIndentedString(ICMS20)).append("\n");
    sb.append("    ICMS45: ").append(toIndentedString(ICMS45)).append("\n");
    sb.append("    ICMS60: ").append(toIndentedString(ICMS60)).append("\n");
    sb.append("    ICMS90: ").append(toIndentedString(ICMS90)).append("\n");
    sb.append("    icMSOutraUF: ").append(toIndentedString(icMSOutraUF)).append("\n");
    sb.append("    ICMSSN: ").append(toIndentedString(ICMSSN)).append("\n");
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
    openapiFields.add("ICMS00");
    openapiFields.add("ICMS20");
    openapiFields.add("ICMS45");
    openapiFields.add("ICMS60");
    openapiFields.add("ICMS90");
    openapiFields.add("ICMSOutraUF");
    openapiFields.add("ICMSSN");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CteSefazImp
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CteSefazImp.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CteSefazImp is not found in the empty JSON string", CteSefazImp.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CteSefazImp.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CteSefazImp` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ICMS00`
      if (jsonObj.get("ICMS00") != null && !jsonObj.get("ICMS00").isJsonNull()) {
        CteSefazICMS00.validateJsonElement(jsonObj.get("ICMS00"));
      }
      // validate the optional field `ICMS20`
      if (jsonObj.get("ICMS20") != null && !jsonObj.get("ICMS20").isJsonNull()) {
        CteSefazICMS20.validateJsonElement(jsonObj.get("ICMS20"));
      }
      // validate the optional field `ICMS45`
      if (jsonObj.get("ICMS45") != null && !jsonObj.get("ICMS45").isJsonNull()) {
        CteSefazICMS45.validateJsonElement(jsonObj.get("ICMS45"));
      }
      // validate the optional field `ICMS60`
      if (jsonObj.get("ICMS60") != null && !jsonObj.get("ICMS60").isJsonNull()) {
        CteSefazICMS60.validateJsonElement(jsonObj.get("ICMS60"));
      }
      // validate the optional field `ICMS90`
      if (jsonObj.get("ICMS90") != null && !jsonObj.get("ICMS90").isJsonNull()) {
        CteSefazICMS90.validateJsonElement(jsonObj.get("ICMS90"));
      }
      // validate the optional field `ICMSOutraUF`
      if (jsonObj.get("ICMSOutraUF") != null && !jsonObj.get("ICMSOutraUF").isJsonNull()) {
        CteSefazICMSOutraUF.validateJsonElement(jsonObj.get("ICMSOutraUF"));
      }
      // validate the optional field `ICMSSN`
      if (jsonObj.get("ICMSSN") != null && !jsonObj.get("ICMSSN").isJsonNull()) {
        CteSefazICMSSN.validateJsonElement(jsonObj.get("ICMSSN"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CteSefazImp.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CteSefazImp' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CteSefazImp> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CteSefazImp.class));

       return (TypeAdapter<T>) new TypeAdapter<CteSefazImp>() {
           @Override
           public void write(JsonWriter out, CteSefazImp value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CteSefazImp read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CteSefazImp given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CteSefazImp
   * @throws IOException if the JSON string is invalid with respect to CteSefazImp
   */
  public static CteSefazImp fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CteSefazImp.class);
  }

  /**
   * Convert an instance of CteSefazImp to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

