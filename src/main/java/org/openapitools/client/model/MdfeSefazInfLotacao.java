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
import org.openapitools.client.model.MdfeSefazInfLocalCarrega;
import org.openapitools.client.model.MdfeSefazInfLocalDescarrega;

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
 * Informações da carga lotação. Informar somente quando MDF-e for de carga lotação.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class MdfeSefazInfLotacao {
  public static final String SERIALIZED_NAME_INF_LOCAL_CARREGA = "infLocalCarrega";
  @SerializedName(SERIALIZED_NAME_INF_LOCAL_CARREGA)
  @javax.annotation.Nonnull
  private MdfeSefazInfLocalCarrega infLocalCarrega;

  public static final String SERIALIZED_NAME_INF_LOCAL_DESCARREGA = "infLocalDescarrega";
  @SerializedName(SERIALIZED_NAME_INF_LOCAL_DESCARREGA)
  @javax.annotation.Nonnull
  private MdfeSefazInfLocalDescarrega infLocalDescarrega;

  public MdfeSefazInfLotacao() {
  }

  public MdfeSefazInfLotacao infLocalCarrega(@javax.annotation.Nonnull MdfeSefazInfLocalCarrega infLocalCarrega) {
    this.infLocalCarrega = infLocalCarrega;
    return this;
  }

  /**
   * Get infLocalCarrega
   * @return infLocalCarrega
   */
  @javax.annotation.Nonnull
  public MdfeSefazInfLocalCarrega getInfLocalCarrega() {
    return infLocalCarrega;
  }

  public void setInfLocalCarrega(@javax.annotation.Nonnull MdfeSefazInfLocalCarrega infLocalCarrega) {
    this.infLocalCarrega = infLocalCarrega;
  }


  public MdfeSefazInfLotacao infLocalDescarrega(@javax.annotation.Nonnull MdfeSefazInfLocalDescarrega infLocalDescarrega) {
    this.infLocalDescarrega = infLocalDescarrega;
    return this;
  }

  /**
   * Get infLocalDescarrega
   * @return infLocalDescarrega
   */
  @javax.annotation.Nonnull
  public MdfeSefazInfLocalDescarrega getInfLocalDescarrega() {
    return infLocalDescarrega;
  }

  public void setInfLocalDescarrega(@javax.annotation.Nonnull MdfeSefazInfLocalDescarrega infLocalDescarrega) {
    this.infLocalDescarrega = infLocalDescarrega;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MdfeSefazInfLotacao mdfeSefazInfLotacao = (MdfeSefazInfLotacao) o;
    return Objects.equals(this.infLocalCarrega, mdfeSefazInfLotacao.infLocalCarrega) &&
        Objects.equals(this.infLocalDescarrega, mdfeSefazInfLotacao.infLocalDescarrega);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infLocalCarrega, infLocalDescarrega);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MdfeSefazInfLotacao {\n");
    sb.append("    infLocalCarrega: ").append(toIndentedString(infLocalCarrega)).append("\n");
    sb.append("    infLocalDescarrega: ").append(toIndentedString(infLocalDescarrega)).append("\n");
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
    openapiFields.add("infLocalCarrega");
    openapiFields.add("infLocalDescarrega");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("infLocalCarrega");
    openapiRequiredFields.add("infLocalDescarrega");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MdfeSefazInfLotacao
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MdfeSefazInfLotacao.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MdfeSefazInfLotacao is not found in the empty JSON string", MdfeSefazInfLotacao.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MdfeSefazInfLotacao.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MdfeSefazInfLotacao` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MdfeSefazInfLotacao.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `infLocalCarrega`
      MdfeSefazInfLocalCarrega.validateJsonElement(jsonObj.get("infLocalCarrega"));
      // validate the required field `infLocalDescarrega`
      MdfeSefazInfLocalDescarrega.validateJsonElement(jsonObj.get("infLocalDescarrega"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MdfeSefazInfLotacao.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MdfeSefazInfLotacao' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MdfeSefazInfLotacao> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MdfeSefazInfLotacao.class));

       return (TypeAdapter<T>) new TypeAdapter<MdfeSefazInfLotacao>() {
           @Override
           public void write(JsonWriter out, MdfeSefazInfLotacao value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MdfeSefazInfLotacao read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MdfeSefazInfLotacao given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MdfeSefazInfLotacao
   * @throws IOException if the JSON string is invalid with respect to MdfeSefazInfLotacao
   */
  public static MdfeSefazInfLotacao fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MdfeSefazInfLotacao.class);
  }

  /**
   * Convert an instance of MdfeSefazInfLotacao to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

