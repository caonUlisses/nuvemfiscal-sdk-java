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
import org.openapitools.client.model.CteSefazOcc;

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
 * Informações do modal Rodoviário.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class CteSefazRodo {
  public static final String SERIALIZED_NAME_R_N_T_R_C = "RNTRC";
  @SerializedName(SERIALIZED_NAME_R_N_T_R_C)
  @javax.annotation.Nullable
  private String RNTRC;

  public static final String SERIALIZED_NAME_OCC = "occ";
  @SerializedName(SERIALIZED_NAME_OCC)
  @javax.annotation.Nullable
  private List<CteSefazOcc> occ = new ArrayList<>();

  public CteSefazRodo() {
  }

  public CteSefazRodo RNTRC(@javax.annotation.Nullable String RNTRC) {
    this.RNTRC = RNTRC;
    return this;
  }

  /**
   * Registro Nacional de Transportadores Rodoviários de Carga.  Registro obrigatório do emitente do CT-e junto à ANTT para exercer a atividade de transportador rodoviário de cargas por conta de terceiros e mediante remuneração.
   * @return RNTRC
   */
  @javax.annotation.Nullable
  public String getRNTRC() {
    return RNTRC;
  }

  public void setRNTRC(@javax.annotation.Nullable String RNTRC) {
    this.RNTRC = RNTRC;
  }


  public CteSefazRodo occ(@javax.annotation.Nullable List<CteSefazOcc> occ) {
    this.occ = occ;
    return this;
  }

  public CteSefazRodo addOccItem(CteSefazOcc occItem) {
    if (this.occ == null) {
      this.occ = new ArrayList<>();
    }
    this.occ.add(occItem);
    return this;
  }

  /**
   * Get occ
   * @return occ
   */
  @javax.annotation.Nullable
  public List<CteSefazOcc> getOcc() {
    return occ;
  }

  public void setOcc(@javax.annotation.Nullable List<CteSefazOcc> occ) {
    this.occ = occ;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CteSefazRodo cteSefazRodo = (CteSefazRodo) o;
    return Objects.equals(this.RNTRC, cteSefazRodo.RNTRC) &&
        Objects.equals(this.occ, cteSefazRodo.occ);
  }

  @Override
  public int hashCode() {
    return Objects.hash(RNTRC, occ);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CteSefazRodo {\n");
    sb.append("    RNTRC: ").append(toIndentedString(RNTRC)).append("\n");
    sb.append("    occ: ").append(toIndentedString(occ)).append("\n");
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
    openapiFields.add("RNTRC");
    openapiFields.add("occ");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("RNTRC");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CteSefazRodo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CteSefazRodo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CteSefazRodo is not found in the empty JSON string", CteSefazRodo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CteSefazRodo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CteSefazRodo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CteSefazRodo.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("RNTRC") != null && !jsonObj.get("RNTRC").isJsonNull()) && !jsonObj.get("RNTRC").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RNTRC` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RNTRC").toString()));
      }
      if (jsonObj.get("occ") != null && !jsonObj.get("occ").isJsonNull()) {
        JsonArray jsonArrayocc = jsonObj.getAsJsonArray("occ");
        if (jsonArrayocc != null) {
          // ensure the json data is an array
          if (!jsonObj.get("occ").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `occ` to be an array in the JSON string but got `%s`", jsonObj.get("occ").toString()));
          }

          // validate the optional field `occ` (array)
          for (int i = 0; i < jsonArrayocc.size(); i++) {
            CteSefazOcc.validateJsonElement(jsonArrayocc.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CteSefazRodo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CteSefazRodo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CteSefazRodo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CteSefazRodo.class));

       return (TypeAdapter<T>) new TypeAdapter<CteSefazRodo>() {
           @Override
           public void write(JsonWriter out, CteSefazRodo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CteSefazRodo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CteSefazRodo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CteSefazRodo
   * @throws IOException if the JSON string is invalid with respect to CteSefazRodo
   */
  public static CteSefazRodo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CteSefazRodo.class);
  }

  /**
   * Convert an instance of CteSefazRodo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
