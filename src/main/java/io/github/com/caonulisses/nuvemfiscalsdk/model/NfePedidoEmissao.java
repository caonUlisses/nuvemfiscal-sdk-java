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
import io.github.com.caonulisses.nuvemfiscalsdk.model.NfeSefazInfNFe;
import io.github.com.caonulisses.nuvemfiscalsdk.model.NfeSefazInfNFeSupl;
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
 * NfePedidoEmissao
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfePedidoEmissao {
  public static final String SERIALIZED_NAME_INF_N_FE = "infNFe";
  @SerializedName(SERIALIZED_NAME_INF_N_FE)
  @javax.annotation.Nonnull
  private NfeSefazInfNFe infNFe;

  public static final String SERIALIZED_NAME_INF_N_FE_SUPL = "infNFeSupl";
  @SerializedName(SERIALIZED_NAME_INF_N_FE_SUPL)
  @javax.annotation.Nullable
  private NfeSefazInfNFeSupl infNFeSupl;

  /**
   * Identificação do Ambiente.
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

  public static final String SERIALIZED_NAME_REFERENCIA = "referencia";
  @SerializedName(SERIALIZED_NAME_REFERENCIA)
  @javax.annotation.Nullable
  private String referencia;

  public NfePedidoEmissao() {
  }

  public NfePedidoEmissao infNFe(@javax.annotation.Nonnull NfeSefazInfNFe infNFe) {
    this.infNFe = infNFe;
    return this;
  }

  /**
   * Get infNFe
   * @return infNFe
   */
  @javax.annotation.Nonnull
  public NfeSefazInfNFe getInfNFe() {
    return infNFe;
  }

  public void setInfNFe(@javax.annotation.Nonnull NfeSefazInfNFe infNFe) {
    this.infNFe = infNFe;
  }


  public NfePedidoEmissao infNFeSupl(@javax.annotation.Nullable NfeSefazInfNFeSupl infNFeSupl) {
    this.infNFeSupl = infNFeSupl;
    return this;
  }

  /**
   * Get infNFeSupl
   * @return infNFeSupl
   */
  @javax.annotation.Nullable
  public NfeSefazInfNFeSupl getInfNFeSupl() {
    return infNFeSupl;
  }

  public void setInfNFeSupl(@javax.annotation.Nullable NfeSefazInfNFeSupl infNFeSupl) {
    this.infNFeSupl = infNFeSupl;
  }


  public NfePedidoEmissao ambiente(@javax.annotation.Nonnull AmbienteEnum ambiente) {
    this.ambiente = ambiente;
    return this;
  }

  /**
   * Identificação do Ambiente.
   * @return ambiente
   */
  @javax.annotation.Nonnull
  public AmbienteEnum getAmbiente() {
    return ambiente;
  }

  public void setAmbiente(@javax.annotation.Nonnull AmbienteEnum ambiente) {
    this.ambiente = ambiente;
  }


  public NfePedidoEmissao referencia(@javax.annotation.Nullable String referencia) {
    this.referencia = referencia;
    return this;
  }

  /**
   * Seu identificador único para este documento. Opcional, ajuda a evitar o envio duplicado de um mesmo documento.
   * @return referencia
   */
  @javax.annotation.Nullable
  public String getReferencia() {
    return referencia;
  }

  public void setReferencia(@javax.annotation.Nullable String referencia) {
    this.referencia = referencia;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfePedidoEmissao nfePedidoEmissao = (NfePedidoEmissao) o;
    return Objects.equals(this.infNFe, nfePedidoEmissao.infNFe) &&
        Objects.equals(this.infNFeSupl, nfePedidoEmissao.infNFeSupl) &&
        Objects.equals(this.ambiente, nfePedidoEmissao.ambiente) &&
        Objects.equals(this.referencia, nfePedidoEmissao.referencia);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(infNFe, infNFeSupl, ambiente, referencia);
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
    sb.append("class NfePedidoEmissao {\n");
    sb.append("    infNFe: ").append(toIndentedString(infNFe)).append("\n");
    sb.append("    infNFeSupl: ").append(toIndentedString(infNFeSupl)).append("\n");
    sb.append("    ambiente: ").append(toIndentedString(ambiente)).append("\n");
    sb.append("    referencia: ").append(toIndentedString(referencia)).append("\n");
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
    openapiFields.add("infNFe");
    openapiFields.add("infNFeSupl");
    openapiFields.add("ambiente");
    openapiFields.add("referencia");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("infNFe");
    openapiRequiredFields.add("ambiente");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfePedidoEmissao
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfePedidoEmissao.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfePedidoEmissao is not found in the empty JSON string", NfePedidoEmissao.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfePedidoEmissao.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfePedidoEmissao` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NfePedidoEmissao.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `infNFe`
      NfeSefazInfNFe.validateJsonElement(jsonObj.get("infNFe"));
      // validate the optional field `infNFeSupl`
      if (jsonObj.get("infNFeSupl") != null && !jsonObj.get("infNFeSupl").isJsonNull()) {
        NfeSefazInfNFeSupl.validateJsonElement(jsonObj.get("infNFeSupl"));
      }
      if (!jsonObj.get("ambiente").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ambiente` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ambiente").toString()));
      }
      // validate the required field `ambiente`
      AmbienteEnum.validateJsonElement(jsonObj.get("ambiente"));
      if ((jsonObj.get("referencia") != null && !jsonObj.get("referencia").isJsonNull()) && !jsonObj.get("referencia").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referencia` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referencia").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NfePedidoEmissao.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfePedidoEmissao' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfePedidoEmissao> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfePedidoEmissao.class));

       return (TypeAdapter<T>) new TypeAdapter<NfePedidoEmissao>() {
           @Override
           public void write(JsonWriter out, NfePedidoEmissao value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfePedidoEmissao read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfePedidoEmissao given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfePedidoEmissao
   * @throws IOException if the JSON string is invalid with respect to NfePedidoEmissao
   */
  public static NfePedidoEmissao fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfePedidoEmissao.class);
  }

  /**
   * Convert an instance of NfePedidoEmissao to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

