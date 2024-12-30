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
 * Preenchido quando for  transporte de produtos classificados pela ONU como perigosos.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class MdfeSefazInfNFePeri {
  public static final String SERIALIZED_NAME_N_O_N_U = "nONU";
  @SerializedName(SERIALIZED_NAME_N_O_N_U)
  @javax.annotation.Nullable
  private String nONU;

  public static final String SERIALIZED_NAME_X_NOME_A_E = "xNomeAE";
  @SerializedName(SERIALIZED_NAME_X_NOME_A_E)
  @javax.annotation.Nullable
  private String xNomeAE;

  public static final String SERIALIZED_NAME_X_CLA_RISCO = "xClaRisco";
  @SerializedName(SERIALIZED_NAME_X_CLA_RISCO)
  @javax.annotation.Nullable
  private String xClaRisco;

  public static final String SERIALIZED_NAME_GR_EMB = "grEmb";
  @SerializedName(SERIALIZED_NAME_GR_EMB)
  @javax.annotation.Nullable
  private String grEmb;

  public static final String SERIALIZED_NAME_Q_TOT_PROD = "qTotProd";
  @SerializedName(SERIALIZED_NAME_Q_TOT_PROD)
  @javax.annotation.Nullable
  private String qTotProd;

  public static final String SERIALIZED_NAME_Q_VOL_TIPO = "qVolTipo";
  @SerializedName(SERIALIZED_NAME_Q_VOL_TIPO)
  @javax.annotation.Nullable
  private String qVolTipo;

  public MdfeSefazInfNFePeri() {
  }

  public MdfeSefazInfNFePeri nONU(@javax.annotation.Nullable String nONU) {
    this.nONU = nONU;
    return this;
  }

  /**
   * Número ONU/UN.  Ver a legislação de transporte de produtos perigosos aplicadas ao modal.
   * @return nONU
   */
  @javax.annotation.Nullable
  public String getnONU() {
    return nONU;
  }

  public void setnONU(@javax.annotation.Nullable String nONU) {
    this.nONU = nONU;
  }


  public MdfeSefazInfNFePeri xNomeAE(@javax.annotation.Nullable String xNomeAE) {
    this.xNomeAE = xNomeAE;
    return this;
  }

  /**
   * Nome apropriado para embarque do produto.  Ver a legislação de transporte de produtos perigosos aplicada ao modo de transporte.
   * @return xNomeAE
   */
  @javax.annotation.Nullable
  public String getxNomeAE() {
    return xNomeAE;
  }

  public void setxNomeAE(@javax.annotation.Nullable String xNomeAE) {
    this.xNomeAE = xNomeAE;
  }


  public MdfeSefazInfNFePeri xClaRisco(@javax.annotation.Nullable String xClaRisco) {
    this.xClaRisco = xClaRisco;
    return this;
  }

  /**
   * Classe ou subclasse/divisão, e risco subsidiário/risco secundário.  Ver a legislação de transporte de produtos perigosos aplicadas ao modal.
   * @return xClaRisco
   */
  @javax.annotation.Nullable
  public String getxClaRisco() {
    return xClaRisco;
  }

  public void setxClaRisco(@javax.annotation.Nullable String xClaRisco) {
    this.xClaRisco = xClaRisco;
  }


  public MdfeSefazInfNFePeri grEmb(@javax.annotation.Nullable String grEmb) {
    this.grEmb = grEmb;
    return this;
  }

  /**
   * Grupo de Embalagem.  Ver a legislação de transporte de produtos perigosos aplicadas ao modal  Preenchimento obrigatório para o modal aéreo.  A legislação para o modal rodoviário e ferroviário não atribui grupo de embalagem para todos os produtos, portanto haverá casos de não preenchimento desse campo.
   * @return grEmb
   */
  @javax.annotation.Nullable
  public String getGrEmb() {
    return grEmb;
  }

  public void setGrEmb(@javax.annotation.Nullable String grEmb) {
    this.grEmb = grEmb;
  }


  public MdfeSefazInfNFePeri qTotProd(@javax.annotation.Nullable String qTotProd) {
    this.qTotProd = qTotProd;
    return this;
  }

  /**
   * Quantidade total por produto.  Preencher conforme a legislação de transporte de produtos perigosos aplicada ao modal.
   * @return qTotProd
   */
  @javax.annotation.Nullable
  public String getqTotProd() {
    return qTotProd;
  }

  public void setqTotProd(@javax.annotation.Nullable String qTotProd) {
    this.qTotProd = qTotProd;
  }


  public MdfeSefazInfNFePeri qVolTipo(@javax.annotation.Nullable String qVolTipo) {
    this.qVolTipo = qVolTipo;
    return this;
  }

  /**
   * Quantidade e Tipo de volumes.  Preencher conforme a legislação de transporte de produtos perigosos aplicada ao modal.
   * @return qVolTipo
   */
  @javax.annotation.Nullable
  public String getqVolTipo() {
    return qVolTipo;
  }

  public void setqVolTipo(@javax.annotation.Nullable String qVolTipo) {
    this.qVolTipo = qVolTipo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MdfeSefazInfNFePeri mdfeSefazInfNFePeri = (MdfeSefazInfNFePeri) o;
    return Objects.equals(this.nONU, mdfeSefazInfNFePeri.nONU) &&
        Objects.equals(this.xNomeAE, mdfeSefazInfNFePeri.xNomeAE) &&
        Objects.equals(this.xClaRisco, mdfeSefazInfNFePeri.xClaRisco) &&
        Objects.equals(this.grEmb, mdfeSefazInfNFePeri.grEmb) &&
        Objects.equals(this.qTotProd, mdfeSefazInfNFePeri.qTotProd) &&
        Objects.equals(this.qVolTipo, mdfeSefazInfNFePeri.qVolTipo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(nONU, xNomeAE, xClaRisco, grEmb, qTotProd, qVolTipo);
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
    sb.append("class MdfeSefazInfNFePeri {\n");
    sb.append("    nONU: ").append(toIndentedString(nONU)).append("\n");
    sb.append("    xNomeAE: ").append(toIndentedString(xNomeAE)).append("\n");
    sb.append("    xClaRisco: ").append(toIndentedString(xClaRisco)).append("\n");
    sb.append("    grEmb: ").append(toIndentedString(grEmb)).append("\n");
    sb.append("    qTotProd: ").append(toIndentedString(qTotProd)).append("\n");
    sb.append("    qVolTipo: ").append(toIndentedString(qVolTipo)).append("\n");
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
    openapiFields.add("nONU");
    openapiFields.add("xNomeAE");
    openapiFields.add("xClaRisco");
    openapiFields.add("grEmb");
    openapiFields.add("qTotProd");
    openapiFields.add("qVolTipo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("nONU");
    openapiRequiredFields.add("qTotProd");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MdfeSefazInfNFePeri
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MdfeSefazInfNFePeri.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MdfeSefazInfNFePeri is not found in the empty JSON string", MdfeSefazInfNFePeri.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MdfeSefazInfNFePeri.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MdfeSefazInfNFePeri` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MdfeSefazInfNFePeri.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("nONU") != null && !jsonObj.get("nONU").isJsonNull()) && !jsonObj.get("nONU").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nONU` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nONU").toString()));
      }
      if ((jsonObj.get("xNomeAE") != null && !jsonObj.get("xNomeAE").isJsonNull()) && !jsonObj.get("xNomeAE").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xNomeAE` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xNomeAE").toString()));
      }
      if ((jsonObj.get("xClaRisco") != null && !jsonObj.get("xClaRisco").isJsonNull()) && !jsonObj.get("xClaRisco").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xClaRisco` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xClaRisco").toString()));
      }
      if ((jsonObj.get("grEmb") != null && !jsonObj.get("grEmb").isJsonNull()) && !jsonObj.get("grEmb").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `grEmb` to be a primitive type in the JSON string but got `%s`", jsonObj.get("grEmb").toString()));
      }
      if ((jsonObj.get("qTotProd") != null && !jsonObj.get("qTotProd").isJsonNull()) && !jsonObj.get("qTotProd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qTotProd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qTotProd").toString()));
      }
      if ((jsonObj.get("qVolTipo") != null && !jsonObj.get("qVolTipo").isJsonNull()) && !jsonObj.get("qVolTipo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qVolTipo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qVolTipo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MdfeSefazInfNFePeri.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MdfeSefazInfNFePeri' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MdfeSefazInfNFePeri> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MdfeSefazInfNFePeri.class));

       return (TypeAdapter<T>) new TypeAdapter<MdfeSefazInfNFePeri>() {
           @Override
           public void write(JsonWriter out, MdfeSefazInfNFePeri value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MdfeSefazInfNFePeri read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MdfeSefazInfNFePeri given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MdfeSefazInfNFePeri
   * @throws IOException if the JSON string is invalid with respect to MdfeSefazInfNFePeri
   */
  public static MdfeSefazInfNFePeri fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MdfeSefazInfNFePeri.class);
  }

  /**
   * Convert an instance of MdfeSefazInfNFePeri to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

