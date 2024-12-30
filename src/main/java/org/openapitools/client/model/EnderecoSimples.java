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
import org.openapitools.client.model.EnderExtSimples;
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

import org.openapitools.client.JSON;

/**
 * Grupo de informações do endereço da obra do serviço prestado.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class EnderecoSimples {
  public static final String SERIALIZED_NAME_C_E_P = "CEP";
  @SerializedName(SERIALIZED_NAME_C_E_P)
  @javax.annotation.Nullable
  private String CEP;

  public static final String SERIALIZED_NAME_END_EXT = "endExt";
  @SerializedName(SERIALIZED_NAME_END_EXT)
  @javax.annotation.Nullable
  private EnderExtSimples endExt;

  public static final String SERIALIZED_NAME_X_LGR = "xLgr";
  @SerializedName(SERIALIZED_NAME_X_LGR)
  @javax.annotation.Nullable
  private String xLgr;

  public static final String SERIALIZED_NAME_NRO = "nro";
  @SerializedName(SERIALIZED_NAME_NRO)
  @javax.annotation.Nullable
  private String nro;

  public static final String SERIALIZED_NAME_X_CPL = "xCpl";
  @SerializedName(SERIALIZED_NAME_X_CPL)
  @javax.annotation.Nullable
  private String xCpl;

  public static final String SERIALIZED_NAME_X_BAIRRO = "xBairro";
  @SerializedName(SERIALIZED_NAME_X_BAIRRO)
  @javax.annotation.Nullable
  private String xBairro;

  public EnderecoSimples() {
  }

  public EnderecoSimples CEP(@javax.annotation.Nullable String CEP) {
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


  public EnderecoSimples endExt(@javax.annotation.Nullable EnderExtSimples endExt) {
    this.endExt = endExt;
    return this;
  }

  /**
   * Get endExt
   * @return endExt
   */
  @javax.annotation.Nullable
  public EnderExtSimples getEndExt() {
    return endExt;
  }

  public void setEndExt(@javax.annotation.Nullable EnderExtSimples endExt) {
    this.endExt = endExt;
  }


  public EnderecoSimples xLgr(@javax.annotation.Nullable String xLgr) {
    this.xLgr = xLgr;
    return this;
  }

  /**
   * Tipo e nome do logradouro da localização do imóvel.
   * @return xLgr
   */
  @javax.annotation.Nullable
  public String getxLgr() {
    return xLgr;
  }

  public void setxLgr(@javax.annotation.Nullable String xLgr) {
    this.xLgr = xLgr;
  }


  public EnderecoSimples nro(@javax.annotation.Nullable String nro) {
    this.nro = nro;
    return this;
  }

  /**
   * Número do imóvel.
   * @return nro
   */
  @javax.annotation.Nullable
  public String getNro() {
    return nro;
  }

  public void setNro(@javax.annotation.Nullable String nro) {
    this.nro = nro;
  }


  public EnderecoSimples xCpl(@javax.annotation.Nullable String xCpl) {
    this.xCpl = xCpl;
    return this;
  }

  /**
   * Complemento do endereço.
   * @return xCpl
   */
  @javax.annotation.Nullable
  public String getxCpl() {
    return xCpl;
  }

  public void setxCpl(@javax.annotation.Nullable String xCpl) {
    this.xCpl = xCpl;
  }


  public EnderecoSimples xBairro(@javax.annotation.Nullable String xBairro) {
    this.xBairro = xBairro;
    return this;
  }

  /**
   * Bairro.
   * @return xBairro
   */
  @javax.annotation.Nullable
  public String getxBairro() {
    return xBairro;
  }

  public void setxBairro(@javax.annotation.Nullable String xBairro) {
    this.xBairro = xBairro;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnderecoSimples enderecoSimples = (EnderecoSimples) o;
    return Objects.equals(this.CEP, enderecoSimples.CEP) &&
        Objects.equals(this.endExt, enderecoSimples.endExt) &&
        Objects.equals(this.xLgr, enderecoSimples.xLgr) &&
        Objects.equals(this.nro, enderecoSimples.nro) &&
        Objects.equals(this.xCpl, enderecoSimples.xCpl) &&
        Objects.equals(this.xBairro, enderecoSimples.xBairro);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(CEP, endExt, xLgr, nro, xCpl, xBairro);
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
    sb.append("class EnderecoSimples {\n");
    sb.append("    CEP: ").append(toIndentedString(CEP)).append("\n");
    sb.append("    endExt: ").append(toIndentedString(endExt)).append("\n");
    sb.append("    xLgr: ").append(toIndentedString(xLgr)).append("\n");
    sb.append("    nro: ").append(toIndentedString(nro)).append("\n");
    sb.append("    xCpl: ").append(toIndentedString(xCpl)).append("\n");
    sb.append("    xBairro: ").append(toIndentedString(xBairro)).append("\n");
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
    openapiFields.add("CEP");
    openapiFields.add("endExt");
    openapiFields.add("xLgr");
    openapiFields.add("nro");
    openapiFields.add("xCpl");
    openapiFields.add("xBairro");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("xLgr");
    openapiRequiredFields.add("nro");
    openapiRequiredFields.add("xBairro");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EnderecoSimples
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnderecoSimples.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnderecoSimples is not found in the empty JSON string", EnderecoSimples.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EnderecoSimples.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnderecoSimples` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EnderecoSimples.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("CEP") != null && !jsonObj.get("CEP").isJsonNull()) && !jsonObj.get("CEP").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CEP` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CEP").toString()));
      }
      // validate the optional field `endExt`
      if (jsonObj.get("endExt") != null && !jsonObj.get("endExt").isJsonNull()) {
        EnderExtSimples.validateJsonElement(jsonObj.get("endExt"));
      }
      if ((jsonObj.get("xLgr") != null && !jsonObj.get("xLgr").isJsonNull()) && !jsonObj.get("xLgr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xLgr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xLgr").toString()));
      }
      if ((jsonObj.get("nro") != null && !jsonObj.get("nro").isJsonNull()) && !jsonObj.get("nro").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nro` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nro").toString()));
      }
      if ((jsonObj.get("xCpl") != null && !jsonObj.get("xCpl").isJsonNull()) && !jsonObj.get("xCpl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xCpl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xCpl").toString()));
      }
      if ((jsonObj.get("xBairro") != null && !jsonObj.get("xBairro").isJsonNull()) && !jsonObj.get("xBairro").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xBairro` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xBairro").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnderecoSimples.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnderecoSimples' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnderecoSimples> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnderecoSimples.class));

       return (TypeAdapter<T>) new TypeAdapter<EnderecoSimples>() {
           @Override
           public void write(JsonWriter out, EnderecoSimples value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnderecoSimples read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EnderecoSimples given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EnderecoSimples
   * @throws IOException if the JSON string is invalid with respect to EnderecoSimples
   */
  public static EnderecoSimples fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnderecoSimples.class);
  }

  /**
   * Convert an instance of EnderecoSimples to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
