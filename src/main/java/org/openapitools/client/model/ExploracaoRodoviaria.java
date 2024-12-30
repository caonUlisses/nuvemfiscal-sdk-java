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
 * Grupo de informações relativas a pedágio.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class ExploracaoRodoviaria {
  public static final String SERIALIZED_NAME_CATEG_VEIC = "categVeic";
  @SerializedName(SERIALIZED_NAME_CATEG_VEIC)
  @javax.annotation.Nullable
  private String categVeic;

  public static final String SERIALIZED_NAME_N_EIXOS = "nEixos";
  @SerializedName(SERIALIZED_NAME_N_EIXOS)
  @javax.annotation.Nullable
  private String nEixos;

  public static final String SERIALIZED_NAME_RODAGEM = "rodagem";
  @SerializedName(SERIALIZED_NAME_RODAGEM)
  @javax.annotation.Nullable
  private Integer rodagem;

  public static final String SERIALIZED_NAME_SENTIDO = "sentido";
  @SerializedName(SERIALIZED_NAME_SENTIDO)
  @javax.annotation.Nullable
  private String sentido;

  public static final String SERIALIZED_NAME_PLACA = "placa";
  @SerializedName(SERIALIZED_NAME_PLACA)
  @javax.annotation.Nullable
  private String placa;

  public static final String SERIALIZED_NAME_COD_ACESSO_PED = "codAcessoPed";
  @SerializedName(SERIALIZED_NAME_COD_ACESSO_PED)
  @javax.annotation.Nullable
  private String codAcessoPed;

  public static final String SERIALIZED_NAME_COD_CONTRATO = "codContrato";
  @SerializedName(SERIALIZED_NAME_COD_CONTRATO)
  @javax.annotation.Nullable
  private String codContrato;

  public ExploracaoRodoviaria() {
  }

  public ExploracaoRodoviaria categVeic(@javax.annotation.Nullable String categVeic) {
    this.categVeic = categVeic;
    return this;
  }

  /**
   * Categorias de veículos para cobrança:  * 00 - Categoria de veículos (tipo não informado na nota de origem)  * 01 - Automóvel, caminhonete e furgão  * 02 - Caminhão leve, ônibus, caminhão trator e furgão  * 03 - Automóvel e caminhonete com semireboque  * 04 - Caminhão, caminhão-trator, caminhão-trator com semi-reboque e ônibus  * 05 - Automóvel e caminhonete com reboque  * 06 - Caminhão com reboque  * 07 - Caminhão trator com semi-reboque  * 08 - Motocicletas, motonetas e bicicletas motorizadas  * 09 - Veículo especial  * 10 - Veículo Isento
   * @return categVeic
   */
  @javax.annotation.Nullable
  public String getCategVeic() {
    return categVeic;
  }

  public void setCategVeic(@javax.annotation.Nullable String categVeic) {
    this.categVeic = categVeic;
  }


  public ExploracaoRodoviaria nEixos(@javax.annotation.Nullable String nEixos) {
    this.nEixos = nEixos;
    return this;
  }

  /**
   * Número de eixos para fins de cobrança.
   * @return nEixos
   */
  @javax.annotation.Nullable
  public String getnEixos() {
    return nEixos;
  }

  public void setnEixos(@javax.annotation.Nullable String nEixos) {
    this.nEixos = nEixos;
  }


  public ExploracaoRodoviaria rodagem(@javax.annotation.Nullable Integer rodagem) {
    this.rodagem = rodagem;
    return this;
  }

  /**
   * Tipo de rodagem.
   * @return rodagem
   */
  @javax.annotation.Nullable
  public Integer getRodagem() {
    return rodagem;
  }

  public void setRodagem(@javax.annotation.Nullable Integer rodagem) {
    this.rodagem = rodagem;
  }


  public ExploracaoRodoviaria sentido(@javax.annotation.Nullable String sentido) {
    this.sentido = sentido;
    return this;
  }

  /**
   * Placa do veículo.
   * @return sentido
   */
  @javax.annotation.Nullable
  public String getSentido() {
    return sentido;
  }

  public void setSentido(@javax.annotation.Nullable String sentido) {
    this.sentido = sentido;
  }


  public ExploracaoRodoviaria placa(@javax.annotation.Nullable String placa) {
    this.placa = placa;
    return this;
  }

  /**
   * Placa do veículo.
   * @return placa
   */
  @javax.annotation.Nullable
  public String getPlaca() {
    return placa;
  }

  public void setPlaca(@javax.annotation.Nullable String placa) {
    this.placa = placa;
  }


  public ExploracaoRodoviaria codAcessoPed(@javax.annotation.Nullable String codAcessoPed) {
    this.codAcessoPed = codAcessoPed;
    return this;
  }

  /**
   * Código de acesso gerado automaticamente pelo sistema emissor da concessionária.
   * @return codAcessoPed
   */
  @javax.annotation.Nullable
  public String getCodAcessoPed() {
    return codAcessoPed;
  }

  public void setCodAcessoPed(@javax.annotation.Nullable String codAcessoPed) {
    this.codAcessoPed = codAcessoPed;
  }


  public ExploracaoRodoviaria codContrato(@javax.annotation.Nullable String codContrato) {
    this.codContrato = codContrato;
    return this;
  }

  /**
   * Código de contrato gerado automaticamente pelo sistema nacional no cadastro da concessionária.
   * @return codContrato
   */
  @javax.annotation.Nullable
  public String getCodContrato() {
    return codContrato;
  }

  public void setCodContrato(@javax.annotation.Nullable String codContrato) {
    this.codContrato = codContrato;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExploracaoRodoviaria exploracaoRodoviaria = (ExploracaoRodoviaria) o;
    return Objects.equals(this.categVeic, exploracaoRodoviaria.categVeic) &&
        Objects.equals(this.nEixos, exploracaoRodoviaria.nEixos) &&
        Objects.equals(this.rodagem, exploracaoRodoviaria.rodagem) &&
        Objects.equals(this.sentido, exploracaoRodoviaria.sentido) &&
        Objects.equals(this.placa, exploracaoRodoviaria.placa) &&
        Objects.equals(this.codAcessoPed, exploracaoRodoviaria.codAcessoPed) &&
        Objects.equals(this.codContrato, exploracaoRodoviaria.codContrato);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categVeic, nEixos, rodagem, sentido, placa, codAcessoPed, codContrato);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExploracaoRodoviaria {\n");
    sb.append("    categVeic: ").append(toIndentedString(categVeic)).append("\n");
    sb.append("    nEixos: ").append(toIndentedString(nEixos)).append("\n");
    sb.append("    rodagem: ").append(toIndentedString(rodagem)).append("\n");
    sb.append("    sentido: ").append(toIndentedString(sentido)).append("\n");
    sb.append("    placa: ").append(toIndentedString(placa)).append("\n");
    sb.append("    codAcessoPed: ").append(toIndentedString(codAcessoPed)).append("\n");
    sb.append("    codContrato: ").append(toIndentedString(codContrato)).append("\n");
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
    openapiFields.add("categVeic");
    openapiFields.add("nEixos");
    openapiFields.add("rodagem");
    openapiFields.add("sentido");
    openapiFields.add("placa");
    openapiFields.add("codAcessoPed");
    openapiFields.add("codContrato");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("categVeic");
    openapiRequiredFields.add("nEixos");
    openapiRequiredFields.add("rodagem");
    openapiRequiredFields.add("sentido");
    openapiRequiredFields.add("placa");
    openapiRequiredFields.add("codAcessoPed");
    openapiRequiredFields.add("codContrato");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ExploracaoRodoviaria
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExploracaoRodoviaria.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExploracaoRodoviaria is not found in the empty JSON string", ExploracaoRodoviaria.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExploracaoRodoviaria.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExploracaoRodoviaria` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExploracaoRodoviaria.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("categVeic") != null && !jsonObj.get("categVeic").isJsonNull()) && !jsonObj.get("categVeic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `categVeic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("categVeic").toString()));
      }
      if ((jsonObj.get("nEixos") != null && !jsonObj.get("nEixos").isJsonNull()) && !jsonObj.get("nEixos").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nEixos` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nEixos").toString()));
      }
      if ((jsonObj.get("sentido") != null && !jsonObj.get("sentido").isJsonNull()) && !jsonObj.get("sentido").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sentido` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sentido").toString()));
      }
      if ((jsonObj.get("placa") != null && !jsonObj.get("placa").isJsonNull()) && !jsonObj.get("placa").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `placa` to be a primitive type in the JSON string but got `%s`", jsonObj.get("placa").toString()));
      }
      if ((jsonObj.get("codAcessoPed") != null && !jsonObj.get("codAcessoPed").isJsonNull()) && !jsonObj.get("codAcessoPed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codAcessoPed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codAcessoPed").toString()));
      }
      if ((jsonObj.get("codContrato") != null && !jsonObj.get("codContrato").isJsonNull()) && !jsonObj.get("codContrato").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codContrato` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codContrato").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExploracaoRodoviaria.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExploracaoRodoviaria' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExploracaoRodoviaria> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExploracaoRodoviaria.class));

       return (TypeAdapter<T>) new TypeAdapter<ExploracaoRodoviaria>() {
           @Override
           public void write(JsonWriter out, ExploracaoRodoviaria value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExploracaoRodoviaria read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ExploracaoRodoviaria given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ExploracaoRodoviaria
   * @throws IOException if the JSON string is invalid with respect to ExploracaoRodoviaria
   */
  public static ExploracaoRodoviaria fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExploracaoRodoviaria.class);
  }

  /**
   * Convert an instance of ExploracaoRodoviaria to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
