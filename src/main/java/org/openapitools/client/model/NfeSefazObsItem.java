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
import org.openapitools.client.model.NfeSefazObsCont;
import org.openapitools.client.model.NfeSefazObsFisco;

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
 * Grupo de observações de uso livre (para o item da NF-e).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfeSefazObsItem {
  public static final String SERIALIZED_NAME_OBS_CONT = "obsCont";
  @SerializedName(SERIALIZED_NAME_OBS_CONT)
  @javax.annotation.Nullable
  private NfeSefazObsCont obsCont;

  public static final String SERIALIZED_NAME_OBS_FISCO = "obsFisco";
  @SerializedName(SERIALIZED_NAME_OBS_FISCO)
  @javax.annotation.Nullable
  private NfeSefazObsFisco obsFisco;

  public NfeSefazObsItem() {
  }

  public NfeSefazObsItem obsCont(@javax.annotation.Nullable NfeSefazObsCont obsCont) {
    this.obsCont = obsCont;
    return this;
  }

  /**
   * Get obsCont
   * @return obsCont
   */
  @javax.annotation.Nullable
  public NfeSefazObsCont getObsCont() {
    return obsCont;
  }

  public void setObsCont(@javax.annotation.Nullable NfeSefazObsCont obsCont) {
    this.obsCont = obsCont;
  }


  public NfeSefazObsItem obsFisco(@javax.annotation.Nullable NfeSefazObsFisco obsFisco) {
    this.obsFisco = obsFisco;
    return this;
  }

  /**
   * Get obsFisco
   * @return obsFisco
   */
  @javax.annotation.Nullable
  public NfeSefazObsFisco getObsFisco() {
    return obsFisco;
  }

  public void setObsFisco(@javax.annotation.Nullable NfeSefazObsFisco obsFisco) {
    this.obsFisco = obsFisco;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfeSefazObsItem nfeSefazObsItem = (NfeSefazObsItem) o;
    return Objects.equals(this.obsCont, nfeSefazObsItem.obsCont) &&
        Objects.equals(this.obsFisco, nfeSefazObsItem.obsFisco);
  }

  @Override
  public int hashCode() {
    return Objects.hash(obsCont, obsFisco);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NfeSefazObsItem {\n");
    sb.append("    obsCont: ").append(toIndentedString(obsCont)).append("\n");
    sb.append("    obsFisco: ").append(toIndentedString(obsFisco)).append("\n");
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
    openapiFields.add("obsCont");
    openapiFields.add("obsFisco");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfeSefazObsItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfeSefazObsItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfeSefazObsItem is not found in the empty JSON string", NfeSefazObsItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfeSefazObsItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfeSefazObsItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `obsCont`
      if (jsonObj.get("obsCont") != null && !jsonObj.get("obsCont").isJsonNull()) {
        NfeSefazObsCont.validateJsonElement(jsonObj.get("obsCont"));
      }
      // validate the optional field `obsFisco`
      if (jsonObj.get("obsFisco") != null && !jsonObj.get("obsFisco").isJsonNull()) {
        NfeSefazObsFisco.validateJsonElement(jsonObj.get("obsFisco"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NfeSefazObsItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfeSefazObsItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfeSefazObsItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfeSefazObsItem.class));

       return (TypeAdapter<T>) new TypeAdapter<NfeSefazObsItem>() {
           @Override
           public void write(JsonWriter out, NfeSefazObsItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfeSefazObsItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfeSefazObsItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfeSefazObsItem
   * @throws IOException if the JSON string is invalid with respect to NfeSefazObsItem
   */
  public static NfeSefazObsItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfeSefazObsItem.class);
  }

  /**
   * Convert an instance of NfeSefazObsItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

