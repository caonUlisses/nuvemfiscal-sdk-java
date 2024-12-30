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
import org.openapitools.client.model.CteSefazEndeEmi;
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
 * Identificação do Emitente do CT-e.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class CteSefazEmit {
  public static final String SERIALIZED_NAME_C_N_P_J = "CNPJ";
  @SerializedName(SERIALIZED_NAME_C_N_P_J)
  @javax.annotation.Nullable
  private String CNPJ;

  public static final String SERIALIZED_NAME_C_P_F = "CPF";
  @SerializedName(SERIALIZED_NAME_C_P_F)
  @javax.annotation.Nullable
  private String CPF;

  public static final String SERIALIZED_NAME_I_E = "IE";
  @SerializedName(SERIALIZED_NAME_I_E)
  @javax.annotation.Nullable
  private String IE;

  public static final String SERIALIZED_NAME_I_E_S_T = "IEST";
  @SerializedName(SERIALIZED_NAME_I_E_S_T)
  @javax.annotation.Nullable
  private String IEST;

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
  private CteSefazEndeEmi enderEmit;

  public static final String SERIALIZED_NAME_C_R_T = "CRT";
  @SerializedName(SERIALIZED_NAME_C_R_T)
  @javax.annotation.Nullable
  private Integer CRT;

  public CteSefazEmit() {
  }

  public CteSefazEmit CNPJ(@javax.annotation.Nullable String CNPJ) {
    this.CNPJ = CNPJ;
    return this;
  }

  /**
   * CNPJ do emitente.  Informar zeros não significativos.    ***Obrigatório caso o emitente seja pessoa jurídica***.
   * @return CNPJ
   */
  @javax.annotation.Nullable
  public String getCNPJ() {
    return CNPJ;
  }

  public void setCNPJ(@javax.annotation.Nullable String CNPJ) {
    this.CNPJ = CNPJ;
  }


  public CteSefazEmit CPF(@javax.annotation.Nullable String CPF) {
    this.CPF = CPF;
    return this;
  }

  /**
   * CPF do emitente.  Informar zeros não significativos.  Usar com série específica 920-969 para emitente pessoa física com inscrição estadual.    ***Obrigatorio caso o emitente seja pessoa física***.
   * @return CPF
   */
  @javax.annotation.Nullable
  public String getCPF() {
    return CPF;
  }

  public void setCPF(@javax.annotation.Nullable String CPF) {
    this.CPF = CPF;
  }


  public CteSefazEmit IE(@javax.annotation.Nullable String IE) {
    this.IE = IE;
    return this;
  }

  /**
   * Inscrição Estadual do Emitente.  A IE do emitente somente ficará sem informação para o caso do Regime Especial da NFF (tpEmis&#x3D;3).    *Caso não seja informado, será utilizado o do cadastro da empresa.*
   * @return IE
   */
  @javax.annotation.Nullable
  public String getIE() {
    return IE;
  }

  public void setIE(@javax.annotation.Nullable String IE) {
    this.IE = IE;
  }


  public CteSefazEmit IEST(@javax.annotation.Nullable String IEST) {
    this.IEST = IEST;
    return this;
  }

  /**
   * Inscrição Estadual do Substituto Tributário.
   * @return IEST
   */
  @javax.annotation.Nullable
  public String getIEST() {
    return IEST;
  }

  public void setIEST(@javax.annotation.Nullable String IEST) {
    this.IEST = IEST;
  }


  public CteSefazEmit xNome(@javax.annotation.Nullable String xNome) {
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


  public CteSefazEmit xFant(@javax.annotation.Nullable String xFant) {
    this.xFant = xFant;
    return this;
  }

  /**
   * Nome fantasia.    *Caso não seja informado, será utilizado o do cadastro da empresa.*
   * @return xFant
   */
  @javax.annotation.Nullable
  public String getxFant() {
    return xFant;
  }

  public void setxFant(@javax.annotation.Nullable String xFant) {
    this.xFant = xFant;
  }


  public CteSefazEmit enderEmit(@javax.annotation.Nullable CteSefazEndeEmi enderEmit) {
    this.enderEmit = enderEmit;
    return this;
  }

  /**
   * Get enderEmit
   * @return enderEmit
   */
  @javax.annotation.Nullable
  public CteSefazEndeEmi getEnderEmit() {
    return enderEmit;
  }

  public void setEnderEmit(@javax.annotation.Nullable CteSefazEndeEmi enderEmit) {
    this.enderEmit = enderEmit;
  }


  public CteSefazEmit CRT(@javax.annotation.Nullable Integer CRT) {
    this.CRT = CRT;
    return this;
  }

  /**
   * Código do Regime Tributário. Informar:  * 1 - Simples Nacional;  * 2 - Simples Nacional, excesso sublimite de receita bruta;  * 3 - Regime Normal;  * 4 - Simples Nacional - Microempreendedor Individual (MEI).    *Caso não seja informado, será utilizado o do cadastro da empresa.*
   * @return CRT
   */
  @javax.annotation.Nullable
  public Integer getCRT() {
    return CRT;
  }

  public void setCRT(@javax.annotation.Nullable Integer CRT) {
    this.CRT = CRT;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CteSefazEmit cteSefazEmit = (CteSefazEmit) o;
    return Objects.equals(this.CNPJ, cteSefazEmit.CNPJ) &&
        Objects.equals(this.CPF, cteSefazEmit.CPF) &&
        Objects.equals(this.IE, cteSefazEmit.IE) &&
        Objects.equals(this.IEST, cteSefazEmit.IEST) &&
        Objects.equals(this.xNome, cteSefazEmit.xNome) &&
        Objects.equals(this.xFant, cteSefazEmit.xFant) &&
        Objects.equals(this.enderEmit, cteSefazEmit.enderEmit) &&
        Objects.equals(this.CRT, cteSefazEmit.CRT);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(CNPJ, CPF, IE, IEST, xNome, xFant, enderEmit, CRT);
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
    sb.append("class CteSefazEmit {\n");
    sb.append("    CNPJ: ").append(toIndentedString(CNPJ)).append("\n");
    sb.append("    CPF: ").append(toIndentedString(CPF)).append("\n");
    sb.append("    IE: ").append(toIndentedString(IE)).append("\n");
    sb.append("    IEST: ").append(toIndentedString(IEST)).append("\n");
    sb.append("    xNome: ").append(toIndentedString(xNome)).append("\n");
    sb.append("    xFant: ").append(toIndentedString(xFant)).append("\n");
    sb.append("    enderEmit: ").append(toIndentedString(enderEmit)).append("\n");
    sb.append("    CRT: ").append(toIndentedString(CRT)).append("\n");
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
    openapiFields.add("CPF");
    openapiFields.add("IE");
    openapiFields.add("IEST");
    openapiFields.add("xNome");
    openapiFields.add("xFant");
    openapiFields.add("enderEmit");
    openapiFields.add("CRT");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CteSefazEmit
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CteSefazEmit.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CteSefazEmit is not found in the empty JSON string", CteSefazEmit.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CteSefazEmit.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CteSefazEmit` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("CNPJ") != null && !jsonObj.get("CNPJ").isJsonNull()) && !jsonObj.get("CNPJ").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CNPJ` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CNPJ").toString()));
      }
      if ((jsonObj.get("CPF") != null && !jsonObj.get("CPF").isJsonNull()) && !jsonObj.get("CPF").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CPF` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CPF").toString()));
      }
      if ((jsonObj.get("IE") != null && !jsonObj.get("IE").isJsonNull()) && !jsonObj.get("IE").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IE` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IE").toString()));
      }
      if ((jsonObj.get("IEST") != null && !jsonObj.get("IEST").isJsonNull()) && !jsonObj.get("IEST").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IEST` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IEST").toString()));
      }
      if ((jsonObj.get("xNome") != null && !jsonObj.get("xNome").isJsonNull()) && !jsonObj.get("xNome").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xNome` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xNome").toString()));
      }
      if ((jsonObj.get("xFant") != null && !jsonObj.get("xFant").isJsonNull()) && !jsonObj.get("xFant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xFant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xFant").toString()));
      }
      // validate the optional field `enderEmit`
      if (jsonObj.get("enderEmit") != null && !jsonObj.get("enderEmit").isJsonNull()) {
        CteSefazEndeEmi.validateJsonElement(jsonObj.get("enderEmit"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CteSefazEmit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CteSefazEmit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CteSefazEmit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CteSefazEmit.class));

       return (TypeAdapter<T>) new TypeAdapter<CteSefazEmit>() {
           @Override
           public void write(JsonWriter out, CteSefazEmit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CteSefazEmit read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CteSefazEmit given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CteSefazEmit
   * @throws IOException if the JSON string is invalid with respect to CteSefazEmit
   */
  public static CteSefazEmit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CteSefazEmit.class);
  }

  /**
   * Convert an instance of CteSefazEmit to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

