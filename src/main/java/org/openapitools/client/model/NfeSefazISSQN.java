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
 * ISSQN.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class NfeSefazISSQN {
  public static final String SERIALIZED_NAME_V_B_C = "vBC";
  @SerializedName(SERIALIZED_NAME_V_B_C)
  @javax.annotation.Nullable
  private BigDecimal vBC;

  public static final String SERIALIZED_NAME_V_ALIQ = "vAliq";
  @SerializedName(SERIALIZED_NAME_V_ALIQ)
  @javax.annotation.Nullable
  private BigDecimal vAliq;

  public static final String SERIALIZED_NAME_V_I_S_S_Q_N = "vISSQN";
  @SerializedName(SERIALIZED_NAME_V_I_S_S_Q_N)
  @javax.annotation.Nullable
  private BigDecimal vISSQN;

  public static final String SERIALIZED_NAME_C_MUN_F_G = "cMunFG";
  @SerializedName(SERIALIZED_NAME_C_MUN_F_G)
  @javax.annotation.Nullable
  private String cMunFG;

  public static final String SERIALIZED_NAME_C_LIST_SERV = "cListServ";
  @SerializedName(SERIALIZED_NAME_C_LIST_SERV)
  @javax.annotation.Nullable
  private String cListServ;

  public static final String SERIALIZED_NAME_V_DEDUCAO = "vDeducao";
  @SerializedName(SERIALIZED_NAME_V_DEDUCAO)
  @javax.annotation.Nullable
  private BigDecimal vDeducao;

  public static final String SERIALIZED_NAME_V_OUTRO = "vOutro";
  @SerializedName(SERIALIZED_NAME_V_OUTRO)
  @javax.annotation.Nullable
  private BigDecimal vOutro;

  public static final String SERIALIZED_NAME_V_DESC_INCOND = "vDescIncond";
  @SerializedName(SERIALIZED_NAME_V_DESC_INCOND)
  @javax.annotation.Nullable
  private BigDecimal vDescIncond;

  public static final String SERIALIZED_NAME_V_DESC_COND = "vDescCond";
  @SerializedName(SERIALIZED_NAME_V_DESC_COND)
  @javax.annotation.Nullable
  private BigDecimal vDescCond;

  public static final String SERIALIZED_NAME_V_I_S_S_RET = "vISSRet";
  @SerializedName(SERIALIZED_NAME_V_I_S_S_RET)
  @javax.annotation.Nullable
  private BigDecimal vISSRet;

  public static final String SERIALIZED_NAME_IND_I_S_S = "indISS";
  @SerializedName(SERIALIZED_NAME_IND_I_S_S)
  @javax.annotation.Nullable
  private Integer indISS;

  public static final String SERIALIZED_NAME_C_SERVICO = "cServico";
  @SerializedName(SERIALIZED_NAME_C_SERVICO)
  @javax.annotation.Nullable
  private String cServico;

  public static final String SERIALIZED_NAME_C_MUN = "cMun";
  @SerializedName(SERIALIZED_NAME_C_MUN)
  @javax.annotation.Nullable
  private String cMun;

  public static final String SERIALIZED_NAME_C_PAIS = "cPais";
  @SerializedName(SERIALIZED_NAME_C_PAIS)
  @javax.annotation.Nullable
  private String cPais;

  public static final String SERIALIZED_NAME_N_PROCESSO = "nProcesso";
  @SerializedName(SERIALIZED_NAME_N_PROCESSO)
  @javax.annotation.Nullable
  private String nProcesso;

  public static final String SERIALIZED_NAME_IND_INCENTIVO = "indIncentivo";
  @SerializedName(SERIALIZED_NAME_IND_INCENTIVO)
  @javax.annotation.Nullable
  private Integer indIncentivo;

  public NfeSefazISSQN() {
  }

  public NfeSefazISSQN vBC(@javax.annotation.Nullable BigDecimal vBC) {
    this.vBC = vBC;
    return this;
  }

  /**
   * Valor da BC do ISSQN.
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


  public NfeSefazISSQN vAliq(@javax.annotation.Nullable BigDecimal vAliq) {
    this.vAliq = vAliq;
    return this;
  }

  /**
   * Alíquota do ISSQN.
   * minimum: 0
   * @return vAliq
   */
  @javax.annotation.Nullable
  public BigDecimal getvAliq() {
    return vAliq;
  }

  public void setvAliq(@javax.annotation.Nullable BigDecimal vAliq) {
    this.vAliq = vAliq;
  }


  public NfeSefazISSQN vISSQN(@javax.annotation.Nullable BigDecimal vISSQN) {
    this.vISSQN = vISSQN;
    return this;
  }

  /**
   * Valor da do ISSQN.
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


  public NfeSefazISSQN cMunFG(@javax.annotation.Nullable String cMunFG) {
    this.cMunFG = cMunFG;
    return this;
  }

  /**
   * Informar o município de ocorrência do fato gerador do ISSQN. Utilizar a Tabela do IBGE (Anexo VII - Tabela de UF, Município e País). “Atenção, não vincular com os campos B12, C10 ou E10” v2.0.
   * @return cMunFG
   */
  @javax.annotation.Nullable
  public String getcMunFG() {
    return cMunFG;
  }

  public void setcMunFG(@javax.annotation.Nullable String cMunFG) {
    this.cMunFG = cMunFG;
  }


  public NfeSefazISSQN cListServ(@javax.annotation.Nullable String cListServ) {
    this.cListServ = cListServ;
    return this;
  }

  /**
   * Informar o Item da lista de serviços da LC 116/03 em que se classifica o serviço.
   * @return cListServ
   */
  @javax.annotation.Nullable
  public String getcListServ() {
    return cListServ;
  }

  public void setcListServ(@javax.annotation.Nullable String cListServ) {
    this.cListServ = cListServ;
  }


  public NfeSefazISSQN vDeducao(@javax.annotation.Nullable BigDecimal vDeducao) {
    this.vDeducao = vDeducao;
    return this;
  }

  /**
   * Valor dedução para redução da base de cálculo.
   * minimum: 0
   * @return vDeducao
   */
  @javax.annotation.Nullable
  public BigDecimal getvDeducao() {
    return vDeducao;
  }

  public void setvDeducao(@javax.annotation.Nullable BigDecimal vDeducao) {
    this.vDeducao = vDeducao;
  }


  public NfeSefazISSQN vOutro(@javax.annotation.Nullable BigDecimal vOutro) {
    this.vOutro = vOutro;
    return this;
  }

  /**
   * Valor outras retenções.
   * minimum: 0
   * @return vOutro
   */
  @javax.annotation.Nullable
  public BigDecimal getvOutro() {
    return vOutro;
  }

  public void setvOutro(@javax.annotation.Nullable BigDecimal vOutro) {
    this.vOutro = vOutro;
  }


  public NfeSefazISSQN vDescIncond(@javax.annotation.Nullable BigDecimal vDescIncond) {
    this.vDescIncond = vDescIncond;
    return this;
  }

  /**
   * Valor desconto incondicionado.
   * minimum: 0
   * @return vDescIncond
   */
  @javax.annotation.Nullable
  public BigDecimal getvDescIncond() {
    return vDescIncond;
  }

  public void setvDescIncond(@javax.annotation.Nullable BigDecimal vDescIncond) {
    this.vDescIncond = vDescIncond;
  }


  public NfeSefazISSQN vDescCond(@javax.annotation.Nullable BigDecimal vDescCond) {
    this.vDescCond = vDescCond;
    return this;
  }

  /**
   * Valor desconto condicionado.
   * minimum: 0
   * @return vDescCond
   */
  @javax.annotation.Nullable
  public BigDecimal getvDescCond() {
    return vDescCond;
  }

  public void setvDescCond(@javax.annotation.Nullable BigDecimal vDescCond) {
    this.vDescCond = vDescCond;
  }


  public NfeSefazISSQN vISSRet(@javax.annotation.Nullable BigDecimal vISSRet) {
    this.vISSRet = vISSRet;
    return this;
  }

  /**
   * Valor Retenção ISS.
   * minimum: 0
   * @return vISSRet
   */
  @javax.annotation.Nullable
  public BigDecimal getvISSRet() {
    return vISSRet;
  }

  public void setvISSRet(@javax.annotation.Nullable BigDecimal vISSRet) {
    this.vISSRet = vISSRet;
  }


  public NfeSefazISSQN indISS(@javax.annotation.Nullable Integer indISS) {
    this.indISS = indISS;
    return this;
  }

  /**
   * Exibilidade do ISS:1-Exigível  * 2 - Não incidente  * 3 - Isenção  * 4 - Exportação  * 5 - Imunidade  * 6 - Exig.Susp. Judicial  * 7 - Exig.Susp. ADM
   * @return indISS
   */
  @javax.annotation.Nullable
  public Integer getIndISS() {
    return indISS;
  }

  public void setIndISS(@javax.annotation.Nullable Integer indISS) {
    this.indISS = indISS;
  }


  public NfeSefazISSQN cServico(@javax.annotation.Nullable String cServico) {
    this.cServico = cServico;
    return this;
  }

  /**
   * Código do serviço prestado dentro do município.
   * @return cServico
   */
  @javax.annotation.Nullable
  public String getcServico() {
    return cServico;
  }

  public void setcServico(@javax.annotation.Nullable String cServico) {
    this.cServico = cServico;
  }


  public NfeSefazISSQN cMun(@javax.annotation.Nullable String cMun) {
    this.cMun = cMun;
    return this;
  }

  /**
   * Código do Município de Incidência do Imposto.
   * @return cMun
   */
  @javax.annotation.Nullable
  public String getcMun() {
    return cMun;
  }

  public void setcMun(@javax.annotation.Nullable String cMun) {
    this.cMun = cMun;
  }


  public NfeSefazISSQN cPais(@javax.annotation.Nullable String cPais) {
    this.cPais = cPais;
    return this;
  }

  /**
   * Código de Pais.
   * @return cPais
   */
  @javax.annotation.Nullable
  public String getcPais() {
    return cPais;
  }

  public void setcPais(@javax.annotation.Nullable String cPais) {
    this.cPais = cPais;
  }


  public NfeSefazISSQN nProcesso(@javax.annotation.Nullable String nProcesso) {
    this.nProcesso = nProcesso;
    return this;
  }

  /**
   * Número do Processo administrativo ou judicial de suspenção do processo.
   * @return nProcesso
   */
  @javax.annotation.Nullable
  public String getnProcesso() {
    return nProcesso;
  }

  public void setnProcesso(@javax.annotation.Nullable String nProcesso) {
    this.nProcesso = nProcesso;
  }


  public NfeSefazISSQN indIncentivo(@javax.annotation.Nullable Integer indIncentivo) {
    this.indIncentivo = indIncentivo;
    return this;
  }

  /**
   * Indicador de Incentivo Fiscal. 1&#x3D;Sim  * 2 - Não
   * @return indIncentivo
   */
  @javax.annotation.Nullable
  public Integer getIndIncentivo() {
    return indIncentivo;
  }

  public void setIndIncentivo(@javax.annotation.Nullable Integer indIncentivo) {
    this.indIncentivo = indIncentivo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfeSefazISSQN nfeSefazISSQN = (NfeSefazISSQN) o;
    return Objects.equals(this.vBC, nfeSefazISSQN.vBC) &&
        Objects.equals(this.vAliq, nfeSefazISSQN.vAliq) &&
        Objects.equals(this.vISSQN, nfeSefazISSQN.vISSQN) &&
        Objects.equals(this.cMunFG, nfeSefazISSQN.cMunFG) &&
        Objects.equals(this.cListServ, nfeSefazISSQN.cListServ) &&
        Objects.equals(this.vDeducao, nfeSefazISSQN.vDeducao) &&
        Objects.equals(this.vOutro, nfeSefazISSQN.vOutro) &&
        Objects.equals(this.vDescIncond, nfeSefazISSQN.vDescIncond) &&
        Objects.equals(this.vDescCond, nfeSefazISSQN.vDescCond) &&
        Objects.equals(this.vISSRet, nfeSefazISSQN.vISSRet) &&
        Objects.equals(this.indISS, nfeSefazISSQN.indISS) &&
        Objects.equals(this.cServico, nfeSefazISSQN.cServico) &&
        Objects.equals(this.cMun, nfeSefazISSQN.cMun) &&
        Objects.equals(this.cPais, nfeSefazISSQN.cPais) &&
        Objects.equals(this.nProcesso, nfeSefazISSQN.nProcesso) &&
        Objects.equals(this.indIncentivo, nfeSefazISSQN.indIncentivo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(vBC, vAliq, vISSQN, cMunFG, cListServ, vDeducao, vOutro, vDescIncond, vDescCond, vISSRet, indISS, cServico, cMun, cPais, nProcesso, indIncentivo);
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
    sb.append("class NfeSefazISSQN {\n");
    sb.append("    vBC: ").append(toIndentedString(vBC)).append("\n");
    sb.append("    vAliq: ").append(toIndentedString(vAliq)).append("\n");
    sb.append("    vISSQN: ").append(toIndentedString(vISSQN)).append("\n");
    sb.append("    cMunFG: ").append(toIndentedString(cMunFG)).append("\n");
    sb.append("    cListServ: ").append(toIndentedString(cListServ)).append("\n");
    sb.append("    vDeducao: ").append(toIndentedString(vDeducao)).append("\n");
    sb.append("    vOutro: ").append(toIndentedString(vOutro)).append("\n");
    sb.append("    vDescIncond: ").append(toIndentedString(vDescIncond)).append("\n");
    sb.append("    vDescCond: ").append(toIndentedString(vDescCond)).append("\n");
    sb.append("    vISSRet: ").append(toIndentedString(vISSRet)).append("\n");
    sb.append("    indISS: ").append(toIndentedString(indISS)).append("\n");
    sb.append("    cServico: ").append(toIndentedString(cServico)).append("\n");
    sb.append("    cMun: ").append(toIndentedString(cMun)).append("\n");
    sb.append("    cPais: ").append(toIndentedString(cPais)).append("\n");
    sb.append("    nProcesso: ").append(toIndentedString(nProcesso)).append("\n");
    sb.append("    indIncentivo: ").append(toIndentedString(indIncentivo)).append("\n");
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
    openapiFields.add("vBC");
    openapiFields.add("vAliq");
    openapiFields.add("vISSQN");
    openapiFields.add("cMunFG");
    openapiFields.add("cListServ");
    openapiFields.add("vDeducao");
    openapiFields.add("vOutro");
    openapiFields.add("vDescIncond");
    openapiFields.add("vDescCond");
    openapiFields.add("vISSRet");
    openapiFields.add("indISS");
    openapiFields.add("cServico");
    openapiFields.add("cMun");
    openapiFields.add("cPais");
    openapiFields.add("nProcesso");
    openapiFields.add("indIncentivo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("vBC");
    openapiRequiredFields.add("vAliq");
    openapiRequiredFields.add("vISSQN");
    openapiRequiredFields.add("cMunFG");
    openapiRequiredFields.add("cListServ");
    openapiRequiredFields.add("indISS");
    openapiRequiredFields.add("indIncentivo");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NfeSefazISSQN
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NfeSefazISSQN.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NfeSefazISSQN is not found in the empty JSON string", NfeSefazISSQN.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NfeSefazISSQN.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NfeSefazISSQN` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NfeSefazISSQN.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cMunFG") != null && !jsonObj.get("cMunFG").isJsonNull()) && !jsonObj.get("cMunFG").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cMunFG` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cMunFG").toString()));
      }
      if ((jsonObj.get("cListServ") != null && !jsonObj.get("cListServ").isJsonNull()) && !jsonObj.get("cListServ").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cListServ` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cListServ").toString()));
      }
      if ((jsonObj.get("cServico") != null && !jsonObj.get("cServico").isJsonNull()) && !jsonObj.get("cServico").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cServico` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cServico").toString()));
      }
      if ((jsonObj.get("cMun") != null && !jsonObj.get("cMun").isJsonNull()) && !jsonObj.get("cMun").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cMun` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cMun").toString()));
      }
      if ((jsonObj.get("cPais") != null && !jsonObj.get("cPais").isJsonNull()) && !jsonObj.get("cPais").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cPais` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cPais").toString()));
      }
      if ((jsonObj.get("nProcesso") != null && !jsonObj.get("nProcesso").isJsonNull()) && !jsonObj.get("nProcesso").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nProcesso` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nProcesso").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NfeSefazISSQN.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NfeSefazISSQN' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NfeSefazISSQN> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NfeSefazISSQN.class));

       return (TypeAdapter<T>) new TypeAdapter<NfeSefazISSQN>() {
           @Override
           public void write(JsonWriter out, NfeSefazISSQN value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NfeSefazISSQN read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NfeSefazISSQN given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NfeSefazISSQN
   * @throws IOException if the JSON string is invalid with respect to NfeSefazISSQN
   */
  public static NfeSefazISSQN fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NfeSefazISSQN.class);
  }

  /**
   * Convert an instance of NfeSefazISSQN to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

