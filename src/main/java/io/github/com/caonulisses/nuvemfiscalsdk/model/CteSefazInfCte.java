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
import io.github.com.caonulisses.nuvemfiscalsdk.model.CteSefazAutXML;
import io.github.com.caonulisses.nuvemfiscalsdk.model.CteSefazCompl;
import io.github.com.caonulisses.nuvemfiscalsdk.model.CteSefazDest;
import io.github.com.caonulisses.nuvemfiscalsdk.model.CteSefazEmit;
import io.github.com.caonulisses.nuvemfiscalsdk.model.CteSefazExped;
import io.github.com.caonulisses.nuvemfiscalsdk.model.CteSefazIde;
import io.github.com.caonulisses.nuvemfiscalsdk.model.CteSefazInfCTeNorm;
import io.github.com.caonulisses.nuvemfiscalsdk.model.CteSefazInfCteComp;
import io.github.com.caonulisses.nuvemfiscalsdk.model.CteSefazInfCteImp;
import io.github.com.caonulisses.nuvemfiscalsdk.model.CteSefazInfSolicNFF;
import io.github.com.caonulisses.nuvemfiscalsdk.model.CteSefazReceb;
import io.github.com.caonulisses.nuvemfiscalsdk.model.CteSefazRem;
import io.github.com.caonulisses.nuvemfiscalsdk.model.CteSefazRespTec;
import io.github.com.caonulisses.nuvemfiscalsdk.model.CteSefazVPrest;
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
 * Informações do CT-e.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T14:00:11.942973268-03:00[America/Sao_Paulo]", comments = "Generator version: 7.10.0")
public class CteSefazInfCte {
  public static final String SERIALIZED_NAME_VERSAO = "versao";
  @SerializedName(SERIALIZED_NAME_VERSAO)
  @javax.annotation.Nullable
  private String versao;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_IDE = "ide";
  @SerializedName(SERIALIZED_NAME_IDE)
  @javax.annotation.Nonnull
  private CteSefazIde ide;

  public static final String SERIALIZED_NAME_COMPL = "compl";
  @SerializedName(SERIALIZED_NAME_COMPL)
  @javax.annotation.Nullable
  private CteSefazCompl compl;

  public static final String SERIALIZED_NAME_EMIT = "emit";
  @SerializedName(SERIALIZED_NAME_EMIT)
  @javax.annotation.Nonnull
  private CteSefazEmit emit;

  public static final String SERIALIZED_NAME_REM = "rem";
  @SerializedName(SERIALIZED_NAME_REM)
  @javax.annotation.Nullable
  private CteSefazRem rem;

  public static final String SERIALIZED_NAME_EXPED = "exped";
  @SerializedName(SERIALIZED_NAME_EXPED)
  @javax.annotation.Nullable
  private CteSefazExped exped;

  public static final String SERIALIZED_NAME_RECEB = "receb";
  @SerializedName(SERIALIZED_NAME_RECEB)
  @javax.annotation.Nullable
  private CteSefazReceb receb;

  public static final String SERIALIZED_NAME_DEST = "dest";
  @SerializedName(SERIALIZED_NAME_DEST)
  @javax.annotation.Nullable
  private CteSefazDest dest;

  public static final String SERIALIZED_NAME_V_PREST = "vPrest";
  @SerializedName(SERIALIZED_NAME_V_PREST)
  @javax.annotation.Nonnull
  private CteSefazVPrest vPrest;

  public static final String SERIALIZED_NAME_IMP = "imp";
  @SerializedName(SERIALIZED_NAME_IMP)
  @javax.annotation.Nonnull
  private CteSefazInfCteImp imp;

  public static final String SERIALIZED_NAME_INF_C_TE_NORM = "infCTeNorm";
  @SerializedName(SERIALIZED_NAME_INF_C_TE_NORM)
  @javax.annotation.Nullable
  private CteSefazInfCTeNorm infCTeNorm;

  public static final String SERIALIZED_NAME_INF_CTE_COMP = "infCteComp";
  @SerializedName(SERIALIZED_NAME_INF_CTE_COMP)
  @javax.annotation.Nullable
  private List<CteSefazInfCteComp> infCteComp = new ArrayList<>();

