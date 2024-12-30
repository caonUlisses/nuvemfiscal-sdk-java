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
 * Dados do endereço.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class CteSefazEndereco {
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

  public static final String SERIALIZED_NAME_C_MUN = "cMun";
  @SerializedName(SERIALIZED_NAME_C_MUN)
  @javax.annotation.Nullable
  private String cMun;

  public static final String SERIALIZED_NAME_X_MUN = "xMun";
  @SerializedName(SERIALIZED_NAME_X_MUN)
  @javax.annotation.Nullable
  private String xMun;

  public static final String SERIALIZED_NAME_C_E_P = "CEP";
  @SerializedName(SERIALIZED_NAME_C_E_P)
  @javax.annotation.Nullable
  private String CEP;

  public static final String SERIALIZED_NAME_U_F = "UF";
  @SerializedName(SERIALIZED_NAME_U_F)
  @javax.annotation.Nullable
  private String UF;

  public static final String SERIALIZED_NAME_C_PAIS = "cPais";
  @SerializedName(SERIALIZED_NAME_C_PAIS)
  @javax.annotation.Nullable
  private String cPais;

  public static final String SERIALIZED_NAME_X_PAIS = "xPais";
  @SerializedName(SERIALIZED_NAME_X_PAIS)
  @javax.annotation.Nullable
  private String xPais;

  public CteSefazEndereco() {
  }

  public CteSefazEndereco xLgr(@javax.annotation.Nullable String xLgr) {
    this.xLgr = xLgr;
    return this;
  }

  /**
   * Logradouro.
   * @return xLgr
   */
  @javax.annotation.Nullable
  public String getxLgr() {
    return xLgr;
  }

  public void setxLgr(@javax.annotation.Nullable String xLgr) {
    this.xLgr = xLgr;
  }


  public CteSefazEndereco nro(@javax.annotation.Nullable String nro) {
    this.nro = nro;
    return this;
  }

  /**
   * Número.
   * @return nro
   */
  @javax.annotation.Nullable
  public String getNro() {
    return nro;
  }

  public void setNro(@javax.annotation.Nullable String nro) {
    this.nro = nro;
  }


  public CteSefazEndereco xCpl(@javax.annotation.Nullable String xCpl) {
    this.xCpl = xCpl;
    return this;
  }

  /**
   * Complemento.
   * @return xCpl
   */
  @javax.annotation.Nullable
  public String getxCpl() {
    return xCpl;
  }

  public void setxCpl(@javax.annotation.Nullable String xCpl) {
    this.xCpl = xCpl;
  }


  public CteSefazEndereco xBairro(@javax.annotation.Nullable String xBairro) {
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


  public CteSefazEndereco cMun(@javax.annotation.Nullable String cMun) {
    this.cMun = cMun;
    return this;
  }

  /**
   * Código do município (utilizar a tabela do IBGE).  Informar 9999999 para operações com o exterior.
   * @return cMun
   */
  @javax.annotation.Nullable
  public String getcMun() {
    return cMun;
  }

  public void setcMun(@javax.annotation.Nullable String cMun) {
    this.cMun = cMun;
  }


  public CteSefazEndereco xMun(@javax.annotation.Nullable String xMun) {
    this.xMun = xMun;
    return this;
  }

  /**
   * Nome do município.  Informar EXTERIOR para operações com o exterior.
   * @return xMun
   */
  @javax.annotation.Nullable
  public String getxMun() {
    return xMun;
  }

  public void setxMun(@javax.annotation.Nullable String xMun) {
    this.xMun = xMun;
  }


  public CteSefazEndereco CEP(@javax.annotation.Nullable String CEP) {
    this.CEP = CEP;
    return this;
  }

  /**
   * CEP.  Informar os zeros não significativos.
   * @return CEP
   */
  @javax.annotation.Nullable
  public String getCEP() {
    return CEP;
  }

  public void setCEP(@javax.annotation.Nullable String CEP) {
    this.CEP = CEP;
  }


  public CteSefazEndereco UF(@javax.annotation.Nullable String UF) {
    this.UF = UF;
    return this;
  }

  /**
   * Sigla da UF.  Informar EX para operações com o exterior.
   * @return UF
   */
  @javax.annotation.Nullable
  public String getUF() {
    return UF;
  }

  public void setUF(@javax.annotation.Nullable String UF) {
    this.UF = UF;
  }


  public CteSefazEndereco cPais(@javax.annotation.Nullable String cPais) {
    this.cPais = cPais;
    return this;
  }

  /**
   * Código do país.  Utilizar a tabela do BACEN.
   * @return cPais
   */
  @javax.annotation.Nullable
  public String getcPais() {
    return cPais;
  }

  public void setcPais(@javax.annotation.Nullable String cPais) {
    this.cPais = cPais;
  }


  public CteSefazEndereco xPais(@javax.annotation.Nullable String xPais) {
    this.xPais = xPais;
    return this;
  }

  /**
   * Nome do país.
   * @return xPais
   */
  @javax.annotation.Nullable
  public String getxPais() {
    return xPais;
  }

  public void setxPais(@javax.annotation.Nullable String xPais) {
    this.xPais = xPais;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CteSefazEndereco cteSefazEndereco = (CteSefazEndereco) o;
    return Objects.equals(this.xLgr, cteSefazEndereco.xLgr) &&
        Objects.equals(this.nro, cteSefazEndereco.nro) &&
        Objects.equals(this.xCpl, cteSefazEndereco.xCpl) &&
        Objects.equals(this.xBairro, cteSefazEndereco.xBairro) &&
        Objects.equals(this.cMun, cteSefazEndereco.cMun) &&
        Objects.equals(this.xMun, cteSefazEndereco.xMun) &&
        Objects.equals(this.CEP, cteSefazEndereco.CEP) &&
        Objects.equals(this.UF, cteSefazEndereco.UF) &&
        Objects.equals(this.cPais, cteSefazEndereco.cPais) &&
        Objects.equals(this.xPais, cteSefazEndereco.xPais);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(xLgr, nro, xCpl, xBairro, cMun, xMun, CEP, UF, cPais, xPais);
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
    sb.append("class CteSefazEndereco {\n");
    sb.append("    xLgr: ").append(toIndentedString(xLgr)).append("\n");
    sb.append("    nro: ").append(toIndentedString(nro)).append("\n");
    sb.append("    xCpl: ").append(toIndentedString(xCpl)).append("\n");
    sb.append("    xBairro: ").append(toIndentedString(xBairro)).append("\n");
    sb.append("    cMun: ").append(toIndentedString(cMun)).append("\n");
    sb.append("    xMun: ").append(toIndentedString(xMun)).append("\n");
    sb.append("    CEP: ").append(toIndentedString(CEP)).append("\n");
    sb.append("    UF: ").append(toIndentedString(UF)).append("\n");
    sb.append("    cPais: ").append(toIndentedString(cPais)).append("\n");
    sb.append("    xPais: ").append(toIndentedString(xPais)).append("\n");
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
    openapiFields.add("xLgr");
    openapiFields.add("nro");
    openapiFields.add("xCpl");
    openapiFields.add("xBairro");
    openapiFields.add("cMun");
    openapiFields.add("xMun");
    openapiFields.add("CEP");
    openapiFields.add("UF");
    openapiFields.add("cPais");
    openapiFields.add("xPais");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("xLgr");
    openapiRequiredFields.add("nro");
    openapiRequiredFields.add("xBairro");
    openapiRequiredFields.add("cMun");
    openapiRequiredFields.add("xMun");
    openapiRequiredFields.add("UF");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CteSefazEndereco
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CteSefazEndereco.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CteSefazEndereco is not found in the empty JSON string", CteSefazEndereco.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CteSefazEndereco.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CteSefazEndereco` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CteSefazEndereco.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
      if ((jsonObj.get("cMun") != null && !jsonObj.get("cMun").isJsonNull()) && !jsonObj.get("cMun").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cMun` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cMun").toString()));
      }
      if ((jsonObj.get("xMun") != null && !jsonObj.get("xMun").isJsonNull()) && !jsonObj.get("xMun").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xMun` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xMun").toString()));
      }
      if ((jsonObj.get("CEP") != null && !jsonObj.get("CEP").isJsonNull()) && !jsonObj.get("CEP").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CEP` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CEP").toString()));
      }
      if ((jsonObj.get("UF") != null && !jsonObj.get("UF").isJsonNull()) && !jsonObj.get("UF").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `UF` to be a primitive type in the JSON string but got `%s`", jsonObj.get("UF").toString()));
      }
      if ((jsonObj.get("cPais") != null && !jsonObj.get("cPais").isJsonNull()) && !jsonObj.get("cPais").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cPais` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cPais").toString()));
      }
      if ((jsonObj.get("xPais") != null && !jsonObj.get("xPais").isJsonNull()) && !jsonObj.get("xPais").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xPais` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xPais").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CteSefazEndereco.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CteSefazEndereco' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CteSefazEndereco> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CteSefazEndereco.class));

       return (TypeAdapter<T>) new TypeAdapter<CteSefazEndereco>() {
           @Override
           public void write(JsonWriter out, CteSefazEndereco value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CteSefazEndereco read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CteSefazEndereco given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CteSefazEndereco
   * @throws IOException if the JSON string is invalid with respect to CteSefazEndereco
   */
  public static CteSefazEndereco fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CteSefazEndereco.class);
  }

  /**
   * Convert an instance of CteSefazEndereco to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

