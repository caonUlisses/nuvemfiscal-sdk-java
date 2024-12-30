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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.CteSefazIdDocAntEle;
import org.openapitools.client.model.CteSefazIdDocAntPap;

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
 * Informações de identificação dos documentos de Transporte Anterior.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class CteSefazIdDocAnt {
  public static final String SERIALIZED_NAME_ID_DOC_ANT_PAP = "idDocAntPap";
  @SerializedName(SERIALIZED_NAME_ID_DOC_ANT_PAP)
  @javax.annotation.Nullable
  private List<CteSefazIdDocAntPap> idDocAntPap = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID_DOC_ANT_ELE = "idDocAntEle";
  @SerializedName(SERIALIZED_NAME_ID_DOC_ANT_ELE)
  @javax.annotation.Nullable
  private List<CteSefazIdDocAntEle> idDocAntEle = new ArrayList<>();

  public CteSefazIdDocAnt() {
  }

  public CteSefazIdDocAnt idDocAntPap(@javax.annotation.Nullable List<CteSefazIdDocAntPap> idDocAntPap) {
    this.idDocAntPap = idDocAntPap;
    return this;
  }

  public CteSefazIdDocAnt addIdDocAntPapItem(CteSefazIdDocAntPap idDocAntPapItem) {
    if (this.idDocAntPap == null) {
      this.idDocAntPap = new ArrayList<>();
    }
    this.idDocAntPap.add(idDocAntPapItem);
    return this;
  }

  /**
   * Get idDocAntPap
   * @return idDocAntPap
   */
  @javax.annotation.Nullable
  public List<CteSefazIdDocAntPap> getIdDocAntPap() {
    return idDocAntPap;
  }

  public void setIdDocAntPap(@javax.annotation.Nullable List<CteSefazIdDocAntPap> idDocAntPap) {
    this.idDocAntPap = idDocAntPap;
  }


  public CteSefazIdDocAnt idDocAntEle(@javax.annotation.Nullable List<CteSefazIdDocAntEle> idDocAntEle) {
    this.idDocAntEle = idDocAntEle;
    return this;
  }

  public CteSefazIdDocAnt addIdDocAntEleItem(CteSefazIdDocAntEle idDocAntEleItem) {
    if (this.idDocAntEle == null) {
      this.idDocAntEle = new ArrayList<>();
    }
    this.idDocAntEle.add(idDocAntEleItem);
    return this;
  }

  /**
   * Get idDocAntEle
   * @return idDocAntEle
   */
  @javax.annotation.Nullable
  public List<CteSefazIdDocAntEle> getIdDocAntEle() {
    return idDocAntEle;
  }

  public void setIdDocAntEle(@javax.annotation.Nullable List<CteSefazIdDocAntEle> idDocAntEle) {
    this.idDocAntEle = idDocAntEle;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CteSefazIdDocAnt cteSefazIdDocAnt = (CteSefazIdDocAnt) o;
    return Objects.equals(this.idDocAntPap, cteSefazIdDocAnt.idDocAntPap) &&
        Objects.equals(this.idDocAntEle, cteSefazIdDocAnt.idDocAntEle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idDocAntPap, idDocAntEle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CteSefazIdDocAnt {\n");
    sb.append("    idDocAntPap: ").append(toIndentedString(idDocAntPap)).append("\n");
    sb.append("    idDocAntEle: ").append(toIndentedString(idDocAntEle)).append("\n");
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
    openapiFields.add("idDocAntPap");
    openapiFields.add("idDocAntEle");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CteSefazIdDocAnt
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CteSefazIdDocAnt.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CteSefazIdDocAnt is not found in the empty JSON string", CteSefazIdDocAnt.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CteSefazIdDocAnt.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CteSefazIdDocAnt` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("idDocAntPap") != null && !jsonObj.get("idDocAntPap").isJsonNull()) {
        JsonArray jsonArrayidDocAntPap = jsonObj.getAsJsonArray("idDocAntPap");
        if (jsonArrayidDocAntPap != null) {
          // ensure the json data is an array
          if (!jsonObj.get("idDocAntPap").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `idDocAntPap` to be an array in the JSON string but got `%s`", jsonObj.get("idDocAntPap").toString()));
          }

          // validate the optional field `idDocAntPap` (array)
          for (int i = 0; i < jsonArrayidDocAntPap.size(); i++) {
            CteSefazIdDocAntPap.validateJsonElement(jsonArrayidDocAntPap.get(i));
          };
        }
      }
      if (jsonObj.get("idDocAntEle") != null && !jsonObj.get("idDocAntEle").isJsonNull()) {
        JsonArray jsonArrayidDocAntEle = jsonObj.getAsJsonArray("idDocAntEle");
        if (jsonArrayidDocAntEle != null) {
          // ensure the json data is an array
          if (!jsonObj.get("idDocAntEle").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `idDocAntEle` to be an array in the JSON string but got `%s`", jsonObj.get("idDocAntEle").toString()));
          }

          // validate the optional field `idDocAntEle` (array)
          for (int i = 0; i < jsonArrayidDocAntEle.size(); i++) {
            CteSefazIdDocAntEle.validateJsonElement(jsonArrayidDocAntEle.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CteSefazIdDocAnt.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CteSefazIdDocAnt' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CteSefazIdDocAnt> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CteSefazIdDocAnt.class));

       return (TypeAdapter<T>) new TypeAdapter<CteSefazIdDocAnt>() {
           @Override
           public void write(JsonWriter out, CteSefazIdDocAnt value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CteSefazIdDocAnt read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CteSefazIdDocAnt given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CteSefazIdDocAnt
   * @throws IOException if the JSON string is invalid with respect to CteSefazIdDocAnt
   */
  public static CteSefazIdDocAnt fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CteSefazIdDocAnt.class);
  }

  /**
   * Convert an instance of CteSefazIdDocAnt to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
