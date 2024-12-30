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
public class DfeContribuinteEndereco {
  public static final String SERIALIZED_NAME_LOGRADOURO = "logradouro";
  @SerializedName(SERIALIZED_NAME_LOGRADOURO)
  @javax.annotation.Nullable
  private String logradouro;

  public static final String SERIALIZED_NAME_NUMERO = "numero";
  @SerializedName(SERIALIZED_NAME_NUMERO)
  @javax.annotation.Nullable
  private String numero;

  public static final String SERIALIZED_NAME_COMPLEMENTO = "complemento";
  @SerializedName(SERIALIZED_NAME_COMPLEMENTO)
  @javax.annotation.Nullable
  private String complemento;

  public static final String SERIALIZED_NAME_BAIRRO = "bairro";
  @SerializedName(SERIALIZED_NAME_BAIRRO)
  @javax.annotation.Nullable
  private String bairro;

  public static final String SERIALIZED_NAME_CODIGO_MUNICIPIO = "codigo_municipio";
  @SerializedName(SERIALIZED_NAME_CODIGO_MUNICIPIO)
  @javax.annotation.Nullable
  private String codigoMunicipio;

  public static final String SERIALIZED_NAME_NOME_MUNICIPIO = "nome_municipio";
  @SerializedName(SERIALIZED_NAME_NOME_MUNICIPIO)
  @javax.annotation.Nullable
  private String nomeMunicipio;

  public static final String SERIALIZED_NAME_UF = "uf";
  @SerializedName(SERIALIZED_NAME_UF)
  @javax.annotation.Nullable
  private String uf;

  public static final String SERIALIZED_NAME_CEP = "cep";
  @SerializedName(SERIALIZED_NAME_CEP)
  @javax.annotation.Nullable
  private String cep;

  public static final String SERIALIZED_NAME_CODIGO_PAIS = "codigo_pais";
  @SerializedName(SERIALIZED_NAME_CODIGO_PAIS)
  @javax.annotation.Nullable
  private String codigoPais;

  public static final String SERIALIZED_NAME_PAIS = "pais";
  @SerializedName(SERIALIZED_NAME_PAIS)
  @javax.annotation.Nullable
  private String pais;

  public static final String SERIALIZED_NAME_FONE = "fone";
  @SerializedName(SERIALIZED_NAME_FONE)
  @javax.annotation.Nullable
  private String fone;

  public DfeContribuinteEndereco() {
  }

  public DfeContribuinteEndereco logradouro(@javax.annotation.Nullable String logradouro) {
    this.logradouro = logradouro;
    return this;
  }

  /**
   * Logradouro.
   * @return logradouro
   */
  @javax.annotation.Nullable
  public String getLogradouro() {
    return logradouro;
  }

  public void setLogradouro(@javax.annotation.Nullable String logradouro) {
    this.logradouro = logradouro;
  }


  public DfeContribuinteEndereco numero(@javax.annotation.Nullable String numero) {
    this.numero = numero;
    return this;
  }

  /**
   * Número.
   * @return numero
   */
  @javax.annotation.Nullable
  public String getNumero() {
    return numero;
  }

  public void setNumero(@javax.annotation.Nullable String numero) {
    this.numero = numero;
  }