  public static final String SERIALIZED_NAME_AUT_X_M_L = "autXML";
  @SerializedName(SERIALIZED_NAME_AUT_X_M_L)
  @javax.annotation.Nullable
  private List<CteSefazAutXML> autXML = new ArrayList<>();

  public static final String SERIALIZED_NAME_INF_RESP_TEC = "infRespTec";
  @SerializedName(SERIALIZED_NAME_INF_RESP_TEC)
  @javax.annotation.Nullable
  private CteSefazRespTec infRespTec;

  public static final String SERIALIZED_NAME_INF_SOLIC_N_F_F = "infSolicNFF";
  @SerializedName(SERIALIZED_NAME_INF_SOLIC_N_F_F)
  @javax.annotation.Nullable
  private CteSefazInfSolicNFF infSolicNFF;

  public CteSefazInfCte() {
  }

  public CteSefazInfCte versao(@javax.annotation.Nullable String versao) {
    this.versao = versao;
    return this;
  }

  /**
   * Versão do leiaute.  Ex: \&quot;4.00\&quot;.
   * @return versao
   */
  @javax.annotation.Nullable
  public String getVersao() {
    return versao;
  }

  public void setVersao(@javax.annotation.Nullable String versao) {
    this.versao = versao;
  }


  public CteSefazInfCte id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Identificador da tag a ser assinada.  Informar a chave de acesso do CT-e e precedida do literal \&quot;CTe\&quot;.    *Geramos automaticamente quando nenhum valor é informado.*
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public CteSefazInfCte ide(@javax.annotation.Nonnull CteSefazIde ide) {
    this.ide = ide;
    return this;
  }

  /**
   * Get ide
   * @return ide
   */
  @javax.annotation.Nonnull
  public CteSefazIde getIde() {
    return ide;
  }

  public void setIde(@javax.annotation.Nonnull CteSefazIde ide) {
    this.ide = ide;
  }


  public CteSefazInfCte compl(@javax.annotation.Nullable CteSefazCompl compl) {
    this.compl = compl;
    return this;
  }

  /**
   * Get compl
   * @return compl
   */
  @javax.annotation.Nullable
  public CteSefazCompl getCompl() {
    return compl;
  }

  public void setCompl(@javax.annotation.Nullable CteSefazCompl compl) {
    this.compl = compl;
  }


  public CteSefazInfCte emit(@javax.annotation.Nonnull CteSefazEmit emit) {
    this.emit = emit;
    return this;
  }

  /**
   * Get emit
   * @return emit
   */
  @javax.annotation.Nonnull
  public CteSefazEmit getEmit() {
    return emit;
  }

  public void setEmit(@javax.annotation.Nonnull CteSefazEmit emit) {
    this.emit = emit;
  }


  public CteSefazInfCte rem(@javax.annotation.Nullable CteSefazRem rem) {
    this.rem = rem;
    return this;
  }

  /**
   * Get rem
   * @return rem
   */
  @javax.annotation.Nullable
  public CteSefazRem getRem() {
    return rem;
  }

  public void setRem(@javax.annotation.Nullable CteSefazRem rem) {
    this.rem = rem;
  }


  public CteSefazInfCte exped(@javax.annotation.Nullable CteSefazExped exped) {
    this.exped = exped;
    return this;
  }

  /**
   * Get exped
   * @return exped
   */
  @javax.annotation.Nullable
  public CteSefazExped getExped() {
    return exped;
  }

  public void setExped(@javax.annotation.Nullable CteSefazExped exped) {
    this.exped = exped;
  }


  public CteSefazInfCte receb(@javax.annotation.Nullable CteSefazReceb receb) {
    this.receb = receb;
    return this;
  }

  /**
   * Get receb
   * @return receb
   */
  @javax.annotation.Nullable
  public CteSefazReceb getReceb() {
    return receb;
  }

  public void setReceb(@javax.annotation.Nullable CteSefazReceb receb) {
    this.receb = receb;
  }


  public CteSefazInfCte dest(@javax.annotation.Nullable CteSefazDest dest) {
    this.dest = dest;
    return this;
  }

  /**
   * Get dest
   * @return dest
   */
  @javax.annotation.Nullable
  public CteSefazDest getDest() {
    return dest;
  }

