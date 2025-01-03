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
import io.github.com.caonulisses.nuvemfiscalsdk.model.CteSefazEnderFer;
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
 * Informações das Ferrovias Envolvidas.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class CteSefazFerroEnv {
  public static final String SERIALIZED_NAME_C_N_P_J = "CNPJ";
  @SerializedName(SERIALIZED_NAME_C_N_P_J)
  @javax.annotation.Nullable
  private String CNPJ;

  public static final String SERIALIZED_NAME_C_INT = "cInt";
  @SerializedName(SERIALIZED_NAME_C_INT)
  @javax.annotation.Nullable
  private String cInt;

  public static final String SERIALIZED_NAME_I_E = "IE";
  @SerializedName(SERIALIZED_NAME_I_E)
  @javax.annotation.Nullable
  private String IE;

  public static final String SERIALIZED_NAME_X_NOME = "xNome";
  @SerializedName(SERIALIZED_NAME_X_NOME)
  @javax.annotation.Nullable
  private String xNome;

  public static final String SERIALIZED_NAME_ENDER_FERRO = "enderFerro";
  @SerializedName(SERIALIZED_NAME_ENDER_FERRO)
  @javax.annotation.Nonnull
  private CteSefazEnderFer enderFerro;

  public CteSefazFerroEnv() {
  }

  public CteSefazFerroEnv CNPJ(@javax.annotation.Nullable String CNPJ) {
    this.CNPJ = CNPJ;
    return this;
  }

  /**
   * Número do CNPJ.  Informar o CNPJ da Ferrovia Envolvida. Caso a Ferrovia envolvida não seja inscrita no CNPJ o campo deverá preenchido com zeros.  Informar os zeros não significativos.
   * @return CNPJ
   */
  @javax.annotation.Nullable
  public String getCNPJ() {
    return CNPJ;
  }

  public void setCNPJ(@javax.annotation.Nullable String CNPJ) {
    this.CNPJ = CNPJ;
  }


  public CteSefazFerroEnv cInt(@javax.annotation.Nullable String cInt) {
    this.cInt = cInt;
    return this;
  }

  /**
   * Código interno da Ferrovia envolvida.  Uso da transportadora.
   * @return cInt
   */
  @javax.annotation.Nullable
  public String getcInt() {
    return cInt;
  }

  public void setcInt(@javax.annotation.Nullable String cInt) {
    this.cInt = cInt;
  }


  public CteSefazFerroEnv IE(@javax.annotation.Nullable String IE) {
    this.IE = IE;
    return this;
  }

  /**
   * Inscrição Estadual.
   * @return IE
   */
  @javax.annotation.Nullable
  public String getIE() {
    return IE;
  }

  public void setIE(@javax.annotation.Nullable String IE) {
    this.IE = IE;
  }


  public CteSefazFerroEnv xNome(@javax.annotation.Nullable String xNome) {
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


  public CteSefazFerroEnv enderFerro(@javax.annotation.Nonnull CteSefazEnderFer enderFerro) {
    this.enderFerro = enderFerro;
    return this;
  }

  /**
   * Get enderFerro
   * @return enderFerro
   */
  @javax.annotation.Nonnull
  public CteSefazEnderFer getEnderFerro() {
    return enderFerro;
  }

  public void setEnderFerro(@javax.annotation.Nonnull CteSefazEnderFer enderFerro) {
    this.enderFerro = enderFerro;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CteSefazFerroEnv cteSefazFerroEnv = (CteSefazFerroEnv) o;
    return Objects.equals(this.CNPJ, cteSefazFerroEnv.CNPJ) &&
        Objects.equals(this.cInt, cteSefazFerroEnv.cInt) &&
        Objects.equals(this.IE, cteSefazFerroEnv.IE) &&
        Objects.equals(this.xNome, cteSefazFerroEnv.xNome) &&
        Objects.equals(this.enderFerro, cteSefazFerroEnv.enderFerro);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(CNPJ, cInt, IE, xNome, enderFerro);
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
    sb.append("class CteSefazFerroEnv {\n");
    sb.append("    CNPJ: ").append(toIndentedString(CNPJ)).append("\n");
    sb.append("    cInt: ").append(toIndentedString(cInt)).append("\n");
    sb.append("    IE: ").append(toIndentedString(IE)).append("\n");
    sb.append("    xNome: ").append(toIndentedString(xNome)).append("\n");
    sb.append("    enderFerro: ").append(toIndentedString(enderFerro)).append("\n");
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
    openapiFields.add("cInt");
    openapiFields.add("IE");
    openapiFields.add("xNome");
    openapiFields.add("enderFerro");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("CNPJ");
    openapiRequiredFields.add("xNome");
    openapiRequiredFields.add("enderFerro");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CteSefazFerroEnv
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CteSefazFerroEnv.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CteSefazFerroEnv is not found in the empty JSON string", CteSefazFerroEnv.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CteSefazFerroEnv.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CteSefazFerroEnv` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CteSefazFerroEnv.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("CNPJ") != null && !jsonObj.get("CNPJ").isJsonNull()) && !jsonObj.get("CNPJ").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CNPJ` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CNPJ").toString()));
      }
      if ((jsonObj.get("cInt") != null && !jsonObj.get("cInt").isJsonNull()) && !jsonObj.get("cInt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cInt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cInt").toString()));
      }
      if ((jsonObj.get("IE") != null && !jsonObj.get("IE").isJsonNull()) && !jsonObj.get("IE").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IE` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IE").toString()));
      }
      if ((jsonObj.get("xNome") != null && !jsonObj.get("xNome").isJsonNull()) && !jsonObj.get("xNome").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xNome` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xNome").toString()));
      }
      // validate the required field `enderFerro`
      CteSefazEnderFer.validateJsonElement(jsonObj.get("enderFerro"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CteSefazFerroEnv.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CteSefazFerroEnv' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CteSefazFerroEnv> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CteSefazFerroEnv.class));

       return (TypeAdapter<T>) new TypeAdapter<CteSefazFerroEnv>() {
           @Override
           public void write(JsonWriter out, CteSefazFerroEnv value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CteSefazFerroEnv read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CteSefazFerroEnv given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CteSefazFerroEnv
   * @throws IOException if the JSON string is invalid with respect to CteSefazFerroEnv
   */
  public static CteSefazFerroEnv fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CteSefazFerroEnv.class);
  }

  /**
   * Convert an instance of CteSefazFerroEnv to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

