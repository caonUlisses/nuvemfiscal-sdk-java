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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.github.com.caonulisses.nuvemfiscalsdk.model.NfseMensagemRetorno;

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
 * NfseSincronizacao
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfseSincronizacao {
  /**
   * Situação atual da sincronização.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDENTE("pendente"),
    
    SINCRONIZADO("sincronizado"),
    
    ERRO("erro");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private StatusEnum status;

  public static final String SERIALIZED_NAME_MENSAGENS = "mensagens";
  @SerializedName(SERIALIZED_NAME_MENSAGENS)
  @javax.annotation.Nullable
  private List<NfseMensagemRetorno> mensagens = new ArrayList<>();

  public NfseSincronizacao() {
  }

  public NfseSincronizacao status(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Situação atual da sincronização.
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
  }


  public NfseSincronizacao mensagens(@javax.annotation.Nullable List<NfseMensagemRetorno> mensagens) {
    this.mensagens = mensagens;
    return this;
  }

  public NfseSincronizacao addMensagensItem(NfseMensagemRetorno mensagensItem) {
    if (this.mensagens == null) {
      this.mensagens = new ArrayList<>();
    }
    this.mensagens.add(mensagensItem);
    return this;
  }

  /**
   * Get mensagens
   * @return mensagens
   */
  @javax.annotation.Nullable
  public List<NfseMensagemRetorno> getMensagens() {
    return mensagens;
  }

  public void setMensagens(@javax.annotation.Nullable List<NfseMensagemRetorno> mensagens) {
    this.mensagens = mensagens;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfseSincronizacao nfseSincronizacao = (NfseSincronizacao) o;
    return Objects.equals(this.status, nfseSincronizacao.status) &&
        Objects.equals(this.mensagens, nfseSincronizacao.mensagens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, mensagens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NfseSincronizacao {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    mensagens: ").append(toIndentedString(mensagens)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("mensagens");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfseSincronizacao
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfseSincronizacao.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfseSincronizacao is not found in the empty JSON string", NfseSincronizacao.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfseSincronizacao.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfseSincronizacao` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if (jsonObj.get("mensagens") != null && !jsonObj.get("mensagens").isJsonNull()) {
        JsonArray jsonArraymensagens = jsonObj.getAsJsonArray("mensagens");
        if (jsonArraymensagens != null) {
          // ensure the json data is an array
          if (!jsonObj.get("mensagens").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `mensagens` to be an array in the JSON string but got `%s`", jsonObj.get("mensagens").toString()));
          }

          // validate the optional field `mensagens` (array)
          for (int i = 0; i < jsonArraymensagens.size(); i++) {
            NfseMensagemRetorno.validateJsonElement(jsonArraymensagens.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NfseSincronizacao.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfseSincronizacao' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfseSincronizacao> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfseSincronizacao.class));

       return (TypeAdapter<T>) new TypeAdapter<NfseSincronizacao>() {
           @Override
           public void write(JsonWriter out, NfseSincronizacao value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfseSincronizacao read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfseSincronizacao given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfseSincronizacao
   * @throws IOException if the JSON string is invalid with respect to NfseSincronizacao
   */
  public static NfseSincronizacao fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfseSincronizacao.class);
  }

  /**
   * Convert an instance of NfseSincronizacao to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

