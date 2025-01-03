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
 * Grupo de informações de NF ou NFS (Modelo não eletrônico).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class DocNFNFS {
  public static final String SERIALIZED_NAME_N_N_F_S = "nNFS";
  @SerializedName(SERIALIZED_NAME_N_N_F_S)
  @javax.annotation.Nullable
  private Integer nNFS;

  public static final String SERIALIZED_NAME_MOD_N_F_S = "modNFS";
  @SerializedName(SERIALIZED_NAME_MOD_N_F_S)
  @javax.annotation.Nullable
  private Integer modNFS;

  public static final String SERIALIZED_NAME_SERIE_N_F_S = "serieNFS";
  @SerializedName(SERIALIZED_NAME_SERIE_N_F_S)
  @javax.annotation.Nullable
  private String serieNFS;

  public DocNFNFS() {
  }

  public DocNFNFS nNFS(@javax.annotation.Nullable Integer nNFS) {
    this.nNFS = nNFS;
    return this;
  }

  /**
   * Número da Nota Fiscal NF ou NFS.
   * minimum: 0
   * maximum: 9999999
   * @return nNFS
   */
  @javax.annotation.Nullable
  public Integer getnNFS() {
    return nNFS;
  }

  public void setnNFS(@javax.annotation.Nullable Integer nNFS) {
    this.nNFS = nNFS;
  }


  public DocNFNFS modNFS(@javax.annotation.Nullable Integer modNFS) {
    this.modNFS = modNFS;
    return this;
  }

  /**
   * Modelo da Nota Fiscal NF ou NFS.
   * @return modNFS
   */
  @javax.annotation.Nullable
  public Integer getModNFS() {
    return modNFS;
  }

  public void setModNFS(@javax.annotation.Nullable Integer modNFS) {
    this.modNFS = modNFS;
  }


  public DocNFNFS serieNFS(@javax.annotation.Nullable String serieNFS) {
    this.serieNFS = serieNFS;
    return this;
  }

  /**
   * Série Nota Fiscal NF ou NFS.
   * @return serieNFS
   */
  @javax.annotation.Nullable
  public String getSerieNFS() {
    return serieNFS;
  }

  public void setSerieNFS(@javax.annotation.Nullable String serieNFS) {
    this.serieNFS = serieNFS;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocNFNFS docNFNFS = (DocNFNFS) o;
    return Objects.equals(this.nNFS, docNFNFS.nNFS) &&
        Objects.equals(this.modNFS, docNFNFS.modNFS) &&
        Objects.equals(this.serieNFS, docNFNFS.serieNFS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nNFS, modNFS, serieNFS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocNFNFS {\n");
    sb.append("    nNFS: ").append(toIndentedString(nNFS)).append("\n");
    sb.append("    modNFS: ").append(toIndentedString(modNFS)).append("\n");
    sb.append("    serieNFS: ").append(toIndentedString(serieNFS)).append("\n");
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
    openapiFields.add("nNFS");
    openapiFields.add("modNFS");
    openapiFields.add("serieNFS");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("nNFS");
    openapiRequiredFields.add("modNFS");
    openapiRequiredFields.add("serieNFS");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocNFNFS
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocNFNFS.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocNFNFS is not found in the empty JSON string", DocNFNFS.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DocNFNFS.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocNFNFS` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DocNFNFS.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("serieNFS") != null && !jsonObj.get("serieNFS").isJsonNull()) && !jsonObj.get("serieNFS").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serieNFS` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serieNFS").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocNFNFS.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocNFNFS' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocNFNFS> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocNFNFS.class));

       return (TypeAdapter<T>) new TypeAdapter<DocNFNFS>() {
           @Override
           public void write(JsonWriter out, DocNFNFS value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocNFNFS read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DocNFNFS given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocNFNFS
   * @throws IOException if the JSON string is invalid with respect to DocNFNFS
   */
  public static DocNFNFS fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocNFNFS.class);
  }

  /**
   * Convert an instance of DocNFNFS to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

