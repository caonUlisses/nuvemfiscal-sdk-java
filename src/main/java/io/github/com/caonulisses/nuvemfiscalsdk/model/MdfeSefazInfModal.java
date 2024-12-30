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
import io.github.com.caonulisses.nuvemfiscalsdk.model.MdfeSefazAereo;
import io.github.com.caonulisses.nuvemfiscalsdk.model.MdfeSefazAquav;
import io.github.com.caonulisses.nuvemfiscalsdk.model.MdfeSefazFerrov;
import io.github.com.caonulisses.nuvemfiscalsdk.model.MdfeSefazRodo;

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
 * Informações do modal.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class MdfeSefazInfModal {
  public static final String SERIALIZED_NAME_VERSAO_MODAL = "versaoModal";
  @SerializedName(SERIALIZED_NAME_VERSAO_MODAL)
  @javax.annotation.Nullable
  private String versaoModal;

  public static final String SERIALIZED_NAME_AEREO = "aereo";
  @SerializedName(SERIALIZED_NAME_AEREO)
  @javax.annotation.Nullable
  private MdfeSefazAereo aereo;

  public static final String SERIALIZED_NAME_RODO = "rodo";
  @SerializedName(SERIALIZED_NAME_RODO)
  @javax.annotation.Nullable
  private MdfeSefazRodo rodo;

  public static final String SERIALIZED_NAME_AQUAV = "aquav";
  @SerializedName(SERIALIZED_NAME_AQUAV)
  @javax.annotation.Nullable
  private MdfeSefazAquav aquav;

  public static final String SERIALIZED_NAME_FERROV = "ferrov";
  @SerializedName(SERIALIZED_NAME_FERROV)
  @javax.annotation.Nullable
  private MdfeSefazFerrov ferrov;

  public MdfeSefazInfModal() {
  }

  public MdfeSefazInfModal versaoModal(@javax.annotation.Nullable String versaoModal) {
    this.versaoModal = versaoModal;
    return this;
  }

  /**
   * Versão do leiaute específico para o Modal.
   * @return versaoModal
   */
  @javax.annotation.Nullable
  public String getVersaoModal() {
    return versaoModal;
  }

  public void setVersaoModal(@javax.annotation.Nullable String versaoModal) {
    this.versaoModal = versaoModal;
  }


  public MdfeSefazInfModal aereo(@javax.annotation.Nullable MdfeSefazAereo aereo) {
    this.aereo = aereo;
    return this;
  }

  /**
   * Get aereo
   * @return aereo
   */
  @javax.annotation.Nullable
  public MdfeSefazAereo getAereo() {
    return aereo;
  }

  public void setAereo(@javax.annotation.Nullable MdfeSefazAereo aereo) {
    this.aereo = aereo;
  }


  public MdfeSefazInfModal rodo(@javax.annotation.Nullable MdfeSefazRodo rodo) {
    this.rodo = rodo;
    return this;
  }

  /**
   * Get rodo
   * @return rodo
   */
  @javax.annotation.Nullable
  public MdfeSefazRodo getRodo() {
    return rodo;
  }

  public void setRodo(@javax.annotation.Nullable MdfeSefazRodo rodo) {
    this.rodo = rodo;
  }


  public MdfeSefazInfModal aquav(@javax.annotation.Nullable MdfeSefazAquav aquav) {
    this.aquav = aquav;
    return this;
  }

  /**
   * Get aquav
   * @return aquav
   */
  @javax.annotation.Nullable
  public MdfeSefazAquav getAquav() {
    return aquav;
  }

  public void setAquav(@javax.annotation.Nullable MdfeSefazAquav aquav) {
    this.aquav = aquav;
  }


  public MdfeSefazInfModal ferrov(@javax.annotation.Nullable MdfeSefazFerrov ferrov) {
    this.ferrov = ferrov;
    return this;
  }

  /**
   * Get ferrov
   * @return ferrov
   */
  @javax.annotation.Nullable
  public MdfeSefazFerrov getFerrov() {
    return ferrov;
  }

  public void setFerrov(@javax.annotation.Nullable MdfeSefazFerrov ferrov) {
    this.ferrov = ferrov;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MdfeSefazInfModal mdfeSefazInfModal = (MdfeSefazInfModal) o;
    return Objects.equals(this.versaoModal, mdfeSefazInfModal.versaoModal) &&
        Objects.equals(this.aereo, mdfeSefazInfModal.aereo) &&
        Objects.equals(this.rodo, mdfeSefazInfModal.rodo) &&
        Objects.equals(this.aquav, mdfeSefazInfModal.aquav) &&
        Objects.equals(this.ferrov, mdfeSefazInfModal.ferrov);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versaoModal, aereo, rodo, aquav, ferrov);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MdfeSefazInfModal {\n");
    sb.append("    versaoModal: ").append(toIndentedString(versaoModal)).append("\n");
    sb.append("    aereo: ").append(toIndentedString(aereo)).append("\n");
    sb.append("    rodo: ").append(toIndentedString(rodo)).append("\n");
    sb.append("    aquav: ").append(toIndentedString(aquav)).append("\n");
    sb.append("    ferrov: ").append(toIndentedString(ferrov)).append("\n");
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
    openapiFields.add("versaoModal");
    openapiFields.add("aereo");
    openapiFields.add("rodo");
    openapiFields.add("aquav");
    openapiFields.add("ferrov");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("versaoModal");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MdfeSefazInfModal
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MdfeSefazInfModal.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MdfeSefazInfModal is not found in the empty JSON string", MdfeSefazInfModal.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MdfeSefazInfModal.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MdfeSefazInfModal` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MdfeSefazInfModal.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("versaoModal") != null && !jsonObj.get("versaoModal").isJsonNull()) && !jsonObj.get("versaoModal").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `versaoModal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("versaoModal").toString()));
      }
      // validate the optional field `aereo`
      if (jsonObj.get("aereo") != null && !jsonObj.get("aereo").isJsonNull()) {
        MdfeSefazAereo.validateJsonElement(jsonObj.get("aereo"));
      }
      // validate the optional field `rodo`
      if (jsonObj.get("rodo") != null && !jsonObj.get("rodo").isJsonNull()) {
        MdfeSefazRodo.validateJsonElement(jsonObj.get("rodo"));
      }
      // validate the optional field `aquav`
      if (jsonObj.get("aquav") != null && !jsonObj.get("aquav").isJsonNull()) {
        MdfeSefazAquav.validateJsonElement(jsonObj.get("aquav"));
      }
      // validate the optional field `ferrov`
      if (jsonObj.get("ferrov") != null && !jsonObj.get("ferrov").isJsonNull()) {
        MdfeSefazFerrov.validateJsonElement(jsonObj.get("ferrov"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MdfeSefazInfModal.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MdfeSefazInfModal' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MdfeSefazInfModal> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MdfeSefazInfModal.class));

       return (TypeAdapter<T>) new TypeAdapter<MdfeSefazInfModal>() {
           @Override
           public void write(JsonWriter out, MdfeSefazInfModal value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MdfeSefazInfModal read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MdfeSefazInfModal given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MdfeSefazInfModal
   * @throws IOException if the JSON string is invalid with respect to MdfeSefazInfModal
   */
  public static MdfeSefazInfModal fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MdfeSefazInfModal.class);
  }

  /**
   * Convert an instance of MdfeSefazInfModal to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
