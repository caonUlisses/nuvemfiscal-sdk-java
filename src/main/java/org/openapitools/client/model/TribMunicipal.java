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
import java.util.Arrays;
import org.openapitools.client.model.BeneficioMunicipal;
import org.openapitools.client.model.ExigSuspensa;
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
 * Grupo de informações relacionados ao Imposto Sobre Serviços de Qualquer Natureza - ISSQN.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class TribMunicipal {
  public static final String SERIALIZED_NAME_TRIB_I_S_S_Q_N = "tribISSQN";
  @SerializedName(SERIALIZED_NAME_TRIB_I_S_S_Q_N)
  @javax.annotation.Nullable
  private Integer tribISSQN;

  public static final String SERIALIZED_NAME_C_LOC_INCID = "cLocIncid";
  @SerializedName(SERIALIZED_NAME_C_LOC_INCID)
  @javax.annotation.Nullable
  private String cLocIncid;

  public static final String SERIALIZED_NAME_C_PAIS_RESULT = "cPaisResult";
  @SerializedName(SERIALIZED_NAME_C_PAIS_RESULT)
  @javax.annotation.Nullable
  private String cPaisResult;

  public static final String SERIALIZED_NAME_B_M = "BM";
  @SerializedName(SERIALIZED_NAME_B_M)
  @javax.annotation.Nullable
  private BeneficioMunicipal BM;

  public static final String SERIALIZED_NAME_EXIG_SUSP = "exigSusp";
  @SerializedName(SERIALIZED_NAME_EXIG_SUSP)
  @javax.annotation.Nullable
  private ExigSuspensa exigSusp;

  public static final String SERIALIZED_NAME_TP_IMUNIDADE = "tpImunidade";
  @SerializedName(SERIALIZED_NAME_TP_IMUNIDADE)
  @javax.annotation.Nullable
  private Integer tpImunidade;

  public static final String SERIALIZED_NAME_V_B_C = "vBC";
  @SerializedName(SERIALIZED_NAME_V_B_C)
  @javax.annotation.Nullable
  private BigDecimal vBC;

  public static final String SERIALIZED_NAME_P_ALIQ = "pAliq";
  @SerializedName(SERIALIZED_NAME_P_ALIQ)
  @javax.annotation.Nullable
  private BigDecimal pAliq;

  public static final String SERIALIZED_NAME_V_I_S_S_Q_N = "vISSQN";
  @SerializedName(SERIALIZED_NAME_V_I_S_S_Q_N)
  @javax.annotation.Nullable
  private BigDecimal vISSQN;

  public static final String SERIALIZED_NAME_TP_RET_I_S_S_Q_N = "tpRetISSQN";
  @SerializedName(SERIALIZED_NAME_TP_RET_I_S_S_Q_N)
  @javax.annotation.Nullable
  private Integer tpRetISSQN;

  public static final String SERIALIZED_NAME_V_LIQ = "vLiq";
  @SerializedName(SERIALIZED_NAME_V_LIQ)
  @javax.annotation.Nullable
  private BigDecimal vLiq;

  public TribMunicipal() {
  }

  public TribMunicipal tribISSQN(@javax.annotation.Nullable Integer tribISSQN) {
    this.tribISSQN = tribISSQN;
    return this;
  }

  /**
   * Tributação do ISSQN sobre o serviço prestado:  * 1 - Operação tributável  * 2 - Imunidade  * 3 - Exportação de serviço  * 4 - Não Incidência
   * @return tribISSQN
   */
  @javax.annotation.Nullable
  public Integer getTribISSQN() {
    return tribISSQN;
  }

  public void setTribISSQN(@javax.annotation.Nullable Integer tribISSQN) {
    this.tribISSQN = tribISSQN;
  }


  public TribMunicipal cLocIncid(@javax.annotation.Nullable String cLocIncid) {
    this.cLocIncid = cLocIncid;
    return this;
  }

  /**
   * Código do município de incidência do ISSQN (tabela do IBGE).    Caso o envio seja pelo Sistema Nacional NFS-e, essa propriedade é ignorada e o município de incidência do ISSQN é determinado automaticamente pela SEFIN nacional, conforme regras do aspecto espacial da lei complementar federal (LC 116/03) que são válidas para todos os municípios.
   * @return cLocIncid
   */
  @javax.annotation.Nullable
  public String getcLocIncid() {
    return cLocIncid;
  }

  public void setcLocIncid(@javax.annotation.Nullable String cLocIncid) {
    this.cLocIncid = cLocIncid;
  }


  public TribMunicipal cPaisResult(@javax.annotation.Nullable String cPaisResult) {
    this.cPaisResult = cPaisResult;
    return this;
  }

  /**
   * Código do país onde se verficou o resultado da prestação do serviço para o caso de Exportação de Serviço.(Tabela de Países ISO).
   * @return cPaisResult
   */
  @javax.annotation.Nullable
  public String getcPaisResult() {
    return cPaisResult;
  }

  public void setcPaisResult(@javax.annotation.Nullable String cPaisResult) {
    this.cPaisResult = cPaisResult;
  }


  public TribMunicipal BM(@javax.annotation.Nullable BeneficioMunicipal BM) {
    this.BM = BM;
    return this;
  }

  /**
   * Get BM
   * @return BM
   */
  @javax.annotation.Nullable
  public BeneficioMunicipal getBM() {
    return BM;
  }

  public void setBM(@javax.annotation.Nullable BeneficioMunicipal BM) {
    this.BM = BM;
  }


  public TribMunicipal exigSusp(@javax.annotation.Nullable ExigSuspensa exigSusp) {
    this.exigSusp = exigSusp;
    return this;
  }

  /**
   * Get exigSusp
   * @return exigSusp
   */
  @javax.annotation.Nullable
  public ExigSuspensa getExigSusp() {
    return exigSusp;
  }

  public void setExigSusp(@javax.annotation.Nullable ExigSuspensa exigSusp) {
    this.exigSusp = exigSusp;
  }


  public TribMunicipal tpImunidade(@javax.annotation.Nullable Integer tpImunidade) {
    this.tpImunidade = tpImunidade;
    return this;
  }

  /**
   * Identificação da Imunidade do ISSQN - somente para o caso de Imunidade:  * 0 - Imunidade (tipo não informado na nota de origem)  * 1 - Patrimônio, renda ou serviços, uns dos outros (CF88, Art 150, VI, a)  * 2 - Templos de qualquer culto (CF88, Art 150, VI, b)  * 3 - Patrimônio, renda ou serviços dos partidos políticos, inclusive suas fundações, das entidades sindicais dos trabalhadores, das instituições de educação e de assistência social, sem fins lucrativos, atendidos os requisitos da lei (CF88, Art 150, VI, c)  * 4 - Livros, jornais, periódicos e o papel destinado a sua impressão (CF88, Art 150, VI, d)
   * @return tpImunidade
   */
  @javax.annotation.Nullable
  public Integer getTpImunidade() {
    return tpImunidade;
  }

  public void setTpImunidade(@javax.annotation.Nullable Integer tpImunidade) {
    this.tpImunidade = tpImunidade;
  }


  public TribMunicipal vBC(@javax.annotation.Nullable BigDecimal vBC) {
    this.vBC = vBC;
    return this;
  }

  /**
   * Valor da Base de Cálculo do ISSQN (R$).    Caso você não informe esse campo, vamos calculá-lo automaticamente.    **Atenção**: Para emissões pelo Sistema Nacional NFS-e, esse campo é ignorado e o valor é determinado automaticamente pela SEFIN nacional.
   * minimum: 0
   * @return vBC
   */
  @javax.annotation.Nullable
  public BigDecimal getvBC() {
    return vBC;
  }

  public void setvBC(@javax.annotation.Nullable BigDecimal vBC) {
    this.vBC = vBC;
  }


  public TribMunicipal pAliq(@javax.annotation.Nullable BigDecimal pAliq) {
    this.pAliq = pAliq;
    return this;
  }

  /**
   * Valor da alíquota (%%) do serviço prestado relativo ao município sujeito ativo (município de incidência) do ISSQN.    **Observações**:  * Se o município de incidência pertence ao Sistema Nacional NFS-e a alíquota estará parametrizada e, portanto, será fornecida pelo sistema.  * Se o município de incidência não pertence ao Sistema Nacional NFS-e a alíquota não estará parametrizada e, por isso, deverá ser fornecida pelo emitente.
   * minimum: 0
   * @return pAliq
   */
  @javax.annotation.Nullable
  public BigDecimal getpAliq() {
    return pAliq;
  }

  public void setpAliq(@javax.annotation.Nullable BigDecimal pAliq) {
    this.pAliq = pAliq;
  }


  public TribMunicipal vISSQN(@javax.annotation.Nullable BigDecimal vISSQN) {
    this.vISSQN = vISSQN;
    return this;
  }

  /**
   * Valor do ISSQN (R$).    Caso você não informe esse campo, vamos calculá-lo automaticamente.    **Atenção**: Para emissões pelo Sistema Nacional NFS-e, esse campo é ignorado e o valor é determinado automaticamente pela SEFIN nacional.
   * minimum: 0
   * @return vISSQN
   */
  @javax.annotation.Nullable
  public BigDecimal getvISSQN() {
    return vISSQN;
  }

  public void setvISSQN(@javax.annotation.Nullable BigDecimal vISSQN) {
    this.vISSQN = vISSQN;
  }


  public TribMunicipal tpRetISSQN(@javax.annotation.Nullable Integer tpRetISSQN) {
    this.tpRetISSQN = tpRetISSQN;
    return this;
  }

  /**
   * Tipo de retencao do ISSQN:  * 1 - Não Retido  * 2 - Retido pelo Tomador  * 3 - Retido pelo Intermediario
   * @return tpRetISSQN
   */
  @javax.annotation.Nullable
  public Integer getTpRetISSQN() {
    return tpRetISSQN;
  }

  public void setTpRetISSQN(@javax.annotation.Nullable Integer tpRetISSQN) {
    this.tpRetISSQN = tpRetISSQN;
  }


  public TribMunicipal vLiq(@javax.annotation.Nullable BigDecimal vLiq) {
    this.vLiq = vLiq;
    return this;
  }

  /**
   * Valor Líquido (R$).    Caso você não informe esse campo, vamos calculá-lo automaticamente.    **Atenção**: Para emissões pelo Sistema Nacional NFS-e, esse campo é ignorado e o valor é determinado automaticamente pela SEFIN nacional.
   * minimum: 0
   * @return vLiq
   */
  @javax.annotation.Nullable
  public BigDecimal getvLiq() {
    return vLiq;
  }

  public void setvLiq(@javax.annotation.Nullable BigDecimal vLiq) {
    this.vLiq = vLiq;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TribMunicipal tribMunicipal = (TribMunicipal) o;
    return Objects.equals(this.tribISSQN, tribMunicipal.tribISSQN) &&
        Objects.equals(this.cLocIncid, tribMunicipal.cLocIncid) &&
        Objects.equals(this.cPaisResult, tribMunicipal.cPaisResult) &&
        Objects.equals(this.BM, tribMunicipal.BM) &&
        Objects.equals(this.exigSusp, tribMunicipal.exigSusp) &&
        Objects.equals(this.tpImunidade, tribMunicipal.tpImunidade) &&
        Objects.equals(this.vBC, tribMunicipal.vBC) &&
        Objects.equals(this.pAliq, tribMunicipal.pAliq) &&
        Objects.equals(this.vISSQN, tribMunicipal.vISSQN) &&
        Objects.equals(this.tpRetISSQN, tribMunicipal.tpRetISSQN) &&
        Objects.equals(this.vLiq, tribMunicipal.vLiq);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tribISSQN, cLocIncid, cPaisResult, BM, exigSusp, tpImunidade, vBC, pAliq, vISSQN, tpRetISSQN, vLiq);
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
    sb.append("class TribMunicipal {\n");
    sb.append("    tribISSQN: ").append(toIndentedString(tribISSQN)).append("\n");
    sb.append("    cLocIncid: ").append(toIndentedString(cLocIncid)).append("\n");
    sb.append("    cPaisResult: ").append(toIndentedString(cPaisResult)).append("\n");
    sb.append("    BM: ").append(toIndentedString(BM)).append("\n");
    sb.append("    exigSusp: ").append(toIndentedString(exigSusp)).append("\n");
    sb.append("    tpImunidade: ").append(toIndentedString(tpImunidade)).append("\n");
    sb.append("    vBC: ").append(toIndentedString(vBC)).append("\n");
    sb.append("    pAliq: ").append(toIndentedString(pAliq)).append("\n");
    sb.append("    vISSQN: ").append(toIndentedString(vISSQN)).append("\n");
    sb.append("    tpRetISSQN: ").append(toIndentedString(tpRetISSQN)).append("\n");
    sb.append("    vLiq: ").append(toIndentedString(vLiq)).append("\n");
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
    openapiFields.add("tribISSQN");
    openapiFields.add("cLocIncid");
    openapiFields.add("cPaisResult");
    openapiFields.add("BM");
    openapiFields.add("exigSusp");
    openapiFields.add("tpImunidade");
    openapiFields.add("vBC");
    openapiFields.add("pAliq");
    openapiFields.add("vISSQN");
    openapiFields.add("tpRetISSQN");
    openapiFields.add("vLiq");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tribISSQN");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TribMunicipal
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TribMunicipal.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TribMunicipal is not found in the empty JSON string", TribMunicipal.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TribMunicipal.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TribMunicipal` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TribMunicipal.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cLocIncid") != null && !jsonObj.get("cLocIncid").isJsonNull()) && !jsonObj.get("cLocIncid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cLocIncid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cLocIncid").toString()));
      }
      if ((jsonObj.get("cPaisResult") != null && !jsonObj.get("cPaisResult").isJsonNull()) && !jsonObj.get("cPaisResult").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cPaisResult` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cPaisResult").toString()));
      }
      // validate the optional field `BM`
      if (jsonObj.get("BM") != null && !jsonObj.get("BM").isJsonNull()) {
        BeneficioMunicipal.validateJsonElement(jsonObj.get("BM"));
      }
      // validate the optional field `exigSusp`
      if (jsonObj.get("exigSusp") != null && !jsonObj.get("exigSusp").isJsonNull()) {
        ExigSuspensa.validateJsonElement(jsonObj.get("exigSusp"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TribMunicipal.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TribMunicipal' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TribMunicipal> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TribMunicipal.class));

       return (TypeAdapter<T>) new TypeAdapter<TribMunicipal>() {
           @Override
           public void write(JsonWriter out, TribMunicipal value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TribMunicipal read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TribMunicipal given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TribMunicipal
   * @throws IOException if the JSON string is invalid with respect to TribMunicipal
   */
  public static TribMunicipal fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TribMunicipal.class);
  }

  /**
   * Convert an instance of TribMunicipal to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

