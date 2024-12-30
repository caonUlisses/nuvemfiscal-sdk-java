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
import org.openapitools.client.model.CteSefazICMSUFFim;
import org.openapitools.client.model.CteSefazImp;
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
 * Informações relativas aos Impostos.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class CteSefazInfCteImp {
  public static final String SERIALIZED_NAME_I_C_M_S = "ICMS";
  @SerializedName(SERIALIZED_NAME_I_C_M_S)
  @javax.annotation.Nonnull
  private CteSefazImp ICMS;

  public static final String SERIALIZED_NAME_V_TOT_TRIB = "vTotTrib";
  @SerializedName(SERIALIZED_NAME_V_TOT_TRIB)
  @javax.annotation.Nullable
  private BigDecimal vTotTrib;

  public static final String SERIALIZED_NAME_INF_AD_FISCO = "infAdFisco";
  @SerializedName(SERIALIZED_NAME_INF_AD_FISCO)
  @javax.annotation.Nullable
  private String infAdFisco;

  public static final String SERIALIZED_NAME_IC_M_S_U_F_FIM = "ICMSUFFim";
  @SerializedName(SERIALIZED_NAME_IC_M_S_U_F_FIM)
  @javax.annotation.Nullable
  private CteSefazICMSUFFim icMSUFFim;

  public CteSefazInfCteImp() {
  }

  public CteSefazInfCteImp ICMS(@javax.annotation.Nonnull CteSefazImp ICMS) {
    this.ICMS = ICMS;
    return this;
  }

  /**
   * Get ICMS
   * @return ICMS
   */
  @javax.annotation.Nonnull
  public CteSefazImp getICMS() {
    return ICMS;
  }

  public void setICMS(@javax.annotation.Nonnull CteSefazImp ICMS) {
    this.ICMS = ICMS;
  }


  public CteSefazInfCteImp vTotTrib(@javax.annotation.Nullable BigDecimal vTotTrib) {
    this.vTotTrib = vTotTrib;
    return this;
  }

  /**
   * Valor Total dos Tributos.
   * minimum: 0
   * @return vTotTrib
   */
  @javax.annotation.Nullable
  public BigDecimal getvTotTrib() {
    return vTotTrib;
  }

  public void setvTotTrib(@javax.annotation.Nullable BigDecimal vTotTrib) {
    this.vTotTrib = vTotTrib;
  }


  public CteSefazInfCteImp infAdFisco(@javax.annotation.Nullable String infAdFisco) {
    this.infAdFisco = infAdFisco;
    return this;
  }

  /**
   * Informações adicionais de interesse do Fisco.  Norma referenciada, informações complementares, etc.
   * @return infAdFisco
   */
  @javax.annotation.Nullable
  public String getInfAdFisco() {
    return infAdFisco;
  }

  public void setInfAdFisco(@javax.annotation.Nullable String infAdFisco) {
    this.infAdFisco = infAdFisco;
  }


  public CteSefazInfCteImp icMSUFFim(@javax.annotation.Nullable CteSefazICMSUFFim icMSUFFim) {
    this.icMSUFFim = icMSUFFim;
    return this;
  }

  /**
   * Get icMSUFFim
   * @return icMSUFFim
   */
  @javax.annotation.Nullable
  public CteSefazICMSUFFim getIcMSUFFim() {
    return icMSUFFim;
  }

  public void setIcMSUFFim(@javax.annotation.Nullable CteSefazICMSUFFim icMSUFFim) {
    this.icMSUFFim = icMSUFFim;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CteSefazInfCteImp cteSefazInfCteImp = (CteSefazInfCteImp) o;
    return Objects.equals(this.ICMS, cteSefazInfCteImp.ICMS) &&
        Objects.equals(this.vTotTrib, cteSefazInfCteImp.vTotTrib) &&
        Objects.equals(this.infAdFisco, cteSefazInfCteImp.infAdFisco) &&
        Objects.equals(this.icMSUFFim, cteSefazInfCteImp.icMSUFFim);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ICMS, vTotTrib, infAdFisco, icMSUFFim);
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
    sb.append("class CteSefazInfCteImp {\n");
    sb.append("    ICMS: ").append(toIndentedString(ICMS)).append("\n");
    sb.append("    vTotTrib: ").append(toIndentedString(vTotTrib)).append("\n");
    sb.append("    infAdFisco: ").append(toIndentedString(infAdFisco)).append("\n");
    sb.append("    icMSUFFim: ").append(toIndentedString(icMSUFFim)).append("\n");
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
    openapiFields.add("ICMS");
    openapiFields.add("vTotTrib");
    openapiFields.add("infAdFisco");
    openapiFields.add("ICMSUFFim");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ICMS");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CteSefazInfCteImp
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CteSefazInfCteImp.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CteSefazInfCteImp is not found in the empty JSON string", CteSefazInfCteImp.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CteSefazInfCteImp.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CteSefazInfCteImp` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CteSefazInfCteImp.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `ICMS`
      CteSefazImp.validateJsonElement(jsonObj.get("ICMS"));
      if ((jsonObj.get("infAdFisco") != null && !jsonObj.get("infAdFisco").isJsonNull()) && !jsonObj.get("infAdFisco").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `infAdFisco` to be a primitive type in the JSON string but got `%s`", jsonObj.get("infAdFisco").toString()));
      }
      // validate the optional field `ICMSUFFim`
      if (jsonObj.get("ICMSUFFim") != null && !jsonObj.get("ICMSUFFim").isJsonNull()) {
        CteSefazICMSUFFim.validateJsonElement(jsonObj.get("ICMSUFFim"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CteSefazInfCteImp.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CteSefazInfCteImp' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CteSefazInfCteImp> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CteSefazInfCteImp.class));

       return (TypeAdapter<T>) new TypeAdapter<CteSefazInfCteImp>() {
           @Override
           public void write(JsonWriter out, CteSefazInfCteImp value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CteSefazInfCteImp read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CteSefazInfCteImp given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CteSefazInfCteImp
   * @throws IOException if the JSON string is invalid with respect to CteSefazInfCteImp
   */
  public static CteSefazInfCteImp fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CteSefazInfCteImp.class);
  }

  /**
   * Convert an instance of CteSefazInfCteImp to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
