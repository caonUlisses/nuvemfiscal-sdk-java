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
import java.math.BigDecimal;
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
 * Componentes do Valor da Prestação.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class CteSefazComp {
  public static final String SERIALIZED_NAME_X_NOME = "xNome";
  @SerializedName(SERIALIZED_NAME_X_NOME)
  @javax.annotation.Nullable
  private String xNome;

  public static final String SERIALIZED_NAME_V_COMP = "vComp";
  @SerializedName(SERIALIZED_NAME_V_COMP)
  @javax.annotation.Nullable
  private BigDecimal vComp;

  public CteSefazComp() {
  }

  public CteSefazComp xNome(@javax.annotation.Nullable String xNome) {
    this.xNome = xNome;
    return this;
  }

  /**
   * Nome do componente.  Exxemplos: FRETE PESO, FRETE VALOR, SEC/CAT, ADEME, AGENDAMENTO, etc.
   * @return xNome
   */
  @javax.annotation.Nullable
  public String getxNome() {
    return xNome;
  }

  public void setxNome(@javax.annotation.Nullable String xNome) {
    this.xNome = xNome;
  }


  public CteSefazComp vComp(@javax.annotation.Nullable BigDecimal vComp) {
    this.vComp = vComp;
    return this;
  }

  /**
   * Valor do componente.
   * minimum: 0
   * @return vComp
   */
  @javax.annotation.Nullable
  public BigDecimal getvComp() {
    return vComp;
  }

  public void setvComp(@javax.annotation.Nullable BigDecimal vComp) {
    this.vComp = vComp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CteSefazComp cteSefazComp = (CteSefazComp) o;
    return Objects.equals(this.xNome, cteSefazComp.xNome) &&
        Objects.equals(this.vComp, cteSefazComp.vComp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xNome, vComp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CteSefazComp {\n");
    sb.append("    xNome: ").append(toIndentedString(xNome)).append("\n");
    sb.append("    vComp: ").append(toIndentedString(vComp)).append("\n");
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
    openapiFields.add("xNome");
    openapiFields.add("vComp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("xNome");
    openapiRequiredFields.add("vComp");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CteSefazComp
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CteSefazComp.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CteSefazComp is not found in the empty JSON string", CteSefazComp.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CteSefazComp.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CteSefazComp` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CteSefazComp.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("xNome") != null && !jsonObj.get("xNome").isJsonNull()) && !jsonObj.get("xNome").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xNome` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xNome").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CteSefazComp.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CteSefazComp' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CteSefazComp> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CteSefazComp.class));

       return (TypeAdapter<T>) new TypeAdapter<CteSefazComp>() {
           @Override
           public void write(JsonWriter out, CteSefazComp value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CteSefazComp read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CteSefazComp given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CteSefazComp
   * @throws IOException if the JSON string is invalid with respect to CteSefazComp
   */
  public static CteSefazComp fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CteSefazComp.class);
  }

  /**
   * Convert an instance of CteSefazComp to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

