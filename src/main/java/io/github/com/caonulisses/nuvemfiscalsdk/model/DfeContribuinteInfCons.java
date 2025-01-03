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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.github.com.caonulisses.nuvemfiscalsdk.model.DfeContribuinteInfCad;
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
 * Dados do Resultado do Dados do Pedido de Consulta de cadastro de contribuintes.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class DfeContribuinteInfCons {
  public static final String SERIALIZED_NAME_CODIGO_STATUS = "codigo_status";
  @SerializedName(SERIALIZED_NAME_CODIGO_STATUS)
  @javax.annotation.Nullable
  private Integer codigoStatus;

  public static final String SERIALIZED_NAME_MOTIVO_STATUS = "motivo_status";
  @SerializedName(SERIALIZED_NAME_MOTIVO_STATUS)
  @javax.annotation.Nullable
  private String motivoStatus;

  public static final String SERIALIZED_NAME_UF = "uf";
  @SerializedName(SERIALIZED_NAME_UF)
  @javax.annotation.Nullable
  private String uf;

  public static final String SERIALIZED_NAME_IE = "ie";
  @SerializedName(SERIALIZED_NAME_IE)
  @javax.annotation.Nullable
  private String ie;

  public static final String SERIALIZED_NAME_CNPJ = "cnpj";
  @SerializedName(SERIALIZED_NAME_CNPJ)
  @javax.annotation.Nullable
  private String cnpj;

  public static final String SERIALIZED_NAME_CPF = "cpf";
  @SerializedName(SERIALIZED_NAME_CPF)
  @javax.annotation.Nullable
  private String cpf;

  public static final String SERIALIZED_NAME_DATA_CONSULTA = "data_consulta";
  @SerializedName(SERIALIZED_NAME_DATA_CONSULTA)
  @javax.annotation.Nullable
  private OffsetDateTime dataConsulta;

  public static final String SERIALIZED_NAME_UF_ATENDIMENTO = "uf_atendimento";
  @SerializedName(SERIALIZED_NAME_UF_ATENDIMENTO)
  @javax.annotation.Nullable
  private Integer ufAtendimento;

  public static final String SERIALIZED_NAME_INFORMACOES_CADASTRAIS = "informacoes_cadastrais";
  @SerializedName(SERIALIZED_NAME_INFORMACOES_CADASTRAIS)
  @javax.annotation.Nullable
  private List<DfeContribuinteInfCad> informacoesCadastrais = new ArrayList<>();

  public DfeContribuinteInfCons() {
  }

  public DfeContribuinteInfCons codigoStatus(@javax.annotation.Nullable Integer codigoStatus) {
    this.codigoStatus = codigoStatus;
    return this;
  }

  /**
   * Código do status da mensagem enviada.
   * minimum: 0
   * maximum: 999
   * @return codigoStatus
   */
  @javax.annotation.Nullable
  public Integer getCodigoStatus() {
    return codigoStatus;
  }

  public void setCodigoStatus(@javax.annotation.Nullable Integer codigoStatus) {
    this.codigoStatus = codigoStatus;
  }


  public DfeContribuinteInfCons motivoStatus(@javax.annotation.Nullable String motivoStatus) {
    this.motivoStatus = motivoStatus;
    return this;
  }

  /**
   * Descrição literal do status do serviço solicitado.
   * @return motivoStatus
   */
  @javax.annotation.Nullable
  public String getMotivoStatus() {
    return motivoStatus;
  }

  public void setMotivoStatus(@javax.annotation.Nullable String motivoStatus) {
    this.motivoStatus = motivoStatus;
  }


  public DfeContribuinteInfCons uf(@javax.annotation.Nullable String uf) {
    this.uf = uf;
    return this;
  }

  /**
   * sigla da UF consultada, utilizar SU para SUFRAMA.
   * @return uf
   */
  @javax.annotation.Nullable
  public String getUf() {
    return uf;
  }

  public void setUf(@javax.annotation.Nullable String uf) {
    this.uf = uf;
  }


  public DfeContribuinteInfCons ie(@javax.annotation.Nullable String ie) {
    this.ie = ie;
    return this;
  }

  /**
   * Inscrição Estadual do contribuinte.
   * @return ie
   */
  @javax.annotation.Nullable
  public String getIe() {
    return ie;
  }

  public void setIe(@javax.annotation.Nullable String ie) {
    this.ie = ie;
  }


  public DfeContribuinteInfCons cnpj(@javax.annotation.Nullable String cnpj) {
    this.cnpj = cnpj;
    return this;
  }

  /**
   * CNPJ do contribuinte.
   * @return cnpj
   */
  @javax.annotation.Nullable
  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(@javax.annotation.Nullable String cnpj) {
    this.cnpj = cnpj;
  }


  public DfeContribuinteInfCons cpf(@javax.annotation.Nullable String cpf) {
    this.cpf = cpf;
    return this;
  }

  /**
   * CPF do contribuinte.
   * @return cpf
   */
  @javax.annotation.Nullable
  public String getCpf() {
    return cpf;
  }

  public void setCpf(@javax.annotation.Nullable String cpf) {
    this.cpf = cpf;
  }


  public DfeContribuinteInfCons dataConsulta(@javax.annotation.Nullable OffsetDateTime dataConsulta) {
    this.dataConsulta = dataConsulta;
    return this;
  }

  /**
   * Data da Consulta.
   * @return dataConsulta
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDataConsulta() {
    return dataConsulta;
  }

  public void setDataConsulta(@javax.annotation.Nullable OffsetDateTime dataConsulta) {
    this.dataConsulta = dataConsulta;
  }


  public DfeContribuinteInfCons ufAtendimento(@javax.annotation.Nullable Integer ufAtendimento) {
    this.ufAtendimento = ufAtendimento;
    return this;
  }

  /**
   * código da UF de atendimento.
   * @return ufAtendimento
   */
  @javax.annotation.Nullable
  public Integer getUfAtendimento() {
    return ufAtendimento;
  }

  public void setUfAtendimento(@javax.annotation.Nullable Integer ufAtendimento) {
    this.ufAtendimento = ufAtendimento;
  }


  public DfeContribuinteInfCons informacoesCadastrais(@javax.annotation.Nullable List<DfeContribuinteInfCad> informacoesCadastrais) {
    this.informacoesCadastrais = informacoesCadastrais;
    return this;
  }

  public DfeContribuinteInfCons addInformacoesCadastraisItem(DfeContribuinteInfCad informacoesCadastraisItem) {
    if (this.informacoesCadastrais == null) {
      this.informacoesCadastrais = new ArrayList<>();
    }
    this.informacoesCadastrais.add(informacoesCadastraisItem);
    return this;
  }

  /**
   * Get informacoesCadastrais
   * @return informacoesCadastrais
   */
  @javax.annotation.Nullable
  public List<DfeContribuinteInfCad> getInformacoesCadastrais() {
    return informacoesCadastrais;
  }

  public void setInformacoesCadastrais(@javax.annotation.Nullable List<DfeContribuinteInfCad> informacoesCadastrais) {
    this.informacoesCadastrais = informacoesCadastrais;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfeContribuinteInfCons dfeContribuinteInfCons = (DfeContribuinteInfCons) o;
    return Objects.equals(this.codigoStatus, dfeContribuinteInfCons.codigoStatus) &&
        Objects.equals(this.motivoStatus, dfeContribuinteInfCons.motivoStatus) &&
        Objects.equals(this.uf, dfeContribuinteInfCons.uf) &&
        Objects.equals(this.ie, dfeContribuinteInfCons.ie) &&
        Objects.equals(this.cnpj, dfeContribuinteInfCons.cnpj) &&
        Objects.equals(this.cpf, dfeContribuinteInfCons.cpf) &&
        Objects.equals(this.dataConsulta, dfeContribuinteInfCons.dataConsulta) &&
        Objects.equals(this.ufAtendimento, dfeContribuinteInfCons.ufAtendimento) &&
        Objects.equals(this.informacoesCadastrais, dfeContribuinteInfCons.informacoesCadastrais);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigoStatus, motivoStatus, uf, ie, cnpj, cpf, dataConsulta, ufAtendimento, informacoesCadastrais);
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
    sb.append("class DfeContribuinteInfCons {\n");
    sb.append("    codigoStatus: ").append(toIndentedString(codigoStatus)).append("\n");
    sb.append("    motivoStatus: ").append(toIndentedString(motivoStatus)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
    sb.append("    ie: ").append(toIndentedString(ie)).append("\n");
    sb.append("    cnpj: ").append(toIndentedString(cnpj)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    dataConsulta: ").append(toIndentedString(dataConsulta)).append("\n");
    sb.append("    ufAtendimento: ").append(toIndentedString(ufAtendimento)).append("\n");
    sb.append("    informacoesCadastrais: ").append(toIndentedString(informacoesCadastrais)).append("\n");
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
    openapiFields.add("codigo_status");
    openapiFields.add("motivo_status");
    openapiFields.add("uf");
    openapiFields.add("ie");
    openapiFields.add("cnpj");
    openapiFields.add("cpf");
    openapiFields.add("data_consulta");
    openapiFields.add("uf_atendimento");
    openapiFields.add("informacoes_cadastrais");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("codigo_status");
    openapiRequiredFields.add("motivo_status");
    openapiRequiredFields.add("uf");
    openapiRequiredFields.add("data_consulta");
    openapiRequiredFields.add("uf_atendimento");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DfeContribuinteInfCons
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DfeContribuinteInfCons.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DfeContribuinteInfCons is not found in the empty JSON string", DfeContribuinteInfCons.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DfeContribuinteInfCons.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DfeContribuinteInfCons` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DfeContribuinteInfCons.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("motivo_status") != null && !jsonObj.get("motivo_status").isJsonNull()) && !jsonObj.get("motivo_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `motivo_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("motivo_status").toString()));
      }
      if ((jsonObj.get("uf") != null && !jsonObj.get("uf").isJsonNull()) && !jsonObj.get("uf").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uf` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uf").toString()));
      }
      if ((jsonObj.get("ie") != null && !jsonObj.get("ie").isJsonNull()) && !jsonObj.get("ie").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ie` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ie").toString()));
      }
      if ((jsonObj.get("cnpj") != null && !jsonObj.get("cnpj").isJsonNull()) && !jsonObj.get("cnpj").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cnpj` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cnpj").toString()));
      }
      if ((jsonObj.get("cpf") != null && !jsonObj.get("cpf").isJsonNull()) && !jsonObj.get("cpf").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cpf` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cpf").toString()));
      }
      if (jsonObj.get("informacoes_cadastrais") != null && !jsonObj.get("informacoes_cadastrais").isJsonNull()) {
        JsonArray jsonArrayinformacoesCadastrais = jsonObj.getAsJsonArray("informacoes_cadastrais");
        if (jsonArrayinformacoesCadastrais != null) {
          // ensure the json data is an array
          if (!jsonObj.get("informacoes_cadastrais").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `informacoes_cadastrais` to be an array in the JSON string but got `%s`", jsonObj.get("informacoes_cadastrais").toString()));
          }

          // validate the optional field `informacoes_cadastrais` (array)
          for (int i = 0; i < jsonArrayinformacoesCadastrais.size(); i++) {
            DfeContribuinteInfCad.validateJsonElement(jsonArrayinformacoesCadastrais.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DfeContribuinteInfCons.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DfeContribuinteInfCons' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DfeContribuinteInfCons> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DfeContribuinteInfCons.class));

       return (TypeAdapter<T>) new TypeAdapter<DfeContribuinteInfCons>() {
           @Override
           public void write(JsonWriter out, DfeContribuinteInfCons value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DfeContribuinteInfCons read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DfeContribuinteInfCons given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DfeContribuinteInfCons
   * @throws IOException if the JSON string is invalid with respect to DfeContribuinteInfCons
   */
  public static DfeContribuinteInfCons fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DfeContribuinteInfCons.class);
  }

  /**
   * Convert an instance of DfeContribuinteInfCons to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

