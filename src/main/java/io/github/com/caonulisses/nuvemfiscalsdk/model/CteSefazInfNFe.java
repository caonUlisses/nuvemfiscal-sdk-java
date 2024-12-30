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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.github.com.caonulisses.nuvemfiscalsdk.model.CteSefazUnidCarga;
import io.github.com.caonulisses.nuvemfiscalsdk.model.CteSefazUnidadeTransp;
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
 * Informações das NF-e.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class CteSefazInfNFe {
  public static final String SERIALIZED_NAME_CHAVE = "chave";
  @SerializedName(SERIALIZED_NAME_CHAVE)
  @javax.annotation.Nullable
  private String chave;

  public static final String SERIALIZED_NAME_P_I_N = "PIN";
  @SerializedName(SERIALIZED_NAME_P_I_N)
  @javax.annotation.Nullable
  private String PIN;

  public static final String SERIALIZED_NAME_D_PREV = "dPrev";
  @SerializedName(SERIALIZED_NAME_D_PREV)
  @javax.annotation.Nullable
  private LocalDate dPrev;

  public static final String SERIALIZED_NAME_INF_UNID_CARGA = "infUnidCarga";
  @SerializedName(SERIALIZED_NAME_INF_UNID_CARGA)
  @javax.annotation.Nullable
  private List<CteSefazUnidCarga> infUnidCarga = new ArrayList<>();

  public static final String SERIALIZED_NAME_INF_UNID_TRANSP = "infUnidTransp";
  @SerializedName(SERIALIZED_NAME_INF_UNID_TRANSP)
  @javax.annotation.Nullable
  private List<CteSefazUnidadeTransp> infUnidTransp = new ArrayList<>();

  public CteSefazInfNFe() {
  }

  public CteSefazInfNFe chave(@javax.annotation.Nullable String chave) {
    this.chave = chave;
    return this;
  }

  /**
   * Chave de acesso da NF-e.
   * @return chave
   */
  @javax.annotation.Nullable
  public String getChave() {
    return chave;
  }

  public void setChave(@javax.annotation.Nullable String chave) {
    this.chave = chave;
  }


  public CteSefazInfNFe PIN(@javax.annotation.Nullable String PIN) {
    this.PIN = PIN;
    return this;
  }

  /**
   * PIN SUFRAMA.  PIN atribuído pela SUFRAMA para a operação.
   * @return PIN
   */
  @javax.annotation.Nullable
  public String getPIN() {
    return PIN;
  }

  public void setPIN(@javax.annotation.Nullable String PIN) {
    this.PIN = PIN;
  }


  public CteSefazInfNFe dPrev(@javax.annotation.Nullable LocalDate dPrev) {
    this.dPrev = dPrev;
    return this;
  }

  /**
   * Data prevista de entrega.  Formato AAAA-MM-DD.
   * @return dPrev
   */
  @javax.annotation.Nullable
  public LocalDate getdPrev() {
    return dPrev;
  }

  public void setdPrev(@javax.annotation.Nullable LocalDate dPrev) {
    this.dPrev = dPrev;
  }


  public CteSefazInfNFe infUnidCarga(@javax.annotation.Nullable List<CteSefazUnidCarga> infUnidCarga) {
    this.infUnidCarga = infUnidCarga;
    return this;
  }

  public CteSefazInfNFe addInfUnidCargaItem(CteSefazUnidCarga infUnidCargaItem) {
    if (this.infUnidCarga == null) {
      this.infUnidCarga = new ArrayList<>();
    }
    this.infUnidCarga.add(infUnidCargaItem);
    return this;
  }

  /**
   * Get infUnidCarga
   * @return infUnidCarga
   */
  @javax.annotation.Nullable
  public List<CteSefazUnidCarga> getInfUnidCarga() {
    return infUnidCarga;
  }

  public void setInfUnidCarga(@javax.annotation.Nullable List<CteSefazUnidCarga> infUnidCarga) {
    this.infUnidCarga = infUnidCarga;
  }


  public CteSefazInfNFe infUnidTransp(@javax.annotation.Nullable List<CteSefazUnidadeTransp> infUnidTransp) {
    this.infUnidTransp = infUnidTransp;
    return this;
  }

  public CteSefazInfNFe addInfUnidTranspItem(CteSefazUnidadeTransp infUnidTranspItem) {
    if (this.infUnidTransp == null) {
      this.infUnidTransp = new ArrayList<>();
    }
    this.infUnidTransp.add(infUnidTranspItem);
    return this;
  }

  /**
   * Get infUnidTransp
   * @return infUnidTransp
   */
  @javax.annotation.Nullable
  public List<CteSefazUnidadeTransp> getInfUnidTransp() {
    return infUnidTransp;
  }

  public void setInfUnidTransp(@javax.annotation.Nullable List<CteSefazUnidadeTransp> infUnidTransp) {
    this.infUnidTransp = infUnidTransp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CteSefazInfNFe cteSefazInfNFe = (CteSefazInfNFe) o;
    return Objects.equals(this.chave, cteSefazInfNFe.chave) &&
        Objects.equals(this.PIN, cteSefazInfNFe.PIN) &&
        Objects.equals(this.dPrev, cteSefazInfNFe.dPrev) &&
        Objects.equals(this.infUnidCarga, cteSefazInfNFe.infUnidCarga) &&
        Objects.equals(this.infUnidTransp, cteSefazInfNFe.infUnidTransp);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(chave, PIN, dPrev, infUnidCarga, infUnidTransp);
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
    sb.append("class CteSefazInfNFe {\n");
    sb.append("    chave: ").append(toIndentedString(chave)).append("\n");
    sb.append("    PIN: ").append(toIndentedString(PIN)).append("\n");
    sb.append("    dPrev: ").append(toIndentedString(dPrev)).append("\n");
    sb.append("    infUnidCarga: ").append(toIndentedString(infUnidCarga)).append("\n");
    sb.append("    infUnidTransp: ").append(toIndentedString(infUnidTransp)).append("\n");
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
    openapiFields.add("chave");
    openapiFields.add("PIN");
    openapiFields.add("dPrev");
    openapiFields.add("infUnidCarga");
    openapiFields.add("infUnidTransp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("chave");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CteSefazInfNFe
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CteSefazInfNFe.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CteSefazInfNFe is not found in the empty JSON string", CteSefazInfNFe.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CteSefazInfNFe.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CteSefazInfNFe` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CteSefazInfNFe.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("chave") != null && !jsonObj.get("chave").isJsonNull()) && !jsonObj.get("chave").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chave` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chave").toString()));
      }
      if ((jsonObj.get("PIN") != null && !jsonObj.get("PIN").isJsonNull()) && !jsonObj.get("PIN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PIN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PIN").toString()));
      }
      if (jsonObj.get("infUnidCarga") != null && !jsonObj.get("infUnidCarga").isJsonNull()) {
        JsonArray jsonArrayinfUnidCarga = jsonObj.getAsJsonArray("infUnidCarga");
        if (jsonArrayinfUnidCarga != null) {
          // ensure the json data is an array
          if (!jsonObj.get("infUnidCarga").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `infUnidCarga` to be an array in the JSON string but got `%s`", jsonObj.get("infUnidCarga").toString()));
          }

          // validate the optional field `infUnidCarga` (array)
          for (int i = 0; i < jsonArrayinfUnidCarga.size(); i++) {
            CteSefazUnidCarga.validateJsonElement(jsonArrayinfUnidCarga.get(i));
          };
        }
      }
      if (jsonObj.get("infUnidTransp") != null && !jsonObj.get("infUnidTransp").isJsonNull()) {
        JsonArray jsonArrayinfUnidTransp = jsonObj.getAsJsonArray("infUnidTransp");
        if (jsonArrayinfUnidTransp != null) {
          // ensure the json data is an array
          if (!jsonObj.get("infUnidTransp").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `infUnidTransp` to be an array in the JSON string but got `%s`", jsonObj.get("infUnidTransp").toString()));
          }

          // validate the optional field `infUnidTransp` (array)
          for (int i = 0; i < jsonArrayinfUnidTransp.size(); i++) {
            CteSefazUnidadeTransp.validateJsonElement(jsonArrayinfUnidTransp.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CteSefazInfNFe.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CteSefazInfNFe' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CteSefazInfNFe> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CteSefazInfNFe.class));

       return (TypeAdapter<T>) new TypeAdapter<CteSefazInfNFe>() {
           @Override
           public void write(JsonWriter out, CteSefazInfNFe value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CteSefazInfNFe read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CteSefazInfNFe given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CteSefazInfNFe
   * @throws IOException if the JSON string is invalid with respect to CteSefazInfNFe
   */
  public static CteSefazInfNFe fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CteSefazInfNFe.class);
  }

  /**
   * Convert an instance of CteSefazInfNFe to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
