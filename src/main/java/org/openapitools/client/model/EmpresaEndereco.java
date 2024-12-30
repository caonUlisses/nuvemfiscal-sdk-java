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
 * Endereço da empresa.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class EmpresaEndereco {
  public static final String SERIALIZED_NAME_LOGRADOURO = "logradouro";
  @SerializedName(SERIALIZED_NAME_LOGRADOURO)
  @javax.annotation.Nonnull
  private String logradouro;

  public static final String SERIALIZED_NAME_NUMERO = "numero";
  @SerializedName(SERIALIZED_NAME_NUMERO)
  @javax.annotation.Nonnull
  private String numero;

  public static final String SERIALIZED_NAME_COMPLEMENTO = "complemento";
  @SerializedName(SERIALIZED_NAME_COMPLEMENTO)
  @javax.annotation.Nullable
  private String complemento;

  public static final String SERIALIZED_NAME_BAIRRO = "bairro";
  @SerializedName(SERIALIZED_NAME_BAIRRO)
  @javax.annotation.Nonnull
  private String bairro;

  public static final String SERIALIZED_NAME_CODIGO_MUNICIPIO = "codigo_municipio";
  @SerializedName(SERIALIZED_NAME_CODIGO_MUNICIPIO)
  @javax.annotation.Nonnull
  private String codigoMunicipio;

  public static final String SERIALIZED_NAME_CIDADE = "cidade";
  @SerializedName(SERIALIZED_NAME_CIDADE)
  @javax.annotation.Nullable
  private String cidade;

  public static final String SERIALIZED_NAME_UF = "uf";
  @SerializedName(SERIALIZED_NAME_UF)
  @javax.annotation.Nonnull
  private String uf;

  public static final String SERIALIZED_NAME_CODIGO_PAIS = "codigo_pais";
  @SerializedName(SERIALIZED_NAME_CODIGO_PAIS)
  @javax.annotation.Nullable
  private String codigoPais = "1058";

  public static final String SERIALIZED_NAME_PAIS = "pais";
  @SerializedName(SERIALIZED_NAME_PAIS)
  @javax.annotation.Nullable
  private String pais = "Brasil";

  public static final String SERIALIZED_NAME_CEP = "cep";
  @SerializedName(SERIALIZED_NAME_CEP)
  @javax.annotation.Nonnull
  private String cep;

  public EmpresaEndereco() {
  }

  public EmpresaEndereco logradouro(@javax.annotation.Nonnull String logradouro) {
    this.logradouro = logradouro;
    return this;
  }

  /**
   * Logradouro.
   * @return logradouro
   */
  @javax.annotation.Nonnull
  public String getLogradouro() {
    return logradouro;
  }

  public void setLogradouro(@javax.annotation.Nonnull String logradouro) {
    this.logradouro = logradouro;
  }


  public EmpresaEndereco numero(@javax.annotation.Nonnull String numero) {
    this.numero = numero;
    return this;
  }

  /**
   * Número.
   * @return numero
   */
  @javax.annotation.Nonnull
  public String getNumero() {
    return numero;
  }

  public void setNumero(@javax.annotation.Nonnull String numero) {
    this.numero = numero;
  }


  public EmpresaEndereco complemento(@javax.annotation.Nullable String complemento) {
    this.complemento = complemento;
    return this;
  }

  /**
   * Complemento.
   * @return complemento
   */
  @javax.annotation.Nullable
  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(@javax.annotation.Nullable String complemento) {
    this.complemento = complemento;
  }


  public EmpresaEndereco bairro(@javax.annotation.Nonnull String bairro) {
    this.bairro = bairro;
    return this;
  }

  /**
   * Bairro.
   * @return bairro
   */
  @javax.annotation.Nonnull
  public String getBairro() {
    return bairro;
  }

  public void setBairro(@javax.annotation.Nonnull String bairro) {
    this.bairro = bairro;
  }


  public EmpresaEndereco codigoMunicipio(@javax.annotation.Nonnull String codigoMunicipio) {
    this.codigoMunicipio = codigoMunicipio;
    return this;
  }

  /**
   * Código IBGE do município.
   * @return codigoMunicipio
   */
  @javax.annotation.Nonnull
  public String getCodigoMunicipio() {
    return codigoMunicipio;
  }

  public void setCodigoMunicipio(@javax.annotation.Nonnull String codigoMunicipio) {
    this.codigoMunicipio = codigoMunicipio;
  }


  public EmpresaEndereco cidade(@javax.annotation.Nullable String cidade) {
    this.cidade = cidade;
    return this;
  }

  /**
   * Cidade.
   * @return cidade
   */
  @javax.annotation.Nullable
  public String getCidade() {
    return cidade;
  }

  public void setCidade(@javax.annotation.Nullable String cidade) {
    this.cidade = cidade;
  }


  public EmpresaEndereco uf(@javax.annotation.Nonnull String uf) {
    this.uf = uf;
    return this;
  }

  /**
   * Sigla do estado.
   * @return uf
   */
  @javax.annotation.Nonnull
  public String getUf() {
    return uf;
  }

  public void setUf(@javax.annotation.Nonnull String uf) {
    this.uf = uf;
  }


  public EmpresaEndereco codigoPais(@javax.annotation.Nullable String codigoPais) {
    this.codigoPais = codigoPais;
    return this;
  }

  /**
   * Código do país.
   * @return codigoPais
   */
  @javax.annotation.Nullable
  public String getCodigoPais() {
    return codigoPais;
  }

  public void setCodigoPais(@javax.annotation.Nullable String codigoPais) {
    this.codigoPais = codigoPais;
  }


  public EmpresaEndereco pais(@javax.annotation.Nullable String pais) {
    this.pais = pais;
    return this;
  }

  /**
   * Nome do país.
   * @return pais
   */
  @javax.annotation.Nullable
  public String getPais() {
    return pais;
  }

  public void setPais(@javax.annotation.Nullable String pais) {
    this.pais = pais;
  }


  public EmpresaEndereco cep(@javax.annotation.Nonnull String cep) {
    this.cep = cep;
    return this;
  }

  /**
   * CEP.    *Utilize o valor sem máscara*.
   * @return cep
   */
  @javax.annotation.Nonnull
  public String getCep() {
    return cep;
  }

  public void setCep(@javax.annotation.Nonnull String cep) {
    this.cep = cep;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmpresaEndereco empresaEndereco = (EmpresaEndereco) o;
    return Objects.equals(this.logradouro, empresaEndereco.logradouro) &&
        Objects.equals(this.numero, empresaEndereco.numero) &&
        Objects.equals(this.complemento, empresaEndereco.complemento) &&
        Objects.equals(this.bairro, empresaEndereco.bairro) &&
        Objects.equals(this.codigoMunicipio, empresaEndereco.codigoMunicipio) &&
        Objects.equals(this.cidade, empresaEndereco.cidade) &&
        Objects.equals(this.uf, empresaEndereco.uf) &&
        Objects.equals(this.codigoPais, empresaEndereco.codigoPais) &&
        Objects.equals(this.pais, empresaEndereco.pais) &&
        Objects.equals(this.cep, empresaEndereco.cep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logradouro, numero, complemento, bairro, codigoMunicipio, cidade, uf, codigoPais, pais, cep);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmpresaEndereco {\n");
    sb.append("    logradouro: ").append(toIndentedString(logradouro)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    complemento: ").append(toIndentedString(complemento)).append("\n");
    sb.append("    bairro: ").append(toIndentedString(bairro)).append("\n");
    sb.append("    codigoMunicipio: ").append(toIndentedString(codigoMunicipio)).append("\n");
    sb.append("    cidade: ").append(toIndentedString(cidade)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
    sb.append("    codigoPais: ").append(toIndentedString(codigoPais)).append("\n");
    sb.append("    pais: ").append(toIndentedString(pais)).append("\n");
    sb.append("    cep: ").append(toIndentedString(cep)).append("\n");
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
    openapiFields.add("logradouro");
    openapiFields.add("numero");
    openapiFields.add("complemento");
    openapiFields.add("bairro");
    openapiFields.add("codigo_municipio");
    openapiFields.add("cidade");
    openapiFields.add("uf");
    openapiFields.add("codigo_pais");
    openapiFields.add("pais");
    openapiFields.add("cep");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("logradouro");
    openapiRequiredFields.add("numero");
    openapiRequiredFields.add("bairro");
    openapiRequiredFields.add("codigo_municipio");
    openapiRequiredFields.add("uf");
    openapiRequiredFields.add("cep");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EmpresaEndereco
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EmpresaEndereco.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmpresaEndereco is not found in the empty JSON string", EmpresaEndereco.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EmpresaEndereco.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmpresaEndereco` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EmpresaEndereco.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("logradouro").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logradouro` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logradouro").toString()));
      }
      if (!jsonObj.get("numero").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `numero` to be a primitive type in the JSON string but got `%s`", jsonObj.get("numero").toString()));
      }
      if ((jsonObj.get("complemento") != null && !jsonObj.get("complemento").isJsonNull()) && !jsonObj.get("complemento").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `complemento` to be a primitive type in the JSON string but got `%s`", jsonObj.get("complemento").toString()));
      }
      if (!jsonObj.get("bairro").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bairro` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bairro").toString()));
      }
      if (!jsonObj.get("codigo_municipio").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codigo_municipio` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codigo_municipio").toString()));
      }
      if ((jsonObj.get("cidade") != null && !jsonObj.get("cidade").isJsonNull()) && !jsonObj.get("cidade").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cidade` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cidade").toString()));
      }
      if (!jsonObj.get("uf").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uf` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uf").toString()));
      }
      if ((jsonObj.get("codigo_pais") != null && !jsonObj.get("codigo_pais").isJsonNull()) && !jsonObj.get("codigo_pais").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codigo_pais` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codigo_pais").toString()));
      }
      if ((jsonObj.get("pais") != null && !jsonObj.get("pais").isJsonNull()) && !jsonObj.get("pais").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pais` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pais").toString()));
      }
      if (!jsonObj.get("cep").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cep` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cep").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmpresaEndereco.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmpresaEndereco' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmpresaEndereco> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmpresaEndereco.class));

       return (TypeAdapter<T>) new TypeAdapter<EmpresaEndereco>() {
           @Override
           public void write(JsonWriter out, EmpresaEndereco value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmpresaEndereco read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EmpresaEndereco given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EmpresaEndereco
   * @throws IOException if the JSON string is invalid with respect to EmpresaEndereco
   */
  public static EmpresaEndereco fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmpresaEndereco.class);
  }

  /**
   * Convert an instance of EmpresaEndereco to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

