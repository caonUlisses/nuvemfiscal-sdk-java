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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.github.com.caonulisses.nuvemfiscalsdk.model.RpsLote;

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
 * RpsLoteListagem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class RpsLoteListagem {
  public static final String SERIALIZED_NAME_AT_COUNT = "@count";
  @SerializedName(SERIALIZED_NAME_AT_COUNT)
  @javax.annotation.Nullable
  private Integer atCount;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nullable
  private List<RpsLote> data = new ArrayList<>();

  public RpsLoteListagem() {
  }

  public RpsLoteListagem atCount(@javax.annotation.Nullable Integer atCount) {
    this.atCount = atCount;
    return this;
  }

  /**
   * Get atCount
   * @return atCount
   */
  @javax.annotation.Nullable
  public Integer getAtCount() {
    return atCount;
  }

  public void setAtCount(@javax.annotation.Nullable Integer atCount) {
    this.atCount = atCount;
  }


  public RpsLoteListagem data(@javax.annotation.Nullable List<RpsLote> data) {
    this.data = data;
    return this;
  }

  public RpsLoteListagem addDataItem(RpsLote dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nullable
  public List<RpsLote> getData() {
    return data;
  }

  public void setData(@javax.annotation.Nullable List<RpsLote> data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RpsLoteListagem rpsLoteListagem = (RpsLoteListagem) o;
    return Objects.equals(this.atCount, rpsLoteListagem.atCount) &&
        Objects.equals(this.data, rpsLoteListagem.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atCount, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RpsLoteListagem {\n");
    sb.append("    atCount: ").append(toIndentedString(atCount)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("@count");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RpsLoteListagem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RpsLoteListagem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RpsLoteListagem is not found in the empty JSON string", RpsLoteListagem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RpsLoteListagem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RpsLoteListagem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
        if (jsonArraydata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
          }

          // validate the optional field `data` (array)
          for (int i = 0; i < jsonArraydata.size(); i++) {
            RpsLote.validateJsonElement(jsonArraydata.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RpsLoteListagem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RpsLoteListagem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RpsLoteListagem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RpsLoteListagem.class));

       return (TypeAdapter<T>) new TypeAdapter<RpsLoteListagem>() {
           @Override
           public void write(JsonWriter out, RpsLoteListagem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RpsLoteListagem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RpsLoteListagem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RpsLoteListagem
   * @throws IOException if the JSON string is invalid with respect to RpsLoteListagem
   */
  public static RpsLoteListagem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RpsLoteListagem.class);
  }

  /**
   * Convert an instance of RpsLoteListagem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

