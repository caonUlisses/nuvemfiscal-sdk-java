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
import org.openapitools.client.model.CteSefazEndereco;
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
 * Informações do Recebedor da Carga.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class CteSefazReceb {
  public static final String SERIALIZED_NAME_C_N_P_J = "CNPJ";
  @SerializedName(SERIALIZED_NAME_C_N_P_J)
  @javax.annotation.Nullable
  private String CNPJ;

  public static final String SERIALIZED_NAME_C_P_F = "CPF";
  @SerializedName(SERIALIZED_NAME_C_P_F)
  @javax.annotation.Nullable
  private String CPF;

  public static final String SERIALIZED_NAME_I_E = "IE";
  @SerializedName(SERIALIZED_NAME_I_E)
  @javax.annotation.Nullable
  private String IE;

  public static final String SERIALIZED_NAME_X_NOME = "xNome";
  @SerializedName(SERIALIZED_NAME_X_NOME)
  @javax.annotation.Nullable
  private String xNome;

  public static final String SERIALIZED_NAME_FONE = "fone";
  @SerializedName(SERIALIZED_NAME_FONE)
  @javax.annotation.Nullable
  private String fone;

  public static final String SERIALIZED_NAME_ENDER_RECEB = "enderReceb";
  @SerializedName(SERIALIZED_NAME_ENDER_RECEB)
  @javax.annotation.Nonnull
  private CteSefazEndereco enderReceb;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public CteSefazReceb() {
  }

  public CteSefazReceb CNPJ(@javax.annotation.Nullable String CNPJ) {
    this.CNPJ = CNPJ;
    return this;
  }

  /**
   * Número do CNPJ.  Em caso de empresa não estabelecida no Brasil, será informado o CNPJ com zeros.  Informar os zeros não significativos.
   * @return CNPJ
   */
  @javax.annotation.Nullable
  public String getCNPJ() {
    return CNPJ;
  }

  public void setCNPJ(@javax.annotation.Nullable String CNPJ) {
    this.CNPJ = CNPJ;
  }


  public CteSefazReceb CPF(@javax.annotation.Nullable String CPF) {
    this.CPF = CPF;
    return this;
  }

  /**
   * Número do CPF.  Informar os zeros não significativos.
   * @return CPF
   */
  @javax.annotation.Nullable
  public String getCPF() {
    return CPF;
  }

  public void setCPF(@javax.annotation.Nullable String CPF) {
    this.CPF = CPF;
  }


  public CteSefazReceb IE(@javax.annotation.Nullable String IE) {
    this.IE = IE;
    return this;
  }

  /**
   * Inscrição Estadual.  Informar a IE do recebedor ou ISENTO se recebedor é contribuinte do ICMS isento de inscrição no cadastro de contribuintes do ICMS. Caso o recebedor não seja contribuinte do ICMS não informar o conteúdo.
   * @return IE
   */
  @javax.annotation.Nullable
  public String getIE() {
    return IE;
  }

  public void setIE(@javax.annotation.Nullable String IE) {
    this.IE = IE;
  }


  public CteSefazReceb xNome(@javax.annotation.Nullable String xNome) {
    this.xNome = xNome;
    return this;
  }

  /**
   * Razão Social ou Nome.
   * @return xNome
   */
  @javax.annotation.Nullable
  public String getxNome() {
    return xNome;
  }

  public void setxNome(@javax.annotation.Nullable String xNome) {
    this.xNome = xNome;
  }


  public CteSefazReceb fone(@javax.annotation.Nullable String fone) {
    this.fone = fone;
    return this;
  }

  /**
   * Telefone.
   * @return fone
   */
  @javax.annotation.Nullable
  public String getFone() {
    return fone;
  }

  public void setFone(@javax.annotation.Nullable String fone) {
    this.fone = fone;
  }


  public CteSefazReceb enderReceb(@javax.annotation.Nonnull CteSefazEndereco enderReceb) {
    this.enderReceb = enderReceb;
    return this;
  }

  /**
   * Get enderReceb
   * @return enderReceb
   */
  @javax.annotation.Nonnull
  public CteSefazEndereco getEnderReceb() {
    return enderReceb;
  }

  public void setEnderReceb(@javax.annotation.Nonnull CteSefazEndereco enderReceb) {
    this.enderReceb = enderReceb;
  }


  public CteSefazReceb email(@javax.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * Endereço de email.
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CteSefazReceb cteSefazReceb = (CteSefazReceb) o;
    return Objects.equals(this.CNPJ, cteSefazReceb.CNPJ) &&
        Objects.equals(this.CPF, cteSefazReceb.CPF) &&
        Objects.equals(this.IE, cteSefazReceb.IE) &&
        Objects.equals(this.xNome, cteSefazReceb.xNome) &&
        Objects.equals(this.fone, cteSefazReceb.fone) &&
        Objects.equals(this.enderReceb, cteSefazReceb.enderReceb) &&
        Objects.equals(this.email, cteSefazReceb.email);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(CNPJ, CPF, IE, xNome, fone, enderReceb, email);
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
    sb.append("class CteSefazReceb {\n");
    sb.append("    CNPJ: ").append(toIndentedString(CNPJ)).append("\n");
    sb.append("    CPF: ").append(toIndentedString(CPF)).append("\n");
    sb.append("    IE: ").append(toIndentedString(IE)).append("\n");
    sb.append("    xNome: ").append(toIndentedString(xNome)).append("\n");
    sb.append("    fone: ").append(toIndentedString(fone)).append("\n");
    sb.append("    enderReceb: ").append(toIndentedString(enderReceb)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
    openapiFields.add("CNPJ");
    openapiFields.add("CPF");
    openapiFields.add("IE");
    openapiFields.add("xNome");
    openapiFields.add("fone");
    openapiFields.add("enderReceb");
    openapiFields.add("email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("xNome");
    openapiRequiredFields.add("enderReceb");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CteSefazReceb
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CteSefazReceb.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CteSefazReceb is not found in the empty JSON string", CteSefazReceb.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CteSefazReceb.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CteSefazReceb` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CteSefazReceb.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("CNPJ") != null && !jsonObj.get("CNPJ").isJsonNull()) && !jsonObj.get("CNPJ").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CNPJ` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CNPJ").toString()));
      }
      if ((jsonObj.get("CPF") != null && !jsonObj.get("CPF").isJsonNull()) && !jsonObj.get("CPF").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CPF` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CPF").toString()));
      }
      if ((jsonObj.get("IE") != null && !jsonObj.get("IE").isJsonNull()) && !jsonObj.get("IE").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IE` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IE").toString()));
      }
      if ((jsonObj.get("xNome") != null && !jsonObj.get("xNome").isJsonNull()) && !jsonObj.get("xNome").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xNome` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xNome").toString()));
      }
      if ((jsonObj.get("fone") != null && !jsonObj.get("fone").isJsonNull()) && !jsonObj.get("fone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fone").toString()));
      }
      // validate the required field `enderReceb`
      CteSefazEndereco.validateJsonElement(jsonObj.get("enderReceb"));
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CteSefazReceb.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CteSefazReceb' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CteSefazReceb> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CteSefazReceb.class));

       return (TypeAdapter<T>) new TypeAdapter<CteSefazReceb>() {
           @Override
           public void write(JsonWriter out, CteSefazReceb value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CteSefazReceb read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CteSefazReceb given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CteSefazReceb
   * @throws IOException if the JSON string is invalid with respect to CteSefazReceb
   */
  public static CteSefazReceb fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CteSefazReceb.class);
  }

  /**
   * Convert an instance of CteSefazReceb to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