  public void setDest(@javax.annotation.Nullable CteSefazDest dest) {
    this.dest = dest;
  }


  public CteSefazInfCte vPrest(@javax.annotation.Nonnull CteSefazVPrest vPrest) {
    this.vPrest = vPrest;
    return this;
  }

  /**
   * Get vPrest
   * @return vPrest
   */
  @javax.annotation.Nonnull
  public CteSefazVPrest getvPrest() {
    return vPrest;
  }

  public void setvPrest(@javax.annotation.Nonnull CteSefazVPrest vPrest) {
    this.vPrest = vPrest;
  }


  public CteSefazInfCte imp(@javax.annotation.Nonnull CteSefazInfCteImp imp) {
    this.imp = imp;
    return this;
  }

  /**
   * Get imp
   * @return imp
   */
  @javax.annotation.Nonnull
  public CteSefazInfCteImp getImp() {
    return imp;
  }

  public void setImp(@javax.annotation.Nonnull CteSefazInfCteImp imp) {
    this.imp = imp;
  }


  public CteSefazInfCte infCTeNorm(@javax.annotation.Nullable CteSefazInfCTeNorm infCTeNorm) {
    this.infCTeNorm = infCTeNorm;
    return this;
  }

  /**
   * Get infCTeNorm
   * @return infCTeNorm
   */
  @javax.annotation.Nullable
  public CteSefazInfCTeNorm getInfCTeNorm() {
    return infCTeNorm;
  }

  public void setInfCTeNorm(@javax.annotation.Nullable CteSefazInfCTeNorm infCTeNorm) {
    this.infCTeNorm = infCTeNorm;
  }


  public CteSefazInfCte infCteComp(@javax.annotation.Nullable List<CteSefazInfCteComp> infCteComp) {
    this.infCteComp = infCteComp;
    return this;
  }

  public CteSefazInfCte addInfCteCompItem(CteSefazInfCteComp infCteCompItem) {
    if (this.infCteComp == null) {
      this.infCteComp = new ArrayList<>();
    }
    this.infCteComp.add(infCteCompItem);
    return this;
  }

  /**
   * Get infCteComp
   * @return infCteComp
   */
  @javax.annotation.Nullable
  public List<CteSefazInfCteComp> getInfCteComp() {
    return infCteComp;
  }

  public void setInfCteComp(@javax.annotation.Nullable List<CteSefazInfCteComp> infCteComp) {
    this.infCteComp = infCteComp;
  }


  public CteSefazInfCte autXML(@javax.annotation.Nullable List<CteSefazAutXML> autXML) {
    this.autXML = autXML;
    return this;
  }

  public CteSefazInfCte addAutXMLItem(CteSefazAutXML autXMLItem) {
    if (this.autXML == null) {
      this.autXML = new ArrayList<>();
    }
    this.autXML.add(autXMLItem);
    return this;
  }

  /**
   * Get autXML
   * @return autXML
   */
  @javax.annotation.Nullable
  public List<CteSefazAutXML> getAutXML() {
    return autXML;
  }

  public void setAutXML(@javax.annotation.Nullable List<CteSefazAutXML> autXML) {
    this.autXML = autXML;
  }


  public CteSefazInfCte infRespTec(@javax.annotation.Nullable CteSefazRespTec infRespTec) {
    this.infRespTec = infRespTec;
    return this;
  }

  /**
   * Get infRespTec
   * @return infRespTec
   */
  @javax.annotation.Nullable
  public CteSefazRespTec getInfRespTec() {
    return infRespTec;
  }

  public void setInfRespTec(@javax.annotation.Nullable CteSefazRespTec infRespTec) {
    this.infRespTec = infRespTec;
  }


  public CteSefazInfCte infSolicNFF(@javax.annotation.Nullable CteSefazInfSolicNFF infSolicNFF) {
    this.infSolicNFF = infSolicNFF;
    return this;
  }

  /**
   * Get infSolicNFF
   * @return infSolicNFF
   */
  @javax.annotation.Nullable
  public CteSefazInfSolicNFF getInfSolicNFF() {
    return infSolicNFF;
  }

