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
import java.time.LocalDate;
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
 * Dados do assinante.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfcomSefazAssinante {
  public static final String SERIALIZED_NAME_I_COD_ASSINANTE = "iCodAssinante";
  @SerializedName(SERIALIZED_NAME_I_COD_ASSINANTE)
  @javax.annotation.Nullable
  private String iCodAssinante;

  public static final String SERIALIZED_NAME_TP_ASSINANTE = "tpAssinante";
  @SerializedName(SERIALIZED_NAME_TP_ASSINANTE)
  @javax.annotation.Nullable
  private Integer tpAssinante;

  public static final String SERIALIZED_NAME_TP_SERV_UTIL = "tpServUtil";
  @SerializedName(SERIALIZED_NAME_TP_SERV_UTIL)
  @javax.annotation.Nullable
  private Integer tpServUtil;

  public static final String SERIALIZED_NAME_N_CONTRATO = "nContrato";
  @SerializedName(SERIALIZED_NAME_N_CONTRATO)
  @javax.annotation.Nullable
  private String nContrato;

  public static final String SERIALIZED_NAME_D_CONTRATO_INI = "dContratoIni";
  @SerializedName(SERIALIZED_NAME_D_CONTRATO_INI)
  @javax.annotation.Nullable
  private LocalDate dContratoIni;

  public static final String SERIALIZED_NAME_D_CONTRATO_FIM = "dContratoFim";
  @SerializedName(SERIALIZED_NAME_D_CONTRATO_FIM)
  @javax.annotation.Nullable
  private LocalDate dContratoFim;

  public static final String SERIALIZED_NAME_NRO_TERM_PRINC = "NroTermPrinc";
  @SerializedName(SERIALIZED_NAME_NRO_TERM_PRINC)
  @javax.annotation.Nullable
  private String nroTermPrinc;

  public static final String SERIALIZED_NAME_C_U_F_PRINC = "cUFPrinc";
  @SerializedName(SERIALIZED_NAME_C_U_F_PRINC)
  @javax.annotation.Nullable
  private Integer cUFPrinc;

  public static final String SERIALIZED_NAME_NRO_TERM_ADIC = "NroTermAdic";
  @SerializedName(SERIALIZED_NAME_NRO_TERM_ADIC)
  @javax.annotation.Nullable
  private String nroTermAdic;

  public static final String SERIALIZED_NAME_C_U_F_ADIC = "cUFAdic";
  @SerializedName(SERIALIZED_NAME_C_U_F_ADIC)
  @javax.annotation.Nullable
  private Integer cUFAdic;

  public NfcomSefazAssinante() {
  }

  public NfcomSefazAssinante iCodAssinante(@javax.annotation.Nullable String iCodAssinante) {
    this.iCodAssinante = iCodAssinante;
    return this;
  }

  /**
   * Código único de Identificação do assinante.
   * @return iCodAssinante
   */
  @javax.annotation.Nullable
  public String getiCodAssinante() {
    return iCodAssinante;
  }

  public void setiCodAssinante(@javax.annotation.Nullable String iCodAssinante) {
    this.iCodAssinante = iCodAssinante;
  }


  public NfcomSefazAssinante tpAssinante(@javax.annotation.Nullable Integer tpAssinante) {
    this.tpAssinante = tpAssinante;
    return this;
  }

  /**
   * Tipo de assinante.  * 1 - Comercial  * 2 - Industrial  * 3 - Residencial/Pessoa Física  * 4 - Produtor Rural  * 5 - Órgão da administração pública estadual direta e suas fundações e autarquias, quando mantidas pelo poder público estadual e regidas por normas de direito público, nos termos do Convênio ICMS 107/95  * 6 - Prestador de serviço de telecomunicação responsável pelo recolhimento do imposto incidente sobre a cessão dos meios de rede do prestador do serviço ao usuário final, nos termos do Convênio ICMS 17/13  * 7 - Missões Diplomáticas, Repartições Consulares e Organismos Internacionais, nos termos do Convênio ICMS 158/94  * 8 - Igrejas e Templos de qualquer natureza  * 99 - Outros não especificados anteriormente
   * @return tpAssinante
   */
  @javax.annotation.Nullable
  public Integer getTpAssinante() {
    return tpAssinante;
  }

  public void setTpAssinante(@javax.annotation.Nullable Integer tpAssinante) {
    this.tpAssinante = tpAssinante;
  }


  public NfcomSefazAssinante tpServUtil(@javax.annotation.Nullable Integer tpServUtil) {
    this.tpServUtil = tpServUtil;
    return this;
  }

  /**
   * Tipo de serviço utilizado.  * 1 - Telefonia  * 2 - Comunicação de dados  * 3 - TV por Assinatura  * 4 - Provimento de acesso à Internet  * 5 - Multimídia  * 6 - Outros  * 7 - Varios
   * @return tpServUtil
   */
  @javax.annotation.Nullable
  public Integer getTpServUtil() {
    return tpServUtil;
  }

  public void setTpServUtil(@javax.annotation.Nullable Integer tpServUtil) {
    this.tpServUtil = tpServUtil;
  }


  public NfcomSefazAssinante nContrato(@javax.annotation.Nullable String nContrato) {
    this.nContrato = nContrato;
    return this;
  }

  /**
   * Número do Contrato do assinante.
   * @return nContrato
   */
  @javax.annotation.Nullable
  public String getnContrato() {
    return nContrato;
  }

  public void setnContrato(@javax.annotation.Nullable String nContrato) {
    this.nContrato = nContrato;
  }


  public NfcomSefazAssinante dContratoIni(@javax.annotation.Nullable LocalDate dContratoIni) {
    this.dContratoIni = dContratoIni;
    return this;
  }

  /**
   * Data de início do contrato.  Formato AAAA-MM-DD.
   * @return dContratoIni
   */
  @javax.annotation.Nullable
  public LocalDate getdContratoIni() {
    return dContratoIni;
  }

  public void setdContratoIni(@javax.annotation.Nullable LocalDate dContratoIni) {
    this.dContratoIni = dContratoIni;
  }


  public NfcomSefazAssinante dContratoFim(@javax.annotation.Nullable LocalDate dContratoFim) {
    this.dContratoFim = dContratoFim;
    return this;
  }

  /**
   * Data de término do contrato.  Formato AAAA-MM-DD.
   * @return dContratoFim
   */
  @javax.annotation.Nullable
  public LocalDate getdContratoFim() {
    return dContratoFim;
  }

  public void setdContratoFim(@javax.annotation.Nullable LocalDate dContratoFim) {
    this.dContratoFim = dContratoFim;
  }


  public NfcomSefazAssinante nroTermPrinc(@javax.annotation.Nullable String nroTermPrinc) {
    this.nroTermPrinc = nroTermPrinc;
    return this;
  }

  /**
   * Número do Terminal Principal do serviço contratado.  Em se tratando de plano de prestação de serviço telefônico corporativo, familiar ou similares, informar o número do terminal telefônico principal do plano.
   * @return nroTermPrinc
   */
  @javax.annotation.Nullable
  public String getNroTermPrinc() {
    return nroTermPrinc;
  }

  public void setNroTermPrinc(@javax.annotation.Nullable String nroTermPrinc) {
    this.nroTermPrinc = nroTermPrinc;
  }


  public NfcomSefazAssinante cUFPrinc(@javax.annotation.Nullable Integer cUFPrinc) {
    this.cUFPrinc = cUFPrinc;
    return this;
  }

  /**
   * Código da UF de habilitação do terminal.  Utilizar a  Tabela do IBGE de código de unidades da federação.
   * @return cUFPrinc
   */
  @javax.annotation.Nullable
  public Integer getcUFPrinc() {
    return cUFPrinc;
  }

  public void setcUFPrinc(@javax.annotation.Nullable Integer cUFPrinc) {
    this.cUFPrinc = cUFPrinc;
  }


  public NfcomSefazAssinante nroTermAdic(@javax.annotation.Nullable String nroTermAdic) {
    this.nroTermAdic = nroTermAdic;
    return this;
  }

  /**
   * Número dos Terminais adicionais do serviço contratado.
   * @return nroTermAdic
   */
  @javax.annotation.Nullable
  public String getNroTermAdic() {
    return nroTermAdic;
  }

  public void setNroTermAdic(@javax.annotation.Nullable String nroTermAdic) {
    this.nroTermAdic = nroTermAdic;
  }


  public NfcomSefazAssinante cUFAdic(@javax.annotation.Nullable Integer cUFAdic) {
    this.cUFAdic = cUFAdic;
    return this;
  }

  /**
   * Código da UF de habilitação do terminal.
   * @return cUFAdic
   */
  @javax.annotation.Nullable
  public Integer getcUFAdic() {
    return cUFAdic;
  }

  public void setcUFAdic(@javax.annotation.Nullable Integer cUFAdic) {
    this.cUFAdic = cUFAdic;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfcomSefazAssinante nfcomSefazAssinante = (NfcomSefazAssinante) o;
    return Objects.equals(this.iCodAssinante, nfcomSefazAssinante.iCodAssinante) &&
        Objects.equals(this.tpAssinante, nfcomSefazAssinante.tpAssinante) &&
        Objects.equals(this.tpServUtil, nfcomSefazAssinante.tpServUtil) &&
        Objects.equals(this.nContrato, nfcomSefazAssinante.nContrato) &&
        Objects.equals(this.dContratoIni, nfcomSefazAssinante.dContratoIni) &&
        Objects.equals(this.dContratoFim, nfcomSefazAssinante.dContratoFim) &&
        Objects.equals(this.nroTermPrinc, nfcomSefazAssinante.nroTermPrinc) &&
        Objects.equals(this.cUFPrinc, nfcomSefazAssinante.cUFPrinc) &&
        Objects.equals(this.nroTermAdic, nfcomSefazAssinante.nroTermAdic) &&
        Objects.equals(this.cUFAdic, nfcomSefazAssinante.cUFAdic);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(iCodAssinante, tpAssinante, tpServUtil, nContrato, dContratoIni, dContratoFim, nroTermPrinc, cUFPrinc, nroTermAdic, cUFAdic);
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
    sb.append("class NfcomSefazAssinante {\n");
    sb.append("    iCodAssinante: ").append(toIndentedString(iCodAssinante)).append("\n");
    sb.append("    tpAssinante: ").append(toIndentedString(tpAssinante)).append("\n");
    sb.append("    tpServUtil: ").append(toIndentedString(tpServUtil)).append("\n");
    sb.append("    nContrato: ").append(toIndentedString(nContrato)).append("\n");
    sb.append("    dContratoIni: ").append(toIndentedString(dContratoIni)).append("\n");
    sb.append("    dContratoFim: ").append(toIndentedString(dContratoFim)).append("\n");
    sb.append("    nroTermPrinc: ").append(toIndentedString(nroTermPrinc)).append("\n");
    sb.append("    cUFPrinc: ").append(toIndentedString(cUFPrinc)).append("\n");
    sb.append("    nroTermAdic: ").append(toIndentedString(nroTermAdic)).append("\n");
    sb.append("    cUFAdic: ").append(toIndentedString(cUFAdic)).append("\n");
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
    openapiFields.add("iCodAssinante");
    openapiFields.add("tpAssinante");
    openapiFields.add("tpServUtil");
    openapiFields.add("nContrato");
    openapiFields.add("dContratoIni");
    openapiFields.add("dContratoFim");
    openapiFields.add("NroTermPrinc");
    openapiFields.add("cUFPrinc");
    openapiFields.add("NroTermAdic");
    openapiFields.add("cUFAdic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("iCodAssinante");
    openapiRequiredFields.add("tpAssinante");
    openapiRequiredFields.add("tpServUtil");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfcomSefazAssinante
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfcomSefazAssinante.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfcomSefazAssinante is not found in the empty JSON string", NfcomSefazAssinante.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfcomSefazAssinante.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfcomSefazAssinante` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NfcomSefazAssinante.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("iCodAssinante") != null && !jsonObj.get("iCodAssinante").isJsonNull()) && !jsonObj.get("iCodAssinante").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iCodAssinante` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iCodAssinante").toString()));
      }
      if ((jsonObj.get("nContrato") != null && !jsonObj.get("nContrato").isJsonNull()) && !jsonObj.get("nContrato").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nContrato` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nContrato").toString()));
      }
      if ((jsonObj.get("NroTermPrinc") != null && !jsonObj.get("NroTermPrinc").isJsonNull()) && !jsonObj.get("NroTermPrinc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NroTermPrinc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NroTermPrinc").toString()));
      }
      if ((jsonObj.get("NroTermAdic") != null && !jsonObj.get("NroTermAdic").isJsonNull()) && !jsonObj.get("NroTermAdic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NroTermAdic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NroTermAdic").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NfcomSefazAssinante.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfcomSefazAssinante' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfcomSefazAssinante> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfcomSefazAssinante.class));

       return (TypeAdapter<T>) new TypeAdapter<NfcomSefazAssinante>() {
           @Override
           public void write(JsonWriter out, NfcomSefazAssinante value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfcomSefazAssinante read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfcomSefazAssinante given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfcomSefazAssinante
   * @throws IOException if the JSON string is invalid with respect to NfcomSefazAssinante
   */
  public static NfcomSefazAssinante fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfcomSefazAssinante.class);
  }

  /**
   * Convert an instance of NfcomSefazAssinante to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

