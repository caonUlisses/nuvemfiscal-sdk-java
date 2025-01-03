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
import io.github.com.caonulisses.nuvemfiscalsdk.model.NfcomSefazEndeEmi;
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
 * Identificação do Emitente do documento fiscal.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfcomSefazEmit {
  public static final String SERIALIZED_NAME_C_N_P_J = "CNPJ";
  @SerializedName(SERIALIZED_NAME_C_N_P_J)
  @javax.annotation.Nullable
  private String CNPJ;

  public static final String SERIALIZED_NAME_I_E = "IE";
  @SerializedName(SERIALIZED_NAME_I_E)
  @javax.annotation.Nullable
  private String IE;

  public static final String SERIALIZED_NAME_IE_U_F_DEST = "IEUFDest";
  @SerializedName(SERIALIZED_NAME_IE_U_F_DEST)
  @javax.annotation.Nullable
  private String ieUFDest;

  public static final String SERIALIZED_NAME_C_R_T = "CRT";
  @SerializedName(SERIALIZED_NAME_C_R_T)
  @javax.annotation.Nullable
  private Integer CRT;

  public static final String SERIALIZED_NAME_X_NOME = "xNome";
  @SerializedName(SERIALIZED_NAME_X_NOME)
  @javax.annotation.Nullable
  private String xNome;

  public static final String SERIALIZED_NAME_X_FANT = "xFant";
  @SerializedName(SERIALIZED_NAME_X_FANT)
  @javax.annotation.Nullable
  private String xFant;

  public static final String SERIALIZED_NAME_ENDER_EMIT = "enderEmit";
  @SerializedName(SERIALIZED_NAME_ENDER_EMIT)
  @javax.annotation.Nullable
  private NfcomSefazEndeEmi enderEmit;

  public NfcomSefazEmit() {
  }

  public NfcomSefazEmit CNPJ(@javax.annotation.Nullable String CNPJ) {
    this.CNPJ = CNPJ;
    return this;
  }

  /**
   * CNPJ do emitente.  Informar zeros não significativos.
   * @return CNPJ
   */
  @javax.annotation.Nullable
  public String getCNPJ() {
    return CNPJ;
  }

  public void setCNPJ(@javax.annotation.Nullable String CNPJ) {
    this.CNPJ = CNPJ;
  }


  public NfcomSefazEmit IE(@javax.annotation.Nullable String IE) {
    this.IE = IE;
    return this;
  }

  /**
   * Inscrição Estadual do emitente.    *Caso não seja informado, será utilizado o do cadastro da empresa.*
   * @return IE
   */
  @javax.annotation.Nullable
  public String getIE() {
    return IE;
  }

  public void setIE(@javax.annotation.Nullable String IE) {
    this.IE = IE;
  }


  public NfcomSefazEmit ieUFDest(@javax.annotation.Nullable String ieUFDest) {
    this.ieUFDest = ieUFDest;
    return this;
  }

  /**
   * Inscrição Estadual Virtual do emitente na UF de Destino da partilha (IE Virtual).
   * @return ieUFDest
   */
  @javax.annotation.Nullable
  public String getIeUFDest() {
    return ieUFDest;
  }

  public void setIeUFDest(@javax.annotation.Nullable String ieUFDest) {
    this.ieUFDest = ieUFDest;
  }


  public NfcomSefazEmit CRT(@javax.annotation.Nullable Integer CRT) {
    this.CRT = CRT;
    return this;
  }

  /**
   * Código do Regime Tributário. Informar:  * 1 - Simples Nacional;  * 2 - Simples Nacional, excesso sublimite de receita bruta;  * 3 - Regime Normal.    *Caso não seja informado, será utilizado o do cadastro da empresa.*
   * @return CRT
   */
  @javax.annotation.Nullable
  public Integer getCRT() {
    return CRT;
  }

  public void setCRT(@javax.annotation.Nullable Integer CRT) {
    this.CRT = CRT;
  }


  public NfcomSefazEmit xNome(@javax.annotation.Nullable String xNome) {
    this.xNome = xNome;
    return this;
  }

  /**
   * Razão social ou Nome do emitente.    *Caso não seja informado, será utilizado o do cadastro da empresa.*
   * @return xNome
   */
  @javax.annotation.Nullable
  public String getxNome() {
    return xNome;
  }

  public void setxNome(@javax.annotation.Nullable String xNome) {
    this.xNome = xNome;
  }


  public NfcomSefazEmit xFant(@javax.annotation.Nullable String xFant) {
    this.xFant = xFant;
    return this;
  }

  /**
   * Nome fantasia do emitente.    *Caso não seja informado, será utilizado o do cadastro da empresa.*
   * @return xFant
   */
  @javax.annotation.Nullable
  public String getxFant() {
    return xFant;
  }

  public void setxFant(@javax.annotation.Nullable String xFant) {
    this.xFant = xFant;
  }


  public NfcomSefazEmit enderEmit(@javax.annotation.Nullable NfcomSefazEndeEmi enderEmit) {
    this.enderEmit = enderEmit;
    return this;
  }

  /**
   * Get enderEmit
   * @return enderEmit
   */
  @javax.annotation.Nullable
  public NfcomSefazEndeEmi getEnderEmit() {
    return enderEmit;
  }

  public void setEnderEmit(@javax.annotation.Nullable NfcomSefazEndeEmi enderEmit) {
    this.enderEmit = enderEmit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfcomSefazEmit nfcomSefazEmit = (NfcomSefazEmit) o;
    return Objects.equals(this.CNPJ, nfcomSefazEmit.CNPJ) &&
        Objects.equals(this.IE, nfcomSefazEmit.IE) &&
        Objects.equals(this.ieUFDest, nfcomSefazEmit.ieUFDest) &&
        Objects.equals(this.CRT, nfcomSefazEmit.CRT) &&
        Objects.equals(this.xNome, nfcomSefazEmit.xNome) &&
        Objects.equals(this.xFant, nfcomSefazEmit.xFant) &&
        Objects.equals(this.enderEmit, nfcomSefazEmit.enderEmit);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(CNPJ, IE, ieUFDest, CRT, xNome, xFant, enderEmit);
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
    sb.append("class NfcomSefazEmit {\n");
    sb.append("    CNPJ: ").append(toIndentedString(CNPJ)).append("\n");
    sb.append("    IE: ").append(toIndentedString(IE)).append("\n");
    sb.append("    ieUFDest: ").append(toIndentedString(ieUFDest)).append("\n");
    sb.append("    CRT: ").append(toIndentedString(CRT)).append("\n");
    sb.append("    xNome: ").append(toIndentedString(xNome)).append("\n");
    sb.append("    xFant: ").append(toIndentedString(xFant)).append("\n");
    sb.append("    enderEmit: ").append(toIndentedString(enderEmit)).append("\n");
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
    openapiFields.add("CNPJ");
    openapiFields.add("IE");
    openapiFields.add("IEUFDest");
    openapiFields.add("CRT");
    openapiFields.add("xNome");
    openapiFields.add("xFant");
    openapiFields.add("enderEmit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("CNPJ");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfcomSefazEmit
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfcomSefazEmit.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfcomSefazEmit is not found in the empty JSON string", NfcomSefazEmit.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfcomSefazEmit.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfcomSefazEmit` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NfcomSefazEmit.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("CNPJ") != null && !jsonObj.get("CNPJ").isJsonNull()) && !jsonObj.get("CNPJ").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CNPJ` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CNPJ").toString()));
      }
      if ((jsonObj.get("IE") != null && !jsonObj.get("IE").isJsonNull()) && !jsonObj.get("IE").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IE` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IE").toString()));
      }
      if ((jsonObj.get("IEUFDest") != null && !jsonObj.get("IEUFDest").isJsonNull()) && !jsonObj.get("IEUFDest").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IEUFDest` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IEUFDest").toString()));
      }
      if ((jsonObj.get("xNome") != null && !jsonObj.get("xNome").isJsonNull()) && !jsonObj.get("xNome").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xNome` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xNome").toString()));
      }
      if ((jsonObj.get("xFant") != null && !jsonObj.get("xFant").isJsonNull()) && !jsonObj.get("xFant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xFant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xFant").toString()));
      }
      // validate the optional field `enderEmit`
      if (jsonObj.get("enderEmit") != null && !jsonObj.get("enderEmit").isJsonNull()) {
        NfcomSefazEndeEmi.validateJsonElement(jsonObj.get("enderEmit"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NfcomSefazEmit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfcomSefazEmit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfcomSefazEmit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfcomSefazEmit.class));

       return (TypeAdapter<T>) new TypeAdapter<NfcomSefazEmit>() {
           @Override
           public void write(JsonWriter out, NfcomSefazEmit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfcomSefazEmit read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfcomSefazEmit given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfcomSefazEmit
   * @throws IOException if the JSON string is invalid with respect to NfcomSefazEmit
   */
  public static NfcomSefazEmit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfcomSefazEmit.class);
  }

  /**
   * Convert an instance of NfcomSefazEmit to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