  public void setInfSolicNFF(@javax.annotation.Nullable CteSefazInfSolicNFF infSolicNFF) {
    this.infSolicNFF = infSolicNFF;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CteSefazInfCte cteSefazInfCte = (CteSefazInfCte) o;
    return Objects.equals(this.versao, cteSefazInfCte.versao) &&
        Objects.equals(this.id, cteSefazInfCte.id) &&
        Objects.equals(this.ide, cteSefazInfCte.ide) &&
        Objects.equals(this.compl, cteSefazInfCte.compl) &&
        Objects.equals(this.emit, cteSefazInfCte.emit) &&
        Objects.equals(this.rem, cteSefazInfCte.rem) &&
        Objects.equals(this.exped, cteSefazInfCte.exped) &&
        Objects.equals(this.receb, cteSefazInfCte.receb) &&
        Objects.equals(this.dest, cteSefazInfCte.dest) &&
        Objects.equals(this.vPrest, cteSefazInfCte.vPrest) &&
        Objects.equals(this.imp, cteSefazInfCte.imp) &&
        Objects.equals(this.infCTeNorm, cteSefazInfCte.infCTeNorm) &&
        Objects.equals(this.infCteComp, cteSefazInfCte.infCteComp) &&
        Objects.equals(this.autXML, cteSefazInfCte.autXML) &&
        Objects.equals(this.infRespTec, cteSefazInfCte.infRespTec) &&
        Objects.equals(this.infSolicNFF, cteSefazInfCte.infSolicNFF);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(versao, id, ide, compl, emit, rem, exped, receb, dest, vPrest, imp, infCTeNorm, infCteComp, autXML, infRespTec, infSolicNFF);
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
    sb.append("class CteSefazInfCte {\n");
    sb.append("    versao: ").append(toIndentedString(versao)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ide: ").append(toIndentedString(ide)).append("\n");
    sb.append("    compl: ").append(toIndentedString(compl)).append("\n");
    sb.append("    emit: ").append(toIndentedString(emit)).append("\n");
    sb.append("    rem: ").append(toIndentedString(rem)).append("\n");
    sb.append("    exped: ").append(toIndentedString(exped)).append("\n");
    sb.append("    receb: ").append(toIndentedString(receb)).append("\n");
    sb.append("    dest: ").append(toIndentedString(dest)).append("\n");
    sb.append("    vPrest: ").append(toIndentedString(vPrest)).append("\n");
    sb.append("    imp: ").append(toIndentedString(imp)).append("\n");
    sb.append("    infCTeNorm: ").append(toIndentedString(infCTeNorm)).append("\n");
    sb.append("    infCteComp: ").append(toIndentedString(infCteComp)).append("\n");
    sb.append("    autXML: ").append(toIndentedString(autXML)).append("\n");
    sb.append("    infRespTec: ").append(toIndentedString(infRespTec)).append("\n");
    sb.append("    infSolicNFF: ").append(toIndentedString(infSolicNFF)).append("\n");
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
    openapiFields.add("versao");
    openapiFields.add("Id");
    openapiFields.add("ide");
    openapiFields.add("compl");
    openapiFields.add("emit");
    openapiFields.add("rem");
    openapiFields.add("exped");
    openapiFields.add("receb");
    openapiFields.add("dest");
    openapiFields.add("vPrest");
    openapiFields.add("imp");
    openapiFields.add("infCTeNorm");
    openapiFields.add("infCteComp");
    openapiFields.add("autXML");
    openapiFields.add("infRespTec");
    openapiFields.add("infSolicNFF");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("versao");
    openapiRequiredFields.add("ide");
    openapiRequiredFields.add("emit");
    openapiRequiredFields.add("vPrest");
    openapiRequiredFields.add("imp");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CteSefazInfCte
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CteSefazInfCte.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CteSefazInfCte is not found in the empty JSON string", CteSefazInfCte.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CteSefazInfCte.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CteSefazInfCte` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CteSefazInfCte.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("versao") != null && !jsonObj.get("versao").isJsonNull()) && !jsonObj.get("versao").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `versao` to be a primitive type in the JSON string but got `%s`", jsonObj.get("versao").toString()));
      }
      if ((jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) && !jsonObj.get("Id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Id").toString()));
      }
      // validate the required field `ide`
      CteSefazIde.validateJsonElement(jsonObj.get("ide"));
      // validate the optional field `compl`
      if (jsonObj.get("compl") != null && !jsonObj.get("compl").isJsonNull()) {
        CteSefazCompl.validateJsonElement(jsonObj.get("compl"));
      }
      // validate the required field `emit`
      CteSefazEmit.validateJsonElement(jsonObj.get("emit"));
      // validate the optional field `rem`
      if (jsonObj.get("rem") != null && !jsonObj.get("rem").isJsonNull()) {
        CteSefazRem.validateJsonElement(jsonObj.get("rem"));
      }
      // validate the optional field `exped`
      if (jsonObj.get("exped") != null && !jsonObj.get("exped").isJsonNull()) {
        CteSefazExped.validateJsonElement(jsonObj.get("exped"));
      }
      // validate the optional field `receb`
      if (jsonObj.get("receb") != null && !jsonObj.get("receb").isJsonNull()) {
        CteSefazReceb.validateJsonElement(jsonObj.get("receb"));
      }
      // validate the optional field `dest`
      if (jsonObj.get("dest") != null && !jsonObj.get("dest").isJsonNull()) {
        CteSefazDest.validateJsonElement(jsonObj.get("dest"));
      }
      // validate the required field `vPrest`
      CteSefazVPrest.validateJsonElement(jsonObj.get("vPrest"));
      // validate the required field `imp`
      CteSefazInfCteImp.validateJsonElement(jsonObj.get("imp"));
      // validate the optional field `infCTeNorm`
      if (jsonObj.get("infCTeNorm") != null && !jsonObj.get("infCTeNorm").isJsonNull()) {
        CteSefazInfCTeNorm.validateJsonElement(jsonObj.get("infCTeNorm"));
      }
      if (jsonObj.get("infCteComp") != null && !jsonObj.get("infCteComp").isJsonNull()) {
        JsonArray jsonArrayinfCteComp = jsonObj.getAsJsonArray("infCteComp");
        if (jsonArrayinfCteComp != null) {
          // ensure the json data is an array
          if (!jsonObj.get("infCteComp").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `infCteComp` to be an array in the JSON string but got `%s`", jsonObj.get("infCteComp").toString()));
          }

          // validate the optional field `infCteComp` (array)
          for (int i = 0; i < jsonArrayinfCteComp.size(); i++) {
            CteSefazInfCteComp.validateJsonElement(jsonArrayinfCteComp.get(i));
          };
        }
      }
      if (jsonObj.get("autXML") != null && !jsonObj.get("autXML").isJsonNull()) {
        JsonArray jsonArrayautXML = jsonObj.getAsJsonArray("autXML");
        if (jsonArrayautXML != null) {
          // ensure the json data is an array
          if (!jsonObj.get("autXML").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `autXML` to be an array in the JSON string but got `%s`", jsonObj.get("autXML").toString()));
          }

          // validate the optional field `autXML` (array)
          for (int i = 0; i < jsonArrayautXML.size(); i++) {
            CteSefazAutXML.validateJsonElement(jsonArrayautXML.get(i));
          };
        }
      }
      // validate the optional field `infRespTec`
      if (jsonObj.get("infRespTec") != null && !jsonObj.get("infRespTec").isJsonNull()) {
        CteSefazRespTec.validateJsonElement(jsonObj.get("infRespTec"));
      }
      // validate the optional field `infSolicNFF`
      if (jsonObj.get("infSolicNFF") != null && !jsonObj.get("infSolicNFF").isJsonNull()) {
        CteSefazInfSolicNFF.validateJsonElement(jsonObj.get("infSolicNFF"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CteSefazInfCte.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CteSefazInfCte' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CteSefazInfCte> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CteSefazInfCte.class));

       return (TypeAdapter<T>) new TypeAdapter<CteSefazInfCte>() {
           @Override
           public void write(JsonWriter out, CteSefazInfCte value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CteSefazInfCte read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CteSefazInfCte given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CteSefazInfCte
   * @throws IOException if the JSON string is invalid with respect to CteSefazInfCte
   */
  public static CteSefazInfCte fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CteSefazInfCte.class);
  }

  /**
   * Convert an instance of CteSefazInfCte to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

