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
 * Grupo de informações específicas de endereço nacional.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class EnderNac {
  public static final String SERIALIZED_NAME_C_MUN = "cMun";
  @SerializedName(SERIALIZED_NAME_C_MUN)
  @javax.annotation.Nullable
  private String cMun;

  public static final String SERIALIZED_NAME_C_E_P = "CEP";
  @SerializedName(SERIALIZED_NAME_C_E_P)
  @javax.annotation.Nullable
  private String CEP;

  public EnderNac() {
  }

  public EnderNac cMun(@javax.annotation.Nullable String cMun) {
    this.cMun = cMun;
    return this;
  }

  /**
   * Código do município, conforme Tabela do IBGE.
   * @return cMun
   */
  @javax.annotation.Nullable
  public String getcMun() {
    return cMun;
  }

  public void setcMun(@javax.annotation.Nullable String cMun) {
    this.cMun = cMun;
  }


  public EnderNac CEP(@javax.annotation.Nullable String CEP) {
    this.CEP = CEP;
    return this;
  }

  /**
   * Número do CEP.
   * @return CEP
   */
  @javax.annotation.Nullable
  public String getCEP() {
    return CEP;
  }

  public void setCEP(@javax.annotation.Nullable String CEP) {
    this.CEP = CEP;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnderNac enderNac = (EnderNac) o;
    return Objects.equals(this.cMun, enderNac.cMun) &&
        Objects.equals(this.CEP, enderNac.CEP);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cMun, CEP);
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
    sb.append("class EnderNac {\n");
    sb.append("    cMun: ").append(toIndentedString(cMun)).append("\n");
    sb.append("    CEP: ").append(toIndentedString(CEP)).append("\n");
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
    openapiFields.add("cMun");
    openapiFields.add("CEP");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EnderNac
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnderNac.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnderNac is not found in the empty JSON string", EnderNac.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EnderNac.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnderNac` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cMun") != null && !jsonObj.get("cMun").isJsonNull()) && !jsonObj.get("cMun").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cMun` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cMun").toString()));
      }
      if ((jsonObj.get("CEP") != null && !jsonObj.get("CEP").isJsonNull()) && !jsonObj.get("CEP").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CEP` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CEP").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnderNac.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnderNac' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnderNac> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnderNac.class));

       return (TypeAdapter<T>) new TypeAdapter<EnderNac>() {
           @Override
           public void write(JsonWriter out, EnderNac value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnderNac read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EnderNac given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EnderNac
   * @throws IOException if the JSON string is invalid with respect to EnderNac
   */
  public static EnderNac fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnderNac.class);
  }

  /**
   * Convert an instance of EnderNac to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
