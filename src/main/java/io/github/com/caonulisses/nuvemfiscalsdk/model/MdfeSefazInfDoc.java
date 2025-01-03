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
import io.github.com.caonulisses.nuvemfiscalsdk.model.MdfeSefazInfMunDescarga;

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
 * Informações dos Documentos fiscais vinculados ao manifesto.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class MdfeSefazInfDoc {
  public static final String SERIALIZED_NAME_INF_MUN_DESCARGA = "infMunDescarga";
  @SerializedName(SERIALIZED_NAME_INF_MUN_DESCARGA)
  @javax.annotation.Nonnull
  private List<MdfeSefazInfMunDescarga> infMunDescarga = new ArrayList<>();

  public MdfeSefazInfDoc() {
  }

  public MdfeSefazInfDoc infMunDescarga(@javax.annotation.Nonnull List<MdfeSefazInfMunDescarga> infMunDescarga) {
    this.infMunDescarga = infMunDescarga;
    return this;
  }

  public MdfeSefazInfDoc addInfMunDescargaItem(MdfeSefazInfMunDescarga infMunDescargaItem) {
    if (this.infMunDescarga == null) {
      this.infMunDescarga = new ArrayList<>();
    }
    this.infMunDescarga.add(infMunDescargaItem);
    return this;
  }

  /**
   * Get infMunDescarga
   * @return infMunDescarga
   */
  @javax.annotation.Nonnull
  public List<MdfeSefazInfMunDescarga> getInfMunDescarga() {
    return infMunDescarga;
  }

  public void setInfMunDescarga(@javax.annotation.Nonnull List<MdfeSefazInfMunDescarga> infMunDescarga) {
    this.infMunDescarga = infMunDescarga;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MdfeSefazInfDoc mdfeSefazInfDoc = (MdfeSefazInfDoc) o;
    return Objects.equals(this.infMunDescarga, mdfeSefazInfDoc.infMunDescarga);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infMunDescarga);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MdfeSefazInfDoc {\n");
    sb.append("    infMunDescarga: ").append(toIndentedString(infMunDescarga)).append("\n");
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
    openapiFields.add("infMunDescarga");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("infMunDescarga");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MdfeSefazInfDoc
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MdfeSefazInfDoc.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MdfeSefazInfDoc is not found in the empty JSON string", MdfeSefazInfDoc.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MdfeSefazInfDoc.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MdfeSefazInfDoc` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MdfeSefazInfDoc.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("infMunDescarga").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `infMunDescarga` to be an array in the JSON string but got `%s`", jsonObj.get("infMunDescarga").toString()));
      }

      JsonArray jsonArrayinfMunDescarga = jsonObj.getAsJsonArray("infMunDescarga");
      // validate the required field `infMunDescarga` (array)
      for (int i = 0; i < jsonArrayinfMunDescarga.size(); i++) {
        MdfeSefazInfMunDescarga.validateJsonElement(jsonArrayinfMunDescarga.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MdfeSefazInfDoc.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MdfeSefazInfDoc' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MdfeSefazInfDoc> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MdfeSefazInfDoc.class));

       return (TypeAdapter<T>) new TypeAdapter<MdfeSefazInfDoc>() {
           @Override
           public void write(JsonWriter out, MdfeSefazInfDoc value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MdfeSefazInfDoc read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MdfeSefazInfDoc given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MdfeSefazInfDoc
   * @throws IOException if the JSON string is invalid with respect to MdfeSefazInfDoc
   */
  public static MdfeSefazInfDoc fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MdfeSefazInfDoc.class);
  }

  /**
   * Convert an instance of MdfeSefazInfDoc to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

