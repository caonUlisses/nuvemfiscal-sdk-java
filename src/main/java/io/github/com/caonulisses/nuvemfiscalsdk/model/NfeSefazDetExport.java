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
import io.github.com.caonulisses.nuvemfiscalsdk.model.NfeSefazExportInd;
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

import io.github.com.caonulisses.nuvemfiscalsdk.JSON;

/**
 * Detalhe da exportação.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfeSefazDetExport {
  public static final String SERIALIZED_NAME_N_DRAW = "nDraw";
  @SerializedName(SERIALIZED_NAME_N_DRAW)
  @javax.annotation.Nullable
  private String nDraw;

  public static final String SERIALIZED_NAME_EXPORT_IND = "exportInd";
  @SerializedName(SERIALIZED_NAME_EXPORT_IND)
  @javax.annotation.Nullable
  private NfeSefazExportInd exportInd;

  public NfeSefazDetExport() {
  }

  public NfeSefazDetExport nDraw(@javax.annotation.Nullable String nDraw) {
    this.nDraw = nDraw;
    return this;
  }

  /**
   * Número do ato concessório de Drawback.
   * @return nDraw
   */
  @javax.annotation.Nullable
  public String getnDraw() {
    return nDraw;
  }

  public void setnDraw(@javax.annotation.Nullable String nDraw) {
    this.nDraw = nDraw;
  }


  public NfeSefazDetExport exportInd(@javax.annotation.Nullable NfeSefazExportInd exportInd) {
    this.exportInd = exportInd;
    return this;
  }

  /**
   * Get exportInd
   * @return exportInd
   */
  @javax.annotation.Nullable
  public NfeSefazExportInd getExportInd() {
    return exportInd;
  }

  public void setExportInd(@javax.annotation.Nullable NfeSefazExportInd exportInd) {
    this.exportInd = exportInd;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfeSefazDetExport nfeSefazDetExport = (NfeSefazDetExport) o;
    return Objects.equals(this.nDraw, nfeSefazDetExport.nDraw) &&
        Objects.equals(this.exportInd, nfeSefazDetExport.exportInd);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(nDraw, exportInd);
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
    sb.append("class NfeSefazDetExport {\n");
    sb.append("    nDraw: ").append(toIndentedString(nDraw)).append("\n");
    sb.append("    exportInd: ").append(toIndentedString(exportInd)).append("\n");
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
    openapiFields.add("nDraw");
    openapiFields.add("exportInd");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfeSefazDetExport
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfeSefazDetExport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfeSefazDetExport is not found in the empty JSON string", NfeSefazDetExport.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfeSefazDetExport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfeSefazDetExport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("nDraw") != null && !jsonObj.get("nDraw").isJsonNull()) && !jsonObj.get("nDraw").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nDraw` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nDraw").toString()));
      }
      // validate the optional field `exportInd`
      if (jsonObj.get("exportInd") != null && !jsonObj.get("exportInd").isJsonNull()) {
        NfeSefazExportInd.validateJsonElement(jsonObj.get("exportInd"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NfeSefazDetExport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfeSefazDetExport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfeSefazDetExport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfeSefazDetExport.class));

       return (TypeAdapter<T>) new TypeAdapter<NfeSefazDetExport>() {
           @Override
           public void write(JsonWriter out, NfeSefazDetExport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfeSefazDetExport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfeSefazDetExport given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfeSefazDetExport
   * @throws IOException if the JSON string is invalid with respect to NfeSefazDetExport
   */
  public static NfeSefazDetExport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfeSefazDetExport.class);
  }

  /**
   * Convert an instance of NfeSefazDetExport to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

