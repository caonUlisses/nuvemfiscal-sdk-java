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
import io.github.com.caonulisses.nuvemfiscalsdk.model.MdfeSefazInfCTe;
import io.github.com.caonulisses.nuvemfiscalsdk.model.MdfeSefazInfMDFeTransp;
import io.github.com.caonulisses.nuvemfiscalsdk.model.MdfeSefazInfNFe;

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
 * Informações dos Municípios de descarregamento.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class MdfeSefazInfMunDescarga {
  public static final String SERIALIZED_NAME_C_MUN_DESCARGA = "cMunDescarga";
  @SerializedName(SERIALIZED_NAME_C_MUN_DESCARGA)
  @javax.annotation.Nullable
  private String cMunDescarga;

  public static final String SERIALIZED_NAME_X_MUN_DESCARGA = "xMunDescarga";
  @SerializedName(SERIALIZED_NAME_X_MUN_DESCARGA)
  @javax.annotation.Nullable
  private String xMunDescarga;

  public static final String SERIALIZED_NAME_INF_C_TE = "infCTe";
  @SerializedName(SERIALIZED_NAME_INF_C_TE)
  @javax.annotation.Nullable
  private List<MdfeSefazInfCTe> infCTe = new ArrayList<>();

  public static final String SERIALIZED_NAME_INF_N_FE = "infNFe";
  @SerializedName(SERIALIZED_NAME_INF_N_FE)
  @javax.annotation.Nullable
  private List<MdfeSefazInfNFe> infNFe = new ArrayList<>();

  public static final String SERIALIZED_NAME_INF_M_D_FE_TRANSP = "infMDFeTransp";
  @SerializedName(SERIALIZED_NAME_INF_M_D_FE_TRANSP)
  @javax.annotation.Nullable
  private List<MdfeSefazInfMDFeTransp> infMDFeTransp = new ArrayList<>();

  public MdfeSefazInfMunDescarga() {
  }

  public MdfeSefazInfMunDescarga cMunDescarga(@javax.annotation.Nullable String cMunDescarga) {
    this.cMunDescarga = cMunDescarga;
    return this;
  }

  /**
   * Código do Município de Descarregamento.
   * @return cMunDescarga
   */
  @javax.annotation.Nullable
  public String getcMunDescarga() {
    return cMunDescarga;
  }

  public void setcMunDescarga(@javax.annotation.Nullable String cMunDescarga) {
    this.cMunDescarga = cMunDescarga;
  }


  public MdfeSefazInfMunDescarga xMunDescarga(@javax.annotation.Nullable String xMunDescarga) {
    this.xMunDescarga = xMunDescarga;
    return this;
  }

  /**
   * Nome do Município de Descarregamento.
   * @return xMunDescarga
   */
  @javax.annotation.Nullable
  public String getxMunDescarga() {
    return xMunDescarga;
  }

  public void setxMunDescarga(@javax.annotation.Nullable String xMunDescarga) {
    this.xMunDescarga = xMunDescarga;
  }


  public MdfeSefazInfMunDescarga infCTe(@javax.annotation.Nullable List<MdfeSefazInfCTe> infCTe) {
    this.infCTe = infCTe;
    return this;
  }

  public MdfeSefazInfMunDescarga addInfCTeItem(MdfeSefazInfCTe infCTeItem) {
    if (this.infCTe == null) {
      this.infCTe = new ArrayList<>();
    }
    this.infCTe.add(infCTeItem);
    return this;
  }

  /**
   * Get infCTe
   * @return infCTe
   */
  @javax.annotation.Nullable
  public List<MdfeSefazInfCTe> getInfCTe() {
    return infCTe;
  }

  public void setInfCTe(@javax.annotation.Nullable List<MdfeSefazInfCTe> infCTe) {
    this.infCTe = infCTe;
  }


  public MdfeSefazInfMunDescarga infNFe(@javax.annotation.Nullable List<MdfeSefazInfNFe> infNFe) {
    this.infNFe = infNFe;
    return this;
  }

  public MdfeSefazInfMunDescarga addInfNFeItem(MdfeSefazInfNFe infNFeItem) {
    if (this.infNFe == null) {
      this.infNFe = new ArrayList<>();
    }
    this.infNFe.add(infNFeItem);
    return this;
  }

  /**
   * Get infNFe
   * @return infNFe
   */
  @javax.annotation.Nullable
  public List<MdfeSefazInfNFe> getInfNFe() {
    return infNFe;
  }

  public void setInfNFe(@javax.annotation.Nullable List<MdfeSefazInfNFe> infNFe) {
    this.infNFe = infNFe;
  }


  public MdfeSefazInfMunDescarga infMDFeTransp(@javax.annotation.Nullable List<MdfeSefazInfMDFeTransp> infMDFeTransp) {
    this.infMDFeTransp = infMDFeTransp;
    return this;
  }

  public MdfeSefazInfMunDescarga addInfMDFeTranspItem(MdfeSefazInfMDFeTransp infMDFeTranspItem) {
    if (this.infMDFeTransp == null) {
      this.infMDFeTransp = new ArrayList<>();
    }
    this.infMDFeTransp.add(infMDFeTranspItem);
    return this;
  }

  /**
   * Get infMDFeTransp
   * @return infMDFeTransp
   */
  @javax.annotation.Nullable
  public List<MdfeSefazInfMDFeTransp> getInfMDFeTransp() {
    return infMDFeTransp;
  }

  public void setInfMDFeTransp(@javax.annotation.Nullable List<MdfeSefazInfMDFeTransp> infMDFeTransp) {
    this.infMDFeTransp = infMDFeTransp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MdfeSefazInfMunDescarga mdfeSefazInfMunDescarga = (MdfeSefazInfMunDescarga) o;
    return Objects.equals(this.cMunDescarga, mdfeSefazInfMunDescarga.cMunDescarga) &&
        Objects.equals(this.xMunDescarga, mdfeSefazInfMunDescarga.xMunDescarga) &&
        Objects.equals(this.infCTe, mdfeSefazInfMunDescarga.infCTe) &&
        Objects.equals(this.infNFe, mdfeSefazInfMunDescarga.infNFe) &&
        Objects.equals(this.infMDFeTransp, mdfeSefazInfMunDescarga.infMDFeTransp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cMunDescarga, xMunDescarga, infCTe, infNFe, infMDFeTransp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MdfeSefazInfMunDescarga {\n");
    sb.append("    cMunDescarga: ").append(toIndentedString(cMunDescarga)).append("\n");
    sb.append("    xMunDescarga: ").append(toIndentedString(xMunDescarga)).append("\n");
    sb.append("    infCTe: ").append(toIndentedString(infCTe)).append("\n");
    sb.append("    infNFe: ").append(toIndentedString(infNFe)).append("\n");
    sb.append("    infMDFeTransp: ").append(toIndentedString(infMDFeTransp)).append("\n");
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
    openapiFields.add("cMunDescarga");
    openapiFields.add("xMunDescarga");
    openapiFields.add("infCTe");
    openapiFields.add("infNFe");
    openapiFields.add("infMDFeTransp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cMunDescarga");
    openapiRequiredFields.add("xMunDescarga");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MdfeSefazInfMunDescarga
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MdfeSefazInfMunDescarga.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MdfeSefazInfMunDescarga is not found in the empty JSON string", MdfeSefazInfMunDescarga.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MdfeSefazInfMunDescarga.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MdfeSefazInfMunDescarga` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MdfeSefazInfMunDescarga.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cMunDescarga") != null && !jsonObj.get("cMunDescarga").isJsonNull()) && !jsonObj.get("cMunDescarga").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cMunDescarga` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cMunDescarga").toString()));
      }
      if ((jsonObj.get("xMunDescarga") != null && !jsonObj.get("xMunDescarga").isJsonNull()) && !jsonObj.get("xMunDescarga").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xMunDescarga` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xMunDescarga").toString()));
      }
      if (jsonObj.get("infCTe") != null && !jsonObj.get("infCTe").isJsonNull()) {
        JsonArray jsonArrayinfCTe = jsonObj.getAsJsonArray("infCTe");
        if (jsonArrayinfCTe != null) {
          // ensure the json data is an array
          if (!jsonObj.get("infCTe").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `infCTe` to be an array in the JSON string but got `%s`", jsonObj.get("infCTe").toString()));
          }

          // validate the optional field `infCTe` (array)
          for (int i = 0; i < jsonArrayinfCTe.size(); i++) {
            MdfeSefazInfCTe.validateJsonElement(jsonArrayinfCTe.get(i));
          };
        }
      }
      if (jsonObj.get("infNFe") != null && !jsonObj.get("infNFe").isJsonNull()) {
        JsonArray jsonArrayinfNFe = jsonObj.getAsJsonArray("infNFe");
        if (jsonArrayinfNFe != null) {
          // ensure the json data is an array
          if (!jsonObj.get("infNFe").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `infNFe` to be an array in the JSON string but got `%s`", jsonObj.get("infNFe").toString()));
          }

          // validate the optional field `infNFe` (array)
          for (int i = 0; i < jsonArrayinfNFe.size(); i++) {
            MdfeSefazInfNFe.validateJsonElement(jsonArrayinfNFe.get(i));
          };
        }
      }
      if (jsonObj.get("infMDFeTransp") != null && !jsonObj.get("infMDFeTransp").isJsonNull()) {
        JsonArray jsonArrayinfMDFeTransp = jsonObj.getAsJsonArray("infMDFeTransp");
        if (jsonArrayinfMDFeTransp != null) {
          // ensure the json data is an array
          if (!jsonObj.get("infMDFeTransp").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `infMDFeTransp` to be an array in the JSON string but got `%s`", jsonObj.get("infMDFeTransp").toString()));
          }

          // validate the optional field `infMDFeTransp` (array)
          for (int i = 0; i < jsonArrayinfMDFeTransp.size(); i++) {
            MdfeSefazInfMDFeTransp.validateJsonElement(jsonArrayinfMDFeTransp.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MdfeSefazInfMunDescarga.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MdfeSefazInfMunDescarga' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MdfeSefazInfMunDescarga> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MdfeSefazInfMunDescarga.class));

       return (TypeAdapter<T>) new TypeAdapter<MdfeSefazInfMunDescarga>() {
           @Override
           public void write(JsonWriter out, MdfeSefazInfMunDescarga value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MdfeSefazInfMunDescarga read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MdfeSefazInfMunDescarga given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MdfeSefazInfMunDescarga
   * @throws IOException if the JSON string is invalid with respect to MdfeSefazInfMunDescarga
   */
  public static MdfeSefazInfMunDescarga fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MdfeSefazInfMunDescarga.class);
  }

  /**
   * Convert an instance of MdfeSefazInfMunDescarga to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

