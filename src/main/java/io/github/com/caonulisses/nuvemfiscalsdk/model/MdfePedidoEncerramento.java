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
import java.time.LocalDate;
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
 * MdfePedidoEncerramento
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class MdfePedidoEncerramento {
  public static final String SERIALIZED_NAME_DATA_ENCERRAMENTO = "data_encerramento";
  @SerializedName(SERIALIZED_NAME_DATA_ENCERRAMENTO)
  @javax.annotation.Nullable
  private LocalDate dataEncerramento;

  public static final String SERIALIZED_NAME_UF = "uf";
  @SerializedName(SERIALIZED_NAME_UF)
  @javax.annotation.Nonnull
  private String uf;

  public static final String SERIALIZED_NAME_CODIGO_MUNICIPIO = "codigo_municipio";
  @SerializedName(SERIALIZED_NAME_CODIGO_MUNICIPIO)
  @javax.annotation.Nonnull
  private String codigoMunicipio;

  public MdfePedidoEncerramento() {
  }

  public MdfePedidoEncerramento dataEncerramento(@javax.annotation.Nullable LocalDate dataEncerramento) {
    this.dataEncerramento = dataEncerramento;
    return this;
  }

  /**
   * Data que o manifesto foi encerrado.    Opcional. Caso não seja informada, será utilizada a data em que a solicitação foi feita à API.
   * @return dataEncerramento
   */
  @javax.annotation.Nullable
  public LocalDate getDataEncerramento() {
    return dataEncerramento;
  }

  public void setDataEncerramento(@javax.annotation.Nullable LocalDate dataEncerramento) {
    this.dataEncerramento = dataEncerramento;
  }


  public MdfePedidoEncerramento uf(@javax.annotation.Nonnull String uf) {
    this.uf = uf;
    return this;
  }

  /**
   * UF de encerramento do manifesto.
   * @return uf
   */
  @javax.annotation.Nonnull
  public String getUf() {
    return uf;
  }

  public void setUf(@javax.annotation.Nonnull String uf) {
    this.uf = uf;
  }


  public MdfePedidoEncerramento codigoMunicipio(@javax.annotation.Nonnull String codigoMunicipio) {
    this.codigoMunicipio = codigoMunicipio;
    return this;
  }

  /**
   * Código IBGE do Município de encerramento do manifesto.
   * @return codigoMunicipio
   */
  @javax.annotation.Nonnull
  public String getCodigoMunicipio() {
    return codigoMunicipio;
  }

  public void setCodigoMunicipio(@javax.annotation.Nonnull String codigoMunicipio) {
    this.codigoMunicipio = codigoMunicipio;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MdfePedidoEncerramento mdfePedidoEncerramento = (MdfePedidoEncerramento) o;
    return Objects.equals(this.dataEncerramento, mdfePedidoEncerramento.dataEncerramento) &&
        Objects.equals(this.uf, mdfePedidoEncerramento.uf) &&
        Objects.equals(this.codigoMunicipio, mdfePedidoEncerramento.codigoMunicipio);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataEncerramento, uf, codigoMunicipio);
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
    sb.append("class MdfePedidoEncerramento {\n");
    sb.append("    dataEncerramento: ").append(toIndentedString(dataEncerramento)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
    sb.append("    codigoMunicipio: ").append(toIndentedString(codigoMunicipio)).append("\n");
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
    openapiFields.add("data_encerramento");
    openapiFields.add("uf");
    openapiFields.add("codigo_municipio");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("uf");
    openapiRequiredFields.add("codigo_municipio");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MdfePedidoEncerramento
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MdfePedidoEncerramento.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MdfePedidoEncerramento is not found in the empty JSON string", MdfePedidoEncerramento.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MdfePedidoEncerramento.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MdfePedidoEncerramento` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MdfePedidoEncerramento.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("uf").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uf` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uf").toString()));
      }
      if (!jsonObj.get("codigo_municipio").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codigo_municipio` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codigo_municipio").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MdfePedidoEncerramento.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MdfePedidoEncerramento' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MdfePedidoEncerramento> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MdfePedidoEncerramento.class));

       return (TypeAdapter<T>) new TypeAdapter<MdfePedidoEncerramento>() {
           @Override
           public void write(JsonWriter out, MdfePedidoEncerramento value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MdfePedidoEncerramento read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MdfePedidoEncerramento given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MdfePedidoEncerramento
   * @throws IOException if the JSON string is invalid with respect to MdfePedidoEncerramento
   */
  public static MdfePedidoEncerramento fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MdfePedidoEncerramento.class);
  }

  /**
   * Convert an instance of MdfePedidoEncerramento to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

