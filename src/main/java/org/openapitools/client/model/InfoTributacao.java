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
import org.openapitools.client.model.TribFederal;
import org.openapitools.client.model.TribMunicipal;
import org.openapitools.client.model.TribTotal;

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
 * Grupo de informações relacionados aos tributos relacionados ao serviço prestado.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class InfoTributacao {
  public static final String SERIALIZED_NAME_TRIB_MUN = "tribMun";
  @SerializedName(SERIALIZED_NAME_TRIB_MUN)
  @javax.annotation.Nonnull
  private TribMunicipal tribMun;

  public static final String SERIALIZED_NAME_TRIB_FED = "tribFed";
  @SerializedName(SERIALIZED_NAME_TRIB_FED)
  @javax.annotation.Nullable
  private TribFederal tribFed;

  public static final String SERIALIZED_NAME_TOT_TRIB = "totTrib";
  @SerializedName(SERIALIZED_NAME_TOT_TRIB)
  @javax.annotation.Nullable
  private TribTotal totTrib;

  public InfoTributacao() {
  }

  public InfoTributacao tribMun(@javax.annotation.Nonnull TribMunicipal tribMun) {
    this.tribMun = tribMun;
    return this;
  }

  /**
   * Get tribMun
   * @return tribMun
   */
  @javax.annotation.Nonnull
  public TribMunicipal getTribMun() {
    return tribMun;
  }

  public void setTribMun(@javax.annotation.Nonnull TribMunicipal tribMun) {
    this.tribMun = tribMun;
  }


  public InfoTributacao tribFed(@javax.annotation.Nullable TribFederal tribFed) {
    this.tribFed = tribFed;
    return this;
  }

  /**
   * Get tribFed
   * @return tribFed
   */
  @javax.annotation.Nullable
  public TribFederal getTribFed() {
    return tribFed;
  }

  public void setTribFed(@javax.annotation.Nullable TribFederal tribFed) {
    this.tribFed = tribFed;
  }


  public InfoTributacao totTrib(@javax.annotation.Nullable TribTotal totTrib) {
    this.totTrib = totTrib;
    return this;
  }

  /**
   * Get totTrib
   * @return totTrib
   */
  @javax.annotation.Nullable
  public TribTotal getTotTrib() {
    return totTrib;
  }

  public void setTotTrib(@javax.annotation.Nullable TribTotal totTrib) {
    this.totTrib = totTrib;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfoTributacao infoTributacao = (InfoTributacao) o;
    return Objects.equals(this.tribMun, infoTributacao.tribMun) &&
        Objects.equals(this.tribFed, infoTributacao.tribFed) &&
        Objects.equals(this.totTrib, infoTributacao.totTrib);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tribMun, tribFed, totTrib);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfoTributacao {\n");
    sb.append("    tribMun: ").append(toIndentedString(tribMun)).append("\n");
    sb.append("    tribFed: ").append(toIndentedString(tribFed)).append("\n");
    sb.append("    totTrib: ").append(toIndentedString(totTrib)).append("\n");
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
    openapiFields.add("tribMun");
    openapiFields.add("tribFed");
    openapiFields.add("totTrib");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tribMun");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InfoTributacao
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InfoTributacao.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InfoTributacao is not found in the empty JSON string", InfoTributacao.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InfoTributacao.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InfoTributacao` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InfoTributacao.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `tribMun`
      TribMunicipal.validateJsonElement(jsonObj.get("tribMun"));
      // validate the optional field `tribFed`
      if (jsonObj.get("tribFed") != null && !jsonObj.get("tribFed").isJsonNull()) {
        TribFederal.validateJsonElement(jsonObj.get("tribFed"));
      }
      // validate the optional field `totTrib`
      if (jsonObj.get("totTrib") != null && !jsonObj.get("totTrib").isJsonNull()) {
        TribTotal.validateJsonElement(jsonObj.get("totTrib"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InfoTributacao.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InfoTributacao' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InfoTributacao> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InfoTributacao.class));

       return (TypeAdapter<T>) new TypeAdapter<InfoTributacao>() {
           @Override
           public void write(JsonWriter out, InfoTributacao value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InfoTributacao read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InfoTributacao given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InfoTributacao
   * @throws IOException if the JSON string is invalid with respect to InfoTributacao
   */
  public static InfoTributacao fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InfoTributacao.class);
  }

  /**
   * Convert an instance of InfoTributacao to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

