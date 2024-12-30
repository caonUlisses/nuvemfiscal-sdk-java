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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.CteSefazFerroEnv;
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
 * Detalhamento de informações para o tráfego mútuo.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class CteSefazTrafMut {
  public static final String SERIALIZED_NAME_RESP_FAT = "respFat";
  @SerializedName(SERIALIZED_NAME_RESP_FAT)
  @javax.annotation.Nullable
  private Integer respFat;

  public static final String SERIALIZED_NAME_FERR_EMI = "ferrEmi";
  @SerializedName(SERIALIZED_NAME_FERR_EMI)
  @javax.annotation.Nullable
  private Integer ferrEmi;

  public static final String SERIALIZED_NAME_V_FRETE = "vFrete";
  @SerializedName(SERIALIZED_NAME_V_FRETE)
  @javax.annotation.Nullable
  private BigDecimal vFrete;

  public static final String SERIALIZED_NAME_CH_C_TE_FERRO_ORIGEM = "chCTeFerroOrigem";
  @SerializedName(SERIALIZED_NAME_CH_C_TE_FERRO_ORIGEM)
  @javax.annotation.Nullable
  private String chCTeFerroOrigem;

  public static final String SERIALIZED_NAME_FERRO_ENV = "ferroEnv";
  @SerializedName(SERIALIZED_NAME_FERRO_ENV)
  @javax.annotation.Nullable
  private List<CteSefazFerroEnv> ferroEnv = new ArrayList<>();

  public CteSefazTrafMut() {
  }

  public CteSefazTrafMut respFat(@javax.annotation.Nullable Integer respFat) {
    this.respFat = respFat;
    return this;
  }

  /**
   * Responsável pelo Faturamento.  Preencher com:  * 1 - Ferrovia de origem  * 2 - Ferrovia de destino
   * @return respFat
   */
  @javax.annotation.Nullable
  public Integer getRespFat() {
    return respFat;
  }

  public void setRespFat(@javax.annotation.Nullable Integer respFat) {
    this.respFat = respFat;
  }


  public CteSefazTrafMut ferrEmi(@javax.annotation.Nullable Integer ferrEmi) {
    this.ferrEmi = ferrEmi;
    return this;
  }

  /**
   * Ferrovia Emitente do CTe.  Preencher com:  * 1 - Ferrovia de origem  * 2 - Ferrovia de destino
   * @return ferrEmi
   */
  @javax.annotation.Nullable
  public Integer getFerrEmi() {
    return ferrEmi;
  }

  public void setFerrEmi(@javax.annotation.Nullable Integer ferrEmi) {
    this.ferrEmi = ferrEmi;
  }


  public CteSefazTrafMut vFrete(@javax.annotation.Nullable BigDecimal vFrete) {
    this.vFrete = vFrete;
    return this;
  }

  /**
   * Valor do Frete do Tráfego Mútuo.
   * minimum: 0
   * @return vFrete
   */
  @javax.annotation.Nullable
  public BigDecimal getvFrete() {
    return vFrete;
  }

  public void setvFrete(@javax.annotation.Nullable BigDecimal vFrete) {
    this.vFrete = vFrete;
  }


  public CteSefazTrafMut chCTeFerroOrigem(@javax.annotation.Nullable String chCTeFerroOrigem) {
    this.chCTeFerroOrigem = chCTeFerroOrigem;
    return this;
  }

  /**
   * Chave de acesso do CT-e emitido pelo ferrovia de origem.
   * @return chCTeFerroOrigem
   */
  @javax.annotation.Nullable
  public String getChCTeFerroOrigem() {
    return chCTeFerroOrigem;
  }

  public void setChCTeFerroOrigem(@javax.annotation.Nullable String chCTeFerroOrigem) {
    this.chCTeFerroOrigem = chCTeFerroOrigem;
  }


  public CteSefazTrafMut ferroEnv(@javax.annotation.Nullable List<CteSefazFerroEnv> ferroEnv) {
    this.ferroEnv = ferroEnv;
    return this;
  }

  public CteSefazTrafMut addFerroEnvItem(CteSefazFerroEnv ferroEnvItem) {
    if (this.ferroEnv == null) {
      this.ferroEnv = new ArrayList<>();
    }
    this.ferroEnv.add(ferroEnvItem);
    return this;
  }

  /**
   * Get ferroEnv
   * @return ferroEnv
   */
  @javax.annotation.Nullable
  public List<CteSefazFerroEnv> getFerroEnv() {
    return ferroEnv;
  }

  public void setFerroEnv(@javax.annotation.Nullable List<CteSefazFerroEnv> ferroEnv) {
    this.ferroEnv = ferroEnv;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CteSefazTrafMut cteSefazTrafMut = (CteSefazTrafMut) o;
    return Objects.equals(this.respFat, cteSefazTrafMut.respFat) &&
        Objects.equals(this.ferrEmi, cteSefazTrafMut.ferrEmi) &&
        Objects.equals(this.vFrete, cteSefazTrafMut.vFrete) &&
        Objects.equals(this.chCTeFerroOrigem, cteSefazTrafMut.chCTeFerroOrigem) &&
        Objects.equals(this.ferroEnv, cteSefazTrafMut.ferroEnv);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(respFat, ferrEmi, vFrete, chCTeFerroOrigem, ferroEnv);
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
    sb.append("class CteSefazTrafMut {\n");
    sb.append("    respFat: ").append(toIndentedString(respFat)).append("\n");
    sb.append("    ferrEmi: ").append(toIndentedString(ferrEmi)).append("\n");
    sb.append("    vFrete: ").append(toIndentedString(vFrete)).append("\n");
    sb.append("    chCTeFerroOrigem: ").append(toIndentedString(chCTeFerroOrigem)).append("\n");
    sb.append("    ferroEnv: ").append(toIndentedString(ferroEnv)).append("\n");
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
    openapiFields.add("respFat");
    openapiFields.add("ferrEmi");
    openapiFields.add("vFrete");
    openapiFields.add("chCTeFerroOrigem");
    openapiFields.add("ferroEnv");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("respFat");
    openapiRequiredFields.add("ferrEmi");
    openapiRequiredFields.add("vFrete");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CteSefazTrafMut
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CteSefazTrafMut.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CteSefazTrafMut is not found in the empty JSON string", CteSefazTrafMut.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CteSefazTrafMut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CteSefazTrafMut` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CteSefazTrafMut.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("chCTeFerroOrigem") != null && !jsonObj.get("chCTeFerroOrigem").isJsonNull()) && !jsonObj.get("chCTeFerroOrigem").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chCTeFerroOrigem` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chCTeFerroOrigem").toString()));
      }
      if (jsonObj.get("ferroEnv") != null && !jsonObj.get("ferroEnv").isJsonNull()) {
        JsonArray jsonArrayferroEnv = jsonObj.getAsJsonArray("ferroEnv");
        if (jsonArrayferroEnv != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ferroEnv").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ferroEnv` to be an array in the JSON string but got `%s`", jsonObj.get("ferroEnv").toString()));
          }

          // validate the optional field `ferroEnv` (array)
          for (int i = 0; i < jsonArrayferroEnv.size(); i++) {
            CteSefazFerroEnv.validateJsonElement(jsonArrayferroEnv.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CteSefazTrafMut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CteSefazTrafMut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CteSefazTrafMut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CteSefazTrafMut.class));

       return (TypeAdapter<T>) new TypeAdapter<CteSefazTrafMut>() {
           @Override
           public void write(JsonWriter out, CteSefazTrafMut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CteSefazTrafMut read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CteSefazTrafMut given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CteSefazTrafMut
   * @throws IOException if the JSON string is invalid with respect to CteSefazTrafMut
   */
  public static CteSefazTrafMut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CteSefazTrafMut.class);
  }

  /**
   * Convert an instance of CteSefazTrafMut to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

