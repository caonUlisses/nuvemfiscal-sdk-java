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
 * Informações do modal Dutoviário.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class CteSefazDuto {
  public static final String SERIALIZED_NAME_V_TAR = "vTar";
  @SerializedName(SERIALIZED_NAME_V_TAR)
  @javax.annotation.Nullable
  private BigDecimal vTar;

  public static final String SERIALIZED_NAME_D_INI = "dIni";
  @SerializedName(SERIALIZED_NAME_D_INI)
  @javax.annotation.Nullable
  private LocalDate dIni;

  public static final String SERIALIZED_NAME_D_FIM = "dFim";
  @SerializedName(SERIALIZED_NAME_D_FIM)
  @javax.annotation.Nullable
  private LocalDate dFim;

  public CteSefazDuto() {
  }

  public CteSefazDuto vTar(@javax.annotation.Nullable BigDecimal vTar) {
    this.vTar = vTar;
    return this;
  }

  /**
   * Valor da tarifa.
   * minimum: 0
   * @return vTar
   */
  @javax.annotation.Nullable
  public BigDecimal getvTar() {
    return vTar;
  }

  public void setvTar(@javax.annotation.Nullable BigDecimal vTar) {
    this.vTar = vTar;
  }


  public CteSefazDuto dIni(@javax.annotation.Nullable LocalDate dIni) {
    this.dIni = dIni;
    return this;
  }

  /**
   * Data de Início da prestação do serviço.
   * @return dIni
   */
  @javax.annotation.Nullable
  public LocalDate getdIni() {
    return dIni;
  }

  public void setdIni(@javax.annotation.Nullable LocalDate dIni) {
    this.dIni = dIni;
  }


  public CteSefazDuto dFim(@javax.annotation.Nullable LocalDate dFim) {
    this.dFim = dFim;
    return this;
  }

  /**
   * Data de Fim da prestação do serviço.
   * @return dFim
   */
  @javax.annotation.Nullable
  public LocalDate getdFim() {
    return dFim;
  }

  public void setdFim(@javax.annotation.Nullable LocalDate dFim) {
    this.dFim = dFim;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CteSefazDuto cteSefazDuto = (CteSefazDuto) o;
    return Objects.equals(this.vTar, cteSefazDuto.vTar) &&
        Objects.equals(this.dIni, cteSefazDuto.dIni) &&
        Objects.equals(this.dFim, cteSefazDuto.dFim);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(vTar, dIni, dFim);
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
    sb.append("class CteSefazDuto {\n");
    sb.append("    vTar: ").append(toIndentedString(vTar)).append("\n");
    sb.append("    dIni: ").append(toIndentedString(dIni)).append("\n");
    sb.append("    dFim: ").append(toIndentedString(dFim)).append("\n");
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
    openapiFields.add("vTar");
    openapiFields.add("dIni");
    openapiFields.add("dFim");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dIni");
    openapiRequiredFields.add("dFim");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CteSefazDuto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CteSefazDuto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CteSefazDuto is not found in the empty JSON string", CteSefazDuto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CteSefazDuto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CteSefazDuto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CteSefazDuto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CteSefazDuto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CteSefazDuto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CteSefazDuto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CteSefazDuto.class));

       return (TypeAdapter<T>) new TypeAdapter<CteSefazDuto>() {
           @Override
           public void write(JsonWriter out, CteSefazDuto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CteSefazDuto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CteSefazDuto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CteSefazDuto
   * @throws IOException if the JSON string is invalid with respect to CteSefazDuto
   */
  public static CteSefazDuto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CteSefazDuto.class);
  }

  /**
   * Convert an instance of CteSefazDuto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

