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
 * Grupo de informações relativas aos regimes de tributação do prestador de serviços.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class EmpresaConfigNfseRegTrib {
  public static final String SERIALIZED_NAME_OP_SIMP_NAC = "opSimpNac";
  @SerializedName(SERIALIZED_NAME_OP_SIMP_NAC)
  @javax.annotation.Nullable
  private Integer opSimpNac;

  public static final String SERIALIZED_NAME_REG_AP_TRIB_S_N = "regApTribSN";
  @SerializedName(SERIALIZED_NAME_REG_AP_TRIB_S_N)
  @javax.annotation.Nullable
  private Integer regApTribSN;

  public static final String SERIALIZED_NAME_REG_ESP_TRIB = "regEspTrib";
  @SerializedName(SERIALIZED_NAME_REG_ESP_TRIB)
  @javax.annotation.Nullable
  private Integer regEspTrib;

  public EmpresaConfigNfseRegTrib() {
  }

  public EmpresaConfigNfseRegTrib opSimpNac(@javax.annotation.Nullable Integer opSimpNac) {
    this.opSimpNac = opSimpNac;
    return this;
  }

  /**
   * Situação perante o Simples Nacional:  * 1 - Não Optante;  * 2 - Optante - Microempreendedor Individual (MEI);  * 3 - Optante - Microempresa ou Empresa de Pequeno Porte (ME/EPP).
   * @return opSimpNac
   */
  @javax.annotation.Nullable
  public Integer getOpSimpNac() {
    return opSimpNac;
  }

  public void setOpSimpNac(@javax.annotation.Nullable Integer opSimpNac) {
    this.opSimpNac = opSimpNac;
  }


  public EmpresaConfigNfseRegTrib regApTribSN(@javax.annotation.Nullable Integer regApTribSN) {
    this.regApTribSN = regApTribSN;
    return this;
  }

  /**
   * Opção para que o contribuinte optante pelo Simples Nacional ME/EPP (opSimpNac &#x3D; 3) possa indicar, ao emitir o documento fiscal, em qual regime de apuração os tributos federais e municipal estão inseridos, caso tenha ultrapassado algum sublimite ou limite definido para o Simples Nacional.  * 1 – Regime de apuração dos tributos federais e municipal pelo SN;  * 2 – Regime de apuração dos tributos federais pelo SN e ISSQN  por fora do SN conforme respectiva legislação municipal do tributo;  * 3 – Regime de apuração dos tributos federais e municipal por fora do SN conforme respectivas legilações federal e municipal de cada tributo.
   * @return regApTribSN
   */
  @javax.annotation.Nullable
  public Integer getRegApTribSN() {
    return regApTribSN;
  }

  public void setRegApTribSN(@javax.annotation.Nullable Integer regApTribSN) {
    this.regApTribSN = regApTribSN;
  }


  public EmpresaConfigNfseRegTrib regEspTrib(@javax.annotation.Nullable Integer regEspTrib) {
    this.regEspTrib = regEspTrib;
    return this;
  }

  /**
   * Tipos de Regimes Especiais de Tributação:  * 0 - Nenhum;  * 1 - Ato Cooperado (Cooperativa);  * 2 - Estimativa;  * 3 - Microempresa Municipal;  * 4 - Notário ou Registrador;  * 5 - Profissional Autônomo;  * 6 - Sociedade de Profissionais.
   * @return regEspTrib
   */
  @javax.annotation.Nullable
  public Integer getRegEspTrib() {
    return regEspTrib;
  }

  public void setRegEspTrib(@javax.annotation.Nullable Integer regEspTrib) {
    this.regEspTrib = regEspTrib;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmpresaConfigNfseRegTrib empresaConfigNfseRegTrib = (EmpresaConfigNfseRegTrib) o;
    return Objects.equals(this.opSimpNac, empresaConfigNfseRegTrib.opSimpNac) &&
        Objects.equals(this.regApTribSN, empresaConfigNfseRegTrib.regApTribSN) &&
        Objects.equals(this.regEspTrib, empresaConfigNfseRegTrib.regEspTrib);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(opSimpNac, regApTribSN, regEspTrib);
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
    sb.append("class EmpresaConfigNfseRegTrib {\n");
    sb.append("    opSimpNac: ").append(toIndentedString(opSimpNac)).append("\n");
    sb.append("    regApTribSN: ").append(toIndentedString(regApTribSN)).append("\n");
    sb.append("    regEspTrib: ").append(toIndentedString(regEspTrib)).append("\n");
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
    openapiFields.add("opSimpNac");
    openapiFields.add("regApTribSN");
    openapiFields.add("regEspTrib");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EmpresaConfigNfseRegTrib
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EmpresaConfigNfseRegTrib.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmpresaConfigNfseRegTrib is not found in the empty JSON string", EmpresaConfigNfseRegTrib.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EmpresaConfigNfseRegTrib.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmpresaConfigNfseRegTrib` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmpresaConfigNfseRegTrib.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmpresaConfigNfseRegTrib' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmpresaConfigNfseRegTrib> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmpresaConfigNfseRegTrib.class));

       return (TypeAdapter<T>) new TypeAdapter<EmpresaConfigNfseRegTrib>() {
           @Override
           public void write(JsonWriter out, EmpresaConfigNfseRegTrib value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmpresaConfigNfseRegTrib read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EmpresaConfigNfseRegTrib given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EmpresaConfigNfseRegTrib
   * @throws IOException if the JSON string is invalid with respect to EmpresaConfigNfseRegTrib
   */
  public static EmpresaConfigNfseRegTrib fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmpresaConfigNfseRegTrib.class);
  }

  /**
   * Convert an instance of EmpresaConfigNfseRegTrib to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
