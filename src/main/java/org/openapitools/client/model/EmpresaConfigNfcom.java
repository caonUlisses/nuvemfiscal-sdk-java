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
 * EmpresaConfigNfcom
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class EmpresaConfigNfcom {
  public static final String SERIALIZED_NAME_C_R_T = "CRT";
  @SerializedName(SERIALIZED_NAME_C_R_T)
  @javax.annotation.Nullable
  private Integer CRT;

  /**
   * Indica se a empresa irá emitir em produção ou homologação.
   */
  @JsonAdapter(AmbienteEnum.Adapter.class)
  public enum AmbienteEnum {
    HOMOLOGACAO("homologacao"),
    
    PRODUCAO("producao");

    private String value;

    AmbienteEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AmbienteEnum fromValue(String value) {
      for (AmbienteEnum b : AmbienteEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AmbienteEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AmbienteEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AmbienteEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AmbienteEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AmbienteEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_AMBIENTE = "ambiente";
  @SerializedName(SERIALIZED_NAME_AMBIENTE)
  @javax.annotation.Nonnull
  private AmbienteEnum ambiente;

  public EmpresaConfigNfcom() {
  }

  public EmpresaConfigNfcom CRT(@javax.annotation.Nullable Integer CRT) {
    this.CRT = CRT;
    return this;
  }

  /**
   * Código de Regime Tributário.  Este campo será preenchido com:  * 1 – Simples Nacional;  * 2 – Simples Nacional – excesso de sublimite de receita bruta;  * 3 – Regime Normal.
   * @return CRT
   */
  @javax.annotation.Nullable
  public Integer getCRT() {
    return CRT;
  }

  public void setCRT(@javax.annotation.Nullable Integer CRT) {
    this.CRT = CRT;
  }


  public EmpresaConfigNfcom ambiente(@javax.annotation.Nonnull AmbienteEnum ambiente) {
    this.ambiente = ambiente;
    return this;
  }

  /**
   * Indica se a empresa irá emitir em produção ou homologação.
   * @return ambiente
   */
  @javax.annotation.Nonnull
  public AmbienteEnum getAmbiente() {
    return ambiente;
  }

  public void setAmbiente(@javax.annotation.Nonnull AmbienteEnum ambiente) {
    this.ambiente = ambiente;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmpresaConfigNfcom empresaConfigNfcom = (EmpresaConfigNfcom) o;
    return Objects.equals(this.CRT, empresaConfigNfcom.CRT) &&
        Objects.equals(this.ambiente, empresaConfigNfcom.ambiente);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CRT, ambiente);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmpresaConfigNfcom {\n");
    sb.append("    CRT: ").append(toIndentedString(CRT)).append("\n");
    sb.append("    ambiente: ").append(toIndentedString(ambiente)).append("\n");
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
    openapiFields.add("CRT");
    openapiFields.add("ambiente");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ambiente");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EmpresaConfigNfcom
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EmpresaConfigNfcom.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmpresaConfigNfcom is not found in the empty JSON string", EmpresaConfigNfcom.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EmpresaConfigNfcom.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmpresaConfigNfcom` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EmpresaConfigNfcom.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("ambiente").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ambiente` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ambiente").toString()));
      }
      // validate the required field `ambiente`
      AmbienteEnum.validateJsonElement(jsonObj.get("ambiente"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmpresaConfigNfcom.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmpresaConfigNfcom' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmpresaConfigNfcom> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmpresaConfigNfcom.class));

       return (TypeAdapter<T>) new TypeAdapter<EmpresaConfigNfcom>() {
           @Override
           public void write(JsonWriter out, EmpresaConfigNfcom value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmpresaConfigNfcom read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EmpresaConfigNfcom given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EmpresaConfigNfcom
   * @throws IOException if the JSON string is invalid with respect to EmpresaConfigNfcom
   */
  public static EmpresaConfigNfcom fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmpresaConfigNfcom.class);
  }

  /**
   * Convert an instance of EmpresaConfigNfcom to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

