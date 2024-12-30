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
 * Grupo com as informações NF de produtor referenciada.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfeSefazRefNFP {
  public static final String SERIALIZED_NAME_C_U_F = "cUF";
  @SerializedName(SERIALIZED_NAME_C_U_F)
  @javax.annotation.Nullable
  private Integer cUF;

  public static final String SERIALIZED_NAME_A_A_M_M = "AAMM";
  @SerializedName(SERIALIZED_NAME_A_A_M_M)
  @javax.annotation.Nullable
  private String AAMM;

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

  public static final String SERIALIZED_NAME_MOD = "mod";
  @SerializedName(SERIALIZED_NAME_MOD)
  @javax.annotation.Nullable
  private String mod;

  public static final String SERIALIZED_NAME_SERIE = "serie";
  @SerializedName(SERIALIZED_NAME_SERIE)
  @javax.annotation.Nullable
  private Integer serie;

  public static final String SERIALIZED_NAME_N_N_F = "nNF";
  @SerializedName(SERIALIZED_NAME_N_N_F)
  @javax.annotation.Nullable
  private Integer nNF;

  public NfeSefazRefNFP() {
  }

  public NfeSefazRefNFP cUF(@javax.annotation.Nullable Integer cUF) {
    this.cUF = cUF;
    return this;
  }

  /**
   * Código da UF do emitente do Documento FiscalUtilizar a Tabela do IBGE (Anexo IV - Tabela de UF, Município e País).
   * @return cUF
   */
  @javax.annotation.Nullable
  public Integer getcUF() {
    return cUF;
  }

  public void setcUF(@javax.annotation.Nullable Integer cUF) {
    this.cUF = cUF;
  }


  public NfeSefazRefNFP AAMM(@javax.annotation.Nullable String AAMM) {
    this.AAMM = AAMM;
    return this;
  }

  /**
   * AAMM da emissão da NF de produtor.
   * @return AAMM
   */
  @javax.annotation.Nullable
  public String getAAMM() {
    return AAMM;
  }

  public void setAAMM(@javax.annotation.Nullable String AAMM) {
    this.AAMM = AAMM;
  }


  public NfeSefazRefNFP CNPJ(@javax.annotation.Nullable String CNPJ) {
    this.CNPJ = CNPJ;
    return this;
  }

  /**
   * CNPJ do emitente da NF de produtor.
   * @return CNPJ
   */
  @javax.annotation.Nullable
  public String getCNPJ() {
    return CNPJ;
  }

  public void setCNPJ(@javax.annotation.Nullable String CNPJ) {
    this.CNPJ = CNPJ;
  }


  public NfeSefazRefNFP CPF(@javax.annotation.Nullable String CPF) {
    this.CPF = CPF;
    return this;
  }

  /**
   * CPF do emitente da NF de produtor.
   * @return CPF
   */
  @javax.annotation.Nullable
  public String getCPF() {
    return CPF;
  }

  public void setCPF(@javax.annotation.Nullable String CPF) {
    this.CPF = CPF;
  }


  public NfeSefazRefNFP IE(@javax.annotation.Nullable String IE) {
    this.IE = IE;
    return this;
  }

  /**
   * IE do emitente da NF de Produtor.
   * @return IE
   */
  @javax.annotation.Nullable
  public String getIE() {
    return IE;
  }

  public void setIE(@javax.annotation.Nullable String IE) {
    this.IE = IE;
  }


  public NfeSefazRefNFP mod(@javax.annotation.Nullable String mod) {
    this.mod = mod;
    return this;
  }

  /**
   * Código do modelo do Documento Fiscal - utilizar 04 para NF de produtor  ou 01 para NF Avulsa.
   * @return mod
   */
  @javax.annotation.Nullable
  public String getMod() {
    return mod;
  }

  public void setMod(@javax.annotation.Nullable String mod) {
    this.mod = mod;
  }


  public NfeSefazRefNFP serie(@javax.annotation.Nullable Integer serie) {
    this.serie = serie;
    return this;
  }

  /**
   * Série do Documento Fiscal, informar zero se inexistentesérie.
   * minimum: 0
   * maximum: 999
   * @return serie
   */
  @javax.annotation.Nullable
  public Integer getSerie() {
    return serie;
  }

  public void setSerie(@javax.annotation.Nullable Integer serie) {
    this.serie = serie;
  }


  public NfeSefazRefNFP nNF(@javax.annotation.Nullable Integer nNF) {
    this.nNF = nNF;
    return this;
  }

  /**
   * Número do Documento Fiscal - 1 - 999999999.
   * minimum: 1
   * maximum: 999999999
   * @return nNF
   */
  @javax.annotation.Nullable
  public Integer getnNF() {
    return nNF;
  }

  public void setnNF(@javax.annotation.Nullable Integer nNF) {
    this.nNF = nNF;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfeSefazRefNFP nfeSefazRefNFP = (NfeSefazRefNFP) o;
    return Objects.equals(this.cUF, nfeSefazRefNFP.cUF) &&
        Objects.equals(this.AAMM, nfeSefazRefNFP.AAMM) &&
        Objects.equals(this.CNPJ, nfeSefazRefNFP.CNPJ) &&
        Objects.equals(this.CPF, nfeSefazRefNFP.CPF) &&
        Objects.equals(this.IE, nfeSefazRefNFP.IE) &&
        Objects.equals(this.mod, nfeSefazRefNFP.mod) &&
        Objects.equals(this.serie, nfeSefazRefNFP.serie) &&
        Objects.equals(this.nNF, nfeSefazRefNFP.nNF);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cUF, AAMM, CNPJ, CPF, IE, mod, serie, nNF);
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
    sb.append("class NfeSefazRefNFP {\n");
    sb.append("    cUF: ").append(toIndentedString(cUF)).append("\n");
    sb.append("    AAMM: ").append(toIndentedString(AAMM)).append("\n");
    sb.append("    CNPJ: ").append(toIndentedString(CNPJ)).append("\n");
    sb.append("    CPF: ").append(toIndentedString(CPF)).append("\n");
    sb.append("    IE: ").append(toIndentedString(IE)).append("\n");
    sb.append("    mod: ").append(toIndentedString(mod)).append("\n");
    sb.append("    serie: ").append(toIndentedString(serie)).append("\n");
    sb.append("    nNF: ").append(toIndentedString(nNF)).append("\n");
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
    openapiFields.add("cUF");
    openapiFields.add("AAMM");
    openapiFields.add("CNPJ");
    openapiFields.add("CPF");
    openapiFields.add("IE");
    openapiFields.add("mod");
    openapiFields.add("serie");
    openapiFields.add("nNF");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cUF");
    openapiRequiredFields.add("AAMM");
    openapiRequiredFields.add("IE");
    openapiRequiredFields.add("mod");
    openapiRequiredFields.add("serie");
    openapiRequiredFields.add("nNF");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfeSefazRefNFP
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfeSefazRefNFP.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfeSefazRefNFP is not found in the empty JSON string", NfeSefazRefNFP.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfeSefazRefNFP.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfeSefazRefNFP` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NfeSefazRefNFP.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("AAMM") != null && !jsonObj.get("AAMM").isJsonNull()) && !jsonObj.get("AAMM").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AAMM` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AAMM").toString()));
      }
      if ((jsonObj.get("CNPJ") != null && !jsonObj.get("CNPJ").isJsonNull()) && !jsonObj.get("CNPJ").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CNPJ` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CNPJ").toString()));
      }
      if ((jsonObj.get("CPF") != null && !jsonObj.get("CPF").isJsonNull()) && !jsonObj.get("CPF").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CPF` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CPF").toString()));
      }
      if ((jsonObj.get("IE") != null && !jsonObj.get("IE").isJsonNull()) && !jsonObj.get("IE").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IE` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IE").toString()));
      }
      if ((jsonObj.get("mod") != null && !jsonObj.get("mod").isJsonNull()) && !jsonObj.get("mod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mod").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NfeSefazRefNFP.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfeSefazRefNFP' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfeSefazRefNFP> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfeSefazRefNFP.class));

       return (TypeAdapter<T>) new TypeAdapter<NfeSefazRefNFP>() {
           @Override
           public void write(JsonWriter out, NfeSefazRefNFP value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfeSefazRefNFP read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfeSefazRefNFP given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfeSefazRefNFP
   * @throws IOException if the JSON string is invalid with respect to NfeSefazRefNFP
   */
  public static NfeSefazRefNFP fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfeSefazRefNFP.class);
  }

  /**
   * Convert an instance of NfeSefazRefNFP to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
