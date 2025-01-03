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
 * EmpresaConfigDistribuicaoNfe
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class EmpresaConfigDistribuicaoNfe {
  public static final String SERIALIZED_NAME_DISTRIBUICAO_AUTOMATICA = "distribuicao_automatica";
  @SerializedName(SERIALIZED_NAME_DISTRIBUICAO_AUTOMATICA)
  @javax.annotation.Nullable
  private Boolean distribuicaoAutomatica = false;

  public static final String SERIALIZED_NAME_CIENCIA_AUTOMATICA = "ciencia_automatica";
  @SerializedName(SERIALIZED_NAME_CIENCIA_AUTOMATICA)
  @javax.annotation.Nullable
  private Boolean cienciaAutomatica = false;

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

  public EmpresaConfigDistribuicaoNfe() {
  }

  public EmpresaConfigDistribuicaoNfe distribuicaoAutomatica(@javax.annotation.Nullable Boolean distribuicaoAutomatica) {
    this.distribuicaoAutomatica = distribuicaoAutomatica;
    return this;
  }

  /**
   * Indica se a distribuição automática está habilitada.    Nesse modo, a API da Nuvem Fiscal irá realizar pedidos de distribuição  pelo último NSU de forma automática a cada 1 hora.
   * @return distribuicaoAutomatica
   */
  @javax.annotation.Nullable
  public Boolean getDistribuicaoAutomatica() {
    return distribuicaoAutomatica;
  }

  public void setDistribuicaoAutomatica(@javax.annotation.Nullable Boolean distribuicaoAutomatica) {
    this.distribuicaoAutomatica = distribuicaoAutomatica;
  }


  public EmpresaConfigDistribuicaoNfe cienciaAutomatica(@javax.annotation.Nullable Boolean cienciaAutomatica) {
    this.cienciaAutomatica = cienciaAutomatica;
    return this;
  }

  /**
   * Indica se a manifestação de Ciência da Operação (210210) deve ser feita  automaticamente pela API.    Caso habilitada, a manifestação de ciência será realizada para notas  recebidas por qualquer forma de consulta ou modo de distribuição (manual ou automático).
   * @return cienciaAutomatica
   */
  @javax.annotation.Nullable
  public Boolean getCienciaAutomatica() {
    return cienciaAutomatica;
  }

  public void setCienciaAutomatica(@javax.annotation.Nullable Boolean cienciaAutomatica) {
    this.cienciaAutomatica = cienciaAutomatica;
  }


  public EmpresaConfigDistribuicaoNfe ambiente(@javax.annotation.Nonnull AmbienteEnum ambiente) {
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
    EmpresaConfigDistribuicaoNfe empresaConfigDistribuicaoNfe = (EmpresaConfigDistribuicaoNfe) o;
    return Objects.equals(this.distribuicaoAutomatica, empresaConfigDistribuicaoNfe.distribuicaoAutomatica) &&
        Objects.equals(this.cienciaAutomatica, empresaConfigDistribuicaoNfe.cienciaAutomatica) &&
        Objects.equals(this.ambiente, empresaConfigDistribuicaoNfe.ambiente);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(distribuicaoAutomatica, cienciaAutomatica, ambiente);
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
    sb.append("class EmpresaConfigDistribuicaoNfe {\n");
    sb.append("    distribuicaoAutomatica: ").append(toIndentedString(distribuicaoAutomatica)).append("\n");
    sb.append("    cienciaAutomatica: ").append(toIndentedString(cienciaAutomatica)).append("\n");
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
    openapiFields.add("distribuicao_automatica");
    openapiFields.add("ciencia_automatica");
    openapiFields.add("ambiente");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ambiente");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EmpresaConfigDistribuicaoNfe
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EmpresaConfigDistribuicaoNfe.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmpresaConfigDistribuicaoNfe is not found in the empty JSON string", EmpresaConfigDistribuicaoNfe.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EmpresaConfigDistribuicaoNfe.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmpresaConfigDistribuicaoNfe` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EmpresaConfigDistribuicaoNfe.openapiRequiredFields) {
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
       if (!EmpresaConfigDistribuicaoNfe.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmpresaConfigDistribuicaoNfe' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmpresaConfigDistribuicaoNfe> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmpresaConfigDistribuicaoNfe.class));

       return (TypeAdapter<T>) new TypeAdapter<EmpresaConfigDistribuicaoNfe>() {
           @Override
           public void write(JsonWriter out, EmpresaConfigDistribuicaoNfe value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmpresaConfigDistribuicaoNfe read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EmpresaConfigDistribuicaoNfe given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EmpresaConfigDistribuicaoNfe
   * @throws IOException if the JSON string is invalid with respect to EmpresaConfigDistribuicaoNfe
   */
  public static EmpresaConfigDistribuicaoNfe fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmpresaConfigDistribuicaoNfe.class);
  }

  /**
   * Convert an instance of EmpresaConfigDistribuicaoNfe to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

