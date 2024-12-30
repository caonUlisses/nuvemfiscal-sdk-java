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
import io.github.com.caonulisses.nuvemfiscalsdk.model.MdfeNaoEncerrado;
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
 * MdfeNaoEncerrados
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class MdfeNaoEncerrados {
  public static final String SERIALIZED_NAME_TP_AMB = "tpAmb";
  @SerializedName(SERIALIZED_NAME_TP_AMB)
  @javax.annotation.Nullable
  private Integer tpAmb;

  public static final String SERIALIZED_NAME_VER_APLIC = "verAplic";
  @SerializedName(SERIALIZED_NAME_VER_APLIC)
  @javax.annotation.Nullable
  private String verAplic;

  public static final String SERIALIZED_NAME_C_STAT = "cStat";
  @SerializedName(SERIALIZED_NAME_C_STAT)
  @javax.annotation.Nullable
  private Integer cStat;

  public static final String SERIALIZED_NAME_X_MOTIVO = "xMotivo";
  @SerializedName(SERIALIZED_NAME_X_MOTIVO)
  @javax.annotation.Nullable
  private String xMotivo;

  public static final String SERIALIZED_NAME_C_U_F = "cUF";
  @SerializedName(SERIALIZED_NAME_C_U_F)
  @javax.annotation.Nullable
  private Integer cUF;

  public static final String SERIALIZED_NAME_INF_M_D_FE = "infMDFe";
  @SerializedName(SERIALIZED_NAME_INF_M_D_FE)
  @javax.annotation.Nullable
  private List<MdfeNaoEncerrado> infMDFe = new ArrayList<>();

  public MdfeNaoEncerrados() {
  }

  public MdfeNaoEncerrados tpAmb(@javax.annotation.Nullable Integer tpAmb) {
    this.tpAmb = tpAmb;
    return this;
  }

  /**
   * Identificação do Ambiente:  * 1 - Produção  * 2 - Homologação
   * @return tpAmb
   */
  @javax.annotation.Nullable
  public Integer getTpAmb() {
    return tpAmb;
  }

  public void setTpAmb(@javax.annotation.Nullable Integer tpAmb) {
    this.tpAmb = tpAmb;
  }


  public MdfeNaoEncerrados verAplic(@javax.annotation.Nullable String verAplic) {
    this.verAplic = verAplic;
    return this;
  }

  /**
   * Versão do Aplicativo que processou o MDF-e.
   * @return verAplic
   */
  @javax.annotation.Nullable
  public String getVerAplic() {
    return verAplic;
  }

  public void setVerAplic(@javax.annotation.Nullable String verAplic) {
    this.verAplic = verAplic;
  }


  public MdfeNaoEncerrados cStat(@javax.annotation.Nullable Integer cStat) {
    this.cStat = cStat;
    return this;
  }

  /**
   * Código do status da mensagem enviada.
   * @return cStat
   */
  @javax.annotation.Nullable
  public Integer getcStat() {
    return cStat;
  }

  public void setcStat(@javax.annotation.Nullable Integer cStat) {
    this.cStat = cStat;
  }


  public MdfeNaoEncerrados xMotivo(@javax.annotation.Nullable String xMotivo) {
    this.xMotivo = xMotivo;
    return this;
  }

  /**
   * Descrição literal do status do serviço solicitado.
   * @return xMotivo
   */
  @javax.annotation.Nullable
  public String getxMotivo() {
    return xMotivo;
  }

  public void setxMotivo(@javax.annotation.Nullable String xMotivo) {
    this.xMotivo = xMotivo;
  }


  public MdfeNaoEncerrados cUF(@javax.annotation.Nullable Integer cUF) {
    this.cUF = cUF;
    return this;
  }

  /**
   * código da UF de atendimento.
   * @return cUF
   */
  @javax.annotation.Nullable
  public Integer getcUF() {
    return cUF;
  }

  public void setcUF(@javax.annotation.Nullable Integer cUF) {
    this.cUF = cUF;
  }


  public MdfeNaoEncerrados infMDFe(@javax.annotation.Nullable List<MdfeNaoEncerrado> infMDFe) {
    this.infMDFe = infMDFe;
    return this;
  }

  public MdfeNaoEncerrados addInfMDFeItem(MdfeNaoEncerrado infMDFeItem) {
    if (this.infMDFe == null) {
      this.infMDFe = new ArrayList<>();
    }
    this.infMDFe.add(infMDFeItem);
    return this;
  }

  /**
   * Get infMDFe
   * @return infMDFe
   */
  @javax.annotation.Nullable
  public List<MdfeNaoEncerrado> getInfMDFe() {
    return infMDFe;
  }

  public void setInfMDFe(@javax.annotation.Nullable List<MdfeNaoEncerrado> infMDFe) {
    this.infMDFe = infMDFe;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MdfeNaoEncerrados mdfeNaoEncerrados = (MdfeNaoEncerrados) o;
    return Objects.equals(this.tpAmb, mdfeNaoEncerrados.tpAmb) &&
        Objects.equals(this.verAplic, mdfeNaoEncerrados.verAplic) &&
        Objects.equals(this.cStat, mdfeNaoEncerrados.cStat) &&
        Objects.equals(this.xMotivo, mdfeNaoEncerrados.xMotivo) &&
        Objects.equals(this.cUF, mdfeNaoEncerrados.cUF) &&
        Objects.equals(this.infMDFe, mdfeNaoEncerrados.infMDFe);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tpAmb, verAplic, cStat, xMotivo, cUF, infMDFe);
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
    sb.append("class MdfeNaoEncerrados {\n");
    sb.append("    tpAmb: ").append(toIndentedString(tpAmb)).append("\n");
    sb.append("    verAplic: ").append(toIndentedString(verAplic)).append("\n");
    sb.append("    cStat: ").append(toIndentedString(cStat)).append("\n");
    sb.append("    xMotivo: ").append(toIndentedString(xMotivo)).append("\n");
    sb.append("    cUF: ").append(toIndentedString(cUF)).append("\n");
    sb.append("    infMDFe: ").append(toIndentedString(infMDFe)).append("\n");
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
    openapiFields.add("tpAmb");
    openapiFields.add("verAplic");
    openapiFields.add("cStat");
    openapiFields.add("xMotivo");
    openapiFields.add("cUF");
    openapiFields.add("infMDFe");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cStat");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MdfeNaoEncerrados
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MdfeNaoEncerrados.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MdfeNaoEncerrados is not found in the empty JSON string", MdfeNaoEncerrados.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MdfeNaoEncerrados.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MdfeNaoEncerrados` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MdfeNaoEncerrados.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("verAplic") != null && !jsonObj.get("verAplic").isJsonNull()) && !jsonObj.get("verAplic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verAplic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verAplic").toString()));
      }
      if ((jsonObj.get("xMotivo") != null && !jsonObj.get("xMotivo").isJsonNull()) && !jsonObj.get("xMotivo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xMotivo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xMotivo").toString()));
      }
      if (jsonObj.get("infMDFe") != null && !jsonObj.get("infMDFe").isJsonNull()) {
        JsonArray jsonArrayinfMDFe = jsonObj.getAsJsonArray("infMDFe");
        if (jsonArrayinfMDFe != null) {
          // ensure the json data is an array
          if (!jsonObj.get("infMDFe").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `infMDFe` to be an array in the JSON string but got `%s`", jsonObj.get("infMDFe").toString()));
          }

          // validate the optional field `infMDFe` (array)
          for (int i = 0; i < jsonArrayinfMDFe.size(); i++) {
            MdfeNaoEncerrado.validateJsonElement(jsonArrayinfMDFe.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MdfeNaoEncerrados.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MdfeNaoEncerrados' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MdfeNaoEncerrados> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MdfeNaoEncerrados.class));

       return (TypeAdapter<T>) new TypeAdapter<MdfeNaoEncerrados>() {
           @Override
           public void write(JsonWriter out, MdfeNaoEncerrados value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MdfeNaoEncerrados read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MdfeNaoEncerrados given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MdfeNaoEncerrados
   * @throws IOException if the JSON string is invalid with respect to MdfeNaoEncerrados
   */
  public static MdfeNaoEncerrados fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MdfeNaoEncerrados.class);
  }

  /**
   * Convert an instance of MdfeNaoEncerrados to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
