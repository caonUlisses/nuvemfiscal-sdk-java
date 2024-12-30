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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.MdfeSefazInfCIOT;
import org.openapitools.client.model.MdfeSefazInfContratante;
import org.openapitools.client.model.MdfeSefazInfPag;
import org.openapitools.client.model.MdfeSefazValePed;
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
 * Grupo de informações para Agência Reguladora.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class MdfeSefazInfANTT {
  public static final String SERIALIZED_NAME_R_N_T_R_C = "RNTRC";
  @SerializedName(SERIALIZED_NAME_R_N_T_R_C)
  @javax.annotation.Nullable
  private String RNTRC;

  public static final String SERIALIZED_NAME_INF_C_I_O_T = "infCIOT";
  @SerializedName(SERIALIZED_NAME_INF_C_I_O_T)
  @javax.annotation.Nullable
  private List<MdfeSefazInfCIOT> infCIOT = new ArrayList<>();

  public static final String SERIALIZED_NAME_VALE_PED = "valePed";
  @SerializedName(SERIALIZED_NAME_VALE_PED)
  @javax.annotation.Nullable
  private MdfeSefazValePed valePed;

  public static final String SERIALIZED_NAME_INF_CONTRATANTE = "infContratante";
  @SerializedName(SERIALIZED_NAME_INF_CONTRATANTE)
  @javax.annotation.Nullable
  private List<MdfeSefazInfContratante> infContratante = new ArrayList<>();

  public static final String SERIALIZED_NAME_INF_PAG = "infPag";
  @SerializedName(SERIALIZED_NAME_INF_PAG)
  @javax.annotation.Nullable
  private List<MdfeSefazInfPag> infPag = new ArrayList<>();

  public MdfeSefazInfANTT() {
  }

  public MdfeSefazInfANTT RNTRC(@javax.annotation.Nullable String RNTRC) {
    this.RNTRC = RNTRC;
    return this;
  }

  /**
   * Registro Nacional de Transportadores Rodoviários de Carga.  Registro obrigatório do emitente do MDF-e junto à ANTT para exercer a atividade de transportador rodoviário de cargas por conta de terceiros e mediante remuneração.
   * @return RNTRC
   */
  @javax.annotation.Nullable
  public String getRNTRC() {
    return RNTRC;
  }

  public void setRNTRC(@javax.annotation.Nullable String RNTRC) {
    this.RNTRC = RNTRC;
  }


  public MdfeSefazInfANTT infCIOT(@javax.annotation.Nullable List<MdfeSefazInfCIOT> infCIOT) {
    this.infCIOT = infCIOT;
    return this;
  }

  public MdfeSefazInfANTT addInfCIOTItem(MdfeSefazInfCIOT infCIOTItem) {
    if (this.infCIOT == null) {
      this.infCIOT = new ArrayList<>();
    }
    this.infCIOT.add(infCIOTItem);
    return this;
  }

  /**
   * Get infCIOT
   * @return infCIOT
   */
  @javax.annotation.Nullable
  public List<MdfeSefazInfCIOT> getInfCIOT() {
    return infCIOT;
  }

  public void setInfCIOT(@javax.annotation.Nullable List<MdfeSefazInfCIOT> infCIOT) {
    this.infCIOT = infCIOT;
  }


  public MdfeSefazInfANTT valePed(@javax.annotation.Nullable MdfeSefazValePed valePed) {
    this.valePed = valePed;
    return this;
  }

  /**
   * Get valePed
   * @return valePed
   */
  @javax.annotation.Nullable
  public MdfeSefazValePed getValePed() {
    return valePed;
  }

  public void setValePed(@javax.annotation.Nullable MdfeSefazValePed valePed) {
    this.valePed = valePed;
  }


  public MdfeSefazInfANTT infContratante(@javax.annotation.Nullable List<MdfeSefazInfContratante> infContratante) {
    this.infContratante = infContratante;
    return this;
  }

  public MdfeSefazInfANTT addInfContratanteItem(MdfeSefazInfContratante infContratanteItem) {
    if (this.infContratante == null) {
      this.infContratante = new ArrayList<>();
    }
    this.infContratante.add(infContratanteItem);
    return this;
  }

  /**
   * Get infContratante
   * @return infContratante
   */
  @javax.annotation.Nullable
  public List<MdfeSefazInfContratante> getInfContratante() {
    return infContratante;
  }

  public void setInfContratante(@javax.annotation.Nullable List<MdfeSefazInfContratante> infContratante) {
    this.infContratante = infContratante;
  }


  public MdfeSefazInfANTT infPag(@javax.annotation.Nullable List<MdfeSefazInfPag> infPag) {
    this.infPag = infPag;
    return this;
  }

  public MdfeSefazInfANTT addInfPagItem(MdfeSefazInfPag infPagItem) {
    if (this.infPag == null) {
      this.infPag = new ArrayList<>();
    }
    this.infPag.add(infPagItem);
    return this;
  }

  /**
   * Get infPag
   * @return infPag
   */
  @javax.annotation.Nullable
  public List<MdfeSefazInfPag> getInfPag() {
    return infPag;
  }

  public void setInfPag(@javax.annotation.Nullable List<MdfeSefazInfPag> infPag) {
    this.infPag = infPag;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MdfeSefazInfANTT mdfeSefazInfANTT = (MdfeSefazInfANTT) o;
    return Objects.equals(this.RNTRC, mdfeSefazInfANTT.RNTRC) &&
        Objects.equals(this.infCIOT, mdfeSefazInfANTT.infCIOT) &&
        Objects.equals(this.valePed, mdfeSefazInfANTT.valePed) &&
        Objects.equals(this.infContratante, mdfeSefazInfANTT.infContratante) &&
        Objects.equals(this.infPag, mdfeSefazInfANTT.infPag);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(RNTRC, infCIOT, valePed, infContratante, infPag);
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
    sb.append("class MdfeSefazInfANTT {\n");
    sb.append("    RNTRC: ").append(toIndentedString(RNTRC)).append("\n");
    sb.append("    infCIOT: ").append(toIndentedString(infCIOT)).append("\n");
    sb.append("    valePed: ").append(toIndentedString(valePed)).append("\n");
    sb.append("    infContratante: ").append(toIndentedString(infContratante)).append("\n");
    sb.append("    infPag: ").append(toIndentedString(infPag)).append("\n");
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
    openapiFields.add("RNTRC");
    openapiFields.add("infCIOT");
    openapiFields.add("valePed");
    openapiFields.add("infContratante");
    openapiFields.add("infPag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MdfeSefazInfANTT
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MdfeSefazInfANTT.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MdfeSefazInfANTT is not found in the empty JSON string", MdfeSefazInfANTT.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MdfeSefazInfANTT.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MdfeSefazInfANTT` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("RNTRC") != null && !jsonObj.get("RNTRC").isJsonNull()) && !jsonObj.get("RNTRC").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RNTRC` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RNTRC").toString()));
      }
      if (jsonObj.get("infCIOT") != null && !jsonObj.get("infCIOT").isJsonNull()) {
        JsonArray jsonArrayinfCIOT = jsonObj.getAsJsonArray("infCIOT");
        if (jsonArrayinfCIOT != null) {
          // ensure the json data is an array
          if (!jsonObj.get("infCIOT").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `infCIOT` to be an array in the JSON string but got `%s`", jsonObj.get("infCIOT").toString()));
          }

          // validate the optional field `infCIOT` (array)
          for (int i = 0; i < jsonArrayinfCIOT.size(); i++) {
            MdfeSefazInfCIOT.validateJsonElement(jsonArrayinfCIOT.get(i));
          };
        }
      }
      // validate the optional field `valePed`
      if (jsonObj.get("valePed") != null && !jsonObj.get("valePed").isJsonNull()) {
        MdfeSefazValePed.validateJsonElement(jsonObj.get("valePed"));
      }
      if (jsonObj.get("infContratante") != null && !jsonObj.get("infContratante").isJsonNull()) {
        JsonArray jsonArrayinfContratante = jsonObj.getAsJsonArray("infContratante");
        if (jsonArrayinfContratante != null) {
          // ensure the json data is an array
          if (!jsonObj.get("infContratante").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `infContratante` to be an array in the JSON string but got `%s`", jsonObj.get("infContratante").toString()));
          }

          // validate the optional field `infContratante` (array)
          for (int i = 0; i < jsonArrayinfContratante.size(); i++) {
            MdfeSefazInfContratante.validateJsonElement(jsonArrayinfContratante.get(i));
          };
        }
      }
      if (jsonObj.get("infPag") != null && !jsonObj.get("infPag").isJsonNull()) {
        JsonArray jsonArrayinfPag = jsonObj.getAsJsonArray("infPag");
        if (jsonArrayinfPag != null) {
          // ensure the json data is an array
          if (!jsonObj.get("infPag").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `infPag` to be an array in the JSON string but got `%s`", jsonObj.get("infPag").toString()));
          }

          // validate the optional field `infPag` (array)
          for (int i = 0; i < jsonArrayinfPag.size(); i++) {
            MdfeSefazInfPag.validateJsonElement(jsonArrayinfPag.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MdfeSefazInfANTT.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MdfeSefazInfANTT' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MdfeSefazInfANTT> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MdfeSefazInfANTT.class));

       return (TypeAdapter<T>) new TypeAdapter<MdfeSefazInfANTT>() {
           @Override
           public void write(JsonWriter out, MdfeSefazInfANTT value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MdfeSefazInfANTT read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MdfeSefazInfANTT given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MdfeSefazInfANTT
   * @throws IOException if the JSON string is invalid with respect to MdfeSefazInfANTT
   */
  public static MdfeSefazInfANTT fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MdfeSefazInfANTT.class);
  }

  /**
   * Convert an instance of MdfeSefazInfANTT to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