  public DfeContribuinteEndereco complemento(@javax.annotation.Nullable String complemento) {
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


  public DfeContribuinteEndereco bairro(@javax.annotation.Nullable String bairro) {
    this.bairro = bairro;
    return this;
  }

  /**
   * Bairro.
   * @return bairro
   */
  @javax.annotation.Nullable
  public String getBairro() {
    return bairro;
  }

  public void setBairro(@javax.annotation.Nullable String bairro) {
    this.bairro = bairro;
  }


  public DfeContribuinteEndereco codigoMunicipio(@javax.annotation.Nullable String codigoMunicipio) {
    this.codigoMunicipio = codigoMunicipio;
    return this;
  }

  /**
   * Código do município (utilizar a tabela do IBGE), informar 9999999 para operações com o exterior.
   * @return codigoMunicipio
   */
  @javax.annotation.Nullable
  public String getCodigoMunicipio() {
    return codigoMunicipio;
  }

  public void setCodigoMunicipio(@javax.annotation.Nullable String codigoMunicipio) {
    this.codigoMunicipio = codigoMunicipio;
  }


  public DfeContribuinteEndereco nomeMunicipio(@javax.annotation.Nullable String nomeMunicipio) {
    this.nomeMunicipio = nomeMunicipio;
    return this;
  }

  /**
   * Nome do município, informar EXTERIOR para operações com o exterior.
   * @return nomeMunicipio
   */
  @javax.annotation.Nullable
  public String getNomeMunicipio() {
    return nomeMunicipio;
  }

  public void setNomeMunicipio(@javax.annotation.Nullable String nomeMunicipio) {
    this.nomeMunicipio = nomeMunicipio;
  }


  public DfeContribuinteEndereco uf(@javax.annotation.Nullable String uf) {
    this.uf = uf;
    return this;
  }

  /**
   * Sigla da UF, informar EX para operações com o exterior.
   * @return uf
   */
  @javax.annotation.Nullable
  public String getUf() {
    return uf;
  }

  public void setUf(@javax.annotation.Nullable String uf) {
    this.uf = uf;
  }


  public DfeContribuinteEndereco cep(@javax.annotation.Nullable String cep) {
    this.cep = cep;
    return this;
  }

  /**
   * CEP.
   * @return cep
   */
  @javax.annotation.Nullable
  public String getCep() {
    return cep;
  }

  public void setCep(@javax.annotation.Nullable String cep) {
    this.cep = cep;
  }


  public DfeContribuinteEndereco codigoPais(@javax.annotation.Nullable String codigoPais) {
    this.codigoPais = codigoPais;
    return this;
  }

  /**
   * Código de Pais.
   * @return codigoPais
   */
  @javax.annotation.Nullable
  public String getCodigoPais() {
    return codigoPais;
  }

  public void setCodigoPais(@javax.annotation.Nullable String codigoPais) {
    this.codigoPais = codigoPais;
  }


  public DfeContribuinteEndereco pais(@javax.annotation.Nullable String pais) {
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


  public DfeContribuinteEndereco fone(@javax.annotation.Nullable String fone) {
    this.fone = fone;
    return this;
  }

  /**
   * Telefone, preencher com Código DDD + número do telefone , nas operações com exterior é permtido informar o código do país + código da localidade + número do telefone.
   * @return fone
   */
  @javax.annotation.Nullable
  public String getFone() {
    return fone;
  }

  public void setFone(@javax.annotation.Nullable String fone) {
    this.fone = fone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfeContribuinteEndereco dfeContribuinteEndereco = (DfeContribuinteEndereco) o;
    return Objects.equals(this.logradouro, dfeContribuinteEndereco.logradouro) &&
        Objects.equals(this.numero, dfeContribuinteEndereco.numero) &&
        Objects.equals(this.complemento, dfeContribuinteEndereco.complemento) &&
        Objects.equals(this.bairro, dfeContribuinteEndereco.bairro) &&
        Objects.equals(this.codigoMunicipio, dfeContribuinteEndereco.codigoMunicipio) &&
        Objects.equals(this.nomeMunicipio, dfeContribuinteEndereco.nomeMunicipio) &&
        Objects.equals(this.uf, dfeContribuinteEndereco.uf) &&
        Objects.equals(this.cep, dfeContribuinteEndereco.cep) &&
        Objects.equals(this.codigoPais, dfeContribuinteEndereco.codigoPais) &&
        Objects.equals(this.pais, dfeContribuinteEndereco.pais) &&
        Objects.equals(this.fone, dfeContribuinteEndereco.fone);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(logradouro, numero, complemento, bairro, codigoMunicipio, nomeMunicipio, uf, cep, codigoPais, pais, fone);
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
    sb.append("class DfeContribuinteEndereco {\n");
    sb.append("    logradouro: ").append(toIndentedString(logradouro)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    complemento: ").append(toIndentedString(complemento)).append("\n");
    sb.append("    bairro: ").append(toIndentedString(bairro)).append("\n");
    sb.append("    codigoMunicipio: ").append(toIndentedString(codigoMunicipio)).append("\n");
    sb.append("    nomeMunicipio: ").append(toIndentedString(nomeMunicipio)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
    sb.append("    cep: ").append(toIndentedString(cep)).append("\n");
    sb.append("    codigoPais: ").append(toIndentedString(codigoPais)).append("\n");
    sb.append("    pais: ").append(toIndentedString(pais)).append("\n");
    sb.append("    fone: ").append(toIndentedString(fone)).append("\n");
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
    openapiFields.add("nome_municipio");
    openapiFields.add("uf");
    openapiFields.add("cep");
    openapiFields.add("codigo_pais");
    openapiFields.add("pais");
    openapiFields.add("fone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("logradouro");
    openapiRequiredFields.add("numero");
    openapiRequiredFields.add("bairro");
    openapiRequiredFields.add("codigo_municipio");
    openapiRequiredFields.add("nome_municipio");
    openapiRequiredFields.add("uf");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DfeContribuinteEndereco
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DfeContribuinteEndereco.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DfeContribuinteEndereco is not found in the empty JSON string", DfeContribuinteEndereco.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DfeContribuinteEndereco.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DfeContribuinteEndereco` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DfeContribuinteEndereco.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("logradouro") != null && !jsonObj.get("logradouro").isJsonNull()) && !jsonObj.get("logradouro").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logradouro` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logradouro").toString()));
      }
      if ((jsonObj.get("numero") != null && !jsonObj.get("numero").isJsonNull()) && !jsonObj.get("numero").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `numero` to be a primitive type in the JSON string but got `%s`", jsonObj.get("numero").toString()));
      }
      if ((jsonObj.get("complemento") != null && !jsonObj.get("complemento").isJsonNull()) && !jsonObj.get("complemento").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `complemento` to be a primitive type in the JSON string but got `%s`", jsonObj.get("complemento").toString()));
      }
      if ((jsonObj.get("bairro") != null && !jsonObj.get("bairro").isJsonNull()) && !jsonObj.get("bairro").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bairro` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bairro").toString()));
      }
      if ((jsonObj.get("codigo_municipio") != null && !jsonObj.get("codigo_municipio").isJsonNull()) && !jsonObj.get("codigo_municipio").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codigo_municipio` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codigo_municipio").toString()));
      }
      if ((jsonObj.get("nome_municipio") != null && !jsonObj.get("nome_municipio").isJsonNull()) && !jsonObj.get("nome_municipio").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nome_municipio` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nome_municipio").toString()));
      }
      if ((jsonObj.get("uf") != null && !jsonObj.get("uf").isJsonNull()) && !jsonObj.get("uf").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uf` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uf").toString()));
      }
      if ((jsonObj.get("cep") != null && !jsonObj.get("cep").isJsonNull()) && !jsonObj.get("cep").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cep` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cep").toString()));
      }
      if ((jsonObj.get("codigo_pais") != null && !jsonObj.get("codigo_pais").isJsonNull()) && !jsonObj.get("codigo_pais").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codigo_pais` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codigo_pais").toString()));
      }
      if ((jsonObj.get("pais") != null && !jsonObj.get("pais").isJsonNull()) && !jsonObj.get("pais").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pais` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pais").toString()));
      }
      if ((jsonObj.get("fone") != null && !jsonObj.get("fone").isJsonNull()) && !jsonObj.get("fone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DfeContribuinteEndereco.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DfeContribuinteEndereco' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DfeContribuinteEndereco> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DfeContribuinteEndereco.class));

       return (TypeAdapter<T>) new TypeAdapter<DfeContribuinteEndereco>() {
           @Override
           public void write(JsonWriter out, DfeContribuinteEndereco value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DfeContribuinteEndereco read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DfeContribuinteEndereco given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DfeContribuinteEndereco
   * @throws IOException if the JSON string is invalid with respect to DfeContribuinteEndereco
   */
  public static DfeContribuinteEndereco fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DfeContribuinteEndereco.class);
  }

  /**
   * Convert an instance of DfeContribuinteEndereco to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

