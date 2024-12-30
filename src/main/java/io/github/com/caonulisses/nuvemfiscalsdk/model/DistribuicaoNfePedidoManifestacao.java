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
 * DistribuicaoNfePedidoManifestacao
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class DistribuicaoNfePedidoManifestacao {
  public static final String SERIALIZED_NAME_CPF_CNPJ = "cpf_cnpj";
  @SerializedName(SERIALIZED_NAME_CPF_CNPJ)
  @javax.annotation.Nonnull
  private String cpfCnpj;

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

  public static final String SERIALIZED_NAME_CHAVE_ACESSO = "chave_acesso";
  @SerializedName(SERIALIZED_NAME_CHAVE_ACESSO)
  @javax.annotation.Nonnull
  private String chaveAcesso;

  public static final String SERIALIZED_NAME_TIPO_EVENTO = "tipo_evento";
  @SerializedName(SERIALIZED_NAME_TIPO_EVENTO)
  @javax.annotation.Nonnull
  private String tipoEvento;

  public static final String SERIALIZED_NAME_JUSTIFICATIVA = "justificativa";
  @SerializedName(SERIALIZED_NAME_JUSTIFICATIVA)
  @javax.annotation.Nullable
  private String justificativa;

  public DistribuicaoNfePedidoManifestacao() {
  }

  public DistribuicaoNfePedidoManifestacao cpfCnpj(@javax.annotation.Nonnull String cpfCnpj) {
    this.cpfCnpj = cpfCnpj;
    return this;
  }

  /**
   * CPF ou CNPJ do autor do evento.    *Utilize o valor sem máscara*.
   * @return cpfCnpj
   */
  @javax.annotation.Nonnull
  public String getCpfCnpj() {
    return cpfCnpj;
  }

  public void setCpfCnpj(@javax.annotation.Nonnull String cpfCnpj) {
    this.cpfCnpj = cpfCnpj;
  }


  public DistribuicaoNfePedidoManifestacao ambiente(@javax.annotation.Nonnull AmbienteEnum ambiente) {
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


  public DistribuicaoNfePedidoManifestacao chaveAcesso(@javax.annotation.Nonnull String chaveAcesso) {
    this.chaveAcesso = chaveAcesso;
    return this;
  }

  /**
   * Chave de Acesso da NF-e.
   * @return chaveAcesso
   */
  @javax.annotation.Nonnull
  public String getChaveAcesso() {
    return chaveAcesso;
  }

  public void setChaveAcesso(@javax.annotation.Nonnull String chaveAcesso) {
    this.chaveAcesso = chaveAcesso;
  }


  public DistribuicaoNfePedidoManifestacao tipoEvento(@javax.annotation.Nonnull String tipoEvento) {
    this.tipoEvento = tipoEvento;
    return this;
  }

  /**
   * Tipo do evento de manifestação do destinatário.    Valores disponíveis:  * &#x60;210200&#x60; - Confirmação da operação;  * &#x60;210210&#x60; - Ciência da operação;  * &#x60;210220&#x60; - Desconhecimento da operação;  * &#x60;210240&#x60; - Operação não realizada.
   * @return tipoEvento
   */
  @javax.annotation.Nonnull
  public String getTipoEvento() {
    return tipoEvento;
  }

  public void setTipoEvento(@javax.annotation.Nonnull String tipoEvento) {
    this.tipoEvento = tipoEvento;
  }


  public DistribuicaoNfePedidoManifestacao justificativa(@javax.annotation.Nullable String justificativa) {
    this.justificativa = justificativa;
    return this;
  }

  /**
   * Justificativa para o desconhecimento ou não-realização da operação.    **Nota**: Campo obrigatório para o evento &#x60;210240&#x60; (operação não realizada).
   * @return justificativa
   */
  @javax.annotation.Nullable
  public String getJustificativa() {
    return justificativa;
  }

  public void setJustificativa(@javax.annotation.Nullable String justificativa) {
    this.justificativa = justificativa;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistribuicaoNfePedidoManifestacao distribuicaoNfePedidoManifestacao = (DistribuicaoNfePedidoManifestacao) o;
    return Objects.equals(this.cpfCnpj, distribuicaoNfePedidoManifestacao.cpfCnpj) &&
        Objects.equals(this.ambiente, distribuicaoNfePedidoManifestacao.ambiente) &&
        Objects.equals(this.chaveAcesso, distribuicaoNfePedidoManifestacao.chaveAcesso) &&
        Objects.equals(this.tipoEvento, distribuicaoNfePedidoManifestacao.tipoEvento) &&
        Objects.equals(this.justificativa, distribuicaoNfePedidoManifestacao.justificativa);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpfCnpj, ambiente, chaveAcesso, tipoEvento, justificativa);
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
    sb.append("class DistribuicaoNfePedidoManifestacao {\n");
    sb.append("    cpfCnpj: ").append(toIndentedString(cpfCnpj)).append("\n");
    sb.append("    ambiente: ").append(toIndentedString(ambiente)).append("\n");
    sb.append("    chaveAcesso: ").append(toIndentedString(chaveAcesso)).append("\n");
    sb.append("    tipoEvento: ").append(toIndentedString(tipoEvento)).append("\n");
    sb.append("    justificativa: ").append(toIndentedString(justificativa)).append("\n");
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
    openapiFields.add("ambiente");
    openapiFields.add("chave_acesso");
    openapiFields.add("tipo_evento");
    openapiFields.add("justificativa");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cpf_cnpj");
    openapiRequiredFields.add("ambiente");
    openapiRequiredFields.add("chave_acesso");
    openapiRequiredFields.add("tipo_evento");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DistribuicaoNfePedidoManifestacao
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DistribuicaoNfePedidoManifestacao.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DistribuicaoNfePedidoManifestacao is not found in the empty JSON string", DistribuicaoNfePedidoManifestacao.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DistribuicaoNfePedidoManifestacao.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DistribuicaoNfePedidoManifestacao` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DistribuicaoNfePedidoManifestacao.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("cpf_cnpj").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cpf_cnpj` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cpf_cnpj").toString()));
      }
      if (!jsonObj.get("ambiente").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ambiente` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ambiente").toString()));
      }
      // validate the required field `ambiente`
      AmbienteEnum.validateJsonElement(jsonObj.get("ambiente"));
      if (!jsonObj.get("chave_acesso").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chave_acesso` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chave_acesso").toString()));
      }
      if (!jsonObj.get("tipo_evento").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tipo_evento` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tipo_evento").toString()));
      }
      if ((jsonObj.get("justificativa") != null && !jsonObj.get("justificativa").isJsonNull()) && !jsonObj.get("justificativa").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `justificativa` to be a primitive type in the JSON string but got `%s`", jsonObj.get("justificativa").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DistribuicaoNfePedidoManifestacao.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DistribuicaoNfePedidoManifestacao' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DistribuicaoNfePedidoManifestacao> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DistribuicaoNfePedidoManifestacao.class));

       return (TypeAdapter<T>) new TypeAdapter<DistribuicaoNfePedidoManifestacao>() {
           @Override
           public void write(JsonWriter out, DistribuicaoNfePedidoManifestacao value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DistribuicaoNfePedidoManifestacao read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DistribuicaoNfePedidoManifestacao given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DistribuicaoNfePedidoManifestacao
   * @throws IOException if the JSON string is invalid with respect to DistribuicaoNfePedidoManifestacao
   */
  public static DistribuicaoNfePedidoManifestacao fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DistribuicaoNfePedidoManifestacao.class);
  }

  /**
   * Convert an instance of DistribuicaoNfePedidoManifestacao to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
