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
import java.time.OffsetDateTime;
import java.util.Arrays;
import io.github.com.caonulisses.nuvemfiscalsdk.model.EmpresaEndereco;

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
 * Empresa
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class Empresa {
  public static final String SERIALIZED_NAME_CPF_CNPJ = "cpf_cnpj";
  @SerializedName(SERIALIZED_NAME_CPF_CNPJ)
  @javax.annotation.Nonnull
  private String cpfCnpj;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  @javax.annotation.Nullable
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_INSCRICAO_ESTADUAL = "inscricao_estadual";
  @SerializedName(SERIALIZED_NAME_INSCRICAO_ESTADUAL)
  @javax.annotation.Nullable
  private String inscricaoEstadual;

  public static final String SERIALIZED_NAME_INSCRICAO_MUNICIPAL = "inscricao_municipal";
  @SerializedName(SERIALIZED_NAME_INSCRICAO_MUNICIPAL)
  @javax.annotation.Nullable
  private String inscricaoMunicipal;

  public static final String SERIALIZED_NAME_NOME_RAZAO_SOCIAL = "nome_razao_social";
  @SerializedName(SERIALIZED_NAME_NOME_RAZAO_SOCIAL)
  @javax.annotation.Nonnull
  private String nomeRazaoSocial;

  public static final String SERIALIZED_NAME_NOME_FANTASIA = "nome_fantasia";
  @SerializedName(SERIALIZED_NAME_NOME_FANTASIA)
  @javax.annotation.Nullable
  private String nomeFantasia;

  public static final String SERIALIZED_NAME_FONE = "fone";
  @SerializedName(SERIALIZED_NAME_FONE)
  @javax.annotation.Nullable
  private String fone;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nonnull
  private String email;

  public static final String SERIALIZED_NAME_ENDERECO = "endereco";
  @SerializedName(SERIALIZED_NAME_ENDERECO)
  @javax.annotation.Nonnull
  private EmpresaEndereco endereco;

  public Empresa() {
  }

  public Empresa cpfCnpj(@javax.annotation.Nonnull String cpfCnpj) {
    this.cpfCnpj = cpfCnpj;
    return this;
  }

  /**
   * CPF ou CNPJ da empresa.    *Utilize o valor sem máscara*.
   * @return cpfCnpj
   */
  @javax.annotation.Nonnull
  public String getCpfCnpj() {
    return cpfCnpj;
  }

  public void setCpfCnpj(@javax.annotation.Nonnull String cpfCnpj) {
    this.cpfCnpj = cpfCnpj;
  }


  public Empresa createdAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Data/hora em que o objeto foi criado na Nuvem Fiscal. Representado no formato &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot; target&#x3D;\&quot;blank\&quot;&gt;&#x60;ISO 8601&#x60;&lt;/a&gt;.    *A Nuvem Fiscal gerencia esse campo automaticamente. Caso algum valor seja enviado, ele será ignorado*.
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Empresa updatedAt(@javax.annotation.Nullable OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Data e hora que o objeto foi alterado pela última vez na Nuvem Fiscal. Representado no formato &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_8601\&quot; target&#x3D;\&quot;blank\&quot;&gt;&#x60;ISO 8601&#x60;&lt;/a&gt;.    *A Nuvem Fiscal gerencia esse campo automaticamente. Caso algum valor seja enviado, ele será ignorado*.
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(@javax.annotation.Nullable OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Empresa inscricaoEstadual(@javax.annotation.Nullable String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
    return this;
  }

  /**
   * Inscrição estadual da empresa.
   * @return inscricaoEstadual
   */
  @javax.annotation.Nullable
  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }

  public void setInscricaoEstadual(@javax.annotation.Nullable String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }


  public Empresa inscricaoMunicipal(@javax.annotation.Nullable String inscricaoMunicipal) {
    this.inscricaoMunicipal = inscricaoMunicipal;
    return this;
  }

  /**
   * Inscrição municipal da empresa.
   * @return inscricaoMunicipal
   */
  @javax.annotation.Nullable
  public String getInscricaoMunicipal() {
    return inscricaoMunicipal;
  }

  public void setInscricaoMunicipal(@javax.annotation.Nullable String inscricaoMunicipal) {
    this.inscricaoMunicipal = inscricaoMunicipal;
  }


  public Empresa nomeRazaoSocial(@javax.annotation.Nonnull String nomeRazaoSocial) {
    this.nomeRazaoSocial = nomeRazaoSocial;
    return this;
  }

  /**
   * Razão social da empresa.
   * @return nomeRazaoSocial
   */
  @javax.annotation.Nonnull
  public String getNomeRazaoSocial() {
    return nomeRazaoSocial;
  }

  public void setNomeRazaoSocial(@javax.annotation.Nonnull String nomeRazaoSocial) {
    this.nomeRazaoSocial = nomeRazaoSocial;
  }


  public Empresa nomeFantasia(@javax.annotation.Nullable String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
    return this;
  }

  /**
   * Nome fantasia da empresa.
   * @return nomeFantasia
   */
  @javax.annotation.Nullable
  public String getNomeFantasia() {
    return nomeFantasia;
  }

  public void setNomeFantasia(@javax.annotation.Nullable String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }


  public Empresa fone(@javax.annotation.Nullable String fone) {
    this.fone = fone;
    return this;
  }

  /**
   * Telefone da empresa.
   * @return fone
   */
  @javax.annotation.Nullable
  public String getFone() {
    return fone;
  }

  public void setFone(@javax.annotation.Nullable String fone) {
    this.fone = fone;
  }


  public Empresa email(@javax.annotation.Nonnull String email) {
    this.email = email;
    return this;
  }

  /**
   * Email da empresa.
   * @return email
   */
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nonnull String email) {
    this.email = email;
  }


  public Empresa endereco(@javax.annotation.Nonnull EmpresaEndereco endereco) {
    this.endereco = endereco;
    return this;
  }

  /**
   * Get endereco
   * @return endereco
   */
  @javax.annotation.Nonnull
  public EmpresaEndereco getEndereco() {
    return endereco;
  }

  public void setEndereco(@javax.annotation.Nonnull EmpresaEndereco endereco) {
    this.endereco = endereco;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Empresa empresa = (Empresa) o;
    return Objects.equals(this.cpfCnpj, empresa.cpfCnpj) &&
        Objects.equals(this.createdAt, empresa.createdAt) &&
        Objects.equals(this.updatedAt, empresa.updatedAt) &&
        Objects.equals(this.inscricaoEstadual, empresa.inscricaoEstadual) &&
        Objects.equals(this.inscricaoMunicipal, empresa.inscricaoMunicipal) &&
        Objects.equals(this.nomeRazaoSocial, empresa.nomeRazaoSocial) &&
        Objects.equals(this.nomeFantasia, empresa.nomeFantasia) &&
        Objects.equals(this.fone, empresa.fone) &&
        Objects.equals(this.email, empresa.email) &&
        Objects.equals(this.endereco, empresa.endereco);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpfCnpj, createdAt, updatedAt, inscricaoEstadual, inscricaoMunicipal, nomeRazaoSocial, nomeFantasia, fone, email, endereco);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Empresa {\n");
    sb.append("    cpfCnpj: ").append(toIndentedString(cpfCnpj)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    inscricaoEstadual: ").append(toIndentedString(inscricaoEstadual)).append("\n");
    sb.append("    inscricaoMunicipal: ").append(toIndentedString(inscricaoMunicipal)).append("\n");
    sb.append("    nomeRazaoSocial: ").append(toIndentedString(nomeRazaoSocial)).append("\n");
    sb.append("    nomeFantasia: ").append(toIndentedString(nomeFantasia)).append("\n");
    sb.append("    fone: ").append(toIndentedString(fone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    endereco: ").append(toIndentedString(endereco)).append("\n");
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
    openapiFields.add("cpf_cnpj");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("inscricao_estadual");
    openapiFields.add("inscricao_municipal");
    openapiFields.add("nome_razao_social");
    openapiFields.add("nome_fantasia");
    openapiFields.add("fone");
    openapiFields.add("email");
    openapiFields.add("endereco");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cpf_cnpj");
    openapiRequiredFields.add("nome_razao_social");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("endereco");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Empresa
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Empresa.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Empresa is not found in the empty JSON string", Empresa.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Empresa.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Empresa` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Empresa.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("cpf_cnpj").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cpf_cnpj` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cpf_cnpj").toString()));
      }
      if ((jsonObj.get("inscricao_estadual") != null && !jsonObj.get("inscricao_estadual").isJsonNull()) && !jsonObj.get("inscricao_estadual").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inscricao_estadual` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inscricao_estadual").toString()));
      }
      if ((jsonObj.get("inscricao_municipal") != null && !jsonObj.get("inscricao_municipal").isJsonNull()) && !jsonObj.get("inscricao_municipal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inscricao_municipal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inscricao_municipal").toString()));
      }
      if (!jsonObj.get("nome_razao_social").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nome_razao_social` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nome_razao_social").toString()));
      }
      if ((jsonObj.get("nome_fantasia") != null && !jsonObj.get("nome_fantasia").isJsonNull()) && !jsonObj.get("nome_fantasia").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nome_fantasia` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nome_fantasia").toString()));
      }
      if ((jsonObj.get("fone") != null && !jsonObj.get("fone").isJsonNull()) && !jsonObj.get("fone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fone").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // validate the required field `endereco`
      EmpresaEndereco.validateJsonElement(jsonObj.get("endereco"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Empresa.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Empresa' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Empresa> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Empresa.class));

       return (TypeAdapter<T>) new TypeAdapter<Empresa>() {
           @Override
           public void write(JsonWriter out, Empresa value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Empresa read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Empresa given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Empresa
   * @throws IOException if the JSON string is invalid with respect to Empresa
   */
  public static Empresa fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Empresa.class);
  }

  /**
   * Convert an instance of Empresa to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

